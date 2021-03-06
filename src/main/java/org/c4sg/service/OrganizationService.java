package org.c4sg.service;

import java.util.List;

import org.c4sg.dto.CreateOrganizationDTO;
import org.c4sg.dto.OrganizationDTO;
import org.c4sg.exception.UserOrganizationException;

public interface OrganizationService {

	void save(OrganizationDTO organizationDTO);
    void deleteOrganization(int id);
    String getLogoUploadPath(Integer organizationId);
    OrganizationDTO findById(int id);
    OrganizationDTO createOrganization(CreateOrganizationDTO createOrganizationDTO);
    OrganizationDTO updateOrganization(int id, OrganizationDTO organizationDTO);
	OrganizationDTO saveUserOrganization(Integer userId, Integer organizationId)  throws UserOrganizationException;
    List<OrganizationDTO> findOrganizations();
    List<OrganizationDTO> findByKeyword(String name);
    List<OrganizationDTO> findByCriteria(String keyWord, List<String> countries, Boolean open, String status, String category);
    List<OrganizationDTO> findByUser(Integer userId);
}
