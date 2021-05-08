package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getId() + " id numarasýna sahip " + campaign.getName() + " isimli kampanya sisteme kayýt edildi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id numarasýna sahip " + campaign.getName() + " isimli kampanya sistemde güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() + " id numarasýna sahip " + campaign.getName() + " isimli kampanya kaydý silindi.");
		
	}
	
	

}
