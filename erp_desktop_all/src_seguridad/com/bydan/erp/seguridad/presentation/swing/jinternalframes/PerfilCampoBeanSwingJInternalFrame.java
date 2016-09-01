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

import com.bydan.erp.seguridad.util.PerfilCampoConstantesFunciones;
import com.bydan.erp.seguridad.util.PerfilCampoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.PerfilCampoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.PerfilCampoBean;
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
public class PerfilCampoBeanSwingJInternalFrame extends PerfilCampoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PerfilCampoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PerfilCampo> perfilcampoValidator = new ClassValidator<PerfilCampo>(PerfilCampo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PerfilCampo perfilcampo;	
	public PerfilCampo perfilcampoAux;
	public PerfilCampo perfilcampoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PerfilCampo perfilcampoTotales;
	public Long idPerfilCampoActual;
	public Long iIdNuevoPerfilCampo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPerfil="";

	public List<Perfil> perfilsForeignKey;

	public List<Perfil> getperfilsForeignKey() {
		return perfilsForeignKey;
	}

	public void setperfilsForeignKey(List<Perfil> perfilsForeignKey) {
		this.perfilsForeignKey = perfilsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Perfil perfilForeignKey;

	public Perfil getperfilForeignKey() {
		return perfilForeignKey;
	}

	public void setperfilForeignKey(Perfil perfilForeignKey) {
		this.perfilForeignKey = perfilForeignKey;
	}

	public String sFinalQueryComboCampo="";

	public List<Campo> camposForeignKey;

	public List<Campo> getcamposForeignKey() {
		return camposForeignKey;
	}

	public void setcamposForeignKey(List<Campo> camposForeignKey) {
		this.camposForeignKey = camposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Campo campoForeignKey;

	public Campo getcampoForeignKey() {
		return campoForeignKey;
	}

	public void setcampoForeignKey(Campo campoForeignKey) {
		this.campoForeignKey = campoForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idPerfilActual=0L;

	public Long getidPerfilActual() {
		return idPerfilActual;
	}

	public void setidPerfilActual(Long idPerfilActual) {
		this.idPerfilActual= idPerfilActual;
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
	
	public Boolean isPermisoTodoPerfilCampo;
	public Boolean isPermisoNuevoPerfilCampo;
	public Boolean isPermisoActualizarPerfilCampo;
	public Boolean isPermisoActualizarOriginalPerfilCampo;
	public Boolean isPermisoEliminarPerfilCampo;
	public Boolean isPermisoGuardarCambiosPerfilCampo;
	public Boolean isPermisoConsultaPerfilCampo;
	public Boolean isPermisoBusquedaPerfilCampo;
	public Boolean isPermisoReportePerfilCampo;
	public Boolean isPermisoPaginacionMedioPerfilCampo;
	public Boolean isPermisoPaginacionAltoPerfilCampo;
	public Boolean isPermisoPaginacionTodoPerfilCampo;
	public Boolean isPermisoCopiarPerfilCampo;
	public Boolean isPermisoVerFormPerfilCampo;
	public Boolean isPermisoDuplicarPerfilCampo;
	public Boolean isPermisoOrdenPerfilCampo;
	
	
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
	
	public PerfilCampoParameterReturnGeneral perfilcampoReturnGeneral;
	public PerfilCampoParameterReturnGeneral perfilcampoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPerfilCampo=false;
	public Boolean esParaAccionDesdeFormularioPerfilCampo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PerfilCampoSessionBeanAdditional perfilcampoSessionBeanAdditional=null;
	
	public PerfilCampoSessionBeanAdditional getPerfilCampoSessionBeanAdditional() {
		return this.perfilcampoSessionBeanAdditional;
	}
	
	public void setPerfilCampoSessionBeanAdditional(PerfilCampoSessionBeanAdditional perfilcampoSessionBeanAdditional) {
		try {
			this.perfilcampoSessionBeanAdditional=perfilcampoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PerfilCampoBeanSwingJInternalFrameAdditional perfilcampoBeanSwingJInternalFrameAdditional=null;
	//public class PerfilCampoBeanSwingJInternalFrame
	
	public PerfilCampoBeanSwingJInternalFrameAdditional getPerfilCampoBeanSwingJInternalFrameAdditional() {
		return this.perfilcampoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPerfilCampoBeanSwingJInternalFrameAdditional(PerfilCampoBeanSwingJInternalFrameAdditional perfilcampoBeanSwingJInternalFrameAdditional) {
		try {
			this.perfilcampoBeanSwingJInternalFrameAdditional=perfilcampoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PerfilCampoLogic perfilcampoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PerfilCampo perfilcampoBean;
	public PerfilCampoConstantesFunciones perfilcampoConstantesFunciones;
	//public PerfilCampoParameterReturnGeneral perfilcampoReturnGeneral;
	
	//FK
	
	public PerfilLogic perfilLogic;
	public CampoLogic campoLogic;
	
	//PARAMETROS
	
	
	//public List<PerfilCampo> perfilcampos;	
	//public List<PerfilCampo> perfilcamposEliminados;
	//public List<PerfilCampo> perfilcamposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPerfilCampo=false;
	public Boolean isVisibilidadCeldaDuplicarPerfilCampo=true;
	public Boolean isVisibilidadCeldaCopiarPerfilCampo=true;
	public Boolean isVisibilidadCeldaVerFormPerfilCampo=true;
	public Boolean isVisibilidadCeldaOrdenPerfilCampo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
	public Boolean isVisibilidadCeldaModificarPerfilCampo=false;
	public Boolean isVisibilidadCeldaActualizarPerfilCampo=false;
	public Boolean isVisibilidadCeldaEliminarPerfilCampo=false;
	public Boolean isVisibilidadCeldaCancelarPerfilCampo=false;
	public Boolean isVisibilidadCeldaGuardarPerfilCampo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPerfilCampo=false;	
	
	
	public Boolean isVisibilidadFK_IdCampo=false;
	public Boolean isVisibilidadFK_IdPerfil=false;
	
	public Long getiIdNuevoPerfilCampo() {
		return this.iIdNuevoPerfilCampo;
	}

	public void setiIdNuevoPerfilCampo(Long iIdNuevoPerfilCampo) {
		this.iIdNuevoPerfilCampo = iIdNuevoPerfilCampo;
	}
	
	public Long getidPerfilCampoActual() {
		return this.idPerfilCampoActual;
	}

	public void setidPerfilCampoActual(Long idPerfilCampoActual) {
		this.idPerfilCampoActual = idPerfilCampoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PerfilCampo getperfilcampo() {
		return this.perfilcampo;
	}

	public void setperfilcampo(PerfilCampo perfilcampo) {
		this.perfilcampo = perfilcampo;
	}
	
	public PerfilCampo getperfilcampoAux() {
		return this.perfilcampoAux;
	}

	public void setperfilcampoAux(PerfilCampo perfilcampoAux) {
		this.perfilcampoAux = perfilcampoAux;
	}				
	
	public PerfilCampo getperfilcampoAnterior() {
		return this.perfilcampoAnterior;
	}

	public void setperfilcampoAnterior(PerfilCampo perfilcampoAnterior) {
		this.perfilcampoAnterior = perfilcampoAnterior;
	}	
	
	public PerfilCampo getperfilcampoTotales() {
		return this.perfilcampoTotales;
	}

	public void setperfilcampoTotales(PerfilCampo perfilcampoTotales) {
		this.perfilcampoTotales = perfilcampoTotales;
	}	
	
	public PerfilCampo getperfilcampoBean() {
		return this.perfilcampoBean;
	}

	public void setperfilcampoBean(PerfilCampo perfilcampoBean) {
		this.perfilcampoBean = perfilcampoBean;
	}	
	
	public PerfilCampoParameterReturnGeneral getperfilcampoReturnGeneral() {
		return this.perfilcampoReturnGeneral;
	}

	public void setperfilcampoReturnGeneral(PerfilCampoParameterReturnGeneral perfilcampoReturnGeneral) {
		this.perfilcampoReturnGeneral = perfilcampoReturnGeneral;
	}	
	
	
	public Long id_campoFK_IdCampo=-1L;

	public Long getid_campoFK_IdCampo() {
		return this.id_campoFK_IdCampo;
	}

	public void setid_campoFK_IdCampo(Long id_campoFK_IdCampo) {
		this.id_campoFK_IdCampo = id_campoFK_IdCampo;
	}

	public Long id_perfilFK_IdPerfil=-1L;

	public Long getid_perfilFK_IdPerfil() {
		return this.id_perfilFK_IdPerfil;
	}

	public void setid_perfilFK_IdPerfil(Long id_perfilFK_IdPerfil) {
		this.id_perfilFK_IdPerfil = id_perfilFK_IdPerfil;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PerfilCampoLogic getPerfilCampoLogic()	{		
		return perfilcampoLogic;
	}

	public void setPerfilCampoLogic(PerfilCampoLogic perfilcampoLogic) {
		this.perfilcampoLogic = perfilcampoLogic;
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
	
	public Boolean getIsEsNuevoPerfilCampo() {
		return isEsNuevoPerfilCampo;
	}

	public void setIsEsNuevoPerfilCampo(Boolean isEsNuevoPerfilCampo) {
		this.isEsNuevoPerfilCampo = isEsNuevoPerfilCampo;
	}

	public Boolean getEsParaAccionDesdeFormularioPerfilCampo() {
		return esParaAccionDesdeFormularioPerfilCampo;
	}
	
	public void setEsParaAccionDesdeFormularioPerfilCampo(Boolean esParaAccionDesdeFormularioPerfilCampo) {
		this.esParaAccionDesdeFormularioPerfilCampo = esParaAccionDesdeFormularioPerfilCampo;
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
	
	
	public void cargarCombosPerfilsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.perfilsForeignKey=new ArrayList<Perfil>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PerfilLogic perfilLogic=new PerfilLogic();

			perfilLogic.getPerfilDataAccess().setIsForForeingKeyData(true);

			if(this.perfilcampoSessionBean==null) {
				this.perfilcampoSessionBean=new PerfilCampoSessionBean();
			}

			if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getPerfilDataAccess().setIsForForeingKeyData(true);

					perfilLogic.getTodosPerfilsWithConnection(sFinalQuery,new Pagination());

					this.perfilsForeignKey=perfilLogic.getPerfils();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPerfil(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getEntityWithConnection(perfilcampoSessionBean.getlidPerfilActual());
					this.perfilsForeignKey.add(perfilLogic.getPerfil());
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

	public void cargarCombosCamposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.camposForeignKey=new ArrayList<Campo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CampoLogic campoLogic=new CampoLogic();

			campoLogic.getCampoDataAccess().setIsForForeingKeyData(true);

			if(this.perfilcampoSessionBean==null) {
				this.perfilcampoSessionBean=new PerfilCampoSessionBean();
			}

			if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionCampo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					campoLogic.getCampoDataAccess().setIsForForeingKeyData(true);

					campoLogic.getTodosCamposWithConnection(sFinalQuery,new Pagination());

					this.camposForeignKey=campoLogic.getCampos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCampo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					campoLogic.getEntityWithConnection(perfilcampoSessionBean.getlidCampoActual());
					this.camposForeignKey.add(campoLogic.getCampo());
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

	
	
	public void setActualPerfilForeignKey(Long idPerfilSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(perfilTemp!=null) {

					if(this.perfilcampo!=null) {
						this.perfilcampo.setPerfil(perfilTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
						this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setSelectedItem(perfilTemp);
					}
				} else {
					//jComboBoxid_perfilPerfilCampo.setSelectedItem(perfilTemp);
					if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
						if(this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){
					if(perfilTemp!=null && jComboBoxid_perfilFK_IdPerfilPerfilCampo!=null) {
						jComboBoxid_perfilFK_IdPerfilPerfilCampo.setSelectedItem(perfilTemp);
					} else {
						if(jComboBoxid_perfilFK_IdPerfilPerfilCampo!=null) {
							//jComboBoxid_perfilFK_IdPerfilPerfilCampo.setSelectedItem(perfilTemp);
							if(jComboBoxid_perfilFK_IdPerfilPerfilCampo.getItemCount()>0) {
								jComboBoxid_perfilFK_IdPerfilPerfilCampo.setSelectedIndex(0);
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

	public String getActualPerfilForeignKeyDescripcion(Long idPerfilSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}


			sDescripcion=PerfilConstantesFunciones.getPerfilDescripcion(perfilTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPerfilForeignKeyGenerico(Long idPerfilSeleccionado,JComboBox jComboBoxid_perfilPerfilCampoGenerico)throws Exception
	{
		try
		{
			Perfil  perfilTemp=null;

			for(Perfil perfilAux:perfilsForeignKey) {
				if(perfilAux.getId()!=null && perfilAux.getId().equals(idPerfilSeleccionado)) {
					perfilTemp=perfilAux;
					break;
				}
			}

			if(perfilTemp!=null) {
				jComboBoxid_perfilPerfilCampoGenerico.setSelectedItem(perfilTemp);
			} else {
				if(jComboBoxid_perfilPerfilCampoGenerico!=null && jComboBoxid_perfilPerfilCampoGenerico.getItemCount()>0) {
					jComboBoxid_perfilPerfilCampoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCampoForeignKey(Long idCampoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Campo  campoTemp=null;

			for(Campo campoAux:camposForeignKey) {
				if(campoAux.getId()!=null && campoAux.getId().equals(idCampoSeleccionado)) {
					campoTemp=campoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(campoTemp!=null) {

					if(this.perfilcampo!=null) {
						this.perfilcampo.setCampo(campoTemp);
					}

					if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
						this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setSelectedItem(campoTemp);
					}
				} else {
					//jComboBoxid_campoPerfilCampo.setSelectedItem(campoTemp);
					if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
						if(this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.getItemCount()>0) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCampo") || sFormularioTipoBusqueda.equals("Todos")){
					if(campoTemp!=null && jComboBoxid_campoFK_IdCampoPerfilCampo!=null) {
						jComboBoxid_campoFK_IdCampoPerfilCampo.setSelectedItem(campoTemp);
					} else {
						if(jComboBoxid_campoFK_IdCampoPerfilCampo!=null) {
							//jComboBoxid_campoFK_IdCampoPerfilCampo.setSelectedItem(campoTemp);
							if(jComboBoxid_campoFK_IdCampoPerfilCampo.getItemCount()>0) {
								jComboBoxid_campoFK_IdCampoPerfilCampo.setSelectedIndex(0);
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

	public String getActualCampoForeignKeyDescripcion(Long idCampoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Campo  campoTemp=null;

			for(Campo campoAux:camposForeignKey) {
				if(campoAux.getId()!=null && campoAux.getId().equals(idCampoSeleccionado)) {
					campoTemp=campoAux;
					break;
				}
			}


			sDescripcion=CampoConstantesFunciones.getCampoDescripcion(campoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCampoForeignKeyGenerico(Long idCampoSeleccionado,JComboBox jComboBoxid_campoPerfilCampoGenerico)throws Exception
	{
		try
		{
			Campo  campoTemp=null;

			for(Campo campoAux:camposForeignKey) {
				if(campoAux.getId()!=null && campoAux.getId().equals(idCampoSeleccionado)) {
					campoTemp=campoAux;
					break;
				}
			}

			if(campoTemp!=null) {
				jComboBoxid_campoPerfilCampoGenerico.setSelectedItem(campoTemp);
			} else {
				if(jComboBoxid_campoPerfilCampoGenerico!=null && jComboBoxid_campoPerfilCampoGenerico.getItemCount()>0) {
					jComboBoxid_campoPerfilCampoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPerfilForeignKey(PerfilCampo perfilcampo,JComboBox jComboBoxid_perfilPerfilCampoGenerico)throws Exception
	{
		try
		{
			Perfil  perfilAux=new Perfil();

			if(jComboBoxid_perfilPerfilCampoGenerico==null) {
				perfilAux=(Perfil)this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.getSelectedItem();
			} else {
				perfilAux=(Perfil)jComboBoxid_perfilPerfilCampoGenerico.getSelectedItem();
			}

			if(perfilAux!=null && perfilAux.getId()!=null) {
				perfilcampo.setid_perfil(perfilAux.getId());
				perfilcampo.setperfil_descripcion(PerfilCampoConstantesFunciones.getPerfilDescripcion(perfilAux));
				perfilcampo.setPerfil(perfilAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCampoForeignKey(PerfilCampo perfilcampo,JComboBox jComboBoxid_campoPerfilCampoGenerico)throws Exception
	{
		try
		{
			Campo  campoAux=new Campo();

			if(jComboBoxid_campoPerfilCampoGenerico==null) {
				campoAux=(Campo)this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.getSelectedItem();
			} else {
				campoAux=(Campo)jComboBoxid_campoPerfilCampoGenerico.getSelectedItem();
			}

			if(campoAux!=null && campoAux.getId()!=null) {
				perfilcampo.setid_campo(campoAux.getId());
				perfilcampo.setcampo_descripcion(PerfilCampoConstantesFunciones.getCampoDescripcion(campoAux));
				perfilcampo.setCampo(campoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePerfilsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPerfil=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) { 
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.addItem(perfil);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilCampo!=null) { 
					}

					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPerfil") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.removeAllItems();

							for(Perfil perfil:this.perfilsForeignKey) {
								this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.addItem(perfil);
							}
						}

						if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCamposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCampo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) { 
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.removeAllItems();

							for(Campo campo:this.camposForeignKey) {
								this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.addItem(campo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPerfilCampo!=null) { 
					}

					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCampo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_campoFK_IdCampoPerfilCampo.removeAllItems();

							for(Campo campo:this.camposForeignKey) {
								this.jComboBoxid_campoFK_IdCampoPerfilCampo.addItem(campo);
							}
						}

						if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePerfilForeignKey(Perfil perfil,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setSelectedItem(perfil);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.setSelectedItem(perfil);
						} else {
							this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCampoForeignKey(Campo campo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setSelectedItem(campo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_campoFK_IdCampoPerfilCampo.setSelectedItem(campo);
						} else {
							this.jComboBoxid_campoFK_IdCampoPerfilCampo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPerfilCampo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PerfilCampoConstantesFunciones.refrescarForeignKeysDescripcionesPerfilCampo(this.perfilcampoLogic.getPerfilCampos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PerfilCampoConstantesFunciones.refrescarForeignKeysDescripcionesPerfilCampo(this.perfilcampos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Perfil.class));
		classes.add(new Classe(Campo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//perfilcampoLogic.setPerfilCampos(this.perfilcampos);
			perfilcampoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PerfilCampoParameterReturnGeneral getPerfilCampoParameterGeneral() {
		return this.perfilcampoParameterGeneral;
	}
	
	public void setPerfilCampoParameterGeneral(PerfilCampoParameterReturnGeneral perfilcampoParameterGeneral) {
		this.perfilcampoParameterGeneral = perfilcampoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPerfilCampo() {
		return isPermisoTodoPerfilCampo;
	}

	public void setIsPermisoTodoPerfilCampo(Boolean isPermisoTodoPerfilCampo) {
		this.isPermisoTodoPerfilCampo = isPermisoTodoPerfilCampo;
	}

	public Boolean getIsPermisoNuevoPerfilCampo() {
		return isPermisoNuevoPerfilCampo;
	}

	public void setIsPermisoNuevoPerfilCampo(Boolean isPermisoNuevoPerfilCampo) {
		this.isPermisoNuevoPerfilCampo = isPermisoNuevoPerfilCampo;
	}

	public Boolean getIsPermisoActualizarPerfilCampo() {
		return isPermisoActualizarPerfilCampo;
	}

	public void setIsPermisoActualizarPerfilCampo(Boolean isPermisoActualizarPerfilCampo) {
		this.isPermisoActualizarPerfilCampo = isPermisoActualizarPerfilCampo;
	}

	public Boolean getIsPermisoEliminarPerfilCampo() {
		return isPermisoEliminarPerfilCampo;
	}

	public void setIsPermisoEliminarPerfilCampo(Boolean isPermisoEliminarPerfilCampo) {
		this.isPermisoEliminarPerfilCampo = isPermisoEliminarPerfilCampo;
	}

	public Boolean getIsPermisoGuardarCambiosPerfilCampo() {
		return isPermisoGuardarCambiosPerfilCampo;
	}

	public void setIsPermisoGuardarCambiosPerfilCampo(Boolean isPermisoGuardarCambiosPerfilCampo) {
		this.isPermisoGuardarCambiosPerfilCampo = isPermisoGuardarCambiosPerfilCampo;
	}
	
	public Boolean getIsPermisoConsultaPerfilCampo() {
		return isPermisoConsultaPerfilCampo;
	}

	public void setIsPermisoConsultaPerfilCampo(Boolean isPermisoConsultaPerfilCampo) {
		this.isPermisoConsultaPerfilCampo = isPermisoConsultaPerfilCampo;
	}

	public Boolean getIsPermisoBusquedaPerfilCampo() {
		return isPermisoBusquedaPerfilCampo;
	}

	public void setIsPermisoBusquedaPerfilCampo(Boolean isPermisoBusquedaPerfilCampo) {
		this.isPermisoBusquedaPerfilCampo = isPermisoBusquedaPerfilCampo;
	}

	public Boolean getIsPermisoReportePerfilCampo() {
		return isPermisoReportePerfilCampo;
	}

	public void setIsPermisoReportePerfilCampo(Boolean isPermisoReportePerfilCampo) {
		this.isPermisoReportePerfilCampo = isPermisoReportePerfilCampo;
	}
	
	public Boolean getIsPermisoPaginacionMedioPerfilCampo() {
		return isPermisoPaginacionMedioPerfilCampo;
	}

	public void setIsPermisoPaginacionMedioPerfilCampo(Boolean isPermisoPaginacionMedioPerfilCampo) {
		this.isPermisoPaginacionMedioPerfilCampo = isPermisoPaginacionMedioPerfilCampo;
	}
	
	public Boolean getIsPermisoPaginacionTodoPerfilCampo() {
		return isPermisoPaginacionTodoPerfilCampo;
	}

	public void setIsPermisoPaginacionTodoPerfilCampo(Boolean isPermisoPaginacionTodoPerfilCampo) {
		this.isPermisoPaginacionTodoPerfilCampo = isPermisoPaginacionTodoPerfilCampo;
	}
	
	public Boolean getIsPermisoPaginacionAltoPerfilCampo() {
		return isPermisoPaginacionAltoPerfilCampo;
	}

	public void setIsPermisoPaginacionAltoPerfilCampo(Boolean isPermisoPaginacionAltoPerfilCampo) {
		this.isPermisoPaginacionAltoPerfilCampo = isPermisoPaginacionAltoPerfilCampo;
	}
	
	public Boolean getIsPermisoCopiarPerfilCampo() {
		return isPermisoCopiarPerfilCampo;
	}

	public void setIsPermisoCopiarPerfilCampo(Boolean isPermisoCopiarPerfilCampo) {
		this.isPermisoCopiarPerfilCampo = isPermisoCopiarPerfilCampo;
	}
	
	public Boolean getIsPermisoVerFormPerfilCampo() {
		return isPermisoVerFormPerfilCampo;
	}

	public void setIsPermisoVerFormPerfilCampo(Boolean isPermisoVerFormPerfilCampo) {
		this.isPermisoVerFormPerfilCampo = isPermisoVerFormPerfilCampo;
	}
	
	public Boolean getIsPermisoDuplicarPerfilCampo() {
		return isPermisoDuplicarPerfilCampo;
	}

	public void setIsPermisoDuplicarPerfilCampo(Boolean isPermisoDuplicarPerfilCampo) {
		this.isPermisoDuplicarPerfilCampo = isPermisoDuplicarPerfilCampo;
	}
	
	public Boolean getIsPermisoOrdenPerfilCampo() {
		return isPermisoOrdenPerfilCampo;
	}

	public void setIsPermisoOrdenPerfilCampo(Boolean isPermisoOrdenPerfilCampo) {
		this.isPermisoOrdenPerfilCampo = isPermisoOrdenPerfilCampo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPerfilCampo() {
		return isVisibilidadCeldaNuevoPerfilCampo;
	}

	public void setIsVisibilidadCeldaNuevoPerfilCampo(Boolean isVisibilidadCeldaNuevoPerfilCampo) {
		this.isVisibilidadCeldaNuevoPerfilCampo = isVisibilidadCeldaNuevoPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPerfilCampo() {
		return isVisibilidadCeldaDuplicarPerfilCampo;
	}

	public void setIsVisibilidadCeldaDuplicarPerfilCampo(Boolean isVisibilidadCeldaDuplicarPerfilCampo) {
		this.isVisibilidadCeldaDuplicarPerfilCampo = isVisibilidadCeldaDuplicarPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPerfilCampo() {
		return isVisibilidadCeldaCopiarPerfilCampo;
	}

	public void setIsVisibilidadCeldaCopiarPerfilCampo(Boolean isVisibilidadCeldaCopiarPerfilCampo) {
		this.isVisibilidadCeldaCopiarPerfilCampo = isVisibilidadCeldaCopiarPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPerfilCampo() {
		return isVisibilidadCeldaVerFormPerfilCampo;
	}

	public void setIsVisibilidadCeldaVerFormPerfilCampo(Boolean isVisibilidadCeldaVerFormPerfilCampo) {
		this.isVisibilidadCeldaVerFormPerfilCampo = isVisibilidadCeldaVerFormPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPerfilCampo() {
		return isVisibilidadCeldaOrdenPerfilCampo;
	}

	public void setIsVisibilidadCeldaOrdenPerfilCampo(Boolean isVisibilidadCeldaOrdenPerfilCampo) {
		this.isVisibilidadCeldaOrdenPerfilCampo = isVisibilidadCeldaOrdenPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPerfilCampo() {
		return isVisibilidadCeldaNuevoRelacionesPerfilCampo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPerfilCampo(Boolean isVisibilidadCeldaNuevoRelacionesPerfilCampo) {
		this.isVisibilidadCeldaNuevoRelacionesPerfilCampo = isVisibilidadCeldaNuevoRelacionesPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPerfilCampo() {
		return isVisibilidadCeldaModificarPerfilCampo;
	}

	public void setIsVisibilidadCeldaModificarPerfilCampo(Boolean isVisibilidadCeldaModificarPerfilCampo) {
		this.isVisibilidadCeldaModificarPerfilCampo = isVisibilidadCeldaModificarPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPerfilCampo() {
		return isVisibilidadCeldaActualizarPerfilCampo;
	}

	public void setIsVisibilidadCeldaActualizarPerfilCampo(Boolean isVisibilidadCeldaActualizarPerfilCampo) {
		this.isVisibilidadCeldaActualizarPerfilCampo = isVisibilidadCeldaActualizarPerfilCampo;
	}

	public Boolean getIsVisibilidadCeldaEliminarPerfilCampo() {
		return isVisibilidadCeldaEliminarPerfilCampo;
	}

	public void setIsVisibilidadCeldaEliminarPerfilCampo(Boolean isVisibilidadCeldaEliminarPerfilCampo) {
		this.isVisibilidadCeldaEliminarPerfilCampo = isVisibilidadCeldaEliminarPerfilCampo;
	}

	public Boolean getIsVisibilidadCeldaCancelarPerfilCampo() {
		return isVisibilidadCeldaCancelarPerfilCampo;
	}

	public void setIsVisibilidadCeldaCancelarPerfilCampo(Boolean isVisibilidadCeldaCancelarPerfilCampo) {
		this.isVisibilidadCeldaCancelarPerfilCampo = isVisibilidadCeldaCancelarPerfilCampo;
	}

	public Boolean getIsVisibilidadCeldaGuardarPerfilCampo() {
		return isVisibilidadCeldaGuardarPerfilCampo;
	}

	public void setIsVisibilidadCeldaGuardarPerfilCampo(Boolean isVisibilidadCeldaGuardarPerfilCampo) {
		this.isVisibilidadCeldaGuardarPerfilCampo = isVisibilidadCeldaGuardarPerfilCampo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPerfilCampo() {
		return isVisibilidadCeldaGuardarCambiosPerfilCampo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPerfilCampo(Boolean isVisibilidadCeldaGuardarCambiosPerfilCampo) {
		this.isVisibilidadCeldaGuardarCambiosPerfilCampo = isVisibilidadCeldaGuardarCambiosPerfilCampo;
	}
		
	public PerfilCampoSessionBean getperfilcampoSessionBean() {
		return this.perfilcampoSessionBean;
	}
	
	public void setperfilcampoSessionBean(PerfilCampoSessionBean perfilcampoSessionBean) {
		this.perfilcampoSessionBean=perfilcampoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCampo() {
		return this.isVisibilidadFK_IdCampo;
	}

	public void setisVisibilidadFK_IdCampo(Boolean isVisibilidadFK_IdCampo) {
		this.isVisibilidadFK_IdCampo=isVisibilidadFK_IdCampo;
	}

	public Boolean getisVisibilidadFK_IdPerfil() {
		return this.isVisibilidadFK_IdPerfil;
	}

	public void setisVisibilidadFK_IdPerfil(Boolean isVisibilidadFK_IdPerfil) {
		this.isVisibilidadFK_IdPerfil=isVisibilidadFK_IdPerfil;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(PerfilCampo perfilcampo)throws Exception {
		try {
			
				this.setActualParaGuardarPerfilForeignKey(perfilcampo,null);
				this.setActualParaGuardarCampoForeignKey(perfilcampo,null);
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
	
	public void bugActualizarReferenciaActual(PerfilCampo perfilcampo,PerfilCampo perfilcampoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPerfilCampo(perfilcampo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		perfilcampoAux.setId(perfilcampo.getId());
		perfilcampoAux.setVersionRow(perfilcampo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPerfilCampo();
		
			int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = perfilcampoValidator.getInvalidValues(this.perfilcampo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			perfilcampoLogic.setDatosCliente(datosCliente);
			perfilcampoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				perfilcampoAux=new  PerfilCampo();
				
				perfilcampoAux.setIsNew(true);
				perfilcampoAux.setIsChanged(true);
				
				perfilcampoAux.setPerfilCampoOriginal(this.perfilcampo);
				
				perfilcampoAux.setId(this.perfilcampo.getId());	
				perfilcampoAux.setVersionRow(this.perfilcampo.getVersionRow());	
				perfilcampoAux.setid_perfil(this.perfilcampo.getid_perfil());	
				perfilcampoAux.setid_campo(this.perfilcampo.getid_campo());	
				perfilcampoAux.settodo(this.perfilcampo.gettodo());	
				perfilcampoAux.setingreso(this.perfilcampo.getingreso());	
				perfilcampoAux.setmodificacion(this.perfilcampo.getmodificacion());	
				perfilcampoAux.seteliminacion(this.perfilcampo.geteliminacion());	
				perfilcampoAux.setconsulta(this.perfilcampo.getconsulta());	
				perfilcampoAux.setestado(this.perfilcampo.getestado());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilcampoAux,perfilcampos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoLogic.savePerfilCampos();//WithConnection
						//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);
					
					this.refrescarForeignKeysDescripcionesPerfilCampo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilcampoLogic.savePerfilCampoRelaciones(perfilcampoAux);//WithConnection
								//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilcampoAux,perfilcampos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				perfilcampoAux=new  PerfilCampo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.perfilcampoSessionBean.getEsGuardarRelacionado() 
					|| (this.perfilcampoSessionBean.getEsGuardarRelacionado() && this.perfilcampo.getId()>=0)) {
						
					perfilcampoAux.setIsNew(false);
				}
				
				perfilcampoAux.setIsDeleted(false);
			
				perfilcampoAux.setId(this.perfilcampo.getId());	
				perfilcampoAux.setVersionRow(this.perfilcampo.getVersionRow());	
				perfilcampoAux.setid_perfil(this.perfilcampo.getid_perfil());	
				perfilcampoAux.setid_campo(this.perfilcampo.getid_campo());	
				perfilcampoAux.settodo(this.perfilcampo.gettodo());	
				perfilcampoAux.setingreso(this.perfilcampo.getingreso());	
				perfilcampoAux.setmodificacion(this.perfilcampo.getmodificacion());	
				perfilcampoAux.seteliminacion(this.perfilcampo.geteliminacion());	
				perfilcampoAux.setconsulta(this.perfilcampo.getconsulta());	
				perfilcampoAux.setestado(this.perfilcampo.getestado());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilcampoAux,perfilcampos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoLogic.savePerfilCampos();//WithConnection
						//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);
					
					this.refrescarForeignKeysDescripcionesPerfilCampo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilcampoLogic.savePerfilCampoRelaciones(perfilcampoAux);//WithConnection
								//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(perfilcampoAux,perfilcampos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.perfilcampo,perfilcampoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				perfilcampoAux=new  PerfilCampo();
				
				perfilcampoAux.setIsNew(false);
				perfilcampoAux.setIsChanged(false);
				
				perfilcampoAux.setIsDeleted(true);
				
				perfilcampoAux.setId(this.perfilcampo.getId());	
				perfilcampoAux.setVersionRow(this.perfilcampo.getVersionRow());	
				perfilcampoAux.setid_perfil(this.perfilcampo.getid_perfil());	
				perfilcampoAux.setid_campo(this.perfilcampo.getid_campo());	
				perfilcampoAux.settodo(this.perfilcampo.gettodo());	
				perfilcampoAux.setingreso(this.perfilcampo.getingreso());	
				perfilcampoAux.setmodificacion(this.perfilcampo.getmodificacion());	
				perfilcampoAux.seteliminacion(this.perfilcampo.geteliminacion());	
				perfilcampoAux.setconsulta(this.perfilcampo.getconsulta());	
				perfilcampoAux.setestado(this.perfilcampo.getestado());	
				
				if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.perfilcampoAux.getId()>=0) {	
						this.perfilcamposEliminados.add(perfilcampoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilcampoAux,perfilcampos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoLogic.savePerfilCampos();//WithConnection
						//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								perfilcampoLogic.savePerfilCampoRelaciones(perfilcampoAux);//WithConnection
								//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
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
							if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(perfilcampoAux,perfilcampoLogic.getPerfilCampos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(perfilcampoAux,perfilcampos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getPerfilCampos().addAll(this.perfilcamposEliminados);
					
					perfilcampoLogic.savePerfilCampos();//WithConnection
					//perfilcampoLogic.getSetVersionRowPerfilCampos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPerfilCampo();
				
				this.perfilcamposEliminados= new ArrayList<PerfilCampo>();		
			}
			
			if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Perfil Campo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.perfilcampo=perfilcampoAux;
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
      		//this.finishProcessPerfilCampo();
      	}
		
	}	
	
	public void actualizarRelaciones(PerfilCampo perfilcampoLocal) throws Exception {
		
		if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PerfilCampo perfilcampoLocal) throws Exception {	
		if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PerfilDetalleFormJInternalFrame.class)) {
				PerfilBeanSwingJInternalFrame perfilBeanSwingJInternalFrameLocal=(PerfilBeanSwingJInternalFrame) ((PerfilDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				perfilBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPerfil(perfilBeanSwingJInternalFrameLocal.getperfil(),true);
				perfilBeanSwingJInternalFrameLocal.actualizarLista(perfilBeanSwingJInternalFrameLocal.perfil,this.perfilsForeignKey);

				perfilBeanSwingJInternalFrameLocal.actualizarRelaciones(perfilBeanSwingJInternalFrameLocal.perfil);

				perfilcampoLocal.setPerfil(perfilBeanSwingJInternalFrameLocal.perfil);

				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey("Formulario");
				this.setActualPerfilForeignKey(perfilBeanSwingJInternalFrameLocal.perfil.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CampoDetalleFormJInternalFrame.class)) {
				CampoBeanSwingJInternalFrame campoBeanSwingJInternalFrameLocal=(CampoBeanSwingJInternalFrame) ((CampoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				campoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCampo(campoBeanSwingJInternalFrameLocal.getcampo(),true);
				campoBeanSwingJInternalFrameLocal.actualizarLista(campoBeanSwingJInternalFrameLocal.campo,this.camposForeignKey);

				campoBeanSwingJInternalFrameLocal.actualizarRelaciones(campoBeanSwingJInternalFrameLocal.campo);

				perfilcampoLocal.setCampo(campoBeanSwingJInternalFrameLocal.campo);

				this.addItemDefectoCombosForeignKeyCampo();
				this.cargarCombosFrameCamposForeignKey("Formulario");
				this.setActualCampoForeignKey(campoBeanSwingJInternalFrameLocal.campo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPerfilCampoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = perfilcampoValidator.getInvalidValues(this.perfilcampo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos) throws Exception {
		try	{		
			PerfilCampoConstantesFunciones.actualizarLista(perfilcampo,perfilcampos,this.perfilcampoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PerfilCampo perfilcampo,List<PerfilCampo> perfilcampos) throws Exception {
		try	{			
			PerfilCampoConstantesFunciones.actualizarSelectedLista(perfilcampo,perfilcampos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PerfilCampo> perfilcamposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				perfilcamposLocal=this.perfilcampoLogic.getPerfilCampos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				perfilcamposLocal=this.perfilcampos;
			}
			//ARCHITECTURE
		
			for(PerfilCampo perfilcampoLocal:perfilcamposLocal) {
				if(this.permiteMantenimiento(perfilcampoLocal) && perfilcampoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PerfilCampoConstantesFunciones.getPerfilCampoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.IDPERFIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelid_perfilPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.IDCAMPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelid_campoPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.TODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabeltodoPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.INGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelingresoPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.MODIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelmodificacionPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.ELIMINACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabeleliminacionPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.CONSULTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelconsultaPerfilCampo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PerfilCampoConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelestadoPerfilCampo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelid_perfilPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelid_campoPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabeltodoPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelingresoPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelmodificacionPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabeleliminacionPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelconsultaPerfilCampo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPerfilCampo.jLabelestadoPerfilCampo,"");
		
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
		this.iIdNuevoPerfilCampo--;	
		
		
		this.perfilcampoAux=new PerfilCampo();
		
		this.perfilcampoAux.setId(this.iIdNuevoPerfilCampo);
		this.perfilcampoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.perfilcampoLogic.getPerfilCampos().add(this.perfilcampoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.perfilcampos.add(this.perfilcampoAux);
		}
		//ARCHITECTURE
		
		this.perfilcampo=this.perfilcampoAux;
		
		if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPerfilCampo(this.perfilcampo);
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilCampo(this.perfilcampo);
		}
				
		//this.setDefaultControlesPerfilCampo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPerfilCampo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPerfilCampo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilCampo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilCampo(this.perfilcampoBean,this.perfilcampo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PerfilCampoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
			classes=PerfilCampoConstantesFunciones.getClassesRelationshipsOfPerfilCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.perfilcampoReturnGeneral=perfilcampoLogic.procesarEventosPerfilCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilcampoLogic.getPerfilCampos(),this.perfilcampo,this.perfilcampoParameterGeneral,this.isEsNuevoPerfilCampo,classes);//this.perfilcampoLogic.getPerfilCampo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPerfilCampo(this.perfilcampoReturnGeneral,this.perfilcampoBean,false);
		
		if(this.perfilcampoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo());
		}
		
		if(this.perfilcampoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo(),classes);//this.perfilcampoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPerfilCampo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPerfilCampo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilCampoBeanSwingJInternalFrameAdditional.RecargarFormPerfilCampo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPerfilCampo(false);
						
			if(perfilcampoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilCampo();
			}
			
			this.actualizarVisualTableDatosPerfilCampo();
			
			this.jTableDatosPerfilCampo.setRowSelectionInterval(this.getIndiceNuevoPerfilCampo(), this.getIndiceNuevoPerfilCampo());
			
			this.seleccionarFilaTablaPerfilCampoActual();
						
			this.actualizarEstadoCeldasBotonesPerfilCampo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPerfilCampo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activartodoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activaringresoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activarmodificacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activareliminacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activarconsultaPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activarestadoPerfilCampo);	
		
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activarid_perfilPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setEnabled(isHabilitar && this.perfilcampoConstantesFunciones.activarid_campoPerfilCampo);
	};
	
	public void setDefaultControlesPerfilCampo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPerfilCampo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.perfilcampoSessionBean.setConGuardarRelaciones(true);			
			this.perfilcampoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.setVisible(true);
			
					
		} else {
			//this.perfilcampoSessionBean.setConGuardarRelaciones(false);			
			this.perfilcampoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPerfilCampo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
				if(perfilcampoAux.getId().equals(this.iIdNuevoPerfilCampo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilCampo perfilcampoAux:this.perfilcampos) {
				if(perfilcampoAux.getId().equals(this.iIdNuevoPerfilCampo)) {
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
	
	public int getIndiceActualPerfilCampo(PerfilCampo perfilcampo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
				if(perfilcampoAux.getId().equals(perfilcampo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilCampo perfilcampoAux:this.perfilcampos) {
				if(perfilcampoAux.getId().equals(perfilcampo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPerfilCampo(PerfilCampo perfilcampoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
				if(perfilcampoAux.getPerfilCampoOriginal().getId().equals(perfilcampoOriginal.getId())) {
					existe=true;
					perfilcampoOriginal.setId(perfilcampoAux.getId());
					perfilcampoOriginal.setVersionRow(perfilcampoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilCampo perfilcampoAux:this.perfilcampos) {
				if(perfilcampoAux.getPerfilCampoOriginal().getId().equals(perfilcampoOriginal.getId())) {
					existe=true;
					perfilcampoOriginal.setId(perfilcampoAux.getId());
					perfilcampoOriginal.setVersionRow(perfilcampoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPerfilCampo(Boolean esParaCancelar) throws Exception {
		perfilcamposAux=new ArrayList<PerfilCampo>();
		perfilcampoAux=new PerfilCampo();
		
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
					if(perfilcampoAux.getId()<0) {
						perfilcamposAux.add(perfilcampoAux);
					}		
				}
				this.iIdNuevoPerfilCampo=0L;
				this.perfilcampoLogic.getPerfilCampos().removeAll(perfilcamposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilCampo perfilcampoAux:this.perfilcampos) {
					if(perfilcampoAux.getId()<0) {
						perfilcamposAux.add(perfilcampoAux);
					}		
				}
				this.iIdNuevoPerfilCampo=0L;
				this.perfilcampos.removeAll(perfilcamposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPerfilCampo 
					&& this.perfilcampoLogic.getPerfilCampos().size()>0
					) {
					perfilcampoAux=this.perfilcampoLogic.getPerfilCampos().get(this.perfilcampoLogic.getPerfilCampos().size() - 1);
				
					if(perfilcampoAux.getId()<0) {
						this.perfilcampoLogic.getPerfilCampos().remove(perfilcampoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPerfilCampo && this.perfilcampos.size()>0) {
					perfilcampoAux=this.perfilcampos.get(this.perfilcampos.size() - 1);
				
					if(perfilcampoAux.getId()<0) {
						this.perfilcampos.remove(perfilcampoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPerfilCampo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(perfilcampo.getId()<0) {
				this.perfilcampoLogic.getPerfilCampos().remove(this.perfilcampo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(perfilcampo.getId()<0) {
				this.perfilcampos.remove(this.perfilcampo);
			}
		}			
	}
	
	public void setEstadosInicialesPerfilCampo(List<PerfilCampo> perfilcamposAux) throws Exception {
		PerfilCampoConstantesFunciones.setEstadosInicialesPerfilCampo(perfilcamposAux);
	}
	
	public void setEstadosInicialesPerfilCampo(PerfilCampo perfilcampoAux) throws Exception {
		PerfilCampoConstantesFunciones.setEstadosInicialesPerfilCampo(perfilcampoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPerfilCampoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPerfilCampoActual()) {
				if(!this.isEsNuevoPerfilCampo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPerfilCampo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPerfilCampoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Perfil Campo ?", "MANTENIMIENTO DE Perfil Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PerfilCampo perfilcampo) throws Exception {
		PerfilCampoConstantesFunciones.seleccionarAsignar(this.perfilcampo,perfilcampo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPerfilCampo=this.isPermisoActualizarOriginalPerfilCampo;
			
			
			this.seleccionarAsignar(perfilcampo);
			
			

			idPerfilActual=perfilcampo.getid_perfil();
			this.seleccionarPerfilActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PerfilCampoConstantesFunciones.quitarEspaciosPerfilCampo(this.perfilcampo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPerfilCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.perfilcampoSessionBean.setsFuncionBusquedaRapida(this.perfilcampoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarPerfilActual() throws Exception {
		try	{
			Perfil perfilAux=new Perfil();

			if(this.idPerfilActual != null && this.idPerfilActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilLogic.getEntityWithConnection(this.idPerfilActual);
					perfilAux= perfilLogic.getPerfil();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				perfilsForeignKey=new ArrayList<Perfil>();
				perfilsForeignKey.add(perfilAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPerfilCampo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPerfilCampo(esParaCancelar);				
				this.cancelarNuevoPerfilCampo(esParaCancelar);								
			}
			
			this.perfilcampo=new PerfilCampo();
			
			this.inicializarPerfilCampo();
			
			this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPerfilCampo() throws Exception {
		try {
			PerfilCampoConstantesFunciones.inicializarPerfilCampo(this.perfilcampo);
			
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
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.perfilcampoLogic.getPerfilCampos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePerfilCampos(String sAccionBusqueda,List<PerfilCampo> perfilcamposParaReportes) throws Exception {
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
					sPathReporteFinal="PerfilCampo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PerfilCampoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PerfilCampoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PerfilCampo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Perfil Campos");		
		parameters.put("busquedapor", PerfilCampoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePerfilCampo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PerfilCampoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PerfilCampoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePerfilCampo=new JRBeanArrayDataSource(PerfilCampoJInternalFrame.TraerPerfilCampoBeans(perfilcamposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePerfilCampo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PerfilCampoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PerfilCampoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PerfilCampoBean.TraerPerfilCampoBeans(perfilcamposParaReportes).toArray()));
							
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
				this.generarExcelReportePerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPerfilCampoActionPerformed(null);
					//this.generarExcelReportePerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPerfilCampos(sAccionBusqueda,sTipoArchivoReporte,perfilcamposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePerfilCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilCampo> perfilcamposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilCampos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilCampo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PerfilCampo perfilcampo : perfilcamposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PerfilCampoConstantesFunciones.generarExcelReporteDataPerfilCampo("NORMAL",row,workbook,perfilcampo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPerfilCampo(String sTipo,Row row,Workbook workbook) {
		
		PerfilCampoConstantesFunciones.generarExcelReporteHeaderPerfilCampo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPerfilCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilCampo> perfilcamposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilCampos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PerfilCampo perfilcampo : perfilcamposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PerfilCampoConstantesFunciones.getPerfilCampoDescripcion(perfilcampo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_IDPERFIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDPERFIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilcampo.getperfil_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_IDCAMPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDCAMPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(perfilcampo.getcampo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_TODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_TODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.gettodo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_INGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_INGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.getingreso()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_MODIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_MODIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.getmodificacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_ELIMINACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ELIMINACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.geteliminacion()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_CONSULTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_CONSULTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.getconsulta()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PerfilCampoConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(perfilcampo.getestado()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPerfilCampos(String sAccionBusqueda,String sTipoArchivoReporte,List<PerfilCampo> perfilcamposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PerfilCampo> perfilcamposRespaldo=null;
		
		classes=PerfilCampoConstantesFunciones.getClassesRelationshipsOfPerfilCampo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.perfilcampoLogic.setDatosCliente(this.datosCliente);
		this.perfilcampoLogic.setDatosDeep(this.datosDeep);
		this.perfilcampoLogic.setIsConDeep(true);
		
		perfilcamposRespaldo=this.perfilcampoLogic.getPerfilCampos();
		
		this.perfilcampoLogic.setPerfilCampos(perfilcamposParaReportes);	
		this.perfilcampoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		perfilcamposParaReportes=this.perfilcampoLogic.getPerfilCampos();
		this.perfilcampoLogic.setPerfilCampos(perfilcamposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PerfilCampos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPerfilCampo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PerfilCampo perfilcampo : perfilcamposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPerfilCampo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PerfilCampoConstantesFunciones.generarExcelReporteDataPerfilCampo("NORMAL",row,workbook,perfilcampo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PerfilCampoConstantesFunciones.getPerfilCampoDescripcion(perfilcampo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilCampo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPerfilCampo() throws Exception {		
		this.startProcessPerfilCampo(true);
	}
	
	public void startProcessPerfilCampo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPerfilCampo ,this.jPanelParametrosReportesPerfilCampo, this.jScrollPanelDatosPerfilCampo,this.jPanelPaginacionPerfilCampo, this.jScrollPanelDatosEdicionPerfilCampo, this.jPanelAccionesPerfilCampo,this.jPanelAccionesFormularioPerfilCampo,this.jmenuBarPerfilCampo,this.jmenuBarDetallePerfilCampo,this.jTtoolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilCampo=this.jTabbedPaneBusquedasPerfilCampo; 
		
		final JPanel jPanelParametrosReportesPerfilCampo=this.jPanelParametrosReportesPerfilCampo;
		//final JScrollPane jScrollPanelDatosPerfilCampo=this.jScrollPanelDatosPerfilCampo;
		final JTable jTableDatosPerfilCampo=this.jTableDatosPerfilCampo;		
		final JPanel jPanelPaginacionPerfilCampo=this.jPanelPaginacionPerfilCampo;
		//final JScrollPane jScrollPanelDatosEdicionPerfilCampo=this.jScrollPanelDatosEdicionPerfilCampo;
		final JPanel jPanelAccionesPerfilCampo=this.jPanelAccionesPerfilCampo;
		
		JPanel jPanelCamposAuxiliarPerfilCampo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPerfilCampo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			jPanelCamposAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jPanelCamposPerfilCampo;
			jPanelAccionesFormularioAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jPanelAccionesFormularioPerfilCampo;
		}
		
		final JPanel jPanelCamposPerfilCampo=jPanelCamposAuxiliarPerfilCampo;
		final JPanel jPanelAccionesFormularioPerfilCampo=jPanelAccionesFormularioAuxiliarPerfilCampo;
		
		
		final JMenuBar jmenuBarPerfilCampo=this.jmenuBarPerfilCampo;
		final JToolBar jTtoolBarPerfilCampo=this.jTtoolBarPerfilCampo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPerfilCampo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilCampo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			jmenuBarDetalleAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jmenuBarDetallePerfilCampo;
			jTtoolBarDetalleAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jTtoolBarDetallePerfilCampo;
		}
		
		final JMenuBar jmenuBarDetallePerfilCampo=jmenuBarDetalleAuxiliarPerfilCampo;
		final JToolBar jTtoolBarDetallePerfilCampo=jTtoolBarDetalleAuxiliarPerfilCampo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilCampo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilCampo;
			processRunnable.jTableDatos=jTableDatosPerfilCampo;
			processRunnable.jPanelCampos=jPanelCamposPerfilCampo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilCampo;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilCampo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilCampo;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilCampo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilCampo;
			processRunnable.jTtoolBar=jTtoolBarPerfilCampo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilCampo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilCampo ,jPanelParametrosReportesPerfilCampo,jTableDatosPerfilCampo, /*jScrollPanelDatosPerfilCampo,*/jPanelCamposPerfilCampo,jPanelPaginacionPerfilCampo, /*jScrollPanelDatosEdicionPerfilCampo,*/ jPanelAccionesPerfilCampo,jPanelAccionesFormularioPerfilCampo,jmenuBarPerfilCampo,jmenuBarDetallePerfilCampo,jTtoolBarPerfilCampo,jTtoolBarDetallePerfilCampo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPerfilCampo ,jPanelParametrosReportesPerfilCampo, jScrollPanelDatosPerfilCampo,jPanelPaginacionPerfilCampo, jScrollPanelDatosEdicionPerfilCampo, jPanelAccionesPerfilCampo,jPanelAccionesFormularioPerfilCampo,jmenuBarPerfilCampo,jmenuBarDetallePerfilCampo,jTtoolBarPerfilCampo,jTtoolBarDetallePerfilCampo);
						
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
	
	public void finishProcessPerfilCampo() {// throws Exception 
		this.finishProcessPerfilCampo(true);
	}
	
	public void finishProcessPerfilCampo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPerfilCampo ,this.jPanelParametrosReportesPerfilCampo, this.jScrollPanelDatosPerfilCampo,this.jPanelPaginacionPerfilCampo, this.jScrollPanelDatosEdicionPerfilCampo, this.jPanelAccionesPerfilCampo,this.jPanelAccionesFormularioPerfilCampo,this.jmenuBarPerfilCampo,this.jmenuBarDetallePerfilCampo,this.jTtoolBarPerfilCampo,this.jTtoolBarDetallePerfilCampo);		
		
		final JTabbedPane jTabbedPaneBusquedasPerfilCampo=this.jTabbedPaneBusquedasPerfilCampo; 
		
		final JPanel jPanelParametrosReportesPerfilCampo=this.jPanelParametrosReportesPerfilCampo;
		//final JScrollPane jScrollPanelDatosPerfilCampo=this.jScrollPanelDatosPerfilCampo;
		final JTable jTableDatosPerfilCampo=this.jTableDatosPerfilCampo;		
		final JPanel jPanelPaginacionPerfilCampo=this.jPanelPaginacionPerfilCampo;
		//final JScrollPane jScrollPanelDatosEdicionPerfilCampo=this.jScrollPanelDatosEdicionPerfilCampo;
		final JPanel jPanelAccionesPerfilCampo=this.jPanelAccionesPerfilCampo;
		
		JPanel jPanelCamposAuxiliarPerfilCampo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPerfilCampo=new JPanel();
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			jPanelCamposAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jPanelCamposPerfilCampo;
			jPanelAccionesFormularioAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jPanelAccionesFormularioPerfilCampo;
		}
		
		final JPanel jPanelCamposPerfilCampo=jPanelCamposAuxiliarPerfilCampo;
		final JPanel jPanelAccionesFormularioPerfilCampo=jPanelAccionesFormularioAuxiliarPerfilCampo;
		
		
		final JMenuBar jmenuBarPerfilCampo=this.jmenuBarPerfilCampo;		
		final JToolBar jTtoolBarPerfilCampo=this.jTtoolBarPerfilCampo;
				
		JMenuBar jmenuBarDetalleAuxiliarPerfilCampo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPerfilCampo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			jmenuBarDetalleAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jmenuBarDetallePerfilCampo;
			jTtoolBarDetalleAuxiliarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jTtoolBarDetallePerfilCampo;		
		}
		
		final JMenuBar jmenuBarDetallePerfilCampo=jmenuBarDetalleAuxiliarPerfilCampo;
		final JToolBar jTtoolBarDetallePerfilCampo=jTtoolBarDetalleAuxiliarPerfilCampo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPerfilCampo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPerfilCampo;
			processRunnable.jTableDatos=jTableDatosPerfilCampo;
			processRunnable.jPanelCampos=jPanelCamposPerfilCampo;
			processRunnable.jPanelPaginacion=jPanelPaginacionPerfilCampo;
			processRunnable.jPanelAcciones=jPanelAccionesPerfilCampo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPerfilCampo;
			
			
			processRunnable.jmenuBar=jmenuBarPerfilCampo;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePerfilCampo;
			processRunnable.jTtoolBar=jTtoolBarPerfilCampo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePerfilCampo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPerfilCampo ,jPanelParametrosReportesPerfilCampo, jTableDatosPerfilCampo,/*jScrollPanelDatosPerfilCampo,*/jPanelCamposPerfilCampo,jPanelPaginacionPerfilCampo, /*jScrollPanelDatosEdicionPerfilCampo,*/ jPanelAccionesPerfilCampo,jPanelAccionesFormularioPerfilCampo,jmenuBarPerfilCampo,jmenuBarDetallePerfilCampo,jTtoolBarPerfilCampo,jTtoolBarDetallePerfilCampo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPerfilCampo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPerfilCampo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPerfilCampo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPerfilCampo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPerfilCampo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePerfilCampo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPerfilCampo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPerfilCampo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePerfilCampo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.perfilcampoConstantesFunciones.getsFinalQueryPerfilCampo();
		String  finalQueryPaginacionTodos=this.perfilcampoConstantesFunciones.getsFinalQueryPerfilCampo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PerfilCampoConstantesFunciones.getArrayColumnasGlobalesNoPerfilCampo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PerfilCampoConstantesFunciones.getArrayColumnasGlobalesPerfilCampo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PerfilCampoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.perfilcamposEliminados= new ArrayList<PerfilCampo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPerfilCampo();
		
				///*PerfilCampoSessionBean*/this.perfilcampoSessionBean=new PerfilCampoSessionBean();
			
			if(this.perfilcampoSessionBean==null) {
				this.perfilcampoSessionBean=new PerfilCampoSessionBean();
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
					this.iNumeroPaginacion=PerfilCampoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PerfilCampoConstantesFunciones.getClassesForeignKeysOfPerfilCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/perfilcampo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			perfilcamposAux= new ArrayList<PerfilCampo>();
			
				
			perfilcampoLogic.setDatosCliente(this.datosCliente);
			perfilcampoLogic.setDatosDeep(this.datosDeep);
			perfilcampoLogic.setIsConDeep(true);
			
			
			perfilcampoLogic.getPerfilCampoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					perfilcampoLogic.getTodosPerfilCampos(finalQueryGlobal,pagination);
					
					//perfilcampoLogic.getTodosPerfilCamposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(perfilcampoLogic.getPerfilCampos()==null|| perfilcampoLogic.getPerfilCampos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilcamposAux= new ArrayList<PerfilCampo>();
							perfilcamposAux.addAll(perfilcampoLogic.getPerfilCampos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcamposAux= new ArrayList<PerfilCampo>();
							perfilcamposAux.addAll(perfilcampos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilcampoLogic.getTodosPerfilCampos(finalQueryGlobal+"",this.pagination);												
							
							//perfilcampoLogic.getTodosPerfilCamposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePerfilCampos("Todos",perfilcampoLogic.getPerfilCampos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());					
							perfilcampoLogic.getPerfilCampos().addAll(perfilcamposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcampos=new ArrayList<PerfilCampo>();
							perfilcampos.addAll(perfilcamposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPerfilCampo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPerfilCampo=this.idActual;
				
				} else if(this.idPerfilCampoActual!=null && this.idPerfilCampoActual!=0L) {
					idPerfilCampo=idPerfilCampoActual;
				}
				
					
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndicePorId(idPerfilCampo);
				
				this.perfilcampos=new ArrayList<PerfilCampo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					perfilcampoLogic.getEntity(idPerfilCampo);
					
					//perfilcampoLogic.getEntityWithConnection(idPerfilCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
					perfilcampoLogic.getPerfilCampos().add(perfilcampoLogic.getPerfilCampo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilcampos=new ArrayList<PerfilCampo>();
					this.perfilcampos.add(perfilcampo);
				}
				
				if(perfilcampoLogic.getPerfilCampo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCampo")) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdCampo(id_campoFK_IdCampo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilcampoLogic.getPerfilCamposFK_IdCampo(finalQueryGlobal,pagination,id_campoFK_IdCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdCampo(id_campoFK_IdCampo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdCampo(id_campoFK_IdCampo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilcampoLogic.getPerfilCampos()==null||perfilcampoLogic.getPerfilCampos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilcampos==null|| perfilcampos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcamposAux=new ArrayList<PerfilCampo>();
						perfilcamposAux.addAll(perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcamposAux=new ArrayList<PerfilCampo>();
							perfilcamposAux.addAll(perfilcampos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilcampoLogic.getPerfilCamposFK_IdCampo(finalQueryGlobal,pagination,id_campoFK_IdCampo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdCampo(id_campoFK_IdCampo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdCampo(id_campoFK_IdCampo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilCampos("FK_IdCampo",perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilCampos("FK_IdCampo",perfilcampos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
						perfilcampoLogic.getPerfilCampos().addAll(perfilcamposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcampos=new ArrayList<PerfilCampo>();
							perfilcampos.addAll(perfilcamposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPerfil")) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					perfilcampoLogic.getPerfilCamposFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=perfilcampoLogic.getPerfilCampos()==null||perfilcampoLogic.getPerfilCampos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=perfilcampos==null|| perfilcampos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcamposAux=new ArrayList<PerfilCampo>();
						perfilcamposAux.addAll(perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcamposAux=new ArrayList<PerfilCampo>();
							perfilcamposAux.addAll(perfilcampos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							perfilcampoLogic.getPerfilCamposFK_IdPerfil(finalQueryGlobal,pagination,id_perfilFK_IdPerfil);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PerfilCampoConstantesFunciones.getDetalleIndiceFK_IdPerfil(id_perfilFK_IdPerfil);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePerfilCampos("FK_IdPerfil",perfilcampoLogic.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePerfilCampos("FK_IdPerfil",perfilcampos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoLogic.setPerfilCampos(new ArrayList<PerfilCampo>());
						perfilcampoLogic.getPerfilCampos().addAll(perfilcamposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcampos=new ArrayList<PerfilCampo>();
							perfilcampos.addAll(perfilcamposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPerfilCampo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPerfilCampo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilcampoLogic.getPerfilCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilcampos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=perfilcampoLogic.getPerfilCampos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=perfilcampos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PerfilCampo perfilcampo) {
		Boolean permite=true;
		
		if(this.perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PerfilCampoConstantesFunciones.getOrderByListaPerfilCampo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PerfilCampoConstantesFunciones.getOrderByListaPerfilCampo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilCampo perfilcampo:perfilcampoLogic.getPerfilCampos()) {
				if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
					perfilcampoTotales=perfilcampo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilCampo perfilcampo:this.perfilcampos) {
				if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
					perfilcampoTotales=perfilcampo;
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
			this.perfilcampoAux=new PerfilCampo();
			this.perfilcampoAux.setsType(Constantes2.S_TOTALES);
			this.perfilcampoAux.setIsNew(false);
			this.perfilcampoAux.setIsChanged(false);
			this.perfilcampoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PerfilCampoConstantesFunciones.TotalizarValoresFilaPerfilCampo(this.perfilcampoLogic.getPerfilCampos(),this.perfilcampoAux);
				
				this.perfilcampoLogic.getPerfilCampos().add(this.perfilcampoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PerfilCampoConstantesFunciones.TotalizarValoresFilaPerfilCampo(this.perfilcampos,this.perfilcampoAux);
				
				this.perfilcampos.add(this.perfilcampoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		perfilcampoTotales=new PerfilCampo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilcampoLogic.getPerfilCampos().remove(perfilcampoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.perfilcampos.remove(perfilcampoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		perfilcampoTotales=new PerfilCampo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PerfilCampo perfilcampo:perfilcampoLogic.getPerfilCampos()) {
				if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
					perfilcampoTotales=perfilcampo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilCampoConstantesFunciones.TotalizarValoresFilaPerfilCampo(this.perfilcampoLogic.getPerfilCampos(),perfilcampoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PerfilCampo perfilcampo:this.perfilcampos) {
				if(perfilcampo.getsType().equals(Constantes2.S_TOTALES)) {
					perfilcampoTotales=perfilcampo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PerfilCampoConstantesFunciones.TotalizarValoresFilaPerfilCampo(this.perfilcampos,perfilcampoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPerfilCamposFK_IdCampo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCampo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPerfilCamposFK_IdPerfil()throws Exception {
		try {
			sAccionBusqueda="FK_IdPerfil";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPerfilCamposFK_IdCampo(String sFinalQuery,Long id_campo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilcampoLogic.getPerfilCamposFK_IdCampo(sFinalQuery,this.pagination,id_campo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPerfilCamposFK_IdPerfil(String sFinalQuery,Long id_perfil)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilcampoLogic.getPerfilCamposFK_IdPerfil(sFinalQuery,this.pagination,id_perfil);
				
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
	
	public void inicializarPermisosPerfilCampo() {
		this.isPermisoTodoPerfilCampo=false;
		this.isPermisoNuevoPerfilCampo=false;
		this.isPermisoActualizarPerfilCampo=false;
		this.isPermisoActualizarOriginalPerfilCampo=false;
		this.isPermisoEliminarPerfilCampo=false;
		this.isPermisoGuardarCambiosPerfilCampo=false;
		this.isPermisoConsultaPerfilCampo=false;
		this.isPermisoBusquedaPerfilCampo=false;
		this.isPermisoReportePerfilCampo=false;		
		this.isPermisoOrdenPerfilCampo=false;		
		this.isPermisoPaginacionMedioPerfilCampo=false;		
		this.isPermisoPaginacionAltoPerfilCampo=false;
		this.isPermisoPaginacionTodoPerfilCampo=false;
		this.isPermisoCopiarPerfilCampo=false;		
		this.isPermisoVerFormPerfilCampo=false;		
		this.isPermisoDuplicarPerfilCampo=false;		
		this.isPermisoOrdenPerfilCampo=false;		
	}
	
	public void setPermisosUsuarioPerfilCampo(Boolean isPermiso) {
		this.isPermisoTodoPerfilCampo=isPermiso;
		this.isPermisoNuevoPerfilCampo=isPermiso;
		this.isPermisoActualizarPerfilCampo=isPermiso;
		this.isPermisoActualizarOriginalPerfilCampo=isPermiso;
		this.isPermisoEliminarPerfilCampo=isPermiso;
		this.isPermisoGuardarCambiosPerfilCampo=isPermiso;
		this.isPermisoConsultaPerfilCampo=isPermiso;
		this.isPermisoBusquedaPerfilCampo=isPermiso;
		this.isPermisoReportePerfilCampo=isPermiso;
		this.isPermisoOrdenPerfilCampo=isPermiso;		
		this.isPermisoPaginacionMedioPerfilCampo=isPermiso;		
		this.isPermisoPaginacionAltoPerfilCampo=isPermiso;		
		this.isPermisoPaginacionTodoPerfilCampo=isPermiso;		
		this.isPermisoCopiarPerfilCampo=isPermiso;		
		this.isPermisoVerFormPerfilCampo=isPermiso;		
		this.isPermisoDuplicarPerfilCampo=isPermiso;
		this.isPermisoOrdenPerfilCampo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPerfilCampo(Boolean isPermiso) {
		//this.isPermisoTodoPerfilCampo=isPermiso;
		this.isPermisoNuevoPerfilCampo=isPermiso;
		this.isPermisoActualizarPerfilCampo=isPermiso;
		this.isPermisoActualizarOriginalPerfilCampo=isPermiso;
		this.isPermisoEliminarPerfilCampo=isPermiso;
		this.isPermisoGuardarCambiosPerfilCampo=isPermiso;
		//this.isPermisoConsultaPerfilCampo=isPermiso;
		//this.isPermisoBusquedaPerfilCampo=isPermiso;
		//this.isPermisoReportePerfilCampo=isPermiso;
		//this.isPermisoOrdenPerfilCampo=isPermiso;		
		//this.isPermisoPaginacionMedioPerfilCampo=isPermiso;		
		//this.isPermisoPaginacionAltoPerfilCampo=isPermiso;		
		//this.isPermisoPaginacionTodoPerfilCampo=isPermiso;		
		//this.isPermisoCopiarPerfilCampo=isPermiso;		
		//this.isPermisoDuplicarPerfilCampo=isPermiso;
		//this.isPermisoOrdenPerfilCampo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPerfilCampoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PerfilCampoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPerfilCampo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPerfilCampoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPerfilCampoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPerfilCampoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPerfilCampoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPerfilCampo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PerfilCampoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PerfilCampoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPerfilCampo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPerfilCampo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPerfilCampo=this.isPermisoActualizarPerfilCampo;
			this.isPermisoEliminarPerfilCampo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPerfilCampo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPerfilCampo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPerfilCampo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPerfilCampo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePerfilCampo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilCampo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPerfilCampo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPerfilCampo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPerfilCampo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPerfilCampo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPerfilCampo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPerfilCampo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPerfilCampo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPerfilCampo.setToolTipText(this.jTableDatosPerfilCampo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPerfilCampo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPerfilCampo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PerfilCampoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PerfilCampoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPerfilCampo() throws Exception {
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
	public void inicializarCombosForeignKeyPerfilCampoListas()throws Exception {
		try	{						
			
				this.perfilsForeignKey=new ArrayList();
				this.camposForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPerfilCampoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PerfilCampoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPerfilCampoListas(false);
			} else {
			
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCampoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPerfilListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PerfilConstantesFunciones.SFINALQUERY;

				this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCampoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.camposForeignKey==null||this.camposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CampoConstantesFunciones.getArrayColumnasGlobalesCampo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CampoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CampoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCamposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPerfilCampoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PerfilCampoParameterReturnGeneral perfilcampoReturnGeneral=new PerfilCampoParameterReturnGeneral();
						
			


				String finalQueryGlobalPerfil="";

				if(((this.perfilsForeignKey==null||this.perfilsForeignKey.size()<=0) && this.perfilcampoConstantesFunciones.cargarid_perfilPerfilCampo)
					 || (this.esRecargarFks && this.perfilcampoConstantesFunciones.cargarid_perfilPerfilCampo)) {

					if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PerfilConstantesFunciones.getArrayColumnasGlobalesPerfil(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPerfil=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PerfilConstantesFunciones.TABLENAME);

						finalQueryGlobalPerfil=Funciones.GetFinalQueryAppend(finalQueryGlobalPerfil, "");
						finalQueryGlobalPerfil+=PerfilConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPerfilsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPerfil=" WHERE " + ConstantesSql.ID + "="+perfilcampoSessionBean.getlidPerfilActual();
					}
				} else {
					finalQueryGlobalPerfil="NONE";
				}


				String finalQueryGlobalCampo="";

				if(((this.camposForeignKey==null||this.camposForeignKey.size()<=0) && this.perfilcampoConstantesFunciones.cargarid_campoPerfilCampo)
					 || (this.esRecargarFks && this.perfilcampoConstantesFunciones.cargarid_campoPerfilCampo)) {

					if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionCampo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CampoConstantesFunciones.getArrayColumnasGlobalesCampo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCampo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CampoConstantesFunciones.TABLENAME);

						finalQueryGlobalCampo=Funciones.GetFinalQueryAppend(finalQueryGlobalCampo, "");
						finalQueryGlobalCampo+=CampoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCamposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCampo=" WHERE " + ConstantesSql.ID + "="+perfilcampoSessionBean.getlidCampoActual();
					}
				} else {
					finalQueryGlobalCampo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilcampoReturnGeneral=perfilcampoLogic.cargarCombosLoteForeignKeyPerfilCampo(finalQueryGlobalPerfil,finalQueryGlobalCampo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPerfil.equals("NONE")) {
				this.perfilsForeignKey=perfilcampoReturnGeneral.getperfilsForeignKey();
			}

			if(!finalQueryGlobalCampo.equals("NONE")) {
				this.camposForeignKey=perfilcampoReturnGeneral.getcamposForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPerfilCampo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPerfil();
			this.addItemDefectoCombosForeignKeyCampo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPerfil()throws Exception {
		try {
			if(this.perfilcampoSessionBean==null) {
				this.perfilcampoSessionBean=new PerfilCampoSessionBean();
			}

			if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionPerfil()) {
				Perfil perfil=new Perfil();
				PerfilConstantesFunciones.setPerfilDescripcion(perfil,Constantes.SMENSAJE_ESCOJA_OPCION);
				perfil.setId(null);

				if(!PerfilConstantesFunciones.ExisteEnLista(this.perfilsForeignKey,perfil,true)) {

					this.perfilsForeignKey.add(0,perfil);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCampo()throws Exception {
		try {

			if(!this.perfilcampoSessionBean.getisBusquedaDesdeForeignKeySesionCampo()) {
				Campo campo=new Campo();
				CampoConstantesFunciones.setCampoDescripcion(campo,Constantes.SMENSAJE_ESCOJA_OPCION);
				campo.setId(null);

				if(!CampoConstantesFunciones.ExisteEnLista(this.camposForeignKey,campo,true)) {

					this.camposForeignKey.add(0,campo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPerfilCampo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPerfilCampo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPerfilCampo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilCampo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPerfilCampo(PerfilCampo perfilcampo)throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(perfilcampo.getid_perfil(),false,"Formulario");
			this.setActualCampoForeignKey(perfilcampo.getid_campo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPerfilCampo(PerfilCampo perfilcampo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(perfilcampo.getPerfil()!=null && !sTipoEvento.equals("id_perfilPerfilCampo")) { //sTipoEvento Evita Bucle Infinito

					this.perfilsForeignKey=new ArrayList<Perfil>();
					this.perfilsForeignKey.add(perfilcampo.getPerfil());

					this.addItemDefectoCombosForeignKeyPerfil();
					this.cargarCombosFramePerfilsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPerfilCampo()throws Exception {	
		try {
			
			this.setActualPerfilForeignKey(this.perfilcampoConstantesFunciones.getid_perfil(),false,"Formulario");
			this.setActualCampoForeignKey(this.perfilcampoConstantesFunciones.getid_campo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPerfilCampo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPerfilCampo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPerfilCampo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPerfilCampo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPerfilCampo()throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey("Todos");
			this.cargarCombosFrameCamposForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPerfilCampo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCamposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPerfilCampo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.getItemCount()>0) {
				this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public PerfilCampoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PerfilCampoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PerfilCampoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.perfilcampoSessionBean=new PerfilCampoSessionBean(); 
		this.perfilcampoConstantesFunciones=new PerfilCampoConstantesFunciones(); 
		this.perfilcampoBean=new PerfilCampo();//(this.perfilcampoConstantesFunciones); 		
		this.perfilcampoReturnGeneral=new PerfilCampoParameterReturnGeneral(); 
		
		this.perfilcampoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.perfilcampoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PerfilCampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PerfilCampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PerfilCampoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPerfilCampo(true);
			
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
			
			this.perfilcampoConstantesFunciones=new PerfilCampoConstantesFunciones(); 
			this.perfilcampoBean=new PerfilCampo();//this.perfilcampoConstantesFunciones); 			
			this.perfilcampoReturnGeneral=new PerfilCampoParameterReturnGeneral(); 
		
			PerfilCampoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Perfil Campo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.perfilcampo=new PerfilCampo();
			this.perfilcampos = new ArrayList<PerfilCampo>();
			this.perfilcamposAux = new ArrayList<PerfilCampo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic=new PerfilCampoLogic();
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			//this.perfilcampoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.perfilcampoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPerfilCampo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilCampo);	
					}
					
					if(this.jInternalFrameImportacionPerfilCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilCampo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPerfilCampo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPerfilCampo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilCampo);
				this.jInternalFrameDetalleFormPerfilCampo.setVisible(false);
				this.jInternalFrameDetalleFormPerfilCampo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilCampo);
					this.jInternalFrameReporteDinamicoPerfilCampo.setVisible(false);
					this.jInternalFrameReporteDinamicoPerfilCampo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPerfilCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPerfilCampo);
					this.jInternalFrameImportacionPerfilCampo.setVisible(false);
					this.jInternalFrameImportacionPerfilCampo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPerfilCampo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPerfilCampo);
					this.jInternalFrameOrderByPerfilCampo.setVisible(false);
					this.jInternalFrameOrderByPerfilCampo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPerfilCampoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PerfilCampoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.perfilcampoReturnGeneral=new PerfilCampoParameterReturnGeneral();
			
			this.perfilcampoParameterGeneral=new PerfilCampoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.perfilcampoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PerfilCampoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilCampoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilcampoSessionBean.getEsGuardarRelacionado(),this.perfilcampoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PerfilCampoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.perfilcampoSessionBean.getEsGuardarRelacionado(),this.perfilcampoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaDuplicarPerfilCampo=true;
			this.isVisibilidadCeldaCopiarPerfilCampo=true;
			this.isVisibilidadCeldaVerFormPerfilCampo=true;
			this.isVisibilidadCeldaOrdenPerfilCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=false;
			this.isVisibilidadCeldaGuardarPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			
			
			this.isVisibilidadFK_IdCampo=true;
			this.isVisibilidadFK_IdPerfil=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPerfilCampo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPerfilCampo(false);
			
			this.setPermisosUsuarioPerfilCampo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado() 
				|| (this.perfilcampoSessionBean.getEsGuardarRelacionado() && this.perfilcampoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPerfilCampoClasesRelacionadas();
			}
			
			if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPerfilCampoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPerfilCampo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPerfilCampo();
			}
			
			if(!this.isPermisoBusquedaPerfilCampo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPerfilCampo,this.isPermisoPaginacionMedioPerfilCampo,this.isPermisoPaginacionTodoPerfilCampo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PerfilCampoConstantesFunciones.getTiposSeleccionarPerfilCampo());
				
				this.tiposColumnasSelect=PerfilCampoConstantesFunciones.getTiposSeleccionarPerfilCampo(true);
				
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
			//if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPerfilCampo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPerfilCampo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPerfilCampo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilCampo() ;
			
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
			
			this.perfilLogic=new PerfilLogic();
			this.campoLogic=new CampoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				perfilcampoImplementable= (PerfilCampoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilCampoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				perfilcampoImplementableHome= (PerfilCampoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PerfilCampoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.perfilcampos= new ArrayList<PerfilCampo>();
			this.perfilcamposEliminados= new ArrayList<PerfilCampo>();
						
			this.isEsNuevoPerfilCampo=false;
			this.esParaAccionDesdeFormularioPerfilCampo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idPerfilActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.perfilsForeignKey=new ArrayList<Perfil>() ;
			this.camposForeignKey=new ArrayList<Campo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPerfilCampo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPerfilCampo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PerfilCampoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PerfilCampoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPerfilCampo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPerfilCampo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPerfilCampo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPerfilCampo();
			}
			
			PerfilCampoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPerfilCampo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPerfilCampo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPerfilCampo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPerfilCampo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PerfilCampo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPerfilCampo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPerfilCampo")) {
				iIndex=this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPerfilCampo();	
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
	
	public void cargarCombosForeignKeyPerfilCampo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPerfilCampo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPerfilCampo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPerfilCampoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPerfilCampo();
		
		this.cargarCombosFrameForeignKeyPerfilCampo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPerfilCampo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPerfilCampo();
		}
	}
	
	

	public void cargarCombosForeignKeyPerfil(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPerfilListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPerfil();
				this.cargarCombosFramePerfilsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPerfil(this.perfilsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCampo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCampoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCampo();
				this.cargarCombosFrameCamposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCampo(this.camposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPerfilCampoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			
			if(jTableDatosPerfilCampo.getRowCount()>=1) {
				jTableDatosPerfilCampo.removeRowSelectionInterval(0, jTableDatosPerfilCampo.getRowCount()-1);						
			}
			
			this.isEsNuevoPerfilCampo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPerfilCampo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPerfilCampo(true);			
			//this.perfilcampo=new PerfilCampo();
			//this.perfilcampo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilCampo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilCampo() ;
			
			if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilCampo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.perfilcampo);	
			this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);				
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PerfilCampo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPerfilCampoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPerfilCampo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPerfilCampo.getSelectedRows().length;			
			}
			
			perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPerfilCampo--;			
				//PerfilCampo perfilcampoAux= new PerfilCampo();			
				//perfilcampoAux.setId(this.iIdNuevoPerfilCampo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PerfilCampo perfilcampoOrigen=new PerfilCampo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PerfilCampo perfilcampoOrigen : perfilcamposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							perfilcampoOrigen =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							perfilcampoOrigen =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPerfilCampo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.perfilcampo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPerfilCampo(perfilcampoOrigen,this.perfilcampo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilcampoLogic.getPerfilCampos().add(this.perfilcampoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilcampos.add(this.perfilcampoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPerfilCampo(false);
				
				this.jTableDatosPerfilCampo.setRowSelectionInterval(this.getIndiceNuevoPerfilCampo(), this.getIndiceNuevoPerfilCampo());
				
				int iLastRow =  this.jTableDatosPerfilCampo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilCampo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilCampo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilCampo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();									
		
			PerfilCampo perfilcampoOrigen=new PerfilCampo();
			PerfilCampo perfilcampoDestino=new PerfilCampo();
				
			perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPerfilCampo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || perfilcamposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPerfilCampo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoOrigen =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilcampoOrigen =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						perfilcampoDestino =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						perfilcampoDestino =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				perfilcampoOrigen =perfilcamposSeleccionados.get(0);
				perfilcampoDestino =perfilcamposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPerfilCampo(perfilcampoOrigen,perfilcampoDestino,true,false);
				
				perfilcampoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(perfilcampoDestino,perfilcampoLogic.getPerfilCampos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(perfilcampoDestino,perfilcampos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPerfilCampo(false);
				
				//this.jTableDatosPerfilCampo.setRowSelectionInterval(this.getIndiceNuevoPerfilCampo(), this.getIndiceNuevoPerfilCampo());
				
				int iLastRow =  this.jTableDatosPerfilCampo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPerfilCampo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPerfilCampo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilCampo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPerfilCampo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPerfilCampo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPerfilCampo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPerfilCampo.setVisible(!isVisible);
			this.jPanelPaginacionPerfilCampo.setVisible(!isVisible);
			this.jPanelAccionesPerfilCampo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePerfilCampo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPerfilCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPerfilCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPerfilCampo();
			
			this.abrirFrameOrderByPerfilCampo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPerfilCampo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePerfilCampo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilCampo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPerfilCampo.isMaximum()) {
					this.jInternalFrameDetalleFormPerfilCampo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPerfilCampo.setSize(this.jInternalFrameDetalleFormPerfilCampo.iWidthFormulario,this.jInternalFrameDetalleFormPerfilCampo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPerfilCampo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPerfilCampo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPerfilCampo.isMaximum()) {
						this.jInternalFrameDetalleFormPerfilCampo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPerfilCampo.jContentPaneDetallePerfilCampo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPerfilCampo.jContentPaneDetallePerfilCampo.getWidth(),PerfilCampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPerfilCampo.jContentPaneDetallePerfilCampo.getWidth(),PerfilCampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPerfilCampo.jContentPaneDetallePerfilCampo.getWidth(),PerfilCampoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPerfilCampo.setVisible(true);
	        this.jInternalFrameDetalleFormPerfilCampo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPerfilCampo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPerfilCampo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPerfilCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilCampo,false,this);
				} else {
					this.jInternalFrameOrderByPerfilCampo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPerfilCampo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPerfilCampo);
				this.jInternalFrameOrderByPerfilCampo.setVisible(false);
				this.jInternalFrameOrderByPerfilCampo.setSelected(false);
				
				this.jInternalFrameOrderByPerfilCampo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilCampo"));
				
				this.inicializarActualizarBindingTablaOrderByPerfilCampo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPerfilCampo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPerfilCampo==null) {
				
				this.jInternalFrameImportacionPerfilCampo=new ImportacionJInternalFrame(PerfilCampoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPerfilCampo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPerfilCampo);
				this.jInternalFrameImportacionPerfilCampo.setVisible(false);
				this.jInternalFrameImportacionPerfilCampo.setSelected(false);


				this.jInternalFrameImportacionPerfilCampo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilCampo"));
				this.jInternalFrameImportacionPerfilCampo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilCampo"));
				this.jInternalFrameImportacionPerfilCampo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilCampo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPerfilCampo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPerfilCampo==null) {
				this.jInternalFrameReporteDinamicoPerfilCampo=new ReporteDinamicoJInternalFrame(PerfilCampoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPerfilCampo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPerfilCampo);
				this.jInternalFrameReporteDinamicoPerfilCampo.setVisible(false);
				this.jInternalFrameReporteDinamicoPerfilCampo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilCampo"));
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilCampo"));
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilCampo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilCampo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePerfilCampo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPerfilCampo);
			
	       	this.jInternalFrameDetalleFormPerfilCampo.setVisible(false);
	        this.jInternalFrameDetalleFormPerfilCampo.setSelected(false);
			
			//this.jInternalFrameDetalleFormPerfilCampo.dispose();
			//this.jInternalFrameDetalleFormPerfilCampo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPerfilCampo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPerfilCampo.setVisible(true);
	        this.jInternalFrameReporteDinamicoPerfilCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPerfilCampo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPerfilCampo.setVisible(true);
	        this.jInternalFrameImportacionPerfilCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPerfilCampo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPerfilCampo.setVisible(true);
	        this.jInternalFrameOrderByPerfilCampo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPerfilCampo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPerfilCampo.setVisible(false);
	        this.jInternalFrameOrderByPerfilCampo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPerfilCampo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPerfilCampo.setVisible(false);
	        this.jInternalFrameReporteDinamicoPerfilCampo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPerfilCampo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPerfilCampo.setVisible(false);
	        this.jInternalFrameImportacionPerfilCampo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPerfilCampo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPerfilCampo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPerfilCampo(true);
			//this.isEsNuevoPerfilCampo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPerfilCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilCampo(false) ;
			
			if(perfilcampoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilCampo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilCampo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPerfilCampoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPerfilCampo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPerfilCampo(true);
			//this.isEsNuevoPerfilCampo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.perfilcampo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPerfilCampo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPerfilCampo(false) ;
			
			if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePerfilCampo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilCampo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Perfil")) {
				if(!this.perfilcampoConstantesFunciones.cargarid_perfilPerfilCampo) {
					this.cargarCombosPerfilsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPerfilCampo(false,false);
					this.cargarCombosFramePerfilsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_perfil (id);

				this.recargarComboTablaPerfil(this.perfilsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPerfil(List<Perfil> perfilsForeignKey)throws Exception{
		TableColumn tableColumnPerfil=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_IDPERFIL));
		TableCellEditor tableCellEditorPerfil =tableColumnPerfil.getCellEditor();

		PerfilTableCell perfilTableCellFk=(PerfilTableCell)tableCellEditorPerfil;

		if(perfilTableCellFk!=null) {
			perfilTableCellFk.setperfilsForeignKey(perfilsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilCampo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//perfilTableCellFk.setRowActual(intSelectedRow);
			//perfilTableCellFk.setperfilsForeignKeyActual(perfilsForeignKey);
		//}


		if(perfilTableCellFk!=null) {
			perfilTableCellFk.RecargarPerfilsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCampo(List<Campo> camposForeignKey)throws Exception{
		TableColumn tableColumnCampo=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_IDCAMPO));
		TableCellEditor tableCellEditorCampo =tableColumnCampo.getCellEditor();

		CampoTableCell campoTableCellFk=(CampoTableCell)tableCellEditorCampo;

		if(campoTableCellFk!=null) {
			campoTableCellFk.setcamposForeignKey(camposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPerfilCampo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//campoTableCellFk.setRowActual(intSelectedRow);
			//campoTableCellFk.setcamposForeignKeyActual(camposForeignKey);
		//}


		if(campoTableCellFk!=null) {
			campoTableCellFk.RecargarCamposForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_perfil (Long id) throws Exception {
		this.setActualPerfilForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPerfilCampo(false);
			
			//if(!this.isEsNuevoPerfilCampo) {								
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				
			}
			
			if(this.permiteMantenimiento(this.perfilcampo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPerfilCampo=true;
					this.inicializarActualizarBindingTablaPerfilCampo(false);
					this.isEsNuevoPerfilCampo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPerfilCampo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPerfilCampo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilCampo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilCampo(false);
				
				this.habilitarDeshabilitarControlesPerfilCampo(false);
			
												
				
				if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePerfilCampo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPerfilCampoActionPerformed(evt,perfilcampoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPerfilCampo(this.perfilcampo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPerfilCampo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,perfilcampoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.perfilcampo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				this.perfilcampo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				this.perfilcampo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.perfilcampo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PerfilCampoModel) this.jTableDatosPerfilCampo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPerfilCampo=true;
				this.inicializarActualizarBindingTablaPerfilCampo(false);
				this.isEsNuevoPerfilCampo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPerfilCampo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilCampo(false);
				
				this.habilitarDeshabilitarControlesPerfilCampo(false);
				
				
				
				if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePerfilCampo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPerfilCampoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPerfilCampo.getRowCount()>=1) {
				jTableDatosPerfilCampo.removeRowSelectionInterval(0, jTableDatosPerfilCampo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPerfilCampo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPerfilCampo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPerfilCampo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPerfilCampo(false) ;
			
			this.isEsNuevoPerfilCampo=false;
			
			if(PerfilCampoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePerfilCampo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPerfilCampo(false);
				
				//SI ES MANUAL
				if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPerfilCampo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPerfilCampo--;			
			//PerfilCampo perfilcampoAux= new PerfilCampo();			
			//perfilcampoAux.setId(this.iIdNuevoPerfilCampo);
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPerfilCampo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
			
			this.perfilcampo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.perfilcampoLogic.getPerfilCampos().add(this.perfilcampoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.perfilcampos.add(this.perfilcampoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPerfilCampo(false);
			
			this.jTableDatosPerfilCampo.setRowSelectionInterval(this.getIndiceNuevoPerfilCampo(), this.getIndiceNuevoPerfilCampo());
			
			int iLastRow =  this.jTableDatosPerfilCampo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPerfilCampo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPerfilCampo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPerfilCampo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilCampo(false);
			
			//SI ES MANUAL
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilCampo();
			}
			
			//this.abrirFrameTreePerfilCampo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Perfil CampoS ?", "MANTENIMIENTO DE Perfil Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPerfilCampo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPerfilCampo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.perfilcampoReturnGeneral=perfilcampoLogic.procesarImportacionPerfilCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.perfilcampoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPerfilCampoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPerfilCampo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPerfilCampo.setFileImportacion(this.jInternalFrameImportacionPerfilCampo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPerfilCampo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPerfilCampo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPerfilCampo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPerfilCampo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		

		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PerfilCampoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PerfilCampoBaseDesign.jrxml";
			
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
			
			this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilCampoConstantesFunciones.LABEL_IDPERFIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Perfil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Perfil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Perfil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Perfil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_IDCAMPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Campo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Campo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Campo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Campo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_TODO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_do_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_do_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_do_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_do_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_INGRESO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_greso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_greso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_greso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_greso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_MODIFICACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_ELIMINACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_iminacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_iminacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_iminacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_iminacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_CONSULTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nsulta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nsulta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nsulta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nsulta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PerfilCampoConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPerfilCampo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PerfilCampoConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoria="id_perfil";
					break;

				case PerfilCampoConstantesFunciones.LABEL_IDCAMPO:
					sNombreCampoCategoria="id_campo";
					break;

				case PerfilCampoConstantesFunciones.LABEL_TODO:
					sNombreCampoCategoria="todo";
					break;

				case PerfilCampoConstantesFunciones.LABEL_INGRESO:
					sNombreCampoCategoria="ingreso";
					break;

				case PerfilCampoConstantesFunciones.LABEL_MODIFICACION:
					sNombreCampoCategoria="modificacion";
					break;

				case PerfilCampoConstantesFunciones.LABEL_ELIMINACION:
					sNombreCampoCategoria="eliminacion";
					break;

				case PerfilCampoConstantesFunciones.LABEL_CONSULTA:
					sNombreCampoCategoria="consulta";
					break;

				case PerfilCampoConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PerfilCampoConstantesFunciones.LABEL_IDPERFIL:
					sNombreCampoCategoriaValor="id_perfil";
					break;

				case PerfilCampoConstantesFunciones.LABEL_IDCAMPO:
					sNombreCampoCategoriaValor="id_campo";
					break;

				case PerfilCampoConstantesFunciones.LABEL_TODO:
					sNombreCampoCategoriaValor="todo";
					break;

				case PerfilCampoConstantesFunciones.LABEL_INGRESO:
					sNombreCampoCategoriaValor="ingreso";
					break;

				case PerfilCampoConstantesFunciones.LABEL_MODIFICACION:
					sNombreCampoCategoriaValor="modificacion";
					break;

				case PerfilCampoConstantesFunciones.LABEL_ELIMINACION:
					sNombreCampoCategoriaValor="eliminacion";
					break;

				case PerfilCampoConstantesFunciones.LABEL_CONSULTA:
					sNombreCampoCategoriaValor="consulta";
					break;

				case PerfilCampoConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PerfilCampoConstantesFunciones.LABEL_IDPERFIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Perfil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_perfil");
					break;

				case PerfilCampoConstantesFunciones.LABEL_IDCAMPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Campo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_campo");
					break;

				case PerfilCampoConstantesFunciones.LABEL_TODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Todo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"todo");
					break;

				case PerfilCampoConstantesFunciones.LABEL_INGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso");
					break;

				case PerfilCampoConstantesFunciones.LABEL_MODIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modificacion");
					break;

				case PerfilCampoConstantesFunciones.LABEL_ELIMINACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Eliminacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"eliminacion");
					break;

				case PerfilCampoConstantesFunciones.LABEL_CONSULTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Consulta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"consulta");
					break;

				case PerfilCampoConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
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
	
	public void jButtonGenerarExcelReporteDinamicoPerfilCampoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PerfilCampos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PerfilCampoConstantesFunciones.LABEL_IDPERFIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDPERFIL);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getperfil_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_IDCAMPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDCAMPO);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getcampo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_TODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_TODO);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.gettodo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_INGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_INGRESO);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getingreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_MODIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_MODIFICACION);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getmodificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_ELIMINACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ELIMINACION);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.geteliminacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_CONSULTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_CONSULTA);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getconsulta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PerfilCampoConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(PerfilCampo perfilcampo:perfilcamposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(perfilcampo.getestado());
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
			//	this.getFilaCabeceraExportarExcelPerfilCampo(row);				
			//	iRow++;
			//}				
			
			//for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPerfilCampo(perfilcampoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
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
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilCampo(false);
			
			//SI ES MANUAL
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPerfilCampo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilCampo(false);
			
			//SI ES MANUAL
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilCampo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPerfilCampoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPerfilCampo(false);
			
			//SI ES MANUAL
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPerfilCampo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPerfilCampo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPerfilCampo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPerfilCampo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPerfilCampo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPerfilCampo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPerfilCampo.setMinimumSize(dimensionMinimum);
		this.jTableDatosPerfilCampo.setMaximumSize(dimensionMaximum);
		this.jTableDatosPerfilCampo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPerfilCampo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPerfilCampo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPerfilCampo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPerfilCampo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPerfilCampo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPerfilCampo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilCampo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPerfilCampo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPerfilCampo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPerfilCampo();
		
		this.inicializarActualizarBindingBotonesManualPerfilCampo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilCampo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPerfilCampo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilCampo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilCampo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPerfilCampo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPerfilCampo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePerfilCampo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionNuevoPerfilCampo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionSinCerrarPerfilCampo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionSinMensajePerfilCampo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPerfilCampo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPerfilCampo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePerfilCampo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
				this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionNuevoPerfilCampo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionSinCerrarPerfilCampo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxPostAccionSinMensajePerfilCampo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPerfilCampo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPerfilCampo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPerfilCampo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPerfilCampo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPerfilCampo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPerfilCampo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPerfilCampo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPerfilCampo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPerfilCampo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPerfilCampo(Boolean esInicializar) throws Exception {
		try	{	
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPerfilCampo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPerfilCampo() throws Exception {
		try	{
			if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilCampo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilCampo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPerfilCampo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPerfilCampo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPerfilCampo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPerfilCampo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPerfilCampo.addItem(reporte);
			}
			
			
			if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPerfilCampo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPerfilCampo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPerfilCampo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPerfilCampo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPerfilCampo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPerfilCampo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPerfilCampo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilCampo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPerfilCampo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
				this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
				this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPerfilCampo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
				
				if(this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilCampo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPerfilCampo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPerfilCampo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPerfilCampo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPerfilCampo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_campoFK_IdCampoPerfilCampo.getSelectedItem()!=null){this.id_campoFK_IdCampo=((Campo)this.jComboBoxid_campoFK_IdCampoPerfilCampo.getSelectedItem()).getId();}
		if(this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.getSelectedItem()!=null){this.id_perfilFK_IdPerfil=((Perfil)this.jComboBoxid_perfilFK_IdPerfilPerfilCampo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPerfilCampo(Boolean esInicializar) throws Exception {				
		if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPerfilCampo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPerfilCampo() throws Exception {
		this.inicializarActualizarBindingTablaPerfilCampo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPerfilCampo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPerfilCampoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPerfilCampo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=perfilcampoLogic.getPerfilCampos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=perfilcampos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPerfilCampo.setModel(new PerfilCampoModel(this.perfilcampoLogic.getPerfilCampos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPerfilCampo.setModel(new PerfilCampoModel(this.perfilcampos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPerfilCampo!=null && this.jInternalFrameOrderByPerfilCampo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPerfilCampo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO,perfilcampoConstantesFunciones.resaltarSeleccionarPerfilCampo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PerfilCampoConstantesFunciones.SCLASSWEBTITULO,perfilcampoConstantesFunciones.resaltarSeleccionarPerfilCampo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_ID));

		if(this.perfilcampoConstantesFunciones.mostraridPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.perfilcampoConstantesFunciones.resaltaridPerfilCampo,this.perfilcampoConstantesFunciones.activaridPerfilCampo,this,true,"idPerfilCampo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.perfilcampoConstantesFunciones.resaltaridPerfilCampo,this.perfilcampoConstantesFunciones.activaridPerfilCampo,this,true,"idPerfilCampo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_IDPERFIL));

		if(this.perfilcampoConstantesFunciones.mostrarid_perfilPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_IDPERFIL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PerfilTableCell(this.perfilsForeignKey,this.perfilcampoConstantesFunciones.resaltarid_perfilPerfilCampo,this,this.perfilcampoConstantesFunciones.activarid_perfilPerfilCampo));
			tableColumn.setCellEditor(new PerfilTableCell(this.perfilsForeignKey,this.perfilcampoConstantesFunciones.resaltarid_perfilPerfilCampo,this,this.perfilcampoConstantesFunciones.activarid_perfilPerfilCampo,true,"id_perfilPerfilCampo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_IDCAMPO));

		if(this.perfilcampoConstantesFunciones.mostrarid_campoPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_IDCAMPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CampoTableCell(this.camposForeignKey,this.perfilcampoConstantesFunciones.resaltarid_campoPerfilCampo,this,this.perfilcampoConstantesFunciones.activarid_campoPerfilCampo));
			tableColumn.setCellEditor(new CampoTableCell(this.camposForeignKey,this.perfilcampoConstantesFunciones.resaltarid_campoPerfilCampo,this,this.perfilcampoConstantesFunciones.activarid_campoPerfilCampo,true,"id_campoPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_TODO));

		if(this.perfilcampoConstantesFunciones.mostrartodoPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_TODO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltartodoPerfilCampo,this.perfilcampoConstantesFunciones.activartodoPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltartodoPerfilCampo,this.perfilcampoConstantesFunciones.activartodoPerfilCampo,this,true,"todoPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_INGRESO));

		if(this.perfilcampoConstantesFunciones.mostraringresoPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_INGRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltaringresoPerfilCampo,this.perfilcampoConstantesFunciones.activaringresoPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltaringresoPerfilCampo,this.perfilcampoConstantesFunciones.activaringresoPerfilCampo,this,true,"ingresoPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_MODIFICACION));

		if(this.perfilcampoConstantesFunciones.mostrarmodificacionPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_MODIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltarmodificacionPerfilCampo,this.perfilcampoConstantesFunciones.activarmodificacionPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltarmodificacionPerfilCampo,this.perfilcampoConstantesFunciones.activarmodificacionPerfilCampo,this,true,"modificacionPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_ELIMINACION));

		if(this.perfilcampoConstantesFunciones.mostrareliminacionPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_ELIMINACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltareliminacionPerfilCampo,this.perfilcampoConstantesFunciones.activareliminacionPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltareliminacionPerfilCampo,this.perfilcampoConstantesFunciones.activareliminacionPerfilCampo,this,true,"eliminacionPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_CONSULTA));

		if(this.perfilcampoConstantesFunciones.mostrarconsultaPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_CONSULTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltarconsultaPerfilCampo,this.perfilcampoConstantesFunciones.activarconsultaPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltarconsultaPerfilCampo,this.perfilcampoConstantesFunciones.activarconsultaPerfilCampo,this,true,"consultaPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,PerfilCampoConstantesFunciones.LABEL_ESTADO));

		if(this.perfilcampoConstantesFunciones.mostrarestadoPerfilCampo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PerfilCampoConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.perfilcampoConstantesFunciones.resaltarestadoPerfilCampo,this.perfilcampoConstantesFunciones.activarestadoPerfilCampo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.perfilcampoConstantesFunciones.resaltarestadoPerfilCampo,this.perfilcampoConstantesFunciones.activarestadoPerfilCampo,this,true,"estadoPerfilCampo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PerfilCampoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilCampo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPerfilCampo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.perfilcampoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPerfilCampo.addColumn(tableColumn);
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
			
			this.jTableDatosPerfilCampo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPerfilCampo.moveColumn(this.jTableDatosPerfilCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPerfilCampo.moveColumn(this.jTableDatosPerfilCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPerfilCampo.moveColumn(this.jTableDatosPerfilCampo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPerfilCampo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPerfilCampo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPerfilCampo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPerfilCampo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPerfilCampo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPerfilCampo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPerfilCampo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPerfilCampo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=perfilcampoLogic.getPerfilCampos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=perfilcampos.size()-1;
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
		//this.jTableDatosPerfilCampo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPerfilCampo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPerfilCampo();
			
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
				
				//this.isEsNuevoPerfilCampo=false;
					
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
				if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPerfilCampo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilCampo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilCampo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.perfilcampo.getsType().equals("DUPLICADO")
				   || this.perfilcampo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPerfilCampo=true;
				
				} else {
					this.isEsNuevoPerfilCampo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					if(this.perfilcampo.getId()>=0 && !this.perfilcampo.getIsNew()) {						
						this.isEsNuevoPerfilCampo=false;
						
					} else {
						this.isEsNuevoPerfilCampo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPerfilCampo(esRelaciones);						
				
				this.seleccionarPerfilCampo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.perfilcampo.getId()<0) {
					this.isEsNuevoPerfilCampo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPerfilCampo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPerfilCampo(evt,rowIndex);
				}	
				
				if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PerfilCampo: " + this.dDif); 
					}
				}								
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPerfilCampo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.perfilcampo)) {
					if(this.perfilcampo.getId()>0) {
						this.perfilcampo.setIsDeleted(true);
						
						this.perfilcamposEliminados.add(this.perfilcampo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.perfilcampoLogic.getPerfilCampos().remove(this.perfilcampo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.perfilcampos.remove(this.perfilcampo);				
					}
					
					
					((PerfilCampoModel) this.jTableDatosPerfilCampo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPerfilCampo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPerfilCampo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPerfilCampo) {
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPerfilCampo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPerfilCampo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPerfilCampo(this.perfilcampo);
				}
				
				//ARCHITECTURE
				try {
					

					//Perfil
					if(!this.perfilcampoConstantesFunciones.cargarid_perfilPerfilCampo || this.perfilcampoConstantesFunciones.event_dependid_perfilPerfilCampo) {
						//this.cargarCombosPerfilsForeignKeyLista(" where id="+this.perfilcampo.getid_perfil());
									//this.inicializarActualizarBindingPerfilCampo(false,false);
						this.perfilsForeignKey=new ArrayList<Perfil>();

						if(perfilcampo.getPerfil()!=null) {
							this.perfilsForeignKey.add(perfilcampo.getPerfil());
						}

						this.addItemDefectoCombosForeignKeyPerfil();
						this.cargarCombosFramePerfilsForeignKey("Todos");
					}
					this.setActualPerfilForeignKey(this.perfilcampo.getid_perfil(),false,"Formulario");

					//Campo
					if(!this.perfilcampoConstantesFunciones.cargarid_campoPerfilCampo || this.perfilcampoConstantesFunciones.event_dependid_campoPerfilCampo) {
						//this.cargarCombosCamposForeignKeyLista(" where id="+this.perfilcampo.getid_campo());
									//this.inicializarActualizarBindingPerfilCampo(false,false);
						this.camposForeignKey=new ArrayList<Campo>();

						if(perfilcampo.getCampo()!=null) {
							this.camposForeignKey.add(perfilcampo.getCampo());
						}

						this.addItemDefectoCombosForeignKeyCampo();
						this.cargarCombosFrameCamposForeignKey("Todos");
					}
					this.setActualCampoForeignKey(this.perfilcampo.getid_campo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPerfilCampo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPerfilCampo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPerfilCampo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilCampo(PerfilCampo perfilcampo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPerfilCampo(perfilcampo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPerfilCampo(PerfilCampo perfilcampo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPerfilCampo(perfilcampo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPerfilCampo(perfilcampo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPerfilCampo(perfilcampo);
	}
	
	public void setVariablesObjetoActualToFormularioPerfilCampo(PerfilCampo perfilcampo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setText(perfilcampo.getId().toString());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setSelected(perfilcampo.gettodo());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setSelected(perfilcampo.getingreso());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setSelected(perfilcampo.getmodificacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setSelected(perfilcampo.geteliminacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setSelected(perfilcampo.getconsulta());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setSelected(perfilcampo.getestado());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PerfilCampo perfilcampoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,perfilcampoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PerfilCampo perfilcampoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				perfilcampoLocal=this.perfilcampo;
			} else {
				perfilcampoLocal=this.perfilcampoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(perfilcampoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPerfilCampo(perfilcampoLocal,true);
					
					if(perfilcampoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(perfilcampoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(perfilcampoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPerfilCampo(PerfilCampo perfilcampo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilCampo(perfilcampo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(perfilcampo);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilCampo(PerfilCampo perfilcampo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPerfilCampo(perfilcampo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPerfilCampo(PerfilCampo perfilcampo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.getText()==null || this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.getText()=="" || this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.getText()=="Id") {
				this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setText("0");
			}

			if(conColumnasBase) {perfilcampo.setId(Long.parseLong(this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelIdPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.settodo(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_TODO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabeltodoPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.setingreso(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_INGRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelingresoPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.setmodificacion(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_MODIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelmodificacionPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.seteliminacion(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_ELIMINACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabeleliminacionPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.setconsulta(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_CONSULTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelconsultaPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			perfilcampo.setestado(this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PerfilCampoConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPerfilCampo.jLabelestadoPerfilCampo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPerfilCampo(PerfilCampo perfilcampoBean,PerfilCampo perfilcampo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && perfilcampoBean.getid_perfil()!=null && !perfilcampoBean.getid_perfil().equals(-1L))) {perfilcampo.setid_perfil(perfilcampoBean.getid_perfil());}
			if(conDefault || (!conDefault && perfilcampoBean.getid_campo()!=null && !perfilcampoBean.getid_campo().equals(-1L))) {perfilcampo.setid_campo(perfilcampoBean.getid_campo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPerfilCampo(PerfilCampo perfilcampoOrigen,PerfilCampo perfilcampo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilcampoOrigen.getId()!=null && !perfilcampoOrigen.getId().equals(0L))) {perfilcampo.setId(perfilcampoOrigen.getId());}}
			if(conDefault || (!conDefault && perfilcampoOrigen.getid_perfil()!=null && !perfilcampoOrigen.getid_perfil().equals(-1L))) {perfilcampo.setid_perfil(perfilcampoOrigen.getid_perfil());}
			if(conDefault || (!conDefault && perfilcampoOrigen.getid_campo()!=null && !perfilcampoOrigen.getid_campo().equals(-1L))) {perfilcampo.setid_campo(perfilcampoOrigen.getid_campo());}
			if(conDefault || (!conDefault && perfilcampoOrigen.gettodo()!=null && !perfilcampoOrigen.gettodo().equals(false))) {perfilcampo.settodo(perfilcampoOrigen.gettodo());}
			if(conDefault || (!conDefault && perfilcampoOrigen.getingreso()!=null && !perfilcampoOrigen.getingreso().equals(false))) {perfilcampo.setingreso(perfilcampoOrigen.getingreso());}
			if(conDefault || (!conDefault && perfilcampoOrigen.getmodificacion()!=null && !perfilcampoOrigen.getmodificacion().equals(false))) {perfilcampo.setmodificacion(perfilcampoOrigen.getmodificacion());}
			if(conDefault || (!conDefault && perfilcampoOrigen.geteliminacion()!=null && !perfilcampoOrigen.geteliminacion().equals(false))) {perfilcampo.seteliminacion(perfilcampoOrigen.geteliminacion());}
			if(conDefault || (!conDefault && perfilcampoOrigen.getconsulta()!=null && !perfilcampoOrigen.getconsulta().equals(false))) {perfilcampo.setconsulta(perfilcampoOrigen.getconsulta());}
			if(conDefault || (!conDefault && perfilcampoOrigen.getestado()!=null && !perfilcampoOrigen.getestado().equals(false))) {perfilcampo.setestado(perfilcampoOrigen.getestado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilCampo(PerfilCampo perfilcampo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setText(perfilcampo.getId().toString());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setSelected(perfilcampo.gettodo());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setSelected(perfilcampo.getingreso());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setSelected(perfilcampo.getmodificacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setSelected(perfilcampo.geteliminacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setSelected(perfilcampo.getconsulta());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setSelected(perfilcampo.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPerfilCampo(PerfilCampoBean perfilcampoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setText(perfilcampoBean.getId().toString());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setSelected(perfilcampoBean.gettodo());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setSelected(perfilcampoBean.getingreso());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setSelected(perfilcampoBean.getmodificacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setSelected(perfilcampoBean.geteliminacion());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setSelected(perfilcampoBean.getconsulta());
			this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setSelected(perfilcampoBean.getestado());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPerfilCampo(PerfilCampoParameterReturnGeneral perfilcampoReturnGeneral,PerfilCampoBean perfilcampoBean,Boolean conDefault) throws Exception { 
		try {
			PerfilCampo perfilcampoLocal=new PerfilCampo();
			
			perfilcampoLocal=perfilcampoReturnGeneral.getPerfilCampo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && perfilcampoLocal.getId()!=null && !perfilcampoLocal.getId().equals(0L))) {perfilcampoBean.setId(perfilcampoLocal.getId());}}
			if(conDefault || (!conDefault && perfilcampoLocal.getid_perfil()!=null && !perfilcampoLocal.getid_perfil().equals(-1L))) {perfilcampoBean.setid_perfil(perfilcampoLocal.getid_perfil());}
			if(conDefault || (!conDefault && perfilcampoLocal.getid_campo()!=null && !perfilcampoLocal.getid_campo().equals(-1L))) {perfilcampoBean.setid_campo(perfilcampoLocal.getid_campo());}
			if(conDefault || (!conDefault && perfilcampoLocal.gettodo()!=null && !perfilcampoLocal.gettodo().equals(false))) {perfilcampoBean.settodo(perfilcampoLocal.gettodo());}
			if(conDefault || (!conDefault && perfilcampoLocal.getingreso()!=null && !perfilcampoLocal.getingreso().equals(false))) {perfilcampoBean.setingreso(perfilcampoLocal.getingreso());}
			if(conDefault || (!conDefault && perfilcampoLocal.getmodificacion()!=null && !perfilcampoLocal.getmodificacion().equals(false))) {perfilcampoBean.setmodificacion(perfilcampoLocal.getmodificacion());}
			if(conDefault || (!conDefault && perfilcampoLocal.geteliminacion()!=null && !perfilcampoLocal.geteliminacion().equals(false))) {perfilcampoBean.seteliminacion(perfilcampoLocal.geteliminacion());}
			if(conDefault || (!conDefault && perfilcampoLocal.getconsulta()!=null && !perfilcampoLocal.getconsulta().equals(false))) {perfilcampoBean.setconsulta(perfilcampoLocal.getconsulta());}
			if(conDefault || (!conDefault && perfilcampoLocal.getestado()!=null && !perfilcampoLocal.getestado().equals(false))) {perfilcampoBean.setestado(perfilcampoLocal.getestado());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPerfilCampoGenerico(Long idPerfilCampoSeleccionado,JComboBox jComboBoxPerfilCampo,List<PerfilCampo> perfilcamposLocal)throws Exception {
		try {
			PerfilCampo  perfilcampoTemp=null;

			for(PerfilCampo perfilcampoAux:perfilcamposLocal) {
				if(perfilcampoAux.getId()!=null && perfilcampoAux.getId().equals(idPerfilCampoSeleccionado)) {
					perfilcampoTemp=perfilcampoAux;
					break;
				}
			}

			jComboBoxPerfilCampo.setSelectedItem(perfilcampoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPerfilCampoGenerico(JComboBox jComboBoxPerfilCampo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilCampo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPerfilCampo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPerfilCampo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPerfilCampo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPerfilCampo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPerfilCampo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilcampo=(PerfilCampo) perfilcampoLogic.getPerfilCampos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilcampo =(PerfilCampo) perfilcampos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Perfil")) {
			//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
			if(!perfilcampo.getIsNew() && !perfilcampo.getIsChanged() && !perfilcampo.getIsDeleted()) {
				sDescripcion=perfilcampo.getperfil_descripcion();
			} else {
				//sDescripcion=this.getActualPerfilForeignKeyDescripcion((Long)value);
				sDescripcion=perfilcampo.getperfil_descripcion();
			}
		}

		if(sTipo.equals("Campo")) {
			//sDescripcion=this.getActualCampoForeignKeyDescripcion((Long)value);
			if(!perfilcampo.getIsNew() && !perfilcampo.getIsChanged() && !perfilcampo.getIsDeleted()) {
				sDescripcion=perfilcampo.getcampo_descripcion();
			} else {
				//sDescripcion=this.getActualCampoForeignKeyDescripcion((Long)value);
				sDescripcion=perfilcampo.getcampo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PerfilCampo perfilcampoRow=new PerfilCampo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilcampoRow=(PerfilCampo) perfilcampoLogic.getPerfilCampos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			perfilcampoRow=(PerfilCampo) perfilcampos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPerfilCampo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo));			
			this.jButtonDuplicarPerfilCampo.setVisible((this.isVisibilidadCeldaDuplicarPerfilCampo && this.isPermisoDuplicarPerfilCampo));			
			this.jButtonCopiarPerfilCampo.setVisible((this.isVisibilidadCeldaCopiarPerfilCampo && this.isPermisoCopiarPerfilCampo));
			this.jButtonVerFormPerfilCampo.setVisible((this.isVisibilidadCeldaVerFormPerfilCampo && this.isPermisoVerFormPerfilCampo));
			
			this.jButtonAbrirOrderByPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));			
			
			this.jButtonNuevoRelacionesPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilCampo && this.isPermisoNuevoPerfilCampo));			
			this.jButtonNuevoGuardarCambiosPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarPerfilCampo.setVisible((this.isVisibilidadCeldaModificarPerfilCampo && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.setVisible((this.isVisibilidadCeldaActualizarPerfilCampo && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.setVisible((this.isVisibilidadCeldaEliminarPerfilCampo && this.isPermisoEliminarPerfilCampo));
			this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.setVisible(this.isVisibilidadCeldaCancelarPerfilCampo);							
			this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));			
			
			}
						
			this.jButtonGuardarCambiosTablaPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo));						
			this.jButtonDuplicarToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaDuplicarPerfilCampo && this.isPermisoDuplicarPerfilCampo));						
			this.jButtonCopiarToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaCopiarPerfilCampo && this.isPermisoCopiarPerfilCampo));			
			this.jButtonVerFormToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaVerFormPerfilCampo && this.isPermisoVerFormPerfilCampo));			
			this.jButtonAbrirOrderByToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));
			this.jButtonNuevoRelacionesToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilCampo && this.isPermisoNuevoPerfilCampo));			
			this.jButtonNuevoGuardarCambiosToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));			
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaModificarPerfilCampo && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaActualizarPerfilCampo  && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaEliminarPerfilCampo && this.isPermisoEliminarPerfilCampo));
			this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarToolBarPerfilCampo.setVisible(this.isVisibilidadCeldaCancelarPerfilCampo);				
			this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo));			
			this.jMenuItemDuplicarPerfilCampo.setVisible((this.isVisibilidadCeldaDuplicarPerfilCampo && this.isPermisoDuplicarPerfilCampo));			
			this.jMenuItemCopiarPerfilCampo.setVisible((this.isVisibilidadCeldaCopiarPerfilCampo && this.isPermisoCopiarPerfilCampo));			
			this.jMenuItemVerFormPerfilCampo.setVisible((this.isVisibilidadCeldaVerFormPerfilCampo && this.isPermisoVerFormPerfilCampo));			
			this.jMenuItemAbrirOrderByPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));			
			//this.jMenuItemMostrarOcultarPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));
			this.jMenuItemDetalleAbrirOrderByPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));			
			//this.jMenuItemDetalleMostrarOcultarPerfilCampo.setVisible((this.isVisibilidadCeldaOrdenPerfilCampo && this.isPermisoOrdenPerfilCampo));			
			this.jMenuItemNuevoRelacionesPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoRelacionesPerfilCampo && this.isPermisoNuevoPerfilCampo));			
			this.jMenuItemNuevoGuardarCambiosPerfilCampo.setVisible((this.isVisibilidadCeldaNuevoPerfilCampo && this.isPermisoNuevoPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));									
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemModificarPerfilCampo.setVisible((this.isVisibilidadCeldaModificarPerfilCampo && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemActualizarPerfilCampo.setVisible((this.isVisibilidadCeldaActualizarPerfilCampo && this.isPermisoActualizarPerfilCampo));	
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemEliminarPerfilCampo.setVisible((this.isVisibilidadCeldaEliminarPerfilCampo && this.isPermisoEliminarPerfilCampo));
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemCancelarPerfilCampo.setVisible(this.isVisibilidadCeldaCancelarPerfilCampo);				
			}
			
			this.jMenuItemGuardarCambiosPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));						
			this.jMenuItemGuardarCambiosTablaPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarCambiosPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPerfilCampo=this.jButtonNuevoPerfilCampo.isVisible();
			this.isVisibilidadCeldaDuplicarPerfilCampo=this.jButtonDuplicarPerfilCampo.isVisible();
			this.isVisibilidadCeldaCopiarPerfilCampo=this.jButtonCopiarPerfilCampo.isVisible();
			this.isVisibilidadCeldaVerFormPerfilCampo=this.jButtonVerFormPerfilCampo.isVisible();
			
			this.isVisibilidadCeldaOrdenPerfilCampo=this.jButtonAbrirOrderByPerfilCampo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=this.jButtonNuevoRelacionesPerfilCampo.isVisible();
			this.isVisibilidadCeldaModificarPerfilCampo=this.jButtonModificarPerfilCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.isVisibilidadCeldaActualizarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.isVisible();
			this.isVisibilidadCeldaEliminarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.isVisible();
			this.isVisibilidadCeldaCancelarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.isVisible();
			this.isVisibilidadCeldaGuardarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=this.jButtonGuardarCambiosTablaPerfilCampo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPerfilCampo=this.jButtonNuevoToolBarPerfilCampo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=this.jButtonNuevoRelacionesToolBarPerfilCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.isVisibilidadCeldaModificarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarToolBarPerfilCampo.isVisible();
			this.isVisibilidadCeldaActualizarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarToolBarPerfilCampo.isVisible();
			this.isVisibilidadCeldaEliminarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarToolBarPerfilCampo.isVisible();
			this.isVisibilidadCeldaCancelarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarToolBarPerfilCampo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilCampo=this.jButtonGuardarCambiosToolBarPerfilCampo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=this.jButtonGuardarCambiosTablaToolBarPerfilCampo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPerfilCampo=this.jMenuItemNuevoPerfilCampo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=this.jMenuItemNuevoRelacionesPerfilCampo.isVisible();
			
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.isVisibilidadCeldaModificarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jMenuItemModificarPerfilCampo.isVisible();
			this.isVisibilidadCeldaActualizarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jMenuItemActualizarPerfilCampo.isVisible();
			this.isVisibilidadCeldaEliminarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jMenuItemEliminarPerfilCampo.isVisible();
			this.isVisibilidadCeldaCancelarPerfilCampo=this.jInternalFrameDetalleFormPerfilCampo.jMenuItemCancelarPerfilCampo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPerfilCampo=this.jMenuItemGuardarCambiosPerfilCampo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=this.jMenuItemGuardarCambiosTablaPerfilCampo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPerfilCampo(Boolean esInicializar) {
		if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
				//if(this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilCampo();
			}
			
			this.inicializarActualizarBindingBotonesManualPerfilCampo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPerfilCampo() {
		this.jButtonNuevoPerfilCampo.setVisible(this.isPermisoNuevoPerfilCampo);			
		this.jButtonDuplicarPerfilCampo.setVisible(this.isPermisoDuplicarPerfilCampo);			
		this.jButtonCopiarPerfilCampo.setVisible(this.isPermisoCopiarPerfilCampo);			
		this.jButtonVerFormPerfilCampo.setVisible(this.isPermisoVerFormPerfilCampo);			
		
		this.jButtonAbrirOrderByPerfilCampo.setVisible(this.isPermisoOrdenPerfilCampo);					
		
		this.jButtonNuevoRelacionesPerfilCampo.setVisible(this.isPermisoNuevoPerfilCampo);			
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarPerfilCampo.setVisible(this.isPermisoActualizarPerfilCampo);	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.setVisible(this.isPermisoActualizarPerfilCampo);	
			this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.setVisible(this.isPermisoEliminarPerfilCampo);
			this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.setVisible(this.isVisibilidadCeldaCancelarPerfilCampo);						
			this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.setVisible(this.isPermisoGuardarCambiosPerfilCampo);							
		}
		
		this.jButtonGuardarCambiosTablaPerfilCampo.setVisible(this.isPermisoActualizarPerfilCampo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilCampo() {
		this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarPerfilCampo.setVisible(this.isPermisoActualizarPerfilCampo);	
		this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.setVisible(this.isPermisoActualizarPerfilCampo);	
		this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.setVisible(this.isPermisoEliminarPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.setVisible(this.isVisibilidadCeldaCancelarPerfilCampo);							
		this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.setVisible((this.isVisibilidadCeldaGuardarPerfilCampo && this.isPermisoGuardarCambiosPerfilCampo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPerfilCampo() {
		if(PerfilCampoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPerfilCampo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPerfilCampo() {
	}
	
	public void jTableDatosPerfilCampoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPerfilCampo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.perfilcampo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_perfilPerfilCampoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.perfilBeanSwingJInternalFrame.sTipoBusqueda="Perfil";

			if(!this.sFinalQueryGeneral_perfil.equals("")) {
				this.perfilBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_perfil);
				this.perfilBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.perfilBeanSwingJInternalFrame.procesarBusqueda(this.perfilBeanSwingJInternalFrame.sAccionBusqueda);
				this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingPerfil(false);
			}

			if(!this.sFinalQueryComboPerfil.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderPerfilCampo=null;
			TitledBorder titledBorderperfil=null;

			if(!this.jScrollPanelDatosPerfilCampo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPerfilCampo=(TitledBorder)this.jScrollPanelDatosPerfilCampo.getBorder();
				titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilCampo.getTitle() + " -> Perfil");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_perfilPerfilCampoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperfil=true;

			idTienePermisoperfil=this.tienePermisosUsuarioEnPaginaWebPerfilCampo(PerfilConstantesFunciones.CLASSNAME);

			if(idTienePermisoperfil) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilCampo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilCampo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);

				this.perfilBeanSwingJInternalFrame=new PerfilBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.perfilBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.perfilBeanSwingJInternalFrame.getPerfilLogic().setConnexion(this.perfilcampoLogic.getConnexion());

				if(this.perfilcampo.getid_perfil()!=null) {
					this.perfilBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.perfilBeanSwingJInternalFrame.setIdActual(this.perfilcampo.getid_perfil());
					this.perfilBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.perfilBeanSwingJInternalFrame.inicializarActualizarBindingTablaPerfil();
				}

				JInternalFrameBase jinternalFrame =this.perfilBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilCampo=(TitledBorder)this.jScrollPanelDatosPerfilCampo.getBorder();
				TitledBorder titledBorderperfil=(TitledBorder)this.perfilBeanSwingJInternalFrame.jScrollPanelDatosPerfil.getBorder();

				titledBorderperfil.setTitle(titledBorderPerfilCampo.getTitle() + " -> Perfil");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_perfilPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getid_perfil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_perfil = "+this.perfilcampo.getid_perfil().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_campoPerfilCampoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocampo=true;

			idTienePermisocampo=this.tienePermisosUsuarioEnPaginaWebPerfilCampo(CampoConstantesFunciones.CLASSNAME);

			if(idTienePermisocampo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPerfilCampo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPerfilCampo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);

				this.campoBeanSwingJInternalFrame=new CampoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.campoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.campoBeanSwingJInternalFrame.getCampoLogic().setConnexion(this.perfilcampoLogic.getConnexion());

				if(this.perfilcampo.getid_campo()!=null) {
					this.campoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.campoBeanSwingJInternalFrame.setIdActual(this.perfilcampo.getid_campo());
					this.campoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.campoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.campoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCampo();
				}

				JInternalFrameBase jinternalFrame =this.campoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPerfilCampo=(TitledBorder)this.jScrollPanelDatosPerfilCampo.getBorder();
				TitledBorder titledBordercampo=(TitledBorder)this.campoBeanSwingJInternalFrame.jScrollPanelDatosCampo.getBorder();

				titledBordercampo.setTitle(titledBorderPerfilCampo.getTitle() + " -> Campo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_campoPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getid_campo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_campo = "+this.perfilcampo.getid_campo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontodoPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.gettodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where todo = "+this.perfilcampo.gettodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresoPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso = "+this.perfilcampo.getingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodificacionPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getmodificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modificacion = "+this.perfilcampo.getmodificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoneliminacionPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.geteliminacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where eliminacion = "+this.perfilcampo.geteliminacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconsultaPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getconsulta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where consulta = "+this.perfilcampo.getconsulta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoPerfilCampoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.getperfilcampo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.perfilcampo==null) {
						this.perfilcampo = new PerfilCampo();
					}

					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);
				}

				if(this.perfilcampo.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado = "+this.perfilcampo.getestado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPerfilCampo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCampoPerfilCampoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilCampo(false,false);

			this.getPerfilCamposFK_IdCampo();

			this.inicializarActualizarBindingPerfilCampo(false);

			//if(PerfilCampoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilCampo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPerfilPerfilCampoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPerfilCampo(false,false);

			this.getPerfilCamposFK_IdPerfil();

			this.inicializarActualizarBindingPerfilCampo(false);

			//if(PerfilCampoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPerfilCampo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.perfilcampoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePerfilCampo() {
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
			this.jInternalFrameDetalleFormPerfilCampo.setVisible(false);	    			
			this.jInternalFrameDetalleFormPerfilCampo.dispose();
			this.jInternalFrameDetalleFormPerfilCampo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
			this.jInternalFrameReporteDinamicoPerfilCampo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPerfilCampo.dispose();
			this.jInternalFrameReporteDinamicoPerfilCampo=null;
		}
		
		if(this.jInternalFrameImportacionPerfilCampo!=null) {
			this.jInternalFrameImportacionPerfilCampo.setVisible(false);	    			
			this.jInternalFrameImportacionPerfilCampo.dispose();
			this.jInternalFrameImportacionPerfilCampo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPerfilCampo();
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPerfilCampo")) {
				jButtonDuplicarPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPerfilCampo")) {
				jButtonCopiarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPerfilCampo")) {
				jButtonVerFormPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPerfilCampo")) {
				jButtonDuplicarPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPerfilCampo")) {
				jButtonDuplicarPerfilCampoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPerfilCampo")) {
				jButtonModificarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPerfilCampo")) {
				jButtonModificarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPerfilCampo")) {
				jButtonModificarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPerfilCampo")) {
				jButtonActualizarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPerfilCampo")) {
				jButtonActualizarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPerfilCampo")) {
				jButtonActualizarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPerfilCampo")) {
				jButtonEliminarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPerfilCampo")) {
				jButtonEliminarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPerfilCampo")) {
				jButtonEliminarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPerfilCampo")) {
				jButtonCancelarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPerfilCampo")) {
				jButtonCancelarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPerfilCampo")) {
				jButtonCancelarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPerfilCampo")) {
				jButtonCerrarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPerfilCampo")) {
				jButtonCerrarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPerfilCampo")) {
				jButtonCerrarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPerfilCampo")) {
				jButtonMostrarOcultarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPerfilCampo")) {
				jButtonCancelarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPerfilCampo")) {
				jButtonCopiarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPerfilCampo")) {
				jButtonVerFormPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPerfilCampo")) {
				jButtonCopiarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPerfilCampo")) {
				jButtonVerFormPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPerfilCampo")) {
				jButtonRecargarInformacionPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPerfilCampo")) {
				jButtonRecargarInformacionPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPerfilCampo")) {
				jButtonRecargarInformacionPerfilCampoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPerfilCampo")) {
				jButtonAnterioresPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPerfilCampo")) {
				jButtonAnterioresPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePerfilCampo")) {
				jButtonAnterioresPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPerfilCampo")) {
				jButtonSiguientesPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPerfilCampo")) {
				jButtonSiguientesPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPerfilCampo")) {
				jButtonSiguientesPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPerfilCampo") || sTipo.equals("MenuItemDetalleAbrirOrderByPerfilCampo")) {
				jButtonAbrirOrderByPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPerfilCampo") || sTipo.equals("MenuItemDetalleMostrarOcultarPerfilCampo")) {
				jButtonMostrarOcultarPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilCampo")) {
				jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPerfilCampo")) {
				jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPerfilCampo")) {
				jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPerfilCampo")) {
				jButtonCerrarReporteDinamicoPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPerfilCampo")) {
				jButtonGenerarReporteDinamicoPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPerfilCampo")) {
				
				jButtonGenerarExcelReporteDinamicoPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPerfilCampo")) {
				jButtonCerrarImportacionPerfilCampoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPerfilCampo")) {
				
				jButtonGenerarImportacionPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPerfilCampo")) {
				
				jButtonAbrirImportacionPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPerfilCampo")) {
				jComboBoxTiposAccionesPerfilCampoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPerfilCampo")) {
				jComboBoxTiposRelacionesPerfilCampoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPerfilCampo")) {
				jComboBoxTiposAccionesPerfilCampoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPerfilCampo")) {
				
				jComboBoxTiposSeleccionarPerfilCampoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPerfilCampo")) {
				jTextFieldValorCampoGeneralPerfilCampoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPerfilCampo")) {
				jButtonAbrirOrderByPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPerfilCampo")) {
				jButtonAbrirOrderByPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPerfilCampo")) {
				jButtonCerrarOrderByPerfilCampoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilCampoBusqueda")) {
				this.jButtonidPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_perfilPerfilCampo")) {
				this.jButtonid_perfilPerfilCampoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilCampoUpdate")) {
				this.jButtonid_perfilPerfilCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilCampoBusqueda")) {
				this.jButtonid_perfilPerfilCampoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_campoPerfilCampoUpdate")) {
				this.jButtonid_campoPerfilCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_campoPerfilCampoBusqueda")) {
				this.jButtonid_campoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("todoPerfilCampoBusqueda")) {
				this.jButtontodoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresoPerfilCampoBusqueda")) {
				this.jButtoningresoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modificacionPerfilCampoBusqueda")) {
				this.jButtonmodificacionPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eliminacionPerfilCampoBusqueda")) {
				this.jButtoneliminacionPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consultaPerfilCampoBusqueda")) {
				this.jButtonconsultaPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilCampoBusqueda")) {
				this.jButtonestadoPerfilCampoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_perfilPerfilCampo")) {
				this.jButtonid_perfilPerfilCampoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCampoPerfilCampo")) {
				this.jButtonFK_IdCampoPerfilCampoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPerfilPerfilCampo")) {
				this.jButtonFK_IdPerfilPerfilCampoActionPerformed(evt);
			}
			
			;
			
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPerfilCampo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PerfilCampo perfilcampoLocal=null;
			
			if(!this.getEsControlTabla()) {
				perfilcampoLocal=this.perfilcampo;
			} else {
				perfilcampoLocal=this.perfilcampoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
							
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
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
			
			


			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
								
						
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
								
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
							
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
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
			
			


			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
								
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPerfilCampo")) {
					jCheckBoxSeleccionarTodosPerfilCampoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPerfilCampo")) {
					jCheckBoxSeleccionadosPerfilCampoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPerfilCampo")) {
					
				}
				
				


				
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
												
				
				


				
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
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
			
			


			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPerfilCampoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.perfilcampo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.perfilcampo);
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
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
				
				


				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PerfilCampo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PerfilCampo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPerfilCampoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.perfilcampoAnterior =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPerfilCampo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPerfilCampoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPerfilCampo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.perfilcampo =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.perfilcampo =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.perfilcampo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPerfilCampo")) {
				
				}
				
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPerfilCampo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPerfilCampo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPerfilCampo")) {
			
			}
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPerfilCampo();
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			if(sTipo.equals("NuevoPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPerfilCampo")) {
				jButtonDuplicarPerfilCampoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPerfilCampo")) {
				jButtonCopiarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPerfilCampo")) {
				jButtonVerFormPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPerfilCampo")) {
				jButtonNuevoPerfilCampoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPerfilCampo")) {
				jButtonModificarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPerfilCampo")) {
				jButtonActualizarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPerfilCampo")) {
				jButtonEliminarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPerfilCampo")) {
				jButtonCancelarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPerfilCampo")) {
				jButtonCerrarPerfilCampoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPerfilCampo")) {
				jButtonGuardarCambiosPerfilCampoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPerfilCampo")) {
				jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPerfilCampo")) {
				jButtonAbrirOrderByPerfilCampoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPerfilCampo")) {
				jButtonRecargarInformacionPerfilCampoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPerfilCampo")) {
				jButtonAnterioresPerfilCampoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPerfilCampo")) {
				jButtonSiguientesPerfilCampoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPerfilCampoBusqueda")) {
				this.jButtonidPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_perfilPerfilCampo")) {
				this.jButtonid_perfilPerfilCampoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_perfilPerfilCampoUpdate")) {
				this.jButtonid_perfilPerfilCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_perfilPerfilCampoBusqueda")) {
				this.jButtonid_perfilPerfilCampoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_campoPerfilCampoUpdate")) {
				this.jButtonid_campoPerfilCampoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_campoPerfilCampoBusqueda")) {
				this.jButtonid_campoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("todoPerfilCampoBusqueda")) {
				this.jButtontodoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresoPerfilCampoBusqueda")) {
				this.jButtoningresoPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modificacionPerfilCampoBusqueda")) {
				this.jButtonmodificacionPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("eliminacionPerfilCampoBusqueda")) {
				this.jButtoneliminacionPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("consultaPerfilCampoBusqueda")) {
				this.jButtonconsultaPerfilCampoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoPerfilCampoBusqueda")) {
				this.jButtonestadoPerfilCampoBusquedaActionPerformed(evt);
			}
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPerfilCampo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePerfilCampo")) {
				closingInternalFramePerfilCampo();
				
			} else if(sTipo.equals("jButtonCancelarPerfilCampo")) {
				JInternalFrameBase jInternalFrameDetalleFormPerfilCampo = (JInternalFrameBase)evt.getSource();
	            	
	            PerfilCampoBeanSwingJInternalFrame jInternalFrameParent=(PerfilCampoBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilCampo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPerfilCampoActionPerformed(null);
			}
			
			PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.perfilcampo,new Object(),this.perfilcampoParameterGeneral,this.perfilcampoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPerfilCampo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPerfilCampo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPerfilCampo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.perfilcampo)) {
			if(!esControlTabla) {
				if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);			
				}
				
				if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPerfilCampo(this.perfilcampo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilcampoReturnGeneral=perfilcampoLogic.procesarEventosPerfilCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilcampoLogic.getPerfilCampos(),this.perfilcampo,this.perfilcampoParameterGeneral,this.isEsNuevoPerfilCampo,classes);//this.perfilcampoLogic.getPerfilCampo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPerfilCampo(this.perfilcampoReturnGeneral,this.perfilcampoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPerfilCampo(classes,this.perfilcampoReturnGeneral,this.perfilcampoBean,false);
					}
						
					if(this.perfilcampoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo());	
					}
						
					if(this.perfilcampoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo(),classes);//this.perfilcampoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPerfilCampo(this.perfilcampo,classes);//this.perfilcampoBean);									
				}
			
				if(PerfilCampoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPerfilCampo(this.perfilcampo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPerfilCampo(this.perfilcampo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.perfilcampoAnterior!=null) {
						this.perfilcampo=this.perfilcampoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.perfilcampoReturnGeneral=perfilcampoLogic.procesarEventosPerfilCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilcampoLogic.getPerfilCampos(),this.perfilcampo,this.perfilcampoParameterGeneral,this.isEsNuevoPerfilCampo,classes);//this.perfilcampoLogic.getPerfilCampo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.perfilcampoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.perfilcampoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.perfilcampoReturnGeneral.getPerfilCampo(),perfilcampoLogic.getPerfilCampos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.perfilcampoReturnGeneral.getPerfilCampo(),this.perfilcampos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPerfilCampo.repaint();
				
				//((AbstractTableModel) this.jTableDatosPerfilCampo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPerfilCampo();
			}
		}
	}
	
	public void actualizarVisualTableDatosPerfilCampo() throws Exception {
		
		PerfilCampoModel perfilcampoModel=(PerfilCampoModel)this.jTableDatosPerfilCampo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			perfilcampoModel.perfilcampos=this.perfilcampoLogic.getPerfilCampos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			perfilcampoModel.perfilcampos=this.perfilcampos;
		}
		
		
		((PerfilCampoModel) this.jTableDatosPerfilCampo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPerfilCampo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getperfilcampoAnterior(),this.perfilcampoLogic.getPerfilCampos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getperfilcampoAnterior(),this.perfilcampos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPerfilCampo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPerfilCampo(PerfilCampo perfilcampo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
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
										
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilcampo,new Object(),generalEntityParameterGeneral,this.perfilcampoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.perfilcampoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PerfilCampoConstantesFunciones.getClassesRelationshipsOfPerfilCampo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PerfilCampoConstantesFunciones.getClassesRelationshipsFromStringsOfPerfilCampo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPerfilCampo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PerfilCampoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.perfilcampo,new Object(),generalEntityParameterGeneral,this.perfilcampoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPerfilCampo(PerfilCampoBean perfilcampoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPerfilCampo(ArrayList<Classe> classes,PerfilCampoReturnGeneral perfilcampoReturnGeneral,PerfilCampoBean perfilcampoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPerfilCampo(PerfilCampo perfilcampo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.perfilcampo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPerfilCampo = new PerfilCampoDetalleFormJInternalFrame(jDesktopPane,this.perfilcampoSessionBean.getConGuardarRelaciones(),this.perfilcampoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.setVisible(false);
		this.jInternalFrameDetalleFormPerfilCampo.setSelected(false);						
		
		this.jInternalFrameDetalleFormPerfilCampo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPerfilCampo.perfilcampoLogic=this.perfilcampoLogic;
		
		this.cargarCombosFrameForeignKeyPerfilCampo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePerfilCampo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePerfilCampo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPerfilCampo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPerfilCampo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPerfilCampo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilCampo"));
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarPerfilCampo.addActionListener(new ButtonActionListener(this,"ModificarPerfilCampo"));

		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilCampo"));
					
		this.jInternalFrameDetalleFormPerfilCampo.jMenuItemModificarPerfilCampo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilCampo"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.addActionListener (new ButtonActionListener(this,"ActualizarPerfilCampo"));
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilCampo"));
						
		this.jInternalFrameDetalleFormPerfilCampo.jMenuItemActualizarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilCampo"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.addActionListener (new ButtonActionListener(this,"EliminarPerfilCampo"));
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilCampo"));
								
		this.jInternalFrameDetalleFormPerfilCampo.jMenuItemEliminarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilCampo"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.addActionListener (new ButtonActionListener(this,"CancelarPerfilCampo"));
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilCampo"));
					
		this.jInternalFrameDetalleFormPerfilCampo.jMenuItemCancelarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilCampo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jMenuItemDetalleCerrarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilCampo"));		
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilCampo"));
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilCampo"));
		
		
		
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilCampo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonidPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilCampoBusqueda"));
		//jButtonid_perfilPerfilCampo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilCampoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampo.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtontodoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoningresoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonmodificacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoneliminacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonconsultaPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonestadoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilCampoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilCampo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePerfilCampo"));
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPerfilCampo"));
		}
		
		this.jTableDatosPerfilCampo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPerfilCampo"));
		
		this.jTableDatosPerfilCampo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPerfilCampo"));
		
		this.jButtonNuevoPerfilCampo.addActionListener(new ButtonActionListener(this,"NuevoPerfilCampo"));
		
		this.jButtonDuplicarPerfilCampo.addActionListener(new ButtonActionListener(this,"DuplicarPerfilCampo"));
		
		this.jButtonCopiarPerfilCampo.addActionListener(new ButtonActionListener(this,"CopiarPerfilCampo"));
		
		this.jButtonVerFormPerfilCampo.addActionListener(new ButtonActionListener(this,"VerFormPerfilCampo"));
		
		
		this.jButtonNuevoToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"NuevoToolBarPerfilCampo"));
			
		this.jButtonDuplicarToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPerfilCampo"));
			
		this.jMenuItemNuevoPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPerfilCampo"));
			
		this.jMenuItemDuplicarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPerfilCampo"));		
		
		
		this.jButtonNuevoRelacionesPerfilCampo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPerfilCampo"));
		
		
		this.jButtonNuevoRelacionesToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPerfilCampo"));
			
		this.jMenuItemNuevoRelacionesPerfilCampo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPerfilCampo"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarPerfilCampo.addActionListener(new ButtonActionListener(this,"ModificarPerfilCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonModificarToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"ModificarToolBarPerfilCampo"));
			
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemModificarPerfilCampo.addActionListener(new ButtonActionListener(this,"MenuItemModificarPerfilCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarPerfilCampo.addActionListener (new ButtonActionListener(this,"ActualizarPerfilCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonActualizarToolBarPerfilCampo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPerfilCampo"));
				
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemActualizarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPerfilCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarPerfilCampo.addActionListener (new ButtonActionListener(this,"EliminarPerfilCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonEliminarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"EliminarToolBarPerfilCampo"));
						
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemEliminarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPerfilCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarPerfilCampo.addActionListener (new ButtonActionListener(this,"CancelarPerfilCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonCancelarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"CancelarToolBarPerfilCampo"));
			
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemCancelarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPerfilCampo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPerfilCampo"));		
		
		
		this.jButtonCerrarPerfilCampo.addActionListener (new ButtonActionListener(this,"CerrarPerfilCampo"));
		
		
		this.jButtonCerrarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"CerrarToolBarPerfilCampo"));
			
		this.jMenuItemCerrarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPerfilCampo"));
			
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jMenuItemDetalleCerrarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPerfilCampo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosPerfilCampo"));
		}
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPerfilCampo"));
		}
		
		this.jButtonCopiarToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"CopiarToolBarPerfilCampo"));
			
		this.jButtonVerFormToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"VerFormToolBarPerfilCampo"));
		
		this.jMenuItemGuardarCambiosPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPerfilCampo"));
			
		this.jMenuItemCopiarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPerfilCampo"));		
		
		this.jMenuItemVerFormPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPerfilCampo"));		
		
		
		this.jButtonGuardarCambiosTablaPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilCampo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPerfilCampo"));
			
		this.jMenuItemGuardarCambiosTablaPerfilCampo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPerfilCampo"));		
		
		
		
		this.jButtonRecargarInformacionPerfilCampo.addActionListener (new ButtonActionListener(this,"RecargarInformacionPerfilCampo"));
					
		this.jButtonRecargarInformacionToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPerfilCampo"));
		
		this.jMenuItemRecargarInformacionPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPerfilCampo"));		
		
		
		
		this.jButtonAnterioresPerfilCampo.addActionListener (new ButtonActionListener(this,"AnterioresPerfilCampo"));
		
		
		this.jButtonAnterioresToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPerfilCampo"));
		
		this.jMenuItemAnterioresPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPerfilCampo"));		
		
		
		this.jButtonSiguientesPerfilCampo.addActionListener (new ButtonActionListener(this,"SiguientesPerfilCampo"));
		
		
		this.jButtonSiguientesToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPerfilCampo"));
			
		this.jMenuItemSiguientesPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPerfilCampo"));
			
		this.jMenuItemAbrirOrderByPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPerfilCampo"));
			
		this.jMenuItemMostrarOcultarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPerfilCampo"));
			
		this.jMenuItemDetalleAbrirOrderByPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPerfilCampo"));
			
		this.jMenuItemDetalleMostarOcultarPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPerfilCampo"));		
		
		
		this.jButtonNuevoGuardarCambiosPerfilCampo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPerfilCampo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPerfilCampo"));
			
		this.jMenuItemNuevoGuardarCambiosPerfilCampo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPerfilCampo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPerfilCampo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPerfilCampo"));

		this.jCheckBoxSeleccionadosPerfilCampo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPerfilCampo"));
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPerfilCampo"));
		}
		
		
		this.jComboBoxTiposRelacionesPerfilCampo.addActionListener (new ButtonActionListener(this,"TiposRelacionesPerfilCampo"));
			
		this.jComboBoxTiposAccionesPerfilCampo.addActionListener (new ButtonActionListener(this,"TiposAccionesPerfilCampo"));
					
		this.jComboBoxTiposSeleccionarPerfilCampo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPerfilCampo"));
			
		this.jTextFieldValorCampoGeneralPerfilCampo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPerfilCampo"));		
		
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonidPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilCampoBusqueda"));
		//jButtonid_perfilPerfilCampo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilCampoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampo.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtontodoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoningresoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonmodificacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoneliminacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonconsultaPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonestadoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilCampoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCampoPerfilCampo.addActionListener(new ButtonActionListener(this,"FK_IdCampoPerfilCampo"));

			this.jButtonFK_IdPerfilPerfilCampo.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilCampo"));

			this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPerfilCampo!=null) {
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilCampo"));
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilCampo"));
				this.jInternalFrameReporteDinamicoPerfilCampo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilCampo"));
			}
			
			//this.jButtonCerrarReporteDinamicoPerfilCampo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPerfilCampo"));				
			//this.jButtonGenerarReporteDinamicoPerfilCampo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPerfilCampo"));
			//this.jButtonGenerarExcelReporteDinamicoPerfilCampo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPerfilCampo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPerfilCampo!=null) {
				this.jInternalFrameImportacionPerfilCampo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPerfilCampo"));
				this.jInternalFrameImportacionPerfilCampo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPerfilCampo"));
				this.jInternalFrameImportacionPerfilCampo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPerfilCampo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPerfilCampo.addActionListener (new ButtonActionListener(this,"AbrirOrderByPerfilCampo"));
			
			this.jButtonAbrirOrderByToolBarPerfilCampo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPerfilCampo"));			
			
			if(this.jInternalFrameOrderByPerfilCampo!=null) {
				this.jInternalFrameOrderByPerfilCampo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPerfilCampo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPerfilCampo.jTabbedPaneRelacionesPerfilCampo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPerfilCampo"));
		
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
            		closingInternalFramePerfilCampo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPerfilCampo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPerfilCampo = (JInternalFrameBase)event.getSource();
	            	
	            PerfilCampoBeanSwingJInternalFrame jInternalFrameParent=(PerfilCampoBeanSwingJInternalFrame)jInternalFrameDetalleFormPerfilCampo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPerfilCampoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPerfilCampo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPerfilCampoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPerfilCampo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPerfilCampo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPerfilCampo";
		inputMap = this.jButtonNuevoPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilCampoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPerfilCampoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPerfilCampo";
		inputMap = this.jButtonNuevoRelacionesPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPerfilCampoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPerfilCampo";
		inputMap = this.jButtonModificarPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPerfilCampo";
		inputMap = this.jButtonActualizarPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPerfilCampo";
		inputMap = this.jButtonEliminarPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPerfilCampo";
		inputMap = this.jButtonCancelarPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPerfilCampo";
		inputMap = this.jButtonCerrarPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPerfilCampo";
		inputMap = this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPerfilCampo.jButtonGuardarCambiosPerfilCampo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPerfilCampoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPerfilCampo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPerfilCampoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPerfilCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPerfilCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPerfilCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPerfilCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPerfilCampo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPerfilCampoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonidPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"idPerfilCampoBusqueda"));
		//jButtonid_perfilPerfilCampo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_perfilPerfilCampoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampo.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampo"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoUpdate.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonid_campoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"id_campoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtontodoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"todoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoningresoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"ingresoPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonmodificacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"modificacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtoneliminacionPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"eliminacionPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonconsultaPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"consultaPerfilCampoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPerfilCampo.jButtonestadoPerfilCampoBusqueda.addActionListener(new ButtonActionListener(this,"estadoPerfilCampoBusqueda"));
		
		
		this.jButtonFK_IdCampoPerfilCampo.addActionListener(new ButtonActionListener(this,"FK_IdCampoPerfilCampo"));

		this.jButtonFK_IdPerfilPerfilCampo.addActionListener(new ButtonActionListener(this,"FK_IdPerfilPerfilCampo"));

		this.jButtonBuscarFK_IdPerfilid_perfilPerfilCampo.addActionListener(new ButtonActionListener(this,"id_perfilPerfilCampo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPerfilCampo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPerfilCampoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPerfilCampoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPerfilCampo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPerfilCampo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
					perfilcampoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilCampo perfilcampoAux:perfilcampos) {
					perfilcampoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPerfilCampoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
						perfilcampoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilCampo perfilcampoAux:perfilcampos) {
						perfilcampoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
					
						if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_TODO)) {
							existe=true;
							perfilcampoAux.settodo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_INGRESO)) {
							existe=true;
							perfilcampoAux.setingreso(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_MODIFICACION)) {
							existe=true;
							perfilcampoAux.setmodificacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ELIMINACION)) {
							existe=true;
							perfilcampoAux.seteliminacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_CONSULTA)) {
							existe=true;
							perfilcampoAux.setconsulta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilcampoAux.setestado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilCampo perfilcampoAux:perfilcampos) {
						
						if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_TODO)) {
							existe=true;
							perfilcampoAux.settodo(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_INGRESO)) {
							existe=true;
							perfilcampoAux.setingreso(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_MODIFICACION)) {
							existe=true;
							perfilcampoAux.setmodificacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ELIMINACION)) {
							existe=true;
							perfilcampoAux.seteliminacion(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_CONSULTA)) {
							existe=true;
							perfilcampoAux.setconsulta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							perfilcampoAux.setestado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilCampo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilCampo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilCampo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPerfilCampoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPerfilCampo.getSelectedRows();
			
			PerfilCampo perfilcampoLocal=new PerfilCampo();
			
			//this.seleccionarTodosPerfilCampo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					perfilcampoLocal =(PerfilCampo) this.perfilcampoLogic.getPerfilCampos().toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					perfilcampoLocal =(PerfilCampo) this.perfilcampos.toArray()[this.jTableDatosPerfilCampo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				perfilcampoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
						perfilcampoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PerfilCampo perfilcampoAux:perfilcampos) {
						perfilcampoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPerfilCampo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPerfilCampo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPerfilCampo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPerfilCampo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPerfilCampoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPerfilCampoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPerfilCampoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPerfilCampo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PerfilCampo perfilcampoAux:this.perfilcampoLogic.getPerfilCampos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilCampo perfilcampoAux:perfilcampos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPerfilCampo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPerfilCampoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPerfilCampo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPerfilCampo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePerfilCampo) {				
					conSplash=true;//false;										
					
					//this.startProcessPerfilCampo(conSplash);
				
					this.generarReportePerfilCamposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPerfilCamposSeleccionados();
				//this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilCamposSeleccionados(false);
				//this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPerfilCamposSeleccionados(true);
				//this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilCampo();
				
				this.exportarPerfilCamposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPerfilCampos();
				//this.importarPerfilCampos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPerfilCampo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPerfilCamposSeleccionados();
				//this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Perfil Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPerfilCampo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPerfilCampo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPerfilCampo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
				}	
			} 			
			else if(PerfilCampoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePerfilCampo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPerfilCampo(conSplash);
					
						//this.actualizarParametrosGeneralPerfilCampo();
						
						this.generarReporteProcesoAccionPerfilCamposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PerfilCampoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Perfil CampoS SELECCIONADOS?", "MANTENIMIENTO DE Perfil Campo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPerfilCampo();
				
						this.actualizarParametrosGeneralPerfilCampo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.perfilcampoReturnGeneral=perfilcampoLogic.procesarAccionPerfilCamposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.perfilcampoLogic.getPerfilCampos(),this.perfilcampoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPerfilCampoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPerfilCampo();
					
					PerfilCampoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPerfilCampoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPerfilCampo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPerfilCampo.jComboBoxTiposAccionesFormularioPerfilCampo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPerfilCampo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPerfilCampoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPerfilCampo();
			
			if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
			PerfilCampo perfilcampo=new PerfilCampo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPerfilCampo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPerfilCampo.getSelectedItem();
			
			
			
			
			perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
			//this.sTipoAccion;
			
			if(perfilcamposSeleccionados.size()==1) {
				for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
					perfilcampo=perfilcampoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPerfilCampo();
			
      		//this.finishProcessPerfilCampo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPerfilCampoReturnGeneral() throws Exception {
		if(this.perfilcampoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.perfilcampoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.perfilcampoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.perfilcampoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.perfilcampoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.perfilcampoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPerfilCampo(false);
		}
		
		if(this.perfilcampoReturnGeneral.getConRetornoLista() || this.perfilcampoReturnGeneral.getConRetornoObjeto()) {
			if(this.perfilcampoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilcampoLogic.setPerfilCampos(this.perfilcampoReturnGeneral.getPerfilCampos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.perfilcampoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.perfilcampoLogic.setPerfilCampo(this.perfilcampoReturnGeneral.getPerfilCampo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPerfilCampo(false);
		}
	}
	
	public void actualizarParametrosGeneralPerfilCampo() throws Exception {
		
		
	}
	
	public ArrayList<PerfilCampo> getPerfilCamposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPerfilCampo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PerfilCampo perfilcampoAux:perfilcampoLogic.getPerfilCampos()) {
					if(perfilcampoAux.getIsSelected()) {
						perfilcamposSeleccionados.add(perfilcampoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PerfilCampo perfilcampoAux:this.perfilcampos) {
					if(perfilcampoAux.getIsSelected()) {
						perfilcamposSeleccionados.add(perfilcampoAux);				
					}
				}
			}
			
			if(perfilcamposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						perfilcamposSeleccionados.addAll(this.perfilcampoLogic.getPerfilCampos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						perfilcamposSeleccionados.addAll(this.perfilcampos);				
					}
				}
			}
		} else {
			perfilcamposSeleccionados.add(this.perfilcampo);
		}
		
		return perfilcamposSeleccionados;
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
	
	public void generarReportePerfilCamposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPerfilCamposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPerfilCamposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilCamposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPerfilCamposSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Perfil Campo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados);
		
	}	
	
	public void generarReporteNormalPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPerfilCamposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPerfilCampo();
		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPerfilCampo();
		
		
		//this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados ,perfilcampoImplementable,perfilcampoImplementableHome);
	}
	
	public void mostrarImportacionPerfilCampos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPerfilCampo();
		
		this.abrirFrameImportacionPerfilCampo();		
		
			
		//this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados ,perfilcampoImplementable,perfilcampoImplementableHome);
	}
	
	public void importarPerfilCampos() throws Exception {		
	
	}
	
	public void exportarPerfilCamposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPerfilCamposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPerfilCamposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPerfilCamposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Perfil Campo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPerfilCampo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPerfilCampo(perfilcampoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//perfilcampoAux.setsDetalleGeneralEntityReporte(perfilcampoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPerfilCampo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_IDPERFIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_IDCAMPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_TODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_INGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_MODIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_ELIMINACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_CONSULTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PerfilCampoConstantesFunciones.LABEL_ESTADO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPerfilCampo(PerfilCampo perfilcampo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=perfilcampo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getperfil_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getcampo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.gettodo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getingreso().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getmodificacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.geteliminacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getconsulta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=perfilcampo.getestado().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PerfilCampos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPerfilCampo(row);				
				iRow++;
			}				
			
			for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPerfilCampo(perfilcampoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPerfilCamposSeleccionados() throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();		
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"perfilcampo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("perfilcampos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("perfilcampo");
			//elementRoot.appendChild(element);
		
			for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
				element = document.createElement("perfilcampo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPerfilCampo(perfilcampoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Perfil Campo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPerfilCampo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDPERFIL);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_IDCAMPO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_TODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_INGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_MODIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ELIMINACION);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_CONSULTA);
		cell = row.createCell(iColumn++);cell.setCellValue(PerfilCampoConstantesFunciones.LABEL_ESTADO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPerfilCampo(PerfilCampo perfilcampo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getperfil_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getcampo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.gettodo());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getingreso());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getmodificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.geteliminacion());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getconsulta());
		cell = row.createCell(iColumn++);cell.setCellValue(perfilcampo.getestado());				
	}
	
	public void setFilaDatosExportarXmlPerfilCampo(PerfilCampo perfilcampo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PerfilCampoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(perfilcampo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PerfilCampoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(perfilcampo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementperfil_descripcion = document.createElement(PerfilCampoConstantesFunciones.IDPERFIL);
		elementperfil_descripcion.appendChild(document.createTextNode(perfilcampo.getperfil_descripcion()));
		element.appendChild(elementperfil_descripcion);

		Element elementcampo_descripcion = document.createElement(PerfilCampoConstantesFunciones.IDCAMPO);
		elementcampo_descripcion.appendChild(document.createTextNode(perfilcampo.getcampo_descripcion()));
		element.appendChild(elementcampo_descripcion);

		Element elementtodo = document.createElement(PerfilCampoConstantesFunciones.TODO);
		elementtodo.appendChild(document.createTextNode(perfilcampo.gettodo().toString().trim()));
		element.appendChild(elementtodo);

		Element elementingreso = document.createElement(PerfilCampoConstantesFunciones.INGRESO);
		elementingreso.appendChild(document.createTextNode(perfilcampo.getingreso().toString().trim()));
		element.appendChild(elementingreso);

		Element elementmodificacion = document.createElement(PerfilCampoConstantesFunciones.MODIFICACION);
		elementmodificacion.appendChild(document.createTextNode(perfilcampo.getmodificacion().toString().trim()));
		element.appendChild(elementmodificacion);

		Element elementeliminacion = document.createElement(PerfilCampoConstantesFunciones.ELIMINACION);
		elementeliminacion.appendChild(document.createTextNode(perfilcampo.geteliminacion().toString().trim()));
		element.appendChild(elementeliminacion);

		Element elementconsulta = document.createElement(PerfilCampoConstantesFunciones.CONSULTA);
		elementconsulta.appendChild(document.createTextNode(perfilcampo.getconsulta().toString().trim()));
		element.appendChild(elementconsulta);

		Element elementestado = document.createElement(PerfilCampoConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(perfilcampo.getestado().toString().trim()));
		element.appendChild(elementestado);
	}
	
	public void generarReporteGroupGenericoPerfilCamposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PerfilCampo> perfilcamposSeleccionados=new ArrayList<PerfilCampo>();
		
		perfilcamposSeleccionados=this.getPerfilCamposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPerfilCampo(perfilcamposSeleccionados);
		
		this.generarReportePerfilCampos("Todos",perfilcamposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPerfilCampo(ArrayList<PerfilCampo> perfilcamposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PerfilCampo perfilcampoAux:perfilcamposSeleccionados) {
				perfilcampoAux.setsDetalleGeneralEntityReporte(perfilcampoAux.toString());
			
				if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_IDPERFIL)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(perfilcampoAux.getperfil_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_IDCAMPO)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(perfilcampoAux.getcampo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_TODO)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.gettodo()));
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_INGRESO)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.getingreso()));
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_MODIFICACION)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.getmodificacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ELIMINACION)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.geteliminacion()));
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_CONSULTA)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.getconsulta()));
				}
				 else if(sTipoSeleccionar.equals(PerfilCampoConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					perfilcampoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(perfilcampoAux.getestado()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PerfilCampoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPerfilCampo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPerfilCampo=true;
				this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=true;
				this.isVisibilidadCeldaGuardarCambiosPerfilCampo=true;
			}
			
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=true;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=true;
			this.isVisibilidadCeldaEliminarPerfilCampo=true;
			this.isVisibilidadCeldaCancelarPerfilCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=true;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPerfilCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=true;
			this.isVisibilidadCeldaModificarPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=true;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
			this.isVisibilidadCeldaModificarPerfilCampo=true;
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
			this.isVisibilidadCeldaCancelarPerfilCampo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				} else {
					this.isVisibilidadCeldaGuardarPerfilCampo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PerfilCampoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPerfilCampo=true;
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=true;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=true;
		} else {
			this.actualizarEstadoPanelsPerfilCampo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPerfilCampo=false;
			//this.isVisibilidadCeldaVerFormPerfilCampo=false;
			this.isVisibilidadCeldaDuplicarPerfilCampo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!perfilcampoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
		} else {
			this.isVisibilidadCeldaNuevoPerfilCampo=false;
			this.isVisibilidadCeldaGuardarCambiosPerfilCampo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(perfilcampoSessionBean.getEsGuardarRelacionado()) {
			if(!perfilcampoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;												
			}
			
			this.jButtonCerrarPerfilCampo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPerfilCampo=false;
		}
		
		if(!this.permiteMantenimiento(this.perfilcampo)) {
			this.isVisibilidadCeldaActualizarPerfilCampo=false;
			this.isVisibilidadCeldaEliminarPerfilCampo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPerfilCampo() {
	}
	
	public void actualizarEstadoPanelsPerfilCampo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPerfilCampo!=null) {
				this.jScrollPanelDatosEdicionPerfilCampo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPerfilCampo!=null) {
				this.jScrollPanelDatosPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelPaginacionPerfilCampo!=null) {
				this.jPanelPaginacionPerfilCampo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
					this.jTabbedPaneBusquedasPerfilCampo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.perfilcampoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPerfilCampo!=null) {
				this.jTabbedPaneBusquedasPerfilCampo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPerfilCampo!=null) {
				this.jPanelParametrosReportesPerfilCampo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPerfil(Boolean isParaPerfil){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPerfilNegation=!isParaPerfil;

			this.isVisibilidadFK_IdCampo=isParaPerfilNegation;
			if(!this.isVisibilidadFK_IdCampo) {this.jTabbedPaneBusquedasPerfilCampo.remove(jPanelFK_IdCampoPerfilCampo);}

			this.isVisibilidadFK_IdPerfil=isParaPerfil;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilCampo.remove(jPanelFK_IdPerfilPerfilCampo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCampo(Boolean isParaCampo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCampoNegation=!isParaCampo;

			this.isVisibilidadFK_IdCampo=isParaCampo;
			if(!this.isVisibilidadFK_IdCampo) {this.jTabbedPaneBusquedasPerfilCampo.remove(jPanelFK_IdCampoPerfilCampo);}

			this.isVisibilidadFK_IdPerfil=isParaCampoNegation;
			if(!this.isVisibilidadFK_IdPerfil) {this.jTabbedPaneBusquedasPerfilCampo.remove(jPanelFK_IdPerfilPerfilCampo);}
		}
		
	}
	
	
	
	

	public String registrarSesionPerfilCampoParaBusquedaPerfiles() throws Exception {
		Boolean isPaginaPopupPerfil=false;

		try {

			if(perfilcampoSessionBean==null) {
				perfilcampoSessionBean=new PerfilCampoSessionBean();
			}

			if(perfilSessionBean==null) {
				perfilSessionBean=new PerfilSessionBean();
			}

			perfilSessionBean.setsPathNavegacionActual(perfilcampoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PerfilConstantesFunciones.SCLASSWEBTITULO);
			perfilSessionBean.setisPermiteRecargarInformacion(false);
			perfilSessionBean.setisPaginaPopup(true);
			isPaginaPopupPerfil=perfilSessionBean.getisPaginaPopup();
			perfilSessionBean.setisPaginaPopup(false);
			perfilSessionBean.setEstaModoBusqueda(true);
			perfilSessionBean.setsFuncionBusquedaRapida("window.opener.perfilcampoFuncionGeneral.setCombosCodigoDesdeBusquedaid_perfil(TO_REPLACE);");
			perfilSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePerfil(true);
			perfilSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePerfil(PerfilCampoConstantesFunciones.SNOMBREOPCION);
			//perfilSessionBean.setisBusquedaDesdeForeignKeySesionPerfilCampo(true);
			//perfilSessionBean.setlidPerfilCampoActual(this.idPerfilCampoActual);

			perfilcampoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPerfilCampo(true);
			perfilcampoSessionBean.setlIdPerfilCampoActualForeignKey(this.idPerfilCampoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PerfilCampoSessionBean perfilcampoSessionBean=new PerfilCampoSessionBean();
		
		if(this.perfilcampoSessionBean==null) {
			this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		}
		
		this.perfilcampoSessionBean.setsUltimaBusquedaPerfilCampo(this.getsAccionBusqueda());
		this.perfilcampoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.perfilcampoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCampo")) {
			perfilcampoSessionBean.setid_campo(this.getid_campoFK_IdCampo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
			perfilcampoSessionBean.setid_perfil(this.getid_perfilFK_IdPerfil());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PerfilCampoSessionBean perfilcampoSessionBean=new PerfilCampoSessionBean();
		
		if(this.perfilcampoSessionBean==null) {
			this.perfilcampoSessionBean=new PerfilCampoSessionBean();
		}
		
		if(this.perfilcampoSessionBean.getsUltimaBusquedaPerfilCampo()!=null&&!this.perfilcampoSessionBean.getsUltimaBusquedaPerfilCampo().equals("")) {
			this.setsAccionBusqueda(perfilcampoSessionBean.getsUltimaBusquedaPerfilCampo());
			this.setiNumeroPaginacion(perfilcampoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(perfilcampoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCampo")) {
				this.setid_campoFK_IdCampo(perfilcampoSessionBean.getid_campo());
				perfilcampoSessionBean.setid_campo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPerfil")) {
				this.setid_perfilFK_IdPerfil(perfilcampoSessionBean.getid_perfil());
				perfilcampoSessionBean.setid_perfil(-1L);
			}
		}
		
		this.perfilcampoSessionBean.setsUltimaBusquedaPerfilCampo("");
		this.perfilcampoSessionBean.setiNumeroPaginacion(PerfilCampoConstantesFunciones.INUMEROPAGINACION);
		this.perfilcampoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPerfilCampo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPerfilCampo() {
		this.updateBorderResaltarBusquedasFormularioPerfilCampo();
		this.updateVisibilidadBusquedasFormularioPerfilCampo();
		this.updateHabilitarBusquedasFormularioPerfilCampo();
	}
	
	public void updateBorderResaltarBusquedasFormularioPerfilCampo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPerfilCampo.getComponents().length>0) {
	

		if(this.perfilcampoConstantesFunciones.resaltarFK_IdCampoPerfilCampo!=null) {
			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdCampoPerfilCampo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
				jPanel.setBorder(this.perfilcampoConstantesFunciones.resaltarFK_IdCampoPerfilCampo);
			}
		}

		if(this.perfilcampoConstantesFunciones.resaltarFK_IdPerfilPerfilCampo!=null) {
			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdPerfilPerfilCampo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
				jPanel.setBorder(this.perfilcampoConstantesFunciones.resaltarFK_IdPerfilPerfilCampo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPerfilCampo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPerfilCampo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdCampoPerfilCampo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilcampoConstantesFunciones.mostrarFK_IdCampoPerfilCampo);
			if(!this.perfilcampoConstantesFunciones.mostrarFK_IdCampoPerfilCampo && index>-1) {
				this.jTabbedPaneBusquedasPerfilCampo.remove(index);
			}

			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdPerfilPerfilCampo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.perfilcampoConstantesFunciones.mostrarFK_IdPerfilPerfilCampo);
			if(!this.perfilcampoConstantesFunciones.mostrarFK_IdPerfilPerfilCampo && index>-1) {
				this.jTabbedPaneBusquedasPerfilCampo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPerfilCampo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPerfilCampo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdCampoPerfilCampo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilcampoConstantesFunciones.activarFK_IdCampoPerfilCampo);
				this.jTabbedPaneBusquedasPerfilCampo.setEnabledAt(index,this.perfilcampoConstantesFunciones.activarFK_IdCampoPerfilCampo);
			}

			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdPerfilPerfilCampo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.perfilcampoConstantesFunciones.activarFK_IdPerfilPerfilCampo);
				this.jTabbedPaneBusquedasPerfilCampo.setEnabledAt(index,this.perfilcampoConstantesFunciones.activarFK_IdPerfilPerfilCampo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPerfilCampo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCampo")) {
			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdCampoPerfilCampo);

			this.jTabbedPaneBusquedasPerfilCampo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);

			this.perfilcampoConstantesFunciones.setResaltarFK_IdCampoPerfilCampo(resaltar);

			jPanel.setBorder(this.perfilcampoConstantesFunciones.resaltarFK_IdCampoPerfilCampo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPerfil")) {
			index= this.jTabbedPaneBusquedasPerfilCampo.indexOfComponent(this.jPanelFK_IdPerfilPerfilCampo);

			this.jTabbedPaneBusquedasPerfilCampo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPerfilCampo.getComponent(index);

			this.perfilcampoConstantesFunciones.setResaltarFK_IdPerfilPerfilCampo(resaltar);

			jPanel.setBorder(this.perfilcampoConstantesFunciones.resaltarFK_IdPerfilPerfilCampo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPerfilCampo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPerfilCampo() throws Exception {

		if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPerfilCampo();
		this.updateVisibilidadResaltarControlesFormularioPerfilCampo();
		this.updateHabilitarResaltarControlesFormularioPerfilCampo();
		
	}
	
	public void updateBorderResaltarControlesFormularioPerfilCampo() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.perfilcampoConstantesFunciones.resaltaridPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltaridPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltarid_perfilPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltarid_perfilPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltarid_campoPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltarid_campoPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltartodoPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltartodoPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltaringresoPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltaringresoPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltarmodificacionPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltarmodificacionPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltareliminacionPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltareliminacionPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltarconsultaPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltarconsultaPerfilCampo);}
		if(this.perfilcampoConstantesFunciones.resaltarestadoPerfilCampo!=null && this.jInternalFrameDetalleFormPerfilCampo!=null) {this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setBorderPainted(true);this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setBorder(this.perfilcampoConstantesFunciones.resaltarestadoPerfilCampo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPerfilCampo() throws Exception {		
		if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
	
		//this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostraridPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelidPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostraridPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarid_perfilPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelid_perfilPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarid_perfilPerfilCampo);
			this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarid_perfilPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarid_campoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelid_campoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarid_campoPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrartodoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPaneltodoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrartodoPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostraringresoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelingresoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostraringresoPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarmodificacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelmodificacionPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarmodificacionPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrareliminacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPaneleliminacionPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrareliminacionPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarconsultaPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelconsultaPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarconsultaPerfilCampo);
		//this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarestadoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jPanelestadoPerfilCampo.setVisible(this.perfilcampoConstantesFunciones.mostrarestadoPerfilCampo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPerfilCampo() throws Exception {
		if(this.jInternalFrameDetalleFormPerfilCampo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPerfilCampo!=null) {
	
		this.jInternalFrameDetalleFormPerfilCampo.jLabelidPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activaridPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_perfilPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarid_perfilPerfilCampo);
			this.jInternalFrameDetalleFormPerfilCampo.jButtonid_perfilPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarid_perfilPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jComboBoxid_campoPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarid_campoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxtodoPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activartodoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxingresoPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activaringresoPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxmodificacionPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarmodificacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxeliminacionPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activareliminacionPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxconsultaPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarconsultaPerfilCampo);
		this.jInternalFrameDetalleFormPerfilCampo.jCheckBoxestadoPerfilCampo.setEnabled(this.perfilcampoConstantesFunciones.activarestadoPerfilCampo);
		}
	}
	
		
}