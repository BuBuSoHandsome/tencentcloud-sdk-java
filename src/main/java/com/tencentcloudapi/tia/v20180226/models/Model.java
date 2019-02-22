/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Model  extends AbstractModel{

    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 集群名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 模型地址
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 运行环境编号
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 模型创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模型运行状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 提供服务的url
    */
    @SerializedName("ServingUrl")
    @Expose
    private String ServingUrl;

    /**
    * 相关消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 编号
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 机型
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
    * 模型暴露方式
    */
    @SerializedName("Expose")
    @Expose
    private String Expose;

    /**
    * 部署副本数量
    */
    @SerializedName("Replicas")
    @Expose
    private Integer Replicas;

    /**
    * 模型Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 创建任务的Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 模型删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
    */
    @SerializedName("DelTime")
    @Expose
    private String DelTime;

    /**
     * 获取模型名称
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取模型描述
     * @return Description 模型描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置模型描述
     * @param Description 模型描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取集群名称
     * @return Cluster 集群名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置集群名称
     * @param Cluster 集群名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取模型地址
     * @return Model 模型地址
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * 设置模型地址
     * @param Model 模型地址
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * 获取运行环境编号
     * @return RuntimeVersion 运行环境编号
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行环境编号
     * @param RuntimeVersion 运行环境编号
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取模型创建时间
     * @return CreateTime 模型创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模型创建时间
     * @param CreateTime 模型创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模型运行状态
     * @return State 模型运行状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置模型运行状态
     * @param State 模型运行状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取提供服务的url
     * @return ServingUrl 提供服务的url
     */
    public String getServingUrl() {
        return this.ServingUrl;
    }

    /**
     * 设置提供服务的url
     * @param ServingUrl 提供服务的url
     */
    public void setServingUrl(String ServingUrl) {
        this.ServingUrl = ServingUrl;
    }

    /**
     * 获取相关消息
     * @return Message 相关消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置相关消息
     * @param Message 相关消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取编号
     * @return AppId 编号
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置编号
     * @param AppId 编号
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取机型
     * @return ServType 机型
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * 设置机型
     * @param ServType 机型
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * 获取模型暴露方式
     * @return Expose 模型暴露方式
     */
    public String getExpose() {
        return this.Expose;
    }

    /**
     * 设置模型暴露方式
     * @param Expose 模型暴露方式
     */
    public void setExpose(String Expose) {
        this.Expose = Expose;
    }

    /**
     * 获取部署副本数量
     * @return Replicas 部署副本数量
     */
    public Integer getReplicas() {
        return this.Replicas;
    }

    /**
     * 设置部署副本数量
     * @param Replicas 部署副本数量
     */
    public void setReplicas(Integer Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * 获取模型Id
     * @return Id 模型Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置模型Id
     * @param Id 模型Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取创建任务的Uin
     * @return Uin 创建任务的Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置创建任务的Uin
     * @param Uin 创建任务的Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取模型删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @return DelTime 模型删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public String getDelTime() {
        return this.DelTime;
    }

    /**
     * 设置模型删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @param DelTime 模型删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public void setDelTime(String DelTime) {
        this.DelTime = DelTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "ServingUrl", this.ServingUrl);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ServType", this.ServType);
        this.setParamSimple(map, prefix + "Expose", this.Expose);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DelTime", this.DelTime);

    }
}

