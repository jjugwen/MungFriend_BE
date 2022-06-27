package com.project.mungfriend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PutPostResponseDto {

    private String status;
    private String message;

    public void ok(){
        this.status = "true";
        this.message = "게시글 작성 성공 ! !";
    }

}
