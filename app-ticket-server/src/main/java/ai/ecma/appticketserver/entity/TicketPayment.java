package ai.ecma.appticketserver.entity;

import ai.ecma.appticketserver.entity.template.AbsEntity;
import ai.ecma.appticketserver.enums.OrderTypeEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TicketPayment extends AbsEntity {

    private double amount;

    @ManyToOne
    private Payment payment;

    @ManyToOne
    private Ticket ticket;

    public TicketPayment(double amount, Payment payment, Ticket ticket, OrderTypeEnum orderTypeEnum) {
        this.amount = amount;
        this.payment = payment;
        this.ticket = ticket;
        this.orderTypeEnum = orderTypeEnum;
    }

    @Enumerated(EnumType.STRING)
    private OrderTypeEnum orderTypeEnum;

    @Column
    private boolean returneds = false ;


}
