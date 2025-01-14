package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class SoldOut extends AbstractEvent {

    private Long id;
    private String productname;
    private String status;

    public SoldOut(Inventory aggregate) {
        super(aggregate);
    }

    public SoldOut() {
        super();
    }
}
//>>> DDD / Domain Event
