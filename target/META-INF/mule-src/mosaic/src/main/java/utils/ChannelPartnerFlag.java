package utils;

import java.util.ArrayList;

import utils.FlagValuesEnum;

public class ChannelPartnerFlag {

	public static ArrayList<String> getFlagsValues(long q, String chPartnerId) {

		ArrayList<String> flagList = new ArrayList<String>();
		for (FlagValuesEnum flag : FlagValuesEnum.values()) {
			if ((flag.getValue() & q) != 0) {
				// flagList.add(flag.getKey() + "," + chPartnerId);
				flagList.add(flag.getKey() + "," + chPartnerId + ",true");
			} else {
				flagList.add(flag.getKey() + "," + chPartnerId + ",false");
			}
		}
		return flagList;
	}

}
