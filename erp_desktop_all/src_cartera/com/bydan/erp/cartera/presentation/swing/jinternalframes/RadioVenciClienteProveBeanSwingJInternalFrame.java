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

import com.bydan.erp.cartera.util.RadioVenciClienteProveConstantesFunciones;
import com.bydan.erp.cartera.util.RadioVenciClienteProveParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RadioVenciClienteProveParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RadioVenciClienteProveBean;
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
public class RadioVenciClienteProveBeanSwingJInternalFrame extends RadioVenciClienteProveJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RadioVenciClienteProveBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RadioVenciClienteProve> radiovenciclienteproveValidator = new ClassValidator<RadioVenciClienteProve>(RadioVenciClienteProve.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RadioVenciClienteProve radiovenciclienteprove;	
	public RadioVenciClienteProve radiovenciclienteproveAux;
	public RadioVenciClienteProve radiovenciclienteproveAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RadioVenciClienteProve radiovenciclienteproveTotales;
	public Long idRadioVenciClienteProveActual;
	public Long iIdNuevoRadioVenciClienteProve=0L;
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
	
	public Boolean isPermisoTodoRadioVenciClienteProve;
	public Boolean isPermisoNuevoRadioVenciClienteProve;
	public Boolean isPermisoActualizarRadioVenciClienteProve;
	public Boolean isPermisoActualizarOriginalRadioVenciClienteProve;
	public Boolean isPermisoEliminarRadioVenciClienteProve;
	public Boolean isPermisoGuardarCambiosRadioVenciClienteProve;
	public Boolean isPermisoConsultaRadioVenciClienteProve;
	public Boolean isPermisoBusquedaRadioVenciClienteProve;
	public Boolean isPermisoReporteRadioVenciClienteProve;
	public Boolean isPermisoPaginacionMedioRadioVenciClienteProve;
	public Boolean isPermisoPaginacionAltoRadioVenciClienteProve;
	public Boolean isPermisoPaginacionTodoRadioVenciClienteProve;
	public Boolean isPermisoCopiarRadioVenciClienteProve;
	public Boolean isPermisoVerFormRadioVenciClienteProve;
	public Boolean isPermisoDuplicarRadioVenciClienteProve;
	public Boolean isPermisoOrdenRadioVenciClienteProve;
	
	
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
	
	public RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveReturnGeneral;
	public RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRadioVenciClienteProve=false;
	public Boolean esParaAccionDesdeFormularioRadioVenciClienteProve=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RadioVenciClienteProveSessionBeanAdditional radiovenciclienteproveSessionBeanAdditional=null;
	
	public RadioVenciClienteProveSessionBeanAdditional getRadioVenciClienteProveSessionBeanAdditional() {
		return this.radiovenciclienteproveSessionBeanAdditional;
	}
	
	public void setRadioVenciClienteProveSessionBeanAdditional(RadioVenciClienteProveSessionBeanAdditional radiovenciclienteproveSessionBeanAdditional) {
		try {
			this.radiovenciclienteproveSessionBeanAdditional=radiovenciclienteproveSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RadioVenciClienteProveBeanSwingJInternalFrameAdditional radiovenciclienteproveBeanSwingJInternalFrameAdditional=null;
	//public class RadioVenciClienteProveBeanSwingJInternalFrame
	
	public RadioVenciClienteProveBeanSwingJInternalFrameAdditional getRadioVenciClienteProveBeanSwingJInternalFrameAdditional() {
		return this.radiovenciclienteproveBeanSwingJInternalFrameAdditional;
	}
	
	public void setRadioVenciClienteProveBeanSwingJInternalFrameAdditional(RadioVenciClienteProveBeanSwingJInternalFrameAdditional radiovenciclienteproveBeanSwingJInternalFrameAdditional) {
		try {
			this.radiovenciclienteproveBeanSwingJInternalFrameAdditional=radiovenciclienteproveBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RadioVenciClienteProveLogic radiovenciclienteproveLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RadioVenciClienteProve radiovenciclienteproveBean;
	public RadioVenciClienteProveConstantesFunciones radiovenciclienteproveConstantesFunciones;
	//public RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoRadioVenciLogic tiporadiovenciLogic;
	
	//PARAMETROS
	
	
	//public List<RadioVenciClienteProve> radiovenciclienteproves;	
	//public List<RadioVenciClienteProve> radiovenciclienteprovesEliminados;
	//public List<RadioVenciClienteProve> radiovenciclienteprovesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaDuplicarRadioVenciClienteProve=true;
	public Boolean isVisibilidadCeldaCopiarRadioVenciClienteProve=true;
	public Boolean isVisibilidadCeldaVerFormRadioVenciClienteProve=true;
	public Boolean isVisibilidadCeldaOrdenRadioVenciClienteProve=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaModificarRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaCancelarRadioVenciClienteProve=false;
	public Boolean isVisibilidadCeldaGuardarRadioVenciClienteProve=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoRadioVenci=false;
	
	public Long getiIdNuevoRadioVenciClienteProve() {
		return this.iIdNuevoRadioVenciClienteProve;
	}

	public void setiIdNuevoRadioVenciClienteProve(Long iIdNuevoRadioVenciClienteProve) {
		this.iIdNuevoRadioVenciClienteProve = iIdNuevoRadioVenciClienteProve;
	}
	
	public Long getidRadioVenciClienteProveActual() {
		return this.idRadioVenciClienteProveActual;
	}

	public void setidRadioVenciClienteProveActual(Long idRadioVenciClienteProveActual) {
		this.idRadioVenciClienteProveActual = idRadioVenciClienteProveActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RadioVenciClienteProve getradiovenciclienteprove() {
		return this.radiovenciclienteprove;
	}

	public void setradiovenciclienteprove(RadioVenciClienteProve radiovenciclienteprove) {
		this.radiovenciclienteprove = radiovenciclienteprove;
	}
	
	public RadioVenciClienteProve getradiovenciclienteproveAux() {
		return this.radiovenciclienteproveAux;
	}

	public void setradiovenciclienteproveAux(RadioVenciClienteProve radiovenciclienteproveAux) {
		this.radiovenciclienteproveAux = radiovenciclienteproveAux;
	}				
	
	public RadioVenciClienteProve getradiovenciclienteproveAnterior() {
		return this.radiovenciclienteproveAnterior;
	}

	public void setradiovenciclienteproveAnterior(RadioVenciClienteProve radiovenciclienteproveAnterior) {
		this.radiovenciclienteproveAnterior = radiovenciclienteproveAnterior;
	}	
	
	public RadioVenciClienteProve getradiovenciclienteproveTotales() {
		return this.radiovenciclienteproveTotales;
	}

	public void setradiovenciclienteproveTotales(RadioVenciClienteProve radiovenciclienteproveTotales) {
		this.radiovenciclienteproveTotales = radiovenciclienteproveTotales;
	}	
	
	public RadioVenciClienteProve getradiovenciclienteproveBean() {
		return this.radiovenciclienteproveBean;
	}

	public void setradiovenciclienteproveBean(RadioVenciClienteProve radiovenciclienteproveBean) {
		this.radiovenciclienteproveBean = radiovenciclienteproveBean;
	}	
	
	public RadioVenciClienteProveParameterReturnGeneral getradiovenciclienteproveReturnGeneral() {
		return this.radiovenciclienteproveReturnGeneral;
	}

	public void setradiovenciclienteproveReturnGeneral(RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveReturnGeneral) {
		this.radiovenciclienteproveReturnGeneral = radiovenciclienteproveReturnGeneral;
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
	
	
	public RadioVenciClienteProveLogic getRadioVenciClienteProveLogic()	{		
		return radiovenciclienteproveLogic;
	}

	public void setRadioVenciClienteProveLogic(RadioVenciClienteProveLogic radiovenciclienteproveLogic) {
		this.radiovenciclienteproveLogic = radiovenciclienteproveLogic;
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
	
	public Boolean getIsEsNuevoRadioVenciClienteProve() {
		return isEsNuevoRadioVenciClienteProve;
	}

	public void setIsEsNuevoRadioVenciClienteProve(Boolean isEsNuevoRadioVenciClienteProve) {
		this.isEsNuevoRadioVenciClienteProve = isEsNuevoRadioVenciClienteProve;
	}

	public Boolean getEsParaAccionDesdeFormularioRadioVenciClienteProve() {
		return esParaAccionDesdeFormularioRadioVenciClienteProve;
	}
	
	public void setEsParaAccionDesdeFormularioRadioVenciClienteProve(Boolean esParaAccionDesdeFormularioRadioVenciClienteProve) {
		this.esParaAccionDesdeFormularioRadioVenciClienteProve = esParaAccionDesdeFormularioRadioVenciClienteProve;
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

			if(this.radiovenciclienteproveSessionBean==null) {
				this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
			}

			if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(radiovenciclienteproveSessionBean.getlidEmpresaActual());
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

			if(this.radiovenciclienteproveSessionBean==null) {
				this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
			}

			if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {
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
					tiporadiovenciLogic.getEntityWithConnection(radiovenciclienteproveSessionBean.getlidTipoRadioVenciActual());
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

					if(this.radiovenciclienteprove!=null) {
						this.radiovenciclienteprove.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
						this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRadioVenciClienteProve.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.getItemCount()>0) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRadioVenciClienteProveGenerico)throws Exception
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
				jComboBoxid_empresaRadioVenciClienteProveGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRadioVenciClienteProveGenerico!=null && jComboBoxid_empresaRadioVenciClienteProveGenerico.getItemCount()>0) {
					jComboBoxid_empresaRadioVenciClienteProveGenerico.setSelectedIndex(0);
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

					if(this.radiovenciclienteprove!=null) {
						this.radiovenciclienteprove.setTipoRadioVenci(tiporadiovenciTemp);
					}

					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
						this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedItem(tiporadiovenciTemp);
					}
				} else {
					//jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedItem(tiporadiovenciTemp);
					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getItemCount()>0) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoRadioVenci") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiporadiovenciTemp!=null && jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve!=null) {
						jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setSelectedItem(tiporadiovenciTemp);
					} else {
						if(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve!=null) {
							//jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setSelectedItem(tiporadiovenciTemp);
							if(jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.getItemCount()>0) {
								jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setSelectedIndex(0);
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
	public void setActualTipoRadioVenciForeignKeyGenerico(Long idTipoRadioVenciSeleccionado,JComboBox jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico)throws Exception
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
				jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico.setSelectedItem(tiporadiovenciTemp);
			} else {
				if(jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico!=null && jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico.getItemCount()>0) {
					jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RadioVenciClienteProve radiovenciclienteprove,JComboBox jComboBoxid_empresaRadioVenciClienteProveGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRadioVenciClienteProveGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRadioVenciClienteProveGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				radiovenciclienteprove.setid_empresa(empresaAux.getId());
				radiovenciclienteprove.setempresa_descripcion(RadioVenciClienteProveConstantesFunciones.getEmpresaDescripcion(empresaAux));
				radiovenciclienteprove.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoRadioVenciForeignKey(RadioVenciClienteProve radiovenciclienteprove,JComboBox jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico)throws Exception
	{
		try
		{
			TipoRadioVenci  tiporadiovenciAux=new TipoRadioVenci();

			if(jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico==null) {
				tiporadiovenciAux=(TipoRadioVenci)this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getSelectedItem();
			} else {
				tiporadiovenciAux=(TipoRadioVenci)jComboBoxid_tipo_radio_venciRadioVenciClienteProveGenerico.getSelectedItem();
			}

			if(tiporadiovenciAux!=null && tiporadiovenciAux.getId()!=null) {
				radiovenciclienteprove.setid_tipo_radio_venci(tiporadiovenciAux.getId());
				radiovenciclienteprove.settiporadiovenci_descripcion(RadioVenciClienteProveConstantesFunciones.getTipoRadioVenciDescripcion(tiporadiovenciAux));
				radiovenciclienteprove.setTipoRadioVenci(tiporadiovenciAux);			}
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

					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { 
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { 
					}

					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
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

					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { 
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.removeAllItems();

							for(TipoRadioVenci tiporadiovenci:this.tiporadiovencisForeignKey) {
								this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.addItem(tiporadiovenci);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { 
					}

					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoRadioVenci") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.removeAllItems();

							for(TipoRadioVenci tiporadiovenci:this.tiporadiovencisForeignKey) {
								this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.addItem(tiporadiovenci);
							}
						}

						if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedItem(tiporadiovenci);
						}
					} else {
						if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setSelectedItem(tiporadiovenci);
						} else {
							this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesRadioVenciClienteProve() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RadioVenciClienteProveConstantesFunciones.refrescarForeignKeysDescripcionesRadioVenciClienteProve(this.radiovenciclienteproveLogic.getRadioVenciClienteProves());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RadioVenciClienteProveConstantesFunciones.refrescarForeignKeysDescripcionesRadioVenciClienteProve(this.radiovenciclienteproves);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoRadioVenci.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//radiovenciclienteproveLogic.setRadioVenciClienteProves(this.radiovenciclienteproves);
			radiovenciclienteproveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RadioVenciClienteProveParameterReturnGeneral getRadioVenciClienteProveParameterGeneral() {
		return this.radiovenciclienteproveParameterGeneral;
	}
	
	public void setRadioVenciClienteProveParameterGeneral(RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveParameterGeneral) {
		this.radiovenciclienteproveParameterGeneral = radiovenciclienteproveParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRadioVenciClienteProve() {
		return isPermisoTodoRadioVenciClienteProve;
	}

	public void setIsPermisoTodoRadioVenciClienteProve(Boolean isPermisoTodoRadioVenciClienteProve) {
		this.isPermisoTodoRadioVenciClienteProve = isPermisoTodoRadioVenciClienteProve;
	}

	public Boolean getIsPermisoNuevoRadioVenciClienteProve() {
		return isPermisoNuevoRadioVenciClienteProve;
	}

	public void setIsPermisoNuevoRadioVenciClienteProve(Boolean isPermisoNuevoRadioVenciClienteProve) {
		this.isPermisoNuevoRadioVenciClienteProve = isPermisoNuevoRadioVenciClienteProve;
	}

	public Boolean getIsPermisoActualizarRadioVenciClienteProve() {
		return isPermisoActualizarRadioVenciClienteProve;
	}

	public void setIsPermisoActualizarRadioVenciClienteProve(Boolean isPermisoActualizarRadioVenciClienteProve) {
		this.isPermisoActualizarRadioVenciClienteProve = isPermisoActualizarRadioVenciClienteProve;
	}

	public Boolean getIsPermisoEliminarRadioVenciClienteProve() {
		return isPermisoEliminarRadioVenciClienteProve;
	}

	public void setIsPermisoEliminarRadioVenciClienteProve(Boolean isPermisoEliminarRadioVenciClienteProve) {
		this.isPermisoEliminarRadioVenciClienteProve = isPermisoEliminarRadioVenciClienteProve;
	}

	public Boolean getIsPermisoGuardarCambiosRadioVenciClienteProve() {
		return isPermisoGuardarCambiosRadioVenciClienteProve;
	}

	public void setIsPermisoGuardarCambiosRadioVenciClienteProve(Boolean isPermisoGuardarCambiosRadioVenciClienteProve) {
		this.isPermisoGuardarCambiosRadioVenciClienteProve = isPermisoGuardarCambiosRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoConsultaRadioVenciClienteProve() {
		return isPermisoConsultaRadioVenciClienteProve;
	}

	public void setIsPermisoConsultaRadioVenciClienteProve(Boolean isPermisoConsultaRadioVenciClienteProve) {
		this.isPermisoConsultaRadioVenciClienteProve = isPermisoConsultaRadioVenciClienteProve;
	}

	public Boolean getIsPermisoBusquedaRadioVenciClienteProve() {
		return isPermisoBusquedaRadioVenciClienteProve;
	}

	public void setIsPermisoBusquedaRadioVenciClienteProve(Boolean isPermisoBusquedaRadioVenciClienteProve) {
		this.isPermisoBusquedaRadioVenciClienteProve = isPermisoBusquedaRadioVenciClienteProve;
	}

	public Boolean getIsPermisoReporteRadioVenciClienteProve() {
		return isPermisoReporteRadioVenciClienteProve;
	}

	public void setIsPermisoReporteRadioVenciClienteProve(Boolean isPermisoReporteRadioVenciClienteProve) {
		this.isPermisoReporteRadioVenciClienteProve = isPermisoReporteRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoPaginacionMedioRadioVenciClienteProve() {
		return isPermisoPaginacionMedioRadioVenciClienteProve;
	}

	public void setIsPermisoPaginacionMedioRadioVenciClienteProve(Boolean isPermisoPaginacionMedioRadioVenciClienteProve) {
		this.isPermisoPaginacionMedioRadioVenciClienteProve = isPermisoPaginacionMedioRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoPaginacionTodoRadioVenciClienteProve() {
		return isPermisoPaginacionTodoRadioVenciClienteProve;
	}

	public void setIsPermisoPaginacionTodoRadioVenciClienteProve(Boolean isPermisoPaginacionTodoRadioVenciClienteProve) {
		this.isPermisoPaginacionTodoRadioVenciClienteProve = isPermisoPaginacionTodoRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoPaginacionAltoRadioVenciClienteProve() {
		return isPermisoPaginacionAltoRadioVenciClienteProve;
	}

	public void setIsPermisoPaginacionAltoRadioVenciClienteProve(Boolean isPermisoPaginacionAltoRadioVenciClienteProve) {
		this.isPermisoPaginacionAltoRadioVenciClienteProve = isPermisoPaginacionAltoRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoCopiarRadioVenciClienteProve() {
		return isPermisoCopiarRadioVenciClienteProve;
	}

	public void setIsPermisoCopiarRadioVenciClienteProve(Boolean isPermisoCopiarRadioVenciClienteProve) {
		this.isPermisoCopiarRadioVenciClienteProve = isPermisoCopiarRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoVerFormRadioVenciClienteProve() {
		return isPermisoVerFormRadioVenciClienteProve;
	}

	public void setIsPermisoVerFormRadioVenciClienteProve(Boolean isPermisoVerFormRadioVenciClienteProve) {
		this.isPermisoVerFormRadioVenciClienteProve = isPermisoVerFormRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoDuplicarRadioVenciClienteProve() {
		return isPermisoDuplicarRadioVenciClienteProve;
	}

	public void setIsPermisoDuplicarRadioVenciClienteProve(Boolean isPermisoDuplicarRadioVenciClienteProve) {
		this.isPermisoDuplicarRadioVenciClienteProve = isPermisoDuplicarRadioVenciClienteProve;
	}
	
	public Boolean getIsPermisoOrdenRadioVenciClienteProve() {
		return isPermisoOrdenRadioVenciClienteProve;
	}

	public void setIsPermisoOrdenRadioVenciClienteProve(Boolean isPermisoOrdenRadioVenciClienteProve) {
		this.isPermisoOrdenRadioVenciClienteProve = isPermisoOrdenRadioVenciClienteProve;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRadioVenciClienteProve() {
		return isVisibilidadCeldaNuevoRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaNuevoRadioVenciClienteProve(Boolean isVisibilidadCeldaNuevoRadioVenciClienteProve) {
		this.isVisibilidadCeldaNuevoRadioVenciClienteProve = isVisibilidadCeldaNuevoRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRadioVenciClienteProve() {
		return isVisibilidadCeldaDuplicarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaDuplicarRadioVenciClienteProve(Boolean isVisibilidadCeldaDuplicarRadioVenciClienteProve) {
		this.isVisibilidadCeldaDuplicarRadioVenciClienteProve = isVisibilidadCeldaDuplicarRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRadioVenciClienteProve() {
		return isVisibilidadCeldaCopiarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaCopiarRadioVenciClienteProve(Boolean isVisibilidadCeldaCopiarRadioVenciClienteProve) {
		this.isVisibilidadCeldaCopiarRadioVenciClienteProve = isVisibilidadCeldaCopiarRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRadioVenciClienteProve() {
		return isVisibilidadCeldaVerFormRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaVerFormRadioVenciClienteProve(Boolean isVisibilidadCeldaVerFormRadioVenciClienteProve) {
		this.isVisibilidadCeldaVerFormRadioVenciClienteProve = isVisibilidadCeldaVerFormRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRadioVenciClienteProve() {
		return isVisibilidadCeldaOrdenRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaOrdenRadioVenciClienteProve(Boolean isVisibilidadCeldaOrdenRadioVenciClienteProve) {
		this.isVisibilidadCeldaOrdenRadioVenciClienteProve = isVisibilidadCeldaOrdenRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve() {
		return isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve(Boolean isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve) {
		this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve = isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRadioVenciClienteProve() {
		return isVisibilidadCeldaModificarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaModificarRadioVenciClienteProve(Boolean isVisibilidadCeldaModificarRadioVenciClienteProve) {
		this.isVisibilidadCeldaModificarRadioVenciClienteProve = isVisibilidadCeldaModificarRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRadioVenciClienteProve() {
		return isVisibilidadCeldaActualizarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaActualizarRadioVenciClienteProve(Boolean isVisibilidadCeldaActualizarRadioVenciClienteProve) {
		this.isVisibilidadCeldaActualizarRadioVenciClienteProve = isVisibilidadCeldaActualizarRadioVenciClienteProve;
	}

	public Boolean getIsVisibilidadCeldaEliminarRadioVenciClienteProve() {
		return isVisibilidadCeldaEliminarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaEliminarRadioVenciClienteProve(Boolean isVisibilidadCeldaEliminarRadioVenciClienteProve) {
		this.isVisibilidadCeldaEliminarRadioVenciClienteProve = isVisibilidadCeldaEliminarRadioVenciClienteProve;
	}

	public Boolean getIsVisibilidadCeldaCancelarRadioVenciClienteProve() {
		return isVisibilidadCeldaCancelarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaCancelarRadioVenciClienteProve(Boolean isVisibilidadCeldaCancelarRadioVenciClienteProve) {
		this.isVisibilidadCeldaCancelarRadioVenciClienteProve = isVisibilidadCeldaCancelarRadioVenciClienteProve;
	}

	public Boolean getIsVisibilidadCeldaGuardarRadioVenciClienteProve() {
		return isVisibilidadCeldaGuardarRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaGuardarRadioVenciClienteProve(Boolean isVisibilidadCeldaGuardarRadioVenciClienteProve) {
		this.isVisibilidadCeldaGuardarRadioVenciClienteProve = isVisibilidadCeldaGuardarRadioVenciClienteProve;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRadioVenciClienteProve() {
		return isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRadioVenciClienteProve(Boolean isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve) {
		this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve = isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve;
	}
		
	public RadioVenciClienteProveSessionBean getradiovenciclienteproveSessionBean() {
		return this.radiovenciclienteproveSessionBean;
	}
	
	public void setradiovenciclienteproveSessionBean(RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean) {
		this.radiovenciclienteproveSessionBean=radiovenciclienteproveSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(radiovenciclienteprove,null);
				this.setActualParaGuardarTipoRadioVenciForeignKey(radiovenciclienteprove,null);
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
	
	public void bugActualizarReferenciaActual(RadioVenciClienteProve radiovenciclienteprove,RadioVenciClienteProve radiovenciclienteproveAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRadioVenciClienteProve(radiovenciclienteprove);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		radiovenciclienteproveAux.setId(radiovenciclienteprove.getId());
		radiovenciclienteproveAux.setVersionRow(radiovenciclienteprove.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRadioVenciClienteProve();
		
			int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = radiovenciclienteproveValidator.getInvalidValues(this.radiovenciclienteprove);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			radiovenciclienteproveLogic.setDatosCliente(datosCliente);
			radiovenciclienteproveLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				radiovenciclienteproveAux=new  RadioVenciClienteProve();
				
				radiovenciclienteproveAux.setIsNew(true);
				radiovenciclienteproveAux.setIsChanged(true);
				
				radiovenciclienteproveAux.setRadioVenciClienteProveOriginal(this.radiovenciclienteprove);
				
				radiovenciclienteproveAux.setId(this.radiovenciclienteprove.getId());	
				radiovenciclienteproveAux.setVersionRow(this.radiovenciclienteprove.getVersionRow());	
				radiovenciclienteproveAux.setid_empresa(this.radiovenciclienteprove.getid_empresa());	
				radiovenciclienteproveAux.setid_tipo_radio_venci(this.radiovenciclienteprove.getid_tipo_radio_venci());	
				radiovenciclienteproveAux.setdia_desde(this.radiovenciclienteprove.getdia_desde());	
				radiovenciclienteproveAux.setdia_hasta(this.radiovenciclienteprove.getdia_hasta());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveLogic.saveRadioVenciClienteProves();//WithConnection
						//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);
					
					this.refrescarForeignKeysDescripcionesRadioVenciClienteProve();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciclienteproveLogic.saveRadioVenciClienteProveRelaciones(radiovenciclienteproveAux);//WithConnection
								//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				radiovenciclienteproveAux=new  RadioVenciClienteProve();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() 
					|| (this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() && this.radiovenciclienteprove.getId()>=0)) {
						
					radiovenciclienteproveAux.setIsNew(false);
				}
				
				radiovenciclienteproveAux.setIsDeleted(false);
			
				radiovenciclienteproveAux.setId(this.radiovenciclienteprove.getId());	
				radiovenciclienteproveAux.setVersionRow(this.radiovenciclienteprove.getVersionRow());	
				radiovenciclienteproveAux.setid_empresa(this.radiovenciclienteprove.getid_empresa());	
				radiovenciclienteproveAux.setid_tipo_radio_venci(this.radiovenciclienteprove.getid_tipo_radio_venci());	
				radiovenciclienteproveAux.setdia_desde(this.radiovenciclienteprove.getdia_desde());	
				radiovenciclienteproveAux.setdia_hasta(this.radiovenciclienteprove.getdia_hasta());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveLogic.saveRadioVenciClienteProves();//WithConnection
						//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);
					
					this.refrescarForeignKeysDescripcionesRadioVenciClienteProve();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciclienteproveLogic.saveRadioVenciClienteProveRelaciones(radiovenciclienteproveAux);//WithConnection
								//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
									|| this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.radiovenciclienteprove,radiovenciclienteproveAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				radiovenciclienteproveAux=new  RadioVenciClienteProve();
				
				radiovenciclienteproveAux.setIsNew(false);
				radiovenciclienteproveAux.setIsChanged(false);
				
				radiovenciclienteproveAux.setIsDeleted(true);
				
				radiovenciclienteproveAux.setId(this.radiovenciclienteprove.getId());	
				radiovenciclienteproveAux.setVersionRow(this.radiovenciclienteprove.getVersionRow());	
				radiovenciclienteproveAux.setid_empresa(this.radiovenciclienteprove.getid_empresa());	
				radiovenciclienteproveAux.setid_tipo_radio_venci(this.radiovenciclienteprove.getid_tipo_radio_venci());	
				radiovenciclienteproveAux.setdia_desde(this.radiovenciclienteprove.getdia_desde());	
				radiovenciclienteproveAux.setdia_hasta(this.radiovenciclienteprove.getdia_hasta());	
				
				if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.radiovenciclienteproveAux.getId()>=0) {	
						this.radiovenciclienteprovesEliminados.add(radiovenciclienteproveAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveLogic.saveRadioVenciClienteProves();//WithConnection
						//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								radiovenciclienteproveLogic.saveRadioVenciClienteProveRelaciones(radiovenciclienteproveAux);//WithConnection
								//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
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
							if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
								|| this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(radiovenciclienteproveAux,radiovenciclienteproveLogic.getRadioVenciClienteProves());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(radiovenciclienteproveAux,radiovenciclienteproves);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getRadioVenciClienteProves().addAll(this.radiovenciclienteprovesEliminados);
					
					radiovenciclienteproveLogic.saveRadioVenciClienteProves();//WithConnection
					//radiovenciclienteproveLogic.getSetVersionRowRadioVenciClienteProves();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRadioVenciClienteProve();
				
				this.radiovenciclienteprovesEliminados= new ArrayList<RadioVenciClienteProve>();		
			}
			
			if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dias Por Vencer GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.radiovenciclienteprove=radiovenciclienteproveAux;
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
      		//this.finishProcessRadioVenciClienteProve();
      	}
		
	}	
	
	public void actualizarRelaciones(RadioVenciClienteProve radiovenciclienteproveLocal) throws Exception {
		
		if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RadioVenciClienteProve radiovenciclienteproveLocal) throws Exception {	
		if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				radiovenciclienteproveLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoRadioVenciDetalleFormJInternalFrame.class)) {
				TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrameLocal=(TipoRadioVenciBeanSwingJInternalFrame) ((TipoRadioVenciDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiporadiovenciBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoRadioVenci(tiporadiovenciBeanSwingJInternalFrameLocal.gettiporadiovenci(),true);
				tiporadiovenciBeanSwingJInternalFrameLocal.actualizarLista(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci,this.tiporadiovencisForeignKey);

				tiporadiovenciBeanSwingJInternalFrameLocal.actualizarRelaciones(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci);

				radiovenciclienteproveLocal.setTipoRadioVenci(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci);

				this.addItemDefectoCombosForeignKeyTipoRadioVenci();
				this.cargarCombosFrameTipoRadioVencisForeignKey("Formulario");
				this.setActualTipoRadioVenciForeignKey(tiporadiovenciBeanSwingJInternalFrameLocal.tiporadiovenci.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRadioVenciClienteProveActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = radiovenciclienteproveValidator.getInvalidValues(this.radiovenciclienteprove);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RadioVenciClienteProve radiovenciclienteprove,List<RadioVenciClienteProve> radiovenciclienteproves) throws Exception {
		try	{		
			RadioVenciClienteProveConstantesFunciones.actualizarLista(radiovenciclienteprove,radiovenciclienteproves,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RadioVenciClienteProve radiovenciclienteprove,List<RadioVenciClienteProve> radiovenciclienteproves) throws Exception {
		try	{			
			RadioVenciClienteProveConstantesFunciones.actualizarSelectedLista(radiovenciclienteprove,radiovenciclienteproves);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RadioVenciClienteProve> radiovenciclienteprovesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				radiovenciclienteprovesLocal=this.radiovenciclienteproveLogic.getRadioVenciClienteProves();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				radiovenciclienteprovesLocal=this.radiovenciclienteproves;
			}
			//ARCHITECTURE
		
			for(RadioVenciClienteProve radiovenciclienteproveLocal:radiovenciclienteprovesLocal) {
				if(this.permiteMantenimiento(radiovenciclienteproveLocal) && radiovenciclienteproveLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RadioVenciClienteProveConstantesFunciones.getRadioVenciClienteProveLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RadioVenciClienteProveConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelid_empresaRadioVenciClienteProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciClienteProveConstantesFunciones.IDTIPORADIOVENCI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelid_tipo_radio_venciRadioVenciClienteProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciClienteProveConstantesFunciones.DIADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_desdeRadioVenciClienteProve,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RadioVenciClienteProveConstantesFunciones.DIAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_hastaRadioVenciClienteProve,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelid_empresaRadioVenciClienteProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelid_tipo_radio_venciRadioVenciClienteProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_desdeRadioVenciClienteProve,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_hastaRadioVenciClienteProve,"");
		
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
		this.iIdNuevoRadioVenciClienteProve--;	
		
		
		this.radiovenciclienteproveAux=new RadioVenciClienteProve();
		
		this.radiovenciclienteproveAux.setId(this.iIdNuevoRadioVenciClienteProve);
		this.radiovenciclienteproveAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.radiovenciclienteproveLogic.getRadioVenciClienteProves().add(this.radiovenciclienteproveAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.radiovenciclienteproves.add(this.radiovenciclienteproveAux);
		}
		//ARCHITECTURE
		
		this.radiovenciclienteprove=this.radiovenciclienteproveAux;
		
		if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteprove);
			this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciClienteProve(this.radiovenciclienteprove);
		}
				
		//this.setDefaultControlesRadioVenciClienteProve();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRadioVenciClienteProve();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRadioVenciClienteProve();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciClienteProve();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRadioVenciClienteProve(this.radiovenciclienteproveBean,this.radiovenciclienteprove,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
			classes=RadioVenciClienteProveConstantesFunciones.getClassesRelationshipsOfRadioVenciClienteProve(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.procesarEventosRadioVenciClienteProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this.radiovenciclienteprove,this.radiovenciclienteproveParameterGeneral,this.isEsNuevoRadioVenciClienteProve,classes);//this.radiovenciclienteproveLogic.getRadioVenciClienteProve()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral,this.radiovenciclienteproveBean,false);
		
		if(this.radiovenciclienteproveReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve());
		}
		
		if(this.radiovenciclienteproveReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve(),classes);//this.radiovenciclienteproveBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRadioVenciClienteProve();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRadioVenciClienteProve();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.RecargarFormRadioVenciClienteProve(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
						
			if(radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciClienteProve();
			}
			
			this.actualizarVisualTableDatosRadioVenciClienteProve();
			
			this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciClienteProve(), this.getIndiceNuevoRadioVenciClienteProve());
			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
						
			this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRadioVenciClienteProve(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setEnabled(isHabilitar && this.radiovenciclienteproveConstantesFunciones.activardia_desdeRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setEnabled(isHabilitar && this.radiovenciclienteproveConstantesFunciones.activardia_hastaRadioVenciClienteProve);	
		//
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setEnabled(isHabilitar && this.radiovenciclienteproveConstantesFunciones.activarid_empresaRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setEnabled(isHabilitar && this.radiovenciclienteproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciClienteProve);
	};
	
	public void setDefaultControlesRadioVenciClienteProve() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRadioVenciClienteProve(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(true);			
			this.radiovenciclienteproveSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.setVisible(true);
			
					
		} else {
			//this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(false);			
			this.radiovenciclienteproveSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRadioVenciClienteProve() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				if(radiovenciclienteproveAux.getId().equals(this.iIdNuevoRadioVenciClienteProve)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproves) {
				if(radiovenciclienteproveAux.getId().equals(this.iIdNuevoRadioVenciClienteProve)) {
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
	
	public int getIndiceActualRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				if(radiovenciclienteproveAux.getId().equals(radiovenciclienteprove.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproves) {
				if(radiovenciclienteproveAux.getId().equals(radiovenciclienteprove.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteproveOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				if(radiovenciclienteproveAux.getRadioVenciClienteProveOriginal().getId().equals(radiovenciclienteproveOriginal.getId())) {
					existe=true;
					radiovenciclienteproveOriginal.setId(radiovenciclienteproveAux.getId());
					radiovenciclienteproveOriginal.setVersionRow(radiovenciclienteproveAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproves) {
				if(radiovenciclienteproveAux.getRadioVenciClienteProveOriginal().getId().equals(radiovenciclienteproveOriginal.getId())) {
					existe=true;
					radiovenciclienteproveOriginal.setId(radiovenciclienteproveAux.getId());
					radiovenciclienteproveOriginal.setVersionRow(radiovenciclienteproveAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRadioVenciClienteProve(Boolean esParaCancelar) throws Exception {
		radiovenciclienteprovesAux=new ArrayList<RadioVenciClienteProve>();
		radiovenciclienteproveAux=new RadioVenciClienteProve();
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
					if(radiovenciclienteproveAux.getId()<0) {
						radiovenciclienteprovesAux.add(radiovenciclienteproveAux);
					}		
				}
				this.iIdNuevoRadioVenciClienteProve=0L;
				this.radiovenciclienteproveLogic.getRadioVenciClienteProves().removeAll(radiovenciclienteprovesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproves) {
					if(radiovenciclienteproveAux.getId()<0) {
						radiovenciclienteprovesAux.add(radiovenciclienteproveAux);
					}		
				}
				this.iIdNuevoRadioVenciClienteProve=0L;
				this.radiovenciclienteproves.removeAll(radiovenciclienteprovesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRadioVenciClienteProve 
					&& this.radiovenciclienteproveLogic.getRadioVenciClienteProves().size()>0
					) {
					radiovenciclienteproveAux=this.radiovenciclienteproveLogic.getRadioVenciClienteProves().get(this.radiovenciclienteproveLogic.getRadioVenciClienteProves().size() - 1);
				
					if(radiovenciclienteproveAux.getId()<0) {
						this.radiovenciclienteproveLogic.getRadioVenciClienteProves().remove(radiovenciclienteproveAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRadioVenciClienteProve && this.radiovenciclienteproves.size()>0) {
					radiovenciclienteproveAux=this.radiovenciclienteproves.get(this.radiovenciclienteproves.size() - 1);
				
					if(radiovenciclienteproveAux.getId()<0) {
						this.radiovenciclienteproves.remove(radiovenciclienteproveAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRadioVenciClienteProve(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(radiovenciclienteprove.getId()<0) {
				this.radiovenciclienteproveLogic.getRadioVenciClienteProves().remove(this.radiovenciclienteprove);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(radiovenciclienteprove.getId()<0) {
				this.radiovenciclienteproves.remove(this.radiovenciclienteprove);
			}
		}			
	}
	
	public void setEstadosInicialesRadioVenciClienteProve(List<RadioVenciClienteProve> radiovenciclienteprovesAux) throws Exception {
		RadioVenciClienteProveConstantesFunciones.setEstadosInicialesRadioVenciClienteProve(radiovenciclienteprovesAux);
	}
	
	public void setEstadosInicialesRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteproveAux) throws Exception {
		RadioVenciClienteProveConstantesFunciones.setEstadosInicialesRadioVenciClienteProve(radiovenciclienteproveAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRadioVenciClienteProveActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRadioVenciClienteProveActual()) {
				if(!this.isEsNuevoRadioVenciClienteProve) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRadioVenciClienteProve=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRadioVenciClienteProveActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dias Por Vencer ?", "MANTENIMIENTO DE Dias Por Vencer", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RadioVenciClienteProve radiovenciclienteprove) throws Exception {
		RadioVenciClienteProveConstantesFunciones.seleccionarAsignar(this.radiovenciclienteprove,radiovenciclienteprove);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRadioVenciClienteProve=this.isPermisoActualizarOriginalRadioVenciClienteProve;
			
			
			this.seleccionarAsignar(radiovenciclienteprove);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RadioVenciClienteProveConstantesFunciones.quitarEspaciosRadioVenciClienteProve(this.radiovenciclienteprove,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.radiovenciclienteproveSessionBean.setsFuncionBusquedaRapida(this.radiovenciclienteproveSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRadioVenciClienteProve) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRadioVenciClienteProve(esParaCancelar);				
				this.cancelarNuevoRadioVenciClienteProve(esParaCancelar);								
			}
			
			this.radiovenciclienteprove=new RadioVenciClienteProve();
			
			this.inicializarRadioVenciClienteProve();
			
			this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRadioVenciClienteProve() throws Exception {
		try {
			RadioVenciClienteProveConstantesFunciones.inicializarRadioVenciClienteProve(this.radiovenciclienteprove);
			
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
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.radiovenciclienteproveLogic.getRadioVenciClienteProves().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRadioVenciClienteProves(String sAccionBusqueda,List<RadioVenciClienteProve> radiovenciclienteprovesParaReportes) throws Exception {
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
					sPathReporteFinal="RadioVenciClienteProve"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RadioVenciClienteProveMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RadioVenciClienteProveMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RadioVenciClienteProve"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dias Por Vencers");		
		parameters.put("busquedapor", RadioVenciClienteProveConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRadioVenciClienteProve=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RadioVenciClienteProveConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RadioVenciClienteProveConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRadioVenciClienteProve=new JRBeanArrayDataSource(RadioVenciClienteProveJInternalFrame.TraerRadioVenciClienteProveBeans(radiovenciclienteprovesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRadioVenciClienteProve);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RadioVenciClienteProveConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RadioVenciClienteProveConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RadioVenciClienteProveBean.TraerRadioVenciClienteProveBeans(radiovenciclienteprovesParaReportes).toArray()));
							
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
				this.generarExcelReporteRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProveActionPerformed(null);
					//this.generarExcelReporteRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRadioVenciClienteProves(sAccionBusqueda,sTipoArchivoReporte,radiovenciclienteprovesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRadioVenciClienteProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciClienteProve> radiovenciclienteprovesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciClienteProves");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRadioVenciClienteProve("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RadioVenciClienteProve radiovenciclienteprove : radiovenciclienteprovesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RadioVenciClienteProveConstantesFunciones.generarExcelReporteDataRadioVenciClienteProve("NORMAL",row,workbook,radiovenciclienteprove,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRadioVenciClienteProve(String sTipo,Row row,Workbook workbook) {
		
		RadioVenciClienteProveConstantesFunciones.generarExcelReporteHeaderRadioVenciClienteProve(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRadioVenciClienteProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciClienteProve> radiovenciclienteprovesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciClienteProves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RadioVenciClienteProve radiovenciclienteprove : radiovenciclienteprovesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RadioVenciClienteProveConstantesFunciones.getRadioVenciClienteProveDescripcion(radiovenciclienteprove));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciclienteprove.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciclienteprove.gettiporadiovenci_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciclienteprove.getdia_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(radiovenciclienteprove.getdia_hasta());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRadioVenciClienteProves(String sAccionBusqueda,String sTipoArchivoReporte,List<RadioVenciClienteProve> radiovenciclienteprovesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RadioVenciClienteProve> radiovenciclienteprovesRespaldo=null;
		
		classes=RadioVenciClienteProveConstantesFunciones.getClassesRelationshipsOfRadioVenciClienteProve(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.radiovenciclienteproveLogic.setDatosCliente(this.datosCliente);
		this.radiovenciclienteproveLogic.setDatosDeep(this.datosDeep);
		this.radiovenciclienteproveLogic.setIsConDeep(true);
		
		radiovenciclienteprovesRespaldo=this.radiovenciclienteproveLogic.getRadioVenciClienteProves();
		
		this.radiovenciclienteproveLogic.setRadioVenciClienteProves(radiovenciclienteprovesParaReportes);	
		this.radiovenciclienteproveLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		radiovenciclienteprovesParaReportes=this.radiovenciclienteproveLogic.getRadioVenciClienteProves();
		this.radiovenciclienteproveLogic.setRadioVenciClienteProves(radiovenciclienteprovesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RadioVenciClienteProves");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRadioVenciClienteProve("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RadioVenciClienteProve radiovenciclienteprove : radiovenciclienteprovesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRadioVenciClienteProve("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RadioVenciClienteProveConstantesFunciones.generarExcelReporteDataRadioVenciClienteProve("NORMAL",row,workbook,radiovenciclienteprove,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RadioVenciClienteProveConstantesFunciones.getRadioVenciClienteProveDescripcion(radiovenciclienteprove));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRadioVenciClienteProve() throws Exception {		
		this.startProcessRadioVenciClienteProve(true);
	}
	
	public void startProcessRadioVenciClienteProve(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRadioVenciClienteProve ,this.jPanelParametrosReportesRadioVenciClienteProve, this.jScrollPanelDatosRadioVenciClienteProve,this.jPanelPaginacionRadioVenciClienteProve, this.jScrollPanelDatosEdicionRadioVenciClienteProve, this.jPanelAccionesRadioVenciClienteProve,this.jPanelAccionesFormularioRadioVenciClienteProve,this.jmenuBarRadioVenciClienteProve,this.jmenuBarDetalleRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve);		
		
		final JTabbedPane jTabbedPaneBusquedasRadioVenciClienteProve=this.jTabbedPaneBusquedasRadioVenciClienteProve; 
		
		final JPanel jPanelParametrosReportesRadioVenciClienteProve=this.jPanelParametrosReportesRadioVenciClienteProve;
		//final JScrollPane jScrollPanelDatosRadioVenciClienteProve=this.jScrollPanelDatosRadioVenciClienteProve;
		final JTable jTableDatosRadioVenciClienteProve=this.jTableDatosRadioVenciClienteProve;		
		final JPanel jPanelPaginacionRadioVenciClienteProve=this.jPanelPaginacionRadioVenciClienteProve;
		//final JScrollPane jScrollPanelDatosEdicionRadioVenciClienteProve=this.jScrollPanelDatosEdicionRadioVenciClienteProve;
		final JPanel jPanelAccionesRadioVenciClienteProve=this.jPanelAccionesRadioVenciClienteProve;
		
		JPanel jPanelCamposAuxiliarRadioVenciClienteProve=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRadioVenciClienteProve=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			jPanelCamposAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelCamposRadioVenciClienteProve;
			jPanelAccionesFormularioAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelAccionesFormularioRadioVenciClienteProve;
		}
		
		final JPanel jPanelCamposRadioVenciClienteProve=jPanelCamposAuxiliarRadioVenciClienteProve;
		final JPanel jPanelAccionesFormularioRadioVenciClienteProve=jPanelAccionesFormularioAuxiliarRadioVenciClienteProve;
		
		
		final JMenuBar jmenuBarRadioVenciClienteProve=this.jmenuBarRadioVenciClienteProve;
		final JToolBar jTtoolBarRadioVenciClienteProve=this.jTtoolBarRadioVenciClienteProve;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRadioVenciClienteProve=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRadioVenciClienteProve=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			jmenuBarDetalleAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jmenuBarDetalleRadioVenciClienteProve;
			jTtoolBarDetalleAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jTtoolBarDetalleRadioVenciClienteProve;
		}
		
		final JMenuBar jmenuBarDetalleRadioVenciClienteProve=jmenuBarDetalleAuxiliarRadioVenciClienteProve;
		final JToolBar jTtoolBarDetalleRadioVenciClienteProve=jTtoolBarDetalleAuxiliarRadioVenciClienteProve;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRadioVenciClienteProve;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRadioVenciClienteProve;
			processRunnable.jTableDatos=jTableDatosRadioVenciClienteProve;
			processRunnable.jPanelCampos=jPanelCamposRadioVenciClienteProve;
			processRunnable.jPanelPaginacion=jPanelPaginacionRadioVenciClienteProve;
			processRunnable.jPanelAcciones=jPanelAccionesRadioVenciClienteProve;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRadioVenciClienteProve;
			
			
			processRunnable.jmenuBar=jmenuBarRadioVenciClienteProve;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRadioVenciClienteProve;
			processRunnable.jTtoolBar=jTtoolBarRadioVenciClienteProve;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRadioVenciClienteProve;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRadioVenciClienteProve ,jPanelParametrosReportesRadioVenciClienteProve,jTableDatosRadioVenciClienteProve, /*jScrollPanelDatosRadioVenciClienteProve,*/jPanelCamposRadioVenciClienteProve,jPanelPaginacionRadioVenciClienteProve, /*jScrollPanelDatosEdicionRadioVenciClienteProve,*/ jPanelAccionesRadioVenciClienteProve,jPanelAccionesFormularioRadioVenciClienteProve,jmenuBarRadioVenciClienteProve,jmenuBarDetalleRadioVenciClienteProve,jTtoolBarRadioVenciClienteProve,jTtoolBarDetalleRadioVenciClienteProve);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRadioVenciClienteProve ,jPanelParametrosReportesRadioVenciClienteProve, jScrollPanelDatosRadioVenciClienteProve,jPanelPaginacionRadioVenciClienteProve, jScrollPanelDatosEdicionRadioVenciClienteProve, jPanelAccionesRadioVenciClienteProve,jPanelAccionesFormularioRadioVenciClienteProve,jmenuBarRadioVenciClienteProve,jmenuBarDetalleRadioVenciClienteProve,jTtoolBarRadioVenciClienteProve,jTtoolBarDetalleRadioVenciClienteProve);
						
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
	
	public void finishProcessRadioVenciClienteProve() {// throws Exception 
		this.finishProcessRadioVenciClienteProve(true);
	}
	
	public void finishProcessRadioVenciClienteProve(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRadioVenciClienteProve ,this.jPanelParametrosReportesRadioVenciClienteProve, this.jScrollPanelDatosRadioVenciClienteProve,this.jPanelPaginacionRadioVenciClienteProve, this.jScrollPanelDatosEdicionRadioVenciClienteProve, this.jPanelAccionesRadioVenciClienteProve,this.jPanelAccionesFormularioRadioVenciClienteProve,this.jmenuBarRadioVenciClienteProve,this.jmenuBarDetalleRadioVenciClienteProve,this.jTtoolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve);		
		
		final JTabbedPane jTabbedPaneBusquedasRadioVenciClienteProve=this.jTabbedPaneBusquedasRadioVenciClienteProve; 
		
		final JPanel jPanelParametrosReportesRadioVenciClienteProve=this.jPanelParametrosReportesRadioVenciClienteProve;
		//final JScrollPane jScrollPanelDatosRadioVenciClienteProve=this.jScrollPanelDatosRadioVenciClienteProve;
		final JTable jTableDatosRadioVenciClienteProve=this.jTableDatosRadioVenciClienteProve;		
		final JPanel jPanelPaginacionRadioVenciClienteProve=this.jPanelPaginacionRadioVenciClienteProve;
		//final JScrollPane jScrollPanelDatosEdicionRadioVenciClienteProve=this.jScrollPanelDatosEdicionRadioVenciClienteProve;
		final JPanel jPanelAccionesRadioVenciClienteProve=this.jPanelAccionesRadioVenciClienteProve;
		
		JPanel jPanelCamposAuxiliarRadioVenciClienteProve=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRadioVenciClienteProve=new JPanel();
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			jPanelCamposAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelCamposRadioVenciClienteProve;
			jPanelAccionesFormularioAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelAccionesFormularioRadioVenciClienteProve;
		}
		
		final JPanel jPanelCamposRadioVenciClienteProve=jPanelCamposAuxiliarRadioVenciClienteProve;
		final JPanel jPanelAccionesFormularioRadioVenciClienteProve=jPanelAccionesFormularioAuxiliarRadioVenciClienteProve;
		
		
		final JMenuBar jmenuBarRadioVenciClienteProve=this.jmenuBarRadioVenciClienteProve;		
		final JToolBar jTtoolBarRadioVenciClienteProve=this.jTtoolBarRadioVenciClienteProve;
				
		JMenuBar jmenuBarDetalleAuxiliarRadioVenciClienteProve=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRadioVenciClienteProve=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			jmenuBarDetalleAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jmenuBarDetalleRadioVenciClienteProve;
			jTtoolBarDetalleAuxiliarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jTtoolBarDetalleRadioVenciClienteProve;		
		}
		
		final JMenuBar jmenuBarDetalleRadioVenciClienteProve=jmenuBarDetalleAuxiliarRadioVenciClienteProve;
		final JToolBar jTtoolBarDetalleRadioVenciClienteProve=jTtoolBarDetalleAuxiliarRadioVenciClienteProve;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRadioVenciClienteProve;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRadioVenciClienteProve;
			processRunnable.jTableDatos=jTableDatosRadioVenciClienteProve;
			processRunnable.jPanelCampos=jPanelCamposRadioVenciClienteProve;
			processRunnable.jPanelPaginacion=jPanelPaginacionRadioVenciClienteProve;
			processRunnable.jPanelAcciones=jPanelAccionesRadioVenciClienteProve;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRadioVenciClienteProve;
			
			
			processRunnable.jmenuBar=jmenuBarRadioVenciClienteProve;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRadioVenciClienteProve;
			processRunnable.jTtoolBar=jTtoolBarRadioVenciClienteProve;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRadioVenciClienteProve;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRadioVenciClienteProve ,jPanelParametrosReportesRadioVenciClienteProve, jTableDatosRadioVenciClienteProve,/*jScrollPanelDatosRadioVenciClienteProve,*/jPanelCamposRadioVenciClienteProve,jPanelPaginacionRadioVenciClienteProve, /*jScrollPanelDatosEdicionRadioVenciClienteProve,*/ jPanelAccionesRadioVenciClienteProve,jPanelAccionesFormularioRadioVenciClienteProve,jmenuBarRadioVenciClienteProve,jmenuBarDetalleRadioVenciClienteProve,jTtoolBarRadioVenciClienteProve,jTtoolBarDetalleRadioVenciClienteProve));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRadioVenciClienteProve(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRadioVenciClienteProve(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRadioVenciClienteProve(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRadioVenciClienteProve(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRadioVenciClienteProve,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRadioVenciClienteProve,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRadioVenciClienteProve(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRadioVenciClienteProve,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRadioVenciClienteProve,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.radiovenciclienteproveConstantesFunciones.getsFinalQueryRadioVenciClienteProve();
		String  finalQueryPaginacionTodos=this.radiovenciclienteproveConstantesFunciones.getsFinalQueryRadioVenciClienteProve();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RadioVenciClienteProveConstantesFunciones.getArrayColumnasGlobalesNoRadioVenciClienteProve(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RadioVenciClienteProveConstantesFunciones.getArrayColumnasGlobalesRadioVenciClienteProve(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RadioVenciClienteProveConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.radiovenciclienteprovesEliminados= new ArrayList<RadioVenciClienteProve>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRadioVenciClienteProve();
		
				///*RadioVenciClienteProveSessionBean*/this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
			
			if(this.radiovenciclienteproveSessionBean==null) {
				this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
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
					this.iNumeroPaginacion=RadioVenciClienteProveConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RadioVenciClienteProveConstantesFunciones.getClassesForeignKeysOfRadioVenciClienteProve(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/radiovenciclienteprove."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			radiovenciclienteprovesAux= new ArrayList<RadioVenciClienteProve>();
			
				
			radiovenciclienteproveLogic.setDatosCliente(this.datosCliente);
			radiovenciclienteproveLogic.setDatosDeep(this.datosDeep);
			radiovenciclienteproveLogic.setIsConDeep(true);
			
			
			radiovenciclienteproveLogic.getRadioVenciClienteProveDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					radiovenciclienteproveLogic.getTodosRadioVenciClienteProves(finalQueryGlobal,pagination);
					
					//radiovenciclienteproveLogic.getTodosRadioVenciClienteProvesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(radiovenciclienteproveLogic.getRadioVenciClienteProves()==null|| radiovenciclienteproveLogic.getRadioVenciClienteProves().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciclienteprovesAux= new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteprovesAux.addAll(radiovenciclienteproveLogic.getRadioVenciClienteProves());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteprovesAux= new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteprovesAux.addAll(radiovenciclienteproves);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciclienteproveLogic.getTodosRadioVenciClienteProves(finalQueryGlobal+"",this.pagination);												
							
							//radiovenciclienteproveLogic.getTodosRadioVenciClienteProvesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteproveLogic.getRadioVenciClienteProves() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							radiovenciclienteproveLogic.setRadioVenciClienteProves(new ArrayList<RadioVenciClienteProve>());					
							radiovenciclienteproveLogic.getRadioVenciClienteProves().addAll(radiovenciclienteprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteproves=new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteproves.addAll(radiovenciclienteprovesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRadioVenciClienteProve=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRadioVenciClienteProve=this.idActual;
				
				} else if(this.idRadioVenciClienteProveActual!=null && this.idRadioVenciClienteProveActual!=0L) {
					idRadioVenciClienteProve=idRadioVenciClienteProveActual;
				}
				
					
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndicePorId(idRadioVenciClienteProve);
				
				this.radiovenciclienteproves=new ArrayList<RadioVenciClienteProve>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					radiovenciclienteproveLogic.getEntity(idRadioVenciClienteProve);
					
					//radiovenciclienteproveLogic.getEntityWithConnection(idRadioVenciClienteProve);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciclienteproveLogic.setRadioVenciClienteProves(new ArrayList<RadioVenciClienteProve>());
					radiovenciclienteproveLogic.getRadioVenciClienteProves().add(radiovenciclienteproveLogic.getRadioVenciClienteProve());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciclienteproves=new ArrayList<RadioVenciClienteProve>();
					this.radiovenciclienteproves.add(radiovenciclienteprove);
				}
				
				if(radiovenciclienteproveLogic.getRadioVenciClienteProve()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=radiovenciclienteproveLogic.getRadioVenciClienteProves()==null||radiovenciclienteproveLogic.getRadioVenciClienteProves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=radiovenciclienteproves==null|| radiovenciclienteproves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteprovesAux=new ArrayList<RadioVenciClienteProve>();
						radiovenciclienteprovesAux.addAll(radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteprovesAux=new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteprovesAux.addAll(radiovenciclienteproves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRadioVenciClienteProves("FK_IdEmpresa",radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRadioVenciClienteProves("FK_IdEmpresa",radiovenciclienteproves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveLogic.setRadioVenciClienteProves(new ArrayList<RadioVenciClienteProve>());
						radiovenciclienteproveLogic.getRadioVenciClienteProves().addAll(radiovenciclienteprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteproves=new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteproves.addAll(radiovenciclienteprovesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoRadioVenci")) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdTipoRadioVenci(finalQueryGlobal,pagination,id_tipo_radio_venciFK_IdTipoRadioVenci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=radiovenciclienteproveLogic.getRadioVenciClienteProves()==null||radiovenciclienteproveLogic.getRadioVenciClienteProves().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=radiovenciclienteproves==null|| radiovenciclienteproves.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteprovesAux=new ArrayList<RadioVenciClienteProve>();
						radiovenciclienteprovesAux.addAll(radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteprovesAux=new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteprovesAux.addAll(radiovenciclienteproves);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdTipoRadioVenci(finalQueryGlobal,pagination,id_tipo_radio_venciFK_IdTipoRadioVenci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RadioVenciClienteProveConstantesFunciones.getDetalleIndiceFK_IdTipoRadioVenci(id_tipo_radio_venciFK_IdTipoRadioVenci);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRadioVenciClienteProves("FK_IdTipoRadioVenci",radiovenciclienteproveLogic.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRadioVenciClienteProves("FK_IdTipoRadioVenci",radiovenciclienteproves);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveLogic.setRadioVenciClienteProves(new ArrayList<RadioVenciClienteProve>());
						radiovenciclienteproveLogic.getRadioVenciClienteProves().addAll(radiovenciclienteprovesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteproves=new ArrayList<RadioVenciClienteProve>();
							radiovenciclienteproves.addAll(radiovenciclienteprovesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRadioVenciClienteProve();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRadioVenciClienteProve();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=radiovenciclienteproveLogic.getRadioVenciClienteProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciclienteproves.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=radiovenciclienteproveLogic.getRadioVenciClienteProves().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=radiovenciclienteproves.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RadioVenciClienteProve radiovenciclienteprove) {
		Boolean permite=true;
		
		if(this.radiovenciclienteprove.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RadioVenciClienteProveConstantesFunciones.getOrderByListaRadioVenciClienteProve();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RadioVenciClienteProveConstantesFunciones.getOrderByListaRadioVenciClienteProve();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				if(radiovenciclienteprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciclienteproveTotales=radiovenciclienteprove;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciClienteProve radiovenciclienteprove:this.radiovenciclienteproves) {
				if(radiovenciclienteprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciclienteproveTotales=radiovenciclienteprove;
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
			this.radiovenciclienteproveAux=new RadioVenciClienteProve();
			this.radiovenciclienteproveAux.setsType(Constantes2.S_TOTALES);
			this.radiovenciclienteproveAux.setIsNew(false);
			this.radiovenciclienteproveAux.setIsChanged(false);
			this.radiovenciclienteproveAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RadioVenciClienteProveConstantesFunciones.TotalizarValoresFilaRadioVenciClienteProve(this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this.radiovenciclienteproveAux);
				
				this.radiovenciclienteproveLogic.getRadioVenciClienteProves().add(this.radiovenciclienteproveAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RadioVenciClienteProveConstantesFunciones.TotalizarValoresFilaRadioVenciClienteProve(this.radiovenciclienteproves,this.radiovenciclienteproveAux);
				
				this.radiovenciclienteproves.add(this.radiovenciclienteproveAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		radiovenciclienteproveTotales=new RadioVenciClienteProve();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.radiovenciclienteproveLogic.getRadioVenciClienteProves().remove(radiovenciclienteproveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.radiovenciclienteproves.remove(radiovenciclienteproveTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		radiovenciclienteproveTotales=new RadioVenciClienteProve();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				if(radiovenciclienteprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciclienteproveTotales=radiovenciclienteprove;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RadioVenciClienteProveConstantesFunciones.TotalizarValoresFilaRadioVenciClienteProve(this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),radiovenciclienteproveTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RadioVenciClienteProve radiovenciclienteprove:this.radiovenciclienteproves) {
				if(radiovenciclienteprove.getsType().equals(Constantes2.S_TOTALES)) {
					radiovenciclienteproveTotales=radiovenciclienteprove;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RadioVenciClienteProveConstantesFunciones.TotalizarValoresFilaRadioVenciClienteProve(this.radiovenciclienteproves,radiovenciclienteproveTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRadioVenciClienteProvesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRadioVenciClienteProvesFK_IdTipoRadioVenci()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoRadioVenci";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRadioVenciClienteProvesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRadioVenciClienteProvesFK_IdTipoRadioVenci(String sFinalQuery,Long id_tipo_radio_venci)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciclienteproveLogic.getRadioVenciClienteProvesFK_IdTipoRadioVenci(sFinalQuery,this.pagination,id_tipo_radio_venci);
				
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
	
	public void inicializarPermisosRadioVenciClienteProve() {
		this.isPermisoTodoRadioVenciClienteProve=false;
		this.isPermisoNuevoRadioVenciClienteProve=false;
		this.isPermisoActualizarRadioVenciClienteProve=false;
		this.isPermisoActualizarOriginalRadioVenciClienteProve=false;
		this.isPermisoEliminarRadioVenciClienteProve=false;
		this.isPermisoGuardarCambiosRadioVenciClienteProve=false;
		this.isPermisoConsultaRadioVenciClienteProve=false;
		this.isPermisoBusquedaRadioVenciClienteProve=false;
		this.isPermisoReporteRadioVenciClienteProve=false;		
		this.isPermisoOrdenRadioVenciClienteProve=false;		
		this.isPermisoPaginacionMedioRadioVenciClienteProve=false;		
		this.isPermisoPaginacionAltoRadioVenciClienteProve=false;
		this.isPermisoPaginacionTodoRadioVenciClienteProve=false;
		this.isPermisoCopiarRadioVenciClienteProve=false;		
		this.isPermisoVerFormRadioVenciClienteProve=false;		
		this.isPermisoDuplicarRadioVenciClienteProve=false;		
		this.isPermisoOrdenRadioVenciClienteProve=false;		
	}
	
	public void setPermisosUsuarioRadioVenciClienteProve(Boolean isPermiso) {
		this.isPermisoTodoRadioVenciClienteProve=isPermiso;
		this.isPermisoNuevoRadioVenciClienteProve=isPermiso;
		this.isPermisoActualizarRadioVenciClienteProve=isPermiso;
		this.isPermisoActualizarOriginalRadioVenciClienteProve=isPermiso;
		this.isPermisoEliminarRadioVenciClienteProve=isPermiso;
		this.isPermisoGuardarCambiosRadioVenciClienteProve=isPermiso;
		this.isPermisoConsultaRadioVenciClienteProve=isPermiso;
		this.isPermisoBusquedaRadioVenciClienteProve=isPermiso;
		this.isPermisoReporteRadioVenciClienteProve=isPermiso;
		this.isPermisoOrdenRadioVenciClienteProve=isPermiso;		
		this.isPermisoPaginacionMedioRadioVenciClienteProve=isPermiso;		
		this.isPermisoPaginacionAltoRadioVenciClienteProve=isPermiso;		
		this.isPermisoPaginacionTodoRadioVenciClienteProve=isPermiso;		
		this.isPermisoCopiarRadioVenciClienteProve=isPermiso;		
		this.isPermisoVerFormRadioVenciClienteProve=isPermiso;		
		this.isPermisoDuplicarRadioVenciClienteProve=isPermiso;
		this.isPermisoOrdenRadioVenciClienteProve=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRadioVenciClienteProve(Boolean isPermiso) {
		//this.isPermisoTodoRadioVenciClienteProve=isPermiso;
		this.isPermisoNuevoRadioVenciClienteProve=isPermiso;
		this.isPermisoActualizarRadioVenciClienteProve=isPermiso;
		this.isPermisoActualizarOriginalRadioVenciClienteProve=isPermiso;
		this.isPermisoEliminarRadioVenciClienteProve=isPermiso;
		this.isPermisoGuardarCambiosRadioVenciClienteProve=isPermiso;
		//this.isPermisoConsultaRadioVenciClienteProve=isPermiso;
		//this.isPermisoBusquedaRadioVenciClienteProve=isPermiso;
		//this.isPermisoReporteRadioVenciClienteProve=isPermiso;
		//this.isPermisoOrdenRadioVenciClienteProve=isPermiso;		
		//this.isPermisoPaginacionMedioRadioVenciClienteProve=isPermiso;		
		//this.isPermisoPaginacionAltoRadioVenciClienteProve=isPermiso;		
		//this.isPermisoPaginacionTodoRadioVenciClienteProve=isPermiso;		
		//this.isPermisoCopiarRadioVenciClienteProve=isPermiso;		
		//this.isPermisoDuplicarRadioVenciClienteProve=isPermiso;
		//this.isPermisoOrdenRadioVenciClienteProve=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRadioVenciClienteProveClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RadioVenciClienteProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRadioVenciClienteProve(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRadioVenciClienteProveClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRadioVenciClienteProveClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRadioVenciClienteProveClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRadioVenciClienteProveClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRadioVenciClienteProve() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RadioVenciClienteProveJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRadioVenciClienteProve=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRadioVenciClienteProve=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRadioVenciClienteProve=this.isPermisoActualizarRadioVenciClienteProve;
			this.isPermisoEliminarRadioVenciClienteProve=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRadioVenciClienteProve=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRadioVenciClienteProve=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRadioVenciClienteProve=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRadioVenciClienteProve=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRadioVenciClienteProve=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRadioVenciClienteProve=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRadioVenciClienteProve=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRadioVenciClienteProve=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRadioVenciClienteProve=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRadioVenciClienteProve=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRadioVenciClienteProve=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRadioVenciClienteProve=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRadioVenciClienteProve=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRadioVenciClienteProve.setToolTipText(this.jTableDatosRadioVenciClienteProve.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRadioVenciClienteProve(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRadioVenciClienteProve(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RadioVenciClienteProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RadioVenciClienteProveJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRadioVenciClienteProve() throws Exception {
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
	public void inicializarCombosForeignKeyRadioVenciClienteProveListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tiporadiovencisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRadioVenciClienteProveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RadioVenciClienteProveJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRadioVenciClienteProveListas(false);
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
	
	public void cargarCombosLoteForeignKeyRadioVenciClienteProveListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveReturnGeneral=new RadioVenciClienteProveParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.radiovenciclienteproveConstantesFunciones.cargarid_empresaRadioVenciClienteProve)
					 || (this.esRecargarFks && this.radiovenciclienteproveConstantesFunciones.cargarid_empresaRadioVenciClienteProve)) {

					if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+radiovenciclienteproveSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoRadioVenci="";

				if(((this.tiporadiovencisForeignKey==null||this.tiporadiovencisForeignKey.size()<=0) && this.radiovenciclienteproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciClienteProve)
					 || (this.esRecargarFks && this.radiovenciclienteproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciClienteProve)) {

					if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoRadioVenciConstantesFunciones.getArrayColumnasGlobalesTipoRadioVenci(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoRadioVenci=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoRadioVenciConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoRadioVenci=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoRadioVenci, "");
						finalQueryGlobalTipoRadioVenci+=TipoRadioVenciConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoRadioVencisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoRadioVenci=" WHERE " + ConstantesSql.ID + "="+radiovenciclienteproveSessionBean.getlidTipoRadioVenciActual();
					}
				} else {
					finalQueryGlobalTipoRadioVenci="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.cargarCombosLoteForeignKeyRadioVenciClienteProve(finalQueryGlobalEmpresa,finalQueryGlobalTipoRadioVenci);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=radiovenciclienteproveReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoRadioVenci.equals("NONE")) {
				this.tiporadiovencisForeignKey=radiovenciclienteproveReturnGeneral.gettiporadiovencisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRadioVenciClienteProve()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoRadioVenci();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.radiovenciclienteproveSessionBean==null) {
				this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
			}

			if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.radiovenciclienteproveSessionBean.getisBusquedaDesdeForeignKeySesionTipoRadioVenci()) {
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
	
	public void initActionsCombosTodosForeignKeyRadioVenciClienteProve()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRadioVenciClienteProve(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRadioVenciClienteProve()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciClienteProve();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove)throws Exception {	
		try {
			
			this.setActualTipoRadioVenciForeignKey(radiovenciclienteprove.getid_tipo_radio_venci(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRadioVenciClienteProve()throws Exception {	
		try {
			
			this.setActualTipoRadioVenciForeignKey(this.radiovenciclienteproveConstantesFunciones.getid_tipo_radio_venci(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRadioVenciClienteProve()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRadioVenciClienteProve()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRadioVenciClienteProve()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRadioVenciClienteProve()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRadioVenciClienteProve()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoRadioVencisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRadioVenciClienteProve(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoRadioVencisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRadioVenciClienteProve()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.getItemCount()>0) {
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getItemCount()>0) {
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public RadioVenciClienteProveBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RadioVenciClienteProveBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RadioVenciClienteProveBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean(); 
		this.radiovenciclienteproveConstantesFunciones=new RadioVenciClienteProveConstantesFunciones(); 
		this.radiovenciclienteproveBean=new RadioVenciClienteProve();//(this.radiovenciclienteproveConstantesFunciones); 		
		this.radiovenciclienteproveReturnGeneral=new RadioVenciClienteProveParameterReturnGeneral(); 
		
		this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RadioVenciClienteProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RadioVenciClienteProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RadioVenciClienteProveBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRadioVenciClienteProve(true);
			
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
			
			this.radiovenciclienteproveConstantesFunciones=new RadioVenciClienteProveConstantesFunciones(); 
			this.radiovenciclienteproveBean=new RadioVenciClienteProve();//this.radiovenciclienteproveConstantesFunciones); 			
			this.radiovenciclienteproveReturnGeneral=new RadioVenciClienteProveParameterReturnGeneral(); 
		
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dias Por Vencer Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.radiovenciclienteprove=new RadioVenciClienteProve();
			this.radiovenciclienteproves = new ArrayList<RadioVenciClienteProve>();
			this.radiovenciclienteprovesAux = new ArrayList<RadioVenciClienteProve>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic=new RadioVenciClienteProveLogic();
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			//this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRadioVenciClienteProve);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRadioVenciClienteProve);	
					}
					
					if(this.jInternalFrameImportacionRadioVenciClienteProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRadioVenciClienteProve);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRadioVenciClienteProve!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRadioVenciClienteProve);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRadioVenciClienteProve);
				this.jInternalFrameDetalleFormRadioVenciClienteProve.setVisible(false);
				this.jInternalFrameDetalleFormRadioVenciClienteProve.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRadioVenciClienteProve);
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setVisible(false);
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRadioVenciClienteProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRadioVenciClienteProve);
					this.jInternalFrameImportacionRadioVenciClienteProve.setVisible(false);
					this.jInternalFrameImportacionRadioVenciClienteProve.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRadioVenciClienteProve!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRadioVenciClienteProve);
					this.jInternalFrameOrderByRadioVenciClienteProve.setVisible(false);
					this.jInternalFrameOrderByRadioVenciClienteProve.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRadioVenciClienteProveActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RadioVenciClienteProveConstantesFunciones.INUMEROPAGINACION;
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
			
			this.radiovenciclienteproveReturnGeneral=new RadioVenciClienteProveParameterReturnGeneral();
			
			this.radiovenciclienteproveParameterGeneral=new RadioVenciClienteProveParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.radiovenciclienteproveLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RadioVenciClienteProveJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado(),this.radiovenciclienteproveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RadioVenciClienteProveConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado(),this.radiovenciclienteproveSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaDuplicarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaCopiarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaVerFormRadioVenciClienteProve=true;
			this.isVisibilidadCeldaOrdenRadioVenciClienteProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoRadioVenci=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRadioVenciClienteProve();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRadioVenciClienteProve(false);
			
			this.setPermisosUsuarioRadioVenciClienteProve();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() 
				|| (this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() && this.radiovenciclienteproveSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRadioVenciClienteProveClasesRelacionadas();
			}
			
			if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRadioVenciClienteProveClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRadioVenciClienteProve();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRadioVenciClienteProve();
			}
			
			if(!this.isPermisoBusquedaRadioVenciClienteProve) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRadioVenciClienteProve,this.isPermisoPaginacionMedioRadioVenciClienteProve,this.isPermisoPaginacionTodoRadioVenciClienteProve);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RadioVenciClienteProveConstantesFunciones.getTiposSeleccionarRadioVenciClienteProve());
				
				this.tiposColumnasSelect=RadioVenciClienteProveConstantesFunciones.getTiposSeleccionarRadioVenciClienteProve(true);
				
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
			//if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRadioVenciClienteProve();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioRadioVenciClienteProve(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioRadioVenciClienteProve(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciClienteProve() ;
			
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
				radiovenciclienteproveImplementable= (RadioVenciClienteProveImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RadioVenciClienteProveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				radiovenciclienteproveImplementableHome= (RadioVenciClienteProveImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RadioVenciClienteProveConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.radiovenciclienteproves= new ArrayList<RadioVenciClienteProve>();
			this.radiovenciclienteprovesEliminados= new ArrayList<RadioVenciClienteProve>();
						
			this.isEsNuevoRadioVenciClienteProve=false;
			this.esParaAccionDesdeFormularioRadioVenciClienteProve=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tiporadiovencisForeignKey=new ArrayList<TipoRadioVenci>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRadioVenciClienteProve(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRadioVenciClienteProve();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RadioVenciClienteProveConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRadioVenciClienteProve(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRadioVenciClienteProve();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRadioVenciClienteProve();
			}
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRadioVenciClienteProve.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRadioVenciClienteProve.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRadioVenciClienteProve.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRadioVenciClienteProve(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RadioVenciClienteProve: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRadioVenciClienteProve() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRadioVenciClienteProve")) {
				iIndex=this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRadioVenciClienteProve();	
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
	
	public void cargarCombosForeignKeyRadioVenciClienteProve(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRadioVenciClienteProve(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRadioVenciClienteProve(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRadioVenciClienteProveListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRadioVenciClienteProve();
		
		this.cargarCombosFrameForeignKeyRadioVenciClienteProve();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRadioVenciClienteProve();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRadioVenciClienteProve();
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
	
	public void jButtonNuevoRadioVenciClienteProveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			
			if(jTableDatosRadioVenciClienteProve.getRowCount()>=1) {
				jTableDatosRadioVenciClienteProve.removeRowSelectionInterval(0, jTableDatosRadioVenciClienteProve.getRowCount()-1);						
			}
			
			this.isEsNuevoRadioVenciClienteProve=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRadioVenciClienteProve(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRadioVenciClienteProve(true);			
			//this.radiovenciclienteprove=new RadioVenciClienteProve();
			//this.radiovenciclienteprove.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve() ;
			
			if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciClienteProve(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.radiovenciclienteprove);	
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);				
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RadioVenciClienteProve: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRadioVenciClienteProveActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRadioVenciClienteProve.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRadioVenciClienteProve.getSelectedRows().length;			
			}
			
			radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRadioVenciClienteProve--;			
				//RadioVenciClienteProve radiovenciclienteproveAux= new RadioVenciClienteProve();			
				//radiovenciclienteproveAux.setId(this.iIdNuevoRadioVenciClienteProve);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RadioVenciClienteProve radiovenciclienteproveOrigen=new RadioVenciClienteProve();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RadioVenciClienteProve radiovenciclienteproveOrigen : radiovenciclienteprovesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							radiovenciclienteproveOrigen =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							radiovenciclienteproveOrigen =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRadioVenciClienteProve();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.radiovenciclienteprove.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRadioVenciClienteProve(radiovenciclienteproveOrigen,this.radiovenciclienteprove,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.radiovenciclienteproveLogic.getRadioVenciClienteProves().add(this.radiovenciclienteproveAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteproves.add(this.radiovenciclienteproveAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
				
				this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciClienteProve(), this.getIndiceNuevoRadioVenciClienteProve());
				
				int iLastRow =  this.jTableDatosRadioVenciClienteProve.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRadioVenciClienteProve.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRadioVenciClienteProve.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();									
		
			RadioVenciClienteProve radiovenciclienteproveOrigen=new RadioVenciClienteProve();
			RadioVenciClienteProve radiovenciclienteproveDestino=new RadioVenciClienteProve();
				
			radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRadioVenciClienteProve.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || radiovenciclienteprovesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRadioVenciClienteProve.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveOrigen =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						radiovenciclienteproveOrigen =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						radiovenciclienteproveDestino =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						radiovenciclienteproveDestino =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				radiovenciclienteproveOrigen =radiovenciclienteprovesSeleccionados.get(0);
				radiovenciclienteproveDestino =radiovenciclienteprovesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRadioVenciClienteProve(radiovenciclienteproveOrigen,radiovenciclienteproveDestino,true,false);
				
				radiovenciclienteproveDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(radiovenciclienteproveDestino,radiovenciclienteproveLogic.getRadioVenciClienteProves());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(radiovenciclienteproveDestino,radiovenciclienteproves);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
				
				//this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciClienteProve(), this.getIndiceNuevoRadioVenciClienteProve());
				
				int iLastRow =  this.jTableDatosRadioVenciClienteProve.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRadioVenciClienteProve.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRadioVenciClienteProve.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRadioVenciClienteProve.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(!isVisible);
			this.jPanelPaginacionRadioVenciClienteProve.setVisible(!isVisible);
			this.jPanelAccionesRadioVenciClienteProve.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRadioVenciClienteProve();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRadioVenciClienteProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRadioVenciClienteProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRadioVenciClienteProve();
			
			this.abrirFrameOrderByRadioVenciClienteProve();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRadioVenciClienteProve();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRadioVenciClienteProve(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRadioVenciClienteProve);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRadioVenciClienteProve.isMaximum()) {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRadioVenciClienteProve.setSize(this.jInternalFrameDetalleFormRadioVenciClienteProve.iWidthFormulario,this.jInternalFrameDetalleFormRadioVenciClienteProve.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRadioVenciClienteProve.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRadioVenciClienteProve.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRadioVenciClienteProve.isMaximum()) {
						this.jInternalFrameDetalleFormRadioVenciClienteProve.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jContentPaneDetalleRadioVenciClienteProve.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciClienteProve.jContentPaneDetalleRadioVenciClienteProve.getWidth(),RadioVenciClienteProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciClienteProve.jContentPaneDetalleRadioVenciClienteProve.getWidth(),RadioVenciClienteProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRadioVenciClienteProve.jContentPaneDetalleRadioVenciClienteProve.getWidth(),RadioVenciClienteProveConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRadioVenciClienteProve.setVisible(true);
	        this.jInternalFrameDetalleFormRadioVenciClienteProve.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRadioVenciClienteProve() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRadioVenciClienteProve==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRadioVenciClienteProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciClienteProve,false,this);
				} else {
					this.jInternalFrameOrderByRadioVenciClienteProve=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRadioVenciClienteProve,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRadioVenciClienteProve);
				this.jInternalFrameOrderByRadioVenciClienteProve.setVisible(false);
				this.jInternalFrameOrderByRadioVenciClienteProve.setSelected(false);
				
				this.jInternalFrameOrderByRadioVenciClienteProve.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRadioVenciClienteProve"));
				
				this.inicializarActualizarBindingTablaOrderByRadioVenciClienteProve();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRadioVenciClienteProve() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRadioVenciClienteProve==null) {
				
				this.jInternalFrameImportacionRadioVenciClienteProve=new ImportacionJInternalFrame(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRadioVenciClienteProve);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRadioVenciClienteProve);
				this.jInternalFrameImportacionRadioVenciClienteProve.setVisible(false);
				this.jInternalFrameImportacionRadioVenciClienteProve.setSelected(false);


				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRadioVenciClienteProve"));
				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRadioVenciClienteProve"));
				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRadioVenciClienteProve"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRadioVenciClienteProve() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve==null) {
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve=new ReporteDinamicoJInternalFrame(RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRadioVenciClienteProve);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRadioVenciClienteProve);
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setVisible(false);
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciClienteProve"));
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciClienteProve"));
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciClienteProve"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciClienteProve();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRadioVenciClienteProve() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRadioVenciClienteProve);
			
	       	this.jInternalFrameDetalleFormRadioVenciClienteProve.setVisible(false);
	        this.jInternalFrameDetalleFormRadioVenciClienteProve.setSelected(false);
			
			//this.jInternalFrameDetalleFormRadioVenciClienteProve.dispose();
			//this.jInternalFrameDetalleFormRadioVenciClienteProve=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRadioVenciClienteProve() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setVisible(true);
	        this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRadioVenciClienteProve() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRadioVenciClienteProve.setVisible(true);
	        this.jInternalFrameImportacionRadioVenciClienteProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRadioVenciClienteProve() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRadioVenciClienteProve.setVisible(true);
	        this.jInternalFrameOrderByRadioVenciClienteProve.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRadioVenciClienteProve() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRadioVenciClienteProve.setVisible(false);
	        this.jInternalFrameOrderByRadioVenciClienteProve.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRadioVenciClienteProve() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setVisible(false);
	        this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRadioVenciClienteProve() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRadioVenciClienteProve.setVisible(false);
	        this.jInternalFrameImportacionRadioVenciClienteProve.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRadioVenciClienteProve(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRadioVenciClienteProve(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRadioVenciClienteProve(true);
			//this.isEsNuevoRadioVenciClienteProve=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false) ;
			
			if(radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciClienteProve(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRadioVenciClienteProveActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRadioVenciClienteProve(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRadioVenciClienteProve(true);
			//this.isEsNuevoRadioVenciClienteProve=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.radiovenciclienteprove.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false) ;
			
			if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRadioVenciClienteProve(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoRadioVenci(List<TipoRadioVenci> tiporadiovencisForeignKey)throws Exception{
		TableColumn tableColumnTipoRadioVenci=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI));
		TableCellEditor tableCellEditorTipoRadioVenci =tableColumnTipoRadioVenci.getCellEditor();

		TipoRadioVenciTableCell tiporadiovenciTableCellFk=(TipoRadioVenciTableCell)tableCellEditorTipoRadioVenci;

		if(tiporadiovenciTableCellFk!=null) {
			tiporadiovenciTableCellFk.settiporadiovencisForeignKey(tiporadiovencisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosRadioVenciClienteProve.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiporadiovenciTableCellFk.setRowActual(intSelectedRow);
			//tiporadiovenciTableCellFk.settiporadiovencisForeignKeyActual(tiporadiovencisForeignKey);
		//}


		if(tiporadiovenciTableCellFk!=null) {
			tiporadiovenciTableCellFk.RecargarTipoRadioVencisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRadioVenciClienteProve(false);
			
			//if(!this.isEsNuevoRadioVenciClienteProve) {								
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				
			}
			
			if(this.permiteMantenimiento(this.radiovenciclienteprove)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRadioVenciClienteProve=true;
					this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
					this.isEsNuevoRadioVenciClienteProve=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRadioVenciClienteProve=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRadioVenciClienteProve=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(false);
				
				this.habilitarDeshabilitarControlesRadioVenciClienteProve(false);
			
												
				
				if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRadioVenciClienteProve();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRadioVenciClienteProveActionPerformed(evt,radiovenciclienteproveSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRadioVenciClienteProve(this.radiovenciclienteprove,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,radiovenciclienteproveSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.radiovenciclienteprove.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				this.radiovenciclienteprove.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				this.radiovenciclienteprove.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.radiovenciclienteprove)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RadioVenciClienteProveModel) this.jTableDatosRadioVenciClienteProve.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRadioVenciClienteProve=true;
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
				this.isEsNuevoRadioVenciClienteProve=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(false);
				
				this.habilitarDeshabilitarControlesRadioVenciClienteProve(false);
				
				
				
				if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRadioVenciClienteProve();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRadioVenciClienteProve.getRowCount()>=1) {
				jTableDatosRadioVenciClienteProve.removeRowSelectionInterval(0, jTableDatosRadioVenciClienteProve.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRadioVenciClienteProve(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(false) ;
			
			this.isEsNuevoRadioVenciClienteProve=false;
			
			if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRadioVenciClienteProve();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRadioVenciClienteProve(false);
				
				//SI ES MANUAL
				if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRadioVenciClienteProve();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRadioVenciClienteProve--;			
			//RadioVenciClienteProve radiovenciclienteproveAux= new RadioVenciClienteProve();			
			//radiovenciclienteproveAux.setId(this.iIdNuevoRadioVenciClienteProve);
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRadioVenciClienteProve();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
			
			this.radiovenciclienteprove.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.radiovenciclienteproveLogic.getRadioVenciClienteProves().add(this.radiovenciclienteproveAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.radiovenciclienteproves.add(this.radiovenciclienteproveAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			
			this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(this.getIndiceNuevoRadioVenciClienteProve(), this.getIndiceNuevoRadioVenciClienteProve());
			
			int iLastRow =  this.jTableDatosRadioVenciClienteProve.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRadioVenciClienteProve.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRadioVenciClienteProve.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
			
			//SI ES MANUAL
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciClienteProve();
			}
			
			//this.abrirFrameTreeRadioVenciClienteProve();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Dias Por VencerS ?", "MANTENIMIENTO DE Dias Por Vencer", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRadioVenciClienteProve.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRadioVenciClienteProve();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.procesarImportacionRadioVenciClienteProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.radiovenciclienteproveParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRadioVenciClienteProveReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRadioVenciClienteProve.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRadioVenciClienteProve.setFileImportacion(this.jInternalFrameImportacionRadioVenciClienteProve.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRadioVenciClienteProve.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRadioVenciClienteProve.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRadioVenciClienteProve.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRadioVenciClienteProve.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		

		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RadioVenciClienteProveBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RadioVenciClienteProveBaseDesign.jrxml";
			
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
			
			this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoRadioVenci_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoRadioVenci_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoRadioVenci_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoRadioVenci_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA:
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
		
		if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					sNombreCampoCategoria="id_tipo_radio_venci";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoria="dia_desde";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoria="dia_hasta";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					sNombreCampoCategoriaValor="id_tipo_radio_venci";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE:
					sNombreCampoCategoriaValor="dia_desde";
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA:
					sNombreCampoCategoriaValor="dia_hasta";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Radio Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_radio_venci");
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia_desde");
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA:
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
	
	public void jButtonGenerarExcelReporteDinamicoRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RadioVenciClienteProves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciclienteprove.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
					iRow++;

					for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciclienteprove.gettiporadiovenci_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE);
					iRow++;

					for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciclienteprove.getdia_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA);
					iRow++;

					for(RadioVenciClienteProve radiovenciclienteprove:radiovenciclienteprovesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(radiovenciclienteprove.getdia_hasta());
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
			//	this.getFilaCabeceraExportarExcelRadioVenciClienteProve(row);				
			//	iRow++;
			//}				
			
			//for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRadioVenciClienteProve(radiovenciclienteproveAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
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
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
			
			//SI ES MANUAL
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRadioVenciClienteProve();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
			
			//SI ES MANUAL
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRadioVenciClienteProve();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
			
			//SI ES MANUAL
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRadioVenciClienteProve();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRadioVenciClienteProve() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRadioVenciClienteProve.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRadioVenciClienteProve.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRadioVenciClienteProve.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRadioVenciClienteProve.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRadioVenciClienteProve.setMinimumSize(dimensionMinimum);
		this.jTableDatosRadioVenciClienteProve.setMaximumSize(dimensionMaximum);
		this.jTableDatosRadioVenciClienteProve.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRadioVenciClienteProve(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRadioVenciClienteProve(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRadioVenciClienteProve(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRadioVenciClienteProve(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRadioVenciClienteProve(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRadioVenciClienteProve(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciClienteProve(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRadioVenciClienteProve(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRadioVenciClienteProve() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRadioVenciClienteProve();
		
		this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRadioVenciClienteProve();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciClienteProve() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciClienteProve(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciClienteProve(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRadioVenciClienteProve.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRadioVenciClienteProve.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionNuevoRadioVenciClienteProve.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRadioVenciClienteProve.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRadioVenciClienteProve.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionNuevoRadioVenciClienteProve.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRadioVenciClienteProve.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRadioVenciClienteProve.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRadioVenciClienteProve.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRadioVenciClienteProve.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRadioVenciClienteProve.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRadioVenciClienteProve.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRadioVenciClienteProve.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRadioVenciClienteProve(Boolean esInicializar) throws Exception {
		try	{	
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRadioVenciClienteProve(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRadioVenciClienteProve() throws Exception {
		try	{
			if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRadioVenciClienteProve();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRadioVenciClienteProve() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRadioVenciClienteProve() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRadioVenciClienteProve.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRadioVenciClienteProve.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRadioVenciClienteProve.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRadioVenciClienteProve.addItem(reporte);
			}
			
			
			if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRadioVenciClienteProve.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRadioVenciClienteProve.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRadioVenciClienteProve.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRadioVenciClienteProve.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRadioVenciClienteProve.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRadioVenciClienteProve.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRadioVenciClienteProve.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciClienteProve();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRadioVenciClienteProve() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
				
				if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRadioVenciClienteProve()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.getSelectedItem()!=null){this.id_tipo_radio_venciFK_IdTipoRadioVenci=((TipoRadioVenci)this.jComboBoxid_tipo_radio_venciFK_IdTipoRadioVenciRadioVenciClienteProve.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRadioVenciClienteProve(Boolean esInicializar) throws Exception {				
		if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRadioVenciClienteProve();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRadioVenciClienteProve() throws Exception {
		this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRadioVenciClienteProve() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRadioVenciClienteProveOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProveOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRadioVenciClienteProve(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=radiovenciclienteproveLogic.getRadioVenciClienteProves().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=radiovenciclienteproves.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRadioVenciClienteProve.setModel(new RadioVenciClienteProveModel(this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRadioVenciClienteProve.setModel(new RadioVenciClienteProveModel(this.radiovenciclienteproves,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRadioVenciClienteProve!=null && this.jInternalFrameOrderByRadioVenciClienteProve.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRadioVenciClienteProve();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,radiovenciclienteproveConstantesFunciones.resaltarSeleccionarRadioVenciClienteProve,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO,radiovenciclienteproveConstantesFunciones.resaltarSeleccionarRadioVenciClienteProve,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_ID));

		if(this.radiovenciclienteproveConstantesFunciones.mostraridRadioVenciClienteProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciClienteProveConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciclienteproveConstantesFunciones.resaltaridRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activaridRadioVenciClienteProve,this,true,"idRadioVenciClienteProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciclienteproveConstantesFunciones.resaltaridRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activaridRadioVenciClienteProve,this,true,"idRadioVenciClienteProve","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA));

		if(this.radiovenciclienteproveConstantesFunciones.mostrarid_empresaRadioVenciClienteProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.radiovenciclienteproveConstantesFunciones.resaltarid_empresaRadioVenciClienteProve,this,this.radiovenciclienteproveConstantesFunciones.activarid_empresaRadioVenciClienteProve));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.radiovenciclienteproveConstantesFunciones.resaltarid_empresaRadioVenciClienteProve,this,this.radiovenciclienteproveConstantesFunciones.activarid_empresaRadioVenciClienteProve,false,"id_empresaRadioVenciClienteProve","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI));

		if(this.radiovenciclienteproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciClienteProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoRadioVenciTableCell(this.tiporadiovencisForeignKey,this.radiovenciclienteproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciClienteProve,this,this.radiovenciclienteproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciClienteProve));
			tableColumn.setCellEditor(new TipoRadioVenciTableCell(this.tiporadiovencisForeignKey,this.radiovenciclienteproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciClienteProve,this,this.radiovenciclienteproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciClienteProve,true,"id_tipo_radio_venciRadioVenciClienteProve","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE));

		if(this.radiovenciclienteproveConstantesFunciones.mostrardia_desdeRadioVenciClienteProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciclienteproveConstantesFunciones.resaltardia_desdeRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activardia_desdeRadioVenciClienteProve,this,true,"dia_desdeRadioVenciClienteProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciclienteproveConstantesFunciones.resaltardia_desdeRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activardia_desdeRadioVenciClienteProve,this,true,"dia_desdeRadioVenciClienteProve","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA));

		if(this.radiovenciclienteproveConstantesFunciones.mostrardia_hastaRadioVenciClienteProve && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.radiovenciclienteproveConstantesFunciones.resaltardia_hastaRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activardia_hastaRadioVenciClienteProve,this,true,"dia_hastaRadioVenciClienteProve","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.radiovenciclienteproveConstantesFunciones.resaltardia_hastaRadioVenciClienteProve,this.radiovenciclienteproveConstantesFunciones.activardia_hastaRadioVenciClienteProve,this,true,"dia_hastaRadioVenciClienteProve","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RadioVenciClienteProvePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRadioVenciClienteProve.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRadioVenciClienteProve.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRadioVenciClienteProve.addColumn(tableColumn);
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
			
			this.jTableDatosRadioVenciClienteProve.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRadioVenciClienteProve.moveColumn(this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRadioVenciClienteProve.moveColumn(this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRadioVenciClienteProve.moveColumn(this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRadioVenciClienteProve.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRadioVenciClienteProve.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRadioVenciClienteProve,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRadioVenciClienteProve.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRadioVenciClienteProve.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRadioVenciClienteProve.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=radiovenciclienteproveLogic.getRadioVenciClienteProves().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=radiovenciclienteproves.size()-1;
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
		//this.jTableDatosRadioVenciClienteProve.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRadioVenciClienteProve.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRadioVenciClienteProve();
			
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
				
				//this.isEsNuevoRadioVenciClienteProve=false;
					
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
				if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRadioVenciClienteProve.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRadioVenciClienteProve.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.radiovenciclienteprove.getsType().equals("DUPLICADO")
				   || this.radiovenciclienteprove.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRadioVenciClienteProve=true;
				
				} else {
					this.isEsNuevoRadioVenciClienteProve=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					if(this.radiovenciclienteprove.getId()>=0 && !this.radiovenciclienteprove.getIsNew()) {						
						this.isEsNuevoRadioVenciClienteProve=false;
						
					} else {
						this.isEsNuevoRadioVenciClienteProve=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRadioVenciClienteProve(esRelaciones);						
				
				this.seleccionarRadioVenciClienteProve(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.radiovenciclienteprove.getId()<0) {
					this.isEsNuevoRadioVenciClienteProve=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRadioVenciClienteProve(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRadioVenciClienteProve(evt,rowIndex);
				}	
				
				if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RadioVenciClienteProve: " + this.dDif); 
					}
				}								
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRadioVenciClienteProve(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.radiovenciclienteprove)) {
					if(this.radiovenciclienteprove.getId()>0) {
						this.radiovenciclienteprove.setIsDeleted(true);
						
						this.radiovenciclienteprovesEliminados.add(this.radiovenciclienteprove);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.radiovenciclienteproveLogic.getRadioVenciClienteProves().remove(this.radiovenciclienteprove);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteproves.remove(this.radiovenciclienteprove);				
					}
					
					
					((RadioVenciClienteProveModel) this.jTableDatosRadioVenciClienteProve.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRadioVenciClienteProve(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRadioVenciClienteProve) {
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRadioVenciClienteProve.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRadioVenciClienteProve.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteprove);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.radiovenciclienteproveConstantesFunciones.cargarid_empresaRadioVenciClienteProve || this.radiovenciclienteproveConstantesFunciones.event_dependid_empresaRadioVenciClienteProve) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.radiovenciclienteprove.getid_empresa());
									//this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(radiovenciclienteprove.getEmpresa()!=null) {
							this.empresasForeignKey.add(radiovenciclienteprove.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.radiovenciclienteprove.getid_empresa(),false,"Formulario");

					//TipoRadioVenci
					if(!this.radiovenciclienteproveConstantesFunciones.cargarid_tipo_radio_venciRadioVenciClienteProve || this.radiovenciclienteproveConstantesFunciones.event_dependid_tipo_radio_venciRadioVenciClienteProve) {
						//this.cargarCombosTipoRadioVencisForeignKeyLista(" where id="+this.radiovenciclienteprove.getid_tipo_radio_venci());
									//this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
						this.tiporadiovencisForeignKey=new ArrayList<TipoRadioVenci>();

						if(radiovenciclienteprove.getTipoRadioVenci()!=null) {
							this.tiporadiovencisForeignKey.add(radiovenciclienteprove.getTipoRadioVenci());
						}

						this.addItemDefectoCombosForeignKeyTipoRadioVenci();
						this.cargarCombosFrameTipoRadioVencisForeignKey("Todos");
					}
					this.setActualTipoRadioVenciForeignKey(this.radiovenciclienteprove.getid_tipo_radio_venci(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRadioVenciClienteProve("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRadioVenciClienteProve(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRadioVenciClienteProve(radiovenciclienteprove,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRadioVenciClienteProve(radiovenciclienteprove);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRadioVenciClienteProve(radiovenciclienteprove,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciClienteProve(radiovenciclienteprove);
	}
	
	public void setVariablesObjetoActualToFormularioRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setText(radiovenciclienteprove.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setText(radiovenciclienteprove.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setText(radiovenciclienteprove.getdia_hasta().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RadioVenciClienteProve radiovenciclienteproveLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,radiovenciclienteproveLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RadioVenciClienteProve radiovenciclienteproveLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				radiovenciclienteproveLocal=this.radiovenciclienteprove;
			} else {
				radiovenciclienteproveLocal=this.radiovenciclienteproveAnterior;
			}
		}
		
		if(this.permiteMantenimiento(radiovenciclienteproveLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRadioVenciClienteProve(radiovenciclienteproveLocal,true);
					
					if(radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(radiovenciclienteproveLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(radiovenciclienteproveLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(radiovenciclienteprove,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(radiovenciclienteprove);
	}
	
	public void setVariablesFormularioToObjetoActualRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(radiovenciclienteprove,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.getText()==null || this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.getText()=="" || this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.getText()=="Id") {
				this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setText("0");
			}

			if(conColumnasBase) {radiovenciclienteprove.setId(Long.parseLong(this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciClienteProveConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelIdRadioVenciClienteProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			radiovenciclienteprove.setdia_desde(Integer.parseInt(this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_desdeRadioVenciClienteProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			radiovenciclienteprove.setdia_hasta(Integer.parseInt(this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabeldia_hastaRadioVenciClienteProve,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteproveBean,RadioVenciClienteProve radiovenciclienteprove,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && radiovenciclienteproveBean.getid_tipo_radio_venci()!=null && !radiovenciclienteproveBean.getid_tipo_radio_venci().equals(-1L))) {radiovenciclienteprove.setid_tipo_radio_venci(radiovenciclienteproveBean.getid_tipo_radio_venci());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteproveOrigen,RadioVenciClienteProve radiovenciclienteprove,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && radiovenciclienteproveOrigen.getId()!=null && !radiovenciclienteproveOrigen.getId().equals(0L))) {radiovenciclienteprove.setId(radiovenciclienteproveOrigen.getId());}}
			if(conDefault || (!conDefault && radiovenciclienteproveOrigen.getid_tipo_radio_venci()!=null && !radiovenciclienteproveOrigen.getid_tipo_radio_venci().equals(-1L))) {radiovenciclienteprove.setid_tipo_radio_venci(radiovenciclienteproveOrigen.getid_tipo_radio_venci());}
			if(conDefault || (!conDefault && radiovenciclienteproveOrigen.getdia_desde()!=null && !radiovenciclienteproveOrigen.getdia_desde().equals(0))) {radiovenciclienteprove.setdia_desde(radiovenciclienteproveOrigen.getdia_desde());}
			if(conDefault || (!conDefault && radiovenciclienteproveOrigen.getdia_hasta()!=null && !radiovenciclienteproveOrigen.getdia_hasta().equals(0))) {radiovenciclienteprove.setdia_hasta(radiovenciclienteproveOrigen.getdia_hasta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setText(radiovenciclienteprove.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setText(radiovenciclienteprove.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setText(radiovenciclienteprove.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRadioVenciClienteProve(RadioVenciClienteProveBean radiovenciclienteproveBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setText(radiovenciclienteproveBean.getId().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setText(radiovenciclienteproveBean.getdia_desde().toString());
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setText(radiovenciclienteproveBean.getdia_hasta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRadioVenciClienteProve(RadioVenciClienteProveParameterReturnGeneral radiovenciclienteproveReturnGeneral,RadioVenciClienteProveBean radiovenciclienteproveBean,Boolean conDefault) throws Exception { 
		try {
			RadioVenciClienteProve radiovenciclienteproveLocal=new RadioVenciClienteProve();
			
			radiovenciclienteproveLocal=radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && radiovenciclienteproveLocal.getId()!=null && !radiovenciclienteproveLocal.getId().equals(0L))) {radiovenciclienteproveBean.setId(radiovenciclienteproveLocal.getId());}}
			if(conDefault || (!conDefault && radiovenciclienteproveLocal.getid_tipo_radio_venci()!=null && !radiovenciclienteproveLocal.getid_tipo_radio_venci().equals(-1L))) {radiovenciclienteproveBean.setid_tipo_radio_venci(radiovenciclienteproveLocal.getid_tipo_radio_venci());}
			if(conDefault || (!conDefault && radiovenciclienteproveLocal.getdia_desde()!=null && !radiovenciclienteproveLocal.getdia_desde().equals(0))) {radiovenciclienteproveBean.setdia_desde(radiovenciclienteproveLocal.getdia_desde());}
			if(conDefault || (!conDefault && radiovenciclienteproveLocal.getdia_hasta()!=null && !radiovenciclienteproveLocal.getdia_hasta().equals(0))) {radiovenciclienteproveBean.setdia_hasta(radiovenciclienteproveLocal.getdia_hasta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRadioVenciClienteProveGenerico(Long idRadioVenciClienteProveSeleccionado,JComboBox jComboBoxRadioVenciClienteProve,List<RadioVenciClienteProve> radiovenciclienteprovesLocal)throws Exception {
		try {
			RadioVenciClienteProve  radiovenciclienteproveTemp=null;

			for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesLocal) {
				if(radiovenciclienteproveAux.getId()!=null && radiovenciclienteproveAux.getId().equals(idRadioVenciClienteProveSeleccionado)) {
					radiovenciclienteproveTemp=radiovenciclienteproveAux;
					break;
				}
			}

			jComboBoxRadioVenciClienteProve.setSelectedItem(radiovenciclienteproveTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRadioVenciClienteProveGenerico(JComboBox jComboBoxRadioVenciClienteProve,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRadioVenciClienteProve.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRadioVenciClienteProve.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRadioVenciClienteProve.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRadioVenciClienteProve.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciclienteprove=(RadioVenciClienteProve) radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			radiovenciclienteprove =(RadioVenciClienteProve) radiovenciclienteproves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!radiovenciclienteprove.getIsNew() && !radiovenciclienteprove.getIsChanged() && !radiovenciclienteprove.getIsDeleted()) {
				sDescripcion=radiovenciclienteprove.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=radiovenciclienteprove.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoRadioVenci")) {
			//sDescripcion=this.getActualTipoRadioVenciForeignKeyDescripcion((Long)value);
			if(!radiovenciclienteprove.getIsNew() && !radiovenciclienteprove.getIsChanged() && !radiovenciclienteprove.getIsDeleted()) {
				sDescripcion=radiovenciclienteprove.gettiporadiovenci_descripcion();
			} else {
				//sDescripcion=this.getActualTipoRadioVenciForeignKeyDescripcion((Long)value);
				sDescripcion=radiovenciclienteprove.gettiporadiovenci_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RadioVenciClienteProve radiovenciclienteproveRow=new RadioVenciClienteProve();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciclienteproveRow=(RadioVenciClienteProve) radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			radiovenciclienteproveRow=(RadioVenciClienteProve) radiovenciclienteproves.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRadioVenciClienteProve(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));			
			this.jButtonDuplicarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciClienteProve && this.isPermisoDuplicarRadioVenciClienteProve));			
			this.jButtonCopiarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciClienteProve && this.isPermisoCopiarRadioVenciClienteProve));
			this.jButtonVerFormRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciClienteProve && this.isPermisoVerFormRadioVenciClienteProve));
			
			this.jButtonAbrirOrderByRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));			
			
			this.jButtonNuevoRelacionesRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));			
			this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciClienteProve && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciClienteProve && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciClienteProve && this.isPermisoEliminarRadioVenciClienteProve));
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciClienteProve);							
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));			
			
			}
						
			this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));						
			this.jButtonDuplicarToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciClienteProve && this.isPermisoDuplicarRadioVenciClienteProve));						
			this.jButtonCopiarToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciClienteProve && this.isPermisoCopiarRadioVenciClienteProve));			
			this.jButtonVerFormToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciClienteProve && this.isPermisoVerFormRadioVenciClienteProve));			
			this.jButtonAbrirOrderByToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));
			this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));			
			this.jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));			
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciClienteProve && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciClienteProve  && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciClienteProve && this.isPermisoEliminarRadioVenciClienteProve));
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarToolBarRadioVenciClienteProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciClienteProve);				
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));			
			this.jMenuItemDuplicarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaDuplicarRadioVenciClienteProve && this.isPermisoDuplicarRadioVenciClienteProve));			
			this.jMenuItemCopiarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaCopiarRadioVenciClienteProve && this.isPermisoCopiarRadioVenciClienteProve));			
			this.jMenuItemVerFormRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaVerFormRadioVenciClienteProve && this.isPermisoVerFormRadioVenciClienteProve));			
			this.jMenuItemAbrirOrderByRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));			
			//this.jMenuItemMostrarOcultarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));
			this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));			
			//this.jMenuItemDetalleMostrarOcultarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaOrdenRadioVenciClienteProve && this.isPermisoOrdenRadioVenciClienteProve));			
			this.jMenuItemNuevoRelacionesRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve));			
			this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaNuevoRadioVenciClienteProve && this.isPermisoNuevoRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));									
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemModificarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaModificarRadioVenciClienteProve && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemActualizarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaActualizarRadioVenciClienteProve && this.isPermisoActualizarRadioVenciClienteProve));	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemEliminarRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaEliminarRadioVenciClienteProve && this.isPermisoEliminarRadioVenciClienteProve));
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemCancelarRadioVenciClienteProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciClienteProve);				
			}
			
			this.jMenuItemGuardarCambiosRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));						
			this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=this.jButtonNuevoRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaDuplicarRadioVenciClienteProve=this.jButtonDuplicarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaCopiarRadioVenciClienteProve=this.jButtonCopiarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaVerFormRadioVenciClienteProve=this.jButtonVerFormRadioVenciClienteProve.isVisible();
			
			this.isVisibilidadCeldaOrdenRadioVenciClienteProve=this.jButtonAbrirOrderByRadioVenciClienteProve.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=this.jButtonNuevoRelacionesRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=this.jButtonModificarRadioVenciClienteProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaGuardarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=this.jButtonGuardarCambiosTablaRadioVenciClienteProve.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=this.jButtonNuevoToolBarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarToolBarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarToolBarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarToolBarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarToolBarRadioVenciClienteProve.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRadioVenciClienteProve=this.jButtonGuardarCambiosToolBarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=this.jMenuItemNuevoRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=this.jMenuItemNuevoRelacionesRadioVenciClienteProve.isVisible();
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemModificarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemActualizarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemEliminarRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemCancelarRadioVenciClienteProve.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRadioVenciClienteProve=this.jMenuItemGuardarCambiosRadioVenciClienteProve.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRadioVenciClienteProve(Boolean esInicializar) {
		if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {			
			if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
				//if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRadioVenciClienteProve();
			}
			
			this.inicializarActualizarBindingBotonesManualRadioVenciClienteProve(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRadioVenciClienteProve() {
		this.jButtonNuevoRadioVenciClienteProve.setVisible(this.isPermisoNuevoRadioVenciClienteProve);			
		this.jButtonDuplicarRadioVenciClienteProve.setVisible(this.isPermisoDuplicarRadioVenciClienteProve);			
		this.jButtonCopiarRadioVenciClienteProve.setVisible(this.isPermisoCopiarRadioVenciClienteProve);			
		this.jButtonVerFormRadioVenciClienteProve.setVisible(this.isPermisoVerFormRadioVenciClienteProve);			
		
		this.jButtonAbrirOrderByRadioVenciClienteProve.setVisible(this.isPermisoOrdenRadioVenciClienteProve);					
		
		this.jButtonNuevoRelacionesRadioVenciClienteProve.setVisible(this.isPermisoNuevoRadioVenciClienteProve);			
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarRadioVenciClienteProve.setVisible(this.isPermisoActualizarRadioVenciClienteProve);	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.setVisible(this.isPermisoActualizarRadioVenciClienteProve);	
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.setVisible(this.isPermisoEliminarRadioVenciClienteProve);
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciClienteProve);						
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.setVisible(this.isPermisoGuardarCambiosRadioVenciClienteProve);							
		}
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setVisible(this.isPermisoActualizarRadioVenciClienteProve);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRadioVenciClienteProve() {
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarRadioVenciClienteProve.setVisible(this.isPermisoActualizarRadioVenciClienteProve);	
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.setVisible(this.isPermisoActualizarRadioVenciClienteProve);	
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.setVisible(this.isPermisoEliminarRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.setVisible(this.isVisibilidadCeldaCancelarRadioVenciClienteProve);							
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.setVisible((this.isVisibilidadCeldaGuardarRadioVenciClienteProve && this.isPermisoGuardarCambiosRadioVenciClienteProve));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRadioVenciClienteProve() {
		if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRadioVenciClienteProve();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRadioVenciClienteProve() {
	}
	
	public void jTableDatosRadioVenciClienteProveListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRadioVenciClienteProve(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRadioVenciClienteProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciclienteprove==null) {
						this.radiovenciclienteprove = new RadioVenciClienteProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				}

				if(this.radiovenciclienteprove.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.radiovenciclienteprove.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciClienteProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRadioVenciClienteProveUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRadioVenciClienteProve(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRadioVenciClienteProve.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.radiovenciclienteproveLogic.getConnexion());

				if(this.radiovenciclienteprove.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.radiovenciclienteprove.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRadioVenciClienteProve=(TitledBorder)this.jScrollPanelDatosRadioVenciClienteProve.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRadioVenciClienteProve.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRadioVenciClienteProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciclienteprove==null) {
						this.radiovenciclienteprove = new RadioVenciClienteProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				}

				if(this.radiovenciclienteprove.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.radiovenciclienteprove.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciClienteProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_radio_venciRadioVenciClienteProveUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiporadiovenci=true;

			idTienePermisotiporadiovenci=this.tienePermisosUsuarioEnPaginaWebRadioVenciClienteProve(TipoRadioVenciConstantesFunciones.CLASSNAME);

			if(idTienePermisotiporadiovenci) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRadioVenciClienteProve.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRadioVenciClienteProve.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);

				this.tiporadiovenciBeanSwingJInternalFrame=new TipoRadioVenciBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiporadiovenciBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiporadiovenciBeanSwingJInternalFrame.getTipoRadioVenciLogic().setConnexion(this.radiovenciclienteproveLogic.getConnexion());

				if(this.radiovenciclienteprove.getid_tipo_radio_venci()!=null) {
					this.tiporadiovenciBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiporadiovenciBeanSwingJInternalFrame.setIdActual(this.radiovenciclienteprove.getid_tipo_radio_venci());
					this.tiporadiovenciBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiporadiovenciBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiporadiovenciBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoRadioVenci();
				}

				JInternalFrameBase jinternalFrame =this.tiporadiovenciBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRadioVenciClienteProve=(TitledBorder)this.jScrollPanelDatosRadioVenciClienteProve.getBorder();
				TitledBorder titledBordertiporadiovenci=(TitledBorder)this.tiporadiovenciBeanSwingJInternalFrame.jScrollPanelDatosTipoRadioVenci.getBorder();

				titledBordertiporadiovenci.setTitle(titledBorderRadioVenciClienteProve.getTitle() + " -> Tipo Radio Venci");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_radio_venciRadioVenciClienteProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciclienteprove==null) {
						this.radiovenciclienteprove = new RadioVenciClienteProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				}

				if(this.radiovenciclienteprove.getid_tipo_radio_venci()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_radio_venci = "+this.radiovenciclienteprove.getid_tipo_radio_venci().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciClienteProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_desdeRadioVenciClienteProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciclienteprove==null) {
						this.radiovenciclienteprove = new RadioVenciClienteProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				}

				if(this.radiovenciclienteprove.getdia_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_desde = "+this.radiovenciclienteprove.getdia_desde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciClienteProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondia_hastaRadioVenciClienteProveBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.getradiovenciclienteprove(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.radiovenciclienteprove==null) {
						this.radiovenciclienteprove = new RadioVenciClienteProve();
					}

					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);
				}

				if(this.radiovenciclienteprove.getdia_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia_hasta = "+this.radiovenciclienteprove.getdia_hasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRadioVenciClienteProve(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);

			this.getRadioVenciClienteProvesFK_IdEmpresa();

			this.inicializarActualizarBindingRadioVenciClienteProve(false);

			//if(RadioVenciClienteProveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoRadioVenciRadioVenciClienteProveActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);

			this.getRadioVenciClienteProvesFK_IdTipoRadioVenci();

			this.inicializarActualizarBindingRadioVenciClienteProve(false);

			//if(RadioVenciClienteProveBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.radiovenciclienteproveLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRadioVenciClienteProve() {
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.setVisible(false);	    			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.dispose();
			this.jInternalFrameDetalleFormRadioVenciClienteProve=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
			this.jInternalFrameReporteDinamicoRadioVenciClienteProve.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRadioVenciClienteProve.dispose();
			this.jInternalFrameReporteDinamicoRadioVenciClienteProve=null;
		}
		
		if(this.jInternalFrameImportacionRadioVenciClienteProve!=null) {
			this.jInternalFrameImportacionRadioVenciClienteProve.setVisible(false);	    			
			this.jInternalFrameImportacionRadioVenciClienteProve.dispose();
			this.jInternalFrameImportacionRadioVenciClienteProve=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRadioVenciClienteProve();
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			
			if(sTipo.equals("NuevoRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRadioVenciClienteProve")) {
				jButtonDuplicarRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRadioVenciClienteProve")) {
				jButtonCopiarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("VerFormRadioVenciClienteProve")) {
				jButtonVerFormRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRadioVenciClienteProve")) {
				jButtonDuplicarRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRadioVenciClienteProve")) {
				jButtonDuplicarRadioVenciClienteProveActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRadioVenciClienteProve")) {
				jButtonModificarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRadioVenciClienteProve")) {
				jButtonModificarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRadioVenciClienteProve")) {
				jButtonModificarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRadioVenciClienteProve")) {
				jButtonActualizarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRadioVenciClienteProve")) {
				jButtonActualizarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRadioVenciClienteProve")) {
				jButtonActualizarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("EliminarRadioVenciClienteProve")) {
				jButtonEliminarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRadioVenciClienteProve")) {
				jButtonEliminarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRadioVenciClienteProve")) {
				jButtonEliminarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("CancelarRadioVenciClienteProve")) {
				jButtonCancelarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRadioVenciClienteProve")) {
				jButtonCancelarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRadioVenciClienteProve")) {
				jButtonCancelarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("CerrarRadioVenciClienteProve")) {
				jButtonCerrarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRadioVenciClienteProve")) {
				jButtonCerrarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRadioVenciClienteProve")) {
				jButtonCerrarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRadioVenciClienteProve")) {
				jButtonMostrarOcultarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRadioVenciClienteProve")) {
				jButtonCancelarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRadioVenciClienteProve")) {
				jButtonCopiarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRadioVenciClienteProve")) {
				jButtonVerFormRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRadioVenciClienteProve")) {
				jButtonCopiarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRadioVenciClienteProve")) {
				jButtonVerFormRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRadioVenciClienteProve")) {
				jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRadioVenciClienteProve")) {
				jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRadioVenciClienteProve")) {
				jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRadioVenciClienteProve")) {
				jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRadioVenciClienteProve")) {
				jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRadioVenciClienteProve")) {
				jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRadioVenciClienteProve")) {
				jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRadioVenciClienteProve")) {
				jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRadioVenciClienteProve")) {
				jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRadioVenciClienteProve") || sTipo.equals("MenuItemDetalleAbrirOrderByRadioVenciClienteProve")) {
				jButtonAbrirOrderByRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRadioVenciClienteProve") || sTipo.equals("MenuItemDetalleMostrarOcultarRadioVenciClienteProve")) {
				jButtonMostrarOcultarRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRadioVenciClienteProve")) {
				jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRadioVenciClienteProve")) {
				jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRadioVenciClienteProve")) {
				jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRadioVenciClienteProve")) {
				jButtonCerrarReporteDinamicoRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRadioVenciClienteProve")) {
				jButtonGenerarReporteDinamicoRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRadioVenciClienteProve")) {
				
				jButtonGenerarExcelReporteDinamicoRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRadioVenciClienteProve")) {
				jButtonCerrarImportacionRadioVenciClienteProveActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRadioVenciClienteProve")) {
				
				jButtonGenerarImportacionRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRadioVenciClienteProve")) {
				
				jButtonAbrirImportacionRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRadioVenciClienteProve")) {
				jComboBoxTiposAccionesRadioVenciClienteProveActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRadioVenciClienteProve")) {
				jComboBoxTiposRelacionesRadioVenciClienteProveActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRadioVenciClienteProve")) {
				jComboBoxTiposAccionesRadioVenciClienteProveActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRadioVenciClienteProve")) {
				
				jComboBoxTiposSeleccionarRadioVenciClienteProveActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRadioVenciClienteProve")) {
				jTextFieldValorCampoGeneralRadioVenciClienteProveActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRadioVenciClienteProve")) {
				jButtonAbrirOrderByRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRadioVenciClienteProve")) {
				jButtonAbrirOrderByRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRadioVenciClienteProve")) {
				jButtonCerrarOrderByRadioVenciClienteProveActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRadioVenciClienteProveBusqueda")) {
				this.jButtonidRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRadioVenciClienteProveUpdate")) {
				this.jButtonid_empresaRadioVenciClienteProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRadioVenciClienteProveBusqueda")) {
				this.jButtonid_empresaRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciClienteProveUpdate")) {
				this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciClienteProveBusqueda")) {
				this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeRadioVenciClienteProveBusqueda")) {
				this.jButtondia_desdeRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaRadioVenciClienteProveBusqueda")) {
				this.jButtondia_hastaRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoRadioVenciRadioVenciClienteProve")) {
				this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProveActionPerformed(evt);
			}
			
			;
			
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRadioVenciClienteProve();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RadioVenciClienteProve radiovenciclienteproveLocal=null;
			
			if(!this.getEsControlTabla()) {
				radiovenciclienteproveLocal=this.radiovenciclienteprove;
			} else {
				radiovenciclienteproveLocal=this.radiovenciclienteproveAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
							
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
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
			
			


			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
								
						
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
								
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
							
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
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
			
			


			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
								
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
			
			this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRadioVenciClienteProve")) {
					jCheckBoxSeleccionarTodosRadioVenciClienteProveItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRadioVenciClienteProve")) {
					jCheckBoxSeleccionadosRadioVenciClienteProveItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRadioVenciClienteProve")) {
					
				}
				
				


				
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
												
				
				


				
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
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
			
			


			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.radiovenciclienteprove);
				
				this.actualizarInformacion("INFO_PADRE",false,this.radiovenciclienteprove);
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
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
				
				


				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RadioVenciClienteProve.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RadioVenciClienteProve.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRadioVenciClienteProveActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.radiovenciclienteproveAnterior =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRadioVenciClienteProve")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRadioVenciClienteProveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRadioVenciClienteProve.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.radiovenciclienteprove =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.radiovenciclienteprove);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRadioVenciClienteProve")) {
				
				}
				
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRadioVenciClienteProve")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRadioVenciClienteProve.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRadioVenciClienteProve")) {
			
			}
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRadioVenciClienteProve();
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			if(sTipo.equals("NuevoRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRadioVenciClienteProve")) {
				jButtonDuplicarRadioVenciClienteProveActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRadioVenciClienteProve")) {
				jButtonCopiarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRadioVenciClienteProve")) {
				jButtonVerFormRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRadioVenciClienteProve")) {
				jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRadioVenciClienteProve")) {
				jButtonModificarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRadioVenciClienteProve")) {
				jButtonActualizarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRadioVenciClienteProve")) {
				jButtonEliminarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRadioVenciClienteProve")) {
				jButtonCancelarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRadioVenciClienteProve")) {
				jButtonCerrarRadioVenciClienteProveActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRadioVenciClienteProve")) {
				jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRadioVenciClienteProve")) {
				jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRadioVenciClienteProve")) {
				jButtonAbrirOrderByRadioVenciClienteProveActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRadioVenciClienteProve")) {
				jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRadioVenciClienteProve")) {
				jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRadioVenciClienteProve")) {
				jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRadioVenciClienteProveBusqueda")) {
				this.jButtonidRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRadioVenciClienteProveUpdate")) {
				this.jButtonid_empresaRadioVenciClienteProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRadioVenciClienteProveBusqueda")) {
				this.jButtonid_empresaRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciClienteProveUpdate")) {
				this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_radio_venciRadioVenciClienteProveBusqueda")) {
				this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_desdeRadioVenciClienteProveBusqueda")) {
				this.jButtondia_desdeRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dia_hastaRadioVenciClienteProveBusqueda")) {
				this.jButtondia_hastaRadioVenciClienteProveBusquedaActionPerformed(evt);
			}
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRadioVenciClienteProve();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRadioVenciClienteProve")) {
				closingInternalFrameRadioVenciClienteProve();
				
			} else if(sTipo.equals("jButtonCancelarRadioVenciClienteProve")) {
				JInternalFrameBase jInternalFrameDetalleFormRadioVenciClienteProve = (JInternalFrameBase)evt.getSource();
	            	
	            RadioVenciClienteProveBeanSwingJInternalFrame jInternalFrameParent=(RadioVenciClienteProveBeanSwingJInternalFrame)jInternalFrameDetalleFormRadioVenciClienteProve.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRadioVenciClienteProveActionPerformed(null);
			}
			
			RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.radiovenciclienteprove,new Object(),this.radiovenciclienteproveParameterGeneral,this.radiovenciclienteproveReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRadioVenciClienteProve(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRadioVenciClienteProve(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRadioVenciClienteProve(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.radiovenciclienteprove)) {
			if(!esControlTabla) {
				if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);			
				}
				
				if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.procesarEventosRadioVenciClienteProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this.radiovenciclienteprove,this.radiovenciclienteproveParameterGeneral,this.isEsNuevoRadioVenciClienteProve,classes);//this.radiovenciclienteproveLogic.getRadioVenciClienteProve()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral,this.radiovenciclienteproveBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRadioVenciClienteProve(classes,this.radiovenciclienteproveReturnGeneral,this.radiovenciclienteproveBean,false);
					}
						
					if(this.radiovenciclienteproveReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve());	
					}
						
					if(this.radiovenciclienteproveReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve(),classes);//this.radiovenciclienteproveBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRadioVenciClienteProve(this.radiovenciclienteprove,classes);//this.radiovenciclienteproveBean);									
				}
			
				if(RadioVenciClienteProveJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRadioVenciClienteProve(this.radiovenciclienteprove,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRadioVenciClienteProve(this.radiovenciclienteprove);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.radiovenciclienteproveAnterior!=null) {
						this.radiovenciclienteprove=this.radiovenciclienteproveAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.procesarEventosRadioVenciClienteProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this.radiovenciclienteprove,this.radiovenciclienteproveParameterGeneral,this.isEsNuevoRadioVenciClienteProve,classes);//this.radiovenciclienteproveLogic.getRadioVenciClienteProve()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve(),radiovenciclienteproveLogic.getRadioVenciClienteProves());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve(),this.radiovenciclienteproves);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRadioVenciClienteProve.repaint();
				
				//((AbstractTableModel) this.jTableDatosRadioVenciClienteProve.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRadioVenciClienteProve();
			}
		}
	}
	
	public void actualizarVisualTableDatosRadioVenciClienteProve() throws Exception {
		
		RadioVenciClienteProveModel radiovenciclienteproveModel=(RadioVenciClienteProveModel)this.jTableDatosRadioVenciClienteProve.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			radiovenciclienteproveModel.radiovenciclienteproves=this.radiovenciclienteproveLogic.getRadioVenciClienteProves();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			radiovenciclienteproveModel.radiovenciclienteproves=this.radiovenciclienteproves;
		}
		
		
		((RadioVenciClienteProveModel) this.jTableDatosRadioVenciClienteProve.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRadioVenciClienteProve() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getradiovenciclienteproveAnterior(),this.radiovenciclienteproveLogic.getRadioVenciClienteProves());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getradiovenciclienteproveAnterior(),this.radiovenciclienteproves);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRadioVenciClienteProve();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
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
										
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciclienteprove,new Object(),generalEntityParameterGeneral,this.radiovenciclienteproveReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RadioVenciClienteProveConstantesFunciones.getClassesRelationshipsOfRadioVenciClienteProve(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RadioVenciClienteProveConstantesFunciones.getClassesRelationshipsFromStringsOfRadioVenciClienteProve(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRadioVenciClienteProve(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RadioVenciClienteProveBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.radiovenciclienteprove,new Object(),generalEntityParameterGeneral,this.radiovenciclienteproveReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRadioVenciClienteProve(RadioVenciClienteProveBean radiovenciclienteproveBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRadioVenciClienteProve(ArrayList<Classe> classes,RadioVenciClienteProveReturnGeneral radiovenciclienteproveReturnGeneral,RadioVenciClienteProveBean radiovenciclienteproveBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.radiovenciclienteprove)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve = new RadioVenciClienteProveDetalleFormJInternalFrame(jDesktopPane,this.radiovenciclienteproveSessionBean.getConGuardarRelaciones(),this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.setVisible(false);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.setSelected(false);						
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.radiovenciclienteproveLogic=this.radiovenciclienteproveLogic;
		
		this.cargarCombosFrameForeignKeyRadioVenciClienteProve("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRadioVenciClienteProve();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRadioVenciClienteProve();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRadioVenciClienteProve("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRadioVenciClienteProve();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRadioVenciClienteProve"));
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ModificarRadioVenciClienteProve"));

		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ModificarToolBarRadioVenciClienteProve"));
					
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemModificarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"MenuItemModificarRadioVenciClienteProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"ActualizarRadioVenciClienteProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRadioVenciClienteProve"));
						
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemActualizarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRadioVenciClienteProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"EliminarRadioVenciClienteProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"EliminarToolBarRadioVenciClienteProve"));
								
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemEliminarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRadioVenciClienteProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CancelarRadioVenciClienteProve"));
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CancelarToolBarRadioVenciClienteProve"));
					
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemCancelarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRadioVenciClienteProve"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemDetalleCerrarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRadioVenciClienteProve"));		
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciClienteProve"));
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciClienteProve"));
		
		
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRadioVenciClienteProve"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonidRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_desdeRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_hastaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciClienteProveBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRadioVenciClienteProve"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRadioVenciClienteProve"));
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRadioVenciClienteProve"));
		}
		
		this.jTableDatosRadioVenciClienteProve.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRadioVenciClienteProve"));
		
		this.jTableDatosRadioVenciClienteProve.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRadioVenciClienteProve"));
		
		this.jButtonNuevoRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"NuevoRadioVenciClienteProve"));
		
		this.jButtonDuplicarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"DuplicarRadioVenciClienteProve"));
		
		this.jButtonCopiarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"CopiarRadioVenciClienteProve"));
		
		this.jButtonVerFormRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"VerFormRadioVenciClienteProve"));
		
		
		this.jButtonNuevoToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"NuevoToolBarRadioVenciClienteProve"));
			
		this.jButtonDuplicarToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRadioVenciClienteProve"));
			
		this.jMenuItemNuevoRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRadioVenciClienteProve"));
			
		this.jMenuItemDuplicarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRadioVenciClienteProve"));		
		
		
		this.jButtonNuevoRelacionesRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRadioVenciClienteProve"));
		
		
		this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRadioVenciClienteProve"));
			
		this.jMenuItemNuevoRelacionesRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRadioVenciClienteProve"));		
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ModificarRadioVenciClienteProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonModificarToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ModificarToolBarRadioVenciClienteProve"));
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemModificarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"MenuItemModificarRadioVenciClienteProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"ActualizarRadioVenciClienteProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonActualizarToolBarRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRadioVenciClienteProve"));
				
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemActualizarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRadioVenciClienteProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"EliminarRadioVenciClienteProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonEliminarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"EliminarToolBarRadioVenciClienteProve"));
						
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemEliminarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRadioVenciClienteProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CancelarRadioVenciClienteProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonCancelarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CancelarToolBarRadioVenciClienteProve"));
			
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemCancelarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRadioVenciClienteProve"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRadioVenciClienteProve"));		
		
		
		this.jButtonCerrarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CerrarRadioVenciClienteProve"));
		
		
		this.jButtonCerrarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CerrarToolBarRadioVenciClienteProve"));
			
		this.jMenuItemCerrarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRadioVenciClienteProve"));
			
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jMenuItemDetalleCerrarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRadioVenciClienteProve"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosRadioVenciClienteProve"));
		}
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRadioVenciClienteProve"));
		}
		
		this.jButtonCopiarToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CopiarToolBarRadioVenciClienteProve"));
			
		this.jButtonVerFormToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"VerFormToolBarRadioVenciClienteProve"));
		
		this.jMenuItemGuardarCambiosRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRadioVenciClienteProve"));
			
		this.jMenuItemCopiarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRadioVenciClienteProve"));		
		
		this.jMenuItemVerFormRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRadioVenciClienteProve"));		
		
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRadioVenciClienteProve"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRadioVenciClienteProve"));
			
		this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRadioVenciClienteProve"));		
		
		
		
		this.jButtonRecargarInformacionRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"RecargarInformacionRadioVenciClienteProve"));
					
		this.jButtonRecargarInformacionToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRadioVenciClienteProve"));
		
		this.jMenuItemRecargarInformacionRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRadioVenciClienteProve"));		
		
		
		
		this.jButtonAnterioresRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"AnterioresRadioVenciClienteProve"));
		
		
		this.jButtonAnterioresToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRadioVenciClienteProve"));
		
		this.jMenuItemAnterioresRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRadioVenciClienteProve"));		
		
		
		this.jButtonSiguientesRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"SiguientesRadioVenciClienteProve"));
		
		
		this.jButtonSiguientesToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRadioVenciClienteProve"));
			
		this.jMenuItemSiguientesRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRadioVenciClienteProve"));
			
		this.jMenuItemAbrirOrderByRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRadioVenciClienteProve"));
			
		this.jMenuItemMostrarOcultarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRadioVenciClienteProve"));
			
		this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRadioVenciClienteProve"));
			
		this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRadioVenciClienteProve"));		
		
		
		this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRadioVenciClienteProve"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRadioVenciClienteProve"));
			
		this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRadioVenciClienteProve"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRadioVenciClienteProve"));

		this.jCheckBoxSeleccionadosRadioVenciClienteProve.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRadioVenciClienteProve"));
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRadioVenciClienteProve"));
		}
		
		
		this.jComboBoxTiposRelacionesRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"TiposRelacionesRadioVenciClienteProve"));
			
		this.jComboBoxTiposAccionesRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"TiposAccionesRadioVenciClienteProve"));
					
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRadioVenciClienteProve"));
			
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRadioVenciClienteProve"));		
		
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonidRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_desdeRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_hastaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciClienteProveBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"FK_IdTipoRadioVenciRadioVenciClienteProve"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRadioVenciClienteProve!=null) {
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciClienteProve"));
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciClienteProve"));
				this.jInternalFrameReporteDinamicoRadioVenciClienteProve.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciClienteProve"));
			}
			
			//this.jButtonCerrarReporteDinamicoRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRadioVenciClienteProve"));				
			//this.jButtonGenerarReporteDinamicoRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRadioVenciClienteProve"));
			//this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRadioVenciClienteProve"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRadioVenciClienteProve!=null) {
				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRadioVenciClienteProve"));
				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRadioVenciClienteProve"));
				this.jInternalFrameImportacionRadioVenciClienteProve.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRadioVenciClienteProve"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"AbrirOrderByRadioVenciClienteProve"));
			
			this.jButtonAbrirOrderByToolBarRadioVenciClienteProve.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRadioVenciClienteProve"));			
			
			if(this.jInternalFrameOrderByRadioVenciClienteProve!=null) {
				this.jInternalFrameOrderByRadioVenciClienteProve.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRadioVenciClienteProve"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRadioVenciClienteProve.jTabbedPaneRelacionesRadioVenciClienteProve.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRadioVenciClienteProve"));
		
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
            		closingInternalFrameRadioVenciClienteProve();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRadioVenciClienteProve = (JInternalFrameBase)event.getSource();
	            	
	            RadioVenciClienteProveBeanSwingJInternalFrame jInternalFrameParent=(RadioVenciClienteProveBeanSwingJInternalFrame)jInternalFrameDetalleFormRadioVenciClienteProve.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRadioVenciClienteProveActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRadioVenciClienteProve.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRadioVenciClienteProveListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRadioVenciClienteProve.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRadioVenciClienteProve.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRadioVenciClienteProve";
		inputMap = this.jButtonNuevoRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRadioVenciClienteProve";
		inputMap = this.jButtonNuevoRelacionesRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRadioVenciClienteProveActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRadioVenciClienteProve";
		inputMap = this.jButtonModificarRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRadioVenciClienteProve";
		inputMap = this.jButtonActualizarRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRadioVenciClienteProve";
		inputMap = this.jButtonEliminarRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRadioVenciClienteProve";
		inputMap = this.jButtonCancelarRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRadioVenciClienteProve";
		inputMap = this.jButtonCerrarRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRadioVenciClienteProve";
		inputMap = this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonGuardarCambiosRadioVenciClienteProve.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRadioVenciClienteProveActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRadioVenciClienteProve.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRadioVenciClienteProveItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRadioVenciClienteProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRadioVenciClienteProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRadioVenciClienteProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRadioVenciClienteProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRadioVenciClienteProve.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRadioVenciClienteProveActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonidRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"idRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_empresaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRadioVenciClienteProveBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_radio_venciRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_desdeRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_desdeRadioVenciClienteProveBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jButtondia_hastaRadioVenciClienteProveBusqueda.addActionListener(new ButtonActionListener(this,"dia_hastaRadioVenciClienteProveBusqueda"));
		
		
		this.jButtonFK_IdTipoRadioVenciRadioVenciClienteProve.addActionListener(new ButtonActionListener(this,"FK_IdTipoRadioVenciRadioVenciClienteProve"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRadioVenciClienteProve.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRadioVenciClienteProveActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRadioVenciClienteProveActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRadioVenciClienteProve.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRadioVenciClienteProve(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
					radiovenciclienteproveAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproves) {
					radiovenciclienteproveAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRadioVenciClienteProveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
						radiovenciclienteproveAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproves) {
						radiovenciclienteproveAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproves) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRadioVenciClienteProve.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRadioVenciClienteProve.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRadioVenciClienteProveItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRadioVenciClienteProve.getSelectedRows();
			
			RadioVenciClienteProve radiovenciclienteproveLocal=new RadioVenciClienteProve();
			
			//this.seleccionarTodosRadioVenciClienteProve(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					radiovenciclienteproveLocal =(RadioVenciClienteProve) this.radiovenciclienteproveLogic.getRadioVenciClienteProves().toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					radiovenciclienteproveLocal =(RadioVenciClienteProve) this.radiovenciclienteproves.toArray()[this.jTableDatosRadioVenciClienteProve.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				radiovenciclienteproveLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
						radiovenciclienteproveAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproves) {
						radiovenciclienteproveAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRadioVenciClienteProve.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRadioVenciClienteProve.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRadioVenciClienteProve,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRadioVenciClienteProveItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRadioVenciClienteProveParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRadioVenciClienteProveActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRadioVenciClienteProve.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
				
						if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							radiovenciclienteproveAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							radiovenciclienteproveAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproves) {
					
						if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE)) {
							existe=true;
							radiovenciclienteproveAux.setdia_desde(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA)) {
							existe=true;
							radiovenciclienteproveAux.setdia_hasta(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRadioVenciClienteProveActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRadioVenciClienteProve=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRadioVenciClienteProve.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRadioVenciClienteProve) {				
					conSplash=true;//false;										
					
					//this.startProcessRadioVenciClienteProve(conSplash);
				
					this.generarReporteRadioVenciClienteProvesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRadioVenciClienteProvesSeleccionados();
				//this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRadioVenciClienteProvesSeleccionados(false);
				//this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRadioVenciClienteProvesSeleccionados(true);
				//this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRadioVenciClienteProve();
				
				this.exportarRadioVenciClienteProvesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRadioVenciClienteProves();
				//this.importarRadioVenciClienteProves();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRadioVenciClienteProve();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRadioVenciClienteProvesSeleccionados();
				//this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dias Por Vencer", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRadioVenciClienteProve();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRadioVenciClienteProve)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRadioVenciClienteProve(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
				}	
			} 			
			else if(RadioVenciClienteProveBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRadioVenciClienteProve) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRadioVenciClienteProve(conSplash);
					
						//this.actualizarParametrosGeneralRadioVenciClienteProve();
						
						this.generarReporteProcesoAccionRadioVenciClienteProvesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RadioVenciClienteProveBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Dias Por VencerS SELECCIONADOS?", "MANTENIMIENTO DE Dias Por Vencer", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRadioVenciClienteProve();
				
						this.actualizarParametrosGeneralRadioVenciClienteProve();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.radiovenciclienteproveReturnGeneral=radiovenciclienteproveLogic.procesarAccionRadioVenciClienteProvesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.radiovenciclienteproveLogic.getRadioVenciClienteProves(),this.radiovenciclienteproveParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRadioVenciClienteProveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRadioVenciClienteProve();
					
					RadioVenciClienteProveBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRadioVenciClienteProveReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRadioVenciClienteProve.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRadioVenciClienteProve(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRadioVenciClienteProveActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRadioVenciClienteProve();
			
			if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
			RadioVenciClienteProve radiovenciclienteprove=new RadioVenciClienteProve();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRadioVenciClienteProve(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRadioVenciClienteProve.getSelectedItem();
			
			
			
			
			radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
			//this.sTipoAccion;
			
			if(radiovenciclienteprovesSeleccionados.size()==1) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
					radiovenciclienteprove=radiovenciclienteproveAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRadioVenciClienteProve();
			
      		//this.finishProcessRadioVenciClienteProve(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRadioVenciClienteProveReturnGeneral() throws Exception {
		if(this.radiovenciclienteproveReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.radiovenciclienteproveReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.radiovenciclienteproveReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.radiovenciclienteproveReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.radiovenciclienteproveReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.radiovenciclienteproveReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
		}
		
		if(this.radiovenciclienteproveReturnGeneral.getConRetornoLista() || this.radiovenciclienteproveReturnGeneral.getConRetornoObjeto()) {
			if(this.radiovenciclienteproveReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.radiovenciclienteproveLogic.setRadioVenciClienteProves(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProves());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.radiovenciclienteproveReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.radiovenciclienteproveLogic.setRadioVenciClienteProve(this.radiovenciclienteproveReturnGeneral.getRadioVenciClienteProve());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRadioVenciClienteProve(false);
		}
	}
	
	public void actualizarParametrosGeneralRadioVenciClienteProve() throws Exception {
		
		
	}
	
	public ArrayList<RadioVenciClienteProve> getRadioVenciClienteProvesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRadioVenciClienteProve) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteproveLogic.getRadioVenciClienteProves()) {
					if(radiovenciclienteproveAux.getIsSelected()) {
						radiovenciclienteprovesSeleccionados.add(radiovenciclienteproveAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RadioVenciClienteProve radiovenciclienteproveAux:this.radiovenciclienteproves) {
					if(radiovenciclienteproveAux.getIsSelected()) {
						radiovenciclienteprovesSeleccionados.add(radiovenciclienteproveAux);				
					}
				}
			}
			
			if(radiovenciclienteprovesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						radiovenciclienteprovesSeleccionados.addAll(this.radiovenciclienteproveLogic.getRadioVenciClienteProves());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						radiovenciclienteprovesSeleccionados.addAll(this.radiovenciclienteproves);				
					}
				}
			}
		} else {
			radiovenciclienteprovesSeleccionados.add(this.radiovenciclienteprove);
		}
		
		return radiovenciclienteprovesSeleccionados;
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
	
	public void generarReporteRadioVenciClienteProvesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRadioVenciClienteProvesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRadioVenciClienteProvesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRadioVenciClienteProvesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRadioVenciClienteProvesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dias Por Vencer",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados);
		
	}	
	
	public void generarReporteNormalRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRadioVenciClienteProvesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRadioVenciClienteProve();
		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRadioVenciClienteProve();
		
		
		//this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados ,radiovenciclienteproveImplementable,radiovenciclienteproveImplementableHome);
	}
	
	public void mostrarImportacionRadioVenciClienteProves() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRadioVenciClienteProve();
		
		this.abrirFrameImportacionRadioVenciClienteProve();		
		
			
		//this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados ,radiovenciclienteproveImplementable,radiovenciclienteproveImplementableHome);
	}
	
	public void importarRadioVenciClienteProves() throws Exception {		
	
	}
	
	public void exportarRadioVenciClienteProvesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRadioVenciClienteProvesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRadioVenciClienteProvesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRadioVenciClienteProvesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dias Por Vencer",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRadioVenciClienteProve(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRadioVenciClienteProve(radiovenciclienteproveAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//radiovenciclienteproveAux.setsDetalleGeneralEntityReporte(radiovenciclienteproveAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRadioVenciClienteProve(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=radiovenciclienteprove.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciclienteprove.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciclienteprove.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciclienteprove.gettiporadiovenci_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciclienteprove.getdia_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=radiovenciclienteprove.getdia_hasta().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RadioVenciClienteProves");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRadioVenciClienteProve(row);				
				iRow++;
			}				
			
			for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRadioVenciClienteProve(radiovenciclienteproveAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRadioVenciClienteProvesSeleccionados() throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();		
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"radiovenciclienteprove.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("radiovenciclienteproves");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("radiovenciclienteprove");
			//elementRoot.appendChild(element);
		
			for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
				element = document.createElement("radiovenciclienteprove");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRadioVenciClienteProve(radiovenciclienteproveAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dias Por Vencer",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRadioVenciClienteProve(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciclienteprove.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciclienteprove.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciclienteprove.gettiporadiovenci_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciclienteprove.getdia_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(radiovenciclienteprove.getdia_hasta());				
	}
	
	public void setFilaDatosExportarXmlRadioVenciClienteProve(RadioVenciClienteProve radiovenciclienteprove,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RadioVenciClienteProveConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(radiovenciclienteprove.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RadioVenciClienteProveConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(radiovenciclienteprove.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RadioVenciClienteProveConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(radiovenciclienteprove.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtiporadiovenci_descripcion = document.createElement(RadioVenciClienteProveConstantesFunciones.IDTIPORADIOVENCI);
		elementtiporadiovenci_descripcion.appendChild(document.createTextNode(radiovenciclienteprove.gettiporadiovenci_descripcion()));
		element.appendChild(elementtiporadiovenci_descripcion);

		Element elementdia_desde = document.createElement(RadioVenciClienteProveConstantesFunciones.DIADESDE);
		elementdia_desde.appendChild(document.createTextNode(radiovenciclienteprove.getdia_desde().toString().trim()));
		element.appendChild(elementdia_desde);

		Element elementdia_hasta = document.createElement(RadioVenciClienteProveConstantesFunciones.DIAHASTA);
		elementdia_hasta.appendChild(document.createTextNode(radiovenciclienteprove.getdia_hasta().toString().trim()));
		element.appendChild(elementdia_hasta);
	}
	
	public void generarReporteGroupGenericoRadioVenciClienteProvesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados=new ArrayList<RadioVenciClienteProve>();
		
		radiovenciclienteprovesSeleccionados=this.getRadioVenciClienteProvesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRadioVenciClienteProve(radiovenciclienteprovesSeleccionados);
		
		this.generarReporteRadioVenciClienteProves("Todos",radiovenciclienteprovesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRadioVenciClienteProve(ArrayList<RadioVenciClienteProve> radiovenciclienteprovesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RadioVenciClienteProve radiovenciclienteproveAux:radiovenciclienteprovesSeleccionados) {
				radiovenciclienteproveAux.setsDetalleGeneralEntityReporte(radiovenciclienteproveAux.toString());
			
				if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					radiovenciclienteproveAux.setsDescripcionGeneralEntityReporte1(radiovenciclienteproveAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI)) {
					existe=true;
					radiovenciclienteproveAux.setsDescripcionGeneralEntityReporte1(radiovenciclienteproveAux.gettiporadiovenci_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE)) {
					existe=true;
					radiovenciclienteproveAux.setsDescripcionGeneralEntityReporte1(radiovenciclienteproveAux.getdia_desde().toString());
				}
				 else if(sTipoSeleccionar.equals(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA)) {
					existe=true;
					radiovenciclienteproveAux.setsDescripcionGeneralEntityReporte1(radiovenciclienteproveAux.getdia_hasta().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RadioVenciClienteProveConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRadioVenciClienteProve(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRadioVenciClienteProve=true;
				this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=true;
				this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=true;
			}
			
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=true;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=true;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=true;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
			this.isVisibilidadCeldaModificarRadioVenciClienteProve=true;
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaCancelarRadioVenciClienteProve=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				} else {
					this.isVisibilidadCeldaGuardarRadioVenciClienteProve=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=true;
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=true;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=true;
		} else {
			this.actualizarEstadoPanelsRadioVenciClienteProve(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRadioVenciClienteProve=false;
			//this.isVisibilidadCeldaVerFormRadioVenciClienteProve=false;
			this.isVisibilidadCeldaDuplicarRadioVenciClienteProve=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
		} else {
			this.isVisibilidadCeldaNuevoRadioVenciClienteProve=false;
			this.isVisibilidadCeldaGuardarCambiosRadioVenciClienteProve=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			if(!radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;												
			}
			
			this.jButtonCerrarRadioVenciClienteProve.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRadioVenciClienteProve=false;
		}
		
		if(!this.permiteMantenimiento(this.radiovenciclienteprove)) {
			this.isVisibilidadCeldaActualizarRadioVenciClienteProve=false;
			this.isVisibilidadCeldaEliminarRadioVenciClienteProve=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRadioVenciClienteProve() {
	}
	
	public void actualizarEstadoPanelsRadioVenciClienteProve(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosEdicionRadioVenciClienteProve.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRadioVenciClienteProve!=null) {
				this.jScrollPanelDatosRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelPaginacionRadioVenciClienteProve!=null) {
				this.jPanelPaginacionRadioVenciClienteProve.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
					this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRadioVenciClienteProve!=null) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRadioVenciClienteProve!=null) {
				this.jPanelParametrosReportesRadioVenciClienteProve.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoRadioVenci=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoRadioVenci) {this.jTabbedPaneBusquedasRadioVenciClienteProve.remove(jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoRadioVenci(Boolean isParaTipoRadioVenci){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoRadioVenciNegation=!isParaTipoRadioVenci;

			this.isVisibilidadFK_IdTipoRadioVenci=isParaTipoRadioVenci;
			if(!this.isVisibilidadFK_IdTipoRadioVenci) {this.jTabbedPaneBusquedasRadioVenciClienteProve.remove(jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		
		if(this.radiovenciclienteproveSessionBean==null) {
			this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		}
		
		this.radiovenciclienteproveSessionBean.setsUltimaBusquedaRadioVenciClienteProve(this.getsAccionBusqueda());
		this.radiovenciclienteproveSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.radiovenciclienteproveSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			radiovenciclienteproveSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoRadioVenci")) {
			radiovenciclienteproveSessionBean.setid_tipo_radio_venci(this.getid_tipo_radio_venciFK_IdTipoRadioVenci());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		
		if(this.radiovenciclienteproveSessionBean==null) {
			this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		}
		
		if(this.radiovenciclienteproveSessionBean.getsUltimaBusquedaRadioVenciClienteProve()!=null&&!this.radiovenciclienteproveSessionBean.getsUltimaBusquedaRadioVenciClienteProve().equals("")) {
			this.setsAccionBusqueda(radiovenciclienteproveSessionBean.getsUltimaBusquedaRadioVenciClienteProve());
			this.setiNumeroPaginacion(radiovenciclienteproveSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(radiovenciclienteproveSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(radiovenciclienteproveSessionBean.getid_empresa());
				radiovenciclienteproveSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoRadioVenci")) {
				this.setid_tipo_radio_venciFK_IdTipoRadioVenci(radiovenciclienteproveSessionBean.getid_tipo_radio_venci());
				radiovenciclienteproveSessionBean.setid_tipo_radio_venci(-1L);
			}
		}
		
		this.radiovenciclienteproveSessionBean.setsUltimaBusquedaRadioVenciClienteProve("");
		this.radiovenciclienteproveSessionBean.setiNumeroPaginacion(RadioVenciClienteProveConstantesFunciones.INUMEROPAGINACION);
		this.radiovenciclienteproveSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRadioVenciClienteProve(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRadioVenciClienteProve() {
		this.updateBorderResaltarBusquedasFormularioRadioVenciClienteProve();
		this.updateVisibilidadBusquedasFormularioRadioVenciClienteProve();
		this.updateHabilitarBusquedasFormularioRadioVenciClienteProve();
	}
	
	public void updateBorderResaltarBusquedasFormularioRadioVenciClienteProve() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponents().length>0) {
	

		if(this.radiovenciclienteproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciClienteProve!=null) {
			index= this.jTabbedPaneBusquedasRadioVenciClienteProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponent(index);
				jPanel.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciClienteProve);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRadioVenciClienteProve() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRadioVenciClienteProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrarFK_IdTipoRadioVenciRadioVenciClienteProve);
			if(!this.radiovenciclienteproveConstantesFunciones.mostrarFK_IdTipoRadioVenciRadioVenciClienteProve && index>-1) {
				this.jTabbedPaneBusquedasRadioVenciClienteProve.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRadioVenciClienteProve() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRadioVenciClienteProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.radiovenciclienteproveConstantesFunciones.activarFK_IdTipoRadioVenciRadioVenciClienteProve);
				this.jTabbedPaneBusquedasRadioVenciClienteProve.setEnabledAt(index,this.radiovenciclienteproveConstantesFunciones.activarFK_IdTipoRadioVenciRadioVenciClienteProve);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRadioVenciClienteProve(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoRadioVenci")) {
			index= this.jTabbedPaneBusquedasRadioVenciClienteProve.indexOfComponent(this.jPanelFK_IdTipoRadioVenciRadioVenciClienteProve);

			this.jTabbedPaneBusquedasRadioVenciClienteProve.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRadioVenciClienteProve.getComponent(index);

			this.radiovenciclienteproveConstantesFunciones.setResaltarFK_IdTipoRadioVenciRadioVenciClienteProve(resaltar);

			jPanel.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltarFK_IdTipoRadioVenciRadioVenciClienteProve);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRadioVenciClienteProve.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRadioVenciClienteProve() throws Exception {

		if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRadioVenciClienteProve();
		this.updateVisibilidadResaltarControlesFormularioRadioVenciClienteProve();
		this.updateHabilitarResaltarControlesFormularioRadioVenciClienteProve();
		
	}
	
	public void updateBorderResaltarControlesFormularioRadioVenciClienteProve() throws Exception {
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.radiovenciclienteproveConstantesFunciones.resaltaridRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltaridRadioVenciClienteProve);}
		if(this.radiovenciclienteproveConstantesFunciones.resaltarid_empresaRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltarid_empresaRadioVenciClienteProve);}
		if(this.radiovenciclienteproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltarid_tipo_radio_venciRadioVenciClienteProve);}
		if(this.radiovenciclienteproveConstantesFunciones.resaltardia_desdeRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltardia_desdeRadioVenciClienteProve);}
		if(this.radiovenciclienteproveConstantesFunciones.resaltardia_hastaRadioVenciClienteProve!=null && this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setBorder(this.radiovenciclienteproveConstantesFunciones.resaltardia_hastaRadioVenciClienteProve);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRadioVenciClienteProve() throws Exception {		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
	
		//this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostraridRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelidRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostraridRadioVenciClienteProve);
		//this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrarid_empresaRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelid_empresaRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrarid_empresaRadioVenciClienteProve);
		//this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jPanelid_tipo_radio_venciRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrarid_tipo_radio_venciRadioVenciClienteProve);
		//this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrardia_desdeRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jPaneldia_desdeRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrardia_desdeRadioVenciClienteProve);
		//this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrardia_hastaRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jPaneldia_hastaRadioVenciClienteProve.setVisible(this.radiovenciclienteproveConstantesFunciones.mostrardia_hastaRadioVenciClienteProve);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRadioVenciClienteProve() throws Exception {
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRadioVenciClienteProve!=null) {
	
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jLabelidRadioVenciClienteProve.setEnabled(this.radiovenciclienteproveConstantesFunciones.activaridRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_empresaRadioVenciClienteProve.setEnabled(this.radiovenciclienteproveConstantesFunciones.activarid_empresaRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setEnabled(this.radiovenciclienteproveConstantesFunciones.activarid_tipo_radio_venciRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_desdeRadioVenciClienteProve.setEnabled(this.radiovenciclienteproveConstantesFunciones.activardia_desdeRadioVenciClienteProve);
		this.jInternalFrameDetalleFormRadioVenciClienteProve.jTextFielddia_hastaRadioVenciClienteProve.setEnabled(this.radiovenciclienteproveConstantesFunciones.activardia_hastaRadioVenciClienteProve);
		}
	}
	
		
}