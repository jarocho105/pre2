/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.seguridad.util.UpdateDetalleConstantesFunciones;
import com.bydan.erp.seguridad.util.UpdateDetalleParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.UpdateDetalleParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.UpdateDetalleBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;




@SuppressWarnings("unused")
public class UpdateDetalleBeanSwingJInternalFrame extends UpdateDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UpdateDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UpdateDetalle> updatedetalleValidator = new ClassValidator<UpdateDetalle>(UpdateDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UpdateDetalle updatedetalle;	
	public UpdateDetalle updatedetalleAux;
	public UpdateDetalle updatedetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UpdateDetalle updatedetalleTotales;
	public Long idUpdateDetalleActual;
	public Long iIdNuevoUpdateDetalle=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboUpdate="";

	public List<Update> updatesForeignKey;

	public List<Update> getupdatesForeignKey() {
		return updatesForeignKey;
	}

	public void setupdatesForeignKey(List<Update> updatesForeignKey) {
		this.updatesForeignKey = updatesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Update updateForeignKey;

	public Update getupdateForeignKey() {
		return updateForeignKey;
	}

	public void setupdateForeignKey(Update updateForeignKey) {
		this.updateForeignKey = updateForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoUpdateDetalle;
	public Boolean isPermisoNuevoUpdateDetalle;
	public Boolean isPermisoActualizarUpdateDetalle;
	public Boolean isPermisoActualizarOriginalUpdateDetalle;
	public Boolean isPermisoEliminarUpdateDetalle;
	public Boolean isPermisoGuardarCambiosUpdateDetalle;
	public Boolean isPermisoConsultaUpdateDetalle;
	public Boolean isPermisoBusquedaUpdateDetalle;
	public Boolean isPermisoReporteUpdateDetalle;
	public Boolean isPermisoPaginacionMedioUpdateDetalle;
	public Boolean isPermisoPaginacionAltoUpdateDetalle;
	public Boolean isPermisoPaginacionTodoUpdateDetalle;
	public Boolean isPermisoCopiarUpdateDetalle;
	public Boolean isPermisoVerFormUpdateDetalle;
	public Boolean isPermisoDuplicarUpdateDetalle;
	public Boolean isPermisoOrdenUpdateDetalle;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public UpdateDetalleParameterReturnGeneral updatedetalleReturnGeneral;
	public UpdateDetalleParameterReturnGeneral updatedetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUpdateDetalle=false;
	public Boolean esParaAccionDesdeFormularioUpdateDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UpdateDetalleSessionBeanAdditional updatedetalleSessionBeanAdditional=null;
	
	public UpdateDetalleSessionBeanAdditional getUpdateDetalleSessionBeanAdditional() {
		return this.updatedetalleSessionBeanAdditional;
	}
	
	public void setUpdateDetalleSessionBeanAdditional(UpdateDetalleSessionBeanAdditional updatedetalleSessionBeanAdditional) {
		try {
			this.updatedetalleSessionBeanAdditional=updatedetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UpdateDetalleBeanSwingJInternalFrameAdditional updatedetalleBeanSwingJInternalFrameAdditional=null;
	//public class UpdateDetalleBeanSwingJInternalFrame
	
	public UpdateDetalleBeanSwingJInternalFrameAdditional getUpdateDetalleBeanSwingJInternalFrameAdditional() {
		return this.updatedetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setUpdateDetalleBeanSwingJInternalFrameAdditional(UpdateDetalleBeanSwingJInternalFrameAdditional updatedetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.updatedetalleBeanSwingJInternalFrameAdditional=updatedetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UpdateDetalleLogic updatedetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UpdateDetalle updatedetalleBean;
	public UpdateDetalleConstantesFunciones updatedetalleConstantesFunciones;
	//public UpdateDetalleParameterReturnGeneral updatedetalleReturnGeneral;
	
	//FK
	
	public UpdateLogic updateLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<UpdateDetalle> updatedetalles;	
	//public List<UpdateDetalle> updatedetallesEliminados;
	//public List<UpdateDetalle> updatedetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUpdateDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarUpdateDetalle=true;
	public Boolean isVisibilidadCeldaCopiarUpdateDetalle=true;
	public Boolean isVisibilidadCeldaVerFormUpdateDetalle=true;
	public Boolean isVisibilidadCeldaOrdenUpdateDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
	public Boolean isVisibilidadCeldaModificarUpdateDetalle=false;
	public Boolean isVisibilidadCeldaActualizarUpdateDetalle=false;
	public Boolean isVisibilidadCeldaEliminarUpdateDetalle=false;
	public Boolean isVisibilidadCeldaCancelarUpdateDetalle=false;
	public Boolean isVisibilidadCeldaGuardarUpdateDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdUpdate=false;
	
	public Long getiIdNuevoUpdateDetalle() {
		return this.iIdNuevoUpdateDetalle;
	}

	public void setiIdNuevoUpdateDetalle(Long iIdNuevoUpdateDetalle) {
		this.iIdNuevoUpdateDetalle = iIdNuevoUpdateDetalle;
	}
	
	public Long getidUpdateDetalleActual() {
		return this.idUpdateDetalleActual;
	}

	public void setidUpdateDetalleActual(Long idUpdateDetalleActual) {
		this.idUpdateDetalleActual = idUpdateDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UpdateDetalle getupdatedetalle() {
		return this.updatedetalle;
	}

	public void setupdatedetalle(UpdateDetalle updatedetalle) {
		this.updatedetalle = updatedetalle;
	}
	
	public UpdateDetalle getupdatedetalleAux() {
		return this.updatedetalleAux;
	}

	public void setupdatedetalleAux(UpdateDetalle updatedetalleAux) {
		this.updatedetalleAux = updatedetalleAux;
	}				
	
	public UpdateDetalle getupdatedetalleAnterior() {
		return this.updatedetalleAnterior;
	}

	public void setupdatedetalleAnterior(UpdateDetalle updatedetalleAnterior) {
		this.updatedetalleAnterior = updatedetalleAnterior;
	}	
	
	public UpdateDetalle getupdatedetalleTotales() {
		return this.updatedetalleTotales;
	}

	public void setupdatedetalleTotales(UpdateDetalle updatedetalleTotales) {
		this.updatedetalleTotales = updatedetalleTotales;
	}	
	
	public UpdateDetalle getupdatedetalleBean() {
		return this.updatedetalleBean;
	}

	public void setupdatedetalleBean(UpdateDetalle updatedetalleBean) {
		this.updatedetalleBean = updatedetalleBean;
	}	
	
	public UpdateDetalleParameterReturnGeneral getupdatedetalleReturnGeneral() {
		return this.updatedetalleReturnGeneral;
	}

	public void setupdatedetalleReturnGeneral(UpdateDetalleParameterReturnGeneral updatedetalleReturnGeneral) {
		this.updatedetalleReturnGeneral = updatedetalleReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_updateFK_IdUpdate=-1L;

	public Long getid_updateFK_IdUpdate() {
		return this.id_updateFK_IdUpdate;
	}

	public void setid_updateFK_IdUpdate(Long id_updateFK_IdUpdate) {
		this.id_updateFK_IdUpdate = id_updateFK_IdUpdate;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UpdateDetalleLogic getUpdateDetalleLogic()	{		
		return updatedetalleLogic;
	}

	public void setUpdateDetalleLogic(UpdateDetalleLogic updatedetalleLogic) {
		this.updatedetalleLogic = updatedetalleLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoUpdateDetalle() {
		return isEsNuevoUpdateDetalle;
	}

	public void setIsEsNuevoUpdateDetalle(Boolean isEsNuevoUpdateDetalle) {
		this.isEsNuevoUpdateDetalle = isEsNuevoUpdateDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioUpdateDetalle() {
		return esParaAccionDesdeFormularioUpdateDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioUpdateDetalle(Boolean esParaAccionDesdeFormularioUpdateDetalle) {
		this.esParaAccionDesdeFormularioUpdateDetalle = esParaAccionDesdeFormularioUpdateDetalle;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosUpdatesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.updatesForeignKey=new ArrayList<Update>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UpdateLogic updateLogic=new UpdateLogic();

			updateLogic.getUpdateDataAccess().setIsForForeingKeyData(true);

			if(this.updatedetalleSessionBean==null) {
				this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionUpdate()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLogic.getUpdateDataAccess().setIsForForeingKeyData(true);

					updateLogic.getTodosUpdatesWithConnection(sFinalQuery,new Pagination());

					this.updatesForeignKey=updateLogic.getUpdates();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUpdate(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					updateLogic.getEntityWithConnection(updatedetalleSessionBean.getlidUpdateActual());
					this.updatesForeignKey.add(updateLogic.getUpdate());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.updatedetalleSessionBean==null) {
				this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(updatedetalleSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.updatedetalleSessionBean==null) {
				this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(updatedetalleSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualUpdateForeignKey(Long idUpdateSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Update  updateTemp=null;

			for(Update updateAux:updatesForeignKey) {
				if(updateAux.getId()!=null && updateAux.getId().equals(idUpdateSeleccionado)) {
					updateTemp=updateAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(updateTemp!=null) {

					if(this.updatedetalle!=null) {
						this.updatedetalle.setUpdate(updateTemp);
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setSelectedItem(updateTemp);
					}
				} else {
					//jComboBoxid_updateUpdateDetalle.setSelectedItem(updateTemp);
					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUpdate") || sFormularioTipoBusqueda.equals("Todos")){
					if(updateTemp!=null && jComboBoxid_updateFK_IdUpdateUpdateDetalle!=null) {
						jComboBoxid_updateFK_IdUpdateUpdateDetalle.setSelectedItem(updateTemp);
					} else {
						if(jComboBoxid_updateFK_IdUpdateUpdateDetalle!=null) {
							//jComboBoxid_updateFK_IdUpdateUpdateDetalle.setSelectedItem(updateTemp);
							if(jComboBoxid_updateFK_IdUpdateUpdateDetalle.getItemCount()>0) {
								jComboBoxid_updateFK_IdUpdateUpdateDetalle.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualUpdateForeignKeyDescripcion(Long idUpdateSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Update  updateTemp=null;

			for(Update updateAux:updatesForeignKey) {
				if(updateAux.getId()!=null && updateAux.getId().equals(idUpdateSeleccionado)) {
					updateTemp=updateAux;
					break;
				}
			}


			sDescripcion=UpdateConstantesFunciones.getUpdateDescripcion(updateTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUpdateForeignKeyGenerico(Long idUpdateSeleccionado,JComboBox jComboBoxid_updateUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Update  updateTemp=null;

			for(Update updateAux:updatesForeignKey) {
				if(updateAux.getId()!=null && updateAux.getId().equals(idUpdateSeleccionado)) {
					updateTemp=updateAux;
					break;
				}
			}

			if(updateTemp!=null) {
				jComboBoxid_updateUpdateDetalleGenerico.setSelectedItem(updateTemp);
			} else {
				if(jComboBoxid_updateUpdateDetalleGenerico!=null && jComboBoxid_updateUpdateDetalleGenerico.getItemCount()>0) {
					jComboBoxid_updateUpdateDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.updatedetalle!=null) {
						this.updatedetalle.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioUpdateDetalle.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioUpdateDetalle!=null) {
						jComboBoxid_anioFK_IdAnioUpdateDetalle.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioUpdateDetalle!=null) {
							//jComboBoxid_anioFK_IdAnioUpdateDetalle.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioUpdateDetalle.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioUpdateDetalle.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioUpdateDetalleGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioUpdateDetalleGenerico!=null && jComboBoxid_anioUpdateDetalleGenerico.getItemCount()>0) {
					jComboBoxid_anioUpdateDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.updatedetalle!=null) {
						this.updatedetalle.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesUpdateDetalle.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
						if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesUpdateDetalle!=null) {
						jComboBoxid_mesFK_IdMesUpdateDetalle.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesUpdateDetalle!=null) {
							//jComboBoxid_mesFK_IdMesUpdateDetalle.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesUpdateDetalle.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesUpdateDetalle.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesUpdateDetalleGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesUpdateDetalleGenerico!=null && jComboBoxid_mesUpdateDetalleGenerico.getItemCount()>0) {
					jComboBoxid_mesUpdateDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUpdateForeignKey(UpdateDetalle updatedetalle,JComboBox jComboBoxid_updateUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Update  updateAux=new Update();

			if(jComboBoxid_updateUpdateDetalleGenerico==null) {
				updateAux=(Update)this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.getSelectedItem();
			} else {
				updateAux=(Update)jComboBoxid_updateUpdateDetalleGenerico.getSelectedItem();
			}

			if(updateAux!=null && updateAux.getId()!=null) {
				updatedetalle.setid_update(updateAux.getId());
				updatedetalle.setupdate_descripcion(UpdateDetalleConstantesFunciones.getUpdateDescripcion(updateAux));
				updatedetalle.setUpdate(updateAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(UpdateDetalle updatedetalle,JComboBox jComboBoxid_anioUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioUpdateDetalleGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioUpdateDetalleGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				updatedetalle.setid_anio(anioAux.getId());
				updatedetalle.setanio_descripcion(UpdateDetalleConstantesFunciones.getAnioDescripcion(anioAux));
				updatedetalle.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(UpdateDetalle updatedetalle,JComboBox jComboBoxid_mesUpdateDetalleGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesUpdateDetalleGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesUpdateDetalleGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				updatedetalle.setid_mes(mesAux.getId());
				updatedetalle.setmes_descripcion(UpdateDetalleConstantesFunciones.getMesDescripcion(mesAux));
				updatedetalle.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUpdatesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUpdate=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.removeAllItems();

							for(Update update:this.updatesForeignKey) {
								this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.addItem(update);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
					}

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUpdate") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.removeAllItems();

							for(Update update:this.updatesForeignKey) {
								this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.addItem(update);
							}
						}

						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
					}

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioUpdateDetalle.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioUpdateDetalle.addItem(anio);
							}
						}

						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { 
					}

					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesUpdateDetalle.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesUpdateDetalle.addItem(mes);
							}
						}

						if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameUpdateForeignKey(Update update,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setSelectedItem(update);
						}
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.setSelectedItem(update);
						} else {
							this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioUpdateDetalle.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioUpdateDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesUpdateDetalle.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesUpdateDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesUpdateDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			UpdateDetalleConstantesFunciones.refrescarForeignKeysDescripcionesUpdateDetalle(this.updatedetalleLogic.getUpdateDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			UpdateDetalleConstantesFunciones.refrescarForeignKeysDescripcionesUpdateDetalle(this.updatedetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Update.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//updatedetalleLogic.setUpdateDetalles(this.updatedetalles);
			updatedetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public UpdateDetalleParameterReturnGeneral getUpdateDetalleParameterGeneral() {
		return this.updatedetalleParameterGeneral;
	}
	
	public void setUpdateDetalleParameterGeneral(UpdateDetalleParameterReturnGeneral updatedetalleParameterGeneral) {
		this.updatedetalleParameterGeneral = updatedetalleParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoUpdateDetalle() {
		return isPermisoTodoUpdateDetalle;
	}

	public void setIsPermisoTodoUpdateDetalle(Boolean isPermisoTodoUpdateDetalle) {
		this.isPermisoTodoUpdateDetalle = isPermisoTodoUpdateDetalle;
	}

	public Boolean getIsPermisoNuevoUpdateDetalle() {
		return isPermisoNuevoUpdateDetalle;
	}

	public void setIsPermisoNuevoUpdateDetalle(Boolean isPermisoNuevoUpdateDetalle) {
		this.isPermisoNuevoUpdateDetalle = isPermisoNuevoUpdateDetalle;
	}

	public Boolean getIsPermisoActualizarUpdateDetalle() {
		return isPermisoActualizarUpdateDetalle;
	}

	public void setIsPermisoActualizarUpdateDetalle(Boolean isPermisoActualizarUpdateDetalle) {
		this.isPermisoActualizarUpdateDetalle = isPermisoActualizarUpdateDetalle;
	}

	public Boolean getIsPermisoEliminarUpdateDetalle() {
		return isPermisoEliminarUpdateDetalle;
	}

	public void setIsPermisoEliminarUpdateDetalle(Boolean isPermisoEliminarUpdateDetalle) {
		this.isPermisoEliminarUpdateDetalle = isPermisoEliminarUpdateDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosUpdateDetalle() {
		return isPermisoGuardarCambiosUpdateDetalle;
	}

	public void setIsPermisoGuardarCambiosUpdateDetalle(Boolean isPermisoGuardarCambiosUpdateDetalle) {
		this.isPermisoGuardarCambiosUpdateDetalle = isPermisoGuardarCambiosUpdateDetalle;
	}
	
	public Boolean getIsPermisoConsultaUpdateDetalle() {
		return isPermisoConsultaUpdateDetalle;
	}

	public void setIsPermisoConsultaUpdateDetalle(Boolean isPermisoConsultaUpdateDetalle) {
		this.isPermisoConsultaUpdateDetalle = isPermisoConsultaUpdateDetalle;
	}

	public Boolean getIsPermisoBusquedaUpdateDetalle() {
		return isPermisoBusquedaUpdateDetalle;
	}

	public void setIsPermisoBusquedaUpdateDetalle(Boolean isPermisoBusquedaUpdateDetalle) {
		this.isPermisoBusquedaUpdateDetalle = isPermisoBusquedaUpdateDetalle;
	}

	public Boolean getIsPermisoReporteUpdateDetalle() {
		return isPermisoReporteUpdateDetalle;
	}

	public void setIsPermisoReporteUpdateDetalle(Boolean isPermisoReporteUpdateDetalle) {
		this.isPermisoReporteUpdateDetalle = isPermisoReporteUpdateDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioUpdateDetalle() {
		return isPermisoPaginacionMedioUpdateDetalle;
	}

	public void setIsPermisoPaginacionMedioUpdateDetalle(Boolean isPermisoPaginacionMedioUpdateDetalle) {
		this.isPermisoPaginacionMedioUpdateDetalle = isPermisoPaginacionMedioUpdateDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoUpdateDetalle() {
		return isPermisoPaginacionTodoUpdateDetalle;
	}

	public void setIsPermisoPaginacionTodoUpdateDetalle(Boolean isPermisoPaginacionTodoUpdateDetalle) {
		this.isPermisoPaginacionTodoUpdateDetalle = isPermisoPaginacionTodoUpdateDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoUpdateDetalle() {
		return isPermisoPaginacionAltoUpdateDetalle;
	}

	public void setIsPermisoPaginacionAltoUpdateDetalle(Boolean isPermisoPaginacionAltoUpdateDetalle) {
		this.isPermisoPaginacionAltoUpdateDetalle = isPermisoPaginacionAltoUpdateDetalle;
	}
	
	public Boolean getIsPermisoCopiarUpdateDetalle() {
		return isPermisoCopiarUpdateDetalle;
	}

	public void setIsPermisoCopiarUpdateDetalle(Boolean isPermisoCopiarUpdateDetalle) {
		this.isPermisoCopiarUpdateDetalle = isPermisoCopiarUpdateDetalle;
	}
	
	public Boolean getIsPermisoVerFormUpdateDetalle() {
		return isPermisoVerFormUpdateDetalle;
	}

	public void setIsPermisoVerFormUpdateDetalle(Boolean isPermisoVerFormUpdateDetalle) {
		this.isPermisoVerFormUpdateDetalle = isPermisoVerFormUpdateDetalle;
	}
	
	public Boolean getIsPermisoDuplicarUpdateDetalle() {
		return isPermisoDuplicarUpdateDetalle;
	}

	public void setIsPermisoDuplicarUpdateDetalle(Boolean isPermisoDuplicarUpdateDetalle) {
		this.isPermisoDuplicarUpdateDetalle = isPermisoDuplicarUpdateDetalle;
	}
	
	public Boolean getIsPermisoOrdenUpdateDetalle() {
		return isPermisoOrdenUpdateDetalle;
	}

	public void setIsPermisoOrdenUpdateDetalle(Boolean isPermisoOrdenUpdateDetalle) {
		this.isPermisoOrdenUpdateDetalle = isPermisoOrdenUpdateDetalle;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoUpdateDetalle() {
		return isVisibilidadCeldaNuevoUpdateDetalle;
	}

	public void setIsVisibilidadCeldaNuevoUpdateDetalle(Boolean isVisibilidadCeldaNuevoUpdateDetalle) {
		this.isVisibilidadCeldaNuevoUpdateDetalle = isVisibilidadCeldaNuevoUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUpdateDetalle() {
		return isVisibilidadCeldaDuplicarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarUpdateDetalle(Boolean isVisibilidadCeldaDuplicarUpdateDetalle) {
		this.isVisibilidadCeldaDuplicarUpdateDetalle = isVisibilidadCeldaDuplicarUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUpdateDetalle() {
		return isVisibilidadCeldaCopiarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaCopiarUpdateDetalle(Boolean isVisibilidadCeldaCopiarUpdateDetalle) {
		this.isVisibilidadCeldaCopiarUpdateDetalle = isVisibilidadCeldaCopiarUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUpdateDetalle() {
		return isVisibilidadCeldaVerFormUpdateDetalle;
	}

	public void setIsVisibilidadCeldaVerFormUpdateDetalle(Boolean isVisibilidadCeldaVerFormUpdateDetalle) {
		this.isVisibilidadCeldaVerFormUpdateDetalle = isVisibilidadCeldaVerFormUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUpdateDetalle() {
		return isVisibilidadCeldaOrdenUpdateDetalle;
	}

	public void setIsVisibilidadCeldaOrdenUpdateDetalle(Boolean isVisibilidadCeldaOrdenUpdateDetalle) {
		this.isVisibilidadCeldaOrdenUpdateDetalle = isVisibilidadCeldaOrdenUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUpdateDetalle() {
		return isVisibilidadCeldaNuevoRelacionesUpdateDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUpdateDetalle(Boolean isVisibilidadCeldaNuevoRelacionesUpdateDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle = isVisibilidadCeldaNuevoRelacionesUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUpdateDetalle() {
		return isVisibilidadCeldaModificarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaModificarUpdateDetalle(Boolean isVisibilidadCeldaModificarUpdateDetalle) {
		this.isVisibilidadCeldaModificarUpdateDetalle = isVisibilidadCeldaModificarUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUpdateDetalle() {
		return isVisibilidadCeldaActualizarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaActualizarUpdateDetalle(Boolean isVisibilidadCeldaActualizarUpdateDetalle) {
		this.isVisibilidadCeldaActualizarUpdateDetalle = isVisibilidadCeldaActualizarUpdateDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarUpdateDetalle() {
		return isVisibilidadCeldaEliminarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaEliminarUpdateDetalle(Boolean isVisibilidadCeldaEliminarUpdateDetalle) {
		this.isVisibilidadCeldaEliminarUpdateDetalle = isVisibilidadCeldaEliminarUpdateDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarUpdateDetalle() {
		return isVisibilidadCeldaCancelarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaCancelarUpdateDetalle(Boolean isVisibilidadCeldaCancelarUpdateDetalle) {
		this.isVisibilidadCeldaCancelarUpdateDetalle = isVisibilidadCeldaCancelarUpdateDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarUpdateDetalle() {
		return isVisibilidadCeldaGuardarUpdateDetalle;
	}

	public void setIsVisibilidadCeldaGuardarUpdateDetalle(Boolean isVisibilidadCeldaGuardarUpdateDetalle) {
		this.isVisibilidadCeldaGuardarUpdateDetalle = isVisibilidadCeldaGuardarUpdateDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUpdateDetalle() {
		return isVisibilidadCeldaGuardarCambiosUpdateDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUpdateDetalle(Boolean isVisibilidadCeldaGuardarCambiosUpdateDetalle) {
		this.isVisibilidadCeldaGuardarCambiosUpdateDetalle = isVisibilidadCeldaGuardarCambiosUpdateDetalle;
	}
		
	public UpdateDetalleSessionBean getupdatedetalleSessionBean() {
		return this.updatedetalleSessionBean;
	}
	
	public void setupdatedetalleSessionBean(UpdateDetalleSessionBean updatedetalleSessionBean) {
		this.updatedetalleSessionBean=updatedetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdUpdate() {
		return this.isVisibilidadFK_IdUpdate;
	}

	public void setisVisibilidadFK_IdUpdate(Boolean isVisibilidadFK_IdUpdate) {
		this.isVisibilidadFK_IdUpdate=isVisibilidadFK_IdUpdate;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(UpdateDetalle updatedetalle)throws Exception {
		try {
			
				this.setActualParaGuardarUpdateForeignKey(updatedetalle,null);
				this.setActualParaGuardarAnioForeignKey(updatedetalle,null);
				this.setActualParaGuardarMesForeignKey(updatedetalle,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(UpdateDetalle updatedetalle,UpdateDetalle updatedetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUpdateDetalle(updatedetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		updatedetalleAux.setId(updatedetalle.getId());
		updatedetalleAux.setVersionRow(updatedetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessUpdateDetalle();
		
			int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = updatedetalleValidator.getInvalidValues(this.updatedetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			updatedetalleLogic.setDatosCliente(datosCliente);
			updatedetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				updatedetalleAux=new  UpdateDetalle();
				
				updatedetalleAux.setIsNew(true);
				updatedetalleAux.setIsChanged(true);
				
				updatedetalleAux.setUpdateDetalleOriginal(this.updatedetalle);
				
				updatedetalleAux.setId(this.updatedetalle.getId());	
				updatedetalleAux.setVersionRow(this.updatedetalle.getVersionRow());	
				updatedetalleAux.setid_update(this.updatedetalle.getid_update());	
				updatedetalleAux.setid_anio(this.updatedetalle.getid_anio());	
				updatedetalleAux.setid_mes(this.updatedetalle.getid_mes());	
				updatedetalleAux.setcodigo(this.updatedetalle.getcodigo());	
				updatedetalleAux.setcodigo_proceso(this.updatedetalle.getcodigo_proceso());	
				updatedetalleAux.setquery_resumen(this.updatedetalle.getquery_resumen());	
				updatedetalleAux.setnumero_intento(this.updatedetalle.getnumero_intento());	
				updatedetalleAux.setfecha_archivo(this.updatedetalle.getfecha_archivo());	
				updatedetalleAux.setfecha(this.updatedetalle.getfecha());	
				updatedetalleAux.setorden(this.updatedetalle.getorden());	
				updatedetalleAux.setejecutado(this.updatedetalle.getejecutado());	
				updatedetalleAux.setesta_activo(this.updatedetalle.getesta_activo());	
				updatedetalleAux.setdescripcion(this.updatedetalle.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(updatedetalleAux,updatedetalleLogic.getUpdateDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updatedetalleAux,updatedetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.saveUpdateDetalles();//WithConnection
						//updatedetalleLogic.getSetVersionRowUpdateDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.updatedetalle,updatedetalleAux);
					
					this.refrescarForeignKeysDescripcionesUpdateDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				updatedetalleAux=new  UpdateDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.updatedetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.updatedetalleSessionBean.getEsGuardarRelacionado() && this.updatedetalle.getId()>=0)) {
						
					updatedetalleAux.setIsNew(false);
				}
				
				updatedetalleAux.setIsDeleted(false);
			
				updatedetalleAux.setId(this.updatedetalle.getId());	
				updatedetalleAux.setVersionRow(this.updatedetalle.getVersionRow());	
				updatedetalleAux.setid_update(this.updatedetalle.getid_update());	
				updatedetalleAux.setid_anio(this.updatedetalle.getid_anio());	
				updatedetalleAux.setid_mes(this.updatedetalle.getid_mes());	
				updatedetalleAux.setcodigo(this.updatedetalle.getcodigo());	
				updatedetalleAux.setcodigo_proceso(this.updatedetalle.getcodigo_proceso());	
				updatedetalleAux.setquery_resumen(this.updatedetalle.getquery_resumen());	
				updatedetalleAux.setnumero_intento(this.updatedetalle.getnumero_intento());	
				updatedetalleAux.setfecha_archivo(this.updatedetalle.getfecha_archivo());	
				updatedetalleAux.setfecha(this.updatedetalle.getfecha());	
				updatedetalleAux.setorden(this.updatedetalle.getorden());	
				updatedetalleAux.setejecutado(this.updatedetalle.getejecutado());	
				updatedetalleAux.setesta_activo(this.updatedetalle.getesta_activo());	
				updatedetalleAux.setdescripcion(this.updatedetalle.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(updatedetalleAux,updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updatedetalleAux,updatedetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.saveUpdateDetalles();//WithConnection
						//updatedetalleLogic.getSetVersionRowUpdateDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.updatedetalle,updatedetalleAux);
					
					this.refrescarForeignKeysDescripcionesUpdateDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				updatedetalleAux=new  UpdateDetalle();
				
				updatedetalleAux.setIsNew(false);
				updatedetalleAux.setIsChanged(false);
				
				updatedetalleAux.setIsDeleted(true);
				
				updatedetalleAux.setId(this.updatedetalle.getId());	
				updatedetalleAux.setVersionRow(this.updatedetalle.getVersionRow());	
				updatedetalleAux.setid_update(this.updatedetalle.getid_update());	
				updatedetalleAux.setid_anio(this.updatedetalle.getid_anio());	
				updatedetalleAux.setid_mes(this.updatedetalle.getid_mes());	
				updatedetalleAux.setcodigo(this.updatedetalle.getcodigo());	
				updatedetalleAux.setcodigo_proceso(this.updatedetalle.getcodigo_proceso());	
				updatedetalleAux.setquery_resumen(this.updatedetalle.getquery_resumen());	
				updatedetalleAux.setnumero_intento(this.updatedetalle.getnumero_intento());	
				updatedetalleAux.setfecha_archivo(this.updatedetalle.getfecha_archivo());	
				updatedetalleAux.setfecha(this.updatedetalle.getfecha());	
				updatedetalleAux.setorden(this.updatedetalle.getorden());	
				updatedetalleAux.setejecutado(this.updatedetalle.getejecutado());	
				updatedetalleAux.setesta_activo(this.updatedetalle.getesta_activo());	
				updatedetalleAux.setdescripcion(this.updatedetalle.getdescripcion());	
				
				if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.updatedetalleAux.getId()>=0) {	
						this.updatedetallesEliminados.add(updatedetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(updatedetalleAux,updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updatedetalleAux,updatedetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.saveUpdateDetalles();//WithConnection
						//updatedetalleLogic.getSetVersionRowUpdateDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(updatedetalleAux,updatedetalleLogic.getUpdateDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(updatedetalleAux,updatedetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getUpdateDetalles().addAll(this.updatedetallesEliminados);
					
					updatedetalleLogic.saveUpdateDetalles();//WithConnection
					//updatedetalleLogic.getSetVersionRowUpdateDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesUpdateDetalle();
				
				this.updatedetallesEliminados= new ArrayList<UpdateDetalle>();		
			}
			
			if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Update Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.updatedetalle=updatedetalleAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessUpdateDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(UpdateDetalle updatedetalleLocal) throws Exception {
		
		if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UpdateDetalle updatedetalleLocal) throws Exception {	
		if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(UpdateDetalleFormJInternalFrame.class)) {
				UpdateBeanSwingJInternalFrame updateBeanSwingJInternalFrameLocal=(UpdateBeanSwingJInternalFrame) ((UpdateDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				updateBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUpdate(updateBeanSwingJInternalFrameLocal.getupdate(),true);
				updateBeanSwingJInternalFrameLocal.actualizarLista(updateBeanSwingJInternalFrameLocal.update,this.updatesForeignKey);

				updateBeanSwingJInternalFrameLocal.actualizarRelaciones(updateBeanSwingJInternalFrameLocal.update);

				updatedetalleLocal.setUpdate(updateBeanSwingJInternalFrameLocal.update);

				this.addItemDefectoCombosForeignKeyUpdate();
				this.cargarCombosFrameUpdatesForeignKey("Formulario");
				this.setActualUpdateForeignKey(updateBeanSwingJInternalFrameLocal.update.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				updatedetalleLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				updatedetalleLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUpdateDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = updatedetalleValidator.getInvalidValues(this.updatedetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UpdateDetalle updatedetalle,List<UpdateDetalle> updatedetalles) throws Exception {
		try	{		
			UpdateDetalleConstantesFunciones.actualizarLista(updatedetalle,updatedetalles,this.updatedetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(UpdateDetalle updatedetalle,List<UpdateDetalle> updatedetalles) throws Exception {
		try	{			
			UpdateDetalleConstantesFunciones.actualizarSelectedLista(updatedetalle,updatedetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UpdateDetalle> updatedetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				updatedetallesLocal=this.updatedetalleLogic.getUpdateDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				updatedetallesLocal=this.updatedetalles;
			}
			//ARCHITECTURE
		
			for(UpdateDetalle updatedetalleLocal:updatedetallesLocal) {
				if(this.permiteMantenimiento(updatedetalleLocal) && updatedetalleLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+UpdateDetalleConstantesFunciones.getUpdateDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.IDUPDATE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_updateUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_anioUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_mesUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.CODIGOPROCESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigo_procesoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.QUERYRESUMEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelquery_resumenUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.NUMEROINTENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelnumero_intentoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.FECHAARCHIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfecha_archivoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfechaUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.ORDEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelordenUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.EJECUTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelejecutadoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelesta_activoUpdateDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UpdateDetalleConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabeldescripcionUpdateDetalle,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_updateUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_anioUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelid_mesUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigo_procesoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelquery_resumenUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelnumero_intentoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfecha_archivoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfechaUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelordenUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelejecutadoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabelesta_activoUpdateDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUpdateDetalle.jLabeldescripcionUpdateDetalle,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoUpdateDetalle--;	
		
		
		this.updatedetalleAux=new UpdateDetalle();
		
		this.updatedetalleAux.setId(this.iIdNuevoUpdateDetalle);
		this.updatedetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.updatedetalleLogic.getUpdateDetalles().add(this.updatedetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.updatedetalles.add(this.updatedetalleAux);
		}
		//ARCHITECTURE
		
		this.updatedetalle=this.updatedetalleAux;
		
		if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUpdateDetalle(this.updatedetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyUpdateDetalle(this.updatedetalle);
		}
				
		//this.setDefaultControlesUpdateDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUpdateDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUpdateDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUpdateDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUpdateDetalle(this.updatedetalleBean,this.updatedetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(UpdateDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
			classes=UpdateDetalleConstantesFunciones.getClassesRelationshipsOfUpdateDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.updatedetalleReturnGeneral=updatedetalleLogic.procesarEventosUpdateDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.updatedetalleLogic.getUpdateDetalles(),this.updatedetalle,this.updatedetalleParameterGeneral,this.isEsNuevoUpdateDetalle,classes);//this.updatedetalleLogic.getUpdateDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUpdateDetalle(this.updatedetalleReturnGeneral,this.updatedetalleBean,false);
		
		if(this.updatedetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle());
		}
		
		if(this.updatedetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle(),classes);//this.updatedetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUpdateDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUpdateDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.RecargarFormUpdateDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUpdateDetalle(false);
						
			if(updatedetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdateDetalle();
			}
			
			this.actualizarVisualTableDatosUpdateDetalle();
			
			this.jTableDatosUpdateDetalle.setRowSelectionInterval(this.getIndiceNuevoUpdateDetalle(), this.getIndiceNuevoUpdateDetalle());
			
			this.seleccionarFilaTablaUpdateDetalleActual();
						
			this.actualizarEstadoCeldasBotonesUpdateDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUpdateDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarcodigoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarcodigo_procesoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarquery_resumenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarnumero_intentoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarfecha_archivoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarfechaUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarordenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarejecutadoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activaresta_activoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activardescripcionUpdateDetalle);	
		
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarid_updateUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarid_anioUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setEnabled(isHabilitar && this.updatedetalleConstantesFunciones.activarid_mesUpdateDetalle);
	};
	
	public void setDefaultControlesUpdateDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUpdateDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.updatedetalleSessionBean.setConGuardarRelaciones(true);			
			this.updatedetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.setVisible(true);
			
					
		} else {
			//this.updatedetalleSessionBean.setConGuardarRelaciones(false);			
			this.updatedetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUpdateDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
				if(updatedetalleAux.getId().equals(this.iIdNuevoUpdateDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalles) {
				if(updatedetalleAux.getId().equals(this.iIdNuevoUpdateDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualUpdateDetalle(UpdateDetalle updatedetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
				if(updatedetalleAux.getId().equals(updatedetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalles) {
				if(updatedetalleAux.getId().equals(updatedetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalUpdateDetalle(UpdateDetalle updatedetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
				if(updatedetalleAux.getUpdateDetalleOriginal().getId().equals(updatedetalleOriginal.getId())) {
					existe=true;
					updatedetalleOriginal.setId(updatedetalleAux.getId());
					updatedetalleOriginal.setVersionRow(updatedetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UpdateDetalle updatedetalleAux:this.updatedetalles) {
				if(updatedetalleAux.getUpdateDetalleOriginal().getId().equals(updatedetalleOriginal.getId())) {
					existe=true;
					updatedetalleOriginal.setId(updatedetalleAux.getId());
					updatedetalleOriginal.setVersionRow(updatedetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUpdateDetalle(Boolean esParaCancelar) throws Exception {
		updatedetallesAux=new ArrayList<UpdateDetalle>();
		updatedetalleAux=new UpdateDetalle();
		
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
					if(updatedetalleAux.getId()<0) {
						updatedetallesAux.add(updatedetalleAux);
					}		
				}
				this.iIdNuevoUpdateDetalle=0L;
				this.updatedetalleLogic.getUpdateDetalles().removeAll(updatedetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UpdateDetalle updatedetalleAux:this.updatedetalles) {
					if(updatedetalleAux.getId()<0) {
						updatedetallesAux.add(updatedetalleAux);
					}		
				}
				this.iIdNuevoUpdateDetalle=0L;
				this.updatedetalles.removeAll(updatedetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUpdateDetalle 
					&& this.updatedetalleLogic.getUpdateDetalles().size()>0
					) {
					updatedetalleAux=this.updatedetalleLogic.getUpdateDetalles().get(this.updatedetalleLogic.getUpdateDetalles().size() - 1);
				
					if(updatedetalleAux.getId()<0) {
						this.updatedetalleLogic.getUpdateDetalles().remove(updatedetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUpdateDetalle && this.updatedetalles.size()>0) {
					updatedetalleAux=this.updatedetalles.get(this.updatedetalles.size() - 1);
				
					if(updatedetalleAux.getId()<0) {
						this.updatedetalles.remove(updatedetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUpdateDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(updatedetalle.getId()<0) {
				this.updatedetalleLogic.getUpdateDetalles().remove(this.updatedetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(updatedetalle.getId()<0) {
				this.updatedetalles.remove(this.updatedetalle);
			}
		}			
	}
	
	public void setEstadosInicialesUpdateDetalle(List<UpdateDetalle> updatedetallesAux) throws Exception {
		UpdateDetalleConstantesFunciones.setEstadosInicialesUpdateDetalle(updatedetallesAux);
	}
	
	public void setEstadosInicialesUpdateDetalle(UpdateDetalle updatedetalleAux) throws Exception {
		UpdateDetalleConstantesFunciones.setEstadosInicialesUpdateDetalle(updatedetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUpdateDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUpdateDetalleActual()) {
				if(!this.isEsNuevoUpdateDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUpdateDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUpdateDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Update Detalle ?", "MANTENIMIENTO DE Update Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UpdateDetalle updatedetalle) throws Exception {
		UpdateDetalleConstantesFunciones.seleccionarAsignar(this.updatedetalle,updatedetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUpdateDetalle=this.isPermisoActualizarOriginalUpdateDetalle;
			
			
			this.seleccionarAsignar(updatedetalle);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UpdateDetalleConstantesFunciones.quitarEspaciosUpdateDetalle(this.updatedetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesUpdateDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.updatedetalleSessionBean.setsFuncionBusquedaRapida(this.updatedetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUpdateDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUpdateDetalle(esParaCancelar);				
				this.cancelarNuevoUpdateDetalle(esParaCancelar);								
			}
			
			this.updatedetalle=new UpdateDetalle();
			
			this.inicializarUpdateDetalle();
			
			this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUpdateDetalle() throws Exception {
		try {
			UpdateDetalleConstantesFunciones.inicializarUpdateDetalle(this.updatedetalle);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.updatedetalleLogic.getUpdateDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUpdateDetalles(String sAccionBusqueda,List<UpdateDetalle> updatedetallesParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="UpdateDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UpdateDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UpdateDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UpdateDetalle"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Update Detalles");		
		parameters.put("busquedapor", UpdateDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUpdateDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UpdateDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UpdateDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUpdateDetalle=new JRBeanArrayDataSource(UpdateDetalleJInternalFrame.TraerUpdateDetalleBeans(updatedetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUpdateDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UpdateDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UpdateDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UpdateDetalleBean.TraerUpdateDetalleBeans(updatedetallesParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUpdateDetalleActionPerformed(null);
					//this.generarExcelReporteUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUpdateDetalles(sAccionBusqueda,sTipoArchivoReporte,updatedetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUpdateDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<UpdateDetalle> updatedetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UpdateDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUpdateDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UpdateDetalle updatedetalle : updatedetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UpdateDetalleConstantesFunciones.generarExcelReporteDataUpdateDetalle("NORMAL",row,workbook,updatedetalle,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUpdateDetalle(String sTipo,Row row,Workbook workbook) {
		
		UpdateDetalleConstantesFunciones.generarExcelReporteHeaderUpdateDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUpdateDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<UpdateDetalle> updatedetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UpdateDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UpdateDetalle updatedetalle : updatedetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UpdateDetalleConstantesFunciones.getUpdateDetalleDescripcion(updatedetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getupdate_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getcodigo_proceso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getquery_resumen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getnumero_intento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getfecha_archivo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_ORDEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ORDEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getorden());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(updatedetalle.getejecutado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(updatedetalle.getesta_activo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(updatedetalle.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUpdateDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<UpdateDetalle> updatedetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UpdateDetalle> updatedetallesRespaldo=null;
		
		classes=UpdateDetalleConstantesFunciones.getClassesRelationshipsOfUpdateDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.updatedetalleLogic.setDatosCliente(this.datosCliente);
		this.updatedetalleLogic.setDatosDeep(this.datosDeep);
		this.updatedetalleLogic.setIsConDeep(true);
		
		updatedetallesRespaldo=this.updatedetalleLogic.getUpdateDetalles();
		
		this.updatedetalleLogic.setUpdateDetalles(updatedetallesParaReportes);	
		this.updatedetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		updatedetallesParaReportes=this.updatedetalleLogic.getUpdateDetalles();
		this.updatedetalleLogic.setUpdateDetalles(updatedetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UpdateDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUpdateDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UpdateDetalle updatedetalle : updatedetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUpdateDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UpdateDetalleConstantesFunciones.generarExcelReporteDataUpdateDetalle("NORMAL",row,workbook,updatedetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UpdateDetalleConstantesFunciones.getUpdateDetalleDescripcion(updatedetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUpdateDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUpdateDetalle() throws Exception {		
		this.startProcessUpdateDetalle(true);
	}
	
	public void startProcessUpdateDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUpdateDetalle ,this.jPanelParametrosReportesUpdateDetalle, this.jScrollPanelDatosUpdateDetalle,this.jPanelPaginacionUpdateDetalle, this.jScrollPanelDatosEdicionUpdateDetalle, this.jPanelAccionesUpdateDetalle,this.jPanelAccionesFormularioUpdateDetalle,this.jmenuBarUpdateDetalle,this.jmenuBarDetalleUpdateDetalle,this.jTtoolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasUpdateDetalle=this.jTabbedPaneBusquedasUpdateDetalle; 
		
		final JPanel jPanelParametrosReportesUpdateDetalle=this.jPanelParametrosReportesUpdateDetalle;
		//final JScrollPane jScrollPanelDatosUpdateDetalle=this.jScrollPanelDatosUpdateDetalle;
		final JTable jTableDatosUpdateDetalle=this.jTableDatosUpdateDetalle;		
		final JPanel jPanelPaginacionUpdateDetalle=this.jPanelPaginacionUpdateDetalle;
		//final JScrollPane jScrollPanelDatosEdicionUpdateDetalle=this.jScrollPanelDatosEdicionUpdateDetalle;
		final JPanel jPanelAccionesUpdateDetalle=this.jPanelAccionesUpdateDetalle;
		
		JPanel jPanelCamposAuxiliarUpdateDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUpdateDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			jPanelCamposAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jPanelCamposUpdateDetalle;
			jPanelAccionesFormularioAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jPanelAccionesFormularioUpdateDetalle;
		}
		
		final JPanel jPanelCamposUpdateDetalle=jPanelCamposAuxiliarUpdateDetalle;
		final JPanel jPanelAccionesFormularioUpdateDetalle=jPanelAccionesFormularioAuxiliarUpdateDetalle;
		
		
		final JMenuBar jmenuBarUpdateDetalle=this.jmenuBarUpdateDetalle;
		final JToolBar jTtoolBarUpdateDetalle=this.jTtoolBarUpdateDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUpdateDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUpdateDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			jmenuBarDetalleAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jmenuBarDetalleUpdateDetalle;
			jTtoolBarDetalleAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jTtoolBarDetalleUpdateDetalle;
		}
		
		final JMenuBar jmenuBarDetalleUpdateDetalle=jmenuBarDetalleAuxiliarUpdateDetalle;
		final JToolBar jTtoolBarDetalleUpdateDetalle=jTtoolBarDetalleAuxiliarUpdateDetalle;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUpdateDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUpdateDetalle;
			processRunnable.jTableDatos=jTableDatosUpdateDetalle;
			processRunnable.jPanelCampos=jPanelCamposUpdateDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionUpdateDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesUpdateDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUpdateDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarUpdateDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUpdateDetalle;
			processRunnable.jTtoolBar=jTtoolBarUpdateDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUpdateDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUpdateDetalle ,jPanelParametrosReportesUpdateDetalle,jTableDatosUpdateDetalle, /*jScrollPanelDatosUpdateDetalle,*/jPanelCamposUpdateDetalle,jPanelPaginacionUpdateDetalle, /*jScrollPanelDatosEdicionUpdateDetalle,*/ jPanelAccionesUpdateDetalle,jPanelAccionesFormularioUpdateDetalle,jmenuBarUpdateDetalle,jmenuBarDetalleUpdateDetalle,jTtoolBarUpdateDetalle,jTtoolBarDetalleUpdateDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUpdateDetalle ,jPanelParametrosReportesUpdateDetalle, jScrollPanelDatosUpdateDetalle,jPanelPaginacionUpdateDetalle, jScrollPanelDatosEdicionUpdateDetalle, jPanelAccionesUpdateDetalle,jPanelAccionesFormularioUpdateDetalle,jmenuBarUpdateDetalle,jmenuBarDetalleUpdateDetalle,jTtoolBarUpdateDetalle,jTtoolBarDetalleUpdateDetalle);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessUpdateDetalle() {// throws Exception 
		this.finishProcessUpdateDetalle(true);
	}
	
	public void finishProcessUpdateDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUpdateDetalle ,this.jPanelParametrosReportesUpdateDetalle, this.jScrollPanelDatosUpdateDetalle,this.jPanelPaginacionUpdateDetalle, this.jScrollPanelDatosEdicionUpdateDetalle, this.jPanelAccionesUpdateDetalle,this.jPanelAccionesFormularioUpdateDetalle,this.jmenuBarUpdateDetalle,this.jmenuBarDetalleUpdateDetalle,this.jTtoolBarUpdateDetalle,this.jTtoolBarDetalleUpdateDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasUpdateDetalle=this.jTabbedPaneBusquedasUpdateDetalle; 
		
		final JPanel jPanelParametrosReportesUpdateDetalle=this.jPanelParametrosReportesUpdateDetalle;
		//final JScrollPane jScrollPanelDatosUpdateDetalle=this.jScrollPanelDatosUpdateDetalle;
		final JTable jTableDatosUpdateDetalle=this.jTableDatosUpdateDetalle;		
		final JPanel jPanelPaginacionUpdateDetalle=this.jPanelPaginacionUpdateDetalle;
		//final JScrollPane jScrollPanelDatosEdicionUpdateDetalle=this.jScrollPanelDatosEdicionUpdateDetalle;
		final JPanel jPanelAccionesUpdateDetalle=this.jPanelAccionesUpdateDetalle;
		
		JPanel jPanelCamposAuxiliarUpdateDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUpdateDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			jPanelCamposAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jPanelCamposUpdateDetalle;
			jPanelAccionesFormularioAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jPanelAccionesFormularioUpdateDetalle;
		}
		
		final JPanel jPanelCamposUpdateDetalle=jPanelCamposAuxiliarUpdateDetalle;
		final JPanel jPanelAccionesFormularioUpdateDetalle=jPanelAccionesFormularioAuxiliarUpdateDetalle;
		
		
		final JMenuBar jmenuBarUpdateDetalle=this.jmenuBarUpdateDetalle;		
		final JToolBar jTtoolBarUpdateDetalle=this.jTtoolBarUpdateDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarUpdateDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUpdateDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			jmenuBarDetalleAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jmenuBarDetalleUpdateDetalle;
			jTtoolBarDetalleAuxiliarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jTtoolBarDetalleUpdateDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleUpdateDetalle=jmenuBarDetalleAuxiliarUpdateDetalle;
		final JToolBar jTtoolBarDetalleUpdateDetalle=jTtoolBarDetalleAuxiliarUpdateDetalle;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUpdateDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUpdateDetalle;
			processRunnable.jTableDatos=jTableDatosUpdateDetalle;
			processRunnable.jPanelCampos=jPanelCamposUpdateDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionUpdateDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesUpdateDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUpdateDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarUpdateDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUpdateDetalle;
			processRunnable.jTtoolBar=jTtoolBarUpdateDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUpdateDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUpdateDetalle ,jPanelParametrosReportesUpdateDetalle, jTableDatosUpdateDetalle,/*jScrollPanelDatosUpdateDetalle,*/jPanelCamposUpdateDetalle,jPanelPaginacionUpdateDetalle, /*jScrollPanelDatosEdicionUpdateDetalle,*/ jPanelAccionesUpdateDetalle,jPanelAccionesFormularioUpdateDetalle,jmenuBarUpdateDetalle,jmenuBarDetalleUpdateDetalle,jTtoolBarUpdateDetalle,jTtoolBarDetalleUpdateDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUpdateDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUpdateDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUpdateDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUpdateDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUpdateDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUpdateDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUpdateDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUpdateDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUpdateDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.updatedetalleConstantesFunciones.getsFinalQueryUpdateDetalle();
		String  finalQueryPaginacionTodos=this.updatedetalleConstantesFunciones.getsFinalQueryUpdateDetalle();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=UpdateDetalleConstantesFunciones.getArrayColumnasGlobalesNoUpdateDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UpdateDetalleConstantesFunciones.getArrayColumnasGlobalesUpdateDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UpdateDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.updatedetallesEliminados= new ArrayList<UpdateDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUpdateDetalle();
		
				///*UpdateDetalleSessionBean*/this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			
			if(this.updatedetalleSessionBean==null) {
				this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=UpdateDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UpdateDetalleConstantesFunciones.getClassesForeignKeysOfUpdateDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/updatedetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			updatedetallesAux= new ArrayList<UpdateDetalle>();
			
				
			updatedetalleLogic.setDatosCliente(this.datosCliente);
			updatedetalleLogic.setDatosDeep(this.datosDeep);
			updatedetalleLogic.setIsConDeep(true);
			
			
			updatedetalleLogic.getUpdateDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					updatedetalleLogic.getTodosUpdateDetalles(finalQueryGlobal,pagination);
					
					//updatedetalleLogic.getTodosUpdateDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(updatedetalleLogic.getUpdateDetalles()==null|| updatedetalleLogic.getUpdateDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updatedetallesAux= new ArrayList<UpdateDetalle>();
							updatedetallesAux.addAll(updatedetalleLogic.getUpdateDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetallesAux= new ArrayList<UpdateDetalle>();
							updatedetallesAux.addAll(updatedetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updatedetalleLogic.getTodosUpdateDetalles(finalQueryGlobal+"",this.pagination);												
							
							//updatedetalleLogic.getTodosUpdateDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteUpdateDetalles("Todos",updatedetalleLogic.getUpdateDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							updatedetalleLogic.setUpdateDetalles(new ArrayList<UpdateDetalle>());					
							updatedetalleLogic.getUpdateDetalles().addAll(updatedetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetalles=new ArrayList<UpdateDetalle>();
							updatedetalles.addAll(updatedetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idUpdateDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idUpdateDetalle=this.idActual;
				
				} else if(this.idUpdateDetalleActual!=null && this.idUpdateDetalleActual!=0L) {
					idUpdateDetalle=idUpdateDetalleActual;
				}
				
					
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndicePorId(idUpdateDetalle);
				
				this.updatedetalles=new ArrayList<UpdateDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					updatedetalleLogic.getEntity(idUpdateDetalle);
					
					//updatedetalleLogic.getEntityWithConnection(idUpdateDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updatedetalleLogic.setUpdateDetalles(new ArrayList<UpdateDetalle>());
					updatedetalleLogic.getUpdateDetalles().add(updatedetalleLogic.getUpdateDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updatedetalles=new ArrayList<UpdateDetalle>();
					this.updatedetalles.add(updatedetalle);
				}
				
				if(updatedetalleLogic.getUpdateDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					updatedetalleLogic.getUpdateDetallesFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=updatedetalleLogic.getUpdateDetalles()==null||updatedetalleLogic.getUpdateDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=updatedetalles==null|| updatedetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetallesAux=new ArrayList<UpdateDetalle>();
						updatedetallesAux.addAll(updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetallesAux=new ArrayList<UpdateDetalle>();
							updatedetallesAux.addAll(updatedetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							updatedetalleLogic.getUpdateDetallesFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUpdateDetalles("FK_IdAnio",updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUpdateDetalles("FK_IdAnio",updatedetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.setUpdateDetalles(new ArrayList<UpdateDetalle>());
						updatedetalleLogic.getUpdateDetalles().addAll(updatedetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetalles=new ArrayList<UpdateDetalle>();
							updatedetalles.addAll(updatedetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					updatedetalleLogic.getUpdateDetallesFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=updatedetalleLogic.getUpdateDetalles()==null||updatedetalleLogic.getUpdateDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=updatedetalles==null|| updatedetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetallesAux=new ArrayList<UpdateDetalle>();
						updatedetallesAux.addAll(updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetallesAux=new ArrayList<UpdateDetalle>();
							updatedetallesAux.addAll(updatedetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							updatedetalleLogic.getUpdateDetallesFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUpdateDetalles("FK_IdMes",updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUpdateDetalles("FK_IdMes",updatedetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.setUpdateDetalles(new ArrayList<UpdateDetalle>());
						updatedetalleLogic.getUpdateDetalles().addAll(updatedetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetalles=new ArrayList<UpdateDetalle>();
							updatedetalles.addAll(updatedetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUpdate")) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdUpdate(id_updateFK_IdUpdate);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					updatedetalleLogic.getUpdateDetallesFK_IdUpdate(finalQueryGlobal,pagination,id_updateFK_IdUpdate);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdUpdate(id_updateFK_IdUpdate);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdUpdate(id_updateFK_IdUpdate);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=updatedetalleLogic.getUpdateDetalles()==null||updatedetalleLogic.getUpdateDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=updatedetalles==null|| updatedetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetallesAux=new ArrayList<UpdateDetalle>();
						updatedetallesAux.addAll(updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetallesAux=new ArrayList<UpdateDetalle>();
							updatedetallesAux.addAll(updatedetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							updatedetalleLogic.getUpdateDetallesFK_IdUpdate(finalQueryGlobal,pagination,id_updateFK_IdUpdate);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdUpdate(id_updateFK_IdUpdate);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UpdateDetalleConstantesFunciones.getDetalleIndiceFK_IdUpdate(id_updateFK_IdUpdate);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUpdateDetalles("FK_IdUpdate",updatedetalleLogic.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUpdateDetalles("FK_IdUpdate",updatedetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleLogic.setUpdateDetalles(new ArrayList<UpdateDetalle>());
						updatedetalleLogic.getUpdateDetalles().addAll(updatedetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetalles=new ArrayList<UpdateDetalle>();
							updatedetalles.addAll(updatedetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUpdateDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUpdateDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=updatedetalleLogic.getUpdateDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updatedetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=updatedetalleLogic.getUpdateDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=updatedetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UpdateDetalle updatedetalle) {
		Boolean permite=true;
		
		if(this.updatedetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UpdateDetalleConstantesFunciones.getOrderByListaUpdateDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UpdateDetalleConstantesFunciones.getOrderByListaUpdateDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UpdateDetalle updatedetalle:updatedetalleLogic.getUpdateDetalles()) {
				if(updatedetalle.getsType().equals(Constantes2.S_TOTALES)) {
					updatedetalleTotales=updatedetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UpdateDetalle updatedetalle:this.updatedetalles) {
				if(updatedetalle.getsType().equals(Constantes2.S_TOTALES)) {
					updatedetalleTotales=updatedetalle;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.updatedetalleAux=new UpdateDetalle();
			this.updatedetalleAux.setsType(Constantes2.S_TOTALES);
			this.updatedetalleAux.setIsNew(false);
			this.updatedetalleAux.setIsChanged(false);
			this.updatedetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				UpdateDetalleConstantesFunciones.TotalizarValoresFilaUpdateDetalle(this.updatedetalleLogic.getUpdateDetalles(),this.updatedetalleAux);
				
				this.updatedetalleLogic.getUpdateDetalles().add(this.updatedetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UpdateDetalleConstantesFunciones.TotalizarValoresFilaUpdateDetalle(this.updatedetalles,this.updatedetalleAux);
				
				this.updatedetalles.add(this.updatedetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		updatedetalleTotales=new UpdateDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.updatedetalleLogic.getUpdateDetalles().remove(updatedetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.updatedetalles.remove(updatedetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		updatedetalleTotales=new UpdateDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UpdateDetalle updatedetalle:updatedetalleLogic.getUpdateDetalles()) {
				if(updatedetalle.getsType().equals(Constantes2.S_TOTALES)) {
					updatedetalleTotales=updatedetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UpdateDetalleConstantesFunciones.TotalizarValoresFilaUpdateDetalle(this.updatedetalleLogic.getUpdateDetalles(),updatedetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UpdateDetalle updatedetalle:this.updatedetalles) {
				if(updatedetalle.getsType().equals(Constantes2.S_TOTALES)) {
					updatedetalleTotales=updatedetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UpdateDetalleConstantesFunciones.TotalizarValoresFilaUpdateDetalle(this.updatedetalles,updatedetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUpdateDetallesFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUpdateDetallesFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUpdateDetallesFK_IdUpdate()throws Exception {
		try {
			sAccionBusqueda="FK_IdUpdate";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUpdateDetallesFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updatedetalleLogic.getUpdateDetallesFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUpdateDetallesFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updatedetalleLogic.getUpdateDetallesFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUpdateDetallesFK_IdUpdate(String sFinalQuery,Long id_update)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updatedetalleLogic.getUpdateDetallesFK_IdUpdate(sFinalQuery,this.pagination,id_update);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosUpdateDetalle() {
		this.isPermisoTodoUpdateDetalle=false;
		this.isPermisoNuevoUpdateDetalle=false;
		this.isPermisoActualizarUpdateDetalle=false;
		this.isPermisoActualizarOriginalUpdateDetalle=false;
		this.isPermisoEliminarUpdateDetalle=false;
		this.isPermisoGuardarCambiosUpdateDetalle=false;
		this.isPermisoConsultaUpdateDetalle=false;
		this.isPermisoBusquedaUpdateDetalle=false;
		this.isPermisoReporteUpdateDetalle=false;		
		this.isPermisoOrdenUpdateDetalle=false;		
		this.isPermisoPaginacionMedioUpdateDetalle=false;		
		this.isPermisoPaginacionAltoUpdateDetalle=false;
		this.isPermisoPaginacionTodoUpdateDetalle=false;
		this.isPermisoCopiarUpdateDetalle=false;		
		this.isPermisoVerFormUpdateDetalle=false;		
		this.isPermisoDuplicarUpdateDetalle=false;		
		this.isPermisoOrdenUpdateDetalle=false;		
	}
	
	public void setPermisosUsuarioUpdateDetalle(Boolean isPermiso) {
		this.isPermisoTodoUpdateDetalle=isPermiso;
		this.isPermisoNuevoUpdateDetalle=isPermiso;
		this.isPermisoActualizarUpdateDetalle=isPermiso;
		this.isPermisoActualizarOriginalUpdateDetalle=isPermiso;
		this.isPermisoEliminarUpdateDetalle=isPermiso;
		this.isPermisoGuardarCambiosUpdateDetalle=isPermiso;
		this.isPermisoConsultaUpdateDetalle=isPermiso;
		this.isPermisoBusquedaUpdateDetalle=isPermiso;
		this.isPermisoReporteUpdateDetalle=isPermiso;
		this.isPermisoOrdenUpdateDetalle=isPermiso;		
		this.isPermisoPaginacionMedioUpdateDetalle=isPermiso;		
		this.isPermisoPaginacionAltoUpdateDetalle=isPermiso;		
		this.isPermisoPaginacionTodoUpdateDetalle=isPermiso;		
		this.isPermisoCopiarUpdateDetalle=isPermiso;		
		this.isPermisoVerFormUpdateDetalle=isPermiso;		
		this.isPermisoDuplicarUpdateDetalle=isPermiso;
		this.isPermisoOrdenUpdateDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUpdateDetalle(Boolean isPermiso) {
		//this.isPermisoTodoUpdateDetalle=isPermiso;
		this.isPermisoNuevoUpdateDetalle=isPermiso;
		this.isPermisoActualizarUpdateDetalle=isPermiso;
		this.isPermisoActualizarOriginalUpdateDetalle=isPermiso;
		this.isPermisoEliminarUpdateDetalle=isPermiso;
		this.isPermisoGuardarCambiosUpdateDetalle=isPermiso;
		//this.isPermisoConsultaUpdateDetalle=isPermiso;
		//this.isPermisoBusquedaUpdateDetalle=isPermiso;
		//this.isPermisoReporteUpdateDetalle=isPermiso;
		//this.isPermisoOrdenUpdateDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioUpdateDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoUpdateDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoUpdateDetalle=isPermiso;		
		//this.isPermisoCopiarUpdateDetalle=isPermiso;		
		//this.isPermisoDuplicarUpdateDetalle=isPermiso;
		//this.isPermisoOrdenUpdateDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUpdateDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UpdateDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebUpdateDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUpdateDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUpdateDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUpdateDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUpdateDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUpdateDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UpdateDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UpdateDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUpdateDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUpdateDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUpdateDetalle=this.isPermisoActualizarUpdateDetalle;
			this.isPermisoEliminarUpdateDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUpdateDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUpdateDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUpdateDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUpdateDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUpdateDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUpdateDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUpdateDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUpdateDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUpdateDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUpdateDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUpdateDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUpdateDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUpdateDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUpdateDetalle.setToolTipText(this.jTableDatosUpdateDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUpdateDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUpdateDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UpdateDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(UpdateDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioUpdateDetalle() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyUpdateDetalleListas()throws Exception {
		try	{						
			
				this.updatesForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUpdateDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UpdateDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyUpdateDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyUpdateListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyUpdateListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.updatesForeignKey==null||this.updatesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UpdateConstantesFunciones.getArrayColumnasGlobalesUpdate(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UpdateConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UpdateConstantesFunciones.SFINALQUERY;

				this.cargarCombosUpdatesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyUpdateDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			UpdateDetalleParameterReturnGeneral updatedetalleReturnGeneral=new UpdateDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalUpdate="";

				if(((this.updatesForeignKey==null||this.updatesForeignKey.size()<=0) && this.updatedetalleConstantesFunciones.cargarid_updateUpdateDetalle)
					 || (this.esRecargarFks && this.updatedetalleConstantesFunciones.cargarid_updateUpdateDetalle)) {

					if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionUpdate()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UpdateConstantesFunciones.getArrayColumnasGlobalesUpdate(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUpdate=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UpdateConstantesFunciones.TABLENAME);

						finalQueryGlobalUpdate=Funciones.GetFinalQueryAppend(finalQueryGlobalUpdate, "");
						finalQueryGlobalUpdate+=UpdateConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUpdatesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUpdate=" WHERE " + ConstantesSql.ID + "="+updatedetalleSessionBean.getlidUpdateActual();
					}
				} else {
					finalQueryGlobalUpdate="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.updatedetalleConstantesFunciones.cargarid_anioUpdateDetalle)
					 || (this.esRecargarFks && this.updatedetalleConstantesFunciones.cargarid_anioUpdateDetalle)) {

					if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+updatedetalleSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.updatedetalleConstantesFunciones.cargarid_mesUpdateDetalle)
					 || (this.esRecargarFks && this.updatedetalleConstantesFunciones.cargarid_mesUpdateDetalle)) {

					if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+updatedetalleSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				updatedetalleReturnGeneral=updatedetalleLogic.cargarCombosLoteForeignKeyUpdateDetalle(finalQueryGlobalUpdate,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalUpdate.equals("NONE")) {
				this.updatesForeignKey=updatedetalleReturnGeneral.getupdatesForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=updatedetalleReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=updatedetalleReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyUpdateDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyUpdate();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyUpdate()throws Exception {
		try {
			if(this.updatedetalleSessionBean==null) {
				this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
			}

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionUpdate()) {
				Update update=new Update();
				UpdateConstantesFunciones.setUpdateDescripcion(update,Constantes.SMENSAJE_ESCOJA_OPCION);
				update.setId(null);

				if(!UpdateConstantesFunciones.ExisteEnLista(this.updatesForeignKey,update,true)) {

					this.updatesForeignKey.add(0,update);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.updatedetalleSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUpdateDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUpdateDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUpdateDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.updatedetalle.setfecha_archivo(this.parametroGeneralUsuario.getfecha_sistema());
				this.updatedetalle.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUpdateDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUpdateDetalle(UpdateDetalle updatedetalle)throws Exception {	
		try {
			
			this.setActualUpdateForeignKey(updatedetalle.getid_update(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUpdateDetalle(UpdateDetalle updatedetalle,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUpdateDetalle()throws Exception {	
		try {
			
			this.setActualUpdateForeignKey(this.updatedetalleConstantesFunciones.getid_update(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUpdateDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUpdateDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUpdateDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUpdateDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUpdateDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameUpdatesForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUpdateDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameUpdatesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUpdateDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public UpdateDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UpdateDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UpdateDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.updatedetalleSessionBean=new UpdateDetalleSessionBean(); 
		this.updatedetalleConstantesFunciones=new UpdateDetalleConstantesFunciones(); 
		this.updatedetalleBean=new UpdateDetalle();//(this.updatedetalleConstantesFunciones); 		
		this.updatedetalleReturnGeneral=new UpdateDetalleParameterReturnGeneral(); 
		
		this.updatedetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.updatedetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UpdateDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UpdateDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UpdateDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUpdateDetalle(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.updatedetalleConstantesFunciones=new UpdateDetalleConstantesFunciones(); 
			this.updatedetalleBean=new UpdateDetalle();//this.updatedetalleConstantesFunciones); 			
			this.updatedetalleReturnGeneral=new UpdateDetalleParameterReturnGeneral(); 
		
			UpdateDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Update Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.updatedetalle=new UpdateDetalle();
			this.updatedetalles = new ArrayList<UpdateDetalle>();
			this.updatedetallesAux = new ArrayList<UpdateDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic=new UpdateDetalleLogic();
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.updatedetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.updatedetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUpdateDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUpdateDetalle);	
					}
					
					if(this.jInternalFrameImportacionUpdateDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUpdateDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUpdateDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUpdateDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUpdateDetalle);
				this.jInternalFrameDetalleFormUpdateDetalle.setVisible(false);
				this.jInternalFrameDetalleFormUpdateDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUpdateDetalle);
					this.jInternalFrameReporteDinamicoUpdateDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoUpdateDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUpdateDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUpdateDetalle);
					this.jInternalFrameImportacionUpdateDetalle.setVisible(false);
					this.jInternalFrameImportacionUpdateDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUpdateDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUpdateDetalle);
					this.jInternalFrameOrderByUpdateDetalle.setVisible(false);
					this.jInternalFrameOrderByUpdateDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUpdateDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UpdateDetalleConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.updatedetalleReturnGeneral=new UpdateDetalleParameterReturnGeneral();
			
			this.updatedetalleParameterGeneral=new UpdateDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.updatedetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(UpdateDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UpdateDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.updatedetalleSessionBean.getEsGuardarRelacionado(),this.updatedetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UpdateDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.updatedetalleSessionBean.getEsGuardarRelacionado(),this.updatedetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaDuplicarUpdateDetalle=true;
			this.isVisibilidadCeldaCopiarUpdateDetalle=true;
			this.isVisibilidadCeldaVerFormUpdateDetalle=true;
			this.isVisibilidadCeldaOrdenUpdateDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdUpdate=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUpdateDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUpdateDetalle(false);
			
			this.setPermisosUsuarioUpdateDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.updatedetalleSessionBean.getEsGuardarRelacionado() && this.updatedetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUpdateDetalleClasesRelacionadas();
			}
			
			if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUpdateDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUpdateDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUpdateDetalle();
			}
			
			if(!this.isPermisoBusquedaUpdateDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioUpdateDetalle,this.isPermisoPaginacionMedioUpdateDetalle,this.isPermisoPaginacionTodoUpdateDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UpdateDetalleConstantesFunciones.getTiposSeleccionarUpdateDetalle());
				
				this.tiposColumnasSelect=UpdateDetalleConstantesFunciones.getTiposSeleccionarUpdateDetalle(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUpdateDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioUpdateDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioUpdateDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdateDetalle() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.updateLogic=new UpdateLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				updatedetalleImplementable= (UpdateDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UpdateDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				updatedetalleImplementableHome= (UpdateDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UpdateDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.updatedetalles= new ArrayList<UpdateDetalle>();
			this.updatedetallesEliminados= new ArrayList<UpdateDetalle>();
						
			this.isEsNuevoUpdateDetalle=false;
			this.esParaAccionDesdeFormularioUpdateDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.updatesForeignKey=new ArrayList<Update>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUpdateDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUpdateDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UpdateDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UpdateDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUpdateDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUpdateDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUpdateDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUpdateDetalle();
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUpdateDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUpdateDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUpdateDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUpdateDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UpdateDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUpdateDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUpdateDetalle")) {
				iIndex=this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUpdateDetalle();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyUpdateDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUpdateDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUpdateDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUpdateDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUpdateDetalle();
		
		this.cargarCombosFrameForeignKeyUpdateDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUpdateDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUpdateDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyUpdate(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUpdateListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUpdate();
				this.cargarCombosFrameUpdatesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUpdate(this.updatesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoUpdateDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			
			if(jTableDatosUpdateDetalle.getRowCount()>=1) {
				jTableDatosUpdateDetalle.removeRowSelectionInterval(0, jTableDatosUpdateDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoUpdateDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUpdateDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUpdateDetalle(true);			
			//this.updatedetalle=new UpdateDetalle();
			//this.updatedetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdateDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdateDetalle() ;
			
			if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdateDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.updatedetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);				
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UpdateDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUpdateDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUpdateDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUpdateDetalle.getSelectedRows().length;			
			}
			
			updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUpdateDetalle--;			
				//UpdateDetalle updatedetalleAux= new UpdateDetalle();			
				//updatedetalleAux.setId(this.iIdNuevoUpdateDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UpdateDetalle updatedetalleOrigen=new UpdateDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UpdateDetalle updatedetalleOrigen : updatedetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							updatedetalleOrigen =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							updatedetalleOrigen =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUpdateDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.updatedetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUpdateDetalle(updatedetalleOrigen,this.updatedetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.updatedetalleLogic.getUpdateDetalles().add(this.updatedetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.updatedetalles.add(this.updatedetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
				
				this.jTableDatosUpdateDetalle.setRowSelectionInterval(this.getIndiceNuevoUpdateDetalle(), this.getIndiceNuevoUpdateDetalle());
				
				int iLastRow =  this.jTableDatosUpdateDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUpdateDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUpdateDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdateDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();									
		
			UpdateDetalle updatedetalleOrigen=new UpdateDetalle();
			UpdateDetalle updatedetalleDestino=new UpdateDetalle();
				
			updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUpdateDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || updatedetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUpdateDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleOrigen =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						updatedetalleOrigen =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						updatedetalleDestino =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						updatedetalleDestino =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				updatedetalleOrigen =updatedetallesSeleccionados.get(0);
				updatedetalleDestino =updatedetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUpdateDetalle(updatedetalleOrigen,updatedetalleDestino,true,false);
				
				updatedetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(updatedetalleDestino,updatedetalleLogic.getUpdateDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(updatedetalleDestino,updatedetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
				
				//this.jTableDatosUpdateDetalle.setRowSelectionInterval(this.getIndiceNuevoUpdateDetalle(), this.getIndiceNuevoUpdateDetalle());
				
				int iLastRow =  this.jTableDatosUpdateDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUpdateDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUpdateDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdateDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUpdateDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUpdateDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUpdateDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUpdateDetalle.setVisible(!isVisible);
			this.jPanelPaginacionUpdateDetalle.setVisible(!isVisible);
			this.jPanelAccionesUpdateDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUpdateDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUpdateDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUpdateDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUpdateDetalle();
			
			this.abrirFrameOrderByUpdateDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUpdateDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUpdateDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUpdateDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUpdateDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormUpdateDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUpdateDetalle.setSize(this.jInternalFrameDetalleFormUpdateDetalle.iWidthFormulario,this.jInternalFrameDetalleFormUpdateDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUpdateDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUpdateDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUpdateDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormUpdateDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUpdateDetalle.jContentPaneDetalleUpdateDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUpdateDetalle.jContentPaneDetalleUpdateDetalle.getWidth(),UpdateDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUpdateDetalle.jContentPaneDetalleUpdateDetalle.getWidth(),UpdateDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUpdateDetalle.jContentPaneDetalleUpdateDetalle.getWidth(),UpdateDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUpdateDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormUpdateDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUpdateDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUpdateDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUpdateDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdateDetalle,false,this);
				} else {
					this.jInternalFrameOrderByUpdateDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUpdateDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUpdateDetalle);
				this.jInternalFrameOrderByUpdateDetalle.setVisible(false);
				this.jInternalFrameOrderByUpdateDetalle.setSelected(false);
				
				this.jInternalFrameOrderByUpdateDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUpdateDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByUpdateDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUpdateDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUpdateDetalle==null) {
				
				this.jInternalFrameImportacionUpdateDetalle=new ImportacionJInternalFrame(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUpdateDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUpdateDetalle);
				this.jInternalFrameImportacionUpdateDetalle.setVisible(false);
				this.jInternalFrameImportacionUpdateDetalle.setSelected(false);


				this.jInternalFrameImportacionUpdateDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUpdateDetalle"));
				this.jInternalFrameImportacionUpdateDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUpdateDetalle"));
				this.jInternalFrameImportacionUpdateDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUpdateDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUpdateDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUpdateDetalle==null) {
				this.jInternalFrameReporteDinamicoUpdateDetalle=new ReporteDinamicoJInternalFrame(UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUpdateDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUpdateDetalle);
				this.jInternalFrameReporteDinamicoUpdateDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoUpdateDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdateDetalle"));
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdateDetalle"));
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdateDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdateDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUpdateDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUpdateDetalle);
			
	       	this.jInternalFrameDetalleFormUpdateDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormUpdateDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormUpdateDetalle.dispose();
			//this.jInternalFrameDetalleFormUpdateDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUpdateDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUpdateDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoUpdateDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUpdateDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUpdateDetalle.setVisible(true);
	        this.jInternalFrameImportacionUpdateDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUpdateDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUpdateDetalle.setVisible(true);
	        this.jInternalFrameOrderByUpdateDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUpdateDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUpdateDetalle.setVisible(false);
	        this.jInternalFrameOrderByUpdateDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUpdateDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUpdateDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoUpdateDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUpdateDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUpdateDetalle.setVisible(false);
	        this.jInternalFrameImportacionUpdateDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUpdateDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUpdateDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUpdateDetalle(true);
			//this.isEsNuevoUpdateDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUpdateDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdateDetalle(false) ;
			
			if(updatedetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdateDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdateDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUpdateDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUpdateDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUpdateDetalle(true);
			//this.isEsNuevoUpdateDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.updatedetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUpdateDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUpdateDetalle(false) ;
			
			if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUpdateDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdateDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaUpdate(List<Update> updatesForeignKey)throws Exception{
		TableColumn tableColumnUpdate=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDUPDATE));
		TableCellEditor tableCellEditorUpdate =tableColumnUpdate.getCellEditor();

		UpdateTableCell updateTableCellFk=(UpdateTableCell)tableCellEditorUpdate;

		if(updateTableCellFk!=null) {
			updateTableCellFk.setupdatesForeignKey(updatesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUpdateDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//updateTableCellFk.setRowActual(intSelectedRow);
			//updateTableCellFk.setupdatesForeignKeyActual(updatesForeignKey);
		//}


		if(updateTableCellFk!=null) {
			updateTableCellFk.RecargarUpdatesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUpdateDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosUpdateDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUpdateDetalle(false);
			
			//if(!this.isEsNuevoUpdateDetalle) {								
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				
			}
			
			if(this.permiteMantenimiento(this.updatedetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUpdateDetalle=true;
					this.inicializarActualizarBindingTablaUpdateDetalle(false);
					this.isEsNuevoUpdateDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUpdateDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUpdateDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUpdateDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdateDetalle(false);
				
				this.habilitarDeshabilitarControlesUpdateDetalle(false);
			
												
				
				if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUpdateDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUpdateDetalleActionPerformed(evt,updatedetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUpdateDetalle(this.updatedetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUpdateDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,updatedetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.updatedetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				this.updatedetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				this.updatedetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.updatedetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UpdateDetalleModel) this.jTableDatosUpdateDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUpdateDetalle=true;
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
				this.isEsNuevoUpdateDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUpdateDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdateDetalle(false);
				
				this.habilitarDeshabilitarControlesUpdateDetalle(false);
				
				
				
				if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUpdateDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUpdateDetalle.getRowCount()>=1) {
				jTableDatosUpdateDetalle.removeRowSelectionInterval(0, jTableDatosUpdateDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUpdateDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUpdateDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUpdateDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUpdateDetalle(false) ;
			
			this.isEsNuevoUpdateDetalle=false;
			
			if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUpdateDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUpdateDetalle(false);
				
				//SI ES MANUAL
				if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUpdateDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUpdateDetalle--;			
			//UpdateDetalle updatedetalleAux= new UpdateDetalle();			
			//updatedetalleAux.setId(this.iIdNuevoUpdateDetalle);
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUpdateDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
			
			this.updatedetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.updatedetalleLogic.getUpdateDetalles().add(this.updatedetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.updatedetalles.add(this.updatedetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUpdateDetalle(false);
			
			this.jTableDatosUpdateDetalle.setRowSelectionInterval(this.getIndiceNuevoUpdateDetalle(), this.getIndiceNuevoUpdateDetalle());
			
			int iLastRow =  this.jTableDatosUpdateDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUpdateDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUpdateDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdateDetalle(false);
			
			//SI ES MANUAL
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdateDetalle();
			}
			
			//this.abrirFrameTreeUpdateDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Update DetalleS ?", "MANTENIMIENTO DE Update Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionUpdateDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralUpdateDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.updatedetalleReturnGeneral=updatedetalleLogic.procesarImportacionUpdateDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.updatedetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarUpdateDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUpdateDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUpdateDetalle.setFileImportacion(this.jInternalFrameImportacionUpdateDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUpdateDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUpdateDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUpdateDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUpdateDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		

		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UpdateDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UpdateDetalleBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UpdateDetalleConstantesFunciones.LABEL_IDUPDATE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Update_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Update_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Update_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Update_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProceso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProceso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProceso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProceso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_eryResumen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_eryResumen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_eryResumen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_eryResumen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroIntento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroIntento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroIntento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroIntento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaArchivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaArchivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaArchivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaArchivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_ORDEN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_den_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_den_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_den_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_den_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_EJECUTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecutado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecutado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecutado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecutado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoUpdateDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UpdateDetalleConstantesFunciones.LABEL_IDUPDATE:
					sNombreCampoCategoria="id_update";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO:
					sNombreCampoCategoria="codigo_proceso";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN:
					sNombreCampoCategoria="query_resumen";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO:
					sNombreCampoCategoria="numero_intento";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO:
					sNombreCampoCategoria="fecha_archivo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoria="orden";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_EJECUTADO:
					sNombreCampoCategoria="ejecutado";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UpdateDetalleConstantesFunciones.LABEL_IDUPDATE:
					sNombreCampoCategoriaValor="id_update";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO:
					sNombreCampoCategoriaValor="codigo_proceso";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN:
					sNombreCampoCategoriaValor="query_resumen";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO:
					sNombreCampoCategoriaValor="numero_intento";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO:
					sNombreCampoCategoriaValor="fecha_archivo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ORDEN:
					sNombreCampoCategoriaValor="orden";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_EJECUTADO:
					sNombreCampoCategoriaValor="ejecutado";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;

				case UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UpdateDetalleConstantesFunciones.LABEL_IDUPDATE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Update",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_update");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Proceso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_proceso");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Query Resumen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"query_resumen");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Intento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_intento");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Archivo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_archivo");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ORDEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden",sNombreCampoCategoria,sNombreCampoCategoriaValor,"orden");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_EJECUTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejecutado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ejecutado");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
					break;

				case UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("UpdateDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UpdateDetalleConstantesFunciones.LABEL_IDUPDATE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getupdate_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getcodigo_proceso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getquery_resumen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getnumero_intento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getfecha_archivo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ORDEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ORDEN);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getorden());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_EJECUTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getejecutado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getesta_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(UpdateDetalle updatedetalle:updatedetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(updatedetalle.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelUpdateDetalle(row);				
			//	iRow++;
			//}				
			
			//for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUpdateDetalle(updatedetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdateDetalle(false);
			
			//SI ES MANUAL
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUpdateDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdateDetalle(false);
			
			//SI ES MANUAL
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUpdateDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUpdateDetalle(false);
			
			//SI ES MANUAL
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUpdateDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUpdateDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUpdateDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUpdateDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUpdateDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUpdateDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUpdateDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosUpdateDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosUpdateDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUpdateDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUpdateDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUpdateDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUpdateDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUpdateDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUpdateDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdateDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUpdateDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUpdateDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUpdateDetalle();
		
		this.inicializarActualizarBindingBotonesManualUpdateDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUpdateDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUpdateDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUpdateDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUpdateDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUpdateDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUpdateDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUpdateDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionNuevoUpdateDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionSinCerrarUpdateDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionSinMensajeUpdateDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUpdateDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUpdateDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUpdateDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
				this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionNuevoUpdateDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionSinCerrarUpdateDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxPostAccionSinMensajeUpdateDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUpdateDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUpdateDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUpdateDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUpdateDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUpdateDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUpdateDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUpdateDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUpdateDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUpdateDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUpdateDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUpdateDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUpdateDetalle() throws Exception {
		try	{
			if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUpdateDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUpdateDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUpdateDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUpdateDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUpdateDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUpdateDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUpdateDetalle.addItem(reporte);
			}
			
			
			if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUpdateDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUpdateDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUpdateDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUpdateDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUpdateDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUpdateDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUpdateDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdateDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUpdateDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUpdateDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUpdateDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUpdateDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioUpdateDetalle.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioUpdateDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesUpdateDetalle.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesUpdateDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.getSelectedItem()!=null){this.id_updateFK_IdUpdate=((Update)this.jComboBoxid_updateFK_IdUpdateUpdateDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUpdateDetalle(Boolean esInicializar) throws Exception {				
		if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUpdateDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUpdateDetalle() throws Exception {
		this.inicializarActualizarBindingTablaUpdateDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUpdateDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUpdateDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUpdateDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=updatedetalleLogic.getUpdateDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=updatedetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUpdateDetalle.setModel(new UpdateDetalleModel(this.updatedetalleLogic.getUpdateDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUpdateDetalle.setModel(new UpdateDetalleModel(this.updatedetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUpdateDetalle!=null && this.jInternalFrameOrderByUpdateDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUpdateDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,updatedetalleConstantesFunciones.resaltarSeleccionarUpdateDetalle,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UpdateDetalleConstantesFunciones.SCLASSWEBTITULO,updatedetalleConstantesFunciones.resaltarSeleccionarUpdateDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_ID));

		if(this.updatedetalleConstantesFunciones.mostraridUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updatedetalleConstantesFunciones.resaltaridUpdateDetalle,this.updatedetalleConstantesFunciones.activaridUpdateDetalle,this,true,"idUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltaridUpdateDetalle,this.updatedetalleConstantesFunciones.activaridUpdateDetalle,this,true,"idUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDUPDATE));

		if(this.updatedetalleConstantesFunciones.mostrarid_updateUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_IDUPDATE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UpdateTableCell(this.updatesForeignKey,this.updatedetalleConstantesFunciones.resaltarid_updateUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_updateUpdateDetalle));
			tableColumn.setCellEditor(new UpdateTableCell(this.updatesForeignKey,this.updatedetalleConstantesFunciones.resaltarid_updateUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_updateUpdateDetalle,true,"id_updateUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDANIO));

		if(this.updatedetalleConstantesFunciones.mostrarid_anioUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.updatedetalleConstantesFunciones.resaltarid_anioUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_anioUpdateDetalle));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.updatedetalleConstantesFunciones.resaltarid_anioUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_anioUpdateDetalle,true,"id_anioUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_IDMES));

		if(this.updatedetalleConstantesFunciones.mostrarid_mesUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.updatedetalleConstantesFunciones.resaltarid_mesUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_mesUpdateDetalle));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.updatedetalleConstantesFunciones.resaltarid_mesUpdateDetalle,this,this.updatedetalleConstantesFunciones.activarid_mesUpdateDetalle,true,"id_mesUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_CODIGO));

		if(this.updatedetalleConstantesFunciones.mostrarcodigoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updatedetalleConstantesFunciones.resaltarcodigoUpdateDetalle,this.updatedetalleConstantesFunciones.activarcodigoUpdateDetalle,this,true,"codigoUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltarcodigoUpdateDetalle,this.updatedetalleConstantesFunciones.activarcodigoUpdateDetalle,this,true,"codigoUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO));

		if(this.updatedetalleConstantesFunciones.mostrarcodigo_procesoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updatedetalleConstantesFunciones.resaltarcodigo_procesoUpdateDetalle,this.updatedetalleConstantesFunciones.activarcodigo_procesoUpdateDetalle,this,true,"codigo_procesoUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltarcodigo_procesoUpdateDetalle,this.updatedetalleConstantesFunciones.activarcodigo_procesoUpdateDetalle,this,true,"codigo_procesoUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN));

		if(this.updatedetalleConstantesFunciones.mostrarquery_resumenUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updatedetalleConstantesFunciones.resaltarquery_resumenUpdateDetalle,this.updatedetalleConstantesFunciones.activarquery_resumenUpdateDetalle,this,true,"query_resumenUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltarquery_resumenUpdateDetalle,this.updatedetalleConstantesFunciones.activarquery_resumenUpdateDetalle,this,true,"query_resumenUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO));

		if(this.updatedetalleConstantesFunciones.mostrarnumero_intentoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updatedetalleConstantesFunciones.resaltarnumero_intentoUpdateDetalle,this.updatedetalleConstantesFunciones.activarnumero_intentoUpdateDetalle,this,true,"numero_intentoUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltarnumero_intentoUpdateDetalle,this.updatedetalleConstantesFunciones.activarnumero_intentoUpdateDetalle,this,true,"numero_intentoUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO));

		if(this.updatedetalleConstantesFunciones.mostrarfecha_archivoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.updatedetalleConstantesFunciones.resaltarfecha_archivoUpdateDetalle,this.updatedetalleConstantesFunciones.activarfecha_archivoUpdateDetalle,this,true,"fecha_archivoUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.updatedetalleConstantesFunciones.resaltarfecha_archivoUpdateDetalle,this.updatedetalleConstantesFunciones.activarfecha_archivoUpdateDetalle,this,true,"fecha_archivoUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_FECHA));

		if(this.updatedetalleConstantesFunciones.mostrarfechaUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.updatedetalleConstantesFunciones.resaltarfechaUpdateDetalle,this.updatedetalleConstantesFunciones.activarfechaUpdateDetalle,this,true,"fechaUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.updatedetalleConstantesFunciones.resaltarfechaUpdateDetalle,this.updatedetalleConstantesFunciones.activarfechaUpdateDetalle,this,true,"fechaUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_ORDEN));

		if(this.updatedetalleConstantesFunciones.mostrarordenUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_ORDEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.updatedetalleConstantesFunciones.resaltarordenUpdateDetalle,this.updatedetalleConstantesFunciones.activarordenUpdateDetalle,this,true,"ordenUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltarordenUpdateDetalle,this.updatedetalleConstantesFunciones.activarordenUpdateDetalle,this,true,"ordenUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_EJECUTADO));

		if(this.updatedetalleConstantesFunciones.mostrarejecutadoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_EJECUTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.updatedetalleConstantesFunciones.resaltarejecutadoUpdateDetalle,this.updatedetalleConstantesFunciones.activarejecutadoUpdateDetalle));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.updatedetalleConstantesFunciones.resaltarejecutadoUpdateDetalle,this.updatedetalleConstantesFunciones.activarejecutadoUpdateDetalle,this,true,"ejecutadoUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.updatedetalleConstantesFunciones.mostraresta_activoUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.updatedetalleConstantesFunciones.resaltaresta_activoUpdateDetalle,this.updatedetalleConstantesFunciones.activaresta_activoUpdateDetalle));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.updatedetalleConstantesFunciones.resaltaresta_activoUpdateDetalle,this.updatedetalleConstantesFunciones.activaresta_activoUpdateDetalle,this,true,"esta_activoUpdateDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION));

		if(this.updatedetalleConstantesFunciones.mostrardescripcionUpdateDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.updatedetalleConstantesFunciones.resaltardescripcionUpdateDetalle,this.updatedetalleConstantesFunciones.activardescripcionUpdateDetalle,this,true,"descripcionUpdateDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.updatedetalleConstantesFunciones.resaltardescripcionUpdateDetalle,this.updatedetalleConstantesFunciones.activardescripcionUpdateDetalle,this,true,"descripcionUpdateDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UpdateDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUpdateDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUpdateDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.updatedetalleSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUpdateDetalle.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosUpdateDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUpdateDetalle.moveColumn(this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUpdateDetalle.moveColumn(this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUpdateDetalle.moveColumn(this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUpdateDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUpdateDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUpdateDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUpdateDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUpdateDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUpdateDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUpdateDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUpdateDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=updatedetalleLogic.getUpdateDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=updatedetalles.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosUpdateDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUpdateDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUpdateDetalle();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoUpdateDetalle=false;
					
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
				if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUpdateDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUpdateDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUpdateDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.updatedetalle.getsType().equals("DUPLICADO")
				   || this.updatedetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUpdateDetalle=true;
				
				} else {
					this.isEsNuevoUpdateDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.updatedetalle.getId()>=0 && !this.updatedetalle.getIsNew()) {						
						this.isEsNuevoUpdateDetalle=false;
						
					} else {
						this.isEsNuevoUpdateDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUpdateDetalle(esRelaciones);						
				
				this.seleccionarUpdateDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.updatedetalle.getId()<0) {
					this.isEsNuevoUpdateDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUpdateDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUpdateDetalle(evt,rowIndex);
				}	
				
				if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UpdateDetalle: " + this.dDif); 
					}
				}								
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUpdateDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.updatedetalle)) {
					if(this.updatedetalle.getId()>0) {
						this.updatedetalle.setIsDeleted(true);
						
						this.updatedetallesEliminados.add(this.updatedetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.updatedetalleLogic.getUpdateDetalles().remove(this.updatedetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.updatedetalles.remove(this.updatedetalle);				
					}
					
					
					((UpdateDetalleModel) this.jTableDatosUpdateDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUpdateDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUpdateDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUpdateDetalle) {
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUpdateDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUpdateDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUpdateDetalle(this.updatedetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//Update
					if(!this.updatedetalleConstantesFunciones.cargarid_updateUpdateDetalle || this.updatedetalleConstantesFunciones.event_dependid_updateUpdateDetalle) {
						//this.cargarCombosUpdatesForeignKeyLista(" where id="+this.updatedetalle.getid_update());
									//this.inicializarActualizarBindingUpdateDetalle(false,false);
						this.updatesForeignKey=new ArrayList<Update>();

						if(updatedetalle.getUpdate()!=null) {
							this.updatesForeignKey.add(updatedetalle.getUpdate());
						}

						this.addItemDefectoCombosForeignKeyUpdate();
						this.cargarCombosFrameUpdatesForeignKey("Todos");
					}
					this.setActualUpdateForeignKey(this.updatedetalle.getid_update(),false,"Formulario");

					//Anio
					if(!this.updatedetalleConstantesFunciones.cargarid_anioUpdateDetalle || this.updatedetalleConstantesFunciones.event_dependid_anioUpdateDetalle) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.updatedetalle.getid_anio());
									//this.inicializarActualizarBindingUpdateDetalle(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(updatedetalle.getAnio()!=null) {
							this.aniosForeignKey.add(updatedetalle.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.updatedetalle.getid_anio(),false,"Formulario");

					//Mes
					if(!this.updatedetalleConstantesFunciones.cargarid_mesUpdateDetalle || this.updatedetalleConstantesFunciones.event_dependid_mesUpdateDetalle) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.updatedetalle.getid_mes());
									//this.inicializarActualizarBindingUpdateDetalle(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(updatedetalle.getMes()!=null) {
							this.messForeignKey.add(updatedetalle.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.updatedetalle.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUpdateDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUpdateDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUpdateDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUpdateDetalle(UpdateDetalle updatedetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUpdateDetalle(updatedetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUpdateDetalle(UpdateDetalle updatedetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUpdateDetalle(updatedetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUpdateDetalle(updatedetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUpdateDetalle(updatedetalle);
	}
	
	public void setVariablesObjetoActualToFormularioUpdateDetalle(UpdateDetalle updatedetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setText(updatedetalle.getId().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setText(updatedetalle.getcodigo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setText(updatedetalle.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setText(updatedetalle.getquery_resumen());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setText(updatedetalle.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setDate(updatedetalle.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setDate(updatedetalle.getfecha());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setText(updatedetalle.getorden().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setSelected(updatedetalle.getejecutado());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setSelected(updatedetalle.getesta_activo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setText(updatedetalle.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UpdateDetalle updatedetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,updatedetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UpdateDetalle updatedetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				updatedetalleLocal=this.updatedetalle;
			} else {
				updatedetalleLocal=this.updatedetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(updatedetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUpdateDetalle(updatedetalleLocal,true);
					
					if(updatedetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(updatedetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(updatedetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUpdateDetalle(UpdateDetalle updatedetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUpdateDetalle(updatedetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(updatedetalle);
	}
	
	public void setVariablesFormularioToObjetoActualUpdateDetalle(UpdateDetalle updatedetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUpdateDetalle(updatedetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUpdateDetalle(UpdateDetalle updatedetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.getText()==null || this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.getText()=="" || this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setText("0");
			}

			if(conColumnasBase) {updatedetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelIdUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setcodigo(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setcodigo_proceso(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelcodigo_procesoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setquery_resumen(this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelquery_resumenUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setnumero_intento(Integer.parseInt(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelnumero_intentoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setfecha_archivo(this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfecha_archivoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setfecha(this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelfechaUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setorden(Integer.parseInt(this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_ORDEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelordenUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setejecutado(this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_EJECUTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelejecutadoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setesta_activo(this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabelesta_activoUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			updatedetalle.setdescripcion(this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUpdateDetalle.jLabeldescripcionUpdateDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUpdateDetalle(UpdateDetalle updatedetalleBean,UpdateDetalle updatedetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUpdateDetalle(UpdateDetalle updatedetalleOrigen,UpdateDetalle updatedetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && updatedetalleOrigen.getId()!=null && !updatedetalleOrigen.getId().equals(0L))) {updatedetalle.setId(updatedetalleOrigen.getId());}}
			if(conDefault || (!conDefault && updatedetalleOrigen.getcodigo()!=null && !updatedetalleOrigen.getcodigo().equals(""))) {updatedetalle.setcodigo(updatedetalleOrigen.getcodigo());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getcodigo_proceso()!=null && !updatedetalleOrigen.getcodigo_proceso().equals(""))) {updatedetalle.setcodigo_proceso(updatedetalleOrigen.getcodigo_proceso());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getquery_resumen()!=null && !updatedetalleOrigen.getquery_resumen().equals(""))) {updatedetalle.setquery_resumen(updatedetalleOrigen.getquery_resumen());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getnumero_intento()!=null && !updatedetalleOrigen.getnumero_intento().equals(0))) {updatedetalle.setnumero_intento(updatedetalleOrigen.getnumero_intento());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getfecha_archivo()!=null && !updatedetalleOrigen.getfecha_archivo().equals(new Date()))) {updatedetalle.setfecha_archivo(updatedetalleOrigen.getfecha_archivo());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getfecha()!=null && !updatedetalleOrigen.getfecha().equals(new Date()))) {updatedetalle.setfecha(updatedetalleOrigen.getfecha());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getorden()!=null && !updatedetalleOrigen.getorden().equals(0))) {updatedetalle.setorden(updatedetalleOrigen.getorden());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getejecutado()!=null && !updatedetalleOrigen.getejecutado().equals(false))) {updatedetalle.setejecutado(updatedetalleOrigen.getejecutado());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getesta_activo()!=null && !updatedetalleOrigen.getesta_activo().equals(false))) {updatedetalle.setesta_activo(updatedetalleOrigen.getesta_activo());}
			if(conDefault || (!conDefault && updatedetalleOrigen.getdescripcion()!=null && !updatedetalleOrigen.getdescripcion().equals(""))) {updatedetalle.setdescripcion(updatedetalleOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUpdateDetalle(UpdateDetalle updatedetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setText(updatedetalle.getId().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setText(updatedetalle.getcodigo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setText(updatedetalle.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setText(updatedetalle.getquery_resumen());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setText(updatedetalle.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setDate(updatedetalle.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setDate(updatedetalle.getfecha());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setText(updatedetalle.getorden().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setSelected(updatedetalle.getejecutado());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setSelected(updatedetalle.getesta_activo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setText(updatedetalle.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUpdateDetalle(UpdateDetalleBean updatedetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setText(updatedetalleBean.getId().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setText(updatedetalleBean.getcodigo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setText(updatedetalleBean.getcodigo_proceso());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setText(updatedetalleBean.getquery_resumen());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setText(updatedetalleBean.getnumero_intento().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setDate(updatedetalleBean.getfecha_archivo());
			this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setDate(updatedetalleBean.getfecha());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setText(updatedetalleBean.getorden().toString());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setSelected(updatedetalleBean.getejecutado());
			this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setSelected(updatedetalleBean.getesta_activo());
			this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setText(updatedetalleBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUpdateDetalle(UpdateDetalleParameterReturnGeneral updatedetalleReturnGeneral,UpdateDetalleBean updatedetalleBean,Boolean conDefault) throws Exception { 
		try {
			UpdateDetalle updatedetalleLocal=new UpdateDetalle();
			
			updatedetalleLocal=updatedetalleReturnGeneral.getUpdateDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && updatedetalleLocal.getId()!=null && !updatedetalleLocal.getId().equals(0L))) {updatedetalleBean.setId(updatedetalleLocal.getId());}}
			if(conDefault || (!conDefault && updatedetalleLocal.getcodigo()!=null && !updatedetalleLocal.getcodigo().equals(""))) {updatedetalleBean.setcodigo(updatedetalleLocal.getcodigo());}
			if(conDefault || (!conDefault && updatedetalleLocal.getcodigo_proceso()!=null && !updatedetalleLocal.getcodigo_proceso().equals(""))) {updatedetalleBean.setcodigo_proceso(updatedetalleLocal.getcodigo_proceso());}
			if(conDefault || (!conDefault && updatedetalleLocal.getquery_resumen()!=null && !updatedetalleLocal.getquery_resumen().equals(""))) {updatedetalleBean.setquery_resumen(updatedetalleLocal.getquery_resumen());}
			if(conDefault || (!conDefault && updatedetalleLocal.getnumero_intento()!=null && !updatedetalleLocal.getnumero_intento().equals(0))) {updatedetalleBean.setnumero_intento(updatedetalleLocal.getnumero_intento());}
			if(conDefault || (!conDefault && updatedetalleLocal.getfecha_archivo()!=null && !updatedetalleLocal.getfecha_archivo().equals(new Date()))) {updatedetalleBean.setfecha_archivo(updatedetalleLocal.getfecha_archivo());}
			if(conDefault || (!conDefault && updatedetalleLocal.getfecha()!=null && !updatedetalleLocal.getfecha().equals(new Date()))) {updatedetalleBean.setfecha(updatedetalleLocal.getfecha());}
			if(conDefault || (!conDefault && updatedetalleLocal.getorden()!=null && !updatedetalleLocal.getorden().equals(0))) {updatedetalleBean.setorden(updatedetalleLocal.getorden());}
			if(conDefault || (!conDefault && updatedetalleLocal.getejecutado()!=null && !updatedetalleLocal.getejecutado().equals(false))) {updatedetalleBean.setejecutado(updatedetalleLocal.getejecutado());}
			if(conDefault || (!conDefault && updatedetalleLocal.getesta_activo()!=null && !updatedetalleLocal.getesta_activo().equals(false))) {updatedetalleBean.setesta_activo(updatedetalleLocal.getesta_activo());}
			if(conDefault || (!conDefault && updatedetalleLocal.getdescripcion()!=null && !updatedetalleLocal.getdescripcion().equals(""))) {updatedetalleBean.setdescripcion(updatedetalleLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUpdateDetalleGenerico(Long idUpdateDetalleSeleccionado,JComboBox jComboBoxUpdateDetalle,List<UpdateDetalle> updatedetallesLocal)throws Exception {
		try {
			UpdateDetalle  updatedetalleTemp=null;

			for(UpdateDetalle updatedetalleAux:updatedetallesLocal) {
				if(updatedetalleAux.getId()!=null && updatedetalleAux.getId().equals(idUpdateDetalleSeleccionado)) {
					updatedetalleTemp=updatedetalleAux;
					break;
				}
			}

			jComboBoxUpdateDetalle.setSelectedItem(updatedetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUpdateDetalleGenerico(JComboBox jComboBoxUpdateDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUpdateDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUpdateDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUpdateDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUpdateDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUpdateDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUpdateDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			updatedetalle=(UpdateDetalle) updatedetalleLogic.getUpdateDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			updatedetalle =(UpdateDetalle) updatedetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Update")) {
			//sDescripcion=this.getActualUpdateForeignKeyDescripcion((Long)value);
			if(!updatedetalle.getIsNew() && !updatedetalle.getIsChanged() && !updatedetalle.getIsDeleted()) {
				sDescripcion=updatedetalle.getupdate_descripcion();
			} else {
				//sDescripcion=this.getActualUpdateForeignKeyDescripcion((Long)value);
				sDescripcion=updatedetalle.getupdate_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!updatedetalle.getIsNew() && !updatedetalle.getIsChanged() && !updatedetalle.getIsDeleted()) {
				sDescripcion=updatedetalle.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=updatedetalle.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!updatedetalle.getIsNew() && !updatedetalle.getIsChanged() && !updatedetalle.getIsDeleted()) {
				sDescripcion=updatedetalle.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=updatedetalle.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UpdateDetalle updatedetalleRow=new UpdateDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			updatedetalleRow=(UpdateDetalle) updatedetalleLogic.getUpdateDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			updatedetalleRow=(UpdateDetalle) updatedetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUpdateDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle));			
			this.jButtonDuplicarUpdateDetalle.setVisible((this.isVisibilidadCeldaDuplicarUpdateDetalle && this.isPermisoDuplicarUpdateDetalle));			
			this.jButtonCopiarUpdateDetalle.setVisible((this.isVisibilidadCeldaCopiarUpdateDetalle && this.isPermisoCopiarUpdateDetalle));
			this.jButtonVerFormUpdateDetalle.setVisible((this.isVisibilidadCeldaVerFormUpdateDetalle && this.isPermisoVerFormUpdateDetalle));
			
			this.jButtonAbrirOrderByUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));			
			
			this.jButtonNuevoRelacionesUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle && this.isPermisoNuevoUpdateDetalle));			
			this.jButtonNuevoGuardarCambiosUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarUpdateDetalle.setVisible((this.isVisibilidadCeldaModificarUpdateDetalle && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.setVisible((this.isVisibilidadCeldaActualizarUpdateDetalle && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.setVisible((this.isVisibilidadCeldaEliminarUpdateDetalle && this.isPermisoEliminarUpdateDetalle));
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.setVisible(this.isVisibilidadCeldaCancelarUpdateDetalle);							
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle));						
			this.jButtonDuplicarToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaDuplicarUpdateDetalle && this.isPermisoDuplicarUpdateDetalle));						
			this.jButtonCopiarToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaCopiarUpdateDetalle && this.isPermisoCopiarUpdateDetalle));			
			this.jButtonVerFormToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaVerFormUpdateDetalle && this.isPermisoVerFormUpdateDetalle));			
			this.jButtonAbrirOrderByToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));
			this.jButtonNuevoRelacionesToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle && this.isPermisoNuevoUpdateDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));			
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaModificarUpdateDetalle && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaActualizarUpdateDetalle  && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaEliminarUpdateDetalle && this.isPermisoEliminarUpdateDetalle));
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarToolBarUpdateDetalle.setVisible(this.isVisibilidadCeldaCancelarUpdateDetalle);				
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle));			
			this.jMenuItemDuplicarUpdateDetalle.setVisible((this.isVisibilidadCeldaDuplicarUpdateDetalle && this.isPermisoDuplicarUpdateDetalle));			
			this.jMenuItemCopiarUpdateDetalle.setVisible((this.isVisibilidadCeldaCopiarUpdateDetalle && this.isPermisoCopiarUpdateDetalle));			
			this.jMenuItemVerFormUpdateDetalle.setVisible((this.isVisibilidadCeldaVerFormUpdateDetalle && this.isPermisoVerFormUpdateDetalle));			
			this.jMenuItemAbrirOrderByUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));			
			//this.jMenuItemMostrarOcultarUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));
			this.jMenuItemDetalleAbrirOrderByUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));			
			//this.jMenuItemDetalleMostrarOcultarUpdateDetalle.setVisible((this.isVisibilidadCeldaOrdenUpdateDetalle && this.isPermisoOrdenUpdateDetalle));			
			this.jMenuItemNuevoRelacionesUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle && this.isPermisoNuevoUpdateDetalle));			
			this.jMenuItemNuevoGuardarCambiosUpdateDetalle.setVisible((this.isVisibilidadCeldaNuevoUpdateDetalle && this.isPermisoNuevoUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));									
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemModificarUpdateDetalle.setVisible((this.isVisibilidadCeldaModificarUpdateDetalle && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemActualizarUpdateDetalle.setVisible((this.isVisibilidadCeldaActualizarUpdateDetalle && this.isPermisoActualizarUpdateDetalle));	
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemEliminarUpdateDetalle.setVisible((this.isVisibilidadCeldaEliminarUpdateDetalle && this.isPermisoEliminarUpdateDetalle));
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemCancelarUpdateDetalle.setVisible(this.isVisibilidadCeldaCancelarUpdateDetalle);				
			}
			
			this.jMenuItemGuardarCambiosUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));						
			this.jMenuItemGuardarCambiosTablaUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUpdateDetalle=this.jButtonNuevoUpdateDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarUpdateDetalle=this.jButtonDuplicarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaCopiarUpdateDetalle=this.jButtonCopiarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaVerFormUpdateDetalle=this.jButtonVerFormUpdateDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenUpdateDetalle=this.jButtonAbrirOrderByUpdateDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=this.jButtonNuevoRelacionesUpdateDetalle.isVisible();
			this.isVisibilidadCeldaModificarUpdateDetalle=this.jButtonModificarUpdateDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.isVisibilidadCeldaActualizarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaEliminarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaCancelarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaGuardarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=this.jButtonGuardarCambiosTablaUpdateDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUpdateDetalle=this.jButtonNuevoToolBarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=this.jButtonNuevoRelacionesToolBarUpdateDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.isVisibilidadCeldaModificarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarToolBarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaActualizarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarToolBarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaEliminarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarToolBarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaCancelarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarToolBarUpdateDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUpdateDetalle=this.jButtonGuardarCambiosToolBarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=this.jButtonGuardarCambiosTablaToolBarUpdateDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUpdateDetalle=this.jMenuItemNuevoUpdateDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=this.jMenuItemNuevoRelacionesUpdateDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.isVisibilidadCeldaModificarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemModificarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaActualizarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemActualizarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaEliminarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemEliminarUpdateDetalle.isVisible();
			this.isVisibilidadCeldaCancelarUpdateDetalle=this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemCancelarUpdateDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUpdateDetalle=this.jMenuItemGuardarCambiosUpdateDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=this.jMenuItemGuardarCambiosTablaUpdateDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUpdateDetalle(Boolean esInicializar) {
		if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUpdateDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualUpdateDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUpdateDetalle() {
		this.jButtonNuevoUpdateDetalle.setVisible(this.isPermisoNuevoUpdateDetalle);			
		this.jButtonDuplicarUpdateDetalle.setVisible(this.isPermisoDuplicarUpdateDetalle);			
		this.jButtonCopiarUpdateDetalle.setVisible(this.isPermisoCopiarUpdateDetalle);			
		this.jButtonVerFormUpdateDetalle.setVisible(this.isPermisoVerFormUpdateDetalle);			
		
		this.jButtonAbrirOrderByUpdateDetalle.setVisible(this.isPermisoOrdenUpdateDetalle);					
		
		this.jButtonNuevoRelacionesUpdateDetalle.setVisible(this.isPermisoNuevoUpdateDetalle);			
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarUpdateDetalle.setVisible(this.isPermisoActualizarUpdateDetalle);	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.setVisible(this.isPermisoActualizarUpdateDetalle);	
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.setVisible(this.isPermisoEliminarUpdateDetalle);
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.setVisible(this.isVisibilidadCeldaCancelarUpdateDetalle);						
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.setVisible(this.isPermisoGuardarCambiosUpdateDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.setVisible(this.isPermisoActualizarUpdateDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUpdateDetalle() {
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarUpdateDetalle.setVisible(this.isPermisoActualizarUpdateDetalle);	
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.setVisible(this.isPermisoActualizarUpdateDetalle);	
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.setVisible(this.isPermisoEliminarUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.setVisible(this.isVisibilidadCeldaCancelarUpdateDetalle);							
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.setVisible((this.isVisibilidadCeldaGuardarUpdateDetalle && this.isPermisoGuardarCambiosUpdateDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUpdateDetalle() {
		if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUpdateDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUpdateDetalle() {
	}
	
	public void jTableDatosUpdateDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUpdateDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.updatedetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_updateUpdateDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoupdate=true;

			idTienePermisoupdate=this.tienePermisosUsuarioEnPaginaWebUpdateDetalle(UpdateConstantesFunciones.CLASSNAME);

			if(idTienePermisoupdate) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUpdateDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUpdateDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);

				this.updateBeanSwingJInternalFrame=new UpdateBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.updateBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.updateBeanSwingJInternalFrame.getUpdateLogic().setConnexion(this.updatedetalleLogic.getConnexion());

				if(this.updatedetalle.getid_update()!=null) {
					this.updateBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.updateBeanSwingJInternalFrame.setIdActual(this.updatedetalle.getid_update());
					this.updateBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.updateBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.updateBeanSwingJInternalFrame.inicializarActualizarBindingTablaUpdate();
				}

				JInternalFrameBase jinternalFrame =this.updateBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUpdateDetalle=(TitledBorder)this.jScrollPanelDatosUpdateDetalle.getBorder();
				TitledBorder titledBorderupdate=(TitledBorder)this.updateBeanSwingJInternalFrame.jScrollPanelDatosUpdate.getBorder();

				titledBorderupdate.setTitle(titledBorderUpdateDetalle.getTitle() + " -> Update");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_updateUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getid_update()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_update = "+this.updatedetalle.getid_update().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioUpdateDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebUpdateDetalle(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUpdateDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUpdateDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.updatedetalleLogic.getConnexion());

				if(this.updatedetalle.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.updatedetalle.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUpdateDetalle=(TitledBorder)this.jScrollPanelDatosUpdateDetalle.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderUpdateDetalle.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.updatedetalle.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesUpdateDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebUpdateDetalle(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUpdateDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUpdateDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.updatedetalleLogic.getConnexion());

				if(this.updatedetalle.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.updatedetalle.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUpdateDetalle=(TitledBorder)this.jScrollPanelDatosUpdateDetalle.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderUpdateDetalle.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.updatedetalle.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.updatedetalle.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_procesoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getcodigo_proceso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_proceso like '%"+this.updatedetalle.getcodigo_proceso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonquery_resumenUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getquery_resumen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where query_resumen like '%"+this.updatedetalle.getquery_resumen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_intentoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getnumero_intento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_intento = "+this.updatedetalle.getnumero_intento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_archivoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getfecha_archivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_archivo = '"+Funciones2.getStringPostgresDate(this.updatedetalle.getfecha_archivo())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.updatedetalle.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonordenUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getorden()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where orden = "+this.updatedetalle.getorden().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonejecutadoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getejecutado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ejecutado = "+this.updatedetalle.getejecutado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.updatedetalle.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionUpdateDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.getupdatedetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.updatedetalle==null) {
						this.updatedetalle = new UpdateDetalle();
					}

					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);
				}

				if(this.updatedetalle.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.updatedetalle.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUpdateDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUpdateDetalle(false,false);

			this.getUpdateDetallesFK_IdAnio();

			this.inicializarActualizarBindingUpdateDetalle(false);

			//if(UpdateDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUpdateDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUpdateDetalle(false,false);

			this.getUpdateDetallesFK_IdMes();

			this.inicializarActualizarBindingUpdateDetalle(false);

			//if(UpdateDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUpdateDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUpdateUpdateDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUpdateDetalle(false,false);

			this.getUpdateDetallesFK_IdUpdate();

			this.inicializarActualizarBindingUpdateDetalle(false);

			//if(UpdateDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUpdateDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.updatedetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUpdateDetalle() {
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
			this.jInternalFrameDetalleFormUpdateDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormUpdateDetalle.dispose();
			this.jInternalFrameDetalleFormUpdateDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
			this.jInternalFrameReporteDinamicoUpdateDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUpdateDetalle.dispose();
			this.jInternalFrameReporteDinamicoUpdateDetalle=null;
		}
		
		if(this.jInternalFrameImportacionUpdateDetalle!=null) {
			this.jInternalFrameImportacionUpdateDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionUpdateDetalle.dispose();
			this.jInternalFrameImportacionUpdateDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUpdateDetalle();
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUpdateDetalle")) {
				jButtonDuplicarUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUpdateDetalle")) {
				jButtonCopiarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormUpdateDetalle")) {
				jButtonVerFormUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUpdateDetalle")) {
				jButtonDuplicarUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUpdateDetalle")) {
				jButtonDuplicarUpdateDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUpdateDetalle")) {
				jButtonModificarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUpdateDetalle")) {
				jButtonModificarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUpdateDetalle")) {
				jButtonModificarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUpdateDetalle")) {
				jButtonActualizarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUpdateDetalle")) {
				jButtonActualizarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUpdateDetalle")) {
				jButtonActualizarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarUpdateDetalle")) {
				jButtonEliminarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUpdateDetalle")) {
				jButtonEliminarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUpdateDetalle")) {
				jButtonEliminarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarUpdateDetalle")) {
				jButtonCancelarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUpdateDetalle")) {
				jButtonCancelarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUpdateDetalle")) {
				jButtonCancelarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarUpdateDetalle")) {
				jButtonCerrarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUpdateDetalle")) {
				jButtonCerrarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUpdateDetalle")) {
				jButtonCerrarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUpdateDetalle")) {
				jButtonMostrarOcultarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUpdateDetalle")) {
				jButtonCancelarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUpdateDetalle")) {
				jButtonCopiarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUpdateDetalle")) {
				jButtonVerFormUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUpdateDetalle")) {
				jButtonCopiarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUpdateDetalle")) {
				jButtonVerFormUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUpdateDetalle")) {
				jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUpdateDetalle")) {
				jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUpdateDetalle")) {
				jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUpdateDetalle")) {
				jButtonAnterioresUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUpdateDetalle")) {
				jButtonAnterioresUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUpdateDetalle")) {
				jButtonAnterioresUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUpdateDetalle")) {
				jButtonSiguientesUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUpdateDetalle")) {
				jButtonSiguientesUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUpdateDetalle")) {
				jButtonSiguientesUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUpdateDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByUpdateDetalle")) {
				jButtonAbrirOrderByUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUpdateDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarUpdateDetalle")) {
				jButtonMostrarOcultarUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUpdateDetalle")) {
				jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUpdateDetalle")) {
				jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUpdateDetalle")) {
				jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUpdateDetalle")) {
				jButtonCerrarReporteDinamicoUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUpdateDetalle")) {
				jButtonGenerarReporteDinamicoUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUpdateDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUpdateDetalle")) {
				jButtonCerrarImportacionUpdateDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUpdateDetalle")) {
				
				jButtonGenerarImportacionUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUpdateDetalle")) {
				
				jButtonAbrirImportacionUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUpdateDetalle")) {
				jComboBoxTiposAccionesUpdateDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUpdateDetalle")) {
				jComboBoxTiposRelacionesUpdateDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUpdateDetalle")) {
				jComboBoxTiposAccionesUpdateDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUpdateDetalle")) {
				
				jComboBoxTiposSeleccionarUpdateDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUpdateDetalle")) {
				jTextFieldValorCampoGeneralUpdateDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUpdateDetalle")) {
				jButtonAbrirOrderByUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUpdateDetalle")) {
				jButtonAbrirOrderByUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUpdateDetalle")) {
				jButtonCerrarOrderByUpdateDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUpdateDetalleBusqueda")) {
				this.jButtonidUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_updateUpdateDetalleUpdate")) {
				this.jButtonid_updateUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_updateUpdateDetalleBusqueda")) {
				this.jButtonid_updateUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUpdateDetalleUpdate")) {
				this.jButtonid_anioUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUpdateDetalleBusqueda")) {
				this.jButtonid_anioUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesUpdateDetalleUpdate")) {
				this.jButtonid_mesUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesUpdateDetalleBusqueda")) {
				this.jButtonid_mesUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoUpdateDetalleBusqueda")) {
				this.jButtoncodigoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_procesoUpdateDetalleBusqueda")) {
				this.jButtoncodigo_procesoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("query_resumenUpdateDetalleBusqueda")) {
				this.jButtonquery_resumenUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentoUpdateDetalleBusqueda")) {
				this.jButtonnumero_intentoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_archivoUpdateDetalleBusqueda")) {
				this.jButtonfecha_archivoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaUpdateDetalleBusqueda")) {
				this.jButtonfechaUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUpdateDetalleBusqueda")) {
				this.jButtonordenUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecutadoUpdateDetalleBusqueda")) {
				this.jButtonejecutadoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoUpdateDetalleBusqueda")) {
				this.jButtonesta_activoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionUpdateDetalleBusqueda")) {
				this.jButtondescripcionUpdateDetalleBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioUpdateDetalle")) {
				this.jButtonFK_IdAnioUpdateDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesUpdateDetalle")) {
				this.jButtonFK_IdMesUpdateDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUpdateUpdateDetalle")) {
				this.jButtonFK_IdUpdateUpdateDetalleActionPerformed(evt);
			}
			
			;
			
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUpdateDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UpdateDetalle updatedetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				updatedetalleLocal=this.updatedetalle;
			} else {
				updatedetalleLocal=this.updatedetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
							
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
								
						
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
								
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
							
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
								
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUpdateDetalle")) {
					jCheckBoxSeleccionarTodosUpdateDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUpdateDetalle")) {
					jCheckBoxSeleccionadosUpdateDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUpdateDetalle")) {
					
				}
				
				


				
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
												
				
				


				
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUpdateDetalleActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.updatedetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.updatedetalle);
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UpdateDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UpdateDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUpdateDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.updatedetalleAnterior =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUpdateDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUpdateDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUpdateDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.updatedetalle =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.updatedetalle =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.updatedetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUpdateDetalle")) {
				
				}
				
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUpdateDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUpdateDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUpdateDetalle")) {
			
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUpdateDetalle();
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			if(sTipo.equals("NuevoUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUpdateDetalle")) {
				jButtonDuplicarUpdateDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUpdateDetalle")) {
				jButtonCopiarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUpdateDetalle")) {
				jButtonVerFormUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUpdateDetalle")) {
				jButtonNuevoUpdateDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUpdateDetalle")) {
				jButtonModificarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUpdateDetalle")) {
				jButtonActualizarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUpdateDetalle")) {
				jButtonEliminarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUpdateDetalle")) {
				jButtonCancelarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUpdateDetalle")) {
				jButtonCerrarUpdateDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUpdateDetalle")) {
				jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUpdateDetalle")) {
				jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUpdateDetalle")) {
				jButtonAbrirOrderByUpdateDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUpdateDetalle")) {
				jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUpdateDetalle")) {
				jButtonAnterioresUpdateDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUpdateDetalle")) {
				jButtonSiguientesUpdateDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUpdateDetalleBusqueda")) {
				this.jButtonidUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_updateUpdateDetalleUpdate")) {
				this.jButtonid_updateUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_updateUpdateDetalleBusqueda")) {
				this.jButtonid_updateUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioUpdateDetalleUpdate")) {
				this.jButtonid_anioUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioUpdateDetalleBusqueda")) {
				this.jButtonid_anioUpdateDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesUpdateDetalleUpdate")) {
				this.jButtonid_mesUpdateDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesUpdateDetalleBusqueda")) {
				this.jButtonid_mesUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoUpdateDetalleBusqueda")) {
				this.jButtoncodigoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_procesoUpdateDetalleBusqueda")) {
				this.jButtoncodigo_procesoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("query_resumenUpdateDetalleBusqueda")) {
				this.jButtonquery_resumenUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_intentoUpdateDetalleBusqueda")) {
				this.jButtonnumero_intentoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_archivoUpdateDetalleBusqueda")) {
				this.jButtonfecha_archivoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaUpdateDetalleBusqueda")) {
				this.jButtonfechaUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ordenUpdateDetalleBusqueda")) {
				this.jButtonordenUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ejecutadoUpdateDetalleBusqueda")) {
				this.jButtonejecutadoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoUpdateDetalleBusqueda")) {
				this.jButtonesta_activoUpdateDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionUpdateDetalleBusqueda")) {
				this.jButtondescripcionUpdateDetalleBusquedaActionPerformed(evt);
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUpdateDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUpdateDetalle")) {
				closingInternalFrameUpdateDetalle();
				
			} else if(sTipo.equals("jButtonCancelarUpdateDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormUpdateDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            UpdateDetalleBeanSwingJInternalFrame jInternalFrameParent=(UpdateDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormUpdateDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUpdateDetalleActionPerformed(null);
			}
			
			UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.updatedetalle,new Object(),this.updatedetalleParameterGeneral,this.updatedetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUpdateDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUpdateDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUpdateDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.updatedetalle)) {
			if(!esControlTabla) {
				if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);			
				}
				
				if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUpdateDetalle(this.updatedetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.updatedetalleReturnGeneral=updatedetalleLogic.procesarEventosUpdateDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updatedetalleLogic.getUpdateDetalles(),this.updatedetalle,this.updatedetalleParameterGeneral,this.isEsNuevoUpdateDetalle,classes);//this.updatedetalleLogic.getUpdateDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUpdateDetalle(this.updatedetalleReturnGeneral,this.updatedetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUpdateDetalle(classes,this.updatedetalleReturnGeneral,this.updatedetalleBean,false);
					}
						
					if(this.updatedetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle());	
					}
						
					if(this.updatedetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle(),classes);//this.updatedetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUpdateDetalle(this.updatedetalle,classes);//this.updatedetalleBean);									
				}
			
				if(UpdateDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUpdateDetalle(this.updatedetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUpdateDetalle(this.updatedetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.updatedetalleAnterior!=null) {
						this.updatedetalle=this.updatedetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.updatedetalleReturnGeneral=updatedetalleLogic.procesarEventosUpdateDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updatedetalleLogic.getUpdateDetalles(),this.updatedetalle,this.updatedetalleParameterGeneral,this.isEsNuevoUpdateDetalle,classes);//this.updatedetalleLogic.getUpdateDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.updatedetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.updatedetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.updatedetalleReturnGeneral.getUpdateDetalle(),updatedetalleLogic.getUpdateDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.updatedetalleReturnGeneral.getUpdateDetalle(),this.updatedetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUpdateDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosUpdateDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUpdateDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosUpdateDetalle() throws Exception {
		
		UpdateDetalleModel updatedetalleModel=(UpdateDetalleModel)this.jTableDatosUpdateDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			updatedetalleModel.updatedetalles=this.updatedetalleLogic.getUpdateDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			updatedetalleModel.updatedetalles=this.updatedetalles;
		}
		
		
		((UpdateDetalleModel) this.jTableDatosUpdateDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUpdateDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getupdatedetalleAnterior(),this.updatedetalleLogic.getUpdateDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getupdatedetalleAnterior(),this.updatedetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUpdateDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUpdateDetalle(UpdateDetalle updatedetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updatedetalle,new Object(),generalEntityParameterGeneral,this.updatedetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.updatedetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UpdateDetalleConstantesFunciones.getClassesRelationshipsOfUpdateDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UpdateDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfUpdateDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUpdateDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UpdateDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.updatedetalle,new Object(),generalEntityParameterGeneral,this.updatedetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUpdateDetalle(UpdateDetalleBean updatedetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUpdateDetalle(ArrayList<Classe> classes,UpdateDetalleReturnGeneral updatedetalleReturnGeneral,UpdateDetalleBean updatedetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUpdateDetalle(UpdateDetalle updatedetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.updatedetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUpdateDetalle = new UpdateDetalleDetalleFormJInternalFrame(jDesktopPane,this.updatedetalleSessionBean.getConGuardarRelaciones(),this.updatedetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.setVisible(false);
		this.jInternalFrameDetalleFormUpdateDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormUpdateDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUpdateDetalle.updatedetalleLogic=this.updatedetalleLogic;
		
		this.cargarCombosFrameForeignKeyUpdateDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUpdateDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUpdateDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUpdateDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUpdateDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUpdateDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUpdateDetalle"));
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ModificarUpdateDetalle"));

		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarUpdateDetalle"));
					
		this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemModificarUpdateDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarUpdateDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.addActionListener (new ButtonActionListener(this,"ActualizarUpdateDetalle"));
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUpdateDetalle"));
						
		this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemActualizarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUpdateDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.addActionListener (new ButtonActionListener(this,"EliminarUpdateDetalle"));
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarUpdateDetalle"));
								
		this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemEliminarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUpdateDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CancelarUpdateDetalle"));
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarUpdateDetalle"));
					
		this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemCancelarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUpdateDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemDetalleCerrarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUpdateDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdateDetalle"));
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdateDetalle"));
		
		
		
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUpdateDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonidUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigo_procesoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonquery_resumenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonnumero_intentoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfecha_archivoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfechaUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonordenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonejecutadoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonesta_activoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtondescripcionUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUpdateDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUpdateDetalle"));
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUpdateDetalle"));
		}
		
		this.jTableDatosUpdateDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUpdateDetalle"));
		
		this.jTableDatosUpdateDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUpdateDetalle"));
		
		this.jButtonNuevoUpdateDetalle.addActionListener(new ButtonActionListener(this,"NuevoUpdateDetalle"));
		
		this.jButtonDuplicarUpdateDetalle.addActionListener(new ButtonActionListener(this,"DuplicarUpdateDetalle"));
		
		this.jButtonCopiarUpdateDetalle.addActionListener(new ButtonActionListener(this,"CopiarUpdateDetalle"));
		
		this.jButtonVerFormUpdateDetalle.addActionListener(new ButtonActionListener(this,"VerFormUpdateDetalle"));
		
		
		this.jButtonNuevoToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarUpdateDetalle"));
			
		this.jButtonDuplicarToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUpdateDetalle"));
			
		this.jMenuItemNuevoUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUpdateDetalle"));
			
		this.jMenuItemDuplicarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUpdateDetalle"));		
		
		
		this.jButtonNuevoRelacionesUpdateDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUpdateDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUpdateDetalle"));
			
		this.jMenuItemNuevoRelacionesUpdateDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUpdateDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ModificarUpdateDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonModificarToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarUpdateDetalle"));
			
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemModificarUpdateDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarUpdateDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarUpdateDetalle.addActionListener (new ButtonActionListener(this,"ActualizarUpdateDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonActualizarToolBarUpdateDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUpdateDetalle"));
				
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemActualizarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUpdateDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarUpdateDetalle.addActionListener (new ButtonActionListener(this,"EliminarUpdateDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonEliminarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarUpdateDetalle"));
						
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemEliminarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUpdateDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CancelarUpdateDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonCancelarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarUpdateDetalle"));
			
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemCancelarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUpdateDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUpdateDetalle"));		
		
		
		this.jButtonCerrarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CerrarUpdateDetalle"));
		
		
		this.jButtonCerrarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarUpdateDetalle"));
			
		this.jMenuItemCerrarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUpdateDetalle"));
			
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jMenuItemDetalleCerrarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUpdateDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosUpdateDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUpdateDetalle"));
		}
		
		this.jButtonCopiarToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarUpdateDetalle"));
			
		this.jButtonVerFormToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarUpdateDetalle"));
		
		this.jMenuItemGuardarCambiosUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUpdateDetalle"));
			
		this.jMenuItemCopiarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUpdateDetalle"));		
		
		this.jMenuItemVerFormUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUpdateDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUpdateDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUpdateDetalle"));
			
		this.jMenuItemGuardarCambiosTablaUpdateDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUpdateDetalle"));		
		
		
		
		this.jButtonRecargarInformacionUpdateDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionUpdateDetalle"));
					
		this.jButtonRecargarInformacionToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUpdateDetalle"));
		
		this.jMenuItemRecargarInformacionUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUpdateDetalle"));		
		
		
		
		this.jButtonAnterioresUpdateDetalle.addActionListener (new ButtonActionListener(this,"AnterioresUpdateDetalle"));
		
		
		this.jButtonAnterioresToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUpdateDetalle"));
		
		this.jMenuItemAnterioresUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUpdateDetalle"));		
		
		
		this.jButtonSiguientesUpdateDetalle.addActionListener (new ButtonActionListener(this,"SiguientesUpdateDetalle"));
		
		
		this.jButtonSiguientesToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUpdateDetalle"));
			
		this.jMenuItemSiguientesUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUpdateDetalle"));
			
		this.jMenuItemAbrirOrderByUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUpdateDetalle"));
			
		this.jMenuItemMostrarOcultarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUpdateDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUpdateDetalle"));
			
		this.jMenuItemDetalleMostarOcultarUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUpdateDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosUpdateDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUpdateDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUpdateDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosUpdateDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUpdateDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUpdateDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUpdateDetalle"));

		this.jCheckBoxSeleccionadosUpdateDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUpdateDetalle"));
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUpdateDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesUpdateDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesUpdateDetalle"));
			
		this.jComboBoxTiposAccionesUpdateDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesUpdateDetalle"));
					
		this.jComboBoxTiposSeleccionarUpdateDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUpdateDetalle"));
			
		this.jTextFieldValorCampoGeneralUpdateDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUpdateDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonidUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigo_procesoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonquery_resumenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonnumero_intentoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfecha_archivoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfechaUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonordenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonejecutadoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonesta_activoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtondescripcionUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdAnioUpdateDetalle"));

			this.jButtonFK_IdMesUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdMesUpdateDetalle"));

			this.jButtonFK_IdUpdateUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdUpdateUpdateDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUpdateDetalle!=null) {
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdateDetalle"));
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdateDetalle"));
				this.jInternalFrameReporteDinamicoUpdateDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdateDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoUpdateDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUpdateDetalle"));				
			//this.jButtonGenerarReporteDinamicoUpdateDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUpdateDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoUpdateDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUpdateDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUpdateDetalle!=null) {
				this.jInternalFrameImportacionUpdateDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUpdateDetalle"));
				this.jInternalFrameImportacionUpdateDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUpdateDetalle"));
				this.jInternalFrameImportacionUpdateDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUpdateDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUpdateDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByUpdateDetalle"));
			
			this.jButtonAbrirOrderByToolBarUpdateDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUpdateDetalle"));			
			
			if(this.jInternalFrameOrderByUpdateDetalle!=null) {
				this.jInternalFrameOrderByUpdateDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUpdateDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUpdateDetalle.jTabbedPaneRelacionesUpdateDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUpdateDetalle"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameUpdateDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUpdateDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUpdateDetalle = (JInternalFrameBase)event.getSource();
	            	
	            UpdateDetalleBeanSwingJInternalFrame jInternalFrameParent=(UpdateDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormUpdateDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUpdateDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUpdateDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUpdateDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUpdateDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUpdateDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUpdateDetalle";
		inputMap = this.jButtonNuevoUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUpdateDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUpdateDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUpdateDetalle";
		inputMap = this.jButtonNuevoRelacionesUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUpdateDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUpdateDetalle";
		inputMap = this.jButtonModificarUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUpdateDetalle";
		inputMap = this.jButtonActualizarUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUpdateDetalle";
		inputMap = this.jButtonEliminarUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUpdateDetalle";
		inputMap = this.jButtonCancelarUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUpdateDetalle";
		inputMap = this.jButtonCerrarUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUpdateDetalle";
		inputMap = this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonGuardarCambiosUpdateDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUpdateDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUpdateDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUpdateDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUpdateDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUpdateDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUpdateDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUpdateDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUpdateDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUpdateDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonidUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_updateUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_updateUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_anioUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_anioUpdateDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonid_mesUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_mesUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtoncodigo_procesoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"codigo_procesoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonquery_resumenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"query_resumenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonnumero_intentoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"numero_intentoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfecha_archivoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fecha_archivoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonfechaUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"fechaUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonordenUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ordenUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonejecutadoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"ejecutadoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtonesta_activoUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoUpdateDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUpdateDetalle.jButtondescripcionUpdateDetalleBusqueda.addActionListener(new ButtonActionListener(this,"descripcionUpdateDetalleBusqueda"));
		
		
		this.jButtonFK_IdAnioUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdAnioUpdateDetalle"));

		this.jButtonFK_IdMesUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdMesUpdateDetalle"));

		this.jButtonFK_IdUpdateUpdateDetalle.addActionListener(new ButtonActionListener(this,"FK_IdUpdateUpdateDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUpdateDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUpdateDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUpdateDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUpdateDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUpdateDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
					updatedetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UpdateDetalle updatedetalleAux:updatedetalles) {
					updatedetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUpdateDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
						updatedetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UpdateDetalle updatedetalleAux:updatedetalles) {
						updatedetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
					
						if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO)) {
							existe=true;
							updatedetalleAux.setejecutado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							updatedetalleAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UpdateDetalle updatedetalleAux:updatedetalles) {
						
						if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO)) {
							existe=true;
							updatedetalleAux.setejecutado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							updatedetalleAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUpdateDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUpdateDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUpdateDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUpdateDetalle.getSelectedRows();
			
			UpdateDetalle updatedetalleLocal=new UpdateDetalle();
			
			//this.seleccionarTodosUpdateDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					updatedetalleLocal =(UpdateDetalle) this.updatedetalleLogic.getUpdateDetalles().toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					updatedetalleLocal =(UpdateDetalle) this.updatedetalles.toArray()[this.jTableDatosUpdateDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				updatedetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
						updatedetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UpdateDetalle updatedetalleAux:updatedetalles) {
						updatedetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUpdateDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUpdateDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUpdateDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUpdateDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUpdateDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUpdateDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUpdateDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UpdateDetalle updatedetalleAux:this.updatedetalleLogic.getUpdateDetalles()) {
				
						if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							updatedetalleAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO)) {
							existe=true;
							updatedetalleAux.setcodigo_proceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN)) {
							existe=true;
							updatedetalleAux.setquery_resumen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO)) {
							existe=true;
							updatedetalleAux.setnumero_intento(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO)) {
							existe=true;
							updatedetalleAux.setfecha_archivo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							updatedetalleAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							updatedetalleAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							updatedetalleAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UpdateDetalle updatedetalleAux:updatedetalles) {
					
						if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							updatedetalleAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO)) {
							existe=true;
							updatedetalleAux.setcodigo_proceso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN)) {
							existe=true;
							updatedetalleAux.setquery_resumen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO)) {
							existe=true;
							updatedetalleAux.setnumero_intento(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO)) {
							existe=true;
							updatedetalleAux.setfecha_archivo(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							updatedetalleAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ORDEN)) {
							existe=true;
							updatedetalleAux.setorden(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							updatedetalleAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUpdateDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUpdateDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUpdateDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUpdateDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUpdateDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessUpdateDetalle(conSplash);
				
					this.generarReporteUpdateDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUpdateDetallesSeleccionados();
				//this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUpdateDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUpdateDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUpdateDetalle();
				
				this.exportarUpdateDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUpdateDetalles();
				//this.importarUpdateDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUpdateDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUpdateDetallesSeleccionados();
				//this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Update Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUpdateDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUpdateDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUpdateDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(UpdateDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUpdateDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUpdateDetalle(conSplash);
					
						//this.actualizarParametrosGeneralUpdateDetalle();
						
						this.generarReporteProcesoAccionUpdateDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UpdateDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Update DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Update Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUpdateDetalle();
				
						this.actualizarParametrosGeneralUpdateDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.updatedetalleReturnGeneral=updatedetalleLogic.procesarAccionUpdateDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.updatedetalleLogic.getUpdateDetalles(),this.updatedetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUpdateDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUpdateDetalle();
					
					UpdateDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUpdateDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUpdateDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxTiposAccionesFormularioUpdateDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUpdateDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUpdateDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUpdateDetalle();
			
			if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
			UpdateDetalle updatedetalle=new UpdateDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUpdateDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUpdateDetalle.getSelectedItem();
			
			
			
			
			updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(updatedetallesSeleccionados.size()==1) {
				for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
					updatedetalle=updatedetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUpdateDetalle();
			
      		//this.finishProcessUpdateDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUpdateDetalleReturnGeneral() throws Exception {
		if(this.updatedetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.updatedetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.updatedetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.updatedetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.updatedetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.updatedetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUpdateDetalle(false);
		}
		
		if(this.updatedetalleReturnGeneral.getConRetornoLista() || this.updatedetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.updatedetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.updatedetalleLogic.setUpdateDetalles(this.updatedetalleReturnGeneral.getUpdateDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.updatedetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.updatedetalleLogic.setUpdateDetalle(this.updatedetalleReturnGeneral.getUpdateDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingUpdateDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralUpdateDetalle() throws Exception {
		
		
	}
	
	public ArrayList<UpdateDetalle> getUpdateDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUpdateDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UpdateDetalle updatedetalleAux:updatedetalleLogic.getUpdateDetalles()) {
					if(updatedetalleAux.getIsSelected()) {
						updatedetallesSeleccionados.add(updatedetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UpdateDetalle updatedetalleAux:this.updatedetalles) {
					if(updatedetalleAux.getIsSelected()) {
						updatedetallesSeleccionados.add(updatedetalleAux);				
					}
				}
			}
			
			if(updatedetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						updatedetallesSeleccionados.addAll(this.updatedetalleLogic.getUpdateDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						updatedetallesSeleccionados.addAll(this.updatedetalles);				
					}
				}
			}
		} else {
			updatedetallesSeleccionados.add(this.updatedetalle);
		}
		
		return updatedetallesSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteUpdateDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUpdateDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUpdateDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUpdateDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUpdateDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Update Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUpdateDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUpdateDetalle();
		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUpdateDetalle();
		
		
		//this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados ,updatedetalleImplementable,updatedetalleImplementableHome);
	}
	
	public void mostrarImportacionUpdateDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUpdateDetalle();
		
		this.abrirFrameImportacionUpdateDetalle();		
		
			
		//this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados ,updatedetalleImplementable,updatedetalleImplementableHome);
	}
	
	public void importarUpdateDetalles() throws Exception {		
	
	}
	
	public void exportarUpdateDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUpdateDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUpdateDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUpdateDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Update Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUpdateDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUpdateDetalle(updatedetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//updatedetalleAux.setsDetalleGeneralEntityReporte(updatedetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUpdateDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_IDUPDATE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_ORDEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_EJECUTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUpdateDetalle(UpdateDetalle updatedetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=updatedetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getupdate_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getcodigo_proceso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getquery_resumen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getnumero_intento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getfecha_archivo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getorden().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getejecutado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getesta_activo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=updatedetalle.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UpdateDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUpdateDetalle(row);				
				iRow++;
			}				
			
			for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUpdateDetalle(updatedetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUpdateDetallesSeleccionados() throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();		
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"updatedetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("updatedetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("updatedetalle");
			//elementRoot.appendChild(element);
		
			for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
				element = document.createElement("updatedetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUpdateDetalle(updatedetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Update Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUpdateDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ORDEN);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUpdateDetalle(UpdateDetalle updatedetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getupdate_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getcodigo_proceso());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getquery_resumen());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getnumero_intento());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getfecha_archivo());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getorden());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getejecutado());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getesta_activo());
		cell = row.createCell(iColumn++);cell.setCellValue(updatedetalle.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlUpdateDetalle(UpdateDetalle updatedetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UpdateDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(updatedetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UpdateDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(updatedetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementupdate_descripcion = document.createElement(UpdateDetalleConstantesFunciones.IDUPDATE);
		elementupdate_descripcion.appendChild(document.createTextNode(updatedetalle.getupdate_descripcion()));
		element.appendChild(elementupdate_descripcion);

		Element elementanio_descripcion = document.createElement(UpdateDetalleConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(updatedetalle.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(UpdateDetalleConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(updatedetalle.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementcodigo = document.createElement(UpdateDetalleConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(updatedetalle.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementcodigo_proceso = document.createElement(UpdateDetalleConstantesFunciones.CODIGOPROCESO);
		elementcodigo_proceso.appendChild(document.createTextNode(updatedetalle.getcodigo_proceso().trim()));
		element.appendChild(elementcodigo_proceso);

		Element elementquery_resumen = document.createElement(UpdateDetalleConstantesFunciones.QUERYRESUMEN);
		elementquery_resumen.appendChild(document.createTextNode(updatedetalle.getquery_resumen().trim()));
		element.appendChild(elementquery_resumen);

		Element elementnumero_intento = document.createElement(UpdateDetalleConstantesFunciones.NUMEROINTENTO);
		elementnumero_intento.appendChild(document.createTextNode(updatedetalle.getnumero_intento().toString().trim()));
		element.appendChild(elementnumero_intento);

		Element elementfecha_archivo = document.createElement(UpdateDetalleConstantesFunciones.FECHAARCHIVO);
		elementfecha_archivo.appendChild(document.createTextNode(updatedetalle.getfecha_archivo().toString().trim()));
		element.appendChild(elementfecha_archivo);

		Element elementfecha = document.createElement(UpdateDetalleConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(updatedetalle.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementorden = document.createElement(UpdateDetalleConstantesFunciones.ORDEN);
		elementorden.appendChild(document.createTextNode(updatedetalle.getorden().toString().trim()));
		element.appendChild(elementorden);

		Element elementejecutado = document.createElement(UpdateDetalleConstantesFunciones.EJECUTADO);
		elementejecutado.appendChild(document.createTextNode(updatedetalle.getejecutado().toString().trim()));
		element.appendChild(elementejecutado);

		Element elementesta_activo = document.createElement(UpdateDetalleConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(updatedetalle.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);

		Element elementdescripcion = document.createElement(UpdateDetalleConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(updatedetalle.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoUpdateDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UpdateDetalle> updatedetallesSeleccionados=new ArrayList<UpdateDetalle>();
		
		updatedetallesSeleccionados=this.getUpdateDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoUpdateDetalle(updatedetallesSeleccionados);
		
		this.generarReporteUpdateDetalles("Todos",updatedetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUpdateDetalle(ArrayList<UpdateDetalle> updatedetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UpdateDetalle updatedetalleAux:updatedetallesSeleccionados) {
				updatedetalleAux.setsDetalleGeneralEntityReporte(updatedetalleAux.toString());
			
				if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_IDUPDATE)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getupdate_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_CODIGOPROCESO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getcodigo_proceso());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_QUERYRESUMEN)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getquery_resumen());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_NUMEROINTENTO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getnumero_intento().toString());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHAARCHIVO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(updatedetalleAux.getfecha_archivo()));
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(updatedetalleAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ORDEN)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getorden().toString());
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_EJECUTADO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(updatedetalleAux.getejecutado()));
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(updatedetalleAux.getesta_activo()));
				}
				 else if(sTipoSeleccionar.equals(UpdateDetalleConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					updatedetalleAux.setsDescripcionGeneralEntityReporte1(updatedetalleAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UpdateDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUpdateDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUpdateDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=true;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=true;
			this.isVisibilidadCeldaEliminarUpdateDetalle=true;
			this.isVisibilidadCeldaCancelarUpdateDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=true;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=true;
			this.isVisibilidadCeldaModificarUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
			this.isVisibilidadCeldaModificarUpdateDetalle=true;
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
			this.isVisibilidadCeldaCancelarUpdateDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarUpdateDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UpdateDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUpdateDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=true;
		} else {
			this.actualizarEstadoPanelsUpdateDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUpdateDetalle=false;
			//this.isVisibilidadCeldaVerFormUpdateDetalle=false;
			this.isVisibilidadCeldaDuplicarUpdateDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!updatedetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoUpdateDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosUpdateDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(updatedetalleSessionBean.getEsGuardarRelacionado()) {
			if(!updatedetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;												
			}
			
			this.jButtonCerrarUpdateDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUpdateDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.updatedetalle)) {
			this.isVisibilidadCeldaActualizarUpdateDetalle=false;
			this.isVisibilidadCeldaEliminarUpdateDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUpdateDetalle() {
	}
	
	public void actualizarEstadoPanelsUpdateDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUpdateDetalle!=null) {
				this.jScrollPanelDatosEdicionUpdateDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUpdateDetalle!=null) {
				this.jScrollPanelDatosUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionUpdateDetalle!=null) {
				this.jPanelPaginacionUpdateDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
					this.jTabbedPaneBusquedasUpdateDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.updatedetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUpdateDetalle!=null) {
				this.jTabbedPaneBusquedasUpdateDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUpdateDetalle!=null) {
				this.jPanelParametrosReportesUpdateDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaUpdate(Boolean isParaUpdate){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUpdateNegation=!isParaUpdate;

			this.isVisibilidadFK_IdAnio=isParaUpdateNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdAnioUpdateDetalle);}

			this.isVisibilidadFK_IdMes=isParaUpdateNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdMesUpdateDetalle);}

			this.isVisibilidadFK_IdUpdate=isParaUpdate;
			if(!this.isVisibilidadFK_IdUpdate) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdUpdateUpdateDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdAnioUpdateDetalle);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdMesUpdateDetalle);}

			this.isVisibilidadFK_IdUpdate=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdUpdate) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdUpdateUpdateDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdAnioUpdateDetalle);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdMesUpdateDetalle);}

			this.isVisibilidadFK_IdUpdate=isParaMesNegation;
			if(!this.isVisibilidadFK_IdUpdate) {this.jTabbedPaneBusquedasUpdateDetalle.remove(jPanelFK_IdUpdateUpdateDetalle);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//UpdateDetalleSessionBean updatedetalleSessionBean=new UpdateDetalleSessionBean();
		
		if(this.updatedetalleSessionBean==null) {
			this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		}
		
		this.updatedetalleSessionBean.setsUltimaBusquedaUpdateDetalle(this.getsAccionBusqueda());
		this.updatedetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.updatedetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			updatedetalleSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			updatedetalleSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUpdate")) {
			updatedetalleSessionBean.setid_update(this.getid_updateFK_IdUpdate());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//UpdateDetalleSessionBean updatedetalleSessionBean=new UpdateDetalleSessionBean();
		
		if(this.updatedetalleSessionBean==null) {
			this.updatedetalleSessionBean=new UpdateDetalleSessionBean();
		}
		
		if(this.updatedetalleSessionBean.getsUltimaBusquedaUpdateDetalle()!=null&&!this.updatedetalleSessionBean.getsUltimaBusquedaUpdateDetalle().equals("")) {
			this.setsAccionBusqueda(updatedetalleSessionBean.getsUltimaBusquedaUpdateDetalle());
			this.setiNumeroPaginacion(updatedetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(updatedetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(updatedetalleSessionBean.getid_anio());
				updatedetalleSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(updatedetalleSessionBean.getid_mes());
				updatedetalleSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUpdate")) {
				this.setid_updateFK_IdUpdate(updatedetalleSessionBean.getid_update());
				updatedetalleSessionBean.setid_update(-1L);
			}
		}
		
		this.updatedetalleSessionBean.setsUltimaBusquedaUpdateDetalle("");
		this.updatedetalleSessionBean.setiNumeroPaginacion(UpdateDetalleConstantesFunciones.INUMEROPAGINACION);
		this.updatedetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUpdateDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUpdateDetalle() {
		this.updateBorderResaltarBusquedasFormularioUpdateDetalle();
		this.updateVisibilidadBusquedasFormularioUpdateDetalle();
		this.updateHabilitarBusquedasFormularioUpdateDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioUpdateDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUpdateDetalle.getComponents().length>0) {
	

		if(this.updatedetalleConstantesFunciones.resaltarFK_IdAnioUpdateDetalle!=null) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdAnioUpdateDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdAnioUpdateDetalle);
			}
		}

		if(this.updatedetalleConstantesFunciones.resaltarFK_IdMesUpdateDetalle!=null) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdMesUpdateDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdMesUpdateDetalle);
			}
		}

		if(this.updatedetalleConstantesFunciones.resaltarFK_IdUpdateUpdateDetalle!=null) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdUpdateUpdateDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdUpdateUpdateDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUpdateDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUpdateDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdAnioUpdateDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.updatedetalleConstantesFunciones.mostrarFK_IdAnioUpdateDetalle);
			if(!this.updatedetalleConstantesFunciones.mostrarFK_IdAnioUpdateDetalle && index>-1) {
				this.jTabbedPaneBusquedasUpdateDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdMesUpdateDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.updatedetalleConstantesFunciones.mostrarFK_IdMesUpdateDetalle);
			if(!this.updatedetalleConstantesFunciones.mostrarFK_IdMesUpdateDetalle && index>-1) {
				this.jTabbedPaneBusquedasUpdateDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdUpdateUpdateDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.updatedetalleConstantesFunciones.mostrarFK_IdUpdateUpdateDetalle);
			if(!this.updatedetalleConstantesFunciones.mostrarFK_IdUpdateUpdateDetalle && index>-1) {
				this.jTabbedPaneBusquedasUpdateDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUpdateDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUpdateDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdAnioUpdateDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.updatedetalleConstantesFunciones.activarFK_IdAnioUpdateDetalle);
				this.jTabbedPaneBusquedasUpdateDetalle.setEnabledAt(index,this.updatedetalleConstantesFunciones.activarFK_IdAnioUpdateDetalle);
			}

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdMesUpdateDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.updatedetalleConstantesFunciones.activarFK_IdMesUpdateDetalle);
				this.jTabbedPaneBusquedasUpdateDetalle.setEnabledAt(index,this.updatedetalleConstantesFunciones.activarFK_IdMesUpdateDetalle);
			}

			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdUpdateUpdateDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.updatedetalleConstantesFunciones.activarFK_IdUpdateUpdateDetalle);
				this.jTabbedPaneBusquedasUpdateDetalle.setEnabledAt(index,this.updatedetalleConstantesFunciones.activarFK_IdUpdateUpdateDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUpdateDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdAnioUpdateDetalle);

			this.jTabbedPaneBusquedasUpdateDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);

			this.updatedetalleConstantesFunciones.setResaltarFK_IdAnioUpdateDetalle(resaltar);

			jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdAnioUpdateDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdMesUpdateDetalle);

			this.jTabbedPaneBusquedasUpdateDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);

			this.updatedetalleConstantesFunciones.setResaltarFK_IdMesUpdateDetalle(resaltar);

			jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdMesUpdateDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUpdate")) {
			index= this.jTabbedPaneBusquedasUpdateDetalle.indexOfComponent(this.jPanelFK_IdUpdateUpdateDetalle);

			this.jTabbedPaneBusquedasUpdateDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUpdateDetalle.getComponent(index);

			this.updatedetalleConstantesFunciones.setResaltarFK_IdUpdateUpdateDetalle(resaltar);

			jPanel.setBorder(this.updatedetalleConstantesFunciones.resaltarFK_IdUpdateUpdateDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUpdateDetalle.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioUpdateDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUpdateDetalle();
		this.updateVisibilidadResaltarControlesFormularioUpdateDetalle();
		this.updateHabilitarResaltarControlesFormularioUpdateDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioUpdateDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.updatedetalleConstantesFunciones.resaltaridUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltaridUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarid_updateUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarid_updateUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarid_anioUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarid_anioUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarid_mesUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarid_mesUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarcodigoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarcodigoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarcodigo_procesoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarcodigo_procesoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarquery_resumenUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarquery_resumenUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarnumero_intentoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarnumero_intentoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarfecha_archivoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarfecha_archivoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarfechaUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarfechaUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarordenUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarordenUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltarejecutadoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setBorderPainted(true);this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltarejecutadoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltaresta_activoUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setBorderPainted(true);this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltaresta_activoUpdateDetalle);}
		if(this.updatedetalleConstantesFunciones.resaltardescripcionUpdateDetalle!=null && this.jInternalFrameDetalleFormUpdateDetalle!=null) {this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setBorder(this.updatedetalleConstantesFunciones.resaltardescripcionUpdateDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUpdateDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
	
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostraridUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelidUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostraridUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_updateUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelid_updateUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_updateUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_anioUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelid_anioUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_anioUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_mesUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelid_mesUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarid_mesUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarcodigoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelcodigoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarcodigoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarcodigo_procesoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelcodigo_procesoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarcodigo_procesoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarquery_resumenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelquery_resumenUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarquery_resumenUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarnumero_intentoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelnumero_intentoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarnumero_intentoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarfecha_archivoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelfecha_archivoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarfecha_archivoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarfechaUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelfechaUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarfechaUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarordenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelordenUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarordenUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarejecutadoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelejecutadoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrarejecutadoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostraresta_activoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPanelesta_activoUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostraresta_activoUpdateDetalle);
		//this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrardescripcionUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jPaneldescripcionUpdateDetalle.setVisible(this.updatedetalleConstantesFunciones.mostrardescripcionUpdateDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUpdateDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormUpdateDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUpdateDetalle!=null) {
	
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldidUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activaridUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_updateUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarid_updateUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_anioUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarid_anioUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jComboBoxid_mesUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarid_mesUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarcodigoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldcodigo_procesoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarcodigo_procesoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextAreaquery_resumenUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarquery_resumenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldnumero_intentoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarnumero_intentoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfecha_archivoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarfecha_archivoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jDateChooserfechaUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarfechaUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextFieldordenUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarordenUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxejecutadoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activarejecutadoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jCheckBoxesta_activoUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activaresta_activoUpdateDetalle);
		this.jInternalFrameDetalleFormUpdateDetalle.jTextAreadescripcionUpdateDetalle.setEnabled(this.updatedetalleConstantesFunciones.activardescripcionUpdateDetalle);
		}
	}
	
		
}