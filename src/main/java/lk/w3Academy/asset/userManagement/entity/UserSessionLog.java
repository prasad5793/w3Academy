package lk.w3Academy.asset.userManagement.entity;

import lk.w3Academy.asset.userManagement.entity.Enum.UserSessionLogStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSessionLog {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private int failureAttempts;

    @Column( updatable = false, nullable = false )
    private LocalDateTime createdAt;

    @Enumerated( EnumType.STRING )
    private UserSessionLogStatus userSessionLogStatus;

    @ManyToOne
    private User user;
}
