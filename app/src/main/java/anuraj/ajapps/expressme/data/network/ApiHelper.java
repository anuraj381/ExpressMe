package anuraj.ajapps.expressme.data.network;

import anuraj.ajapps.expressme.data.network.model.BlogResponse;
import anuraj.ajapps.expressme.data.network.model.LoginRequest;
import anuraj.ajapps.expressme.data.network.model.LoginResponse;
import anuraj.ajapps.expressme.data.network.model.LogoutResponse;
import anuraj.ajapps.expressme.data.network.model.OpenSourceResponse;
import io.reactivex.Single;

/**
 * Created by janisharali on 27/01/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    /*Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();*/
}
