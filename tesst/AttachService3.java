package model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public             abstract        class     attachService {
    private int AttachServiceId = 1;
    private static final   String attach_ServiceName         = new String("ABC")       ;
    private Double attach$ServiceCost;
    private Integer attach_serviceUnit       ;
    private final String attachServiceStatus;
}
