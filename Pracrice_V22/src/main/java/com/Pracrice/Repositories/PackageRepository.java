package com.Pracrice.Repositories;

import com.Pracrice.TableInfo.Package;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository
        extends JpaRepository<Package, Integer> {
}
