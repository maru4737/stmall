package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductRegisterd extends AbstractEvent {

    private Long id;

    public ProductRegisterd(Inventory aggregate) {
        super(aggregate);
    }

    public ProductRegisterd() {
        super();
    }
}
//>>> DDD / Domain Event
