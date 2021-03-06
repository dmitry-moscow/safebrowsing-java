package com.projectlounge.json;

import com.projectlounge.json.enums.PlatformType;
import com.projectlounge.json.enums.ThreatEntryType;
import com.projectlounge.json.enums.ThreatType;
import lombok.Data;

/**
 * Created by main on 24.08.17.
 */
@Data
public class ListUpdateRequest {

    private ThreatType threatType;
    private PlatformType platformType;
    private ThreatEntryType threatEntryType;
    private String state;
    private Constraints constraints;

}
