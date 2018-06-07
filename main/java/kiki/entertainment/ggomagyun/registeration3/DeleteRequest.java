package kiki.entertainment.ggomagyun.registeration3;

import android.app.VoiceInteractor;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class DeleteRequest extends StringRequest {

    final static private String URL = "http://businessgyun.dothome.co.kr/UserDelete.php";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID); //유저 아이디 값에 실제 유저아이디 값을 매칭시켜줘서 실제 파라미티로 UserDelete.php 로 전송할 수 있도록 하는거다
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}
