package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getId() + " id numaras�na sahip " + campaign.getName() + " isimli kampanya sisteme kay�t edildi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id numaras�na sahip " + campaign.getName() + " isimli kampanya sistemde g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() + " id numaras�na sahip " + campaign.getName() + " isimli kampanya kayd� silindi.");
		
	}
	
	

}
