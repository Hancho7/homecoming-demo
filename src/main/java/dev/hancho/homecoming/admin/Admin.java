package dev.hancho.homecoming.admin;

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
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @NonNull
    String businessName;

    @NonNull
    String contact;

    @NonNull
    String country;

    @NonNull
    String email;

    @NonNull
    String password;

    @Builder.Default
    Roles role = Roles.ROLE_ADMIN;

    
}
