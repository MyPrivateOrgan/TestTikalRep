package com.tikal.controllers;

import com.tikal.services.PhotosHandler;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Sopher on 24/02/2017.
 */
@RestController
@EnableAutoConfiguration
public class PhotosController {

    @PostMapping(value = "/upload_photos")
    public String uploadingPost(@RequestParam("user") String userName,
                                @RequestParam("uploadingPhotos") MultipartFile[] uploadingPhotos) throws IOException {
        if (uploadingPhotos.length == 0)
            return "Failed to load photos, since no photos where selected. Please try again.";
        try {
            PhotosHandler photosHandler = new PhotosHandler();
            photosHandler.uploadFiles(uploadingPhotos, userName);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Your photos were uploaded successfully.";
    }
}
/*    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            container.setPort(8012);
        });
    }*/

