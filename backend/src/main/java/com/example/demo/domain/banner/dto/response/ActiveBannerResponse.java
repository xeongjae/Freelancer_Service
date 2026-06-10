package com.example.demo.domain.banner.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActiveBannerResponse {

    private Long bannerSq;
    private String bannerImageUrl;
    private String bannerLinkUrl;
    private String linkTargetBlankYn;
    private Integer displayOrder;
}
