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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.RadioVenciProveConstantesFunciones;
import com.bydan.erp.cartera.util.RadioVenciProveParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RadioVenciProveParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RadioVenciProveBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RadioVenciProveBeanSwingJInternalFrame extends RadioVenciProveJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RadioVenciProveBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RadioVenciProve> radiovenciproveValidator = new ClassValidator<RadioVenciProve>(RadioVenciProve.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RadioVenciProve radiovenciprove;	
	public RadioVenciProve radiovenciproveAux;
	public RadioVenciProve radiovenciproveAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RadioVenciProve radiovenciproveTotales;
	public Long idRadioVenciProveActual;
	public Long iIdNuevoRadioVenciProve=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboTipoRadioVenci="";

	public List<TipoRadioVenci> tiporadiovencisForeignKey;

	public List<TipoRadioVenci> gettiporadiovencisForeignKey() {
		return tiporadiovencisForeignKey;
	}

	public void settiporadiovencisForeignKey(List<TipoRadioVenci> tiporadiovencisForeignKey) {
		this.tiporadiovencisForeignKey = tiporadiovencisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoRadioVenci tiporadiovenciForeignKey;

	public TipoRadioVenci gettiporadiovenciForeignKey() {
		return tiporadiovenciForeignKey;
	}

	public void settiporadiovenciForeignKey(TipoRadioVenci tiporadiovenciForeignKey) {
		this.tiporadiovenciForeignKey = tiporadiovenciForeignKey;
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
	
	public Boolean isPermisoTodoRadioVenciProve;
	public Boolean isPermisoNuevoRadioVenciProve;
	public Boolean isPermisoActualizarRadioVenciProve;
	public Boolean isPermisoActualizarOriginalRadioVenciProve;
	public Boolean isPermisoEliminarRadioVenciProve;
	public Boolean isPermisoGuardarCambiosRadioVenciProve;
	public Boolean isPermisoConsultaRadioVenciProve;
	public Boolean isPermisoBusquedaRadioVenciProve;
	public Boolean isPermisoReporteRadioVenciProve;
	public Boolean isPermisoPaginacionMedioRadioVenciProve;
	public Boolean isPermisoPaginacionAltoRadioVenciProve;
	public Boolean isPermisoPaginacionTodoRadioVenciProve;
	public Boolean isPermisoCopiarRadioVenciProve;
	public Boolean isPermisoVerFormRadioVenciProve;
	public Boolean isPermisoDuplicarRadioVenciProve;
	public Boolean isPermisoOrdenRadioVenciProve;
	
	
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
	
	public RadioVenciProveParameterReturnGeneral radiovenciproveReturnGeneral;
	public RadioVenciProveParameterReturnGeneral radiovenciproveParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRadioVenciProve=false;
	public Boolean esParaAccionDesdeFormularioRadioVenciProve=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RadioVenciProveSessionBeanAdditional radiovenciproveSessionBeanAdditional=null;
	
	public RadioVenciProveSessionBeanAdditional getRadioVenciProveSessionBeanAdditional() {
		return this.radiovenciproveSessionBeanAdditional;
	}
	
	public void setRadioVenciProveSessionBeanAdditional(RadioVenciProveSessionBeanAdditional radiovenciproveSessionBeanAdditional) {
		try {
			this.radiovenciproveSessionBeanAdditional=radiovenciproveSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RadioVenciProveBeanSwingJInternalFrameAdditional radiovenciproveBeanSwingJInternalFrameAdditional=null;
	//public class RadioVenciProveBeanSwingJInternalFrame
	
	public RadioVenciProveBeanSwingJInternalFrameAdditional getRadioVenciProveBeanSwingJInternalFrameAdditional() {
		return this.radiovenciproveBeanSwingJInternalFrameAdditional;
	}
	
	public void setRadioVenciProveBeanSwingJInternalFrameAdditional(RadioVenciProveBeanSwingJInternalFrameAdditional radiovenciproveBeanSwingJInternalFrameAdditional) {
		try {
			this.radiovenciproveBeanSwingJInternalFrameAdditional=radiovenciproveBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RadioVenciProveLogic radiovenciproveLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RadioVenciProve radiovenciproveBean;
	public RadioVenciProveConstantesFunciones radiovenciproveConstantesFunciones;
	//public RadioVenciProveParameterReturnGeneral radiovenciproveReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoRadioVenciLogic tiporadiovenciLogic;
	
	//PARAMETROS
	
	
	//public List<RadioVenciProve> radiovenciproves;	
	//public List<RadioVenciProve> radiovenciprovesEliminados;
	//public List<RadioVenciProve> radiovenciprovesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRadioVenciProve=false;
	public Boolean isVisibilidadCeldaDuplicarRadioVenciProve=true;
	public Boolean isVisibilidadCeldaCopiarRadioVenciProve=true;
	public Boolean isVisibilidadCeldaVerFormRadioVenciProve=true;
	public Boolean isVisibilidadCeldaOrdenRadioVenciProve=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
	public Boolean isVisibilidadCeldaModificarRadioVenciProve=false;
	public Boolean isVisibilidadCeldaActualizarRadioVenciProve=false;
	public Boolean isVisibilidadCeldaEliminarRadioVenciProve=false;
	public Boolean isVisibilidadCeldaCancelarRadioVenciProve=false;
	public Boolean isVisibilidadCeldaGuardarRadioVenciProve=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoRadioVenci=false;
	
	public Long getiIdNuevoRadioVenciProve() {
		return this.iIdNuevoRadioVenciProve;
	}

	public void setiIdNuevoRadioVenciProve(Long iIdNuevoRadioVenciProve) {
		this.iIdNuevoRadioVenciProve = iIdNuevoRadioVenciProve;
	}
	
	public Long getidRadioVenciProveActual() {
		return this.idRadioVenciProveActual;
	}

	public void setidRadioVenciProveActual(Long idRadioVenciProveActual) {
		this.idRadioVenciProveActual = idRadioVenciProveActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RadioVenciProve getradiovenciprove() {
		return this.radiovenciprove;
	}

	public void setradiovenciprove(RadioVenciProve radiovenciprove) {
		this.radiovenciprove = radiovenciprove;
	}
	
	public RadioVenciProve getradiovenciproveAux() {
		return this.radiovenciproveAux;
	}

	public void setradiovenciproveAux(RadioVenciProve radiovenciproveAux) {
		this.radiovenciproveAux = radiovenciproveAux;
	}				
	
	public RadioVenciProve getradiovenciproveAnterior() {
		return this.radiovenciproveAnterior;
	}

	public void setradiovenciproveAnterior(RadioVenciProve radiovenciproveAnterior) {
		this.radiovenciproveAnterior = radiovenciproveAnterior;
	}	
	
	public RadioVenciProve getradiovenciproveTotales() {
		return this.radiovenciproveTotales;
	}

	public void setradiovenciproveTotales(RadioVenciProve radiovenciproveTotales) {
		this.radiovenciproveTotales = radiovenciproveTotales;
	}	
	
	public RadioVenciProve getradiovenciproveBean() {
		return this.radiovenciproveBean;
	}

	public void setradiovenciproveBean(RadioVenciProve radiovenciproveBean) {
		this.radiovenciproveBean = radiovenciproveBean;
	}	
	
	public RadioVenciProveParameterReturnGeneral getradiovenciproveReturnGeneral() {
		return this.radiovenciproveReturnGeneral;
	}

	public void setradiovenciproveReturnGeneral(RadioVenciProveParameterReturnGeneral radiovenciproveReturnGeneral) {
		this.radiovenciproveReturnGeneral = radiovenciproveReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_radio_venciFK_IdTipoRadioVenci=-1L;

	public Long getid_tipo_radio_venciFK_IdTipoRadioVenci() {
		return this.id_tipo_radio_venciFK_IdTipoRadioVenci;
	}

	public void setid_tipo_radio_venciFK_IdTipoRadioVenci(Long id_tipo_radio_venciFK_IdTipoRadioVenci) {
		this.id_tipo_radio_venciFK_IdTipoRadioVenci = id_tipo_radio_venciFK_IdTipoRadioVenci;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public RadioVenciProveLogic getRadioVenciProveLogic()	{		
		return radiovenciproveLogic;
	}

	public void setRadioVenciProveLogic(RadioVenciProveLogic radiovenciproveLogic) {
		this.radiovenciproveLogic = radiovenciproveLogic;
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
	
	public Boolean getIsEsNuevoRadioVenciProve() {
		return isEsNuevoRadioVenciProve;
	}

	public void setIsEsNuevoRadioVenciProve(Boolean isEsNuevoRadioVenciProve) {
		this.isEsNuevoRadioVenciProve = isEsNuevoRadioVenciProve;
	}

	public Boolean getEsParaAccionDesdeFormularioRadioVenciProve() {
		return esParaAccionDesdeFormularioRadioVenciProve;
	}
	
	public void setEsParaAccionDesdeFormularioRadioVenciProve(Boolean esParaAccionDesdeFormularioRadioVenciProve) {
		this.esParaAccionDesdeFormularioRadioVenciProve = esParaAccionDesdeFormularioRadioVenciProve;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.radiovenciproveSessionBean==null) {
				this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
			}

			if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(radiovenciproveSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	public void cargarCombosTipoRadioVencisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiporadiovencisForeignKey=new ArrayList<TipoRadioVenci>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoRadioVenciLogic tiporadiovenciLogic=new TipoRadioVenciLogic();

			//tiporadiovenciLogic.getTipoRadioVenciDataAccess().setIsForForeingKeyData(true);

			if(this.radiovenciproveSessionBean==null) {
				this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
			}

			if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiporadiovenciLogic.getTipoRadioVenciDataAccess().setIsForForeingKeyData(true);

					tiporadiovenciLogic.getTodosTipoRadioVencisWithConnection(sFinalQuery,new Pagination());

					this.tiporadiovencisForeignKey=tiporadiovenciLogic.getTipoRadioVencis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoRadioVenci(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporadiovenciLogic.getEntityWithConnection(radiovenciproveSessionBean.getlidTipoRadioVenciActual());
					this.tiporadiovencisForeignKey.add(tiporadiovenciLogic.getTipoRadioVenci());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.radiovenciprove!=null) {
						this.radiovenciprove.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
						this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRadioVenciProve.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
						if(this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.getItemCount()>0) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRadioVenciProveGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaRadioVenciProveGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRadioVenciProveGenerico!=null && jComboBoxid_empresaRadioVenciProveGenerico.getItemCount()>0) {
					jComboBoxid_empresaRadioVenciProveGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoRadioVenciForeignKey(Long idTipoRadioVenciSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoRadioVenci  tiporadiovenciTemp=null;

			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisForeignKey) {
				if(tiporadiovenciAux.getId()!=null && tiporadiovenciAux.getId().equals(idTipoRadioVenciSeleccionado)) {
					tiporadiovenciTemp=tiporadiovenciAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiporadiovenciTemp!=null) {

					if(this.radiovenciprove!=null) {
						this.radiovenciprove.setTipoRadioVenci(tiporadiovenciTemp);
					}

					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
						this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedItem(tiporadiovenciTemp);
					}
				} else {
					//jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedItem(tiporadiovenciTemp);
					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
						if(this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.getItemCount()>0) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRadioVenci") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporadiovenciTemp!=null && jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve!=null) {
						jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setSelectedItem(tiporadiovenciTemp);
					} else {
						if(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve!=null) {
							//jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setSelectedItem(tiporadiovenciTemp);
							if(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.getItemCount()>0) {
								jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setSelectedIndex(0);
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

	public String getActualTipoRadioVenciForeignKeyDescripcion(Long idTipoRadioVenciSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoRadioVenci  tiporadiovenciTemp=null;

			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisForeignKey) {
				if(tiporadiovenciAux.getId()!=null && tiporadiovenciAux.getId().equals(idTipoRadioVenciSeleccionado)) {
					tiporadiovenciTemp=tiporadiovenciAux;
					break;
				}
			}


			sDescripcion=TipoRadioVenciConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenciTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoRadioVenciForeignKeyGenerico(Long idTipoRadioVenciSeleccionado,JComboBox jComboBoxid_tipo_radio_venciRadioVenciProveGenerico)throws Exception
	{
		try
		{
			TipoRadioVenci  tiporadiovenciTemp=null;

			for(TipoRadioVenci tiporadiovenciAux:tiporadiovencisForeignKey) {
				if(tiporadiovenciAux.getId()!=null && tiporadiovenciAux.getId().equals(idTipoRadioVenciSeleccionado)) {
					tiporadiovenciTemp=tiporadiovenciAux;
					break;
				}
			}

			if(tiporadiovenciTemp!=null) {
				jComboBoxid_tipo_radio_venciRadioVenciProveGenerico.setSelectedItem(tiporadiovenciTemp);
			} else {
				if(jComboBoxid_tipo_radio_venciRadioVenciProveGenerico!=null && jComboBoxid_tipo_radio_venciRadioVenciProveGenerico.getItemCount()>0) {
					jComboBoxid_tipo_radio_venciRadioVenciProveGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RadioVenciProve radiovenciprove,JComboBox jComboBoxid_empresaRadioVenciProveGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRadioVenciProveGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRadioVenciProveGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				radiovenciprove.setid_empresa(empresaAux.getId());
				radiovenciprove.setempresa_descripcion(RadioVenciProveConstantesFunciones.getEmpresaDescripcion(empresaAux));
				radiovenciprove.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRadioVenciForeignKey(RadioVenciProve radiovenciprove,JComboBox jComboBoxid_tipo_radio_venciRadioVenciProveGenerico)throws Exception
	{
		try
		{
			TipoRadioVenci  tiporadiovenciAux=new TipoRadioVenci();

			if(jComboBoxid_tipo_radio_venciRadioVenciProveGenerico==null) {
				tiporadiovenciAux=(TipoRadioVenci)this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.getSelectedItem();
			} else {
				tiporadiovenciAux=(TipoRadioVenci)jComboBoxid_tipo_radio_venciRadioVenciProveGenerico.getSelectedItem();
			}

			if(tiporadiovenciAux!=null && tiporadiovenciAux.getId()!=null) {
				radiovenciprove.setid_tipo_radio_venci(tiporadiovenciAux.getId());
				radiovenciprove.settiporadiovenci_descripcion(RadioVenciProveConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenciAux));
				radiovenciprove.setTipoRadioVenci(tiporadiovenciAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { 
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { 
					}

					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoRadioVencisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoRadioVenci=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { 
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.removeAllItems();

							for(TipoRadioVenci tiporadiovenci:this.tiporadiovencisForeignKey) {
								this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.addItem(tiporadiovenci);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { 
					}

					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRadioVenci") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.removeAllItems();

							for(TipoRadioVenci tiporadiovenci:this.tiporadiovencisForeignKey) {
								this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.addItem(tiporadiovenci);
							}
						}

						if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoRadioVenciForeignKey(TipoRadioVenci tiporadiovenci,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedItem(tiporadiovenci);
						}
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setSelectedItem(tiporadiovenci);
						} else {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRadioVenciProve() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RadioVenciProveConstantesFunciones.refrescarForeignKeysDescripcionesRadioVenciProve(this.radiovenciproveLogic.getRadioVenciProves());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RadioVenciProveConstantesFunciones.refrescarForeignKeysDescripcionesRadioVenciProve(this.radiovenciproves);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoRadioVenci.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//radiovenciproveLogic.setRadioVenciProves(this.radiovenciproves);
			radiovenciproveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RadioVenciProveParameterReturnGeneral getRadioVenciProveParameterGeneral() {
		return this.radiovenciproveParameterGeneral;
	}
	
	public void setRadioVenciProveParameterGeneral(RadioVenciProveParameterReturnGeneral radiovenciproveParameterGeneral) {
		this.radiovenciproveParameterGeneral = radiovenciproveParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRadioVenciProve() {
		return isPermisoTodoRadioVenciProve;
	}

	public void setIsPermisoTodoRadioVenciProve(Boolean isPermisoTodoRadioVenciProve) {
		this.isPermisoTodoRadioVenciProve = isPermisoTodoRadioVenciProve;
	}

	public Boolean getIsPermisoNuevoRadioVenciProve() {
		return isPermisoNuevoRadioVenciProve;
	}

	public void setIsPermisoNuevoRadioVenciProve(Boolean isPermisoNuevoRadioVenciProve) {
		this.isPermisoNuevoRadioVenciProve = isPermisoNuevoRadioVenciProve;
	}

	public Boolean getIsPermisoActualizarRadioVenciProve() {
		return isPermisoActualizarRadioVenciProve;
	}

	public void setIsPermisoActualizarRadioVenciProve(Boolean isPermisoActualizarRadioVenciProve) {
		this.isPermisoActualizarRadioVenciProve = isPermisoActualizarRadioVenciProve;
	}

	public Boolean getIsPermisoEliminarRadioVenciProve() {
		return isPermisoEliminarRadioVenciProve;
	}

	public void setIsPermisoEliminarRadioVenciProve(Boolean isPermisoEliminarRadioVenciProve) {
		this.isPermisoEliminarRadioVenciProve = isPermisoEliminarRadioVenciProve;
	}

	public Boolean getIsPermisoGuardarCambiosRadioVenciProve() {
		return isPermisoGuardarCambiosRadioVenciProve;
	}

	public void setIsPermisoGuardarCambiosRadioVenciProve(Boolean isPermisoGuardarCambiosRadioVenciProve) {
		this.isPermisoGuardarCambiosRadioVenciProve = isPermisoGuardarCambiosRadioVenciProve;
	}
	
	public Boolean getIsPermisoConsultaRadioVenciProve() {
		return isPermisoConsultaRadioVenciProve;
	}

	public void setIsPermisoConsultaRadioVenciProve(Boolean isPermisoConsultaRadioVenciProve) {
		this.isPermisoConsultaRadioVenciProve = isPermisoConsultaRadioVenciProve;
	}

	public Boolean getIsPermisoBusquedaRadioVenciProve() {
		return isPermisoBusquedaRadioVenciProve;
	}

	public void setIsPermisoBusquedaRadioVenciProve(Boolean isPermisoBusquedaRadioVenciProve) {
		this.isPermisoBusquedaRadioVenciProve = isPermisoBusquedaRadioVenciProve;
	}

	public Boolean getIsPermisoReporteRadioVenciProve() {
		return isPermisoReporteRadioVenciProve;
	}

	public void setIsPermisoReporteRadioVenciProve(Boolean isPermisoReporteRadioVenciProve) {
		this.isPermisoReporteRadioVenciProve = isPermisoReporteRadioVenciProve;
	}
	
	public Boolean getIsPermisoPaginacionMedioRadioVenciProve() {
		return isPermisoPaginacionMedioRadioVenciProve;
	}

	public void setIsPermisoPaginacionMedioRadioVenciProve(Boolean isPermisoPaginacionMedioRadioVenciProve) {
		this.isPermisoPaginacionMedioRadioVenciProve = isPermisoPaginacionMedioRadioVenciProve;
	}
	
	public Boolean getIsPermisoPaginacionTodoRadioVenciProve() {
		return isPermisoPaginacionTodoRadioVenciProve;
	}

	public void setIsPermisoPaginacionTodoRadioVenciProve(Boolean isPermisoPaginacionTodoRadioVenciProve) {
		this.isPermisoPaginacionTodoRadioVenciProve = isPermisoPaginacionTodoRadioVenciProve;
	}
	
	public Boolean getIsPermisoPaginacionAltoRadioVenciProve() {
		return isPermisoPaginacionAltoRadioVenciProve;
	}

	public void setIsPermisoPaginacionAltoRadioVenciProve(Boolean isPermisoPaginacionAltoRadioVenciProve) {
		this.isPermisoPaginacionAltoRadioVenciProve = isPermisoPaginacionAltoRadioVenciProve;
	}
	
	public Boolean getIsPermisoCopiarRadioVenciProve() {
		return isPermisoCopiarRadioVenciProve;
	}

	public void setIsPermisoCopiarRadioVenciProve(Boolean isPermisoCopiarRadioVenciProve) {
		this.isPermisoCopiarRadioVenciProve = isPermisoCopiarRadioVenciProve;
	}
	
	public Boolean getIsPermisoVerFormRadioVenciProve() {
		return isPermisoVerFormRadioVenciProve;
	}

	public void setIsPermisoVerFormRadioVenciProve(Boolean isPermisoVerFormRadioVenciProve) {
		this.isPermisoVerFormRadioVenciProve = isPermisoVerFormRadioVenciProve;
	}
	
	public Boolean getIsPermisoDuplicarRadioVenciProve() {
		return isPermisoDuplicarRadioVenciProve;
	}

	public void setIsPermisoDuplicarRadioVenciProve(Boolean isPermisoDuplicarRadioVenciProve) {
		this.isPermisoDuplicarRadioVenciProve = isPermisoDuplicarRadioVenciProve;
	}
	
	public Boolean getIsPermisoOrdenRadioVenciProve() {
		return isPermisoOrdenRadioVenciProve;
	}

	public void setIsPermisoOrdenRadioVenciProve(Boolean isPermisoOrdenRadioVenciProve) {
		this.isPermisoOrdenRadioVenciProve = isPermisoOrdenRadioVenciProve;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRadioVenciProve() {
		return isVisibilidadCeldaNuevoRadioVenciProve;
	}

	public void setIsVisibilidadCeldaNuevoRadioVenciProve(Boolean isVisibilidadCeldaNuevoRadioVenciProve) {
		this.isVisibilidadCeldaNuevoRadioVenciProve = isVisibilidadCeldaNuevoRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRadioVenciProve() {
		return isVisibilidadCeldaDuplicarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaDuplicarRadioVenciProve(Boolean isVisibilidadCeldaDuplicarRadioVenciProve) {
		this.isVisibilidadCeldaDuplicarRadioVenciProve = isVisibilidadCeldaDuplicarRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRadioVenciProve() {
		return isVisibilidadCeldaCopiarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaCopiarRadioVenciProve(Boolean isVisibilidadCeldaCopiarRadioVenciProve) {
		this.isVisibilidadCeldaCopiarRadioVenciProve = isVisibilidadCeldaCopiarRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRadioVenciProve() {
		return isVisibilidadCeldaVerFormRadioVenciProve;
	}

	public void setIsVisibilidadCeldaVerFormRadioVenciProve(Boolean isVisibilidadCeldaVerFormRadioVenciProve) {
		this.isVisibilidadCeldaVerFormRadioVenciProve = isVisibilidadCeldaVerFormRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRadioVenciProve() {
		return isVisibilidadCeldaOrdenRadioVenciProve;
	}

	public void setIsVisibilidadCeldaOrdenRadioVenciProve(Boolean isVisibilidadCeldaOrdenRadioVenciProve) {
		this.isVisibilidadCeldaOrdenRadioVenciProve = isVisibilidadCeldaOrdenRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRadioVenciProve() {
		return isVisibilidadCeldaNuevoRelacionesRadioVenciProve;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRadioVenciProve(Boolean isVisibilidadCeldaNuevoRelacionesRadioVenciProve) {
		this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve = isVisibilidadCeldaNuevoRelacionesRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRadioVenciProve() {
		return isVisibilidadCeldaModificarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaModificarRadioVenciProve(Boolean isVisibilidadCeldaModificarRadioVenciProve) {
		this.isVisibilidadCeldaModificarRadioVenciProve = isVisibilidadCeldaModificarRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRadioVenciProve() {
		return isVisibilidadCeldaActualizarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaActualizarRadioVenciProve(Boolean isVisibilidadCeldaActualizarRadioVenciProve) {
		this.isVisibilidadCeldaActualizarRadioVenciProve = isVisibilidadCeldaActualizarRadioVenciProve;
	}

	public Boolean getIsVisibilidadCeldaEliminarRadioVenciProve() {
		return isVisibilidadCeldaEliminarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaEliminarRadioVenciProve(Boolean isVisibilidadCeldaEliminarRadioVenciProve) {
		this.isVisibilidadCeldaEliminarRadioVenciProve = isVisibilidadCeldaEliminarRadioVenciProve;
	}

	public Boolean getIsVisibilidadCeldaCancelarRadioVenciProve() {
		return isVisibilidadCeldaCancelarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaCancelarRadioVenciProve(Boolean isVisibilidadCeldaCancelarRadioVenciProve) {
		this.isVisibilidadCeldaCancelarRadioVenciProve = isVisibilidadCeldaCancelarRadioVenciProve;
	}

	public Boolean getIsVisibilidadCeldaGuardarRadioVenciProve() {
		return isVisibilidadCeldaGuardarRadioVenciProve;
	}

	public void setIsVisibilidadCeldaGuardarRadioVenciProve(Boolean isVisibilidadCeldaGuardarRadioVenciProve) {
		this.isVisibilidadCeldaGuardarRadioVenciProve = isVisibilidadCeldaGuardarRadioVenciProve;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRadioVenciProve() {
		return isVisibilidadCeldaGuardarCambiosRadioVenciProve;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRadioVenciProve(Boolean isVisibilidadCeldaGuardarCambiosRadioVenciProve) {
		this.isVisibilidadCeldaGuardarCambiosRadioVenciProve = isVisibilidadCeldaGuardarCambiosRadioVenciProve;
	}
		
	public RadioVenciProveSessionBean getradiovenciproveSessionBean() {
		return this.radiovenciproveSessionBean;
	}
	
	public void setradiovenciproveSessionBean(RadioVenciProveSessionBean radiovenciproveSessionBean) {
		this.radiovenciproveSessionBean=radiovenciproveSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoRadioVenci() {
		return this.isVisibilidadFK_IdTipoRadioVenci;
	}

	public void setisVisibilidadFK_IdTipoRadioVenci(Boolean isVisibilidadFK_IdTipoRadioVenci) {
		this.isVisibilidadFK_IdTipoRadioVenci=isVisibilidadFK_IdTipoRadioVenci;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(RadioVenciProve radiovenciprove)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(radiovenciprove,null);
				this.setActualParaGuardarTipoRadioVenciForeignKey(radiovenciprove,null);
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
	
	public void bugActualizarReferenciaActual(RadioVenciProve radiovenciprove,RadioVenciProve radiovenciproveAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRadioVenciProve(radiovenciprove);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		radiovenciproveAux.setId(radiovenciprove.getId());
		radiovenciproveAux.setVersionRow(radiovenciprove.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRadioVenciProve();
		
			int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = radiovenciproveValidator.getInvalidValues(this.radiovenciprove);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			radiovenciproveLogic.setDatosCliente(datosCliente);
			radiovenciproveLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				radiovenciproveAux=new  RadioVenciProve();
				
				radiovenciproveAux.setIsNew(true);
				radiovenciproveAux.setIsChanged(true);
				
				radiovenciproveAux.setRadioVenciProveOriginal(this.radiovenciprove);
				
				radiovenciproveAux.setId(this.radiovenciprove.getId());	
				radiovenciproveAux.setVersionRow(this.radiovenciprove.getVersionRow());	
				radiovenciproveAux.setid_empresa(this.radiovenciprove.getid_empresa());	
				radiovenciproveAux.setid_tipo_radio_venci(this.radiovenciprove.getid_tipo_radio_venci());	
				radiovenciproveAux.setdia_desde(this.radiovenciprove.getdia_desde());	
				radiovenciproveAux.setdia_hasta(this.radiovenciprove.getdia_hasta());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciproveAux,radiovenciproves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveLogic.saveRadioVenciProves();//WithConnection
						//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);
					
					this.refrescarForeignKeysDescripcionesRadioVenciProve();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciproveLogic.saveRadioVenciProveRelaciones(radiovenciproveAux);//WithConnection
								//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(radiovenciproveAux,radiovenciproves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				radiovenciproveAux=new  RadioVenciProve();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado() 
					|| (this.radiovenciproveSessionBean.getEsGuardarRelacionado() && this.radiovenciprove.getId()>=0)) {
						
					radiovenciproveAux.setIsNew(false);
				}
				
				radiovenciproveAux.setIsDeleted(false);
			
				radiovenciproveAux.setId(this.radiovenciprove.getId());	
				radiovenciproveAux.setVersionRow(this.radiovenciprove.getVersionRow());	
				radiovenciproveAux.setid_empresa(this.radiovenciprove.getid_empresa());	
				radiovenciproveAux.setid_tipo_radio_venci(this.radiovenciprove.getid_tipo_radio_venci());	
				radiovenciproveAux.setdia_desde(this.radiovenciprove.getdia_desde());	
				radiovenciproveAux.setdia_hasta(this.radiovenciprove.getdia_hasta());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciproveAux,radiovenciproves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveLogic.saveRadioVenciProves();//WithConnection
						//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);
					
					this.refrescarForeignKeysDescripcionesRadioVenciProve();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciproveLogic.saveRadioVenciProveRelaciones(radiovenciproveAux);//WithConnection
								//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(radiovenciproveAux,radiovenciproves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.radiovenciprove,radiovenciproveAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				radiovenciproveAux=new  RadioVenciProve();
				
				radiovenciproveAux.setIsNew(false);
				radiovenciproveAux.setIsChanged(false);
				
				radiovenciproveAux.setIsDeleted(true);
				
				radiovenciproveAux.setId(this.radiovenciprove.getId());	
				radiovenciproveAux.setVersionRow(this.radiovenciprove.getVersionRow());	
				radiovenciproveAux.setid_empresa(this.radiovenciprove.getid_empresa());	
				radiovenciproveAux.setid_tipo_radio_venci(this.radiovenciprove.getid_tipo_radio_venci());	
				radiovenciproveAux.setdia_desde(this.radiovenciprove.getdia_desde());	
				radiovenciproveAux.setdia_hasta(this.radiovenciprove.getdia_hasta());	
				
				if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.radiovenciproveAux.getId()>=0) {	
						this.radiovenciprovesEliminados.add(radiovenciproveAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciproveAux,radiovenciproves);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveLogic.saveRadioVenciProves();//WithConnection
						//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciproveLogic.saveRadioVenciProveRelaciones(radiovenciproveAux);//WithConnection
								//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
								|| this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(radiovenciproveAux,radiovenciproveLogic.getRadioVenciProves());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(radiovenciproveAux,radiovenciproves);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getRadioVenciProves().addAll(this.radiovenciprovesEliminados);
					
					radiovenciproveLogic.saveRadioVenciProves();//WithConnection
					//radiovenciproveLogic.getSetVersionRowRadioVenciProves();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRadioVenciProve();
				
				this.radiovenciprovesEliminados= new ArrayList<RadioVenciProve>();		
			}
			
			if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dias Vencidos GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.radiovenciprove=radiovenciproveAux;
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
      		//this.finishProcessRadioVenciProve();
      	}
		
	}	
	
	public void actualizarRelaciones(RadioVenciProve radiovenciproveLocal) throws Exception {
		
		if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RadioVenciProve radiovenciproveLocal) throws Exception {	
		if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				radiovenciproveLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRadioVenciDetalleFormJInternalFrame.class)) {
				TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrameLocal=(TipoRadioVenciBeanSwingJInternalFrame) ((TipoRadioVenciDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporadiovenciBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRadioVenci(tiporadiovenciBeanSwingJInternalFrameLocal.gettiporadiovenci(),true);
				tiporadiovenciBeanSwingJInternalFrameLocal.actualizarLista(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci,this.tiporadiovencisForeignKey);

				tiporadiovenciBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci);

				radiovenciproveLocal.setTipoRadioVenci(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci);

				this.addItemDefectoCombosForeignKeyTipoRadioVenci();
				this.cargarCombosFrameTipoRadioVencisForeignKey("Formulario");
				this.setActualTipoRadioVenciForeignKey(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRadioVenciProveActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = radiovenciproveValidator.getInvalidValues(this.radiovenciprove);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RadioVenciProve radiovenciprove,List<RadioVenciProve> radiovenciproves) throws Exception {
		try	{		
			RadioVenciProveConstantesFunciones.actualizarLista(radiovenciprove,radiovenciproves,this.radiovenciproveSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RadioVenciProve radiovenciprove,List<RadioVenciProve> radiovenciproves) throws Exception {
		try	{			
			RadioVenciProveConstantesFunciones.actualizarSelectedLista(radiovenciprove,radiovenciproves);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RadioVenciProve> radiovenciprovesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				radiovenciprovesLocal=this.radiovenciproveLogic.getRadioVenciProves();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				radiovenciprovesLocal=this.radiovenciproves;
			}
			//ARCHITECTURE
		
			for(RadioVenciProve radiovenciproveLocal:radiovenciprovesLocal) {
				if(this.permiteMantenimiento(radiovenciproveLocal) && radiovenciproveLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RadioVenciProveConstantesFunciones.getRadioVenciProveLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RadioVenciProveConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabelid_empresaRadioVenciProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciProveConstantesFunciones.IDTIPORADIOVENCI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabelid_tipo_radio_venciRadioVenciProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciProveConstantesFunciones.DIADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_desdeRadioVenciProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciProveConstantesFunciones.DIAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_hastaRadioVenciProve,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciProve.jLabelid_empresaRadioVenciProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciProve.jLabelid_tipo_radio_venciRadioVenciProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_desdeRadioVenciProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_hastaRadioVenciProve,"");
		
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
		this.iIdNuevoRadioVenciProve--;	
		
		
		this.radiovenciproveAux=new RadioVenciProve();
		
		this.radiovenciproveAux.setId(this.iIdNuevoRadioVenciProve);
		this.radiovenciproveAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.radiovenciproveLogic.getRadioVenciProves().add(this.radiovenciproveAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.radiovenciproves.add(this.radiovenciproveAux);
		}
		//ARCHITECTURE
		
		this.radiovenciprove=this.radiovenciproveAux;
		
		if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRadioVenciProve(this.radiovenciprove);
			this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciProve(this.radiovenciprove);
		}
				
		//this.setDefaultControlesRadioVenciProve();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRadioVenciProve();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRadioVenciProve();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciProve();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRadioVenciProve(this.radiovenciproveBean,this.radiovenciprove,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RadioVenciProveConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
			classes=RadioVenciProveConstantesFunciones.getClassesRelationshipsOfRadioVenciProve(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.radiovenciproveReturnGeneral=radiovenciproveLogic.procesarEventosRadioVenciProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciproveLogic.getRadioVenciProves(),this.radiovenciprove,this.radiovenciproveParameterGeneral,this.isEsNuevoRadioVenciProve,classes);//this.radiovenciproveLogic.getRadioVenciProve()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRadioVenciProve(this.radiovenciproveReturnGeneral,this.radiovenciproveBean,false);
		
		if(this.radiovenciproveReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve());
		}
		
		if(this.radiovenciproveReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve(),classes);//this.radiovenciproveBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRadioVenciProve();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRadioVenciProve();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.RecargarFormRadioVenciProve(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRadioVenciProve(false);
						
			if(radiovenciproveSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciProve();
			}
			
			this.actualizarVisualTableDatosRadioVenciProve();
			
			this.jTableDatosRadioVenciProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciProve(), this.getIndiceNuevoRadioVenciProve());
			
			this.seleccionarFilaTablaRadioVenciProveActual();
						
			this.actualizarEstadoCeldasBotonesRadioVenciProve("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRadioVenciProve(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setEnabled(isHabilitar && this.radiovenciproveConstantesFunciones.activardia_desdeRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setEnabled(isHabilitar && this.radiovenciproveConstantesFunciones.activardia_hastaRadioVenciProve);	
		//
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setEnabled(isHabilitar && this.radiovenciproveConstantesFunciones.activarid_empresaRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setEnabled(isHabilitar && this.radiovenciproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciProve);
	};
	
	public void setDefaultControlesRadioVenciProve() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRadioVenciProve(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.radiovenciproveSessionBean.setConGuardarRelaciones(true);			
			this.radiovenciproveSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.setVisible(true);
			
					
		} else {
			//this.radiovenciproveSessionBean.setConGuardarRelaciones(false);			
			this.radiovenciproveSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRadioVenciProve() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
				if(radiovenciproveAux.getId().equals(this.iIdNuevoRadioVenciProve)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproves) {
				if(radiovenciproveAux.getId().equals(this.iIdNuevoRadioVenciProve)) {
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
	
	public int getIndiceActualRadioVenciProve(RadioVenciProve radiovenciprove,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
				if(radiovenciproveAux.getId().equals(radiovenciprove.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproves) {
				if(radiovenciproveAux.getId().equals(radiovenciprove.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRadioVenciProve(RadioVenciProve radiovenciproveOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
				if(radiovenciproveAux.getRadioVenciProveOriginal().getId().equals(radiovenciproveOriginal.getId())) {
					existe=true;
					radiovenciproveOriginal.setId(radiovenciproveAux.getId());
					radiovenciproveOriginal.setVersionRow(radiovenciproveAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciProve radiovenciproveAux:this.radiovenciproves) {
				if(radiovenciproveAux.getRadioVenciProveOriginal().getId().equals(radiovenciproveOriginal.getId())) {
					existe=true;
					radiovenciproveOriginal.setId(radiovenciproveAux.getId());
					radiovenciproveOriginal.setVersionRow(radiovenciproveAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRadioVenciProve(Boolean esParaCancelar) throws Exception {
		radiovenciprovesAux=new ArrayList<RadioVenciProve>();
		radiovenciproveAux=new RadioVenciProve();
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
					if(radiovenciproveAux.getId()<0) {
						radiovenciprovesAux.add(radiovenciproveAux);
					}		
				}
				this.iIdNuevoRadioVenciProve=0L;
				this.radiovenciproveLogic.getRadioVenciProves().removeAll(radiovenciprovesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciProve radiovenciproveAux:this.radiovenciproves) {
					if(radiovenciproveAux.getId()<0) {
						radiovenciprovesAux.add(radiovenciproveAux);
					}		
				}
				this.iIdNuevoRadioVenciProve=0L;
				this.radiovenciproves.removeAll(radiovenciprovesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRadioVenciProve 
					&& this.radiovenciproveLogic.getRadioVenciProves().size()>0
					) {
					radiovenciproveAux=this.radiovenciproveLogic.getRadioVenciProves().get(this.radiovenciproveLogic.getRadioVenciProves().size() - 1);
				
					if(radiovenciproveAux.getId()<0) {
						this.radiovenciproveLogic.getRadioVenciProves().remove(radiovenciproveAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRadioVenciProve && this.radiovenciproves.size()>0) {
					radiovenciproveAux=this.radiovenciproves.get(this.radiovenciproves.size() - 1);
				
					if(radiovenciproveAux.getId()<0) {
						this.radiovenciproves.remove(radiovenciproveAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRadioVenciProve(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(radiovenciprove.getId()<0) {
				this.radiovenciproveLogic.getRadioVenciProves().remove(this.radiovenciprove);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(radiovenciprove.getId()<0) {
				this.radiovenciproves.remove(this.radiovenciprove);
			}
		}			
	}
	
	public void setEstadosInicialesRadioVenciProve(List<RadioVenciProve> radiovenciprovesAux) throws Exception {
		RadioVenciProveConstantesFunciones.setEstadosInicialesRadioVenciProve(radiovenciprovesAux);
	}
	
	public void setEstadosInicialesRadioVenciProve(RadioVenciProve radiovenciproveAux) throws Exception {
		RadioVenciProveConstantesFunciones.setEstadosInicialesRadioVenciProve(radiovenciproveAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRadioVenciProveActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRadioVenciProveActual()) {
				if(!this.isEsNuevoRadioVenciProve) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRadioVenciProve=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRadioVenciProveActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dias Vencidos ?", "MANTENIMIENTO DE Dias Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RadioVenciProve radiovenciprove) throws Exception {
		RadioVenciProveConstantesFunciones.seleccionarAsignar(this.radiovenciprove,radiovenciprove);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRadioVenciProve=this.isPermisoActualizarOriginalRadioVenciProve;
			
			
			this.seleccionarAsignar(radiovenciprove);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RadioVenciProveConstantesFunciones.quitarEspaciosRadioVenciProve(this.radiovenciprove,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRadioVenciProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.radiovenciproveSessionBean.setsFuncionBusquedaRapida(this.radiovenciproveSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRadioVenciProve) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRadioVenciProve(esParaCancelar);				
				this.cancelarNuevoRadioVenciProve(esParaCancelar);								
			}
			
			this.radiovenciprove=new RadioVenciProve();
			
			this.inicializarRadioVenciProve();
			
			this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRadioVenciProve() throws Exception {
		try {
			RadioVenciProveConstantesFunciones.inicializarRadioVenciProve(this.radiovenciprove);
			
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
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.radiovenciproveLogic.getRadioVenciProves().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRadioVenciProves(String sAccionBusqueda,List<RadioVenciProve> radiovenciprovesParaReportes) throws Exception {
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
					sPathReporteFinal="RadioVenciProve"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RadioVenciProveMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RadioVenciProveMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RadioVenciProve"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dias Vencidoss");		
		parameters.put("busquedapor", RadioVenciProveConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRadioVenciProve=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RadioVenciProveConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RadioVenciProveConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRadioVenciProve=new JRBeanArrayDataSource(RadioVenciProveJInternalFrame.TraerRadioVenciProveBeans(radiovenciprovesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRadioVenciProve);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RadioVenciProveConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RadioVenciProveConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RadioVenciProveBean.TraerRadioVenciProveBeans(radiovenciprovesParaReportes).toArray()));
							
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
				this.generarExcelReporteRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRadioVenciProveActionPerformed(null);
					//this.generarExcelReporteRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRadioVenciProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciprovesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRadioVenciProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciProve> radiovenciprovesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciProves");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRadioVenciProve("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RadioVenciProve radiovenciprove : radiovenciprovesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RadioVenciProveConstantesFunciones.generarExcelReporteDataRadioVenciProve("NORMAL",row,workbook,radiovenciprove,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRadioVenciProve(String sTipo,Row row,Workbook workbook) {
		
		RadioVenciProveConstantesFunciones.generarExcelReporteHeaderRadioVenciProve(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRadioVenciProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciProve> radiovenciprovesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciProves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RadioVenciProve radiovenciprove : radiovenciprovesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RadioVenciProveConstantesFunciones.getRadioVenciProveDescripcion(radiovenciprove));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciprove.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciprove.gettiporadiovenci_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciProveConstantesFunciones.LABEL_DIADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciprove.getdia_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciprove.getdia_hasta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRadioVenciProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciProve> radiovenciprovesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RadioVenciProve> radiovenciprovesRespaldo=null;
		
		classes=RadioVenciProveConstantesFunciones.getClassesRelationshipsOfRadioVenciProve(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.radiovenciproveLogic.setDatosCliente(this.datosCliente);
		this.radiovenciproveLogic.setDatosDeep(this.datosDeep);
		this.radiovenciproveLogic.setIsConDeep(true);
		
		radiovenciprovesRespaldo=this.radiovenciproveLogic.getRadioVenciProves();
		
		this.radiovenciproveLogic.setRadioVenciProves(radiovenciprovesParaReportes);	
		this.radiovenciproveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		radiovenciprovesParaReportes=this.radiovenciproveLogic.getRadioVenciProves();
		this.radiovenciproveLogic.setRadioVenciProves(radiovenciprovesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciProves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRadioVenciProve("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RadioVenciProve radiovenciprove : radiovenciprovesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRadioVenciProve("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RadioVenciProveConstantesFunciones.generarExcelReporteDataRadioVenciProve("NORMAL",row,workbook,radiovenciprove,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RadioVenciProveConstantesFunciones.getRadioVenciProveDescripcion(radiovenciprove));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciProve.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRadioVenciProve() throws Exception {		
		this.startProcessRadioVenciProve(true);
	}
	
	public void startProcessRadioVenciProve(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRadioVenciProve ,this.jPanelParametrosReportesRadioVenciProve, this.jScrollPanelDatosRadioVenciProve,this.jPanelPaginacionRadioVenciProve, this.jScrollPanelDatosEdicionRadioVenciProve, this.jPanelAccionesRadioVenciProve,this.jPanelAccionesFormularioRadioVenciProve,this.jmenuBarRadioVenciProve,this.jmenuBarDetalleRadioVenciProve,this.jTtoolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve);		
		
		final JTabbedPane jTabbedPaneBusquedasRadioVenciProve=this.jTabbedPaneBusquedasRadioVenciProve; 
		
		final JPanel jPanelParametrosReportesRadioVenciProve=this.jPanelParametrosReportesRadioVenciProve;
		//final JScrollPane jScrollPanelDatosRadioVenciProve=this.jScrollPanelDatosRadioVenciProve;
		final JTable jTableDatosRadioVenciProve=this.jTableDatosRadioVenciProve;		
		final JPanel jPanelPaginacionRadioVenciProve=this.jPanelPaginacionRadioVenciProve;
		//final JScrollPane jScrollPanelDatosEdicionRadioVenciProve=this.jScrollPanelDatosEdicionRadioVenciProve;
		final JPanel jPanelAccionesRadioVenciProve=this.jPanelAccionesRadioVenciProve;
		
		JPanel jPanelCamposAuxiliarRadioVenciProve=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRadioVenciProve=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			jPanelCamposAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jPanelCamposRadioVenciProve;
			jPanelAccionesFormularioAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jPanelAccionesFormularioRadioVenciProve;
		}
		
		final JPanel jPanelCamposRadioVenciProve=jPanelCamposAuxiliarRadioVenciProve;
		final JPanel jPanelAccionesFormularioRadioVenciProve=jPanelAccionesFormularioAuxiliarRadioVenciProve;
		
		
		final JMenuBar jmenuBarRadioVenciProve=this.jmenuBarRadioVenciProve;
		final JToolBar jTtoolBarRadioVenciProve=this.jTtoolBarRadioVenciProve;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRadioVenciProve=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRadioVenciProve=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			jmenuBarDetalleAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jmenuBarDetalleRadioVenciProve;
			jTtoolBarDetalleAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jTtoolBarDetalleRadioVenciProve;
		}
		
		final JMenuBar jmenuBarDetalleRadioVenciProve=jmenuBarDetalleAuxiliarRadioVenciProve;
		final JToolBar jTtoolBarDetalleRadioVenciProve=jTtoolBarDetalleAuxiliarRadioVenciProve;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRadioVenciProve;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRadioVenciProve;
			processRunnable.jTableDatos=jTableDatosRadioVenciProve;
			processRunnable.jPanelCampos=jPanelCamposRadioVenciProve;
			processRunnable.jPanelPaginacion=jPanelPaginacionRadioVenciProve;
			processRunnable.jPanelAcciones=jPanelAccionesRadioVenciProve;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRadioVenciProve;
			
			
			processRunnable.jmenuBar=jmenuBarRadioVenciProve;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRadioVenciProve;
			processRunnable.jTtoolBar=jTtoolBarRadioVenciProve;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRadioVenciProve;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRadioVenciProve ,jPanelParametrosReportesRadioVenciProve,jTableDatosRadioVenciProve, /*jScrollPanelDatosRadioVenciProve,*/jPanelCamposRadioVenciProve,jPanelPaginacionRadioVenciProve, /*jScrollPanelDatosEdicionRadioVenciProve,*/ jPanelAccionesRadioVenciProve,jPanelAccionesFormularioRadioVenciProve,jmenuBarRadioVenciProve,jmenuBarDetalleRadioVenciProve,jTtoolBarRadioVenciProve,jTtoolBarDetalleRadioVenciProve);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRadioVenciProve ,jPanelParametrosReportesRadioVenciProve, jScrollPanelDatosRadioVenciProve,jPanelPaginacionRadioVenciProve, jScrollPanelDatosEdicionRadioVenciProve, jPanelAccionesRadioVenciProve,jPanelAccionesFormularioRadioVenciProve,jmenuBarRadioVenciProve,jmenuBarDetalleRadioVenciProve,jTtoolBarRadioVenciProve,jTtoolBarDetalleRadioVenciProve);
						
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
	
	public void finishProcessRadioVenciProve() {// throws Exception 
		this.finishProcessRadioVenciProve(true);
	}
	
	public void finishProcessRadioVenciProve(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRadioVenciProve ,this.jPanelParametrosReportesRadioVenciProve, this.jScrollPanelDatosRadioVenciProve,this.jPanelPaginacionRadioVenciProve, this.jScrollPanelDatosEdicionRadioVenciProve, this.jPanelAccionesRadioVenciProve,this.jPanelAccionesFormularioRadioVenciProve,this.jmenuBarRadioVenciProve,this.jmenuBarDetalleRadioVenciProve,this.jTtoolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve);		
		
		final JTabbedPane jTabbedPaneBusquedasRadioVenciProve=this.jTabbedPaneBusquedasRadioVenciProve; 
		
		final JPanel jPanelParametrosReportesRadioVenciProve=this.jPanelParametrosReportesRadioVenciProve;
		//final JScrollPane jScrollPanelDatosRadioVenciProve=this.jScrollPanelDatosRadioVenciProve;
		final JTable jTableDatosRadioVenciProve=this.jTableDatosRadioVenciProve;		
		final JPanel jPanelPaginacionRadioVenciProve=this.jPanelPaginacionRadioVenciProve;
		//final JScrollPane jScrollPanelDatosEdicionRadioVenciProve=this.jScrollPanelDatosEdicionRadioVenciProve;
		final JPanel jPanelAccionesRadioVenciProve=this.jPanelAccionesRadioVenciProve;
		
		JPanel jPanelCamposAuxiliarRadioVenciProve=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRadioVenciProve=new JPanel();
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			jPanelCamposAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jPanelCamposRadioVenciProve;
			jPanelAccionesFormularioAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jPanelAccionesFormularioRadioVenciProve;
		}
		
		final JPanel jPanelCamposRadioVenciProve=jPanelCamposAuxiliarRadioVenciProve;
		final JPanel jPanelAccionesFormularioRadioVenciProve=jPanelAccionesFormularioAuxiliarRadioVenciProve;
		
		
		final JMenuBar jmenuBarRadioVenciProve=this.jmenuBarRadioVenciProve;		
		final JToolBar jTtoolBarRadioVenciProve=this.jTtoolBarRadioVenciProve;
				
		JMenuBar jmenuBarDetalleAuxiliarRadioVenciProve=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRadioVenciProve=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			jmenuBarDetalleAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jmenuBarDetalleRadioVenciProve;
			jTtoolBarDetalleAuxiliarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jTtoolBarDetalleRadioVenciProve;		
		}
		
		final JMenuBar jmenuBarDetalleRadioVenciProve=jmenuBarDetalleAuxiliarRadioVenciProve;
		final JToolBar jTtoolBarDetalleRadioVenciProve=jTtoolBarDetalleAuxiliarRadioVenciProve;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRadioVenciProve;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRadioVenciProve;
			processRunnable.jTableDatos=jTableDatosRadioVenciProve;
			processRunnable.jPanelCampos=jPanelCamposRadioVenciProve;
			processRunnable.jPanelPaginacion=jPanelPaginacionRadioVenciProve;
			processRunnable.jPanelAcciones=jPanelAccionesRadioVenciProve;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRadioVenciProve;
			
			
			processRunnable.jmenuBar=jmenuBarRadioVenciProve;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRadioVenciProve;
			processRunnable.jTtoolBar=jTtoolBarRadioVenciProve;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRadioVenciProve;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRadioVenciProve ,jPanelParametrosReportesRadioVenciProve, jTableDatosRadioVenciProve,/*jScrollPanelDatosRadioVenciProve,*/jPanelCamposRadioVenciProve,jPanelPaginacionRadioVenciProve, /*jScrollPanelDatosEdicionRadioVenciProve,*/ jPanelAccionesRadioVenciProve,jPanelAccionesFormularioRadioVenciProve,jmenuBarRadioVenciProve,jmenuBarDetalleRadioVenciProve,jTtoolBarRadioVenciProve,jTtoolBarDetalleRadioVenciProve));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRadioVenciProve(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRadioVenciProve(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRadioVenciProve(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRadioVenciProve(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRadioVenciProve,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRadioVenciProve,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRadioVenciProve(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRadioVenciProve,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRadioVenciProve,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.radiovenciproveConstantesFunciones.getsFinalQueryRadioVenciProve();
		String  finalQueryPaginacionTodos=this.radiovenciproveConstantesFunciones.getsFinalQueryRadioVenciProve();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RadioVenciProveConstantesFunciones.getArrayColumnasGlobalesNoRadioVenciProve(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RadioVenciProveConstantesFunciones.getArrayColumnasGlobalesRadioVenciProve(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RadioVenciProveConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.radiovenciprovesEliminados= new ArrayList<RadioVenciProve>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRadioVenciProve();
		
				///*RadioVenciProveSessionBean*/this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
			
			if(this.radiovenciproveSessionBean==null) {
				this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
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
					this.iNumeroPaginacion=RadioVenciProveConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RadioVenciProveConstantesFunciones.getClassesForeignKeysOfRadioVenciProve(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/radiovenciprove."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			radiovenciprovesAux= new ArrayList<RadioVenciProve>();
			
				
			radiovenciproveLogic.setDatosCliente(this.datosCliente);
			radiovenciproveLogic.setDatosDeep(this.datosDeep);
			radiovenciproveLogic.setIsConDeep(true);
			
			
			radiovenciproveLogic.getRadioVenciProveDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					radiovenciproveLogic.getTodosRadioVenciProves(finalQueryGlobal,pagination);
					
					//radiovenciproveLogic.getTodosRadioVenciProvesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(radiovenciproveLogic.getRadioVenciProves()==null|| radiovenciproveLogic.getRadioVenciProves().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciprovesAux= new ArrayList<RadioVenciProve>();
							radiovenciprovesAux.addAll(radiovenciproveLogic.getRadioVenciProves());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciprovesAux= new ArrayList<RadioVenciProve>();
							radiovenciprovesAux.addAll(radiovenciproves);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciproveLogic.getTodosRadioVenciProves(finalQueryGlobal+"",this.pagination);												
							
							//radiovenciproveLogic.getTodosRadioVenciProvesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRadioVenciProves("Todos",radiovenciproveLogic.getRadioVenciProves() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciproveLogic.setRadioVenciProves(new ArrayList<RadioVenciProve>());					
							radiovenciproveLogic.getRadioVenciProves().addAll(radiovenciprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciproves=new ArrayList<RadioVenciProve>();
							radiovenciproves.addAll(radiovenciprovesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRadioVenciProve=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRadioVenciProve=this.idActual;
				
				} else if(this.idRadioVenciProveActual!=null && this.idRadioVenciProveActual!=0L) {
					idRadioVenciProve=idRadioVenciProveActual;
				}
				
					
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndicePorId(idRadioVenciProve);
				
				this.radiovenciproves=new ArrayList<RadioVenciProve>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					radiovenciproveLogic.getEntity(idRadioVenciProve);
					
					//radiovenciproveLogic.getEntityWithConnection(idRadioVenciProve);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciproveLogic.setRadioVenciProves(new ArrayList<RadioVenciProve>());
					radiovenciproveLogic.getRadioVenciProves().add(radiovenciproveLogic.getRadioVenciProve());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciproves=new ArrayList<RadioVenciProve>();
					this.radiovenciproves.add(radiovenciprove);
				}
				
				if(radiovenciproveLogic.getRadioVenciProve()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					radiovenciproveLogic.getRadioVenciProvesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=radiovenciproveLogic.getRadioVenciProves()==null||radiovenciproveLogic.getRadioVenciProves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=radiovenciproves==null|| radiovenciproves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciprovesAux=new ArrayList<RadioVenciProve>();
						radiovenciprovesAux.addAll(radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciprovesAux=new ArrayList<RadioVenciProve>();
							radiovenciprovesAux.addAll(radiovenciproves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							radiovenciproveLogic.getRadioVenciProvesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRadioVenciProves("FK_IdEmpresa",radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRadioVenciProves("FK_IdEmpresa",radiovenciproves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveLogic.setRadioVenciProves(new ArrayList<RadioVenciProve>());
						radiovenciproveLogic.getRadioVenciProves().addAll(radiovenciprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciproves=new ArrayList<RadioVenciProve>();
							radiovenciproves.addAll(radiovenciprovesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRadioVenci")) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					radiovenciproveLogic.getRadioVenciProvesFK_IdTipoRadioVenci(finalQueryGlobal,pagination,id_tipo_radio_venciFK_IdTipoRadioVenci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=radiovenciproveLogic.getRadioVenciProves()==null||radiovenciproveLogic.getRadioVenciProves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=radiovenciproves==null|| radiovenciproves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciprovesAux=new ArrayList<RadioVenciProve>();
						radiovenciprovesAux.addAll(radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciprovesAux=new ArrayList<RadioVenciProve>();
							radiovenciprovesAux.addAll(radiovenciproves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							radiovenciproveLogic.getRadioVenciProvesFK_IdTipoRadioVenci(finalQueryGlobal,pagination,id_tipo_radio_venciFK_IdTipoRadioVenci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRadioVenciProves("FK_IdTipoRadioVenci",radiovenciproveLogic.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRadioVenciProves("FK_IdTipoRadioVenci",radiovenciproves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveLogic.setRadioVenciProves(new ArrayList<RadioVenciProve>());
						radiovenciproveLogic.getRadioVenciProves().addAll(radiovenciprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciproves=new ArrayList<RadioVenciProve>();
							radiovenciproves.addAll(radiovenciprovesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRadioVenciProve();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRadioVenciProve();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=radiovenciproveLogic.getRadioVenciProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciproves.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=radiovenciproveLogic.getRadioVenciProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciproves.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RadioVenciProve radiovenciprove) {
		Boolean permite=true;
		
		if(this.radiovenciprove.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RadioVenciProveConstantesFunciones.getOrderByListaRadioVenciProve();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RadioVenciProveConstantesFunciones.getOrderByListaRadioVenciProve();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciProve radiovenciprove:radiovenciproveLogic.getRadioVenciProves()) {
				if(radiovenciprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciproveTotales=radiovenciprove;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciProve radiovenciprove:this.radiovenciproves) {
				if(radiovenciprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciproveTotales=radiovenciprove;
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
			this.radiovenciproveAux=new RadioVenciProve();
			this.radiovenciproveAux.setsType(Constantes2.S_TOTALES);
			this.radiovenciproveAux.setIsNew(false);
			this.radiovenciproveAux.setIsChanged(false);
			this.radiovenciproveAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RadioVenciProveConstantesFunciones.TotalizarValoresFilaRadioVenciProve(this.radiovenciproveLogic.getRadioVenciProves(),this.radiovenciproveAux);
				
				this.radiovenciproveLogic.getRadioVenciProves().add(this.radiovenciproveAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RadioVenciProveConstantesFunciones.TotalizarValoresFilaRadioVenciProve(this.radiovenciproves,this.radiovenciproveAux);
				
				this.radiovenciproves.add(this.radiovenciproveAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		radiovenciproveTotales=new RadioVenciProve();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.radiovenciproveLogic.getRadioVenciProves().remove(radiovenciproveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.radiovenciproves.remove(radiovenciproveTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		radiovenciproveTotales=new RadioVenciProve();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciProve radiovenciprove:radiovenciproveLogic.getRadioVenciProves()) {
				if(radiovenciprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciproveTotales=radiovenciprove;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RadioVenciProveConstantesFunciones.TotalizarValoresFilaRadioVenciProve(this.radiovenciproveLogic.getRadioVenciProves(),radiovenciproveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciProve radiovenciprove:this.radiovenciproves) {
				if(radiovenciprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciproveTotales=radiovenciprove;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RadioVenciProveConstantesFunciones.TotalizarValoresFilaRadioVenciProve(this.radiovenciproves,radiovenciproveTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRadioVenciProvesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRadioVenciProvesFK_IdTipoRadioVenci()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRadioVenci";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRadioVenciProvesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciproveLogic.getRadioVenciProvesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRadioVenciProvesFK_IdTipoRadioVenci(String sFinalQuery,Long id_tipo_radio_venci)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciproveLogic.getRadioVenciProvesFK_IdTipoRadioVenci(sFinalQuery,this.pagination,id_tipo_radio_venci);
				
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
	
	public void inicializarPermisosRadioVenciProve() {
		this.isPermisoTodoRadioVenciProve=false;
		this.isPermisoNuevoRadioVenciProve=false;
		this.isPermisoActualizarRadioVenciProve=false;
		this.isPermisoActualizarOriginalRadioVenciProve=false;
		this.isPermisoEliminarRadioVenciProve=false;
		this.isPermisoGuardarCambiosRadioVenciProve=false;
		this.isPermisoConsultaRadioVenciProve=false;
		this.isPermisoBusquedaRadioVenciProve=false;
		this.isPermisoReporteRadioVenciProve=false;		
		this.isPermisoOrdenRadioVenciProve=false;		
		this.isPermisoPaginacionMedioRadioVenciProve=false;		
		this.isPermisoPaginacionAltoRadioVenciProve=false;
		this.isPermisoPaginacionTodoRadioVenciProve=false;
		this.isPermisoCopiarRadioVenciProve=false;		
		this.isPermisoVerFormRadioVenciProve=false;		
		this.isPermisoDuplicarRadioVenciProve=false;		
		this.isPermisoOrdenRadioVenciProve=false;		
	}
	
	public void setPermisosUsuarioRadioVenciProve(Boolean isPermiso) {
		this.isPermisoTodoRadioVenciProve=isPermiso;
		this.isPermisoNuevoRadioVenciProve=isPermiso;
		this.isPermisoActualizarRadioVenciProve=isPermiso;
		this.isPermisoActualizarOriginalRadioVenciProve=isPermiso;
		this.isPermisoEliminarRadioVenciProve=isPermiso;
		this.isPermisoGuardarCambiosRadioVenciProve=isPermiso;
		this.isPermisoConsultaRadioVenciProve=isPermiso;
		this.isPermisoBusquedaRadioVenciProve=isPermiso;
		this.isPermisoReporteRadioVenciProve=isPermiso;
		this.isPermisoOrdenRadioVenciProve=isPermiso;		
		this.isPermisoPaginacionMedioRadioVenciProve=isPermiso;		
		this.isPermisoPaginacionAltoRadioVenciProve=isPermiso;		
		this.isPermisoPaginacionTodoRadioVenciProve=isPermiso;		
		this.isPermisoCopiarRadioVenciProve=isPermiso;		
		this.isPermisoVerFormRadioVenciProve=isPermiso;		
		this.isPermisoDuplicarRadioVenciProve=isPermiso;
		this.isPermisoOrdenRadioVenciProve=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRadioVenciProve(Boolean isPermiso) {
		//this.isPermisoTodoRadioVenciProve=isPermiso;
		this.isPermisoNuevoRadioVenciProve=isPermiso;
		this.isPermisoActualizarRadioVenciProve=isPermiso;
		this.isPermisoActualizarOriginalRadioVenciProve=isPermiso;
		this.isPermisoEliminarRadioVenciProve=isPermiso;
		this.isPermisoGuardarCambiosRadioVenciProve=isPermiso;
		//this.isPermisoConsultaRadioVenciProve=isPermiso;
		//this.isPermisoBusquedaRadioVenciProve=isPermiso;
		//this.isPermisoReporteRadioVenciProve=isPermiso;
		//this.isPermisoOrdenRadioVenciProve=isPermiso;		
		//this.isPermisoPaginacionMedioRadioVenciProve=isPermiso;		
		//this.isPermisoPaginacionAltoRadioVenciProve=isPermiso;		
		//this.isPermisoPaginacionTodoRadioVenciProve=isPermiso;		
		//this.isPermisoCopiarRadioVenciProve=isPermiso;		
		//this.isPermisoDuplicarRadioVenciProve=isPermiso;
		//this.isPermisoOrdenRadioVenciProve=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRadioVenciProveClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RadioVenciProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRadioVenciProve(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRadioVenciProveClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRadioVenciProveClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRadioVenciProveClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRadioVenciProveClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRadioVenciProve() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RadioVenciProveJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RadioVenciProveConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRadioVenciProve=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRadioVenciProve=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRadioVenciProve=this.isPermisoActualizarRadioVenciProve;
			this.isPermisoEliminarRadioVenciProve=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRadioVenciProve=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRadioVenciProve=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRadioVenciProve=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRadioVenciProve=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRadioVenciProve=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRadioVenciProve=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRadioVenciProve=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRadioVenciProve=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRadioVenciProve=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRadioVenciProve=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRadioVenciProve=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRadioVenciProve=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRadioVenciProve=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRadioVenciProve.setToolTipText(this.jTableDatosRadioVenciProve.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRadioVenciProve(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRadioVenciProve(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RadioVenciProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RadioVenciProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRadioVenciProve() throws Exception {
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
	public void inicializarCombosForeignKeyRadioVenciProveListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tiporadiovencisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRadioVenciProveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RadioVenciProveJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRadioVenciProveListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoRadioVenciListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoRadioVenciListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiporadiovencisForeignKey==null||this.tiporadiovencisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoRadioVenciConstantesFunciones.getArrayColumnasGlobalesTipoRadioVenci(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRadioVenciConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoRadioVenciConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoRadioVencisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyRadioVenciProveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RadioVenciProveParameterReturnGeneral radiovenciproveReturnGeneral=new RadioVenciProveParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.radiovenciproveConstantesFunciones.cargarid_empresaRadioVenciProve)
					 || (this.esRecargarFks && this.radiovenciproveConstantesFunciones.cargarid_empresaRadioVenciProve)) {

					if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+radiovenciproveSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoRadioVenci="";

				if(((this.tiporadiovencisForeignKey==null||this.tiporadiovencisForeignKey.size()<=0) && this.radiovenciproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciProve)
					 || (this.esRecargarFks && this.radiovenciproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciProve)) {

					if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRadioVenciConstantesFunciones.getArrayColumnasGlobalesTipoRadioVenci(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRadioVenci=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRadioVenciConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRadioVenci=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRadioVenci, "");
						finalQueryGlobalTipoRadioVenci+=TipoRadioVenciConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRadioVencisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRadioVenci=" WHERE " + ConstantesSql.ID + "="+radiovenciproveSessionBean.getlidTipoRadioVenciActual();
					}
				} else {
					finalQueryGlobalTipoRadioVenci="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				radiovenciproveReturnGeneral=radiovenciproveLogic.cargarCombosLoteForeignKeyRadioVenciProve(finalQueryGlobalEmpresa,finalQueryGlobalTipoRadioVenci);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=radiovenciproveReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoRadioVenci.equals("NONE")) {
				this.tiporadiovencisForeignKey=radiovenciproveReturnGeneral.gettiporadiovencisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRadioVenciProve()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoRadioVenci();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.radiovenciproveSessionBean==null) {
				this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
			}

			if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoRadioVenci()throws Exception {
		try {

			if(!this.radiovenciproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {
				TipoRadioVenci tiporadiovenci=new TipoRadioVenci();
				TipoRadioVenciConstantesFunciones.setTipoRadioVenciDescripcion(tiporadiovenci,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiporadiovenci.setId(null);

				if(!TipoRadioVenciConstantesFunciones.ExisteEnLista(this.tiporadiovencisForeignKey,tiporadiovenci,true)) {

					this.tiporadiovencisForeignKey.add(0,tiporadiovenci);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyRadioVenciProve()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRadioVenciProve(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRadioVenciProve()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciProve();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRadioVenciProve(RadioVenciProve radiovenciprove)throws Exception {	
		try {
			
			this.setActualTipoRadioVenciForeignKey(radiovenciprove.getid_tipo_radio_venci(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRadioVenciProve(RadioVenciProve radiovenciprove,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRadioVenciProve()throws Exception {	
		try {
			
			this.setActualTipoRadioVenciForeignKey(this.radiovenciproveConstantesFunciones.getid_tipo_radio_venci(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciProve()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRadioVenciProve()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRadioVenciProve()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRadioVenciProve()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRadioVenciProve()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoRadioVencisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRadioVenciProve(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRadioVencisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRadioVenciProve()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.getItemCount()>0) {
				this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.getItemCount()>0) {
				this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public RadioVenciProveBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RadioVenciProveBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RadioVenciProveBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.radiovenciproveSessionBean=new RadioVenciProveSessionBean(); 
		this.radiovenciproveConstantesFunciones=new RadioVenciProveConstantesFunciones(); 
		this.radiovenciproveBean=new RadioVenciProve();//(this.radiovenciproveConstantesFunciones); 		
		this.radiovenciproveReturnGeneral=new RadioVenciProveParameterReturnGeneral(); 
		
		this.radiovenciproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RadioVenciProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RadioVenciProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RadioVenciProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRadioVenciProve(true);
			
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
			
			this.radiovenciproveConstantesFunciones=new RadioVenciProveConstantesFunciones(); 
			this.radiovenciproveBean=new RadioVenciProve();//this.radiovenciproveConstantesFunciones); 			
			this.radiovenciproveReturnGeneral=new RadioVenciProveParameterReturnGeneral(); 
		
			RadioVenciProveBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dias Vencidos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.radiovenciprove=new RadioVenciProve();
			this.radiovenciproves = new ArrayList<RadioVenciProve>();
			this.radiovenciprovesAux = new ArrayList<RadioVenciProve>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic=new RadioVenciProveLogic();
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			//this.radiovenciproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.radiovenciproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRadioVenciProve);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRadioVenciProve);	
					}
					
					if(this.jInternalFrameImportacionRadioVenciProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRadioVenciProve);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRadioVenciProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRadioVenciProve);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRadioVenciProve);
				this.jInternalFrameDetalleFormRadioVenciProve.setVisible(false);
				this.jInternalFrameDetalleFormRadioVenciProve.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRadioVenciProve);
					this.jInternalFrameReporteDinamicoRadioVenciProve.setVisible(false);
					this.jInternalFrameReporteDinamicoRadioVenciProve.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRadioVenciProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRadioVenciProve);
					this.jInternalFrameImportacionRadioVenciProve.setVisible(false);
					this.jInternalFrameImportacionRadioVenciProve.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRadioVenciProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRadioVenciProve);
					this.jInternalFrameOrderByRadioVenciProve.setVisible(false);
					this.jInternalFrameOrderByRadioVenciProve.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRadioVenciProveActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RadioVenciProveConstantesFunciones.INUMEROPAGINACION;
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
			
			this.radiovenciproveReturnGeneral=new RadioVenciProveParameterReturnGeneral();
			
			this.radiovenciproveParameterGeneral=new RadioVenciProveParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.radiovenciproveLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RadioVenciProveJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RadioVenciProveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.radiovenciproveSessionBean.getEsGuardarRelacionado(),this.radiovenciproveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RadioVenciProveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.radiovenciproveSessionBean.getEsGuardarRelacionado(),this.radiovenciproveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaDuplicarRadioVenciProve=true;
			this.isVisibilidadCeldaCopiarRadioVenciProve=true;
			this.isVisibilidadCeldaVerFormRadioVenciProve=true;
			this.isVisibilidadCeldaOrdenRadioVenciProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoRadioVenci=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRadioVenciProve();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRadioVenciProve(false);
			
			this.setPermisosUsuarioRadioVenciProve();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado() 
				|| (this.radiovenciproveSessionBean.getEsGuardarRelacionado() && this.radiovenciproveSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRadioVenciProveClasesRelacionadas();
			}
			
			if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRadioVenciProveClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRadioVenciProve();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRadioVenciProve();
			}
			
			if(!this.isPermisoBusquedaRadioVenciProve) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRadioVenciProve,this.isPermisoPaginacionMedioRadioVenciProve,this.isPermisoPaginacionTodoRadioVenciProve);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RadioVenciProveConstantesFunciones.getTiposSeleccionarRadioVenciProve());
				
				this.tiposColumnasSelect=RadioVenciProveConstantesFunciones.getTiposSeleccionarRadioVenciProve(true);
				
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
			//if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRadioVenciProve();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRadioVenciProve(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRadioVenciProve(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciProve() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.tiporadiovenciLogic=new TipoRadioVenciLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				radiovenciproveImplementable= (RadioVenciProveImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RadioVenciProveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				radiovenciproveImplementableHome= (RadioVenciProveImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RadioVenciProveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.radiovenciproves= new ArrayList<RadioVenciProve>();
			this.radiovenciprovesEliminados= new ArrayList<RadioVenciProve>();
						
			this.isEsNuevoRadioVenciProve=false;
			this.esParaAccionDesdeFormularioRadioVenciProve=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tiporadiovencisForeignKey=new ArrayList<TipoRadioVenci>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRadioVenciProve(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRadioVenciProve();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RadioVenciProveBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RadioVenciProveConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRadioVenciProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRadioVenciProve(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRadioVenciProve();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRadioVenciProve();
			}
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRadioVenciProve.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRadioVenciProve.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRadioVenciProve.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRadioVenciProve(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RadioVenciProve: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRadioVenciProve() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRadioVenciProve")) {
				iIndex=this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRadioVenciProve();	
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
	
	public void cargarCombosForeignKeyRadioVenciProve(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRadioVenciProve(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRadioVenciProve(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRadioVenciProveListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRadioVenciProve();
		
		this.cargarCombosFrameForeignKeyRadioVenciProve();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRadioVenciProve();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRadioVenciProve();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoRadioVenci(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoRadioVenciListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoRadioVenci();
				this.cargarCombosFrameTipoRadioVencisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoRadioVenci(this.tiporadiovencisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoRadioVenciProveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			
			if(jTableDatosRadioVenciProve.getRowCount()>=1) {
				jTableDatosRadioVenciProve.removeRowSelectionInterval(0, jTableDatosRadioVenciProve.getRowCount()-1);						
			}
			
			this.isEsNuevoRadioVenciProve=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRadioVenciProve(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRadioVenciProve(true);			
			//this.radiovenciprove=new RadioVenciProve();
			//this.radiovenciprove.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciProve(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciProve() ;
			
			if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciProve(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.radiovenciprove);	
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);				
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RadioVenciProve: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRadioVenciProveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRadioVenciProve.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRadioVenciProve.getSelectedRows().length;			
			}
			
			radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRadioVenciProve--;			
				//RadioVenciProve radiovenciproveAux= new RadioVenciProve();			
				//radiovenciproveAux.setId(this.iIdNuevoRadioVenciProve);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RadioVenciProve radiovenciproveOrigen=new RadioVenciProve();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RadioVenciProve radiovenciproveOrigen : radiovenciprovesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							radiovenciproveOrigen =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciproveOrigen =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRadioVenciProve();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.radiovenciprove.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRadioVenciProve(radiovenciproveOrigen,this.radiovenciprove,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.radiovenciproveLogic.getRadioVenciProves().add(this.radiovenciproveAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.radiovenciproves.add(this.radiovenciproveAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
				
				this.jTableDatosRadioVenciProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciProve(), this.getIndiceNuevoRadioVenciProve());
				
				int iLastRow =  this.jTableDatosRadioVenciProve.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRadioVenciProve.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRadioVenciProve.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciProve(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();									
		
			RadioVenciProve radiovenciproveOrigen=new RadioVenciProve();
			RadioVenciProve radiovenciproveDestino=new RadioVenciProve();
				
			radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRadioVenciProve.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || radiovenciprovesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRadioVenciProve.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveOrigen =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						radiovenciproveOrigen =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciproveDestino =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						radiovenciproveDestino =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				radiovenciproveOrigen =radiovenciprovesSeleccionados.get(0);
				radiovenciproveDestino =radiovenciprovesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRadioVenciProve(radiovenciproveOrigen,radiovenciproveDestino,true,false);
				
				radiovenciproveDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(radiovenciproveDestino,radiovenciproveLogic.getRadioVenciProves());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciproveDestino,radiovenciproves);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
				
				//this.jTableDatosRadioVenciProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciProve(), this.getIndiceNuevoRadioVenciProve());
				
				int iLastRow =  this.jTableDatosRadioVenciProve.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRadioVenciProve.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRadioVenciProve.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciProve(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRadioVenciProve.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRadioVenciProve.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRadioVenciProve.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRadioVenciProve.setVisible(!isVisible);
			this.jPanelPaginacionRadioVenciProve.setVisible(!isVisible);
			this.jPanelAccionesRadioVenciProve.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRadioVenciProve();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRadioVenciProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRadioVenciProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRadioVenciProve();
			
			this.abrirFrameOrderByRadioVenciProve();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRadioVenciProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRadioVenciProve(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRadioVenciProve);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRadioVenciProve.isMaximum()) {
					this.jInternalFrameDetalleFormRadioVenciProve.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRadioVenciProve.setSize(this.jInternalFrameDetalleFormRadioVenciProve.iWidthFormulario,this.jInternalFrameDetalleFormRadioVenciProve.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRadioVenciProve.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRadioVenciProve.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRadioVenciProve.isMaximum()) {
						this.jInternalFrameDetalleFormRadioVenciProve.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRadioVenciProve.jContentPaneDetalleRadioVenciProve.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciProve.jContentPaneDetalleRadioVenciProve.getWidth(),RadioVenciProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciProve.jContentPaneDetalleRadioVenciProve.getWidth(),RadioVenciProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciProve.jContentPaneDetalleRadioVenciProve.getWidth(),RadioVenciProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRadioVenciProve.setVisible(true);
	        this.jInternalFrameDetalleFormRadioVenciProve.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRadioVenciProve() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRadioVenciProve==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRadioVenciProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciProve,false,this);
				} else {
					this.jInternalFrameOrderByRadioVenciProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciProve,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRadioVenciProve);
				this.jInternalFrameOrderByRadioVenciProve.setVisible(false);
				this.jInternalFrameOrderByRadioVenciProve.setSelected(false);
				
				this.jInternalFrameOrderByRadioVenciProve.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRadioVenciProve"));
				
				this.inicializarActualizarBindingTablaOrderByRadioVenciProve();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRadioVenciProve() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRadioVenciProve==null) {
				
				this.jInternalFrameImportacionRadioVenciProve=new ImportacionJInternalFrame(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRadioVenciProve);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRadioVenciProve);
				this.jInternalFrameImportacionRadioVenciProve.setVisible(false);
				this.jInternalFrameImportacionRadioVenciProve.setSelected(false);


				this.jInternalFrameImportacionRadioVenciProve.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRadioVenciProve"));
				this.jInternalFrameImportacionRadioVenciProve.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRadioVenciProve"));
				this.jInternalFrameImportacionRadioVenciProve.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRadioVenciProve"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRadioVenciProve() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRadioVenciProve==null) {
				this.jInternalFrameReporteDinamicoRadioVenciProve=new ReporteDinamicoJInternalFrame(RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRadioVenciProve);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRadioVenciProve);
				this.jInternalFrameReporteDinamicoRadioVenciProve.setVisible(false);
				this.jInternalFrameReporteDinamicoRadioVenciProve.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciProve"));
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciProve"));
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciProve"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciProve();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRadioVenciProve() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRadioVenciProve);
			
	       	this.jInternalFrameDetalleFormRadioVenciProve.setVisible(false);
	        this.jInternalFrameDetalleFormRadioVenciProve.setSelected(false);
			
			//this.jInternalFrameDetalleFormRadioVenciProve.dispose();
			//this.jInternalFrameDetalleFormRadioVenciProve=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRadioVenciProve() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRadioVenciProve.setVisible(true);
	        this.jInternalFrameReporteDinamicoRadioVenciProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRadioVenciProve() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRadioVenciProve.setVisible(true);
	        this.jInternalFrameImportacionRadioVenciProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRadioVenciProve() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRadioVenciProve.setVisible(true);
	        this.jInternalFrameOrderByRadioVenciProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRadioVenciProve() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRadioVenciProve.setVisible(false);
	        this.jInternalFrameOrderByRadioVenciProve.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRadioVenciProve() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRadioVenciProve.setVisible(false);
	        this.jInternalFrameReporteDinamicoRadioVenciProve.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRadioVenciProve() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRadioVenciProve.setVisible(false);
	        this.jInternalFrameImportacionRadioVenciProve.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRadioVenciProve(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRadioVenciProve(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRadioVenciProve(true);
			//this.isEsNuevoRadioVenciProve=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRadioVenciProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciProve(false) ;
			
			if(radiovenciproveSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciProve(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciProve(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRadioVenciProveActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRadioVenciProve(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRadioVenciProve(true);
			//this.isEsNuevoRadioVenciProve=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.radiovenciprove.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRadioVenciProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRadioVenciProve(false) ;
			
			if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciProve(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciProve(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoRadioVenci(List<TipoRadioVenci> tiporadiovencisForeignKey)throws Exception{
		TableColumn tableColumnTipoRadioVenci=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI));
		TableCellEditor tableCellEditorTipoRadioVenci =tableColumnTipoRadioVenci.getCellEditor();

		TipoRadioVenciTableCell tiporadiovenciTableCellFk=(TipoRadioVenciTableCell)tableCellEditorTipoRadioVenci;

		if(tiporadiovenciTableCellFk!=null) {
			tiporadiovenciTableCellFk.settiporadiovencisForeignKey(tiporadiovencisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRadioVenciProve.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporadiovenciTableCellFk.setRowActual(intSelectedRow);
			//tiporadiovenciTableCellFk.settiporadiovencisForeignKeyActual(tiporadiovencisForeignKey);
		//}


		if(tiporadiovenciTableCellFk!=null) {
			tiporadiovenciTableCellFk.RecargarTipoRadioVencisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRadioVenciProve(false);
			
			//if(!this.isEsNuevoRadioVenciProve) {								
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				
			}
			
			if(this.permiteMantenimiento(this.radiovenciprove)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRadioVenciProve=true;
					this.inicializarActualizarBindingTablaRadioVenciProve(false);
					this.isEsNuevoRadioVenciProve=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRadioVenciProve=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRadioVenciProve=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRadioVenciProve(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciProve(false);
				
				this.habilitarDeshabilitarControlesRadioVenciProve(false);
			
												
				
				if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRadioVenciProve();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRadioVenciProveActionPerformed(evt,radiovenciproveSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRadioVenciProve(this.radiovenciprove,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRadioVenciProve.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,radiovenciproveSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.radiovenciprove.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				this.radiovenciprove.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				this.radiovenciprove.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.radiovenciprove)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RadioVenciProveModel) this.jTableDatosRadioVenciProve.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRadioVenciProve=true;
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
				this.isEsNuevoRadioVenciProve=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRadioVenciProve(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciProve(false);
				
				this.habilitarDeshabilitarControlesRadioVenciProve(false);
				
				
				
				if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRadioVenciProve();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRadioVenciProve.getRowCount()>=1) {
				jTableDatosRadioVenciProve.removeRowSelectionInterval(0, jTableDatosRadioVenciProve.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRadioVenciProve(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRadioVenciProve(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciProve(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciProve(false) ;
			
			this.isEsNuevoRadioVenciProve=false;
			
			if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRadioVenciProve();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRadioVenciProve(false);
				
				//SI ES MANUAL
				if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRadioVenciProve();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRadioVenciProve--;			
			//RadioVenciProve radiovenciproveAux= new RadioVenciProve();			
			//radiovenciproveAux.setId(this.iIdNuevoRadioVenciProve);
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRadioVenciProve();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
			
			this.radiovenciprove.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.radiovenciproveLogic.getRadioVenciProves().add(this.radiovenciproveAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.radiovenciproves.add(this.radiovenciproveAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRadioVenciProve(false);
			
			this.jTableDatosRadioVenciProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciProve(), this.getIndiceNuevoRadioVenciProve());
			
			int iLastRow =  this.jTableDatosRadioVenciProve.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRadioVenciProve.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRadioVenciProve.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciProve(false);
			
			//SI ES MANUAL
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciProve();
			}
			
			//this.abrirFrameTreeRadioVenciProve();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dias VencidosS ?", "MANTENIMIENTO DE Dias Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRadioVenciProve.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRadioVenciProve();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.radiovenciproveReturnGeneral=radiovenciproveLogic.procesarImportacionRadioVenciProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.radiovenciproveParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRadioVenciProveReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRadioVenciProve.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRadioVenciProve.setFileImportacion(this.jInternalFrameImportacionRadioVenciProve.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRadioVenciProve.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRadioVenciProve.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRadioVenciProve.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRadioVenciProve.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		

		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RadioVenciProveBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RadioVenciProveBaseDesign.jrxml";
			
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
			
			this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRadioVenci_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRadioVenci_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRadioVenci_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRadioVenci_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aHasta_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRadioVenciProve.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					sNombreCampoCategoria="id_tipo_radio_venci";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoria="dia_desde";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoria="dia_hasta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					sNombreCampoCategoriaValor="id_tipo_radio_venci";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoriaValor="dia_desde";
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoriaValor="dia_hasta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Radio Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_radio_venci");
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_desde");
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_hasta");
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
	
	public void jButtonGenerarExcelReporteDinamicoRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RadioVenciProves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RadioVenciProve radiovenciprove:radiovenciprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciprove.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
					iRow++;

					for(RadioVenciProve radiovenciprove:radiovenciprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciprove.gettiporadiovenci_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIADESDE);
					iRow++;

					for(RadioVenciProve radiovenciprove:radiovenciprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciprove.getdia_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciProveConstantesFunciones.LABEL_DIAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA);
					iRow++;

					for(RadioVenciProve radiovenciprove:radiovenciprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciprove.getdia_hasta());
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
			//	this.getFilaCabeceraExportarExcelRadioVenciProve(row);				
			//	iRow++;
			//}				
			
			//for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRadioVenciProve(radiovenciproveAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
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
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciProve(false);
			
			//SI ES MANUAL
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciProve();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciProve(false);
			
			//SI ES MANUAL
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRadioVenciProve();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciProve(false);
			
			//SI ES MANUAL
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRadioVenciProve();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRadioVenciProve() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRadioVenciProve.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRadioVenciProve.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRadioVenciProve.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRadioVenciProve.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRadioVenciProve.setMinimumSize(dimensionMinimum);
		this.jTableDatosRadioVenciProve.setMaximumSize(dimensionMaximum);
		this.jTableDatosRadioVenciProve.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRadioVenciProve(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRadioVenciProve(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRadioVenciProve(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRadioVenciProve(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRadioVenciProve(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRadioVenciProve(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciProve(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRadioVenciProve(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRadioVenciProve() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRadioVenciProve();
		
		this.inicializarActualizarBindingBotonesManualRadioVenciProve(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRadioVenciProve();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciProve() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciProve(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciProve(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRadioVenciProve.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRadioVenciProve.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRadioVenciProve.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionNuevoRadioVenciProve.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionSinCerrarRadioVenciProve.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionSinMensajeRadioVenciProve.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRadioVenciProve.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRadioVenciProve.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRadioVenciProve.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
				this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionNuevoRadioVenciProve.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionSinCerrarRadioVenciProve.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRadioVenciProve.jCheckBoxPostAccionSinMensajeRadioVenciProve.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRadioVenciProve.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRadioVenciProve.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRadioVenciProve.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRadioVenciProve.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRadioVenciProve.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRadioVenciProve.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRadioVenciProve.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRadioVenciProve.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRadioVenciProve.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRadioVenciProve(Boolean esInicializar) throws Exception {
		try	{	
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciProve(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciProve() throws Exception {
		try	{
			if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRadioVenciProve();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRadioVenciProve() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRadioVenciProve() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRadioVenciProve.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRadioVenciProve.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRadioVenciProve.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRadioVenciProve.addItem(reporte);
			}
			
			
			if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRadioVenciProve.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRadioVenciProve.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRadioVenciProve.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRadioVenciProve.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRadioVenciProve.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRadioVenciProve.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRadioVenciProve.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciProve();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciProve() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
				
				if(this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRadioVenciProve.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRadioVenciProve.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRadioVenciProve()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.getSelectedItem()!=null){this.id_tipo_radio_venciFK_IdTipoRadioVenci=((TipoRadioVenci)this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciProve.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRadioVenciProve(Boolean esInicializar) throws Exception {				
		if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRadioVenciProve();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRadioVenciProve() throws Exception {
		this.inicializarActualizarBindingTablaRadioVenciProve(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRadioVenciProve() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRadioVenciProveOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProveOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRadioVenciProve(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=radiovenciproveLogic.getRadioVenciProves().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=radiovenciproves.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRadioVenciProve.setModel(new RadioVenciProveModel(this.radiovenciproveLogic.getRadioVenciProves(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRadioVenciProve.setModel(new RadioVenciProveModel(this.radiovenciproves,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRadioVenciProve!=null && this.jInternalFrameOrderByRadioVenciProve.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRadioVenciProve();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,radiovenciproveConstantesFunciones.resaltarSeleccionarRadioVenciProve,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO,radiovenciproveConstantesFunciones.resaltarSeleccionarRadioVenciProve,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_ID));

		if(this.radiovenciproveConstantesFunciones.mostraridRadioVenciProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciProveConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciproveConstantesFunciones.resaltaridRadioVenciProve,this.radiovenciproveConstantesFunciones.activaridRadioVenciProve,this,true,"idRadioVenciProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciproveConstantesFunciones.resaltaridRadioVenciProve,this.radiovenciproveConstantesFunciones.activaridRadioVenciProve,this,true,"idRadioVenciProve","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA));

		if(this.radiovenciproveConstantesFunciones.mostrarid_empresaRadioVenciProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.radiovenciproveConstantesFunciones.resaltarid_empresaRadioVenciProve,this,this.radiovenciproveConstantesFunciones.activarid_empresaRadioVenciProve));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.radiovenciproveConstantesFunciones.resaltarid_empresaRadioVenciProve,this,this.radiovenciproveConstantesFunciones.activarid_empresaRadioVenciProve,false,"id_empresaRadioVenciProve","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI));

		if(this.radiovenciproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRadioVenciTableCell(this.tiporadiovencisForeignKey,this.radiovenciproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciProve,this,this.radiovenciproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciProve));
			tableColumn.setCellEditor(new TipoRadioVenciTableCell(this.tiporadiovencisForeignKey,this.radiovenciproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciProve,this,this.radiovenciproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciProve,true,"id_tipo_radio_venciRadioVenciProve","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_DIADESDE));

		if(this.radiovenciproveConstantesFunciones.mostrardia_desdeRadioVenciProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciProveConstantesFunciones.LABEL_DIADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciproveConstantesFunciones.resaltardia_desdeRadioVenciProve,this.radiovenciproveConstantesFunciones.activardia_desdeRadioVenciProve,this,true,"dia_desdeRadioVenciProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciproveConstantesFunciones.resaltardia_desdeRadioVenciProve,this.radiovenciproveConstantesFunciones.activardia_desdeRadioVenciProve,this,true,"dia_desdeRadioVenciProve","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,RadioVenciProveConstantesFunciones.LABEL_DIAHASTA));

		if(this.radiovenciproveConstantesFunciones.mostrardia_hastaRadioVenciProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciProveConstantesFunciones.LABEL_DIAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciproveConstantesFunciones.resaltardia_hastaRadioVenciProve,this.radiovenciproveConstantesFunciones.activardia_hastaRadioVenciProve,this,true,"dia_hastaRadioVenciProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciproveConstantesFunciones.resaltardia_hastaRadioVenciProve,this.radiovenciproveConstantesFunciones.activardia_hastaRadioVenciProve,this,true,"dia_hastaRadioVenciProve","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RadioVenciProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRadioVenciProve.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRadioVenciProve.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.radiovenciproveSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRadioVenciProve.addColumn(tableColumn);
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
			
			this.jTableDatosRadioVenciProve.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRadioVenciProve.moveColumn(this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRadioVenciProve.moveColumn(this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRadioVenciProve.moveColumn(this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRadioVenciProve.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRadioVenciProve.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRadioVenciProve,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRadioVenciProve.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRadioVenciProve.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRadioVenciProve.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRadioVenciProve.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRadioVenciProve.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=radiovenciproveLogic.getRadioVenciProves().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=radiovenciproves.size()-1;
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
		//this.jTableDatosRadioVenciProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRadioVenciProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRadioVenciProve();
			
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
				
				//this.isEsNuevoRadioVenciProve=false;
					
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
				if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRadioVenciProve==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRadioVenciProve.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRadioVenciProve.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.radiovenciprove.getsType().equals("DUPLICADO")
				   || this.radiovenciprove.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRadioVenciProve=true;
				
				} else {
					this.isEsNuevoRadioVenciProve=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					if(this.radiovenciprove.getId()>=0 && !this.radiovenciprove.getIsNew()) {						
						this.isEsNuevoRadioVenciProve=false;
						
					} else {
						this.isEsNuevoRadioVenciProve=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRadioVenciProve(esRelaciones);						
				
				this.seleccionarRadioVenciProve(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.radiovenciprove.getId()<0) {
					this.isEsNuevoRadioVenciProve=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRadioVenciProve(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRadioVenciProve(evt,rowIndex);
				}	
				
				if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RadioVenciProve: " + this.dDif); 
					}
				}								
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRadioVenciProve(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.radiovenciprove)) {
					if(this.radiovenciprove.getId()>0) {
						this.radiovenciprove.setIsDeleted(true);
						
						this.radiovenciprovesEliminados.add(this.radiovenciprove);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.radiovenciproveLogic.getRadioVenciProves().remove(this.radiovenciprove);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.radiovenciproves.remove(this.radiovenciprove);				
					}
					
					
					((RadioVenciProveModel) this.jTableDatosRadioVenciProve.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciProve(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRadioVenciProve(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRadioVenciProve) {
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRadioVenciProve.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRadioVenciProve.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRadioVenciProve(this.radiovenciprove);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.radiovenciproveConstantesFunciones.cargarid_empresaRadioVenciProve || this.radiovenciproveConstantesFunciones.event_dependid_empresaRadioVenciProve) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.radiovenciprove.getid_empresa());
									//this.inicializarActualizarBindingRadioVenciProve(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(radiovenciprove.getEmpresa()!=null) {
							this.empresasForeignKey.add(radiovenciprove.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.radiovenciprove.getid_empresa(),false,"Formulario");

					//TipoRadioVenci
					if(!this.radiovenciproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciProve || this.radiovenciproveConstantesFunciones.event_dependid_tipo_radio_venciRadioVenciProve) {
						//this.cargarCombosTipoRadioVencisForeignKeyLista(" where id="+this.radiovenciprove.getid_tipo_radio_venci());
									//this.inicializarActualizarBindingRadioVenciProve(false,false);
						this.tiporadiovencisForeignKey=new ArrayList<TipoRadioVenci>();

						if(radiovenciprove.getTipoRadioVenci()!=null) {
							this.tiporadiovencisForeignKey.add(radiovenciprove.getTipoRadioVenci());
						}

						this.addItemDefectoCombosForeignKeyTipoRadioVenci();
						this.cargarCombosFrameTipoRadioVencisForeignKey("Todos");
					}
					this.setActualTipoRadioVenciForeignKey(this.radiovenciprove.getid_tipo_radio_venci(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRadioVenciProve("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRadioVenciProve(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciProve() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRadioVenciProve(RadioVenciProve radiovenciprove) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRadioVenciProve(radiovenciprove,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRadioVenciProve(RadioVenciProve radiovenciprove,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRadioVenciProve(radiovenciprove);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRadioVenciProve(radiovenciprove,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciProve(radiovenciprove);
	}
	
	public void setVariablesObjetoActualToFormularioRadioVenciProve(RadioVenciProve radiovenciprove) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setText(radiovenciprove.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setText(radiovenciprove.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setText(radiovenciprove.getdia_hasta().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RadioVenciProve radiovenciproveLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,radiovenciproveLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RadioVenciProve radiovenciproveLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				radiovenciproveLocal=this.radiovenciprove;
			} else {
				radiovenciproveLocal=this.radiovenciproveAnterior;
			}
		}
		
		if(this.permiteMantenimiento(radiovenciproveLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRadioVenciProve(radiovenciproveLocal,true);
					
					if(radiovenciproveSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(radiovenciproveLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(radiovenciproveLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRadioVenciProve(RadioVenciProve radiovenciprove,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRadioVenciProve(radiovenciprove,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(radiovenciprove);
	}
	
	public void setVariablesFormularioToObjetoActualRadioVenciProve(RadioVenciProve radiovenciprove,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRadioVenciProve(radiovenciprove,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRadioVenciProve(RadioVenciProve radiovenciprove,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.getText()==null || this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.getText()=="" || this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.getText()=="Id") {
				this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setText("0");
			}

			if(conColumnasBase) {radiovenciprove.setId(Long.parseLong(this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciProveConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabelIdRadioVenciProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			radiovenciprove.setdia_desde(Integer.parseInt(this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciProveConstantesFunciones.LABEL_DIADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_desdeRadioVenciProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			radiovenciprove.setdia_hasta(Integer.parseInt(this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciProveConstantesFunciones.LABEL_DIAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciProve.jLabeldia_hastaRadioVenciProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRadioVenciProve(RadioVenciProve radiovenciproveBean,RadioVenciProve radiovenciprove,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && radiovenciproveBean.getid_tipo_radio_venci()!=null && !radiovenciproveBean.getid_tipo_radio_venci().equals(-1L))) {radiovenciprove.setid_tipo_radio_venci(radiovenciproveBean.getid_tipo_radio_venci());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRadioVenciProve(RadioVenciProve radiovenciproveOrigen,RadioVenciProve radiovenciprove,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && radiovenciproveOrigen.getId()!=null && !radiovenciproveOrigen.getId().equals(0L))) {radiovenciprove.setId(radiovenciproveOrigen.getId());}}
			if(conDefault || (!conDefault && radiovenciproveOrigen.getid_tipo_radio_venci()!=null && !radiovenciproveOrigen.getid_tipo_radio_venci().equals(-1L))) {radiovenciprove.setid_tipo_radio_venci(radiovenciproveOrigen.getid_tipo_radio_venci());}
			if(conDefault || (!conDefault && radiovenciproveOrigen.getdia_desde()!=null && !radiovenciproveOrigen.getdia_desde().equals(0))) {radiovenciprove.setdia_desde(radiovenciproveOrigen.getdia_desde());}
			if(conDefault || (!conDefault && radiovenciproveOrigen.getdia_hasta()!=null && !radiovenciproveOrigen.getdia_hasta().equals(0))) {radiovenciprove.setdia_hasta(radiovenciproveOrigen.getdia_hasta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRadioVenciProve(RadioVenciProve radiovenciprove) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setText(radiovenciprove.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setText(radiovenciprove.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setText(radiovenciprove.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRadioVenciProve(RadioVenciProveBean radiovenciproveBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setText(radiovenciproveBean.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setText(radiovenciproveBean.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setText(radiovenciproveBean.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRadioVenciProve(RadioVenciProveParameterReturnGeneral radiovenciproveReturnGeneral,RadioVenciProveBean radiovenciproveBean,Boolean conDefault) throws Exception { 
		try {
			RadioVenciProve radiovenciproveLocal=new RadioVenciProve();
			
			radiovenciproveLocal=radiovenciproveReturnGeneral.getRadioVenciProve();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && radiovenciproveLocal.getId()!=null && !radiovenciproveLocal.getId().equals(0L))) {radiovenciproveBean.setId(radiovenciproveLocal.getId());}}
			if(conDefault || (!conDefault && radiovenciproveLocal.getid_tipo_radio_venci()!=null && !radiovenciproveLocal.getid_tipo_radio_venci().equals(-1L))) {radiovenciproveBean.setid_tipo_radio_venci(radiovenciproveLocal.getid_tipo_radio_venci());}
			if(conDefault || (!conDefault && radiovenciproveLocal.getdia_desde()!=null && !radiovenciproveLocal.getdia_desde().equals(0))) {radiovenciproveBean.setdia_desde(radiovenciproveLocal.getdia_desde());}
			if(conDefault || (!conDefault && radiovenciproveLocal.getdia_hasta()!=null && !radiovenciproveLocal.getdia_hasta().equals(0))) {radiovenciproveBean.setdia_hasta(radiovenciproveLocal.getdia_hasta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRadioVenciProveGenerico(Long idRadioVenciProveSeleccionado,JComboBox jComboBoxRadioVenciProve,List<RadioVenciProve> radiovenciprovesLocal)throws Exception {
		try {
			RadioVenciProve  radiovenciproveTemp=null;

			for(RadioVenciProve radiovenciproveAux:radiovenciprovesLocal) {
				if(radiovenciproveAux.getId()!=null && radiovenciproveAux.getId().equals(idRadioVenciProveSeleccionado)) {
					radiovenciproveTemp=radiovenciproveAux;
					break;
				}
			}

			jComboBoxRadioVenciProve.setSelectedItem(radiovenciproveTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRadioVenciProveGenerico(JComboBox jComboBoxRadioVenciProve,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRadioVenciProve.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRadioVenciProve.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRadioVenciProve.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRadioVenciProve.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciprove=(RadioVenciProve) radiovenciproveLogic.getRadioVenciProves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			radiovenciprove =(RadioVenciProve) radiovenciproves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!radiovenciprove.getIsNew() && !radiovenciprove.getIsChanged() && !radiovenciprove.getIsDeleted()) {
				sDescripcion=radiovenciprove.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=radiovenciprove.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoRadioVenci")) {
			//sDescripcion=this.getActualTipoRadioVenciForeignKeyDescripcion((Long)value);
			if(!radiovenciprove.getIsNew() && !radiovenciprove.getIsChanged() && !radiovenciprove.getIsDeleted()) {
				sDescripcion=radiovenciprove.gettiporadiovenci_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRadioVenciForeignKeyDescripcion((Long)value);
				sDescripcion=radiovenciprove.gettiporadiovenci_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RadioVenciProve radiovenciproveRow=new RadioVenciProve();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciproveRow=(RadioVenciProve) radiovenciproveLogic.getRadioVenciProves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			radiovenciproveRow=(RadioVenciProve) radiovenciproves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRadioVenciProve(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve));			
			this.jButtonDuplicarRadioVenciProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciProve && this.isPermisoDuplicarRadioVenciProve));			
			this.jButtonCopiarRadioVenciProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciProve && this.isPermisoCopiarRadioVenciProve));
			this.jButtonVerFormRadioVenciProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciProve && this.isPermisoVerFormRadioVenciProve));
			
			this.jButtonAbrirOrderByRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));			
			
			this.jButtonNuevoRelacionesRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve && this.isPermisoNuevoRadioVenciProve));			
			this.jButtonNuevoGuardarCambiosRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarRadioVenciProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciProve && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciProve && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciProve && this.isPermisoEliminarRadioVenciProve));
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciProve);							
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));			
			
			}
						
			this.jButtonGuardarCambiosTablaRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve));						
			this.jButtonDuplicarToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciProve && this.isPermisoDuplicarRadioVenciProve));						
			this.jButtonCopiarToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciProve && this.isPermisoCopiarRadioVenciProve));			
			this.jButtonVerFormToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciProve && this.isPermisoVerFormRadioVenciProve));			
			this.jButtonAbrirOrderByToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));
			this.jButtonNuevoRelacionesToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve && this.isPermisoNuevoRadioVenciProve));			
			this.jButtonNuevoGuardarCambiosToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));			
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciProve && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciProve  && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciProve && this.isPermisoEliminarRadioVenciProve));
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarToolBarRadioVenciProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciProve);				
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve));			
			this.jMenuItemDuplicarRadioVenciProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciProve && this.isPermisoDuplicarRadioVenciProve));			
			this.jMenuItemCopiarRadioVenciProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciProve && this.isPermisoCopiarRadioVenciProve));			
			this.jMenuItemVerFormRadioVenciProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciProve && this.isPermisoVerFormRadioVenciProve));			
			this.jMenuItemAbrirOrderByRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));			
			//this.jMenuItemMostrarOcultarRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));
			this.jMenuItemDetalleAbrirOrderByRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));			
			//this.jMenuItemDetalleMostrarOcultarRadioVenciProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciProve && this.isPermisoOrdenRadioVenciProve));			
			this.jMenuItemNuevoRelacionesRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve && this.isPermisoNuevoRadioVenciProve));			
			this.jMenuItemNuevoGuardarCambiosRadioVenciProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciProve && this.isPermisoNuevoRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));									
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemModificarRadioVenciProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciProve && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemActualizarRadioVenciProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciProve && this.isPermisoActualizarRadioVenciProve));	
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemEliminarRadioVenciProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciProve && this.isPermisoEliminarRadioVenciProve));
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemCancelarRadioVenciProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciProve);				
			}
			
			this.jMenuItemGuardarCambiosRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));						
			this.jMenuItemGuardarCambiosTablaRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRadioVenciProve=this.jButtonNuevoRadioVenciProve.isVisible();
			this.isVisibilidadCeldaDuplicarRadioVenciProve=this.jButtonDuplicarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaCopiarRadioVenciProve=this.jButtonCopiarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaVerFormRadioVenciProve=this.jButtonVerFormRadioVenciProve.isVisible();
			
			this.isVisibilidadCeldaOrdenRadioVenciProve=this.jButtonAbrirOrderByRadioVenciProve.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=this.jButtonNuevoRelacionesRadioVenciProve.isVisible();
			this.isVisibilidadCeldaModificarRadioVenciProve=this.jButtonModificarRadioVenciProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.isVisibilidadCeldaActualizarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaGuardarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=this.jButtonGuardarCambiosTablaRadioVenciProve.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRadioVenciProve=this.jButtonNuevoToolBarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=this.jButtonNuevoRelacionesToolBarRadioVenciProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.isVisibilidadCeldaModificarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarToolBarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaActualizarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarToolBarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarToolBarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarToolBarRadioVenciProve.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRadioVenciProve=this.jButtonGuardarCambiosToolBarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=this.jButtonGuardarCambiosTablaToolBarRadioVenciProve.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRadioVenciProve=this.jMenuItemNuevoRadioVenciProve.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=this.jMenuItemNuevoRelacionesRadioVenciProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.isVisibilidadCeldaModificarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemModificarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaActualizarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemActualizarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemEliminarRadioVenciProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciProve=this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemCancelarRadioVenciProve.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRadioVenciProve=this.jMenuItemGuardarCambiosRadioVenciProve.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=this.jMenuItemGuardarCambiosTablaRadioVenciProve.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRadioVenciProve(Boolean esInicializar) {
		if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {			
			if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
				//if(this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRadioVenciProve();
			}
			
			this.inicializarActualizarBindingBotonesManualRadioVenciProve(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRadioVenciProve() {
		this.jButtonNuevoRadioVenciProve.setVisible(this.isPermisoNuevoRadioVenciProve);			
		this.jButtonDuplicarRadioVenciProve.setVisible(this.isPermisoDuplicarRadioVenciProve);			
		this.jButtonCopiarRadioVenciProve.setVisible(this.isPermisoCopiarRadioVenciProve);			
		this.jButtonVerFormRadioVenciProve.setVisible(this.isPermisoVerFormRadioVenciProve);			
		
		this.jButtonAbrirOrderByRadioVenciProve.setVisible(this.isPermisoOrdenRadioVenciProve);					
		
		this.jButtonNuevoRelacionesRadioVenciProve.setVisible(this.isPermisoNuevoRadioVenciProve);			
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarRadioVenciProve.setVisible(this.isPermisoActualizarRadioVenciProve);	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.setVisible(this.isPermisoActualizarRadioVenciProve);	
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.setVisible(this.isPermisoEliminarRadioVenciProve);
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciProve);						
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.setVisible(this.isPermisoGuardarCambiosRadioVenciProve);							
		}
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.setVisible(this.isPermisoActualizarRadioVenciProve);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRadioVenciProve() {
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarRadioVenciProve.setVisible(this.isPermisoActualizarRadioVenciProve);	
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.setVisible(this.isPermisoActualizarRadioVenciProve);	
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.setVisible(this.isPermisoEliminarRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciProve);							
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciProve && this.isPermisoGuardarCambiosRadioVenciProve));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRadioVenciProve() {
		if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRadioVenciProve();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRadioVenciProve() {
	}
	
	public void jTableDatosRadioVenciProveListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRadioVenciProve(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRadioVenciProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciprove==null) {
						this.radiovenciprove = new RadioVenciProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				}

				if(this.radiovenciprove.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.radiovenciprove.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRadioVenciProveUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRadioVenciProve(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRadioVenciProve.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRadioVenciProve.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.radiovenciproveLogic.getConnexion());

				if(this.radiovenciprove.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.radiovenciprove.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRadioVenciProve=(TitledBorder)this.jScrollPanelDatosRadioVenciProve.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRadioVenciProve.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRadioVenciProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciprove==null) {
						this.radiovenciprove = new RadioVenciProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				}

				if(this.radiovenciprove.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.radiovenciprove.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_radio_venciRadioVenciProveUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporadiovenci=true;

			idTienePermisotiporadiovenci=this.tienePermisosUsuarioEnPaginaWebRadioVenciProve(TipoRadioVenciConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporadiovenci) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRadioVenciProve.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRadioVenciProve.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);

				this.tiporadiovenciBeanSwingJInternalFrame=new TipoRadioVenciBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporadiovenciBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporadiovenciBeanSwingJInternalFrame.getTipoRadioVenciLogic().setConnexion(this.radiovenciproveLogic.getConnexion());

				if(this.radiovenciprove.getid_tipo_radio_venci()!=null) {
					this.tiporadiovenciBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporadiovenciBeanSwingJInternalFrame.setIdActual(this.radiovenciprove.getid_tipo_radio_venci());
					this.tiporadiovenciBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporadiovenciBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporadiovenciBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRadioVenci();
				}

				JInternalFrameBase jinternalFrame =this.tiporadiovenciBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRadioVenciProve=(TitledBorder)this.jScrollPanelDatosRadioVenciProve.getBorder();
				TitledBorder titledBordertiporadiovenci=(TitledBorder)this.tiporadiovenciBeanSwingJInternalFrame.jScrollPanelDatosTipoRadioVenci.getBorder();

				titledBordertiporadiovenci.setTitle(titledBorderRadioVenciProve.getTitle() + " -> Tipo Radio Venci");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_radio_venciRadioVenciProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciprove==null) {
						this.radiovenciprove = new RadioVenciProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				}

				if(this.radiovenciprove.getid_tipo_radio_venci()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_radio_venci = "+this.radiovenciprove.getid_tipo_radio_venci().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_desdeRadioVenciProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciprove==null) {
						this.radiovenciprove = new RadioVenciProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				}

				if(this.radiovenciprove.getdia_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_desde = "+this.radiovenciprove.getdia_desde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_hastaRadioVenciProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.getradiovenciprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciprove==null) {
						this.radiovenciprove = new RadioVenciProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);
				}

				if(this.radiovenciprove.getdia_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_hasta = "+this.radiovenciprove.getdia_hasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRadioVenciProve(false,false);

			this.getRadioVenciProvesFK_IdEmpresa();

			this.inicializarActualizarBindingRadioVenciProve(false);

			//if(RadioVenciProveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRadioVenciProve(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRadioVenciRadioVenciProveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRadioVenciProve(false,false);

			this.getRadioVenciProvesFK_IdTipoRadioVenci();

			this.inicializarActualizarBindingRadioVenciProve(false);

			//if(RadioVenciProveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRadioVenciProve(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciproveLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRadioVenciProve() {
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciProve.setVisible(false);	    			
			this.jInternalFrameDetalleFormRadioVenciProve.dispose();
			this.jInternalFrameDetalleFormRadioVenciProve=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
			this.jInternalFrameReporteDinamicoRadioVenciProve.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRadioVenciProve.dispose();
			this.jInternalFrameReporteDinamicoRadioVenciProve=null;
		}
		
		if(this.jInternalFrameImportacionRadioVenciProve!=null) {
			this.jInternalFrameImportacionRadioVenciProve.setVisible(false);	    			
			this.jInternalFrameImportacionRadioVenciProve.dispose();
			this.jInternalFrameImportacionRadioVenciProve=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRadioVenciProve();
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			
			if(sTipo.equals("NuevoRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRadioVenciProve")) {
				jButtonDuplicarRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRadioVenciProve")) {
				jButtonCopiarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("VerFormRadioVenciProve")) {
				jButtonVerFormRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRadioVenciProve")) {
				jButtonDuplicarRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRadioVenciProve")) {
				jButtonDuplicarRadioVenciProveActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRadioVenciProve")) {
				jButtonModificarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRadioVenciProve")) {
				jButtonModificarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRadioVenciProve")) {
				jButtonModificarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRadioVenciProve")) {
				jButtonActualizarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRadioVenciProve")) {
				jButtonActualizarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRadioVenciProve")) {
				jButtonActualizarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("EliminarRadioVenciProve")) {
				jButtonEliminarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRadioVenciProve")) {
				jButtonEliminarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRadioVenciProve")) {
				jButtonEliminarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("CancelarRadioVenciProve")) {
				jButtonCancelarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRadioVenciProve")) {
				jButtonCancelarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRadioVenciProve")) {
				jButtonCancelarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("CerrarRadioVenciProve")) {
				jButtonCerrarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRadioVenciProve")) {
				jButtonCerrarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRadioVenciProve")) {
				jButtonCerrarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRadioVenciProve")) {
				jButtonMostrarOcultarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRadioVenciProve")) {
				jButtonCancelarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRadioVenciProve")) {
				jButtonCopiarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRadioVenciProve")) {
				jButtonVerFormRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRadioVenciProve")) {
				jButtonCopiarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRadioVenciProve")) {
				jButtonVerFormRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRadioVenciProve")) {
				jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRadioVenciProve")) {
				jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRadioVenciProve")) {
				jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRadioVenciProve")) {
				jButtonAnterioresRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRadioVenciProve")) {
				jButtonAnterioresRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRadioVenciProve")) {
				jButtonAnterioresRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRadioVenciProve")) {
				jButtonSiguientesRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRadioVenciProve")) {
				jButtonSiguientesRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRadioVenciProve")) {
				jButtonSiguientesRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRadioVenciProve") || sTipo.equals("MenuItemDetalleAbrirOrderByRadioVenciProve")) {
				jButtonAbrirOrderByRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRadioVenciProve") || sTipo.equals("MenuItemDetalleMostrarOcultarRadioVenciProve")) {
				jButtonMostrarOcultarRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRadioVenciProve")) {
				jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRadioVenciProve")) {
				jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRadioVenciProve")) {
				jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRadioVenciProve")) {
				jButtonCerrarReporteDinamicoRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRadioVenciProve")) {
				jButtonGenerarReporteDinamicoRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRadioVenciProve")) {
				
				jButtonGenerarExcelReporteDinamicoRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRadioVenciProve")) {
				jButtonCerrarImportacionRadioVenciProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRadioVenciProve")) {
				
				jButtonGenerarImportacionRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRadioVenciProve")) {
				
				jButtonAbrirImportacionRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRadioVenciProve")) {
				jComboBoxTiposAccionesRadioVenciProveActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRadioVenciProve")) {
				jComboBoxTiposRelacionesRadioVenciProveActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRadioVenciProve")) {
				jComboBoxTiposAccionesRadioVenciProveActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRadioVenciProve")) {
				
				jComboBoxTiposSeleccionarRadioVenciProveActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRadioVenciProve")) {
				jTextFieldValorCampoGeneralRadioVenciProveActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRadioVenciProve")) {
				jButtonAbrirOrderByRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRadioVenciProve")) {
				jButtonAbrirOrderByRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRadioVenciProve")) {
				jButtonCerrarOrderByRadioVenciProveActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRadioVenciProveBusqueda")) {
				this.jButtonidRadioVenciProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRadioVenciProveUpdate")) {
				this.jButtonid_empresaRadioVenciProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRadioVenciProveBusqueda")) {
				this.jButtonid_empresaRadioVenciProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciProveUpdate")) {
				this.jButtonid_tipo_radio_venciRadioVenciProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciProveBusqueda")) {
				this.jButtonid_tipo_radio_venciRadioVenciProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeRadioVenciProveBusqueda")) {
				this.jButtondia_desdeRadioVenciProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaRadioVenciProveBusqueda")) {
				this.jButtondia_hastaRadioVenciProveBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoRadioVenciRadioVenciProve")) {
				this.jButtonFK_IdTipoRadioVenciRadioVenciProveActionPerformed(evt);
			}
			
			;
			
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRadioVenciProve();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RadioVenciProve radiovenciproveLocal=null;
			
			if(!this.getEsControlTabla()) {
				radiovenciproveLocal=this.radiovenciprove;
			} else {
				radiovenciproveLocal=this.radiovenciproveAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
							
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
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
			
			


			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
								
						
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
								
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
							
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
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
			
			


			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
								
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRadioVenciProve")) {
					jCheckBoxSeleccionarTodosRadioVenciProveItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRadioVenciProve")) {
					jCheckBoxSeleccionadosRadioVenciProveItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRadioVenciProve")) {
					
				}
				
				


				
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
												
				
				


				
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
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
			
			


			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciProveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciprove);
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
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
				
				


				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciProve.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciproveAnterior =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRadioVenciProve")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRadioVenciProveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRadioVenciProve.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.radiovenciprove =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.radiovenciprove =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.radiovenciprove);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRadioVenciProve")) {
				
				}
				
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRadioVenciProve")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRadioVenciProve.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRadioVenciProve")) {
			
			}
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRadioVenciProve();
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			if(sTipo.equals("NuevoRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRadioVenciProve")) {
				jButtonDuplicarRadioVenciProveActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRadioVenciProve")) {
				jButtonCopiarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRadioVenciProve")) {
				jButtonVerFormRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRadioVenciProve")) {
				jButtonNuevoRadioVenciProveActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRadioVenciProve")) {
				jButtonModificarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRadioVenciProve")) {
				jButtonActualizarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRadioVenciProve")) {
				jButtonEliminarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRadioVenciProve")) {
				jButtonCancelarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRadioVenciProve")) {
				jButtonCerrarRadioVenciProveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRadioVenciProve")) {
				jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRadioVenciProve")) {
				jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRadioVenciProve")) {
				jButtonAbrirOrderByRadioVenciProveActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRadioVenciProve")) {
				jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRadioVenciProve")) {
				jButtonAnterioresRadioVenciProveActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRadioVenciProve")) {
				jButtonSiguientesRadioVenciProveActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRadioVenciProveBusqueda")) {
				this.jButtonidRadioVenciProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRadioVenciProveUpdate")) {
				this.jButtonid_empresaRadioVenciProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRadioVenciProveBusqueda")) {
				this.jButtonid_empresaRadioVenciProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciProveUpdate")) {
				this.jButtonid_tipo_radio_venciRadioVenciProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciProveBusqueda")) {
				this.jButtonid_tipo_radio_venciRadioVenciProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeRadioVenciProveBusqueda")) {
				this.jButtondia_desdeRadioVenciProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaRadioVenciProveBusqueda")) {
				this.jButtondia_hastaRadioVenciProveBusquedaActionPerformed(evt);
			}
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRadioVenciProve();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRadioVenciProve")) {
				closingInternalFrameRadioVenciProve();
				
			} else if(sTipo.equals("jButtonCancelarRadioVenciProve")) {
				JInternalFrameBase jInternalFrameDetalleFormRadioVenciProve = (JInternalFrameBase)evt.getSource();
	            	
	            RadioVenciProveBeanSwingJInternalFrame jInternalFrameParent=(RadioVenciProveBeanSwingJInternalFrame)jInternalFrameDetalleFormRadioVenciProve.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRadioVenciProveActionPerformed(null);
			}
			
			RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.radiovenciprove,new Object(),this.radiovenciproveParameterGeneral,this.radiovenciproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRadioVenciProve(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRadioVenciProve(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRadioVenciProve(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.radiovenciprove)) {
			if(!esControlTabla) {
				if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);			
				}
				
				if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRadioVenciProve(this.radiovenciprove,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.radiovenciproveReturnGeneral=radiovenciproveLogic.procesarEventosRadioVenciProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciproveLogic.getRadioVenciProves(),this.radiovenciprove,this.radiovenciproveParameterGeneral,this.isEsNuevoRadioVenciProve,classes);//this.radiovenciproveLogic.getRadioVenciProve()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRadioVenciProve(this.radiovenciproveReturnGeneral,this.radiovenciproveBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRadioVenciProve(classes,this.radiovenciproveReturnGeneral,this.radiovenciproveBean,false);
					}
						
					if(this.radiovenciproveReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve());	
					}
						
					if(this.radiovenciproveReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve(),classes);//this.radiovenciproveBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRadioVenciProve(this.radiovenciprove,classes);//this.radiovenciproveBean);									
				}
			
				if(RadioVenciProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRadioVenciProve(this.radiovenciprove,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciProve(this.radiovenciprove);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.radiovenciproveAnterior!=null) {
						this.radiovenciprove=this.radiovenciproveAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.radiovenciproveReturnGeneral=radiovenciproveLogic.procesarEventosRadioVenciProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciproveLogic.getRadioVenciProves(),this.radiovenciprove,this.radiovenciproveParameterGeneral,this.isEsNuevoRadioVenciProve,classes);//this.radiovenciproveLogic.getRadioVenciProve()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.radiovenciproveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.radiovenciproveReturnGeneral.getRadioVenciProve(),radiovenciproveLogic.getRadioVenciProves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.radiovenciproveReturnGeneral.getRadioVenciProve(),this.radiovenciproves);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRadioVenciProve.repaint();
				
				//((AbstractTableModel) this.jTableDatosRadioVenciProve.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRadioVenciProve();
			}
		}
	}
	
	public void actualizarVisualTableDatosRadioVenciProve() throws Exception {
		
		RadioVenciProveModel radiovenciproveModel=(RadioVenciProveModel)this.jTableDatosRadioVenciProve.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciproveModel.radiovenciproves=this.radiovenciproveLogic.getRadioVenciProves();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			radiovenciproveModel.radiovenciproves=this.radiovenciproves;
		}
		
		
		((RadioVenciProveModel) this.jTableDatosRadioVenciProve.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRadioVenciProve() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getradiovenciproveAnterior(),this.radiovenciproveLogic.getRadioVenciProves());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getradiovenciproveAnterior(),this.radiovenciproves);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRadioVenciProve();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRadioVenciProve(RadioVenciProve radiovenciprove,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
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
										
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciprove,new Object(),generalEntityParameterGeneral,this.radiovenciproveReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RadioVenciProveConstantesFunciones.getClassesRelationshipsOfRadioVenciProve(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RadioVenciProveConstantesFunciones.getClassesRelationshipsFromStringsOfRadioVenciProve(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRadioVenciProve(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RadioVenciProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciprove,new Object(),generalEntityParameterGeneral,this.radiovenciproveReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRadioVenciProve(RadioVenciProveBean radiovenciproveBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRadioVenciProve(ArrayList<Classe> classes,RadioVenciProveReturnGeneral radiovenciproveReturnGeneral,RadioVenciProveBean radiovenciproveBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRadioVenciProve(RadioVenciProve radiovenciprove,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.radiovenciprove)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRadioVenciProve = new RadioVenciProveDetalleFormJInternalFrame(jDesktopPane,this.radiovenciproveSessionBean.getConGuardarRelaciones(),this.radiovenciproveSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.setVisible(false);
		this.jInternalFrameDetalleFormRadioVenciProve.setSelected(false);						
		
		this.jInternalFrameDetalleFormRadioVenciProve.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRadioVenciProve.radiovenciproveLogic=this.radiovenciproveLogic;
		
		this.cargarCombosFrameForeignKeyRadioVenciProve("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRadioVenciProve();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRadioVenciProve();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRadioVenciProve("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRadioVenciProve();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRadioVenciProve.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRadioVenciProve"));
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ModificarRadioVenciProve"));

		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ModificarToolBarRadioVenciProve"));
					
		this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemModificarRadioVenciProve.addActionListener(new ButtonActionListener(this,"MenuItemModificarRadioVenciProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.addActionListener (new ButtonActionListener(this,"ActualizarRadioVenciProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRadioVenciProve"));
						
		this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemActualizarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRadioVenciProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.addActionListener (new ButtonActionListener(this,"EliminarRadioVenciProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"EliminarToolBarRadioVenciProve"));
								
		this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemEliminarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRadioVenciProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CancelarRadioVenciProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CancelarToolBarRadioVenciProve"));
					
		this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemCancelarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRadioVenciProve"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemDetalleCerrarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRadioVenciProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciProve"));
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciProve"));
		
		
		
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRadioVenciProve"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonidRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_desdeRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_hastaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciProveBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRadioVenciProve"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRadioVenciProve"));
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRadioVenciProve"));
		}
		
		this.jTableDatosRadioVenciProve.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRadioVenciProve"));
		
		this.jTableDatosRadioVenciProve.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRadioVenciProve"));
		
		this.jButtonNuevoRadioVenciProve.addActionListener(new ButtonActionListener(this,"NuevoRadioVenciProve"));
		
		this.jButtonDuplicarRadioVenciProve.addActionListener(new ButtonActionListener(this,"DuplicarRadioVenciProve"));
		
		this.jButtonCopiarRadioVenciProve.addActionListener(new ButtonActionListener(this,"CopiarRadioVenciProve"));
		
		this.jButtonVerFormRadioVenciProve.addActionListener(new ButtonActionListener(this,"VerFormRadioVenciProve"));
		
		
		this.jButtonNuevoToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"NuevoToolBarRadioVenciProve"));
			
		this.jButtonDuplicarToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRadioVenciProve"));
			
		this.jMenuItemNuevoRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRadioVenciProve"));
			
		this.jMenuItemDuplicarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRadioVenciProve"));		
		
		
		this.jButtonNuevoRelacionesRadioVenciProve.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRadioVenciProve"));
		
		
		this.jButtonNuevoRelacionesToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRadioVenciProve"));
			
		this.jMenuItemNuevoRelacionesRadioVenciProve.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRadioVenciProve"));		
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ModificarRadioVenciProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonModificarToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ModificarToolBarRadioVenciProve"));
			
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemModificarRadioVenciProve.addActionListener(new ButtonActionListener(this,"MenuItemModificarRadioVenciProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarRadioVenciProve.addActionListener (new ButtonActionListener(this,"ActualizarRadioVenciProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonActualizarToolBarRadioVenciProve.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRadioVenciProve"));
				
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemActualizarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRadioVenciProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarRadioVenciProve.addActionListener (new ButtonActionListener(this,"EliminarRadioVenciProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonEliminarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"EliminarToolBarRadioVenciProve"));
						
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemEliminarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRadioVenciProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CancelarRadioVenciProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonCancelarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CancelarToolBarRadioVenciProve"));
			
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemCancelarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRadioVenciProve"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRadioVenciProve"));		
		
		
		this.jButtonCerrarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CerrarRadioVenciProve"));
		
		
		this.jButtonCerrarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CerrarToolBarRadioVenciProve"));
			
		this.jMenuItemCerrarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRadioVenciProve"));
			
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jMenuItemDetalleCerrarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRadioVenciProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosRadioVenciProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciProve"));
		}
		
		this.jButtonCopiarToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"CopiarToolBarRadioVenciProve"));
			
		this.jButtonVerFormToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"VerFormToolBarRadioVenciProve"));
		
		this.jMenuItemGuardarCambiosRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRadioVenciProve"));
			
		this.jMenuItemCopiarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRadioVenciProve"));		
		
		this.jMenuItemVerFormRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRadioVenciProve"));		
		
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRadioVenciProve"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRadioVenciProve"));
			
		this.jMenuItemGuardarCambiosTablaRadioVenciProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRadioVenciProve"));		
		
		
		
		this.jButtonRecargarInformacionRadioVenciProve.addActionListener (new ButtonActionListener(this,"RecargarInformacionRadioVenciProve"));
					
		this.jButtonRecargarInformacionToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRadioVenciProve"));
		
		this.jMenuItemRecargarInformacionRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRadioVenciProve"));		
		
		
		
		this.jButtonAnterioresRadioVenciProve.addActionListener (new ButtonActionListener(this,"AnterioresRadioVenciProve"));
		
		
		this.jButtonAnterioresToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRadioVenciProve"));
		
		this.jMenuItemAnterioresRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRadioVenciProve"));		
		
		
		this.jButtonSiguientesRadioVenciProve.addActionListener (new ButtonActionListener(this,"SiguientesRadioVenciProve"));
		
		
		this.jButtonSiguientesToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRadioVenciProve"));
			
		this.jMenuItemSiguientesRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRadioVenciProve"));
			
		this.jMenuItemAbrirOrderByRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRadioVenciProve"));
			
		this.jMenuItemMostrarOcultarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRadioVenciProve"));
			
		this.jMenuItemDetalleAbrirOrderByRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRadioVenciProve"));
			
		this.jMenuItemDetalleMostarOcultarRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRadioVenciProve"));		
		
		
		this.jButtonNuevoGuardarCambiosRadioVenciProve.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRadioVenciProve"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRadioVenciProve"));
			
		this.jMenuItemNuevoGuardarCambiosRadioVenciProve.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRadioVenciProve"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRadioVenciProve.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRadioVenciProve"));

		this.jCheckBoxSeleccionadosRadioVenciProve.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRadioVenciProve"));
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRadioVenciProve"));
		}
		
		
		this.jComboBoxTiposRelacionesRadioVenciProve.addActionListener (new ButtonActionListener(this,"TiposRelacionesRadioVenciProve"));
			
		this.jComboBoxTiposAccionesRadioVenciProve.addActionListener (new ButtonActionListener(this,"TiposAccionesRadioVenciProve"));
					
		this.jComboBoxTiposSeleccionarRadioVenciProve.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRadioVenciProve"));
			
		this.jTextFieldValorCampoGeneralRadioVenciProve.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRadioVenciProve"));		
		
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonidRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_desdeRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_hastaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciProveBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoRadioVenciRadioVenciProve.addActionListener(new ButtonActionListener(this,"FK_IdTipoRadioVenciRadioVenciProve"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRadioVenciProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciProve"));
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciProve"));
				this.jInternalFrameReporteDinamicoRadioVenciProve.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciProve"));
			}
			
			//this.jButtonCerrarReporteDinamicoRadioVenciProve.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciProve"));				
			//this.jButtonGenerarReporteDinamicoRadioVenciProve.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciProve"));
			//this.jButtonGenerarExcelReporteDinamicoRadioVenciProve.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciProve"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRadioVenciProve!=null) {
				this.jInternalFrameImportacionRadioVenciProve.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRadioVenciProve"));
				this.jInternalFrameImportacionRadioVenciProve.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRadioVenciProve"));
				this.jInternalFrameImportacionRadioVenciProve.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRadioVenciProve"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRadioVenciProve.addActionListener (new ButtonActionListener(this,"AbrirOrderByRadioVenciProve"));
			
			this.jButtonAbrirOrderByToolBarRadioVenciProve.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRadioVenciProve"));			
			
			if(this.jInternalFrameOrderByRadioVenciProve!=null) {
				this.jInternalFrameOrderByRadioVenciProve.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRadioVenciProve"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciProve.jTabbedPaneRelacionesRadioVenciProve.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRadioVenciProve"));
		
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
            		closingInternalFrameRadioVenciProve();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRadioVenciProve.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRadioVenciProve = (JInternalFrameBase)event.getSource();
	            	
	            RadioVenciProveBeanSwingJInternalFrame jInternalFrameParent=(RadioVenciProveBeanSwingJInternalFrame)jInternalFrameDetalleFormRadioVenciProve.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRadioVenciProveActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRadioVenciProve.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRadioVenciProveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRadioVenciProve.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRadioVenciProve.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRadioVenciProve";
		inputMap = this.jButtonNuevoRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRadioVenciProveActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRadioVenciProve";
		inputMap = this.jButtonNuevoRelacionesRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRadioVenciProveActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRadioVenciProve";
		inputMap = this.jButtonModificarRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRadioVenciProve";
		inputMap = this.jButtonActualizarRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRadioVenciProve";
		inputMap = this.jButtonEliminarRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRadioVenciProve";
		inputMap = this.jButtonCancelarRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRadioVenciProve";
		inputMap = this.jButtonCerrarRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRadioVenciProve";
		inputMap = this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonGuardarCambiosRadioVenciProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRadioVenciProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRadioVenciProve.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRadioVenciProveItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRadioVenciProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRadioVenciProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRadioVenciProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRadioVenciProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRadioVenciProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRadioVenciProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonidRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_empresaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_desdeRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciProve.jButtondia_hastaRadioVenciProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciProveBusqueda"));
		
		
		this.jButtonFK_IdTipoRadioVenciRadioVenciProve.addActionListener(new ButtonActionListener(this,"FK_IdTipoRadioVenciRadioVenciProve"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRadioVenciProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRadioVenciProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRadioVenciProveActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRadioVenciProve.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRadioVenciProve(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
					radiovenciproveAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciProve radiovenciproveAux:radiovenciproves) {
					radiovenciproveAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRadioVenciProveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
						radiovenciproveAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciProve radiovenciproveAux:radiovenciproves) {
						radiovenciproveAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciProve radiovenciproveAux:radiovenciproves) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRadioVenciProve.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRadioVenciProve.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRadioVenciProveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRadioVenciProve.getSelectedRows();
			
			RadioVenciProve radiovenciproveLocal=new RadioVenciProve();
			
			//this.seleccionarTodosRadioVenciProve(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciproveLocal =(RadioVenciProve) this.radiovenciproveLogic.getRadioVenciProves().toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					radiovenciproveLocal =(RadioVenciProve) this.radiovenciproves.toArray()[this.jTableDatosRadioVenciProve.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				radiovenciproveLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
						radiovenciproveAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciProve radiovenciproveAux:radiovenciproves) {
						radiovenciproveAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRadioVenciProve.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRadioVenciProve.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciProve,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRadioVenciProveItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRadioVenciProveParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRadioVenciProveActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRadioVenciProve.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RadioVenciProve radiovenciproveAux:this.radiovenciproveLogic.getRadioVenciProves()) {
				
						if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							radiovenciproveAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							radiovenciproveAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciProve radiovenciproveAux:radiovenciproves) {
					
						if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							radiovenciproveAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							radiovenciproveAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciProve(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRadioVenciProveActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRadioVenciProve=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRadioVenciProve.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRadioVenciProve) {				
					conSplash=true;//false;										
					
					//this.startProcessRadioVenciProve(conSplash);
				
					this.generarReporteRadioVenciProvesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRadioVenciProvesSeleccionados();
				//this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRadioVenciProvesSeleccionados(false);
				//this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRadioVenciProvesSeleccionados(true);
				//this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRadioVenciProve();
				
				this.exportarRadioVenciProvesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRadioVenciProves();
				//this.importarRadioVenciProves();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRadioVenciProve();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRadioVenciProvesSeleccionados();
				//this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dias Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRadioVenciProve();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRadioVenciProve)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRadioVenciProve(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
				}	
			} 			
			else if(RadioVenciProveBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRadioVenciProve) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRadioVenciProve(conSplash);
					
						//this.actualizarParametrosGeneralRadioVenciProve();
						
						this.generarReporteProcesoAccionRadioVenciProvesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RadioVenciProveBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dias VencidosS SELECCIONADOS?", "MANTENIMIENTO DE Dias Vencidos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRadioVenciProve();
				
						this.actualizarParametrosGeneralRadioVenciProve();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.radiovenciproveReturnGeneral=radiovenciproveLogic.procesarAccionRadioVenciProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.radiovenciproveLogic.getRadioVenciProves(),this.radiovenciproveParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRadioVenciProveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRadioVenciProve();
					
					RadioVenciProveBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRadioVenciProveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRadioVenciProve.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxTiposAccionesFormularioRadioVenciProve.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRadioVenciProve(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRadioVenciProveActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRadioVenciProve();
			
			if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
			RadioVenciProve radiovenciprove=new RadioVenciProve();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRadioVenciProve(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRadioVenciProve.getSelectedItem();
			
			
			
			
			radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
			//this.sTipoAccion;
			
			if(radiovenciprovesSeleccionados.size()==1) {
				for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
					radiovenciprove=radiovenciproveAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRadioVenciProve();
			
      		//this.finishProcessRadioVenciProve(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRadioVenciProveReturnGeneral() throws Exception {
		if(this.radiovenciproveReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.radiovenciproveReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.radiovenciproveReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.radiovenciproveReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.radiovenciproveReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.radiovenciproveReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRadioVenciProve(false);
		}
		
		if(this.radiovenciproveReturnGeneral.getConRetornoLista() || this.radiovenciproveReturnGeneral.getConRetornoObjeto()) {
			if(this.radiovenciproveReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.radiovenciproveLogic.setRadioVenciProves(this.radiovenciproveReturnGeneral.getRadioVenciProves());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.radiovenciproveReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.radiovenciproveLogic.setRadioVenciProve(this.radiovenciproveReturnGeneral.getRadioVenciProve());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRadioVenciProve(false);
		}
	}
	
	public void actualizarParametrosGeneralRadioVenciProve() throws Exception {
		
		
	}
	
	public ArrayList<RadioVenciProve> getRadioVenciProvesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRadioVenciProve) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RadioVenciProve radiovenciproveAux:radiovenciproveLogic.getRadioVenciProves()) {
					if(radiovenciproveAux.getIsSelected()) {
						radiovenciprovesSeleccionados.add(radiovenciproveAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciProve radiovenciproveAux:this.radiovenciproves) {
					if(radiovenciproveAux.getIsSelected()) {
						radiovenciprovesSeleccionados.add(radiovenciproveAux);				
					}
				}
			}
			
			if(radiovenciprovesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						radiovenciprovesSeleccionados.addAll(this.radiovenciproveLogic.getRadioVenciProves());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						radiovenciprovesSeleccionados.addAll(this.radiovenciproves);				
					}
				}
			}
		} else {
			radiovenciprovesSeleccionados.add(this.radiovenciprove);
		}
		
		return radiovenciprovesSeleccionados;
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
	
	public void generarReporteRadioVenciProvesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRadioVenciProvesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRadioVenciProvesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRadioVenciProvesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRadioVenciProvesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dias Vencidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados);
		
	}	
	
	public void generarReporteNormalRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRadioVenciProvesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRadioVenciProve();
		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRadioVenciProve();
		
		
		//this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados ,radiovenciproveImplementable,radiovenciproveImplementableHome);
	}
	
	public void mostrarImportacionRadioVenciProves() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRadioVenciProve();
		
		this.abrirFrameImportacionRadioVenciProve();		
		
			
		//this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados ,radiovenciproveImplementable,radiovenciproveImplementableHome);
	}
	
	public void importarRadioVenciProves() throws Exception {		
	
	}
	
	public void exportarRadioVenciProvesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRadioVenciProvesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRadioVenciProvesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRadioVenciProvesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dias Vencidos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRadioVenciProve(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRadioVenciProve(radiovenciproveAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//radiovenciproveAux.setsDetalleGeneralEntityReporte(radiovenciproveAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRadioVenciProve(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_DIADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciProveConstantesFunciones.LABEL_DIAHASTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRadioVenciProve(RadioVenciProve radiovenciprove,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=radiovenciprove.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciprove.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciprove.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciprove.gettiporadiovenci_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciprove.getdia_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciprove.getdia_hasta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RadioVenciProves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRadioVenciProve(row);				
				iRow++;
			}				
			
			for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRadioVenciProve(radiovenciproveAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRadioVenciProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();		
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciprove.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("radiovenciproves");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("radiovenciprove");
			//elementRoot.appendChild(element);
		
			for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
				element = document.createElement("radiovenciprove");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRadioVenciProve(radiovenciproveAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Vencidos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRadioVenciProve(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRadioVenciProve(RadioVenciProve radiovenciprove,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciprove.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciprove.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciprove.gettiporadiovenci_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciprove.getdia_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciprove.getdia_hasta());				
	}
	
	public void setFilaDatosExportarXmlRadioVenciProve(RadioVenciProve radiovenciprove,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RadioVenciProveConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(radiovenciprove.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RadioVenciProveConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(radiovenciprove.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RadioVenciProveConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(radiovenciprove.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtiporadiovenci_descripcion = document.createElement(RadioVenciProveConstantesFunciones.IDTIPORADIOVENCI);
		elementtiporadiovenci_descripcion.appendChild(document.createTextNode(radiovenciprove.gettiporadiovenci_descripcion()));
		element.appendChild(elementtiporadiovenci_descripcion);

		Element elementdia_desde = document.createElement(RadioVenciProveConstantesFunciones.DIADESDE);
		elementdia_desde.appendChild(document.createTextNode(radiovenciprove.getdia_desde().toString().trim()));
		element.appendChild(elementdia_desde);

		Element elementdia_hasta = document.createElement(RadioVenciProveConstantesFunciones.DIAHASTA);
		elementdia_hasta.appendChild(document.createTextNode(radiovenciprove.getdia_hasta().toString().trim()));
		element.appendChild(elementdia_hasta);
	}
	
	public void generarReporteGroupGenericoRadioVenciProvesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RadioVenciProve> radiovenciprovesSeleccionados=new ArrayList<RadioVenciProve>();
		
		radiovenciprovesSeleccionados=this.getRadioVenciProvesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRadioVenciProve(radiovenciprovesSeleccionados);
		
		this.generarReporteRadioVenciProves("Todos",radiovenciprovesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRadioVenciProve(ArrayList<RadioVenciProve> radiovenciprovesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RadioVenciProve radiovenciproveAux:radiovenciprovesSeleccionados) {
				radiovenciproveAux.setsDetalleGeneralEntityReporte(radiovenciproveAux.toString());
			
				if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					radiovenciproveAux.setsDescripcionGeneralEntityReporte1(radiovenciproveAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI)) {
					existe=true;
					radiovenciproveAux.setsDescripcionGeneralEntityReporte1(radiovenciproveAux.gettiporadiovenci_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIADESDE)) {
					existe=true;
					radiovenciproveAux.setsDescripcionGeneralEntityReporte1(radiovenciproveAux.getdia_desde().toString());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA)) {
					existe=true;
					radiovenciproveAux.setsDescripcionGeneralEntityReporte1(radiovenciproveAux.getdia_hasta().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRadioVenciProve(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRadioVenciProve=true;
				this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=true;
				this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=true;
			}
			
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciProve=true;
			this.isVisibilidadCeldaCancelarRadioVenciProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=true;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=true;
			this.isVisibilidadCeldaModificarRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
			this.isVisibilidadCeldaModificarRadioVenciProve=true;
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciProve=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRadioVenciProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=true;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=true;
		} else {
			this.actualizarEstadoPanelsRadioVenciProve(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRadioVenciProve=false;
			//this.isVisibilidadCeldaVerFormRadioVenciProve=false;
			this.isVisibilidadCeldaDuplicarRadioVenciProve=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!radiovenciproveSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
		} else {
			this.isVisibilidadCeldaNuevoRadioVenciProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciProve=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			if(!radiovenciproveSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;												
			}
			
			this.jButtonCerrarRadioVenciProve.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciProve=false;
		}
		
		if(!this.permiteMantenimiento(this.radiovenciprove)) {
			this.isVisibilidadCeldaActualizarRadioVenciProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciProve=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRadioVenciProve() {
	}
	
	public void actualizarEstadoPanelsRadioVenciProve(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRadioVenciProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciProve.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciProve!=null) {
				this.jScrollPanelDatosRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciProve!=null) {
				this.jPanelPaginacionRadioVenciProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
					this.jTabbedPaneBusquedasRadioVenciProve.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciProve.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRadioVenciProve!=null) {
				this.jPanelParametrosReportesRadioVenciProve.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoRadioVenci=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRadioVenci) {this.jTabbedPaneBusquedasRadioVenciProve.remove(jPanelFK_IdTipoRadioVenciRadioVenciProve);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRadioVenci(Boolean isParaTipoRadioVenci){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRadioVenciNegation=!isParaTipoRadioVenci;

			this.isVisibilidadFK_IdTipoRadioVenci=isParaTipoRadioVenci;
			if(!this.isVisibilidadFK_IdTipoRadioVenci) {this.jTabbedPaneBusquedasRadioVenciProve.remove(jPanelFK_IdTipoRadioVenciRadioVenciProve);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RadioVenciProveSessionBean radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		
		if(this.radiovenciproveSessionBean==null) {
			this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		}
		
		this.radiovenciproveSessionBean.setsUltimaBusquedaRadioVenciProve(this.getsAccionBusqueda());
		this.radiovenciproveSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.radiovenciproveSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			radiovenciproveSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRadioVenci")) {
			radiovenciproveSessionBean.setid_tipo_radio_venci(this.getid_tipo_radio_venciFK_IdTipoRadioVenci());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RadioVenciProveSessionBean radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		
		if(this.radiovenciproveSessionBean==null) {
			this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		}
		
		if(this.radiovenciproveSessionBean.getsUltimaBusquedaRadioVenciProve()!=null&&!this.radiovenciproveSessionBean.getsUltimaBusquedaRadioVenciProve().equals("")) {
			this.setsAccionBusqueda(radiovenciproveSessionBean.getsUltimaBusquedaRadioVenciProve());
			this.setiNumeroPaginacion(radiovenciproveSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(radiovenciproveSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(radiovenciproveSessionBean.getid_empresa());
				radiovenciproveSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRadioVenci")) {
				this.setid_tipo_radio_venciFK_IdTipoRadioVenci(radiovenciproveSessionBean.getid_tipo_radio_venci());
				radiovenciproveSessionBean.setid_tipo_radio_venci(-1L);
			}
		}
		
		this.radiovenciproveSessionBean.setsUltimaBusquedaRadioVenciProve("");
		this.radiovenciproveSessionBean.setiNumeroPaginacion(RadioVenciProveConstantesFunciones.INUMEROPAGINACION);
		this.radiovenciproveSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRadioVenciProve(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRadioVenciProve() {
		this.updateBorderResaltarBusquedasFormularioRadioVenciProve();
		this.updateVisibilidadBusquedasFormularioRadioVenciProve();
		this.updateHabilitarBusquedasFormularioRadioVenciProve();
	}
	
	public void updateBorderResaltarBusquedasFormularioRadioVenciProve() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRadioVenciProve.getComponents().length>0) {
	

		if(this.radiovenciproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciProve!=null) {
			index= this.jTabbedPaneBusquedasRadioVenciProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciProve);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciProve.getComponent(index);
				jPanel.setBorder(this.radiovenciproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciProve);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRadioVenciProve() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRadioVenciProve.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRadioVenciProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciProve);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciProve.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.radiovenciproveConstantesFunciones.mostrarFK_IdTipoRadioVenciRadioVenciProve);
			if(!this.radiovenciproveConstantesFunciones.mostrarFK_IdTipoRadioVenciRadioVenciProve && index>-1) {
				this.jTabbedPaneBusquedasRadioVenciProve.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRadioVenciProve() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRadioVenciProve.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRadioVenciProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciProve);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciProve.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.radiovenciproveConstantesFunciones.activarFK_IdTipoRadioVenciRadioVenciProve);
				this.jTabbedPaneBusquedasRadioVenciProve.setEnabledAt(index,this.radiovenciproveConstantesFunciones.activarFK_IdTipoRadioVenciRadioVenciProve);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRadioVenciProve(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoRadioVenci")) {
			index= this.jTabbedPaneBusquedasRadioVenciProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciProve);

			this.jTabbedPaneBusquedasRadioVenciProve.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciProve.getComponent(index);

			this.radiovenciproveConstantesFunciones.setResaltarFK_IdTipoRadioVenciRadioVenciProve(resaltar);

			jPanel.setBorder(this.radiovenciproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciProve);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRadioVenciProve.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRadioVenciProve() throws Exception {

		if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRadioVenciProve();
		this.updateVisibilidadResaltarControlesFormularioRadioVenciProve();
		this.updateHabilitarResaltarControlesFormularioRadioVenciProve();
		
	}
	
	public void updateBorderResaltarControlesFormularioRadioVenciProve() throws Exception {
		if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.radiovenciproveConstantesFunciones.resaltaridRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve!=null) {this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setBorder(this.radiovenciproveConstantesFunciones.resaltaridRadioVenciProve);}
		if(this.radiovenciproveConstantesFunciones.resaltarid_empresaRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve!=null) {this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setBorder(this.radiovenciproveConstantesFunciones.resaltarid_empresaRadioVenciProve);}
		if(this.radiovenciproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve!=null) {this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setBorder(this.radiovenciproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciProve);}
		if(this.radiovenciproveConstantesFunciones.resaltardia_desdeRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve!=null) {this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setBorder(this.radiovenciproveConstantesFunciones.resaltardia_desdeRadioVenciProve);}
		if(this.radiovenciproveConstantesFunciones.resaltardia_hastaRadioVenciProve!=null && this.jInternalFrameDetalleFormRadioVenciProve!=null) {this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setBorder(this.radiovenciproveConstantesFunciones.resaltardia_hastaRadioVenciProve);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRadioVenciProve() throws Exception {		
		if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
	
		//this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostraridRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jPanelidRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostraridRadioVenciProve);
		//this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrarid_empresaRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jPanelid_empresaRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrarid_empresaRadioVenciProve);
		//this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jPanelid_tipo_radio_venciRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciProve);
		//this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrardia_desdeRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jPaneldia_desdeRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrardia_desdeRadioVenciProve);
		//this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrardia_hastaRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jPaneldia_hastaRadioVenciProve.setVisible(this.radiovenciproveConstantesFunciones.mostrardia_hastaRadioVenciProve);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRadioVenciProve() throws Exception {
		if(this.jInternalFrameDetalleFormRadioVenciProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciProve!=null) {
	
		this.jInternalFrameDetalleFormRadioVenciProve.jLabelidRadioVenciProve.setEnabled(this.radiovenciproveConstantesFunciones.activaridRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_empresaRadioVenciProve.setEnabled(this.radiovenciproveConstantesFunciones.activarid_empresaRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jComboBoxid_tipo_radio_venciRadioVenciProve.setEnabled(this.radiovenciproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_desdeRadioVenciProve.setEnabled(this.radiovenciproveConstantesFunciones.activardia_desdeRadioVenciProve);
		this.jInternalFrameDetalleFormRadioVenciProve.jTextFielddia_hastaRadioVenciProve.setEnabled(this.radiovenciproveConstantesFunciones.activardia_hastaRadioVenciProve);
		}
	}
	
		
}