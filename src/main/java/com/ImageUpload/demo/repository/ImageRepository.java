package com.ImageUpload.demo.repository;

import com.ImageUpload.demo.entity.ImageEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ImageRepository extends JpaRepository<ImageEntity, Long> {
  @Override
  public void flush() {

  }

  @Override
  public <S extends ImageEntity> S saveAndFlush(S entity) {
    return null;
  }

  @Override
  public <S extends ImageEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<ImageEntity> entities) {

  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> longs) {

  }

  @Override
  public void deleteAllInBatch() {

  }

  @Override
  public ImageEntity getOne(Long aLong) {
    return null;
  }

  @Override
  public ImageEntity getById(Long aLong) {
    return null;
  }

  @Override
  public ImageEntity getReferenceById(Long aLong) {
    return null;
  }

  @Override
  public <S extends ImageEntity> Optional<S> findOne(Example<S> example) {
    return Optional.empty();
  }

  @Override
  public <S extends ImageEntity> List<S> findAll(Example<S> example) {
    return null;
  }

  @Override
  public <S extends ImageEntity> List<S> findAll(Example<S> example, Sort sort) {
    return null;
  }

  @Override
  public <S extends ImageEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
    return null;
  }

  @Override
  public <S extends ImageEntity> long count(Example<S> example) {
    return 0;
  }

  @Override
  public <S extends ImageEntity> boolean exists(Example<S> example) {
    return false;
  }

  @Override
  public <S extends ImageEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
    return null;
  }

  @Override
  public <S extends ImageEntity> S save(S entity) {
    return null;
  }

  @Override
  public <S extends ImageEntity> List<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public Optional<ImageEntity> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public List<ImageEntity> findAll() {
    return null;
  }

  @Override
  public List<ImageEntity> findAllById(Iterable<Long> longs) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(ImageEntity entity) {

  }

  @Override
  public void deleteAllById(Iterable<? extends Long> longs) {

  }

  @Override
  public void deleteAll(Iterable<? extends ImageEntity> entities) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public List<ImageEntity> findAll(Sort sort) {
    return null;
  }

  @Override
  public Page<ImageEntity> findAll(Pageable pageable) {
    return null;
  }
}
