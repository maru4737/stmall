package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OderStatusUpdated extends AbstractEvent {

    private Long id;

    public OderStatusUpdated(Order aggregate) {
        super(aggregate);
    }

    public OderStatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
