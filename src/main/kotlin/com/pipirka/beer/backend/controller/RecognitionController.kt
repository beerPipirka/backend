package com.pipirka.beer.backend.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class RecognitionController {

    @PostMapping("/recognise")
    fun recognise(@RequestParam("file") file: MultipartFile) : ResponseEntity<RecognitionResult> {
        return ResponseEntity.ok(RecognitionResult("mock", "Pipirka beer", "5.0"))
    }

}