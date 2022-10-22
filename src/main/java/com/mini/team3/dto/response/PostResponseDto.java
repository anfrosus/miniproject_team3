package com.mini.team3.dto.response;

import com.mini.team3.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.mini.team3.entity.Comment;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostResponseDto {
    private Long postId;
    private String accountName;
    private String title;
    private String contents;
    private String tag;
    private List<TestResponseDto> comments;
    private int postLike;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public PostResponseDto(Post post){
        this.postId = post.getPostId();
        this.accountName = post.getAccount().getAccountName();
        this.title = post.getTitle();
        this.contents = post.getContents();
        this.tag = post.getTag();
        this.comments = testResponseDtos;
        this.postLike = post.getPostLikeCount();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
    }
}
