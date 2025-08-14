package uz.pdp.taxiproject.service.finances;

import uz.imv.lmssystem.dto.request.SalaryPayRequest;
import uz.imv.lmssystem.dto.response.SalaryPayResponse;

public interface SalaryService {

         SalaryPayResponse pay(SalaryPayRequest request);

}
