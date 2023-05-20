package dev.koltonquinton.contentcalendar.repository;

import dev.koltonquinton.contentcalendar.model.Content;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByContentType(String type);
}
