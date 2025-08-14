package uz.pdp.taxiproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;
import uz.pdp.taxiproject.entity.template.AbsLongEntity;


@Entity(name = "users")
@Audited
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SQLRestriction(value = "deleted=false")
@SQLDelete(sql = "UPDATE users SET deleted = true WHERE id = ?")
public class User extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private Role role;

    @Column(length = 1024)
    private String refreshToken;

    private String photoUrl;


}
