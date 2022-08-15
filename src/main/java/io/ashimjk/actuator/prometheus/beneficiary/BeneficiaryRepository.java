package io.ashimjk.actuator.prometheus.beneficiary;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

import static io.ashimjk.actuator.prometheus.beneficiary.Beneficiary.create;
import static java.util.Arrays.asList;

@Slf4j
@Service
public class BeneficiaryRepository {

    @Cacheable("beneficiaries")
    public List<Beneficiary> getAllBeneficiaries() {
        log.info("request for all beneficiaries");
        return asList(create(1, "ashim"), create(2, "ashish"), create(3, "kushal"));
    }

}
