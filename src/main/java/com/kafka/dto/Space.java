package com.kafka.dto;


import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Space {
//	private Long id;
//	private String name;
//	private String rollNumber;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getRollNumber() {
//		return rollNumber;
//	}
//
//	public void setRollNumber(String rollNumber) {
//		this.rollNumber = rollNumber;
//	}

	private static final long serialVersionUID = 6162394343569818809L;
	
	@JsonProperty("id")
	private String id;
	
	private String customerId;
	private String name;
	private String friendlyName;
	private String parentSpaceId;
	private String type;
	private String subtype;
	private String status;
	private BigDecimal capacity;
	private List<String> tagIds;
	private String displayOrder;
	private String serviceId;
	private Boolean sharedSpace;
	private String location;
	private String floorId;
	private String buildingId;
	private String parentSpaceCrossRefId;
	private String description;
	private String presentedAs;
	private String iconName;
	private Boolean isReservable;
	private String campusId;
	private String zoomTier;
	private String lockerBankIdentifier;
    private String lockerFloorIdentifier;
    private String floorServiceId;
    private String freeText;


    private String roomReleaseStatus;

    public String getLockerFloorIdentifier() {
        return lockerFloorIdentifier;
    }

    public void setLockerFloorIdentifier(String lockerFloorIdentifier) {
        this.lockerFloorIdentifier = lockerFloorIdentifier;
    }

    public String getLockerBankIdentifier() {
        return lockerBankIdentifier;
    }

    public void setLockerBankIdentifier(String lockerBankIdentifier) {
        this.lockerBankIdentifier = lockerBankIdentifier;
    }

    public String getZoomTier() {
        return zoomTier;
    }

    public void setZoomTier(String zoomTier) {
        this.zoomTier = zoomTier;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getParentSpaceId() {
        return parentSpaceId;
    }

    public void setParentSpaceId(String parentSpaceId) {
        this.parentSpaceId = parentSpaceId;
    }

    public String getParentSpaceCrossRefId() {
        return parentSpaceCrossRefId;
    }

    public void setParentSpaceCrossRefId(String parentSpaceCrossRefId) {
        this.parentSpaceCrossRefId = parentSpaceCrossRefId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getCapacity() {
        return capacity;
    }

    public void setCapacity(BigDecimal capacity) {
        this.capacity = capacity;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    

    public String getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(String displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Boolean getSharedSpace() {
        return sharedSpace;
    }

    public void setSharedSpace(Boolean sharedSpace) {
        this.sharedSpace = sharedSpace;
    }

   
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPresentedAs() {
        return presentedAs;
    }

    public void setPresentedAs(String presentedAs) {
        this.presentedAs = presentedAs;
    }

    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    public Boolean getIsReservable() {
        return isReservable;
    }

    public void setIsReservable(Boolean isReservable) {
        this.isReservable = isReservable;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getFloorServiceId() {
        return floorServiceId;
    }

    public void setFloorServiceId(String floorServiceId) {
        this.floorServiceId = floorServiceId;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    public String getRoomReleaseStatus() {
        return roomReleaseStatus;
    }

    public void setRoomReleaseStatus(String roomReleaseStatus) {
        this.roomReleaseStatus = roomReleaseStatus;
    }
	
	
	
	
}
