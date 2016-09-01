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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.NivelCentroCostoConstantesFunciones;
import com.bydan.erp.contabilidad.util.NivelCentroCostoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.NivelCentroCostoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.NivelCentroCostoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class NivelCentroCostoBeanSwingJInternalFrame extends NivelCentroCostoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NivelCentroCostoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NivelCentroCosto> nivelcentrocostoValidator = new ClassValidator<NivelCentroCosto>(NivelCentroCosto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NivelCentroCosto nivelcentrocosto;	
	public NivelCentroCosto nivelcentrocostoAux;
	public NivelCentroCosto nivelcentrocostoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NivelCentroCosto nivelcentrocostoTotales;
	public Long idNivelCentroCostoActual;
	public Long iIdNuevoNivelCentroCosto=0L;
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
	
	public Boolean isPermisoTodoNivelCentroCosto;
	public Boolean isPermisoNuevoNivelCentroCosto;
	public Boolean isPermisoActualizarNivelCentroCosto;
	public Boolean isPermisoActualizarOriginalNivelCentroCosto;
	public Boolean isPermisoEliminarNivelCentroCosto;
	public Boolean isPermisoGuardarCambiosNivelCentroCosto;
	public Boolean isPermisoConsultaNivelCentroCosto;
	public Boolean isPermisoBusquedaNivelCentroCosto;
	public Boolean isPermisoReporteNivelCentroCosto;
	public Boolean isPermisoPaginacionMedioNivelCentroCosto;
	public Boolean isPermisoPaginacionAltoNivelCentroCosto;
	public Boolean isPermisoPaginacionTodoNivelCentroCosto;
	public Boolean isPermisoCopiarNivelCentroCosto;
	public Boolean isPermisoVerFormNivelCentroCosto;
	public Boolean isPermisoDuplicarNivelCentroCosto;
	public Boolean isPermisoOrdenNivelCentroCosto;
	
	
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
	
	public NivelCentroCostoParameterReturnGeneral nivelcentrocostoReturnGeneral;
	public NivelCentroCostoParameterReturnGeneral nivelcentrocostoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNivelCentroCosto=false;
	public Boolean esParaAccionDesdeFormularioNivelCentroCosto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NivelCentroCostoSessionBeanAdditional nivelcentrocostoSessionBeanAdditional=null;
	
	public NivelCentroCostoSessionBeanAdditional getNivelCentroCostoSessionBeanAdditional() {
		return this.nivelcentrocostoSessionBeanAdditional;
	}
	
	public void setNivelCentroCostoSessionBeanAdditional(NivelCentroCostoSessionBeanAdditional nivelcentrocostoSessionBeanAdditional) {
		try {
			this.nivelcentrocostoSessionBeanAdditional=nivelcentrocostoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NivelCentroCostoBeanSwingJInternalFrameAdditional nivelcentrocostoBeanSwingJInternalFrameAdditional=null;
	//public class NivelCentroCostoBeanSwingJInternalFrame
	
	public NivelCentroCostoBeanSwingJInternalFrameAdditional getNivelCentroCostoBeanSwingJInternalFrameAdditional() {
		return this.nivelcentrocostoBeanSwingJInternalFrameAdditional;
	}
	
	public void setNivelCentroCostoBeanSwingJInternalFrameAdditional(NivelCentroCostoBeanSwingJInternalFrameAdditional nivelcentrocostoBeanSwingJInternalFrameAdditional) {
		try {
			this.nivelcentrocostoBeanSwingJInternalFrameAdditional=nivelcentrocostoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NivelCentroCostoLogic nivelcentrocostoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NivelCentroCosto nivelcentrocostoBean;
	public NivelCentroCostoConstantesFunciones nivelcentrocostoConstantesFunciones;
	//public NivelCentroCostoParameterReturnGeneral nivelcentrocostoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<NivelCentroCosto> nivelcentrocostos;	
	//public List<NivelCentroCosto> nivelcentrocostosEliminados;
	//public List<NivelCentroCosto> nivelcentrocostosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaDuplicarNivelCentroCosto=true;
	public Boolean isVisibilidadCeldaCopiarNivelCentroCosto=true;
	public Boolean isVisibilidadCeldaVerFormNivelCentroCosto=true;
	public Boolean isVisibilidadCeldaOrdenNivelCentroCosto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaModificarNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaActualizarNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaEliminarNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaCancelarNivelCentroCosto=false;
	public Boolean isVisibilidadCeldaGuardarNivelCentroCosto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoNivelCentroCosto() {
		return this.iIdNuevoNivelCentroCosto;
	}

	public void setiIdNuevoNivelCentroCosto(Long iIdNuevoNivelCentroCosto) {
		this.iIdNuevoNivelCentroCosto = iIdNuevoNivelCentroCosto;
	}
	
	public Long getidNivelCentroCostoActual() {
		return this.idNivelCentroCostoActual;
	}

	public void setidNivelCentroCostoActual(Long idNivelCentroCostoActual) {
		this.idNivelCentroCostoActual = idNivelCentroCostoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NivelCentroCosto getnivelcentrocosto() {
		return this.nivelcentrocosto;
	}

	public void setnivelcentrocosto(NivelCentroCosto nivelcentrocosto) {
		this.nivelcentrocosto = nivelcentrocosto;
	}
	
	public NivelCentroCosto getnivelcentrocostoAux() {
		return this.nivelcentrocostoAux;
	}

	public void setnivelcentrocostoAux(NivelCentroCosto nivelcentrocostoAux) {
		this.nivelcentrocostoAux = nivelcentrocostoAux;
	}				
	
	public NivelCentroCosto getnivelcentrocostoAnterior() {
		return this.nivelcentrocostoAnterior;
	}

	public void setnivelcentrocostoAnterior(NivelCentroCosto nivelcentrocostoAnterior) {
		this.nivelcentrocostoAnterior = nivelcentrocostoAnterior;
	}	
	
	public NivelCentroCosto getnivelcentrocostoTotales() {
		return this.nivelcentrocostoTotales;
	}

	public void setnivelcentrocostoTotales(NivelCentroCosto nivelcentrocostoTotales) {
		this.nivelcentrocostoTotales = nivelcentrocostoTotales;
	}	
	
	public NivelCentroCosto getnivelcentrocostoBean() {
		return this.nivelcentrocostoBean;
	}

	public void setnivelcentrocostoBean(NivelCentroCosto nivelcentrocostoBean) {
		this.nivelcentrocostoBean = nivelcentrocostoBean;
	}	
	
	public NivelCentroCostoParameterReturnGeneral getnivelcentrocostoReturnGeneral() {
		return this.nivelcentrocostoReturnGeneral;
	}

	public void setnivelcentrocostoReturnGeneral(NivelCentroCostoParameterReturnGeneral nivelcentrocostoReturnGeneral) {
		this.nivelcentrocostoReturnGeneral = nivelcentrocostoReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NivelCentroCostoLogic getNivelCentroCostoLogic()	{		
		return nivelcentrocostoLogic;
	}

	public void setNivelCentroCostoLogic(NivelCentroCostoLogic nivelcentrocostoLogic) {
		this.nivelcentrocostoLogic = nivelcentrocostoLogic;
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
	
	public Boolean getIsEsNuevoNivelCentroCosto() {
		return isEsNuevoNivelCentroCosto;
	}

	public void setIsEsNuevoNivelCentroCosto(Boolean isEsNuevoNivelCentroCosto) {
		this.isEsNuevoNivelCentroCosto = isEsNuevoNivelCentroCosto;
	}

	public Boolean getEsParaAccionDesdeFormularioNivelCentroCosto() {
		return esParaAccionDesdeFormularioNivelCentroCosto;
	}
	
	public void setEsParaAccionDesdeFormularioNivelCentroCosto(Boolean esParaAccionDesdeFormularioNivelCentroCosto) {
		this.esParaAccionDesdeFormularioNivelCentroCosto = esParaAccionDesdeFormularioNivelCentroCosto;
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

			if(this.nivelcentrocostoSessionBean==null) {
				this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
			}

			if(!this.nivelcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(nivelcentrocostoSessionBean.getlidEmpresaActual());
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

					if(this.nivelcentrocosto!=null) {
						this.nivelcentrocosto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
						this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNivelCentroCosto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
						if(this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.getItemCount()>0) {
							this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNivelCentroCostoGenerico)throws Exception
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
				jComboBoxid_empresaNivelCentroCostoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNivelCentroCostoGenerico!=null && jComboBoxid_empresaNivelCentroCostoGenerico.getItemCount()>0) {
					jComboBoxid_empresaNivelCentroCostoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NivelCentroCosto nivelcentrocosto,JComboBox jComboBoxid_empresaNivelCentroCostoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNivelCentroCostoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNivelCentroCostoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				nivelcentrocosto.setid_empresa(empresaAux.getId());
				nivelcentrocosto.setempresa_descripcion(NivelCentroCostoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				nivelcentrocosto.setEmpresa(empresaAux);			}
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

					if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { 
							this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { 
					}

					if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
							this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
							this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesNivelCentroCosto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NivelCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesNivelCentroCosto(this.nivelcentrocostoLogic.getNivelCentroCostos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NivelCentroCostoConstantesFunciones.refrescarForeignKeysDescripcionesNivelCentroCosto(this.nivelcentrocostos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//nivelcentrocostoLogic.setNivelCentroCostos(this.nivelcentrocostos);
			nivelcentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NivelCentroCostoParameterReturnGeneral getNivelCentroCostoParameterGeneral() {
		return this.nivelcentrocostoParameterGeneral;
	}
	
	public void setNivelCentroCostoParameterGeneral(NivelCentroCostoParameterReturnGeneral nivelcentrocostoParameterGeneral) {
		this.nivelcentrocostoParameterGeneral = nivelcentrocostoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNivelCentroCosto() {
		return isPermisoTodoNivelCentroCosto;
	}

	public void setIsPermisoTodoNivelCentroCosto(Boolean isPermisoTodoNivelCentroCosto) {
		this.isPermisoTodoNivelCentroCosto = isPermisoTodoNivelCentroCosto;
	}

	public Boolean getIsPermisoNuevoNivelCentroCosto() {
		return isPermisoNuevoNivelCentroCosto;
	}

	public void setIsPermisoNuevoNivelCentroCosto(Boolean isPermisoNuevoNivelCentroCosto) {
		this.isPermisoNuevoNivelCentroCosto = isPermisoNuevoNivelCentroCosto;
	}

	public Boolean getIsPermisoActualizarNivelCentroCosto() {
		return isPermisoActualizarNivelCentroCosto;
	}

	public void setIsPermisoActualizarNivelCentroCosto(Boolean isPermisoActualizarNivelCentroCosto) {
		this.isPermisoActualizarNivelCentroCosto = isPermisoActualizarNivelCentroCosto;
	}

	public Boolean getIsPermisoEliminarNivelCentroCosto() {
		return isPermisoEliminarNivelCentroCosto;
	}

	public void setIsPermisoEliminarNivelCentroCosto(Boolean isPermisoEliminarNivelCentroCosto) {
		this.isPermisoEliminarNivelCentroCosto = isPermisoEliminarNivelCentroCosto;
	}

	public Boolean getIsPermisoGuardarCambiosNivelCentroCosto() {
		return isPermisoGuardarCambiosNivelCentroCosto;
	}

	public void setIsPermisoGuardarCambiosNivelCentroCosto(Boolean isPermisoGuardarCambiosNivelCentroCosto) {
		this.isPermisoGuardarCambiosNivelCentroCosto = isPermisoGuardarCambiosNivelCentroCosto;
	}
	
	public Boolean getIsPermisoConsultaNivelCentroCosto() {
		return isPermisoConsultaNivelCentroCosto;
	}

	public void setIsPermisoConsultaNivelCentroCosto(Boolean isPermisoConsultaNivelCentroCosto) {
		this.isPermisoConsultaNivelCentroCosto = isPermisoConsultaNivelCentroCosto;
	}

	public Boolean getIsPermisoBusquedaNivelCentroCosto() {
		return isPermisoBusquedaNivelCentroCosto;
	}

	public void setIsPermisoBusquedaNivelCentroCosto(Boolean isPermisoBusquedaNivelCentroCosto) {
		this.isPermisoBusquedaNivelCentroCosto = isPermisoBusquedaNivelCentroCosto;
	}

	public Boolean getIsPermisoReporteNivelCentroCosto() {
		return isPermisoReporteNivelCentroCosto;
	}

	public void setIsPermisoReporteNivelCentroCosto(Boolean isPermisoReporteNivelCentroCosto) {
		this.isPermisoReporteNivelCentroCosto = isPermisoReporteNivelCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionMedioNivelCentroCosto() {
		return isPermisoPaginacionMedioNivelCentroCosto;
	}

	public void setIsPermisoPaginacionMedioNivelCentroCosto(Boolean isPermisoPaginacionMedioNivelCentroCosto) {
		this.isPermisoPaginacionMedioNivelCentroCosto = isPermisoPaginacionMedioNivelCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionTodoNivelCentroCosto() {
		return isPermisoPaginacionTodoNivelCentroCosto;
	}

	public void setIsPermisoPaginacionTodoNivelCentroCosto(Boolean isPermisoPaginacionTodoNivelCentroCosto) {
		this.isPermisoPaginacionTodoNivelCentroCosto = isPermisoPaginacionTodoNivelCentroCosto;
	}
	
	public Boolean getIsPermisoPaginacionAltoNivelCentroCosto() {
		return isPermisoPaginacionAltoNivelCentroCosto;
	}

	public void setIsPermisoPaginacionAltoNivelCentroCosto(Boolean isPermisoPaginacionAltoNivelCentroCosto) {
		this.isPermisoPaginacionAltoNivelCentroCosto = isPermisoPaginacionAltoNivelCentroCosto;
	}
	
	public Boolean getIsPermisoCopiarNivelCentroCosto() {
		return isPermisoCopiarNivelCentroCosto;
	}

	public void setIsPermisoCopiarNivelCentroCosto(Boolean isPermisoCopiarNivelCentroCosto) {
		this.isPermisoCopiarNivelCentroCosto = isPermisoCopiarNivelCentroCosto;
	}
	
	public Boolean getIsPermisoVerFormNivelCentroCosto() {
		return isPermisoVerFormNivelCentroCosto;
	}

	public void setIsPermisoVerFormNivelCentroCosto(Boolean isPermisoVerFormNivelCentroCosto) {
		this.isPermisoVerFormNivelCentroCosto = isPermisoVerFormNivelCentroCosto;
	}
	
	public Boolean getIsPermisoDuplicarNivelCentroCosto() {
		return isPermisoDuplicarNivelCentroCosto;
	}

	public void setIsPermisoDuplicarNivelCentroCosto(Boolean isPermisoDuplicarNivelCentroCosto) {
		this.isPermisoDuplicarNivelCentroCosto = isPermisoDuplicarNivelCentroCosto;
	}
	
	public Boolean getIsPermisoOrdenNivelCentroCosto() {
		return isPermisoOrdenNivelCentroCosto;
	}

	public void setIsPermisoOrdenNivelCentroCosto(Boolean isPermisoOrdenNivelCentroCosto) {
		this.isPermisoOrdenNivelCentroCosto = isPermisoOrdenNivelCentroCosto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNivelCentroCosto() {
		return isVisibilidadCeldaNuevoNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoNivelCentroCosto(Boolean isVisibilidadCeldaNuevoNivelCentroCosto) {
		this.isVisibilidadCeldaNuevoNivelCentroCosto = isVisibilidadCeldaNuevoNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNivelCentroCosto() {
		return isVisibilidadCeldaDuplicarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaDuplicarNivelCentroCosto(Boolean isVisibilidadCeldaDuplicarNivelCentroCosto) {
		this.isVisibilidadCeldaDuplicarNivelCentroCosto = isVisibilidadCeldaDuplicarNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNivelCentroCosto() {
		return isVisibilidadCeldaCopiarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaCopiarNivelCentroCosto(Boolean isVisibilidadCeldaCopiarNivelCentroCosto) {
		this.isVisibilidadCeldaCopiarNivelCentroCosto = isVisibilidadCeldaCopiarNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNivelCentroCosto() {
		return isVisibilidadCeldaVerFormNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaVerFormNivelCentroCosto(Boolean isVisibilidadCeldaVerFormNivelCentroCosto) {
		this.isVisibilidadCeldaVerFormNivelCentroCosto = isVisibilidadCeldaVerFormNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNivelCentroCosto() {
		return isVisibilidadCeldaOrdenNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaOrdenNivelCentroCosto(Boolean isVisibilidadCeldaOrdenNivelCentroCosto) {
		this.isVisibilidadCeldaOrdenNivelCentroCosto = isVisibilidadCeldaOrdenNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNivelCentroCosto() {
		return isVisibilidadCeldaNuevoRelacionesNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNivelCentroCosto(Boolean isVisibilidadCeldaNuevoRelacionesNivelCentroCosto) {
		this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto = isVisibilidadCeldaNuevoRelacionesNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNivelCentroCosto() {
		return isVisibilidadCeldaModificarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaModificarNivelCentroCosto(Boolean isVisibilidadCeldaModificarNivelCentroCosto) {
		this.isVisibilidadCeldaModificarNivelCentroCosto = isVisibilidadCeldaModificarNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNivelCentroCosto() {
		return isVisibilidadCeldaActualizarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaActualizarNivelCentroCosto(Boolean isVisibilidadCeldaActualizarNivelCentroCosto) {
		this.isVisibilidadCeldaActualizarNivelCentroCosto = isVisibilidadCeldaActualizarNivelCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaEliminarNivelCentroCosto() {
		return isVisibilidadCeldaEliminarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaEliminarNivelCentroCosto(Boolean isVisibilidadCeldaEliminarNivelCentroCosto) {
		this.isVisibilidadCeldaEliminarNivelCentroCosto = isVisibilidadCeldaEliminarNivelCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaCancelarNivelCentroCosto() {
		return isVisibilidadCeldaCancelarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaCancelarNivelCentroCosto(Boolean isVisibilidadCeldaCancelarNivelCentroCosto) {
		this.isVisibilidadCeldaCancelarNivelCentroCosto = isVisibilidadCeldaCancelarNivelCentroCosto;
	}

	public Boolean getIsVisibilidadCeldaGuardarNivelCentroCosto() {
		return isVisibilidadCeldaGuardarNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarNivelCentroCosto(Boolean isVisibilidadCeldaGuardarNivelCentroCosto) {
		this.isVisibilidadCeldaGuardarNivelCentroCosto = isVisibilidadCeldaGuardarNivelCentroCosto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNivelCentroCosto() {
		return isVisibilidadCeldaGuardarCambiosNivelCentroCosto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNivelCentroCosto(Boolean isVisibilidadCeldaGuardarCambiosNivelCentroCosto) {
		this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto = isVisibilidadCeldaGuardarCambiosNivelCentroCosto;
	}
		
	public NivelCentroCostoSessionBean getnivelcentrocostoSessionBean() {
		return this.nivelcentrocostoSessionBean;
	}
	
	public void setnivelcentrocostoSessionBean(NivelCentroCostoSessionBean nivelcentrocostoSessionBean) {
		this.nivelcentrocostoSessionBean=nivelcentrocostoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(NivelCentroCosto nivelcentrocosto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(nivelcentrocosto,null);
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
	
	public void bugActualizarReferenciaActual(NivelCentroCosto nivelcentrocosto,NivelCentroCosto nivelcentrocostoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNivelCentroCosto(nivelcentrocosto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		nivelcentrocostoAux.setId(nivelcentrocosto.getId());
		nivelcentrocostoAux.setVersionRow(nivelcentrocosto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNivelCentroCosto();
		
			int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = nivelcentrocostoValidator.getInvalidValues(this.nivelcentrocosto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			nivelcentrocostoLogic.setDatosCliente(datosCliente);
			nivelcentrocostoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				nivelcentrocostoAux=new  NivelCentroCosto();
				
				nivelcentrocostoAux.setIsNew(true);
				nivelcentrocostoAux.setIsChanged(true);
				
				nivelcentrocostoAux.setNivelCentroCostoOriginal(this.nivelcentrocosto);
				
				nivelcentrocostoAux.setId(this.nivelcentrocosto.getId());	
				nivelcentrocostoAux.setVersionRow(this.nivelcentrocosto.getVersionRow());	
				nivelcentrocostoAux.setid_empresa(this.nivelcentrocosto.getid_empresa());	
				nivelcentrocostoAux.setnivel(this.nivelcentrocosto.getnivel());	
				nivelcentrocostoAux.setnumero_digitos(this.nivelcentrocosto.getnumero_digitos());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoLogic.saveNivelCentroCostos();//WithConnection
						//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesNivelCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcentrocostoLogic.saveNivelCentroCostoRelaciones(nivelcentrocostoAux);//WithConnection
								//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				nivelcentrocostoAux=new  NivelCentroCosto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() 
					|| (this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() && this.nivelcentrocosto.getId()>=0)) {
						
					nivelcentrocostoAux.setIsNew(false);
				}
				
				nivelcentrocostoAux.setIsDeleted(false);
			
				nivelcentrocostoAux.setId(this.nivelcentrocosto.getId());	
				nivelcentrocostoAux.setVersionRow(this.nivelcentrocosto.getVersionRow());	
				nivelcentrocostoAux.setid_empresa(this.nivelcentrocosto.getid_empresa());	
				nivelcentrocostoAux.setnivel(this.nivelcentrocosto.getnivel());	
				nivelcentrocostoAux.setnumero_digitos(this.nivelcentrocosto.getnumero_digitos());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoLogic.saveNivelCentroCostos();//WithConnection
						//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);
					
					this.refrescarForeignKeysDescripcionesNivelCentroCosto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcentrocostoLogic.saveNivelCentroCostoRelaciones(nivelcentrocostoAux);//WithConnection
								//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcentrocosto,nivelcentrocostoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				nivelcentrocostoAux=new  NivelCentroCosto();
				
				nivelcentrocostoAux.setIsNew(false);
				nivelcentrocostoAux.setIsChanged(false);
				
				nivelcentrocostoAux.setIsDeleted(true);
				
				nivelcentrocostoAux.setId(this.nivelcentrocosto.getId());	
				nivelcentrocostoAux.setVersionRow(this.nivelcentrocosto.getVersionRow());	
				nivelcentrocostoAux.setid_empresa(this.nivelcentrocosto.getid_empresa());	
				nivelcentrocostoAux.setnivel(this.nivelcentrocosto.getnivel());	
				nivelcentrocostoAux.setnumero_digitos(this.nivelcentrocosto.getnumero_digitos());	
				
				if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.nivelcentrocostoAux.getId()>=0) {	
						this.nivelcentrocostosEliminados.add(nivelcentrocostoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoLogic.saveNivelCentroCostos();//WithConnection
						//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcentrocostoLogic.saveNivelCentroCostoRelaciones(nivelcentrocostoAux);//WithConnection
								//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
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
							if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(nivelcentrocostoAux,nivelcentrocostoLogic.getNivelCentroCostos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(nivelcentrocostoAux,nivelcentrocostos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.getNivelCentroCostos().addAll(this.nivelcentrocostosEliminados);
					
					nivelcentrocostoLogic.saveNivelCentroCostos();//WithConnection
					//nivelcentrocostoLogic.getSetVersionRowNivelCentroCostos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNivelCentroCosto();
				
				this.nivelcentrocostosEliminados= new ArrayList<NivelCentroCosto>();		
			}
			
			if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Nivel Centro Costo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.nivelcentrocosto=nivelcentrocostoAux;
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
      		//this.finishProcessNivelCentroCosto();
      	}
		
	}	
	
	public void actualizarRelaciones(NivelCentroCosto nivelcentrocostoLocal) throws Exception {
		
		if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NivelCentroCosto nivelcentrocostoLocal) throws Exception {	
		if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				nivelcentrocostoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNivelCentroCostoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = nivelcentrocostoValidator.getInvalidValues(this.nivelcentrocosto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NivelCentroCosto nivelcentrocosto,List<NivelCentroCosto> nivelcentrocostos) throws Exception {
		try	{		
			NivelCentroCostoConstantesFunciones.actualizarLista(nivelcentrocosto,nivelcentrocostos,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NivelCentroCosto nivelcentrocosto,List<NivelCentroCosto> nivelcentrocostos) throws Exception {
		try	{			
			NivelCentroCostoConstantesFunciones.actualizarSelectedLista(nivelcentrocosto,nivelcentrocostos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NivelCentroCosto> nivelcentrocostosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				nivelcentrocostosLocal=this.nivelcentrocostoLogic.getNivelCentroCostos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				nivelcentrocostosLocal=this.nivelcentrocostos;
			}
			//ARCHITECTURE
		
			for(NivelCentroCosto nivelcentrocostoLocal:nivelcentrocostosLocal) {
				if(this.permiteMantenimiento(nivelcentrocostoLocal) && nivelcentrocostoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NivelCentroCostoConstantesFunciones.getNivelCentroCostoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NivelCentroCostoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelid_empresaNivelCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NivelCentroCostoConstantesFunciones.NIVEL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnivelNivelCentroCosto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NivelCentroCostoConstantesFunciones.NUMERODIGITOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnumero_digitosNivelCentroCosto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelid_empresaNivelCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnivelNivelCentroCosto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnumero_digitosNivelCentroCosto,"");
		
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
		this.iIdNuevoNivelCentroCosto--;	
		
		
		this.nivelcentrocostoAux=new NivelCentroCosto();
		
		this.nivelcentrocostoAux.setId(this.iIdNuevoNivelCentroCosto);
		this.nivelcentrocostoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcentrocostoLogic.getNivelCentroCostos().add(this.nivelcentrocostoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.nivelcentrocostos.add(this.nivelcentrocostoAux);
		}
		//ARCHITECTURE
		
		this.nivelcentrocosto=this.nivelcentrocostoAux;
		
		if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocosto);
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCentroCosto(this.nivelcentrocosto);
		}
				
		//this.setDefaultControlesNivelCentroCosto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNivelCentroCosto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNivelCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCentroCosto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCentroCosto(this.nivelcentrocostoBean,this.nivelcentrocosto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NivelCentroCostoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
			classes=NivelCentroCostoConstantesFunciones.getClassesRelationshipsOfNivelCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.procesarEventosNivelCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcentrocostoLogic.getNivelCentroCostos(),this.nivelcentrocosto,this.nivelcentrocostoParameterGeneral,this.isEsNuevoNivelCentroCosto,classes);//this.nivelcentrocostoLogic.getNivelCentroCosto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNivelCentroCosto(this.nivelcentrocostoReturnGeneral,this.nivelcentrocostoBean,false);
		
		if(this.nivelcentrocostoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto());
		}
		
		if(this.nivelcentrocostoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto(),classes);//this.nivelcentrocostoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNivelCentroCosto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNivelCentroCosto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.RecargarFormNivelCentroCosto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNivelCentroCosto(false);
						
			if(nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCentroCosto();
			}
			
			this.actualizarVisualTableDatosNivelCentroCosto();
			
			this.jTableDatosNivelCentroCosto.setRowSelectionInterval(this.getIndiceNuevoNivelCentroCosto(), this.getIndiceNuevoNivelCentroCosto());
			
			this.seleccionarFilaTablaNivelCentroCostoActual();
						
			this.actualizarEstadoCeldasBotonesNivelCentroCosto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNivelCentroCosto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setEnabled(isHabilitar && this.nivelcentrocostoConstantesFunciones.activarnivelNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setEnabled(isHabilitar && this.nivelcentrocostoConstantesFunciones.activarnumero_digitosNivelCentroCosto);	
		//
		this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setEnabled(isHabilitar && this.nivelcentrocostoConstantesFunciones.activarid_empresaNivelCentroCosto);
	};
	
	public void setDefaultControlesNivelCentroCosto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNivelCentroCosto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.nivelcentrocostoSessionBean.setConGuardarRelaciones(true);			
			this.nivelcentrocostoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.setVisible(true);
			
					
		} else {
			//this.nivelcentrocostoSessionBean.setConGuardarRelaciones(false);			
			this.nivelcentrocostoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoNivelCentroCosto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
				if(nivelcentrocostoAux.getId().equals(this.iIdNuevoNivelCentroCosto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostos) {
				if(nivelcentrocostoAux.getId().equals(this.iIdNuevoNivelCentroCosto)) {
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
	
	public int getIndiceActualNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
				if(nivelcentrocostoAux.getId().equals(nivelcentrocosto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostos) {
				if(nivelcentrocostoAux.getId().equals(nivelcentrocosto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNivelCentroCosto(NivelCentroCosto nivelcentrocostoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
				if(nivelcentrocostoAux.getNivelCentroCostoOriginal().getId().equals(nivelcentrocostoOriginal.getId())) {
					existe=true;
					nivelcentrocostoOriginal.setId(nivelcentrocostoAux.getId());
					nivelcentrocostoOriginal.setVersionRow(nivelcentrocostoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostos) {
				if(nivelcentrocostoAux.getNivelCentroCostoOriginal().getId().equals(nivelcentrocostoOriginal.getId())) {
					existe=true;
					nivelcentrocostoOriginal.setId(nivelcentrocostoAux.getId());
					nivelcentrocostoOriginal.setVersionRow(nivelcentrocostoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNivelCentroCosto(Boolean esParaCancelar) throws Exception {
		nivelcentrocostosAux=new ArrayList<NivelCentroCosto>();
		nivelcentrocostoAux=new NivelCentroCosto();
		
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
					if(nivelcentrocostoAux.getId()<0) {
						nivelcentrocostosAux.add(nivelcentrocostoAux);
					}		
				}
				this.iIdNuevoNivelCentroCosto=0L;
				this.nivelcentrocostoLogic.getNivelCentroCostos().removeAll(nivelcentrocostosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostos) {
					if(nivelcentrocostoAux.getId()<0) {
						nivelcentrocostosAux.add(nivelcentrocostoAux);
					}		
				}
				this.iIdNuevoNivelCentroCosto=0L;
				this.nivelcentrocostos.removeAll(nivelcentrocostosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNivelCentroCosto 
					&& this.nivelcentrocostoLogic.getNivelCentroCostos().size()>0
					) {
					nivelcentrocostoAux=this.nivelcentrocostoLogic.getNivelCentroCostos().get(this.nivelcentrocostoLogic.getNivelCentroCostos().size() - 1);
				
					if(nivelcentrocostoAux.getId()<0) {
						this.nivelcentrocostoLogic.getNivelCentroCostos().remove(nivelcentrocostoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNivelCentroCosto && this.nivelcentrocostos.size()>0) {
					nivelcentrocostoAux=this.nivelcentrocostos.get(this.nivelcentrocostos.size() - 1);
				
					if(nivelcentrocostoAux.getId()<0) {
						this.nivelcentrocostos.remove(nivelcentrocostoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNivelCentroCosto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(nivelcentrocosto.getId()<0) {
				this.nivelcentrocostoLogic.getNivelCentroCostos().remove(this.nivelcentrocosto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(nivelcentrocosto.getId()<0) {
				this.nivelcentrocostos.remove(this.nivelcentrocosto);
			}
		}			
	}
	
	public void setEstadosInicialesNivelCentroCosto(List<NivelCentroCosto> nivelcentrocostosAux) throws Exception {
		NivelCentroCostoConstantesFunciones.setEstadosInicialesNivelCentroCosto(nivelcentrocostosAux);
	}
	
	public void setEstadosInicialesNivelCentroCosto(NivelCentroCosto nivelcentrocostoAux) throws Exception {
		NivelCentroCostoConstantesFunciones.setEstadosInicialesNivelCentroCosto(nivelcentrocostoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNivelCentroCostoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNivelCentroCostoActual()) {
				if(!this.isEsNuevoNivelCentroCosto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNivelCentroCosto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNivelCentroCostoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Nivel Centro Costo ?", "MANTENIMIENTO DE Nivel Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NivelCentroCosto nivelcentrocosto) throws Exception {
		NivelCentroCostoConstantesFunciones.seleccionarAsignar(this.nivelcentrocosto,nivelcentrocosto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNivelCentroCosto=this.isPermisoActualizarOriginalNivelCentroCosto;
			
			
			this.seleccionarAsignar(nivelcentrocosto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCentroCostoConstantesFunciones.quitarEspaciosNivelCentroCosto(this.nivelcentrocosto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNivelCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.nivelcentrocostoSessionBean.setsFuncionBusquedaRapida(this.nivelcentrocostoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNivelCentroCosto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNivelCentroCosto(esParaCancelar);				
				this.cancelarNuevoNivelCentroCosto(esParaCancelar);								
			}
			
			this.nivelcentrocosto=new NivelCentroCosto();
			
			this.inicializarNivelCentroCosto();
			
			this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNivelCentroCosto() throws Exception {
		try {
			NivelCentroCostoConstantesFunciones.inicializarNivelCentroCosto(this.nivelcentrocosto);
			
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
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.nivelcentrocostoLogic.getNivelCentroCostos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNivelCentroCostos(String sAccionBusqueda,List<NivelCentroCosto> nivelcentrocostosParaReportes) throws Exception {
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
					sPathReporteFinal="NivelCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NivelCentroCostoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NivelCentroCostoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NivelCentroCosto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Nivel Centro Costos");		
		parameters.put("busquedapor", NivelCentroCostoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNivelCentroCosto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NivelCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NivelCentroCostoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNivelCentroCosto=new JRBeanArrayDataSource(NivelCentroCostoJInternalFrame.TraerNivelCentroCostoBeans(nivelcentrocostosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNivelCentroCosto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NivelCentroCostoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NivelCentroCostoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NivelCentroCostoBean.TraerNivelCentroCostoBeans(nivelcentrocostosParaReportes).toArray()));
							
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
				this.generarExcelReporteNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNivelCentroCostoActionPerformed(null);
					//this.generarExcelReporteNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNivelCentroCostos(sAccionBusqueda,sTipoArchivoReporte,nivelcentrocostosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNivelCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCentroCosto> nivelcentrocostosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCentroCostos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCentroCosto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NivelCentroCosto nivelcentrocosto : nivelcentrocostosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NivelCentroCostoConstantesFunciones.generarExcelReporteDataNivelCentroCosto("NORMAL",row,workbook,nivelcentrocosto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNivelCentroCosto(String sTipo,Row row,Workbook workbook) {
		
		NivelCentroCostoConstantesFunciones.generarExcelReporteHeaderNivelCentroCosto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNivelCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCentroCosto> nivelcentrocostosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NivelCentroCosto nivelcentrocosto : nivelcentrocostosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NivelCentroCostoConstantesFunciones.getNivelCentroCostoDescripcion(nivelcentrocosto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcentrocosto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCentroCostoConstantesFunciones.LABEL_NIVEL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NIVEL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcentrocosto.getnivel());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcentrocosto.getnumero_digitos());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNivelCentroCostos(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCentroCosto> nivelcentrocostosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NivelCentroCosto> nivelcentrocostosRespaldo=null;
		
		classes=NivelCentroCostoConstantesFunciones.getClassesRelationshipsOfNivelCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.nivelcentrocostoLogic.setDatosCliente(this.datosCliente);
		this.nivelcentrocostoLogic.setDatosDeep(this.datosDeep);
		this.nivelcentrocostoLogic.setIsConDeep(true);
		
		nivelcentrocostosRespaldo=this.nivelcentrocostoLogic.getNivelCentroCostos();
		
		this.nivelcentrocostoLogic.setNivelCentroCostos(nivelcentrocostosParaReportes);	
		this.nivelcentrocostoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		nivelcentrocostosParaReportes=this.nivelcentrocostoLogic.getNivelCentroCostos();
		this.nivelcentrocostoLogic.setNivelCentroCostos(nivelcentrocostosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCentroCostos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCentroCosto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NivelCentroCosto nivelcentrocosto : nivelcentrocostosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNivelCentroCosto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NivelCentroCostoConstantesFunciones.generarExcelReporteDataNivelCentroCosto("NORMAL",row,workbook,nivelcentrocosto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(NivelCentroCostoConstantesFunciones.getNivelCentroCostoDescripcion(nivelcentrocosto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNivelCentroCosto() throws Exception {		
		this.startProcessNivelCentroCosto(true);
	}
	
	public void startProcessNivelCentroCosto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNivelCentroCosto ,this.jPanelParametrosReportesNivelCentroCosto, this.jScrollPanelDatosNivelCentroCosto,this.jPanelPaginacionNivelCentroCosto, this.jScrollPanelDatosEdicionNivelCentroCosto, this.jPanelAccionesNivelCentroCosto,this.jPanelAccionesFormularioNivelCentroCosto,this.jmenuBarNivelCentroCosto,this.jmenuBarDetalleNivelCentroCosto,this.jTtoolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCentroCosto=this.jTabbedPaneBusquedasNivelCentroCosto; 
		
		final JPanel jPanelParametrosReportesNivelCentroCosto=this.jPanelParametrosReportesNivelCentroCosto;
		//final JScrollPane jScrollPanelDatosNivelCentroCosto=this.jScrollPanelDatosNivelCentroCosto;
		final JTable jTableDatosNivelCentroCosto=this.jTableDatosNivelCentroCosto;		
		final JPanel jPanelPaginacionNivelCentroCosto=this.jPanelPaginacionNivelCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionNivelCentroCosto=this.jScrollPanelDatosEdicionNivelCentroCosto;
		final JPanel jPanelAccionesNivelCentroCosto=this.jPanelAccionesNivelCentroCosto;
		
		JPanel jPanelCamposAuxiliarNivelCentroCosto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNivelCentroCosto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			jPanelCamposAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jPanelCamposNivelCentroCosto;
			jPanelAccionesFormularioAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jPanelAccionesFormularioNivelCentroCosto;
		}
		
		final JPanel jPanelCamposNivelCentroCosto=jPanelCamposAuxiliarNivelCentroCosto;
		final JPanel jPanelAccionesFormularioNivelCentroCosto=jPanelAccionesFormularioAuxiliarNivelCentroCosto;
		
		
		final JMenuBar jmenuBarNivelCentroCosto=this.jmenuBarNivelCentroCosto;
		final JToolBar jTtoolBarNivelCentroCosto=this.jTtoolBarNivelCentroCosto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNivelCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCentroCosto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			jmenuBarDetalleAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jmenuBarDetalleNivelCentroCosto;
			jTtoolBarDetalleAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jTtoolBarDetalleNivelCentroCosto;
		}
		
		final JMenuBar jmenuBarDetalleNivelCentroCosto=jmenuBarDetalleAuxiliarNivelCentroCosto;
		final JToolBar jTtoolBarDetalleNivelCentroCosto=jTtoolBarDetalleAuxiliarNivelCentroCosto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCentroCosto;
			processRunnable.jTableDatos=jTableDatosNivelCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposNivelCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarNivelCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelCentroCosto ,jPanelParametrosReportesNivelCentroCosto,jTableDatosNivelCentroCosto, /*jScrollPanelDatosNivelCentroCosto,*/jPanelCamposNivelCentroCosto,jPanelPaginacionNivelCentroCosto, /*jScrollPanelDatosEdicionNivelCentroCosto,*/ jPanelAccionesNivelCentroCosto,jPanelAccionesFormularioNivelCentroCosto,jmenuBarNivelCentroCosto,jmenuBarDetalleNivelCentroCosto,jTtoolBarNivelCentroCosto,jTtoolBarDetalleNivelCentroCosto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelCentroCosto ,jPanelParametrosReportesNivelCentroCosto, jScrollPanelDatosNivelCentroCosto,jPanelPaginacionNivelCentroCosto, jScrollPanelDatosEdicionNivelCentroCosto, jPanelAccionesNivelCentroCosto,jPanelAccionesFormularioNivelCentroCosto,jmenuBarNivelCentroCosto,jmenuBarDetalleNivelCentroCosto,jTtoolBarNivelCentroCosto,jTtoolBarDetalleNivelCentroCosto);
						
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
	
	public void finishProcessNivelCentroCosto() {// throws Exception 
		this.finishProcessNivelCentroCosto(true);
	}
	
	public void finishProcessNivelCentroCosto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNivelCentroCosto ,this.jPanelParametrosReportesNivelCentroCosto, this.jScrollPanelDatosNivelCentroCosto,this.jPanelPaginacionNivelCentroCosto, this.jScrollPanelDatosEdicionNivelCentroCosto, this.jPanelAccionesNivelCentroCosto,this.jPanelAccionesFormularioNivelCentroCosto,this.jmenuBarNivelCentroCosto,this.jmenuBarDetalleNivelCentroCosto,this.jTtoolBarNivelCentroCosto,this.jTtoolBarDetalleNivelCentroCosto);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCentroCosto=this.jTabbedPaneBusquedasNivelCentroCosto; 
		
		final JPanel jPanelParametrosReportesNivelCentroCosto=this.jPanelParametrosReportesNivelCentroCosto;
		//final JScrollPane jScrollPanelDatosNivelCentroCosto=this.jScrollPanelDatosNivelCentroCosto;
		final JTable jTableDatosNivelCentroCosto=this.jTableDatosNivelCentroCosto;		
		final JPanel jPanelPaginacionNivelCentroCosto=this.jPanelPaginacionNivelCentroCosto;
		//final JScrollPane jScrollPanelDatosEdicionNivelCentroCosto=this.jScrollPanelDatosEdicionNivelCentroCosto;
		final JPanel jPanelAccionesNivelCentroCosto=this.jPanelAccionesNivelCentroCosto;
		
		JPanel jPanelCamposAuxiliarNivelCentroCosto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNivelCentroCosto=new JPanel();
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			jPanelCamposAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jPanelCamposNivelCentroCosto;
			jPanelAccionesFormularioAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jPanelAccionesFormularioNivelCentroCosto;
		}
		
		final JPanel jPanelCamposNivelCentroCosto=jPanelCamposAuxiliarNivelCentroCosto;
		final JPanel jPanelAccionesFormularioNivelCentroCosto=jPanelAccionesFormularioAuxiliarNivelCentroCosto;
		
		
		final JMenuBar jmenuBarNivelCentroCosto=this.jmenuBarNivelCentroCosto;		
		final JToolBar jTtoolBarNivelCentroCosto=this.jTtoolBarNivelCentroCosto;
				
		JMenuBar jmenuBarDetalleAuxiliarNivelCentroCosto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCentroCosto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			jmenuBarDetalleAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jmenuBarDetalleNivelCentroCosto;
			jTtoolBarDetalleAuxiliarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jTtoolBarDetalleNivelCentroCosto;		
		}
		
		final JMenuBar jmenuBarDetalleNivelCentroCosto=jmenuBarDetalleAuxiliarNivelCentroCosto;
		final JToolBar jTtoolBarDetalleNivelCentroCosto=jTtoolBarDetalleAuxiliarNivelCentroCosto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCentroCosto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCentroCosto;
			processRunnable.jTableDatos=jTableDatosNivelCentroCosto;
			processRunnable.jPanelCampos=jPanelCamposNivelCentroCosto;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCentroCosto;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCentroCosto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCentroCosto;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCentroCosto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCentroCosto;
			processRunnable.jTtoolBar=jTtoolBarNivelCentroCosto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCentroCosto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNivelCentroCosto ,jPanelParametrosReportesNivelCentroCosto, jTableDatosNivelCentroCosto,/*jScrollPanelDatosNivelCentroCosto,*/jPanelCamposNivelCentroCosto,jPanelPaginacionNivelCentroCosto, /*jScrollPanelDatosEdicionNivelCentroCosto,*/ jPanelAccionesNivelCentroCosto,jPanelAccionesFormularioNivelCentroCosto,jmenuBarNivelCentroCosto,jmenuBarDetalleNivelCentroCosto,jTtoolBarNivelCentroCosto,jTtoolBarDetalleNivelCentroCosto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNivelCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNivelCentroCosto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNivelCentroCosto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNivelCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNivelCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNivelCentroCosto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNivelCentroCosto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNivelCentroCosto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNivelCentroCosto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.nivelcentrocostoConstantesFunciones.getsFinalQueryNivelCentroCosto();
		String  finalQueryPaginacionTodos=this.nivelcentrocostoConstantesFunciones.getsFinalQueryNivelCentroCosto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NivelCentroCostoConstantesFunciones.getArrayColumnasGlobalesNoNivelCentroCosto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NivelCentroCostoConstantesFunciones.getArrayColumnasGlobalesNivelCentroCosto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NivelCentroCostoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.nivelcentrocostosEliminados= new ArrayList<NivelCentroCosto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNivelCentroCosto();
		
				///*NivelCentroCostoSessionBean*/this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
			
			if(this.nivelcentrocostoSessionBean==null) {
				this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
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
					this.iNumeroPaginacion=NivelCentroCostoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NivelCentroCostoConstantesFunciones.getClassesForeignKeysOfNivelCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/nivelcentrocosto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			nivelcentrocostosAux= new ArrayList<NivelCentroCosto>();
			
				
			nivelcentrocostoLogic.setDatosCliente(this.datosCliente);
			nivelcentrocostoLogic.setDatosDeep(this.datosDeep);
			nivelcentrocostoLogic.setIsConDeep(true);
			
			
			nivelcentrocostoLogic.getNivelCentroCostoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					nivelcentrocostoLogic.getTodosNivelCentroCostos(finalQueryGlobal,pagination);
					
					//nivelcentrocostoLogic.getTodosNivelCentroCostosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(nivelcentrocostoLogic.getNivelCentroCostos()==null|| nivelcentrocostoLogic.getNivelCentroCostos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcentrocostosAux= new ArrayList<NivelCentroCosto>();
							nivelcentrocostosAux.addAll(nivelcentrocostoLogic.getNivelCentroCostos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcentrocostosAux= new ArrayList<NivelCentroCosto>();
							nivelcentrocostosAux.addAll(nivelcentrocostos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcentrocostoLogic.getTodosNivelCentroCostos(finalQueryGlobal+"",this.pagination);												
							
							//nivelcentrocostoLogic.getTodosNivelCentroCostosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNivelCentroCostos("Todos",nivelcentrocostoLogic.getNivelCentroCostos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcentrocostoLogic.setNivelCentroCostos(new ArrayList<NivelCentroCosto>());					
							nivelcentrocostoLogic.getNivelCentroCostos().addAll(nivelcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcentrocostos=new ArrayList<NivelCentroCosto>();
							nivelcentrocostos.addAll(nivelcentrocostosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNivelCentroCosto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNivelCentroCosto=this.idActual;
				
				} else if(this.idNivelCentroCostoActual!=null && this.idNivelCentroCostoActual!=0L) {
					idNivelCentroCosto=idNivelCentroCostoActual;
				}
				
					
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndicePorId(idNivelCentroCosto);
				
				this.nivelcentrocostos=new ArrayList<NivelCentroCosto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					nivelcentrocostoLogic.getEntity(idNivelCentroCosto);
					
					//nivelcentrocostoLogic.getEntityWithConnection(idNivelCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcentrocostoLogic.setNivelCentroCostos(new ArrayList<NivelCentroCosto>());
					nivelcentrocostoLogic.getNivelCentroCostos().add(nivelcentrocostoLogic.getNivelCentroCosto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcentrocostos=new ArrayList<NivelCentroCosto>();
					this.nivelcentrocostos.add(nivelcentrocosto);
				}
				
				if(nivelcentrocostoLogic.getNivelCentroCosto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					nivelcentrocostoLogic.getNivelCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=nivelcentrocostoLogic.getNivelCentroCostos()==null||nivelcentrocostoLogic.getNivelCentroCostos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=nivelcentrocostos==null|| nivelcentrocostos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostosAux=new ArrayList<NivelCentroCosto>();
						nivelcentrocostosAux.addAll(nivelcentrocostoLogic.getNivelCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcentrocostosAux=new ArrayList<NivelCentroCosto>();
							nivelcentrocostosAux.addAll(nivelcentrocostos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							nivelcentrocostoLogic.getNivelCentroCostosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NivelCentroCostoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNivelCentroCostos("FK_IdEmpresa",nivelcentrocostoLogic.getNivelCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNivelCentroCostos("FK_IdEmpresa",nivelcentrocostos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoLogic.setNivelCentroCostos(new ArrayList<NivelCentroCosto>());
						nivelcentrocostoLogic.getNivelCentroCostos().addAll(nivelcentrocostosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcentrocostos=new ArrayList<NivelCentroCosto>();
							nivelcentrocostos.addAll(nivelcentrocostosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNivelCentroCosto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNivelCentroCosto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcentrocostoLogic.getNivelCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcentrocostos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcentrocostoLogic.getNivelCentroCostos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcentrocostos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NivelCentroCosto nivelcentrocosto) {
		Boolean permite=true;
		
		if(this.nivelcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NivelCentroCostoConstantesFunciones.getOrderByListaNivelCentroCosto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NivelCentroCostoConstantesFunciones.getOrderByListaNivelCentroCosto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCentroCosto nivelcentrocosto:nivelcentrocostoLogic.getNivelCentroCostos()) {
				if(nivelcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcentrocostoTotales=nivelcentrocosto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCentroCosto nivelcentrocosto:this.nivelcentrocostos) {
				if(nivelcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcentrocostoTotales=nivelcentrocosto;
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
			this.nivelcentrocostoAux=new NivelCentroCosto();
			this.nivelcentrocostoAux.setsType(Constantes2.S_TOTALES);
			this.nivelcentrocostoAux.setIsNew(false);
			this.nivelcentrocostoAux.setIsChanged(false);
			this.nivelcentrocostoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NivelCentroCostoConstantesFunciones.TotalizarValoresFilaNivelCentroCosto(this.nivelcentrocostoLogic.getNivelCentroCostos(),this.nivelcentrocostoAux);
				
				this.nivelcentrocostoLogic.getNivelCentroCostos().add(this.nivelcentrocostoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NivelCentroCostoConstantesFunciones.TotalizarValoresFilaNivelCentroCosto(this.nivelcentrocostos,this.nivelcentrocostoAux);
				
				this.nivelcentrocostos.add(this.nivelcentrocostoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nivelcentrocostoTotales=new NivelCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcentrocostoLogic.getNivelCentroCostos().remove(nivelcentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcentrocostos.remove(nivelcentrocostoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nivelcentrocostoTotales=new NivelCentroCosto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCentroCosto nivelcentrocosto:nivelcentrocostoLogic.getNivelCentroCostos()) {
				if(nivelcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcentrocostoTotales=nivelcentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCentroCostoConstantesFunciones.TotalizarValoresFilaNivelCentroCosto(this.nivelcentrocostoLogic.getNivelCentroCostos(),nivelcentrocostoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCentroCosto nivelcentrocosto:this.nivelcentrocostos) {
				if(nivelcentrocosto.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcentrocostoTotales=nivelcentrocosto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCentroCostoConstantesFunciones.TotalizarValoresFilaNivelCentroCosto(this.nivelcentrocostos,nivelcentrocostoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNivelCentroCostosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNivelCentroCostosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcentrocostoLogic.getNivelCentroCostosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosNivelCentroCosto() {
		this.isPermisoTodoNivelCentroCosto=false;
		this.isPermisoNuevoNivelCentroCosto=false;
		this.isPermisoActualizarNivelCentroCosto=false;
		this.isPermisoActualizarOriginalNivelCentroCosto=false;
		this.isPermisoEliminarNivelCentroCosto=false;
		this.isPermisoGuardarCambiosNivelCentroCosto=false;
		this.isPermisoConsultaNivelCentroCosto=false;
		this.isPermisoBusquedaNivelCentroCosto=false;
		this.isPermisoReporteNivelCentroCosto=false;		
		this.isPermisoOrdenNivelCentroCosto=false;		
		this.isPermisoPaginacionMedioNivelCentroCosto=false;		
		this.isPermisoPaginacionAltoNivelCentroCosto=false;
		this.isPermisoPaginacionTodoNivelCentroCosto=false;
		this.isPermisoCopiarNivelCentroCosto=false;		
		this.isPermisoVerFormNivelCentroCosto=false;		
		this.isPermisoDuplicarNivelCentroCosto=false;		
		this.isPermisoOrdenNivelCentroCosto=false;		
	}
	
	public void setPermisosUsuarioNivelCentroCosto(Boolean isPermiso) {
		this.isPermisoTodoNivelCentroCosto=isPermiso;
		this.isPermisoNuevoNivelCentroCosto=isPermiso;
		this.isPermisoActualizarNivelCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalNivelCentroCosto=isPermiso;
		this.isPermisoEliminarNivelCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosNivelCentroCosto=isPermiso;
		this.isPermisoConsultaNivelCentroCosto=isPermiso;
		this.isPermisoBusquedaNivelCentroCosto=isPermiso;
		this.isPermisoReporteNivelCentroCosto=isPermiso;
		this.isPermisoOrdenNivelCentroCosto=isPermiso;		
		this.isPermisoPaginacionMedioNivelCentroCosto=isPermiso;		
		this.isPermisoPaginacionAltoNivelCentroCosto=isPermiso;		
		this.isPermisoPaginacionTodoNivelCentroCosto=isPermiso;		
		this.isPermisoCopiarNivelCentroCosto=isPermiso;		
		this.isPermisoVerFormNivelCentroCosto=isPermiso;		
		this.isPermisoDuplicarNivelCentroCosto=isPermiso;
		this.isPermisoOrdenNivelCentroCosto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNivelCentroCosto(Boolean isPermiso) {
		//this.isPermisoTodoNivelCentroCosto=isPermiso;
		this.isPermisoNuevoNivelCentroCosto=isPermiso;
		this.isPermisoActualizarNivelCentroCosto=isPermiso;
		this.isPermisoActualizarOriginalNivelCentroCosto=isPermiso;
		this.isPermisoEliminarNivelCentroCosto=isPermiso;
		this.isPermisoGuardarCambiosNivelCentroCosto=isPermiso;
		//this.isPermisoConsultaNivelCentroCosto=isPermiso;
		//this.isPermisoBusquedaNivelCentroCosto=isPermiso;
		//this.isPermisoReporteNivelCentroCosto=isPermiso;
		//this.isPermisoOrdenNivelCentroCosto=isPermiso;		
		//this.isPermisoPaginacionMedioNivelCentroCosto=isPermiso;		
		//this.isPermisoPaginacionAltoNivelCentroCosto=isPermiso;		
		//this.isPermisoPaginacionTodoNivelCentroCosto=isPermiso;		
		//this.isPermisoCopiarNivelCentroCosto=isPermiso;		
		//this.isPermisoDuplicarNivelCentroCosto=isPermiso;
		//this.isPermisoOrdenNivelCentroCosto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNivelCentroCostoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(NivelCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebNivelCentroCosto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNivelCentroCostoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioNivelCentroCostoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNivelCentroCostoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNivelCentroCostoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioNivelCentroCosto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NivelCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NivelCentroCostoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNivelCentroCosto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNivelCentroCosto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNivelCentroCosto=this.isPermisoActualizarNivelCentroCosto;
			this.isPermisoEliminarNivelCentroCosto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNivelCentroCosto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNivelCentroCosto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNivelCentroCosto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNivelCentroCosto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNivelCentroCosto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNivelCentroCosto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNivelCentroCosto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNivelCentroCosto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNivelCentroCosto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNivelCentroCosto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNivelCentroCosto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCentroCosto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNivelCentroCosto.setToolTipText(this.jTableDatosNivelCentroCosto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNivelCentroCosto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNivelCentroCosto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NivelCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NivelCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNivelCentroCosto() throws Exception {
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
	public void inicializarCombosForeignKeyNivelCentroCostoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNivelCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NivelCentroCostoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNivelCentroCostoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyNivelCentroCostoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NivelCentroCostoParameterReturnGeneral nivelcentrocostoReturnGeneral=new NivelCentroCostoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.nivelcentrocostoConstantesFunciones.cargarid_empresaNivelCentroCosto)
					 || (this.esRecargarFks && this.nivelcentrocostoConstantesFunciones.cargarid_empresaNivelCentroCosto)) {

					if(!this.nivelcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+nivelcentrocostoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.cargarCombosLoteForeignKeyNivelCentroCosto(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=nivelcentrocostoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNivelCentroCosto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.nivelcentrocostoSessionBean==null) {
				this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
			}

			if(!this.nivelcentrocostoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyNivelCentroCosto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNivelCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNivelCentroCosto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCentroCosto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNivelCentroCosto(NivelCentroCosto nivelcentrocosto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNivelCentroCosto(NivelCentroCosto nivelcentrocosto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNivelCentroCosto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCentroCosto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNivelCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNivelCentroCosto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNivelCentroCosto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNivelCentroCosto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNivelCentroCosto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNivelCentroCosto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto!=null && this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.getItemCount()>0) {
				this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public NivelCentroCostoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NivelCentroCostoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NivelCentroCostoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean(); 
		this.nivelcentrocostoConstantesFunciones=new NivelCentroCostoConstantesFunciones(); 
		this.nivelcentrocostoBean=new NivelCentroCosto();//(this.nivelcentrocostoConstantesFunciones); 		
		this.nivelcentrocostoReturnGeneral=new NivelCentroCostoParameterReturnGeneral(); 
		
		this.nivelcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NivelCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NivelCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NivelCentroCostoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNivelCentroCosto(true);
			
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
			
			this.nivelcentrocostoConstantesFunciones=new NivelCentroCostoConstantesFunciones(); 
			this.nivelcentrocostoBean=new NivelCentroCosto();//this.nivelcentrocostoConstantesFunciones); 			
			this.nivelcentrocostoReturnGeneral=new NivelCentroCostoParameterReturnGeneral(); 
		
			NivelCentroCostoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Centro Costo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.nivelcentrocosto=new NivelCentroCosto();
			this.nivelcentrocostos = new ArrayList<NivelCentroCosto>();
			this.nivelcentrocostosAux = new ArrayList<NivelCentroCosto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic=new NivelCentroCostoLogic();
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.nivelcentrocostoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.nivelcentrocostoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNivelCentroCosto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCentroCosto);	
					}
					
					if(this.jInternalFrameImportacionNivelCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCentroCosto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNivelCentroCosto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNivelCentroCosto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCentroCosto);
				this.jInternalFrameDetalleFormNivelCentroCosto.setVisible(false);
				this.jInternalFrameDetalleFormNivelCentroCosto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCentroCosto);
					this.jInternalFrameReporteDinamicoNivelCentroCosto.setVisible(false);
					this.jInternalFrameReporteDinamicoNivelCentroCosto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNivelCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNivelCentroCosto);
					this.jInternalFrameImportacionNivelCentroCosto.setVisible(false);
					this.jInternalFrameImportacionNivelCentroCosto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNivelCentroCosto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNivelCentroCosto);
					this.jInternalFrameOrderByNivelCentroCosto.setVisible(false);
					this.jInternalFrameOrderByNivelCentroCosto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNivelCentroCostoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NivelCentroCostoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.nivelcentrocostoReturnGeneral=new NivelCentroCostoParameterReturnGeneral();
			
			this.nivelcentrocostoParameterGeneral=new NivelCentroCostoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.nivelcentrocostoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NivelCentroCostoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado(),this.nivelcentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCentroCostoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado(),this.nivelcentrocostoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaDuplicarNivelCentroCosto=true;
			this.isVisibilidadCeldaCopiarNivelCentroCosto=true;
			this.isVisibilidadCeldaVerFormNivelCentroCosto=true;
			this.isVisibilidadCeldaOrdenNivelCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNivelCentroCosto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNivelCentroCosto(false);
			
			this.setPermisosUsuarioNivelCentroCosto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() 
				|| (this.nivelcentrocostoSessionBean.getEsGuardarRelacionado() && this.nivelcentrocostoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNivelCentroCostoClasesRelacionadas();
			}
			
			if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNivelCentroCostoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNivelCentroCosto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNivelCentroCosto();
			}
			
			if(!this.isPermisoBusquedaNivelCentroCosto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNivelCentroCosto,this.isPermisoPaginacionMedioNivelCentroCosto,this.isPermisoPaginacionTodoNivelCentroCosto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NivelCentroCostoConstantesFunciones.getTiposSeleccionarNivelCentroCosto());
				
				this.tiposColumnasSelect=NivelCentroCostoConstantesFunciones.getTiposSeleccionarNivelCentroCosto(true);
				
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
			//if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNivelCentroCosto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNivelCentroCosto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNivelCentroCosto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCentroCosto() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				nivelcentrocostoImplementable= (NivelCentroCostoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				nivelcentrocostoImplementableHome= (NivelCentroCostoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCentroCostoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.nivelcentrocostos= new ArrayList<NivelCentroCosto>();
			this.nivelcentrocostosEliminados= new ArrayList<NivelCentroCosto>();
						
			this.isEsNuevoNivelCentroCosto=false;
			this.esParaAccionDesdeFormularioNivelCentroCosto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNivelCentroCosto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNivelCentroCosto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NivelCentroCostoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NivelCentroCostoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNivelCentroCosto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNivelCentroCosto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNivelCentroCosto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNivelCentroCosto();
			}
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNivelCentroCosto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNivelCentroCosto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNivelCentroCosto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNivelCentroCosto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NivelCentroCosto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNivelCentroCosto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNivelCentroCosto")) {
				iIndex=this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNivelCentroCosto();	
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
	
	public void cargarCombosForeignKeyNivelCentroCosto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNivelCentroCosto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNivelCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNivelCentroCostoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNivelCentroCosto();
		
		this.cargarCombosFrameForeignKeyNivelCentroCosto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNivelCentroCosto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNivelCentroCosto();
		}
	}
	
	
	
	public void jButtonNuevoNivelCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			
			if(jTableDatosNivelCentroCosto.getRowCount()>=1) {
				jTableDatosNivelCentroCosto.removeRowSelectionInterval(0, jTableDatosNivelCentroCosto.getRowCount()-1);						
			}
			
			this.isEsNuevoNivelCentroCosto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNivelCentroCosto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNivelCentroCosto(true);			
			//this.nivelcentrocosto=new NivelCentroCosto();
			//this.nivelcentrocosto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCentroCosto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCentroCosto() ;
			
			if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCentroCosto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.nivelcentrocosto);	
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);				
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NivelCentroCosto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNivelCentroCostoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNivelCentroCosto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNivelCentroCosto.getSelectedRows().length;			
			}
			
			nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNivelCentroCosto--;			
				//NivelCentroCosto nivelcentrocostoAux= new NivelCentroCosto();			
				//nivelcentrocostoAux.setId(this.iIdNuevoNivelCentroCosto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NivelCentroCosto nivelcentrocostoOrigen=new NivelCentroCosto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NivelCentroCosto nivelcentrocostoOrigen : nivelcentrocostosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							nivelcentrocostoOrigen =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcentrocostoOrigen =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNivelCentroCosto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.nivelcentrocosto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNivelCentroCosto(nivelcentrocostoOrigen,this.nivelcentrocosto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcentrocostoLogic.getNivelCentroCostos().add(this.nivelcentrocostoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcentrocostos.add(this.nivelcentrocostoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
				
				this.jTableDatosNivelCentroCosto.setRowSelectionInterval(this.getIndiceNuevoNivelCentroCosto(), this.getIndiceNuevoNivelCentroCosto());
				
				int iLastRow =  this.jTableDatosNivelCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCentroCosto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();									
		
			NivelCentroCosto nivelcentrocostoOrigen=new NivelCentroCosto();
			NivelCentroCosto nivelcentrocostoDestino=new NivelCentroCosto();
				
			nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNivelCentroCosto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || nivelcentrocostosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNivelCentroCosto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoOrigen =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcentrocostoOrigen =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcentrocostoDestino =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcentrocostoDestino =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				nivelcentrocostoOrigen =nivelcentrocostosSeleccionados.get(0);
				nivelcentrocostoDestino =nivelcentrocostosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNivelCentroCosto(nivelcentrocostoOrigen,nivelcentrocostoDestino,true,false);
				
				nivelcentrocostoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcentrocostoDestino,nivelcentrocostoLogic.getNivelCentroCostos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcentrocostoDestino,nivelcentrocostos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
				
				//this.jTableDatosNivelCentroCosto.setRowSelectionInterval(this.getIndiceNuevoNivelCentroCosto(), this.getIndiceNuevoNivelCentroCosto());
				
				int iLastRow =  this.jTableDatosNivelCentroCosto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCentroCosto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCentroCosto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCentroCosto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNivelCentroCosto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNivelCentroCosto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNivelCentroCosto.setVisible(!isVisible);
			this.jPanelPaginacionNivelCentroCosto.setVisible(!isVisible);
			this.jPanelAccionesNivelCentroCosto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNivelCentroCosto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNivelCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNivelCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNivelCentroCosto();
			
			this.abrirFrameOrderByNivelCentroCosto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNivelCentroCosto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNivelCentroCosto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCentroCosto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNivelCentroCosto.isMaximum()) {
					this.jInternalFrameDetalleFormNivelCentroCosto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNivelCentroCosto.setSize(this.jInternalFrameDetalleFormNivelCentroCosto.iWidthFormulario,this.jInternalFrameDetalleFormNivelCentroCosto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNivelCentroCosto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNivelCentroCosto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNivelCentroCosto.isMaximum()) {
						this.jInternalFrameDetalleFormNivelCentroCosto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNivelCentroCosto.jContentPaneDetalleNivelCentroCosto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNivelCentroCosto.jContentPaneDetalleNivelCentroCosto.getWidth(),NivelCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNivelCentroCosto.jContentPaneDetalleNivelCentroCosto.getWidth(),NivelCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNivelCentroCosto.jContentPaneDetalleNivelCentroCosto.getWidth(),NivelCentroCostoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNivelCentroCosto.setVisible(true);
	        this.jInternalFrameDetalleFormNivelCentroCosto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNivelCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNivelCentroCosto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNivelCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCentroCosto,false,this);
				} else {
					this.jInternalFrameOrderByNivelCentroCosto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCentroCosto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNivelCentroCosto);
				this.jInternalFrameOrderByNivelCentroCosto.setVisible(false);
				this.jInternalFrameOrderByNivelCentroCosto.setSelected(false);
				
				this.jInternalFrameOrderByNivelCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCentroCosto"));
				
				this.inicializarActualizarBindingTablaOrderByNivelCentroCosto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNivelCentroCosto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNivelCentroCosto==null) {
				
				this.jInternalFrameImportacionNivelCentroCosto=new ImportacionJInternalFrame(NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCentroCosto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNivelCentroCosto);
				this.jInternalFrameImportacionNivelCentroCosto.setVisible(false);
				this.jInternalFrameImportacionNivelCentroCosto.setSelected(false);


				this.jInternalFrameImportacionNivelCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCentroCosto"));
				this.jInternalFrameImportacionNivelCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCentroCosto"));
				this.jInternalFrameImportacionNivelCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCentroCosto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNivelCentroCosto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNivelCentroCosto==null) {
				this.jInternalFrameReporteDinamicoNivelCentroCosto=new ReporteDinamicoJInternalFrame(NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCentroCosto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCentroCosto);
				this.jInternalFrameReporteDinamicoNivelCentroCosto.setVisible(false);
				this.jInternalFrameReporteDinamicoNivelCentroCosto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCentroCosto"));
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCentroCosto"));
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCentroCosto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCentroCosto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleNivelCentroCosto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCentroCosto);
			
	       	this.jInternalFrameDetalleFormNivelCentroCosto.setVisible(false);
	        this.jInternalFrameDetalleFormNivelCentroCosto.setSelected(false);
			
			//this.jInternalFrameDetalleFormNivelCentroCosto.dispose();
			//this.jInternalFrameDetalleFormNivelCentroCosto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNivelCentroCosto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNivelCentroCosto.setVisible(true);
	        this.jInternalFrameReporteDinamicoNivelCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNivelCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNivelCentroCosto.setVisible(true);
	        this.jInternalFrameImportacionNivelCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNivelCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNivelCentroCosto.setVisible(true);
	        this.jInternalFrameOrderByNivelCentroCosto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNivelCentroCosto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNivelCentroCosto.setVisible(false);
	        this.jInternalFrameOrderByNivelCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNivelCentroCosto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNivelCentroCosto.setVisible(false);
	        this.jInternalFrameReporteDinamicoNivelCentroCosto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNivelCentroCosto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNivelCentroCosto.setVisible(false);
	        this.jInternalFrameImportacionNivelCentroCosto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNivelCentroCosto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNivelCentroCosto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNivelCentroCosto(true);
			//this.isEsNuevoNivelCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNivelCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCentroCosto(false) ;
			
			if(nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCentroCosto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNivelCentroCostoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNivelCentroCosto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNivelCentroCosto(true);
			//this.isEsNuevoNivelCentroCosto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.nivelcentrocosto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNivelCentroCosto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNivelCentroCosto(false) ;
			
			if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCentroCosto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCentroCosto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNivelCentroCosto(false);
			
			//if(!this.isEsNuevoNivelCentroCosto) {								
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				
			}
			
			if(this.permiteMantenimiento(this.nivelcentrocosto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNivelCentroCosto=true;
					this.inicializarActualizarBindingTablaNivelCentroCosto(false);
					this.isEsNuevoNivelCentroCosto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNivelCentroCosto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNivelCentroCosto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCentroCosto(false);
				
				this.habilitarDeshabilitarControlesNivelCentroCosto(false);
			
												
				
				if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNivelCentroCosto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNivelCentroCostoActionPerformed(evt,nivelcentrocostoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNivelCentroCosto(this.nivelcentrocosto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNivelCentroCosto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,nivelcentrocostoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.nivelcentrocosto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.nivelcentrocosto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				this.nivelcentrocosto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.nivelcentrocosto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NivelCentroCostoModel) this.jTableDatosNivelCentroCosto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNivelCentroCosto=true;
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
				this.isEsNuevoNivelCentroCosto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCentroCosto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCentroCosto(false);
				
				this.habilitarDeshabilitarControlesNivelCentroCosto(false);
				
				
				
				if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNivelCentroCosto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNivelCentroCosto.getRowCount()>=1) {
				jTableDatosNivelCentroCosto.removeRowSelectionInterval(0, jTableDatosNivelCentroCosto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNivelCentroCosto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCentroCosto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCentroCosto(false) ;
			
			this.isEsNuevoNivelCentroCosto=false;
			
			if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNivelCentroCosto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNivelCentroCosto(false);
				
				//SI ES MANUAL
				if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNivelCentroCosto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNivelCentroCosto--;			
			//NivelCentroCosto nivelcentrocostoAux= new NivelCentroCosto();			
			//nivelcentrocostoAux.setId(this.iIdNuevoNivelCentroCosto);
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNivelCentroCosto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
			
			this.nivelcentrocosto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.nivelcentrocostoLogic.getNivelCentroCostos().add(this.nivelcentrocostoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.nivelcentrocostos.add(this.nivelcentrocostoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			
			this.jTableDatosNivelCentroCosto.setRowSelectionInterval(this.getIndiceNuevoNivelCentroCosto(), this.getIndiceNuevoNivelCentroCosto());
			
			int iLastRow =  this.jTableDatosNivelCentroCosto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNivelCentroCosto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNivelCentroCosto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCentroCosto(false);
			
			//SI ES MANUAL
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCentroCosto();
			}
			
			//this.abrirFrameTreeNivelCentroCosto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Nivel Centro CostoS ?", "MANTENIMIENTO DE Nivel Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNivelCentroCosto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNivelCentroCosto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.procesarImportacionNivelCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.nivelcentrocostoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNivelCentroCostoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNivelCentroCosto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNivelCentroCosto.setFileImportacion(this.jInternalFrameImportacionNivelCentroCosto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNivelCentroCosto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNivelCentroCosto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNivelCentroCosto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNivelCentroCosto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		

		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NivelCentroCostoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NivelCentroCostoBaseDesign.jrxml";
			
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
			
			this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NIVEL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_vel_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_vel_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_vel_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_vel_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDigitos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDigitos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDigitos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDigitos_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNivelCentroCosto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoria="nivel";
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS:
					sNombreCampoCategoria="numero_digitos";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NIVEL:
					sNombreCampoCategoriaValor="nivel";
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS:
					sNombreCampoCategoriaValor="numero_digitos";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NIVEL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nivel",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nivel");
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Digitos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_digitos");
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
	
	public void jButtonGenerarExcelReporteDinamicoNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NivelCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NivelCentroCosto nivelcentrocosto:nivelcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcentrocosto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NIVEL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NIVEL);
					iRow++;

					for(NivelCentroCosto nivelcentrocosto:nivelcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcentrocosto.getnivel());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS);
					iRow++;

					for(NivelCentroCosto nivelcentrocosto:nivelcentrocostosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcentrocosto.getnumero_digitos());
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
			//	this.getFilaCabeceraExportarExcelNivelCentroCosto(row);				
			//	iRow++;
			//}				
			
			//for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNivelCentroCosto(nivelcentrocostoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
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
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCentroCosto(false);
			
			//SI ES MANUAL
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCentroCosto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCentroCosto(false);
			
			//SI ES MANUAL
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCentroCosto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCentroCosto(false);
			
			//SI ES MANUAL
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCentroCosto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNivelCentroCosto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNivelCentroCosto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNivelCentroCosto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNivelCentroCosto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNivelCentroCosto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNivelCentroCosto.setMinimumSize(dimensionMinimum);
		this.jTableDatosNivelCentroCosto.setMaximumSize(dimensionMaximum);
		this.jTableDatosNivelCentroCosto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNivelCentroCosto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNivelCentroCosto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNivelCentroCosto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNivelCentroCosto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNivelCentroCosto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNivelCentroCosto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCentroCosto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNivelCentroCosto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNivelCentroCosto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNivelCentroCosto();
		
		this.inicializarActualizarBindingBotonesManualNivelCentroCosto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCentroCosto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCentroCosto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCentroCosto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCentroCosto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNivelCentroCosto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNivelCentroCosto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNivelCentroCosto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionNuevoNivelCentroCosto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionSinCerrarNivelCentroCosto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionSinMensajeNivelCentroCosto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNivelCentroCosto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNivelCentroCosto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNivelCentroCosto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
				this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionNuevoNivelCentroCosto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionSinCerrarNivelCentroCosto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNivelCentroCosto.jCheckBoxPostAccionSinMensajeNivelCentroCosto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNivelCentroCosto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNivelCentroCosto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNivelCentroCosto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNivelCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNivelCentroCosto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNivelCentroCosto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNivelCentroCosto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNivelCentroCosto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNivelCentroCosto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNivelCentroCosto(Boolean esInicializar) throws Exception {
		try	{	
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCentroCosto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNivelCentroCosto() throws Exception {
		try	{
			if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCentroCosto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCentroCosto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCentroCosto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNivelCentroCosto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNivelCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNivelCentroCosto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNivelCentroCosto.addItem(reporte);
			}
			
			
			if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNivelCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNivelCentroCosto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNivelCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNivelCentroCosto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNivelCentroCosto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNivelCentroCosto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNivelCentroCosto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCentroCosto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCentroCosto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
				
				if(this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCentroCosto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNivelCentroCosto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNivelCentroCosto(Boolean esInicializar) throws Exception {				
		if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCentroCosto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNivelCentroCosto() throws Exception {
		this.inicializarActualizarBindingTablaNivelCentroCosto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNivelCentroCosto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNivelCentroCostoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCostoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNivelCentroCosto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=nivelcentrocostoLogic.getNivelCentroCostos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=nivelcentrocostos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNivelCentroCosto.setModel(new NivelCentroCostoModel(this.nivelcentrocostoLogic.getNivelCentroCostos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNivelCentroCosto.setModel(new NivelCentroCostoModel(this.nivelcentrocostos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNivelCentroCosto!=null && this.jInternalFrameOrderByNivelCentroCosto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNivelCentroCosto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,nivelcentrocostoConstantesFunciones.resaltarSeleccionarNivelCentroCosto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NivelCentroCostoConstantesFunciones.SCLASSWEBTITULO,nivelcentrocostoConstantesFunciones.resaltarSeleccionarNivelCentroCosto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,NivelCentroCostoConstantesFunciones.LABEL_ID));

		if(this.nivelcentrocostoConstantesFunciones.mostraridNivelCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCentroCostoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcentrocostoConstantesFunciones.resaltaridNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activaridNivelCentroCosto,this,true,"idNivelCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcentrocostoConstantesFunciones.resaltaridNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activaridNivelCentroCosto,this,true,"idNivelCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.nivelcentrocostoConstantesFunciones.mostrarid_empresaNivelCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.nivelcentrocostoConstantesFunciones.resaltarid_empresaNivelCentroCosto,this,this.nivelcentrocostoConstantesFunciones.activarid_empresaNivelCentroCosto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.nivelcentrocostoConstantesFunciones.resaltarid_empresaNivelCentroCosto,this,this.nivelcentrocostoConstantesFunciones.activarid_empresaNivelCentroCosto,false,"id_empresaNivelCentroCosto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,NivelCentroCostoConstantesFunciones.LABEL_NIVEL));

		if(this.nivelcentrocostoConstantesFunciones.mostrarnivelNivelCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCentroCostoConstantesFunciones.LABEL_NIVEL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcentrocostoConstantesFunciones.resaltarnivelNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activarnivelNivelCentroCosto,this,true,"nivelNivelCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcentrocostoConstantesFunciones.resaltarnivelNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activarnivelNivelCentroCosto,this,true,"nivelNivelCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS));

		if(this.nivelcentrocostoConstantesFunciones.mostrarnumero_digitosNivelCentroCosto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcentrocostoConstantesFunciones.resaltarnumero_digitosNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activarnumero_digitosNivelCentroCosto,this,true,"numero_digitosNivelCentroCosto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcentrocostoConstantesFunciones.resaltarnumero_digitosNivelCentroCosto,this.nivelcentrocostoConstantesFunciones.activarnumero_digitosNivelCentroCosto,this,true,"numero_digitosNivelCentroCosto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new NivelCentroCostoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCentroCosto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCentroCosto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNivelCentroCosto.addColumn(tableColumn);
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
			
			this.jTableDatosNivelCentroCosto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNivelCentroCosto.moveColumn(this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNivelCentroCosto.moveColumn(this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNivelCentroCosto.moveColumn(this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNivelCentroCosto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNivelCentroCosto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNivelCentroCosto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNivelCentroCosto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNivelCentroCosto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNivelCentroCosto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNivelCentroCosto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=nivelcentrocostoLogic.getNivelCentroCostos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=nivelcentrocostos.size()-1;
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
		//this.jTableDatosNivelCentroCosto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNivelCentroCosto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNivelCentroCosto();
			
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
				
				//this.isEsNuevoNivelCentroCosto=false;
					
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
				if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNivelCentroCosto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCentroCosto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.nivelcentrocosto.getsType().equals("DUPLICADO")
				   || this.nivelcentrocosto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNivelCentroCosto=true;
				
				} else {
					this.isEsNuevoNivelCentroCosto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					if(this.nivelcentrocosto.getId()>=0 && !this.nivelcentrocosto.getIsNew()) {						
						this.isEsNuevoNivelCentroCosto=false;
						
					} else {
						this.isEsNuevoNivelCentroCosto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNivelCentroCosto(esRelaciones);						
				
				this.seleccionarNivelCentroCosto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.nivelcentrocosto.getId()<0) {
					this.isEsNuevoNivelCentroCosto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNivelCentroCosto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNivelCentroCosto(evt,rowIndex);
				}	
				
				if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NivelCentroCosto: " + this.dDif); 
					}
				}								
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNivelCentroCosto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.nivelcentrocosto)) {
					if(this.nivelcentrocosto.getId()>0) {
						this.nivelcentrocosto.setIsDeleted(true);
						
						this.nivelcentrocostosEliminados.add(this.nivelcentrocosto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcentrocostoLogic.getNivelCentroCostos().remove(this.nivelcentrocosto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcentrocostos.remove(this.nivelcentrocosto);				
					}
					
					
					((NivelCentroCostoModel) this.jTableDatosNivelCentroCosto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCentroCosto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNivelCentroCosto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNivelCentroCosto) {
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCentroCosto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCentroCosto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocosto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.nivelcentrocostoConstantesFunciones.cargarid_empresaNivelCentroCosto || this.nivelcentrocostoConstantesFunciones.event_dependid_empresaNivelCentroCosto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.nivelcentrocosto.getid_empresa());
									//this.inicializarActualizarBindingNivelCentroCosto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(nivelcentrocosto.getEmpresa()!=null) {
							this.empresasForeignKey.add(nivelcentrocosto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.nivelcentrocosto.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNivelCentroCosto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNivelCentroCosto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCentroCosto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCentroCosto(NivelCentroCosto nivelcentrocosto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNivelCentroCosto(nivelcentrocosto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNivelCentroCosto(nivelcentrocosto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNivelCentroCosto(nivelcentrocosto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNivelCentroCosto(nivelcentrocosto);
	}
	
	public void setVariablesObjetoActualToFormularioNivelCentroCosto(NivelCentroCosto nivelcentrocosto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setText(nivelcentrocosto.getId().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setText(nivelcentrocosto.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setText(nivelcentrocosto.getnumero_digitos().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NivelCentroCosto nivelcentrocostoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,nivelcentrocostoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NivelCentroCosto nivelcentrocostoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				nivelcentrocostoLocal=this.nivelcentrocosto;
			} else {
				nivelcentrocostoLocal=this.nivelcentrocostoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(nivelcentrocostoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNivelCentroCosto(nivelcentrocostoLocal,true);
					
					if(nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(nivelcentrocostoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(nivelcentrocostoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCentroCosto(nivelcentrocosto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(nivelcentrocosto);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCentroCosto(nivelcentrocosto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.getText()==null || this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.getText()=="" || this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.getText()=="Id") {
				this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setText("0");
			}

			if(conColumnasBase) {nivelcentrocosto.setId(Long.parseLong(this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCentroCostoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelIdNivelCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivelcentrocosto.setnivel(Integer.parseInt(this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCentroCostoConstantesFunciones.LABEL_NIVEL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnivelNivelCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivelcentrocosto.setnumero_digitos(Integer.parseInt(this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCentroCosto.jLabelnumero_digitosNivelCentroCosto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCentroCosto(NivelCentroCosto nivelcentrocostoBean,NivelCentroCosto nivelcentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNivelCentroCosto(NivelCentroCosto nivelcentrocostoOrigen,NivelCentroCosto nivelcentrocosto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcentrocostoOrigen.getId()!=null && !nivelcentrocostoOrigen.getId().equals(0L))) {nivelcentrocosto.setId(nivelcentrocostoOrigen.getId());}}
			if(conDefault || (!conDefault && nivelcentrocostoOrigen.getnivel()!=null && !nivelcentrocostoOrigen.getnivel().equals(0))) {nivelcentrocosto.setnivel(nivelcentrocostoOrigen.getnivel());}
			if(conDefault || (!conDefault && nivelcentrocostoOrigen.getnumero_digitos()!=null && !nivelcentrocostoOrigen.getnumero_digitos().equals(0))) {nivelcentrocosto.setnumero_digitos(nivelcentrocostoOrigen.getnumero_digitos());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCentroCosto(NivelCentroCosto nivelcentrocosto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setText(nivelcentrocosto.getId().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setText(nivelcentrocosto.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setText(nivelcentrocosto.getnumero_digitos().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCentroCosto(NivelCentroCostoBean nivelcentrocostoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setText(nivelcentrocostoBean.getId().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setText(nivelcentrocostoBean.getnivel().toString());
			this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setText(nivelcentrocostoBean.getnumero_digitos().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNivelCentroCosto(NivelCentroCostoParameterReturnGeneral nivelcentrocostoReturnGeneral,NivelCentroCostoBean nivelcentrocostoBean,Boolean conDefault) throws Exception { 
		try {
			NivelCentroCosto nivelcentrocostoLocal=new NivelCentroCosto();
			
			nivelcentrocostoLocal=nivelcentrocostoReturnGeneral.getNivelCentroCosto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcentrocostoLocal.getId()!=null && !nivelcentrocostoLocal.getId().equals(0L))) {nivelcentrocostoBean.setId(nivelcentrocostoLocal.getId());}}
			if(conDefault || (!conDefault && nivelcentrocostoLocal.getnivel()!=null && !nivelcentrocostoLocal.getnivel().equals(0))) {nivelcentrocostoBean.setnivel(nivelcentrocostoLocal.getnivel());}
			if(conDefault || (!conDefault && nivelcentrocostoLocal.getnumero_digitos()!=null && !nivelcentrocostoLocal.getnumero_digitos().equals(0))) {nivelcentrocostoBean.setnumero_digitos(nivelcentrocostoLocal.getnumero_digitos());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNivelCentroCostoGenerico(Long idNivelCentroCostoSeleccionado,JComboBox jComboBoxNivelCentroCosto,List<NivelCentroCosto> nivelcentrocostosLocal)throws Exception {
		try {
			NivelCentroCosto  nivelcentrocostoTemp=null;

			for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosLocal) {
				if(nivelcentrocostoAux.getId()!=null && nivelcentrocostoAux.getId().equals(idNivelCentroCostoSeleccionado)) {
					nivelcentrocostoTemp=nivelcentrocostoAux;
					break;
				}
			}

			jComboBoxNivelCentroCosto.setSelectedItem(nivelcentrocostoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNivelCentroCostoGenerico(JComboBox jComboBoxNivelCentroCosto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCentroCosto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNivelCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCentroCosto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNivelCentroCosto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNivelCentroCosto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNivelCentroCosto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcentrocosto=(NivelCentroCosto) nivelcentrocostoLogic.getNivelCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcentrocosto =(NivelCentroCosto) nivelcentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!nivelcentrocosto.getIsNew() && !nivelcentrocosto.getIsChanged() && !nivelcentrocosto.getIsDeleted()) {
				sDescripcion=nivelcentrocosto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=nivelcentrocosto.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NivelCentroCosto nivelcentrocostoRow=new NivelCentroCosto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcentrocostoRow=(NivelCentroCosto) nivelcentrocostoLogic.getNivelCentroCostos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcentrocostoRow=(NivelCentroCosto) nivelcentrocostos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNivelCentroCosto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));			
			this.jButtonDuplicarNivelCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarNivelCentroCosto && this.isPermisoDuplicarNivelCentroCosto));			
			this.jButtonCopiarNivelCentroCosto.setVisible((this.isVisibilidadCeldaCopiarNivelCentroCosto && this.isPermisoCopiarNivelCentroCosto));
			this.jButtonVerFormNivelCentroCosto.setVisible((this.isVisibilidadCeldaVerFormNivelCentroCosto && this.isPermisoVerFormNivelCentroCosto));
			
			this.jButtonAbrirOrderByNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));			
			
			this.jButtonNuevoRelacionesNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));			
			this.jButtonNuevoGuardarCambiosNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarNivelCentroCosto.setVisible((this.isVisibilidadCeldaModificarNivelCentroCosto && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.setVisible((this.isVisibilidadCeldaActualizarNivelCentroCosto && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.setVisible((this.isVisibilidadCeldaEliminarNivelCentroCosto && this.isPermisoEliminarNivelCentroCosto));
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.setVisible(this.isVisibilidadCeldaCancelarNivelCentroCosto);							
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));			
			
			}
						
			this.jButtonGuardarCambiosTablaNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));						
			this.jButtonDuplicarToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarNivelCentroCosto && this.isPermisoDuplicarNivelCentroCosto));						
			this.jButtonCopiarToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaCopiarNivelCentroCosto && this.isPermisoCopiarNivelCentroCosto));			
			this.jButtonVerFormToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaVerFormNivelCentroCosto && this.isPermisoVerFormNivelCentroCosto));			
			this.jButtonAbrirOrderByToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));
			this.jButtonNuevoRelacionesToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));			
			this.jButtonNuevoGuardarCambiosToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));			
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaModificarNivelCentroCosto && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaActualizarNivelCentroCosto  && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaEliminarNivelCentroCosto && this.isPermisoEliminarNivelCentroCosto));
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarToolBarNivelCentroCosto.setVisible(this.isVisibilidadCeldaCancelarNivelCentroCosto);				
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));			
			this.jMenuItemDuplicarNivelCentroCosto.setVisible((this.isVisibilidadCeldaDuplicarNivelCentroCosto && this.isPermisoDuplicarNivelCentroCosto));			
			this.jMenuItemCopiarNivelCentroCosto.setVisible((this.isVisibilidadCeldaCopiarNivelCentroCosto && this.isPermisoCopiarNivelCentroCosto));			
			this.jMenuItemVerFormNivelCentroCosto.setVisible((this.isVisibilidadCeldaVerFormNivelCentroCosto && this.isPermisoVerFormNivelCentroCosto));			
			this.jMenuItemAbrirOrderByNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));			
			//this.jMenuItemMostrarOcultarNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));
			this.jMenuItemDetalleAbrirOrderByNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));			
			//this.jMenuItemDetalleMostrarOcultarNivelCentroCosto.setVisible((this.isVisibilidadCeldaOrdenNivelCentroCosto && this.isPermisoOrdenNivelCentroCosto));			
			this.jMenuItemNuevoRelacionesNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto));			
			this.jMenuItemNuevoGuardarCambiosNivelCentroCosto.setVisible((this.isVisibilidadCeldaNuevoNivelCentroCosto && this.isPermisoNuevoNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));									
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemModificarNivelCentroCosto.setVisible((this.isVisibilidadCeldaModificarNivelCentroCosto && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemActualizarNivelCentroCosto.setVisible((this.isVisibilidadCeldaActualizarNivelCentroCosto && this.isPermisoActualizarNivelCentroCosto));	
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemEliminarNivelCentroCosto.setVisible((this.isVisibilidadCeldaEliminarNivelCentroCosto && this.isPermisoEliminarNivelCentroCosto));
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemCancelarNivelCentroCosto.setVisible(this.isVisibilidadCeldaCancelarNivelCentroCosto);				
			}
			
			this.jMenuItemGuardarCambiosNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));						
			this.jMenuItemGuardarCambiosTablaNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=this.jButtonNuevoNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaDuplicarNivelCentroCosto=this.jButtonDuplicarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaCopiarNivelCentroCosto=this.jButtonCopiarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaVerFormNivelCentroCosto=this.jButtonVerFormNivelCentroCosto.isVisible();
			
			this.isVisibilidadCeldaOrdenNivelCentroCosto=this.jButtonAbrirOrderByNivelCentroCosto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=this.jButtonNuevoRelacionesNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaModificarNivelCentroCosto=this.jButtonModificarNivelCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.isVisibilidadCeldaActualizarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=this.jButtonGuardarCambiosTablaNivelCentroCosto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNivelCentroCosto=this.jButtonNuevoToolBarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=this.jButtonNuevoRelacionesToolBarNivelCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.isVisibilidadCeldaModificarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarToolBarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarToolBarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarToolBarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarToolBarNivelCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCentroCosto=this.jButtonGuardarCambiosToolBarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNivelCentroCosto=this.jMenuItemNuevoNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=this.jMenuItemNuevoRelacionesNivelCentroCosto.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.isVisibilidadCeldaModificarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemModificarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaActualizarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemActualizarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaEliminarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemEliminarNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaCancelarNivelCentroCosto=this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemCancelarNivelCentroCosto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCentroCosto=this.jMenuItemGuardarCambiosNivelCentroCosto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=this.jMenuItemGuardarCambiosTablaNivelCentroCosto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNivelCentroCosto(Boolean esInicializar) {
		if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
				//if(this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCentroCosto();
			}
			
			this.inicializarActualizarBindingBotonesManualNivelCentroCosto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNivelCentroCosto() {
		this.jButtonNuevoNivelCentroCosto.setVisible(this.isPermisoNuevoNivelCentroCosto);			
		this.jButtonDuplicarNivelCentroCosto.setVisible(this.isPermisoDuplicarNivelCentroCosto);			
		this.jButtonCopiarNivelCentroCosto.setVisible(this.isPermisoCopiarNivelCentroCosto);			
		this.jButtonVerFormNivelCentroCosto.setVisible(this.isPermisoVerFormNivelCentroCosto);			
		
		this.jButtonAbrirOrderByNivelCentroCosto.setVisible(this.isPermisoOrdenNivelCentroCosto);					
		
		this.jButtonNuevoRelacionesNivelCentroCosto.setVisible(this.isPermisoNuevoNivelCentroCosto);			
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarNivelCentroCosto.setVisible(this.isPermisoActualizarNivelCentroCosto);	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.setVisible(this.isPermisoActualizarNivelCentroCosto);	
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.setVisible(this.isPermisoEliminarNivelCentroCosto);
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.setVisible(this.isVisibilidadCeldaCancelarNivelCentroCosto);						
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.setVisible(this.isPermisoGuardarCambiosNivelCentroCosto);							
		}
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.setVisible(this.isPermisoActualizarNivelCentroCosto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCentroCosto() {
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarNivelCentroCosto.setVisible(this.isPermisoActualizarNivelCentroCosto);	
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.setVisible(this.isPermisoActualizarNivelCentroCosto);	
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.setVisible(this.isPermisoEliminarNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.setVisible(this.isVisibilidadCeldaCancelarNivelCentroCosto);							
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.setVisible((this.isVisibilidadCeldaGuardarNivelCentroCosto && this.isPermisoGuardarCambiosNivelCentroCosto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNivelCentroCosto() {
		if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNivelCentroCosto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNivelCentroCosto() {
	}
	
	public void jTableDatosNivelCentroCostoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNivelCentroCosto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNivelCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.getnivelcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcentrocosto==null) {
						this.nivelcentrocosto = new NivelCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				}

				if(this.nivelcentrocosto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.nivelcentrocosto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNivelCentroCostoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNivelCentroCosto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNivelCentroCosto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNivelCentroCosto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.getnivelcentrocosto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.nivelcentrocostoLogic.getConnexion());

				if(this.nivelcentrocosto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.nivelcentrocosto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNivelCentroCosto=(TitledBorder)this.jScrollPanelDatosNivelCentroCosto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNivelCentroCosto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNivelCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.getnivelcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcentrocosto==null) {
						this.nivelcentrocosto = new NivelCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				}

				if(this.nivelcentrocosto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.nivelcentrocosto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnivelNivelCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.getnivelcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcentrocosto==null) {
						this.nivelcentrocosto = new NivelCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				}

				if(this.nivelcentrocosto.getnivel()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nivel = "+this.nivelcentrocosto.getnivel().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_digitosNivelCentroCostoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.getnivelcentrocosto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcentrocosto==null) {
						this.nivelcentrocosto = new NivelCentroCosto();
					}

					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);
				}

				if(this.nivelcentrocosto.getnumero_digitos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_digitos = "+this.nivelcentrocosto.getnumero_digitos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCentroCosto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaNivelCentroCostoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNivelCentroCosto(false,false);

			this.getNivelCentroCostosFK_IdEmpresa();

			this.inicializarActualizarBindingNivelCentroCosto(false);

			//if(NivelCentroCostoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNivelCentroCosto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcentrocostoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNivelCentroCosto() {
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
			this.jInternalFrameDetalleFormNivelCentroCosto.setVisible(false);	    			
			this.jInternalFrameDetalleFormNivelCentroCosto.dispose();
			this.jInternalFrameDetalleFormNivelCentroCosto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
			this.jInternalFrameReporteDinamicoNivelCentroCosto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNivelCentroCosto.dispose();
			this.jInternalFrameReporteDinamicoNivelCentroCosto=null;
		}
		
		if(this.jInternalFrameImportacionNivelCentroCosto!=null) {
			this.jInternalFrameImportacionNivelCentroCosto.setVisible(false);	    			
			this.jInternalFrameImportacionNivelCentroCosto.dispose();
			this.jInternalFrameImportacionNivelCentroCosto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNivelCentroCosto();
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			
			if(sTipo.equals("NuevoNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNivelCentroCosto")) {
				jButtonDuplicarNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNivelCentroCosto")) {
				jButtonCopiarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormNivelCentroCosto")) {
				jButtonVerFormNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNivelCentroCosto")) {
				jButtonDuplicarNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNivelCentroCosto")) {
				jButtonDuplicarNivelCentroCostoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNivelCentroCosto")) {
				jButtonModificarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNivelCentroCosto")) {
				jButtonModificarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNivelCentroCosto")) {
				jButtonModificarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNivelCentroCosto")) {
				jButtonActualizarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNivelCentroCosto")) {
				jButtonActualizarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNivelCentroCosto")) {
				jButtonActualizarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarNivelCentroCosto")) {
				jButtonEliminarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNivelCentroCosto")) {
				jButtonEliminarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNivelCentroCosto")) {
				jButtonEliminarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarNivelCentroCosto")) {
				jButtonCancelarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNivelCentroCosto")) {
				jButtonCancelarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNivelCentroCosto")) {
				jButtonCancelarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarNivelCentroCosto")) {
				jButtonCerrarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNivelCentroCosto")) {
				jButtonCerrarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNivelCentroCosto")) {
				jButtonCerrarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNivelCentroCosto")) {
				jButtonMostrarOcultarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNivelCentroCosto")) {
				jButtonCancelarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNivelCentroCosto")) {
				jButtonCopiarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNivelCentroCosto")) {
				jButtonVerFormNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNivelCentroCosto")) {
				jButtonCopiarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNivelCentroCosto")) {
				jButtonVerFormNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNivelCentroCosto")) {
				jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNivelCentroCosto")) {
				jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNivelCentroCosto")) {
				jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNivelCentroCosto")) {
				jButtonAnterioresNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNivelCentroCosto")) {
				jButtonAnterioresNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNivelCentroCosto")) {
				jButtonAnterioresNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNivelCentroCosto")) {
				jButtonSiguientesNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNivelCentroCosto")) {
				jButtonSiguientesNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNivelCentroCosto")) {
				jButtonSiguientesNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNivelCentroCosto") || sTipo.equals("MenuItemDetalleAbrirOrderByNivelCentroCosto")) {
				jButtonAbrirOrderByNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNivelCentroCosto") || sTipo.equals("MenuItemDetalleMostrarOcultarNivelCentroCosto")) {
				jButtonMostrarOcultarNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCentroCosto")) {
				jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNivelCentroCosto")) {
				jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNivelCentroCosto")) {
				jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNivelCentroCosto")) {
				jButtonCerrarReporteDinamicoNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNivelCentroCosto")) {
				jButtonGenerarReporteDinamicoNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNivelCentroCosto")) {
				
				jButtonGenerarExcelReporteDinamicoNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNivelCentroCosto")) {
				jButtonCerrarImportacionNivelCentroCostoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNivelCentroCosto")) {
				
				jButtonGenerarImportacionNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNivelCentroCosto")) {
				
				jButtonAbrirImportacionNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNivelCentroCosto")) {
				jComboBoxTiposAccionesNivelCentroCostoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNivelCentroCosto")) {
				jComboBoxTiposRelacionesNivelCentroCostoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNivelCentroCosto")) {
				jComboBoxTiposAccionesNivelCentroCostoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNivelCentroCosto")) {
				
				jComboBoxTiposSeleccionarNivelCentroCostoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNivelCentroCosto")) {
				jTextFieldValorCampoGeneralNivelCentroCostoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNivelCentroCosto")) {
				jButtonAbrirOrderByNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNivelCentroCosto")) {
				jButtonAbrirOrderByNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNivelCentroCosto")) {
				jButtonCerrarOrderByNivelCentroCostoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCentroCostoBusqueda")) {
				this.jButtonidNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNivelCentroCostoUpdate")) {
				this.jButtonid_empresaNivelCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNivelCentroCostoBusqueda")) {
				this.jButtonid_empresaNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelNivelCentroCostoBusqueda")) {
				this.jButtonnivelNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitosNivelCentroCostoBusqueda")) {
				this.jButtonnumero_digitosNivelCentroCostoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNivelCentroCosto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NivelCentroCosto nivelcentrocostoLocal=null;
			
			if(!this.getEsControlTabla()) {
				nivelcentrocostoLocal=this.nivelcentrocosto;
			} else {
				nivelcentrocostoLocal=this.nivelcentrocostoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
							
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
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
			
			


			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
								
						
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
								
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
							
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
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
			
			


			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
								
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNivelCentroCosto")) {
					jCheckBoxSeleccionarTodosNivelCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNivelCentroCosto")) {
					jCheckBoxSeleccionadosNivelCentroCostoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNivelCentroCosto")) {
					
				}
				
				


				
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
												
				
				


				
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
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
			
			


			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCentroCostoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcentrocosto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcentrocosto);
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
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
				
				


				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCentroCosto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCentroCosto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCentroCostoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcentrocostoAnterior =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNivelCentroCosto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNivelCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNivelCentroCosto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.nivelcentrocosto =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.nivelcentrocosto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNivelCentroCosto")) {
				
				}
				
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNivelCentroCosto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNivelCentroCosto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNivelCentroCosto")) {
			
			}
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNivelCentroCosto();
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			if(sTipo.equals("NuevoNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNivelCentroCosto")) {
				jButtonDuplicarNivelCentroCostoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNivelCentroCosto")) {
				jButtonCopiarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNivelCentroCosto")) {
				jButtonVerFormNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNivelCentroCosto")) {
				jButtonNuevoNivelCentroCostoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNivelCentroCosto")) {
				jButtonModificarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNivelCentroCosto")) {
				jButtonActualizarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNivelCentroCosto")) {
				jButtonEliminarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNivelCentroCosto")) {
				jButtonCancelarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNivelCentroCosto")) {
				jButtonCerrarNivelCentroCostoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNivelCentroCosto")) {
				jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCentroCosto")) {
				jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNivelCentroCosto")) {
				jButtonAbrirOrderByNivelCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNivelCentroCosto")) {
				jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNivelCentroCosto")) {
				jButtonAnterioresNivelCentroCostoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNivelCentroCosto")) {
				jButtonSiguientesNivelCentroCostoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCentroCostoBusqueda")) {
				this.jButtonidNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNivelCentroCostoUpdate")) {
				this.jButtonid_empresaNivelCentroCostoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNivelCentroCostoBusqueda")) {
				this.jButtonid_empresaNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nivelNivelCentroCostoBusqueda")) {
				this.jButtonnivelNivelCentroCostoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitosNivelCentroCostoBusqueda")) {
				this.jButtonnumero_digitosNivelCentroCostoBusquedaActionPerformed(evt);
			}
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNivelCentroCosto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNivelCentroCosto")) {
				closingInternalFrameNivelCentroCosto();
				
			} else if(sTipo.equals("jButtonCancelarNivelCentroCosto")) {
				JInternalFrameBase jInternalFrameDetalleFormNivelCentroCosto = (JInternalFrameBase)evt.getSource();
	            	
	            NivelCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(NivelCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCentroCosto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNivelCentroCostoActionPerformed(null);
			}
			
			NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcentrocosto,new Object(),this.nivelcentrocostoParameterGeneral,this.nivelcentrocostoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNivelCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNivelCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNivelCentroCosto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.nivelcentrocosto)) {
			if(!esControlTabla) {
				if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);			
				}
				
				if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNivelCentroCosto(this.nivelcentrocosto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.procesarEventosNivelCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcentrocostoLogic.getNivelCentroCostos(),this.nivelcentrocosto,this.nivelcentrocostoParameterGeneral,this.isEsNuevoNivelCentroCosto,classes);//this.nivelcentrocostoLogic.getNivelCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNivelCentroCosto(this.nivelcentrocostoReturnGeneral,this.nivelcentrocostoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNivelCentroCosto(classes,this.nivelcentrocostoReturnGeneral,this.nivelcentrocostoBean,false);
					}
						
					if(this.nivelcentrocostoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto());	
					}
						
					if(this.nivelcentrocostoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto(),classes);//this.nivelcentrocostoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNivelCentroCosto(this.nivelcentrocosto,classes);//this.nivelcentrocostoBean);									
				}
			
				if(NivelCentroCostoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNivelCentroCosto(this.nivelcentrocosto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCentroCosto(this.nivelcentrocosto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.nivelcentrocostoAnterior!=null) {
						this.nivelcentrocosto=this.nivelcentrocostoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.procesarEventosNivelCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcentrocostoLogic.getNivelCentroCostos(),this.nivelcentrocosto,this.nivelcentrocostoParameterGeneral,this.isEsNuevoNivelCentroCosto,classes);//this.nivelcentrocostoLogic.getNivelCentroCosto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcentrocostoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcentrocostoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto(),nivelcentrocostoLogic.getNivelCentroCostos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto(),this.nivelcentrocostos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNivelCentroCosto.repaint();
				
				//((AbstractTableModel) this.jTableDatosNivelCentroCosto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNivelCentroCosto();
			}
		}
	}
	
	public void actualizarVisualTableDatosNivelCentroCosto() throws Exception {
		
		NivelCentroCostoModel nivelcentrocostoModel=(NivelCentroCostoModel)this.jTableDatosNivelCentroCosto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcentrocostoModel.nivelcentrocostos=this.nivelcentrocostoLogic.getNivelCentroCostos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			nivelcentrocostoModel.nivelcentrocostos=this.nivelcentrocostos;
		}
		
		
		((NivelCentroCostoModel) this.jTableDatosNivelCentroCosto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNivelCentroCosto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnivelcentrocostoAnterior(),this.nivelcentrocostoLogic.getNivelCentroCostos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnivelcentrocostoAnterior(),this.nivelcentrocostos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNivelCentroCosto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNivelCentroCosto(NivelCentroCosto nivelcentrocosto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
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
										
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcentrocosto,new Object(),generalEntityParameterGeneral,this.nivelcentrocostoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NivelCentroCostoConstantesFunciones.getClassesRelationshipsOfNivelCentroCosto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NivelCentroCostoConstantesFunciones.getClassesRelationshipsFromStringsOfNivelCentroCosto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNivelCentroCosto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NivelCentroCostoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcentrocosto,new Object(),generalEntityParameterGeneral,this.nivelcentrocostoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNivelCentroCosto(NivelCentroCostoBean nivelcentrocostoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNivelCentroCosto(ArrayList<Classe> classes,NivelCentroCostoReturnGeneral nivelcentrocostoReturnGeneral,NivelCentroCostoBean nivelcentrocostoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNivelCentroCosto(NivelCentroCosto nivelcentrocosto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.nivelcentrocosto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNivelCentroCosto = new NivelCentroCostoDetalleFormJInternalFrame(jDesktopPane,this.nivelcentrocostoSessionBean.getConGuardarRelaciones(),this.nivelcentrocostoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.setVisible(false);
		this.jInternalFrameDetalleFormNivelCentroCosto.setSelected(false);						
		
		this.jInternalFrameDetalleFormNivelCentroCosto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNivelCentroCosto.nivelcentrocostoLogic=this.nivelcentrocostoLogic;
		
		this.cargarCombosFrameForeignKeyNivelCentroCosto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCentroCosto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCentroCosto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNivelCentroCosto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNivelCentroCosto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNivelCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCentroCosto"));
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarNivelCentroCosto"));

		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCentroCosto"));
					
		this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemModificarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarNivelCentroCosto"));
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCentroCosto"));
						
		this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemActualizarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarNivelCentroCosto"));
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCentroCosto"));
								
		this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemEliminarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarNivelCentroCosto"));
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCentroCosto"));
					
		this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemCancelarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCentroCosto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemDetalleCerrarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCentroCosto"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCentroCosto"));
		
		
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCentroCosto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonidNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnivelNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnumero_digitosNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCentroCostoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCentroCosto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNivelCentroCosto"));
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCentroCosto"));
		}
		
		this.jTableDatosNivelCentroCosto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNivelCentroCosto"));
		
		this.jTableDatosNivelCentroCosto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNivelCentroCosto"));
		
		this.jButtonNuevoNivelCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoNivelCentroCosto"));
		
		this.jButtonDuplicarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarNivelCentroCosto"));
		
		this.jButtonCopiarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"CopiarNivelCentroCosto"));
		
		this.jButtonVerFormNivelCentroCosto.addActionListener(new ButtonActionListener(this,"VerFormNivelCentroCosto"));
		
		
		this.jButtonNuevoToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoToolBarNivelCentroCosto"));
			
		this.jButtonDuplicarToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNivelCentroCosto"));
			
		this.jMenuItemNuevoNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNivelCentroCosto"));
			
		this.jMenuItemDuplicarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNivelCentroCosto"));		
		
		
		this.jButtonNuevoRelacionesNivelCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNivelCentroCosto"));
		
		
		this.jButtonNuevoRelacionesToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNivelCentroCosto"));
			
		this.jMenuItemNuevoRelacionesNivelCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNivelCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarNivelCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonModificarToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCentroCosto"));
			
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemModificarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"ActualizarNivelCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonActualizarToolBarNivelCentroCosto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCentroCosto"));
				
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemActualizarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarNivelCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonEliminarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCentroCosto"));
						
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemEliminarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarNivelCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonCancelarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCentroCosto"));
			
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemCancelarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCentroCosto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNivelCentroCosto"));		
		
		
		this.jButtonCerrarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarNivelCentroCosto"));
		
		
		this.jButtonCerrarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarToolBarNivelCentroCosto"));
			
		this.jMenuItemCerrarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNivelCentroCosto"));
			
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jMenuItemDetalleCerrarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCentroCosto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosNivelCentroCosto"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCentroCosto"));
		}
		
		this.jButtonCopiarToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CopiarToolBarNivelCentroCosto"));
			
		this.jButtonVerFormToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"VerFormToolBarNivelCentroCosto"));
		
		this.jMenuItemGuardarCambiosNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNivelCentroCosto"));
			
		this.jMenuItemCopiarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNivelCentroCosto"));		
		
		this.jMenuItemVerFormNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNivelCentroCosto"));		
		
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCentroCosto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNivelCentroCosto"));
			
		this.jMenuItemGuardarCambiosTablaNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCentroCosto"));		
		
		
		
		this.jButtonRecargarInformacionNivelCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionNivelCentroCosto"));
					
		this.jButtonRecargarInformacionToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNivelCentroCosto"));
		
		this.jMenuItemRecargarInformacionNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNivelCentroCosto"));		
		
		
		
		this.jButtonAnterioresNivelCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresNivelCentroCosto"));
		
		
		this.jButtonAnterioresToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNivelCentroCosto"));
		
		this.jMenuItemAnterioresNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNivelCentroCosto"));		
		
		
		this.jButtonSiguientesNivelCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesNivelCentroCosto"));
		
		
		this.jButtonSiguientesToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNivelCentroCosto"));
			
		this.jMenuItemSiguientesNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNivelCentroCosto"));
			
		this.jMenuItemAbrirOrderByNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNivelCentroCosto"));
			
		this.jMenuItemMostrarOcultarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNivelCentroCosto"));
			
		this.jMenuItemDetalleAbrirOrderByNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNivelCentroCosto"));
			
		this.jMenuItemDetalleMostarOcultarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNivelCentroCosto"));		
		
		
		this.jButtonNuevoGuardarCambiosNivelCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNivelCentroCosto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNivelCentroCosto"));
			
		this.jMenuItemNuevoGuardarCambiosNivelCentroCosto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNivelCentroCosto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNivelCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNivelCentroCosto"));

		this.jCheckBoxSeleccionadosNivelCentroCosto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNivelCentroCosto"));
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCentroCosto"));
		}
		
		
		this.jComboBoxTiposRelacionesNivelCentroCosto.addActionListener (new ButtonActionListener(this,"TiposRelacionesNivelCentroCosto"));
			
		this.jComboBoxTiposAccionesNivelCentroCosto.addActionListener (new ButtonActionListener(this,"TiposAccionesNivelCentroCosto"));
					
		this.jComboBoxTiposSeleccionarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNivelCentroCosto"));
			
		this.jTextFieldValorCampoGeneralNivelCentroCosto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNivelCentroCosto"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonidNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnivelNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnumero_digitosNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCentroCostoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNivelCentroCosto!=null) {
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCentroCosto"));
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCentroCosto"));
				this.jInternalFrameReporteDinamicoNivelCentroCosto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCentroCosto"));
			}
			
			//this.jButtonCerrarReporteDinamicoNivelCentroCosto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCentroCosto"));				
			//this.jButtonGenerarReporteDinamicoNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCentroCosto"));
			//this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCentroCosto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNivelCentroCosto!=null) {
				this.jInternalFrameImportacionNivelCentroCosto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCentroCosto"));
				this.jInternalFrameImportacionNivelCentroCosto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCentroCosto"));
				this.jInternalFrameImportacionNivelCentroCosto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCentroCosto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNivelCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByNivelCentroCosto"));
			
			this.jButtonAbrirOrderByToolBarNivelCentroCosto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNivelCentroCosto"));			
			
			if(this.jInternalFrameOrderByNivelCentroCosto!=null) {
				this.jInternalFrameOrderByNivelCentroCosto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCentroCosto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCentroCosto.jTabbedPaneRelacionesNivelCentroCosto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCentroCosto"));
		
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
            		closingInternalFrameNivelCentroCosto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNivelCentroCosto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNivelCentroCosto = (JInternalFrameBase)event.getSource();
	            	
	            NivelCentroCostoBeanSwingJInternalFrame jInternalFrameParent=(NivelCentroCostoBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCentroCosto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNivelCentroCostoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNivelCentroCosto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNivelCentroCostoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNivelCentroCosto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNivelCentroCosto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNivelCentroCosto";
		inputMap = this.jButtonNuevoNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCentroCostoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCentroCostoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNivelCentroCosto";
		inputMap = this.jButtonNuevoRelacionesNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCentroCostoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNivelCentroCosto";
		inputMap = this.jButtonModificarNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNivelCentroCosto";
		inputMap = this.jButtonActualizarNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNivelCentroCosto";
		inputMap = this.jButtonEliminarNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNivelCentroCosto";
		inputMap = this.jButtonCancelarNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNivelCentroCosto";
		inputMap = this.jButtonCerrarNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNivelCentroCosto";
		inputMap = this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonGuardarCambiosNivelCentroCosto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNivelCentroCostoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNivelCentroCosto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNivelCentroCostoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNivelCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNivelCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNivelCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNivelCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNivelCentroCosto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNivelCentroCostoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonidNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCentroCostoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonid_empresaNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnivelNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"nivelNivelCentroCostoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCentroCosto.jButtonnumero_digitosNivelCentroCostoBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitosNivelCentroCostoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNivelCentroCosto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNivelCentroCostoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNivelCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNivelCentroCosto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNivelCentroCosto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
					nivelcentrocostoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostos) {
					nivelcentrocostoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNivelCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
						nivelcentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostos) {
						nivelcentrocostoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNivelCentroCostoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNivelCentroCosto.getSelectedRows();
			
			NivelCentroCosto nivelcentrocostoLocal=new NivelCentroCosto();
			
			//this.seleccionarTodosNivelCentroCosto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcentrocostoLocal =(NivelCentroCosto) this.nivelcentrocostoLogic.getNivelCentroCostos().toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					nivelcentrocostoLocal =(NivelCentroCosto) this.nivelcentrocostos.toArray()[this.jTableDatosNivelCentroCosto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				nivelcentrocostoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
						nivelcentrocostoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostos) {
						nivelcentrocostoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCentroCosto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCentroCosto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCentroCosto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNivelCentroCostoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNivelCentroCostoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNivelCentroCostoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNivelCentroCosto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostoLogic.getNivelCentroCostos()) {
				
						if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							nivelcentrocostoAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS)) {
							existe=true;
							nivelcentrocostoAux.setnumero_digitos(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostos) {
					
						if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NIVEL)) {
							existe=true;
							nivelcentrocostoAux.setnivel(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS)) {
							existe=true;
							nivelcentrocostoAux.setnumero_digitos(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNivelCentroCostoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNivelCentroCosto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNivelCentroCosto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNivelCentroCosto) {				
					conSplash=true;//false;										
					
					//this.startProcessNivelCentroCosto(conSplash);
				
					this.generarReporteNivelCentroCostosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNivelCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCentroCostosSeleccionados(false);
				//this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCentroCostosSeleccionados(true);
				//this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCentroCosto();
				
				this.exportarNivelCentroCostosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNivelCentroCostos();
				//this.importarNivelCentroCostos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCentroCosto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNivelCentroCostosSeleccionados();
				//this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Nivel Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNivelCentroCosto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNivelCentroCosto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNivelCentroCosto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
				}	
			} 			
			else if(NivelCentroCostoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNivelCentroCosto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNivelCentroCosto(conSplash);
					
						//this.actualizarParametrosGeneralNivelCentroCosto();
						
						this.generarReporteProcesoAccionNivelCentroCostosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NivelCentroCostoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Nivel Centro CostoS SELECCIONADOS?", "MANTENIMIENTO DE Nivel Centro Costo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNivelCentroCosto();
				
						this.actualizarParametrosGeneralNivelCentroCosto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.nivelcentrocostoReturnGeneral=nivelcentrocostoLogic.procesarAccionNivelCentroCostosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.nivelcentrocostoLogic.getNivelCentroCostos(),this.nivelcentrocostoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNivelCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNivelCentroCosto();
					
					NivelCentroCostoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNivelCentroCostoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCentroCosto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxTiposAccionesFormularioNivelCentroCosto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNivelCentroCosto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNivelCentroCostoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNivelCentroCosto();
			
			if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
			NivelCentroCosto nivelcentrocosto=new NivelCentroCosto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNivelCentroCosto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNivelCentroCosto.getSelectedItem();
			
			
			
			
			nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
			//this.sTipoAccion;
			
			if(nivelcentrocostosSeleccionados.size()==1) {
				for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
					nivelcentrocosto=nivelcentrocostoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNivelCentroCosto();
			
      		//this.finishProcessNivelCentroCosto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNivelCentroCostoReturnGeneral() throws Exception {
		if(this.nivelcentrocostoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.nivelcentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.nivelcentrocostoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.nivelcentrocostoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.nivelcentrocostoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.nivelcentrocostoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNivelCentroCosto(false);
		}
		
		if(this.nivelcentrocostoReturnGeneral.getConRetornoLista() || this.nivelcentrocostoReturnGeneral.getConRetornoObjeto()) {
			if(this.nivelcentrocostoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcentrocostoLogic.setNivelCentroCostos(this.nivelcentrocostoReturnGeneral.getNivelCentroCostos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.nivelcentrocostoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcentrocostoLogic.setNivelCentroCosto(this.nivelcentrocostoReturnGeneral.getNivelCentroCosto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNivelCentroCosto(false);
		}
	}
	
	public void actualizarParametrosGeneralNivelCentroCosto() throws Exception {
		
		
	}
	
	public ArrayList<NivelCentroCosto> getNivelCentroCostosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNivelCentroCosto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostoLogic.getNivelCentroCostos()) {
					if(nivelcentrocostoAux.getIsSelected()) {
						nivelcentrocostosSeleccionados.add(nivelcentrocostoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCentroCosto nivelcentrocostoAux:this.nivelcentrocostos) {
					if(nivelcentrocostoAux.getIsSelected()) {
						nivelcentrocostosSeleccionados.add(nivelcentrocostoAux);				
					}
				}
			}
			
			if(nivelcentrocostosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						nivelcentrocostosSeleccionados.addAll(this.nivelcentrocostoLogic.getNivelCentroCostos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						nivelcentrocostosSeleccionados.addAll(this.nivelcentrocostos);				
					}
				}
			}
		} else {
			nivelcentrocostosSeleccionados.add(this.nivelcentrocosto);
		}
		
		return nivelcentrocostosSeleccionados;
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
	
	public void generarReporteNivelCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNivelCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNivelCentroCostosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCentroCostosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCentroCostosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Nivel Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados);
		
	}	
	
	public void generarReporteNormalNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNivelCentroCostosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNivelCentroCosto();
		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNivelCentroCosto();
		
		
		//this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados ,nivelcentrocostoImplementable,nivelcentrocostoImplementableHome);
	}
	
	public void mostrarImportacionNivelCentroCostos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNivelCentroCosto();
		
		this.abrirFrameImportacionNivelCentroCosto();		
		
			
		//this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados ,nivelcentrocostoImplementable,nivelcentrocostoImplementableHome);
	}
	
	public void importarNivelCentroCostos() throws Exception {		
	
	}
	
	public void exportarNivelCentroCostosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNivelCentroCostosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNivelCentroCostosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNivelCentroCostosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Nivel Centro Costo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNivelCentroCosto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNivelCentroCosto(nivelcentrocostoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//nivelcentrocostoAux.setsDetalleGeneralEntityReporte(nivelcentrocostoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNivelCentroCosto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NivelCentroCostoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCentroCostoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCentroCostoConstantesFunciones.LABEL_NIVEL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNivelCentroCosto(NivelCentroCosto nivelcentrocosto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nivelcentrocosto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcentrocosto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcentrocosto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcentrocosto.getnivel().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcentrocosto.getnumero_digitos().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NivelCentroCostos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNivelCentroCosto(row);				
				iRow++;
			}				
			
			for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNivelCentroCosto(nivelcentrocostoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNivelCentroCostosSeleccionados() throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();		
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcentrocosto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("nivelcentrocostos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nivelcentrocosto");
			//elementRoot.appendChild(element);
		
			for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
				element = document.createElement("nivelcentrocosto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNivelCentroCosto(nivelcentrocostoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Centro Costo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNivelCentroCosto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NIVEL);
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNivelCentroCosto(NivelCentroCosto nivelcentrocosto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcentrocosto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcentrocosto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcentrocosto.getnivel());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcentrocosto.getnumero_digitos());				
	}
	
	public void setFilaDatosExportarXmlNivelCentroCosto(NivelCentroCosto nivelcentrocosto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NivelCentroCostoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(nivelcentrocosto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NivelCentroCostoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nivelcentrocosto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NivelCentroCostoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(nivelcentrocosto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnivel = document.createElement(NivelCentroCostoConstantesFunciones.NIVEL);
		elementnivel.appendChild(document.createTextNode(nivelcentrocosto.getnivel().toString().trim()));
		element.appendChild(elementnivel);

		Element elementnumero_digitos = document.createElement(NivelCentroCostoConstantesFunciones.NUMERODIGITOS);
		elementnumero_digitos.appendChild(document.createTextNode(nivelcentrocosto.getnumero_digitos().toString().trim()));
		element.appendChild(elementnumero_digitos);
	}
	
	public void generarReporteGroupGenericoNivelCentroCostosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados=new ArrayList<NivelCentroCosto>();
		
		nivelcentrocostosSeleccionados=this.getNivelCentroCostosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNivelCentroCosto(nivelcentrocostosSeleccionados);
		
		this.generarReporteNivelCentroCostos("Todos",nivelcentrocostosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNivelCentroCosto(ArrayList<NivelCentroCosto> nivelcentrocostosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NivelCentroCosto nivelcentrocostoAux:nivelcentrocostosSeleccionados) {
				nivelcentrocostoAux.setsDetalleGeneralEntityReporte(nivelcentrocostoAux.toString());
			
				if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					nivelcentrocostoAux.setsDescripcionGeneralEntityReporte1(nivelcentrocostoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NIVEL)) {
					existe=true;
					nivelcentrocostoAux.setsDescripcionGeneralEntityReporte1(nivelcentrocostoAux.getnivel().toString());
				}
				 else if(sTipoSeleccionar.equals(NivelCentroCostoConstantesFunciones.LABEL_NUMERODIGITOS)) {
					existe=true;
					nivelcentrocostoAux.setsDescripcionGeneralEntityReporte1(nivelcentrocostoAux.getnumero_digitos().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCentroCostoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNivelCentroCosto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNivelCentroCosto=true;
				this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=true;
				this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=true;
			}
			
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=true;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=true;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=true;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=true;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=true;
			this.isVisibilidadCeldaModificarNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
			this.isVisibilidadCeldaModificarNivelCentroCosto=true;
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
			this.isVisibilidadCeldaCancelarNivelCentroCosto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCentroCosto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NivelCentroCostoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNivelCentroCosto=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=true;
		} else {
			this.actualizarEstadoPanelsNivelCentroCosto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNivelCentroCosto=false;
			//this.isVisibilidadCeldaVerFormNivelCentroCosto=false;
			this.isVisibilidadCeldaDuplicarNivelCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!nivelcentrocostoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
		} else {
			this.isVisibilidadCeldaNuevoNivelCentroCosto=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCentroCosto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!nivelcentrocostoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;												
			}
			
			this.jButtonCerrarNivelCentroCosto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCentroCosto=false;
		}
		
		if(!this.permiteMantenimiento(this.nivelcentrocosto)) {
			this.isVisibilidadCeldaActualizarNivelCentroCosto=false;
			this.isVisibilidadCeldaEliminarNivelCentroCosto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCentroCosto() {
	}
	
	public void actualizarEstadoPanelsNivelCentroCosto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNivelCentroCosto!=null) {
				this.jScrollPanelDatosEdicionNivelCentroCosto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCentroCosto!=null) {
				this.jScrollPanelDatosNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCentroCosto!=null) {
				this.jPanelPaginacionNivelCentroCosto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
					this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.nivelcentrocostoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNivelCentroCosto!=null) {
				this.jTabbedPaneBusquedasNivelCentroCosto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNivelCentroCosto!=null) {
				this.jPanelParametrosReportesNivelCentroCosto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NivelCentroCostoSessionBean nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		
		if(this.nivelcentrocostoSessionBean==null) {
			this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		}
		
		this.nivelcentrocostoSessionBean.setsUltimaBusquedaNivelCentroCosto(this.getsAccionBusqueda());
		this.nivelcentrocostoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.nivelcentrocostoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			nivelcentrocostoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NivelCentroCostoSessionBean nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		
		if(this.nivelcentrocostoSessionBean==null) {
			this.nivelcentrocostoSessionBean=new NivelCentroCostoSessionBean();
		}
		
		if(this.nivelcentrocostoSessionBean.getsUltimaBusquedaNivelCentroCosto()!=null&&!this.nivelcentrocostoSessionBean.getsUltimaBusquedaNivelCentroCosto().equals("")) {
			this.setsAccionBusqueda(nivelcentrocostoSessionBean.getsUltimaBusquedaNivelCentroCosto());
			this.setiNumeroPaginacion(nivelcentrocostoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(nivelcentrocostoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(nivelcentrocostoSessionBean.getid_empresa());
				nivelcentrocostoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.nivelcentrocostoSessionBean.setsUltimaBusquedaNivelCentroCosto("");
		this.nivelcentrocostoSessionBean.setiNumeroPaginacion(NivelCentroCostoConstantesFunciones.INUMEROPAGINACION);
		this.nivelcentrocostoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNivelCentroCosto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNivelCentroCosto() {
		this.updateBorderResaltarBusquedasFormularioNivelCentroCosto();
		this.updateVisibilidadBusquedasFormularioNivelCentroCosto();
		this.updateHabilitarBusquedasFormularioNivelCentroCosto();
	}
	
	public void updateBorderResaltarBusquedasFormularioNivelCentroCosto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNivelCentroCosto.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNivelCentroCosto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNivelCentroCosto.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNivelCentroCosto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNivelCentroCosto.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNivelCentroCosto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarNivelCentroCosto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNivelCentroCosto() throws Exception {

		if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNivelCentroCosto();
		this.updateVisibilidadResaltarControlesFormularioNivelCentroCosto();
		this.updateHabilitarResaltarControlesFormularioNivelCentroCosto();
		
	}
	
	public void updateBorderResaltarControlesFormularioNivelCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.nivelcentrocostoConstantesFunciones.resaltaridNivelCentroCosto!=null && this.jInternalFrameDetalleFormNivelCentroCosto!=null) {this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setBorder(this.nivelcentrocostoConstantesFunciones.resaltaridNivelCentroCosto);}
		if(this.nivelcentrocostoConstantesFunciones.resaltarid_empresaNivelCentroCosto!=null && this.jInternalFrameDetalleFormNivelCentroCosto!=null) {this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setBorder(this.nivelcentrocostoConstantesFunciones.resaltarid_empresaNivelCentroCosto);}
		if(this.nivelcentrocostoConstantesFunciones.resaltarnivelNivelCentroCosto!=null && this.jInternalFrameDetalleFormNivelCentroCosto!=null) {this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setBorder(this.nivelcentrocostoConstantesFunciones.resaltarnivelNivelCentroCosto);}
		if(this.nivelcentrocostoConstantesFunciones.resaltarnumero_digitosNivelCentroCosto!=null && this.jInternalFrameDetalleFormNivelCentroCosto!=null) {this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setBorder(this.nivelcentrocostoConstantesFunciones.resaltarnumero_digitosNivelCentroCosto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNivelCentroCosto() throws Exception {		
		if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
	
		//this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostraridNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jPanelidNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostraridNivelCentroCosto);
		//this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarid_empresaNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jPanelid_empresaNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarid_empresaNivelCentroCosto);
		//this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarnivelNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jPanelnivelNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarnivelNivelCentroCosto);
		//this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarnumero_digitosNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jPanelnumero_digitosNivelCentroCosto.setVisible(this.nivelcentrocostoConstantesFunciones.mostrarnumero_digitosNivelCentroCosto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNivelCentroCosto() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCentroCosto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCentroCosto!=null) {
	
		this.jInternalFrameDetalleFormNivelCentroCosto.jLabelidNivelCentroCosto.setEnabled(this.nivelcentrocostoConstantesFunciones.activaridNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jComboBoxid_empresaNivelCentroCosto.setEnabled(this.nivelcentrocostoConstantesFunciones.activarid_empresaNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnivelNivelCentroCosto.setEnabled(this.nivelcentrocostoConstantesFunciones.activarnivelNivelCentroCosto);
		this.jInternalFrameDetalleFormNivelCentroCosto.jTextFieldnumero_digitosNivelCentroCosto.setEnabled(this.nivelcentrocostoConstantesFunciones.activarnumero_digitosNivelCentroCosto);
		}
	}
	
		
}