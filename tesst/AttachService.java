package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class attachService {
    private int AttachServiceId;
    private String attachServiceName;
    private Double attachServiceCost;
    private Integer attachServiceUnit;
    private String attachServiceStatus;
}
