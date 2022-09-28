package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class attachService {
    private int AttachServiceId;
    private String attach_ServiceName;
    private Double attach$ServiceCost;
    private Integer attachServiceUnit;
    private String attachServiceStatus;
}
