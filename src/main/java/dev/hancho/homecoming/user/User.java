package dev.hancho.homecoming.user;

import dev.hancho.homecoming.roles.Roles;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;


@Data
@Builder
@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @NonNull
    String email;

    @NonNull
    String workId;

    @NonNull
    String password;

    @Builder.Default
    Roles role = Roles.ROLE_USER;

    
}
