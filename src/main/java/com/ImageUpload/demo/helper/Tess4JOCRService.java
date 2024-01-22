package com.ImageUpload.demo.helper;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;


@Service
public class Tess4JOCRService implements OCRService{

  @Override
  public String extractTextFromImage(byte[] imageBytes) {
    ITesseract tesseract = new Tesseract();
    try {
      return tesseract.doOCR(new ByteArrayInputStream(imageBytes));
    } catch (TesseractException e) {
      e.printStackTrace();
      return "";
    }
  }
}
