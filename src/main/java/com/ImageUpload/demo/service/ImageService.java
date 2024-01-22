package com.ImageUpload.demo.service;

import com.ImageUpload.demo.entity.ImageEntity;
import com.ImageUpload.demo.helper.OCRService;
import com.ImageUpload.demo.repository.ImageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;

@Service
@Transactional
public class ImageService {
  @Autowired
  private ImageRepository imageRepository;

  @Autowired
  private OCRService ocrService;

  public void processAndSaveImage(MultipartFile file) {
    try {

      String extractedText = ocrService.extractTextFromImage(file.getBytes());

      String boldWords = identifyBoldWords(extractedText);

      String base64Image = Base64.getEncoder().encodeToString(file.getBytes());

      ImageEntity imageEntity = new ImageEntity();
      imageEntity.setImageData(base64Image);
      imageEntity.setExtractedText(extractedText);
      imageEntity.setBoldWords(boldWords);

      imageRepository.save(imageEntity);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String identifyBoldWords(String extractedText) {
    return extractedText;
  }
  public ImageEntity getImageById(Long id) {
    return imageRepository.findById(id).orElse(null);
  }
}
