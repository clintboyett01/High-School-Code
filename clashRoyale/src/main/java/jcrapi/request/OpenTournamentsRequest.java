package jcrapi.request;

import lombok.Builder;

import java.util.List;

/**
 * @author Michael Lieshoff
 */
public class OpenTournamentsRequest extends TournamentRequest {

    @Builder
    private OpenTournamentsRequest(boolean oneK, boolean open, boolean full, boolean prep, boolean joinable, int limit, int max, int page, List<String> excludes, List<String> keys) {
        super(oneK, open, full, prep, joinable, limit, max, page, excludes, keys);
    }

}
