package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class attachService {
    private int AttachServiceId;
    private final String attach_ServiceName;
    private Double attach$ServiceCost;
    private Integer attach_serviceUnit;
    private String attachServiceStatus;
}
