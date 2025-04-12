package com.phegondev.Phegon.Eccormerce.service.interf;

import com.phegondev.Phegon.Eccormerce.dto.AddressDto;
import com.phegondev.Phegon.Eccormerce.dto.Response;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
