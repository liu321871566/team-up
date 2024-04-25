package com.lwh.yupao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwh.yupao.model.domain.Team;
import com.lwh.yupao.model.domain.User;
import com.lwh.yupao.model.dto.TeamQuery;
import com.lwh.yupao.model.request.TeamJoinRequest;
import com.lwh.yupao.model.request.TeamQuitRequest;
import com.lwh.yupao.model.request.TeamUpdateRequest;
import com.lwh.yupao.model.vo.TeamUserVO;

import java.util.List;

/**
 * 队伍服务
 *
 * @author lwh
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     *
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散）队伍
     *
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
