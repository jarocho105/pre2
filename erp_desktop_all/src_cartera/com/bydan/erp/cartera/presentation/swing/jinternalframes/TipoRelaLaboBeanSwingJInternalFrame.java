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

import com.bydan.erp.cartera.util.TipoRelaLaboConstantesFunciones;
import com.bydan.erp.cartera.util.TipoRelaLaboParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoRelaLaboParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoRelaLaboBean;
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
public class TipoRelaLaboBeanSwingJInternalFrame extends TipoRelaLaboJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRelaLaboBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRelaLabo> tiporelalaboValidator = new ClassValidator<TipoRelaLabo>(TipoRelaLabo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRelaLabo tiporelalabo;	
	public TipoRelaLabo tiporelalaboAux;
	public TipoRelaLabo tiporelalaboAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRelaLabo tiporelalaboTotales;
	public Long idTipoRelaLaboActual;
	public Long iIdNuevoTipoRelaLabo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosInformacionLaboral=false;

	public Boolean getIsTienePermisosInformacionLaboral() {
		return isTienePermisosInformacionLaboral;
	}

	public void setIsTienePermisosInformacionLaboral(Boolean isTienePermisosInformacionLaboral) {
		this.isTienePermisosInformacionLaboral= isTienePermisosInformacionLaboral;
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
	
	public Boolean isPermisoTodoTipoRelaLabo;
	public Boolean isPermisoNuevoTipoRelaLabo;
	public Boolean isPermisoActualizarTipoRelaLabo;
	public Boolean isPermisoActualizarOriginalTipoRelaLabo;
	public Boolean isPermisoEliminarTipoRelaLabo;
	public Boolean isPermisoGuardarCambiosTipoRelaLabo;
	public Boolean isPermisoConsultaTipoRelaLabo;
	public Boolean isPermisoBusquedaTipoRelaLabo;
	public Boolean isPermisoReporteTipoRelaLabo;
	public Boolean isPermisoPaginacionMedioTipoRelaLabo;
	public Boolean isPermisoPaginacionAltoTipoRelaLabo;
	public Boolean isPermisoPaginacionTodoTipoRelaLabo;
	public Boolean isPermisoCopiarTipoRelaLabo;
	public Boolean isPermisoVerFormTipoRelaLabo;
	public Boolean isPermisoDuplicarTipoRelaLabo;
	public Boolean isPermisoOrdenTipoRelaLabo;
	
	
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
	
	public TipoRelaLaboParameterReturnGeneral tiporelalaboReturnGeneral;
	public TipoRelaLaboParameterReturnGeneral tiporelalaboParameterGeneral;
	
	

	public InformacionLaboralLogic informacionlaboralLogic=null;

	public InformacionLaboralLogic getInformacionLaboralLogic() {
		return informacionlaboralLogic;
	}

	public void setInformacionLaboralLogic(InformacionLaboralLogic informacionlaboralLogic) {
		this.informacionlaboralLogic = informacionlaboralLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRelaLabo=false;
	public Boolean esParaAccionDesdeFormularioTipoRelaLabo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRelaLaboSessionBeanAdditional tiporelalaboSessionBeanAdditional=null;
	
	public TipoRelaLaboSessionBeanAdditional getTipoRelaLaboSessionBeanAdditional() {
		return this.tiporelalaboSessionBeanAdditional;
	}
	
	public void setTipoRelaLaboSessionBeanAdditional(TipoRelaLaboSessionBeanAdditional tiporelalaboSessionBeanAdditional) {
		try {
			this.tiporelalaboSessionBeanAdditional=tiporelalaboSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRelaLaboBeanSwingJInternalFrameAdditional tiporelalaboBeanSwingJInternalFrameAdditional=null;
	//public class TipoRelaLaboBeanSwingJInternalFrame
	
	public TipoRelaLaboBeanSwingJInternalFrameAdditional getTipoRelaLaboBeanSwingJInternalFrameAdditional() {
		return this.tiporelalaboBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRelaLaboBeanSwingJInternalFrameAdditional(TipoRelaLaboBeanSwingJInternalFrameAdditional tiporelalaboBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporelalaboBeanSwingJInternalFrameAdditional=tiporelalaboBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRelaLaboLogic tiporelalaboLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRelaLabo tiporelalaboBean;
	public TipoRelaLaboConstantesFunciones tiporelalaboConstantesFunciones;
	//public TipoRelaLaboParameterReturnGeneral tiporelalaboReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRelaLabo> tiporelalabos;	
	//public List<TipoRelaLabo> tiporelalabosEliminados;
	//public List<TipoRelaLabo> tiporelalabosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRelaLabo=true;
	public Boolean isVisibilidadCeldaCopiarTipoRelaLabo=true;
	public Boolean isVisibilidadCeldaVerFormTipoRelaLabo=true;
	public Boolean isVisibilidadCeldaOrdenTipoRelaLabo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaModificarTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaActualizarTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaEliminarTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaCancelarTipoRelaLabo=false;
	public Boolean isVisibilidadCeldaGuardarTipoRelaLabo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRelaLabo() {
		return this.iIdNuevoTipoRelaLabo;
	}

	public void setiIdNuevoTipoRelaLabo(Long iIdNuevoTipoRelaLabo) {
		this.iIdNuevoTipoRelaLabo = iIdNuevoTipoRelaLabo;
	}
	
	public Long getidTipoRelaLaboActual() {
		return this.idTipoRelaLaboActual;
	}

	public void setidTipoRelaLaboActual(Long idTipoRelaLaboActual) {
		this.idTipoRelaLaboActual = idTipoRelaLaboActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRelaLabo gettiporelalabo() {
		return this.tiporelalabo;
	}

	public void settiporelalabo(TipoRelaLabo tiporelalabo) {
		this.tiporelalabo = tiporelalabo;
	}
	
	public TipoRelaLabo gettiporelalaboAux() {
		return this.tiporelalaboAux;
	}

	public void settiporelalaboAux(TipoRelaLabo tiporelalaboAux) {
		this.tiporelalaboAux = tiporelalaboAux;
	}				
	
	public TipoRelaLabo gettiporelalaboAnterior() {
		return this.tiporelalaboAnterior;
	}

	public void settiporelalaboAnterior(TipoRelaLabo tiporelalaboAnterior) {
		this.tiporelalaboAnterior = tiporelalaboAnterior;
	}	
	
	public TipoRelaLabo gettiporelalaboTotales() {
		return this.tiporelalaboTotales;
	}

	public void settiporelalaboTotales(TipoRelaLabo tiporelalaboTotales) {
		this.tiporelalaboTotales = tiporelalaboTotales;
	}	
	
	public TipoRelaLabo gettiporelalaboBean() {
		return this.tiporelalaboBean;
	}

	public void settiporelalaboBean(TipoRelaLabo tiporelalaboBean) {
		this.tiporelalaboBean = tiporelalaboBean;
	}	
	
	public TipoRelaLaboParameterReturnGeneral gettiporelalaboReturnGeneral() {
		return this.tiporelalaboReturnGeneral;
	}

	public void settiporelalaboReturnGeneral(TipoRelaLaboParameterReturnGeneral tiporelalaboReturnGeneral) {
		this.tiporelalaboReturnGeneral = tiporelalaboReturnGeneral;
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
	
	
	public TipoRelaLaboLogic getTipoRelaLaboLogic()	{		
		return tiporelalaboLogic;
	}

	public void setTipoRelaLaboLogic(TipoRelaLaboLogic tiporelalaboLogic) {
		this.tiporelalaboLogic = tiporelalaboLogic;
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
	
	public Boolean getIsEsNuevoTipoRelaLabo() {
		return isEsNuevoTipoRelaLabo;
	}

	public void setIsEsNuevoTipoRelaLabo(Boolean isEsNuevoTipoRelaLabo) {
		this.isEsNuevoTipoRelaLabo = isEsNuevoTipoRelaLabo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRelaLabo() {
		return esParaAccionDesdeFormularioTipoRelaLabo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRelaLabo(Boolean esParaAccionDesdeFormularioTipoRelaLabo) {
		this.esParaAccionDesdeFormularioTipoRelaLabo = esParaAccionDesdeFormularioTipoRelaLabo;
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

			if(this.tiporelalaboSessionBean==null) {
				this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
			}

			if(!this.tiporelalaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporelalaboSessionBean.getlidEmpresaActual());
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

					if(this.tiporelalabo!=null) {
						this.tiporelalabo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
						this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRelaLabo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
						if(this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRelaLaboGenerico)throws Exception
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
				jComboBoxid_empresaTipoRelaLaboGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRelaLaboGenerico!=null && jComboBoxid_empresaTipoRelaLaboGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRelaLaboGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRelaLabo tiporelalabo,JComboBox jComboBoxid_empresaTipoRelaLaboGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRelaLaboGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRelaLaboGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporelalabo.setid_empresa(empresaAux.getId());
				tiporelalabo.setempresa_descripcion(TipoRelaLaboConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporelalabo.setEmpresa(empresaAux);			}
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

					if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { 
							this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { 
					}

					if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
							this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
							this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRelaLabo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRelaLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoRelaLabo(this.tiporelalaboLogic.getTipoRelaLabos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRelaLaboConstantesFunciones.refrescarForeignKeysDescripcionesTipoRelaLabo(this.tiporelalabos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporelalaboLogic.setTipoRelaLabos(this.tiporelalabos);
			tiporelalaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRelaLaboParameterReturnGeneral getTipoRelaLaboParameterGeneral() {
		return this.tiporelalaboParameterGeneral;
	}
	
	public void setTipoRelaLaboParameterGeneral(TipoRelaLaboParameterReturnGeneral tiporelalaboParameterGeneral) {
		this.tiporelalaboParameterGeneral = tiporelalaboParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRelaLabo() {
		return isPermisoTodoTipoRelaLabo;
	}

	public void setIsPermisoTodoTipoRelaLabo(Boolean isPermisoTodoTipoRelaLabo) {
		this.isPermisoTodoTipoRelaLabo = isPermisoTodoTipoRelaLabo;
	}

	public Boolean getIsPermisoNuevoTipoRelaLabo() {
		return isPermisoNuevoTipoRelaLabo;
	}

	public void setIsPermisoNuevoTipoRelaLabo(Boolean isPermisoNuevoTipoRelaLabo) {
		this.isPermisoNuevoTipoRelaLabo = isPermisoNuevoTipoRelaLabo;
	}

	public Boolean getIsPermisoActualizarTipoRelaLabo() {
		return isPermisoActualizarTipoRelaLabo;
	}

	public void setIsPermisoActualizarTipoRelaLabo(Boolean isPermisoActualizarTipoRelaLabo) {
		this.isPermisoActualizarTipoRelaLabo = isPermisoActualizarTipoRelaLabo;
	}

	public Boolean getIsPermisoEliminarTipoRelaLabo() {
		return isPermisoEliminarTipoRelaLabo;
	}

	public void setIsPermisoEliminarTipoRelaLabo(Boolean isPermisoEliminarTipoRelaLabo) {
		this.isPermisoEliminarTipoRelaLabo = isPermisoEliminarTipoRelaLabo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRelaLabo() {
		return isPermisoGuardarCambiosTipoRelaLabo;
	}

	public void setIsPermisoGuardarCambiosTipoRelaLabo(Boolean isPermisoGuardarCambiosTipoRelaLabo) {
		this.isPermisoGuardarCambiosTipoRelaLabo = isPermisoGuardarCambiosTipoRelaLabo;
	}
	
	public Boolean getIsPermisoConsultaTipoRelaLabo() {
		return isPermisoConsultaTipoRelaLabo;
	}

	public void setIsPermisoConsultaTipoRelaLabo(Boolean isPermisoConsultaTipoRelaLabo) {
		this.isPermisoConsultaTipoRelaLabo = isPermisoConsultaTipoRelaLabo;
	}

	public Boolean getIsPermisoBusquedaTipoRelaLabo() {
		return isPermisoBusquedaTipoRelaLabo;
	}

	public void setIsPermisoBusquedaTipoRelaLabo(Boolean isPermisoBusquedaTipoRelaLabo) {
		this.isPermisoBusquedaTipoRelaLabo = isPermisoBusquedaTipoRelaLabo;
	}

	public Boolean getIsPermisoReporteTipoRelaLabo() {
		return isPermisoReporteTipoRelaLabo;
	}

	public void setIsPermisoReporteTipoRelaLabo(Boolean isPermisoReporteTipoRelaLabo) {
		this.isPermisoReporteTipoRelaLabo = isPermisoReporteTipoRelaLabo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRelaLabo() {
		return isPermisoPaginacionMedioTipoRelaLabo;
	}

	public void setIsPermisoPaginacionMedioTipoRelaLabo(Boolean isPermisoPaginacionMedioTipoRelaLabo) {
		this.isPermisoPaginacionMedioTipoRelaLabo = isPermisoPaginacionMedioTipoRelaLabo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRelaLabo() {
		return isPermisoPaginacionTodoTipoRelaLabo;
	}

	public void setIsPermisoPaginacionTodoTipoRelaLabo(Boolean isPermisoPaginacionTodoTipoRelaLabo) {
		this.isPermisoPaginacionTodoTipoRelaLabo = isPermisoPaginacionTodoTipoRelaLabo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRelaLabo() {
		return isPermisoPaginacionAltoTipoRelaLabo;
	}

	public void setIsPermisoPaginacionAltoTipoRelaLabo(Boolean isPermisoPaginacionAltoTipoRelaLabo) {
		this.isPermisoPaginacionAltoTipoRelaLabo = isPermisoPaginacionAltoTipoRelaLabo;
	}
	
	public Boolean getIsPermisoCopiarTipoRelaLabo() {
		return isPermisoCopiarTipoRelaLabo;
	}

	public void setIsPermisoCopiarTipoRelaLabo(Boolean isPermisoCopiarTipoRelaLabo) {
		this.isPermisoCopiarTipoRelaLabo = isPermisoCopiarTipoRelaLabo;
	}
	
	public Boolean getIsPermisoVerFormTipoRelaLabo() {
		return isPermisoVerFormTipoRelaLabo;
	}

	public void setIsPermisoVerFormTipoRelaLabo(Boolean isPermisoVerFormTipoRelaLabo) {
		this.isPermisoVerFormTipoRelaLabo = isPermisoVerFormTipoRelaLabo;
	}
	
	public Boolean getIsPermisoDuplicarTipoRelaLabo() {
		return isPermisoDuplicarTipoRelaLabo;
	}

	public void setIsPermisoDuplicarTipoRelaLabo(Boolean isPermisoDuplicarTipoRelaLabo) {
		this.isPermisoDuplicarTipoRelaLabo = isPermisoDuplicarTipoRelaLabo;
	}
	
	public Boolean getIsPermisoOrdenTipoRelaLabo() {
		return isPermisoOrdenTipoRelaLabo;
	}

	public void setIsPermisoOrdenTipoRelaLabo(Boolean isPermisoOrdenTipoRelaLabo) {
		this.isPermisoOrdenTipoRelaLabo = isPermisoOrdenTipoRelaLabo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRelaLabo() {
		return isVisibilidadCeldaNuevoTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaNuevoTipoRelaLabo(Boolean isVisibilidadCeldaNuevoTipoRelaLabo) {
		this.isVisibilidadCeldaNuevoTipoRelaLabo = isVisibilidadCeldaNuevoTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRelaLabo() {
		return isVisibilidadCeldaDuplicarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRelaLabo(Boolean isVisibilidadCeldaDuplicarTipoRelaLabo) {
		this.isVisibilidadCeldaDuplicarTipoRelaLabo = isVisibilidadCeldaDuplicarTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRelaLabo() {
		return isVisibilidadCeldaCopiarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaCopiarTipoRelaLabo(Boolean isVisibilidadCeldaCopiarTipoRelaLabo) {
		this.isVisibilidadCeldaCopiarTipoRelaLabo = isVisibilidadCeldaCopiarTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRelaLabo() {
		return isVisibilidadCeldaVerFormTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaVerFormTipoRelaLabo(Boolean isVisibilidadCeldaVerFormTipoRelaLabo) {
		this.isVisibilidadCeldaVerFormTipoRelaLabo = isVisibilidadCeldaVerFormTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRelaLabo() {
		return isVisibilidadCeldaOrdenTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaOrdenTipoRelaLabo(Boolean isVisibilidadCeldaOrdenTipoRelaLabo) {
		this.isVisibilidadCeldaOrdenTipoRelaLabo = isVisibilidadCeldaOrdenTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRelaLabo() {
		return isVisibilidadCeldaNuevoRelacionesTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRelaLabo(Boolean isVisibilidadCeldaNuevoRelacionesTipoRelaLabo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo = isVisibilidadCeldaNuevoRelacionesTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRelaLabo() {
		return isVisibilidadCeldaModificarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaModificarTipoRelaLabo(Boolean isVisibilidadCeldaModificarTipoRelaLabo) {
		this.isVisibilidadCeldaModificarTipoRelaLabo = isVisibilidadCeldaModificarTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRelaLabo() {
		return isVisibilidadCeldaActualizarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaActualizarTipoRelaLabo(Boolean isVisibilidadCeldaActualizarTipoRelaLabo) {
		this.isVisibilidadCeldaActualizarTipoRelaLabo = isVisibilidadCeldaActualizarTipoRelaLabo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRelaLabo() {
		return isVisibilidadCeldaEliminarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaEliminarTipoRelaLabo(Boolean isVisibilidadCeldaEliminarTipoRelaLabo) {
		this.isVisibilidadCeldaEliminarTipoRelaLabo = isVisibilidadCeldaEliminarTipoRelaLabo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRelaLabo() {
		return isVisibilidadCeldaCancelarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaCancelarTipoRelaLabo(Boolean isVisibilidadCeldaCancelarTipoRelaLabo) {
		this.isVisibilidadCeldaCancelarTipoRelaLabo = isVisibilidadCeldaCancelarTipoRelaLabo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRelaLabo() {
		return isVisibilidadCeldaGuardarTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaGuardarTipoRelaLabo(Boolean isVisibilidadCeldaGuardarTipoRelaLabo) {
		this.isVisibilidadCeldaGuardarTipoRelaLabo = isVisibilidadCeldaGuardarTipoRelaLabo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRelaLabo() {
		return isVisibilidadCeldaGuardarCambiosTipoRelaLabo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRelaLabo(Boolean isVisibilidadCeldaGuardarCambiosTipoRelaLabo) {
		this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo = isVisibilidadCeldaGuardarCambiosTipoRelaLabo;
	}
		
	public TipoRelaLaboSessionBean gettiporelalaboSessionBean() {
		return this.tiporelalaboSessionBean;
	}
	
	public void settiporelalaboSessionBean(TipoRelaLaboSessionBean tiporelalaboSessionBean) {
		this.tiporelalaboSessionBean=tiporelalaboSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(TipoRelaLabo tiporelalabo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporelalabo,null);
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
	
	public void bugActualizarReferenciaActual(TipoRelaLabo tiporelalabo,TipoRelaLabo tiporelalaboAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRelaLabo(tiporelalabo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporelalaboAux.setId(tiporelalabo.getId());
		tiporelalaboAux.setVersionRow(tiporelalabo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRelaLabo();
		
			int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporelalaboValidator.getInvalidValues(this.tiporelalabo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporelalaboLogic.setDatosCliente(datosCliente);
			tiporelalaboLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporelalaboAux=new  TipoRelaLabo();
				
				tiporelalaboAux.setIsNew(true);
				tiporelalaboAux.setIsChanged(true);
				
				tiporelalaboAux.setTipoRelaLaboOriginal(this.tiporelalabo);
				
				tiporelalaboAux.setId(this.tiporelalabo.getId());	
				tiporelalaboAux.setVersionRow(this.tiporelalabo.getVersionRow());	
				tiporelalaboAux.setid_empresa(this.tiporelalabo.getid_empresa());	
				tiporelalaboAux.setcodigo(this.tiporelalabo.getcodigo());	
				tiporelalaboAux.setnombre(this.tiporelalabo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporelalaboAux,tiporelalabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboLogic.saveTipoRelaLabos();//WithConnection
						//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoRelaLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporelalaboLogic.saveTipoRelaLaboRelaciones(tiporelalaboAux,this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporelalaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporelalaboAux,tiporelalabos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporelalaboAux=new  TipoRelaLabo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporelalaboSessionBean.getEsGuardarRelacionado() && this.tiporelalabo.getId()>=0)) {
						
					tiporelalaboAux.setIsNew(false);
				}
				
				tiporelalaboAux.setIsDeleted(false);
			
				tiporelalaboAux.setId(this.tiporelalabo.getId());	
				tiporelalaboAux.setVersionRow(this.tiporelalabo.getVersionRow());	
				tiporelalaboAux.setid_empresa(this.tiporelalabo.getid_empresa());	
				tiporelalaboAux.setcodigo(this.tiporelalabo.getcodigo());	
				tiporelalaboAux.setnombre(this.tiporelalabo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporelalaboAux,tiporelalabos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboLogic.saveTipoRelaLabos();//WithConnection
						//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);
					
					this.refrescarForeignKeysDescripcionesTipoRelaLabo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporelalaboLogic.saveTipoRelaLaboRelaciones(tiporelalaboAux,this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporelalaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporelalaboAux,tiporelalabos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporelalabo,tiporelalaboAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporelalaboAux=new  TipoRelaLabo();
				
				tiporelalaboAux.setIsNew(false);
				tiporelalaboAux.setIsChanged(false);
				
				tiporelalaboAux.setIsDeleted(true);
				
				tiporelalaboAux.setId(this.tiporelalabo.getId());	
				tiporelalaboAux.setVersionRow(this.tiporelalabo.getVersionRow());	
				tiporelalaboAux.setid_empresa(this.tiporelalabo.getid_empresa());	
				tiporelalaboAux.setcodigo(this.tiporelalabo.getcodigo());	
				tiporelalaboAux.setnombre(this.tiporelalabo.getnombre());	
				
				if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporelalaboAux.getId()>=0) {	
						this.tiporelalabosEliminados.add(tiporelalaboAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporelalaboAux,tiporelalabos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboLogic.saveTipoRelaLabos();//WithConnection
						//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals().addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals.addAll(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporelalaboLogic.saveTipoRelaLaboRelaciones(tiporelalaboAux,this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());//WithConnection
								//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(new ArrayList<InformacionLaboral>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals= new ArrayList<InformacionLaboral>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporelalaboAux.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporelalaboAux,tiporelalaboLogic.getTipoRelaLabos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporelalaboAux,tiporelalabos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getTipoRelaLabos().addAll(this.tiporelalabosEliminados);
					
					tiporelalaboLogic.saveTipoRelaLabos();//WithConnection
					//tiporelalaboLogic.getSetVersionRowTipoRelaLabos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRelaLabo();
				
				this.tiporelalabosEliminados= new ArrayList<TipoRelaLabo>();		
			}
			
			if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Rela Labo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporelalabo=tiporelalaboAux;
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
      		//this.finishProcessTipoRelaLabo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRelaLabo tiporelalaboLocal) throws Exception {
		
		if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporelalaboLocal.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
			
			} else {
			
				tiporelalaboLocal.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaborals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRelaLabo tiporelalaboLocal) throws Exception {	
		if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporelalaboLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRelaLaboActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporelalaboValidator.getInvalidValues(this.tiporelalabo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRelaLabo tiporelalabo,List<TipoRelaLabo> tiporelalabos) throws Exception {
		try	{		
			TipoRelaLaboConstantesFunciones.actualizarLista(tiporelalabo,tiporelalabos,this.tiporelalaboSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRelaLabo tiporelalabo,List<TipoRelaLabo> tiporelalabos) throws Exception {
		try	{			
			TipoRelaLaboConstantesFunciones.actualizarSelectedLista(tiporelalabo,tiporelalabos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRelaLabo> tiporelalabosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporelalabosLocal=this.tiporelalaboLogic.getTipoRelaLabos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporelalabosLocal=this.tiporelalabos;
			}
			//ARCHITECTURE
		
			for(TipoRelaLabo tiporelalaboLocal:tiporelalabosLocal) {
				if(this.permiteMantenimiento(tiporelalaboLocal) && tiporelalaboLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRelaLaboConstantesFunciones.getTipoRelaLaboLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRelaLaboConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelid_empresaTipoRelaLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRelaLaboConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelcodigoTipoRelaLabo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRelaLaboConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelnombreTipoRelaLabo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelid_empresaTipoRelaLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelcodigoTipoRelaLabo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelnombreTipoRelaLabo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("InformacionLaboral")) {
			if(this.tiporelalabo==null) {
				this.tiporelalabo= new TipoRelaLabo();
			}

			if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRelaLabo
				this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);

				this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.getinformacionlaboral().setTipoRelaLabo(this.tiporelalabo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRelaLabo--;	
		
		
		this.tiporelalaboAux=new TipoRelaLabo();
		
		this.tiporelalaboAux.setId(this.iIdNuevoTipoRelaLabo);
		this.tiporelalaboAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporelalaboLogic.getTipoRelaLabos().add(this.tiporelalaboAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporelalabos.add(this.tiporelalaboAux);
		}
		//ARCHITECTURE
		
		this.tiporelalabo=this.tiporelalaboAux;
		
		if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRelaLabo(this.tiporelalabo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRelaLabo(this.tiporelalabo);
		}
				
		//this.setDefaultControlesTipoRelaLabo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRelaLabo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRelaLabo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRelaLabo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRelaLabo(this.tiporelalaboBean,this.tiporelalabo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRelaLaboConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
			classes=TipoRelaLaboConstantesFunciones.getClassesRelationshipsOfTipoRelaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporelalaboReturnGeneral=tiporelalaboLogic.procesarEventosTipoRelaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporelalaboLogic.getTipoRelaLabos(),this.tiporelalabo,this.tiporelalaboParameterGeneral,this.isEsNuevoTipoRelaLabo,classes);//this.tiporelalaboLogic.getTipoRelaLabo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRelaLabo(this.tiporelalaboReturnGeneral,this.tiporelalaboBean,false);
		
		if(this.tiporelalaboReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo());
		}
		
		if(this.tiporelalaboReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo(),classes);//this.tiporelalaboBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRelaLabo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRelaLabo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.RecargarFormTipoRelaLabo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRelaLabo(false);
						
			if(tiporelalaboSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado() && InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionLaboralActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRelaLabo();
			}
			
			this.actualizarVisualTableDatosTipoRelaLabo();
			
			this.jTableDatosTipoRelaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoRelaLabo(), this.getIndiceNuevoTipoRelaLabo());
			
			this.seleccionarFilaTablaTipoRelaLaboActual();
						
			this.actualizarEstadoCeldasBotonesTipoRelaLabo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRelaLabo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setEnabled(isHabilitar && this.tiporelalaboConstantesFunciones.activarcodigoTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setEnabled(isHabilitar && this.tiporelalaboConstantesFunciones.activarnombreTipoRelaLabo);	
		//
		this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setEnabled(isHabilitar && this.tiporelalaboConstantesFunciones.activarid_empresaTipoRelaLabo);
	};
	
	public void setDefaultControlesTipoRelaLabo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRelaLabo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporelalaboSessionBean.setConGuardarRelaciones(true);			
			this.tiporelalaboSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporelalaboSessionBean.setConGuardarRelaciones(false);			
			this.tiporelalaboSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRelaLabo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
				if(tiporelalaboAux.getId().equals(this.iIdNuevoTipoRelaLabo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalabos) {
				if(tiporelalaboAux.getId().equals(this.iIdNuevoTipoRelaLabo)) {
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
	
	public int getIndiceActualTipoRelaLabo(TipoRelaLabo tiporelalabo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
				if(tiporelalaboAux.getId().equals(tiporelalabo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalabos) {
				if(tiporelalaboAux.getId().equals(tiporelalabo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRelaLabo(TipoRelaLabo tiporelalaboOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
				if(tiporelalaboAux.getTipoRelaLaboOriginal().getId().equals(tiporelalaboOriginal.getId())) {
					existe=true;
					tiporelalaboOriginal.setId(tiporelalaboAux.getId());
					tiporelalaboOriginal.setVersionRow(tiporelalaboAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRelaLabo tiporelalaboAux:this.tiporelalabos) {
				if(tiporelalaboAux.getTipoRelaLaboOriginal().getId().equals(tiporelalaboOriginal.getId())) {
					existe=true;
					tiporelalaboOriginal.setId(tiporelalaboAux.getId());
					tiporelalaboOriginal.setVersionRow(tiporelalaboAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRelaLabo(Boolean esParaCancelar) throws Exception {
		tiporelalabosAux=new ArrayList<TipoRelaLabo>();
		tiporelalaboAux=new TipoRelaLabo();
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
					if(tiporelalaboAux.getId()<0) {
						tiporelalabosAux.add(tiporelalaboAux);
					}		
				}
				this.iIdNuevoTipoRelaLabo=0L;
				this.tiporelalaboLogic.getTipoRelaLabos().removeAll(tiporelalabosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRelaLabo tiporelalaboAux:this.tiporelalabos) {
					if(tiporelalaboAux.getId()<0) {
						tiporelalabosAux.add(tiporelalaboAux);
					}		
				}
				this.iIdNuevoTipoRelaLabo=0L;
				this.tiporelalabos.removeAll(tiporelalabosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRelaLabo 
					&& this.tiporelalaboLogic.getTipoRelaLabos().size()>0
					) {
					tiporelalaboAux=this.tiporelalaboLogic.getTipoRelaLabos().get(this.tiporelalaboLogic.getTipoRelaLabos().size() - 1);
				
					if(tiporelalaboAux.getId()<0) {
						this.tiporelalaboLogic.getTipoRelaLabos().remove(tiporelalaboAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRelaLabo && this.tiporelalabos.size()>0) {
					tiporelalaboAux=this.tiporelalabos.get(this.tiporelalabos.size() - 1);
				
					if(tiporelalaboAux.getId()<0) {
						this.tiporelalabos.remove(tiporelalaboAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRelaLabo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporelalabo.getId()<0) {
				this.tiporelalaboLogic.getTipoRelaLabos().remove(this.tiporelalabo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporelalabo.getId()<0) {
				this.tiporelalabos.remove(this.tiporelalabo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRelaLabo(List<TipoRelaLabo> tiporelalabosAux) throws Exception {
		TipoRelaLaboConstantesFunciones.setEstadosInicialesTipoRelaLabo(tiporelalabosAux);
	}
	
	public void setEstadosInicialesTipoRelaLabo(TipoRelaLabo tiporelalaboAux) throws Exception {
		TipoRelaLaboConstantesFunciones.setEstadosInicialesTipoRelaLabo(tiporelalaboAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRelaLaboActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRelaLaboActual()) {
				if(!this.isEsNuevoTipoRelaLabo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRelaLabo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRelaLaboActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Rela Labo ?", "MANTENIMIENTO DE Tipo Rela Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRelaLabo tiporelalabo) throws Exception {
		TipoRelaLaboConstantesFunciones.seleccionarAsignar(this.tiporelalabo,tiporelalabo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRelaLabo=this.isPermisoActualizarOriginalTipoRelaLabo;
			
			
			this.seleccionarAsignar(tiporelalabo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRelaLaboConstantesFunciones.quitarEspaciosTipoRelaLabo(this.tiporelalabo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRelaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporelalaboSessionBean.setsFuncionBusquedaRapida(this.tiporelalaboSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRelaLabo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRelaLabo(esParaCancelar);				
				this.cancelarNuevoTipoRelaLabo(esParaCancelar);								
			}
			
			this.tiporelalabo=new TipoRelaLabo();
			
			this.inicializarTipoRelaLabo();
			
			this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRelaLabo() throws Exception {
		try {
			TipoRelaLaboConstantesFunciones.inicializarTipoRelaLabo(this.tiporelalabo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporelalaboLogic.getTipoRelaLabos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRelaLabos(String sAccionBusqueda,List<TipoRelaLabo> tiporelalabosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRelaLabo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRelaLaboMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRelaLaboMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRelaLabo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Rela Labos");		
		parameters.put("busquedapor", TipoRelaLaboConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(InformacionLaboral.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRelaLaboLogic tiporelalaboLogicAuxiliar=new TipoRelaLaboLogic();
					tiporelalaboLogicAuxiliar.setDatosCliente(tiporelalaboLogic.getDatosCliente());				
					tiporelalaboLogicAuxiliar.setTipoRelaLabos(tiporelalabosParaReportes);
					
					tiporelalaboLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRelaLaboWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporelalabosParaReportes=tiporelalaboLogicAuxiliar.getTipoRelaLabos();
					
					//tiporelalaboLogic.getNewConnexionToDeep();
					
					//for (TipoRelaLabo tiporelalabo:tiporelalabosParaReportes) {
					//	tiporelalaboLogic.deepLoad(tiporelalabo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporelalaboLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporelalaboLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileInformacionLaboral = AuxiliarReportes.class.getResourceAsStream("InformacionLaboralDetalleRelacionesDesign.jasper");
			parameters.put("subreport_informacionlaboral", reportFileInformacionLaboral);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRelaLabo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRelaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRelaLaboConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRelaLabo=new JRBeanArrayDataSource(TipoRelaLaboJInternalFrame.TraerTipoRelaLaboBeans(tiporelalabosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRelaLabo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRelaLaboConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRelaLaboConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRelaLaboBean.TraerTipoRelaLaboBeans(tiporelalabosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRelaLaboActionPerformed(null);
					//this.generarExcelReporteTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRelaLabos(sAccionBusqueda,sTipoArchivoReporte,tiporelalabosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRelaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRelaLabo> tiporelalabosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRelaLabos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRelaLabo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRelaLabo tiporelalabo : tiporelalabosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRelaLaboConstantesFunciones.generarExcelReporteDataTipoRelaLabo("NORMAL",row,workbook,tiporelalabo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRelaLabo(String sTipo,Row row,Workbook workbook) {
		
		TipoRelaLaboConstantesFunciones.generarExcelReporteHeaderTipoRelaLabo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRelaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRelaLabo> tiporelalabosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRelaLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRelaLabo tiporelalabo : tiporelalabosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRelaLaboConstantesFunciones.getTipoRelaLaboDescripcion(tiporelalabo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporelalabo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRelaLaboConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporelalabo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporelalabo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRelaLabos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRelaLabo> tiporelalabosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRelaLabo> tiporelalabosRespaldo=null;
		
		classes=TipoRelaLaboConstantesFunciones.getClassesRelationshipsOfTipoRelaLabo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporelalaboLogic.setDatosCliente(this.datosCliente);
		this.tiporelalaboLogic.setDatosDeep(this.datosDeep);
		this.tiporelalaboLogic.setIsConDeep(true);
		
		tiporelalabosRespaldo=this.tiporelalaboLogic.getTipoRelaLabos();
		
		this.tiporelalaboLogic.setTipoRelaLabos(tiporelalabosParaReportes);	
		this.tiporelalaboLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporelalabosParaReportes=this.tiporelalaboLogic.getTipoRelaLabos();
		this.tiporelalaboLogic.setTipoRelaLabos(tiporelalabosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRelaLabos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRelaLabo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRelaLabo tiporelalabo : tiporelalabosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRelaLabo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRelaLaboConstantesFunciones.generarExcelReporteDataTipoRelaLabo("NORMAL",row,workbook,tiporelalabo,cellStyleDataAux);
		
			
			


				//InformacionLaboral
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporelalabo.getInformacionLaborals()!=null && tiporelalabo.getInformacionLaborals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					InformacionLaboralConstantesFunciones.generarExcelReporteHeaderInformacionLaboral("RELACIONADO",row,workbook);
				}

				if(tiporelalabo.getInformacionLaborals()!=null) {
					i2=0;
					for(InformacionLaboral informacionlaboral : tiporelalabo.getInformacionLaborals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						InformacionLaboralConstantesFunciones.generarExcelReporteDataInformacionLaboral("RELACIONADO",row,workbook,informacionlaboral,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRelaLaboConstantesFunciones.getTipoRelaLaboDescripcion(tiporelalabo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRelaLabo() throws Exception {		
		this.startProcessTipoRelaLabo(true);
	}
	
	public void startProcessTipoRelaLabo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRelaLabo ,this.jPanelParametrosReportesTipoRelaLabo, this.jScrollPanelDatosTipoRelaLabo,this.jPanelPaginacionTipoRelaLabo, this.jScrollPanelDatosEdicionTipoRelaLabo, this.jPanelAccionesTipoRelaLabo,this.jPanelAccionesFormularioTipoRelaLabo,this.jmenuBarTipoRelaLabo,this.jmenuBarDetalleTipoRelaLabo,this.jTtoolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRelaLabo=this.jTabbedPaneBusquedasTipoRelaLabo; 
		
		final JPanel jPanelParametrosReportesTipoRelaLabo=this.jPanelParametrosReportesTipoRelaLabo;
		//final JScrollPane jScrollPanelDatosTipoRelaLabo=this.jScrollPanelDatosTipoRelaLabo;
		final JTable jTableDatosTipoRelaLabo=this.jTableDatosTipoRelaLabo;		
		final JPanel jPanelPaginacionTipoRelaLabo=this.jPanelPaginacionTipoRelaLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoRelaLabo=this.jScrollPanelDatosEdicionTipoRelaLabo;
		final JPanel jPanelAccionesTipoRelaLabo=this.jPanelAccionesTipoRelaLabo;
		
		JPanel jPanelCamposAuxiliarTipoRelaLabo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRelaLabo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			jPanelCamposAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jPanelCamposTipoRelaLabo;
			jPanelAccionesFormularioAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jPanelAccionesFormularioTipoRelaLabo;
		}
		
		final JPanel jPanelCamposTipoRelaLabo=jPanelCamposAuxiliarTipoRelaLabo;
		final JPanel jPanelAccionesFormularioTipoRelaLabo=jPanelAccionesFormularioAuxiliarTipoRelaLabo;
		
		
		final JMenuBar jmenuBarTipoRelaLabo=this.jmenuBarTipoRelaLabo;
		final JToolBar jTtoolBarTipoRelaLabo=this.jTtoolBarTipoRelaLabo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRelaLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRelaLabo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			jmenuBarDetalleAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jmenuBarDetalleTipoRelaLabo;
			jTtoolBarDetalleAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jTtoolBarDetalleTipoRelaLabo;
		}
		
		final JMenuBar jmenuBarDetalleTipoRelaLabo=jmenuBarDetalleAuxiliarTipoRelaLabo;
		final JToolBar jTtoolBarDetalleTipoRelaLabo=jTtoolBarDetalleAuxiliarTipoRelaLabo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRelaLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRelaLabo;
			processRunnable.jTableDatos=jTableDatosTipoRelaLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoRelaLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRelaLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRelaLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRelaLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRelaLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRelaLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoRelaLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRelaLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRelaLabo ,jPanelParametrosReportesTipoRelaLabo,jTableDatosTipoRelaLabo, /*jScrollPanelDatosTipoRelaLabo,*/jPanelCamposTipoRelaLabo,jPanelPaginacionTipoRelaLabo, /*jScrollPanelDatosEdicionTipoRelaLabo,*/ jPanelAccionesTipoRelaLabo,jPanelAccionesFormularioTipoRelaLabo,jmenuBarTipoRelaLabo,jmenuBarDetalleTipoRelaLabo,jTtoolBarTipoRelaLabo,jTtoolBarDetalleTipoRelaLabo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRelaLabo ,jPanelParametrosReportesTipoRelaLabo, jScrollPanelDatosTipoRelaLabo,jPanelPaginacionTipoRelaLabo, jScrollPanelDatosEdicionTipoRelaLabo, jPanelAccionesTipoRelaLabo,jPanelAccionesFormularioTipoRelaLabo,jmenuBarTipoRelaLabo,jmenuBarDetalleTipoRelaLabo,jTtoolBarTipoRelaLabo,jTtoolBarDetalleTipoRelaLabo);
						
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
	
	public void finishProcessTipoRelaLabo() {// throws Exception 
		this.finishProcessTipoRelaLabo(true);
	}
	
	public void finishProcessTipoRelaLabo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRelaLabo ,this.jPanelParametrosReportesTipoRelaLabo, this.jScrollPanelDatosTipoRelaLabo,this.jPanelPaginacionTipoRelaLabo, this.jScrollPanelDatosEdicionTipoRelaLabo, this.jPanelAccionesTipoRelaLabo,this.jPanelAccionesFormularioTipoRelaLabo,this.jmenuBarTipoRelaLabo,this.jmenuBarDetalleTipoRelaLabo,this.jTtoolBarTipoRelaLabo,this.jTtoolBarDetalleTipoRelaLabo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRelaLabo=this.jTabbedPaneBusquedasTipoRelaLabo; 
		
		final JPanel jPanelParametrosReportesTipoRelaLabo=this.jPanelParametrosReportesTipoRelaLabo;
		//final JScrollPane jScrollPanelDatosTipoRelaLabo=this.jScrollPanelDatosTipoRelaLabo;
		final JTable jTableDatosTipoRelaLabo=this.jTableDatosTipoRelaLabo;		
		final JPanel jPanelPaginacionTipoRelaLabo=this.jPanelPaginacionTipoRelaLabo;
		//final JScrollPane jScrollPanelDatosEdicionTipoRelaLabo=this.jScrollPanelDatosEdicionTipoRelaLabo;
		final JPanel jPanelAccionesTipoRelaLabo=this.jPanelAccionesTipoRelaLabo;
		
		JPanel jPanelCamposAuxiliarTipoRelaLabo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRelaLabo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			jPanelCamposAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jPanelCamposTipoRelaLabo;
			jPanelAccionesFormularioAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jPanelAccionesFormularioTipoRelaLabo;
		}
		
		final JPanel jPanelCamposTipoRelaLabo=jPanelCamposAuxiliarTipoRelaLabo;
		final JPanel jPanelAccionesFormularioTipoRelaLabo=jPanelAccionesFormularioAuxiliarTipoRelaLabo;
		
		
		final JMenuBar jmenuBarTipoRelaLabo=this.jmenuBarTipoRelaLabo;		
		final JToolBar jTtoolBarTipoRelaLabo=this.jTtoolBarTipoRelaLabo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRelaLabo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRelaLabo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			jmenuBarDetalleAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jmenuBarDetalleTipoRelaLabo;
			jTtoolBarDetalleAuxiliarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jTtoolBarDetalleTipoRelaLabo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRelaLabo=jmenuBarDetalleAuxiliarTipoRelaLabo;
		final JToolBar jTtoolBarDetalleTipoRelaLabo=jTtoolBarDetalleAuxiliarTipoRelaLabo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRelaLabo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRelaLabo;
			processRunnable.jTableDatos=jTableDatosTipoRelaLabo;
			processRunnable.jPanelCampos=jPanelCamposTipoRelaLabo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRelaLabo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRelaLabo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRelaLabo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRelaLabo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRelaLabo;
			processRunnable.jTtoolBar=jTtoolBarTipoRelaLabo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRelaLabo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRelaLabo ,jPanelParametrosReportesTipoRelaLabo, jTableDatosTipoRelaLabo,/*jScrollPanelDatosTipoRelaLabo,*/jPanelCamposTipoRelaLabo,jPanelPaginacionTipoRelaLabo, /*jScrollPanelDatosEdicionTipoRelaLabo,*/ jPanelAccionesTipoRelaLabo,jPanelAccionesFormularioTipoRelaLabo,jmenuBarTipoRelaLabo,jmenuBarDetalleTipoRelaLabo,jTtoolBarTipoRelaLabo,jTtoolBarDetalleTipoRelaLabo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRelaLabo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRelaLabo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRelaLabo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRelaLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRelaLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRelaLabo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRelaLabo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRelaLabo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRelaLabo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporelalaboConstantesFunciones.getsFinalQueryTipoRelaLabo();
		String  finalQueryPaginacionTodos=this.tiporelalaboConstantesFunciones.getsFinalQueryTipoRelaLabo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRelaLaboConstantesFunciones.getArrayColumnasGlobalesNoTipoRelaLabo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRelaLaboConstantesFunciones.getArrayColumnasGlobalesTipoRelaLabo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRelaLaboConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporelalabosEliminados= new ArrayList<TipoRelaLabo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRelaLabo();
		
				///*TipoRelaLaboSessionBean*/this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
			
			if(this.tiporelalaboSessionBean==null) {
				this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
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
					this.iNumeroPaginacion=TipoRelaLaboConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRelaLaboConstantesFunciones.getClassesForeignKeysOfTipoRelaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporelalabo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporelalabosAux= new ArrayList<TipoRelaLabo>();
			
				
			tiporelalaboLogic.setDatosCliente(this.datosCliente);
			tiporelalaboLogic.setDatosDeep(this.datosDeep);
			tiporelalaboLogic.setIsConDeep(true);
			
			
			tiporelalaboLogic.getTipoRelaLaboDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporelalaboLogic.getTodosTipoRelaLabos(finalQueryGlobal,pagination);
					
					//tiporelalaboLogic.getTodosTipoRelaLabosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporelalaboLogic.getTipoRelaLabos()==null|| tiporelalaboLogic.getTipoRelaLabos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporelalabosAux= new ArrayList<TipoRelaLabo>();
							tiporelalabosAux.addAll(tiporelalaboLogic.getTipoRelaLabos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporelalabosAux= new ArrayList<TipoRelaLabo>();
							tiporelalabosAux.addAll(tiporelalabos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporelalaboLogic.getTodosTipoRelaLabos(finalQueryGlobal+"",this.pagination);												
							
							//tiporelalaboLogic.getTodosTipoRelaLabosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRelaLabos("Todos",tiporelalaboLogic.getTipoRelaLabos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporelalaboLogic.setTipoRelaLabos(new ArrayList<TipoRelaLabo>());					
							tiporelalaboLogic.getTipoRelaLabos().addAll(tiporelalabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporelalabos=new ArrayList<TipoRelaLabo>();
							tiporelalabos.addAll(tiporelalabosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRelaLabo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRelaLabo=this.idActual;
				
				} else if(this.idTipoRelaLaboActual!=null && this.idTipoRelaLaboActual!=0L) {
					idTipoRelaLabo=idTipoRelaLaboActual;
				}
				
					
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndicePorId(idTipoRelaLabo);
				
				this.tiporelalabos=new ArrayList<TipoRelaLabo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporelalaboLogic.getEntity(idTipoRelaLabo);
					
					//tiporelalaboLogic.getEntityWithConnection(idTipoRelaLabo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporelalaboLogic.setTipoRelaLabos(new ArrayList<TipoRelaLabo>());
					tiporelalaboLogic.getTipoRelaLabos().add(tiporelalaboLogic.getTipoRelaLabo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporelalabos=new ArrayList<TipoRelaLabo>();
					this.tiporelalabos.add(tiporelalabo);
				}
				
				if(tiporelalaboLogic.getTipoRelaLabo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporelalaboLogic.getTipoRelaLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporelalaboLogic.getTipoRelaLabos()==null||tiporelalaboLogic.getTipoRelaLabos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporelalabos==null|| tiporelalabos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalabosAux=new ArrayList<TipoRelaLabo>();
						tiporelalabosAux.addAll(tiporelalaboLogic.getTipoRelaLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporelalabosAux=new ArrayList<TipoRelaLabo>();
							tiporelalabosAux.addAll(tiporelalabos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporelalaboLogic.getTipoRelaLabosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRelaLaboConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRelaLabos("FK_IdEmpresa",tiporelalaboLogic.getTipoRelaLabos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRelaLabos("FK_IdEmpresa",tiporelalabos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboLogic.setTipoRelaLabos(new ArrayList<TipoRelaLabo>());
						tiporelalaboLogic.getTipoRelaLabos().addAll(tiporelalabosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporelalabos=new ArrayList<TipoRelaLabo>();
							tiporelalabos.addAll(tiporelalabosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRelaLabo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRelaLabo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporelalaboLogic.getTipoRelaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporelalabos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporelalaboLogic.getTipoRelaLabos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporelalabos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRelaLabo tiporelalabo) {
		Boolean permite=true;
		
		if(this.tiporelalabo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRelaLaboConstantesFunciones.getOrderByListaTipoRelaLabo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRelaLaboConstantesFunciones.getOrderByListaTipoRelaLabo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRelaLabo tiporelalabo:tiporelalaboLogic.getTipoRelaLabos()) {
				if(tiporelalabo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporelalaboTotales=tiporelalabo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRelaLabo tiporelalabo:this.tiporelalabos) {
				if(tiporelalabo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporelalaboTotales=tiporelalabo;
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
			this.tiporelalaboAux=new TipoRelaLabo();
			this.tiporelalaboAux.setsType(Constantes2.S_TOTALES);
			this.tiporelalaboAux.setIsNew(false);
			this.tiporelalaboAux.setIsChanged(false);
			this.tiporelalaboAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRelaLaboConstantesFunciones.TotalizarValoresFilaTipoRelaLabo(this.tiporelalaboLogic.getTipoRelaLabos(),this.tiporelalaboAux);
				
				this.tiporelalaboLogic.getTipoRelaLabos().add(this.tiporelalaboAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRelaLaboConstantesFunciones.TotalizarValoresFilaTipoRelaLabo(this.tiporelalabos,this.tiporelalaboAux);
				
				this.tiporelalabos.add(this.tiporelalaboAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporelalaboTotales=new TipoRelaLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporelalaboLogic.getTipoRelaLabos().remove(tiporelalaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporelalabos.remove(tiporelalaboTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporelalaboTotales=new TipoRelaLabo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRelaLabo tiporelalabo:tiporelalaboLogic.getTipoRelaLabos()) {
				if(tiporelalabo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporelalaboTotales=tiporelalabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRelaLaboConstantesFunciones.TotalizarValoresFilaTipoRelaLabo(this.tiporelalaboLogic.getTipoRelaLabos(),tiporelalaboTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRelaLabo tiporelalabo:this.tiporelalabos) {
				if(tiporelalabo.getsType().equals(Constantes2.S_TOTALES)) {
					tiporelalaboTotales=tiporelalabo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRelaLaboConstantesFunciones.TotalizarValoresFilaTipoRelaLabo(this.tiporelalabos,tiporelalaboTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRelaLabosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRelaLabosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporelalaboLogic.getTipoRelaLabosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoRelaLabo() {
		this.isPermisoTodoTipoRelaLabo=false;
		this.isPermisoNuevoTipoRelaLabo=false;
		this.isPermisoActualizarTipoRelaLabo=false;
		this.isPermisoActualizarOriginalTipoRelaLabo=false;
		this.isPermisoEliminarTipoRelaLabo=false;
		this.isPermisoGuardarCambiosTipoRelaLabo=false;
		this.isPermisoConsultaTipoRelaLabo=false;
		this.isPermisoBusquedaTipoRelaLabo=false;
		this.isPermisoReporteTipoRelaLabo=false;		
		this.isPermisoOrdenTipoRelaLabo=false;		
		this.isPermisoPaginacionMedioTipoRelaLabo=false;		
		this.isPermisoPaginacionAltoTipoRelaLabo=false;
		this.isPermisoPaginacionTodoTipoRelaLabo=false;
		this.isPermisoCopiarTipoRelaLabo=false;		
		this.isPermisoVerFormTipoRelaLabo=false;		
		this.isPermisoDuplicarTipoRelaLabo=false;		
		this.isPermisoOrdenTipoRelaLabo=false;		
	}
	
	public void setPermisosUsuarioTipoRelaLabo(Boolean isPermiso) {
		this.isPermisoTodoTipoRelaLabo=isPermiso;
		this.isPermisoNuevoTipoRelaLabo=isPermiso;
		this.isPermisoActualizarTipoRelaLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoRelaLabo=isPermiso;
		this.isPermisoEliminarTipoRelaLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoRelaLabo=isPermiso;
		this.isPermisoConsultaTipoRelaLabo=isPermiso;
		this.isPermisoBusquedaTipoRelaLabo=isPermiso;
		this.isPermisoReporteTipoRelaLabo=isPermiso;
		this.isPermisoOrdenTipoRelaLabo=isPermiso;		
		this.isPermisoPaginacionMedioTipoRelaLabo=isPermiso;		
		this.isPermisoPaginacionAltoTipoRelaLabo=isPermiso;		
		this.isPermisoPaginacionTodoTipoRelaLabo=isPermiso;		
		this.isPermisoCopiarTipoRelaLabo=isPermiso;		
		this.isPermisoVerFormTipoRelaLabo=isPermiso;		
		this.isPermisoDuplicarTipoRelaLabo=isPermiso;
		this.isPermisoOrdenTipoRelaLabo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRelaLabo(Boolean isPermiso) {
		//this.isPermisoTodoTipoRelaLabo=isPermiso;
		this.isPermisoNuevoTipoRelaLabo=isPermiso;
		this.isPermisoActualizarTipoRelaLabo=isPermiso;
		this.isPermisoActualizarOriginalTipoRelaLabo=isPermiso;
		this.isPermisoEliminarTipoRelaLabo=isPermiso;
		this.isPermisoGuardarCambiosTipoRelaLabo=isPermiso;
		//this.isPermisoConsultaTipoRelaLabo=isPermiso;
		//this.isPermisoBusquedaTipoRelaLabo=isPermiso;
		//this.isPermisoReporteTipoRelaLabo=isPermiso;
		//this.isPermisoOrdenTipoRelaLabo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRelaLabo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRelaLabo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRelaLabo=isPermiso;		
		//this.isPermisoCopiarTipoRelaLabo=isPermiso;		
		//this.isPermisoDuplicarTipoRelaLabo=isPermiso;
		//this.isPermisoOrdenTipoRelaLabo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRelaLaboClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRelaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosInformacionLaboral=false;
		this.isTienePermisosInformacionLaboral=this.verificarGetPermisosUsuarioOpcionTipoRelaLaboClaseRelacionada(this.opcionsRelacionadas,InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRelaLabo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRelaLaboClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosInformacionLaboral=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRelaLaboClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRelaLaboClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRelaLaboClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosInformacionLaboral && this.jInternalFrameDetalleFormTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.remove(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRelaLabo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRelaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRelaLaboConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRelaLabo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRelaLabo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRelaLabo=this.isPermisoActualizarTipoRelaLabo;
			this.isPermisoEliminarTipoRelaLabo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRelaLabo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRelaLabo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRelaLabo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRelaLabo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRelaLabo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRelaLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRelaLabo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRelaLabo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRelaLabo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRelaLabo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRelaLabo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRelaLabo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRelaLabo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRelaLabo.setToolTipText(this.jTableDatosTipoRelaLabo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRelaLabo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRelaLabo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRelaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRelaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRelaLabo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosInformacionLaboral && this.tiporelalaboConstantesFunciones.mostrarInformacionLaboralTipoRelaLabo && !TipoRelaLaboConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Informacion Laboral");
			reporte.setsDescripcion("Informacion Laboral");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoRelaLaboListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRelaLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRelaLaboJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRelaLaboListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoRelaLaboListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRelaLaboParameterReturnGeneral tiporelalaboReturnGeneral=new TipoRelaLaboParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporelalaboConstantesFunciones.cargarid_empresaTipoRelaLabo)
					 || (this.esRecargarFks && this.tiporelalaboConstantesFunciones.cargarid_empresaTipoRelaLabo)) {

					if(!this.tiporelalaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporelalaboSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporelalaboReturnGeneral=tiporelalaboLogic.cargarCombosLoteForeignKeyTipoRelaLabo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporelalaboReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRelaLabo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporelalaboSessionBean==null) {
				this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
			}

			if(!this.tiporelalaboSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRelaLabo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRelaLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRelaLabo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRelaLabo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRelaLabo(TipoRelaLabo tiporelalabo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRelaLabo(TipoRelaLabo tiporelalabo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRelaLabo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRelaLabo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRelaLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRelaLabo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRelaLabo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRelaLabo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRelaLabo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRelaLabo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoRelaLaboBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRelaLaboBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRelaLaboBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean(); 
		this.tiporelalaboConstantesFunciones=new TipoRelaLaboConstantesFunciones(); 
		this.tiporelalaboBean=new TipoRelaLabo();//(this.tiporelalaboConstantesFunciones); 		
		this.tiporelalaboReturnGeneral=new TipoRelaLaboParameterReturnGeneral(); 
		
		this.tiporelalaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporelalaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRelaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRelaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRelaLaboBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRelaLabo(true);
			
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
			
			this.tiporelalaboConstantesFunciones=new TipoRelaLaboConstantesFunciones(); 
			this.tiporelalaboBean=new TipoRelaLabo();//this.tiporelalaboConstantesFunciones); 			
			this.tiporelalaboReturnGeneral=new TipoRelaLaboParameterReturnGeneral(); 
		
			TipoRelaLaboBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rela Labo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporelalabo=new TipoRelaLabo();
			this.tiporelalabos = new ArrayList<TipoRelaLabo>();
			this.tiporelalabosAux = new ArrayList<TipoRelaLabo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic=new TipoRelaLaboLogic();
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporelalaboSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporelalaboSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRelaLabo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRelaLabo);	
					}
					
					if(this.jInternalFrameImportacionTipoRelaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRelaLabo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRelaLabo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRelaLabo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRelaLabo);
				this.jInternalFrameDetalleFormTipoRelaLabo.setVisible(false);
				this.jInternalFrameDetalleFormTipoRelaLabo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRelaLabo);
					this.jInternalFrameReporteDinamicoTipoRelaLabo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRelaLabo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRelaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRelaLabo);
					this.jInternalFrameImportacionTipoRelaLabo.setVisible(false);
					this.jInternalFrameImportacionTipoRelaLabo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRelaLabo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRelaLabo);
					this.jInternalFrameOrderByTipoRelaLabo.setVisible(false);
					this.jInternalFrameOrderByTipoRelaLabo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRelaLaboActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRelaLaboConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporelalaboReturnGeneral=new TipoRelaLaboParameterReturnGeneral();
			
			this.tiporelalaboParameterGeneral=new TipoRelaLaboParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporelalaboLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRelaLaboJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(InformacionLaboralConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRelaLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporelalaboSessionBean.getEsGuardarRelacionado(),this.tiporelalaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRelaLaboConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporelalaboSessionBean.getEsGuardarRelacionado(),this.tiporelalaboSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaDuplicarTipoRelaLabo=true;
			this.isVisibilidadCeldaCopiarTipoRelaLabo=true;
			this.isVisibilidadCeldaVerFormTipoRelaLabo=true;
			this.isVisibilidadCeldaOrdenTipoRelaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRelaLabo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRelaLabo(false);
			
			this.setPermisosUsuarioTipoRelaLabo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporelalaboSessionBean.getEsGuardarRelacionado() && this.tiporelalaboSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRelaLaboClasesRelacionadas();
			}
			
			if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRelaLaboClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRelaLabo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRelaLabo();
			}
			
			if(!this.isPermisoBusquedaTipoRelaLabo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRelaLabo,this.isPermisoPaginacionMedioTipoRelaLabo,this.isPermisoPaginacionTodoTipoRelaLabo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRelaLaboConstantesFunciones.getTiposSeleccionarTipoRelaLabo());
				
				this.tiposColumnasSelect=TipoRelaLaboConstantesFunciones.getTiposSeleccionarTipoRelaLabo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRelaLabo();				
				//this.tiposRelacionesSelect=TipoRelaLaboConstantesFunciones.getTiposRelacionesTipoRelaLabo(true);
				
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
			//if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRelaLabo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRelaLabo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRelaLabo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRelaLabo() ;
			
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
			
			
			this.informacionlaboralLogic=new InformacionLaboralLogic(); 
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
				tiporelalaboImplementable= (TipoRelaLaboImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRelaLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporelalaboImplementableHome= (TipoRelaLaboImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRelaLaboConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporelalabos= new ArrayList<TipoRelaLabo>();
			this.tiporelalabosEliminados= new ArrayList<TipoRelaLabo>();
						
			this.isEsNuevoTipoRelaLabo=false;
			this.esParaAccionDesdeFormularioTipoRelaLabo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRelaLabo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRelaLabo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRelaLaboBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRelaLaboConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRelaLabo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRelaLabo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRelaLabo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRelaLabo();
			}
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRelaLabo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRelaLabo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRelaLabo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRelaLabo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRelaLabo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRelaLabo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRelaLabo")) {
				iIndex=this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();	
				
				

				if(sTitle.equals("Informacion Laborales")) {
					if(!InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRelaLabo();

						this.cargarParteTabPanelRelacionadaInformacionLaboral(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRelaLabo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaInformacionLaboral(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRelaLabo.cargarSessionConBeanSwingJInternalFrameInformacionLaboral(false,true,iIndex);
		this.jButtonInformacionLaboralActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaInformacionLaboral();

		//this.jTabbedPaneRelacionesTipoRelaLabo.updateUI();
		//this.jTabbedPaneRelacionesTipoRelaLabo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRelaLabo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("InformacionLaboral")) {
				int row=this.jTableDatosTipoRelaLabo.getSelectedRow();
				jButtonInformacionLaboralActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Informacion Laboral")) {

					if(this.isTienePermisosInformacionLaboral && this.tiporelalaboConstantesFunciones.mostrarInformacionLaboralTipoRelaLabo && !TipoRelaLaboConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Informacion Laborales"+"("+InformacionLaboralConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Informacion Laborales");

						if(tiporelalaboConstantesFunciones.resaltarInformacionLaboralTipoRelaLabo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporelalaboConstantesFunciones.resaltarInformacionLaboralTipoRelaLabo);
						}

						jmenuItem.setEnabled(this.tiporelalaboConstantesFunciones.activarInformacionLaboralTipoRelaLabo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"InformacionLaboral"));

						

						this.jInternalFrameDetalleFormTipoRelaLabo.jmenuDetalleTipoRelaLabo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRelaLabo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRelaLabo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRelaLabo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRelaLaboListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRelaLabo();
		
		this.cargarCombosFrameForeignKeyTipoRelaLabo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRelaLabo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRelaLabo();
		}
	}
	
	
	
	public void jButtonNuevoTipoRelaLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			
			if(jTableDatosTipoRelaLabo.getRowCount()>=1) {
				jTableDatosTipoRelaLabo.removeRowSelectionInterval(0, jTableDatosTipoRelaLabo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRelaLabo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRelaLabo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRelaLabo(true);			
			//this.tiporelalabo=new TipoRelaLabo();
			//this.tiporelalabo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRelaLabo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRelaLabo() ;
			
			if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRelaLabo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporelalabo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);				
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRelaLabo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRelaLaboActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRelaLabo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRelaLabo.getSelectedRows().length;			
			}
			
			tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRelaLabo--;			
				//TipoRelaLabo tiporelalaboAux= new TipoRelaLabo();			
				//tiporelalaboAux.setId(this.iIdNuevoTipoRelaLabo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRelaLabo tiporelalaboOrigen=new TipoRelaLabo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRelaLabo tiporelalaboOrigen : tiporelalabosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporelalaboOrigen =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporelalaboOrigen =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRelaLabo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporelalabo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRelaLabo(tiporelalaboOrigen,this.tiporelalabo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporelalaboLogic.getTipoRelaLabos().add(this.tiporelalaboAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporelalabos.add(this.tiporelalaboAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
				
				this.jTableDatosTipoRelaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoRelaLabo(), this.getIndiceNuevoTipoRelaLabo());
				
				int iLastRow =  this.jTableDatosTipoRelaLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRelaLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRelaLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRelaLabo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();									
		
			TipoRelaLabo tiporelalaboOrigen=new TipoRelaLabo();
			TipoRelaLabo tiporelalaboDestino=new TipoRelaLabo();
				
			tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRelaLabo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporelalabosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRelaLabo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboOrigen =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporelalaboOrigen =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporelalaboDestino =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporelalaboDestino =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporelalaboOrigen =tiporelalabosSeleccionados.get(0);
				tiporelalaboDestino =tiporelalabosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRelaLabo(tiporelalaboOrigen,tiporelalaboDestino,true,false);
				
				tiporelalaboDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporelalaboDestino,tiporelalaboLogic.getTipoRelaLabos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporelalaboDestino,tiporelalabos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
				
				//this.jTableDatosTipoRelaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoRelaLabo(), this.getIndiceNuevoTipoRelaLabo());
				
				int iLastRow =  this.jTableDatosTipoRelaLabo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRelaLabo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRelaLabo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRelaLabo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRelaLabo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRelaLabo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRelaLabo.setVisible(!isVisible);
			this.jPanelPaginacionTipoRelaLabo.setVisible(!isVisible);
			this.jPanelAccionesTipoRelaLabo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRelaLabo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRelaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRelaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRelaLabo();
			
			this.abrirFrameOrderByTipoRelaLabo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRelaLabo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRelaLabo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRelaLabo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRelaLabo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRelaLabo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRelaLabo.setSize(this.jInternalFrameDetalleFormTipoRelaLabo.iWidthFormulario,this.jInternalFrameDetalleFormTipoRelaLabo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRelaLabo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRelaLabo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRelaLabo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRelaLabo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRelaLabo.jContentPaneDetalleTipoRelaLabo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRelaLabo.jContentPaneDetalleTipoRelaLabo.getWidth(),TipoRelaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRelaLabo.jContentPaneDetalleTipoRelaLabo.getWidth(),TipoRelaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRelaLabo.jContentPaneDetalleTipoRelaLabo.getWidth(),TipoRelaLaboConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaInformacionLaboral();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRelaLabo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRelaLabo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRelaLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRelaLabo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRelaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRelaLabo,false,this);
				} else {
					this.jInternalFrameOrderByTipoRelaLabo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRelaLabo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRelaLabo);
				this.jInternalFrameOrderByTipoRelaLabo.setVisible(false);
				this.jInternalFrameOrderByTipoRelaLabo.setSelected(false);
				
				this.jInternalFrameOrderByTipoRelaLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRelaLabo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRelaLabo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRelaLabo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRelaLabo==null) {
				
				this.jInternalFrameImportacionTipoRelaLabo=new ImportacionJInternalFrame(TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRelaLabo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRelaLabo);
				this.jInternalFrameImportacionTipoRelaLabo.setVisible(false);
				this.jInternalFrameImportacionTipoRelaLabo.setSelected(false);


				this.jInternalFrameImportacionTipoRelaLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRelaLabo"));
				this.jInternalFrameImportacionTipoRelaLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRelaLabo"));
				this.jInternalFrameImportacionTipoRelaLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRelaLabo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRelaLabo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRelaLabo==null) {
				this.jInternalFrameReporteDinamicoTipoRelaLabo=new ReporteDinamicoJInternalFrame(TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRelaLabo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRelaLabo);
				this.jInternalFrameReporteDinamicoTipoRelaLabo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRelaLabo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRelaLabo"));
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRelaLabo"));
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRelaLabo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRelaLabo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaInformacionLaboral() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRelaLabo.jContentPaneDetalleTipoRelaLabo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRelaLabo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRelaLabo);
			
	       	this.jInternalFrameDetalleFormTipoRelaLabo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRelaLabo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRelaLabo.dispose();
			//this.jInternalFrameDetalleFormTipoRelaLabo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRelaLabo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRelaLabo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRelaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRelaLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRelaLabo.setVisible(true);
	        this.jInternalFrameImportacionTipoRelaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRelaLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRelaLabo.setVisible(true);
	        this.jInternalFrameOrderByTipoRelaLabo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRelaLabo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRelaLabo.setVisible(false);
	        this.jInternalFrameOrderByTipoRelaLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRelaLabo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRelaLabo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRelaLabo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRelaLabo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRelaLabo.setVisible(false);
	        this.jInternalFrameImportacionTipoRelaLabo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRelaLabo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRelaLabo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRelaLabo(true);
			//this.isEsNuevoTipoRelaLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRelaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRelaLabo(false) ;
			
			if(tiporelalaboSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado() && InformacionLaboralJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonInformacionLaboralActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRelaLabo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRelaLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRelaLaboActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRelaLabo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRelaLabo(true);
			//this.isEsNuevoTipoRelaLabo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporelalabo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRelaLabo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRelaLabo(false) ;
			
			if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRelaLabo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRelaLabo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRelaLabo(false);
			
			//if(!this.isEsNuevoTipoRelaLabo) {								
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				
			}
			
			if(this.permiteMantenimiento(this.tiporelalabo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRelaLabo=true;
					this.inicializarActualizarBindingTablaTipoRelaLabo(false);
					this.isEsNuevoTipoRelaLabo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRelaLabo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRelaLabo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRelaLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRelaLabo(false);
				
				this.habilitarDeshabilitarControlesTipoRelaLabo(false);
			
												
				
				if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRelaLabo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRelaLaboActionPerformed(evt,tiporelalaboSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRelaLabo(this.tiporelalabo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRelaLabo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporelalaboSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporelalabo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				this.tiporelalabo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				this.tiporelalabo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporelalabo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRelaLaboModel) this.jTableDatosTipoRelaLabo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRelaLabo=true;
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
				this.isEsNuevoTipoRelaLabo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRelaLabo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRelaLabo(false);
				
				this.habilitarDeshabilitarControlesTipoRelaLabo(false);
				
				
				
				if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRelaLabo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRelaLabo.getRowCount()>=1) {
				jTableDatosTipoRelaLabo.removeRowSelectionInterval(0, jTableDatosTipoRelaLabo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRelaLabo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRelaLabo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRelaLabo(false) ;
			
			this.isEsNuevoTipoRelaLabo=false;
			
			if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRelaLabo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRelaLabo(false);
				
				//SI ES MANUAL
				if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRelaLabo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRelaLabo--;			
			//TipoRelaLabo tiporelalaboAux= new TipoRelaLabo();			
			//tiporelalaboAux.setId(this.iIdNuevoTipoRelaLabo);
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRelaLabo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
			
			this.tiporelalabo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporelalaboLogic.getTipoRelaLabos().add(this.tiporelalaboAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporelalabos.add(this.tiporelalaboAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			
			this.jTableDatosTipoRelaLabo.setRowSelectionInterval(this.getIndiceNuevoTipoRelaLabo(), this.getIndiceNuevoTipoRelaLabo());
			
			int iLastRow =  this.jTableDatosTipoRelaLabo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRelaLabo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRelaLabo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRelaLabo(false);
			
			//SI ES MANUAL
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRelaLabo();
			}
			
			//this.abrirFrameTreeTipoRelaLabo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Rela LaboS ?", "MANTENIMIENTO DE Tipo Rela Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRelaLabo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRelaLabo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporelalaboReturnGeneral=tiporelalaboLogic.procesarImportacionTipoRelaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporelalaboParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRelaLaboReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRelaLabo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRelaLabo.setFileImportacion(this.jInternalFrameImportacionTipoRelaLabo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRelaLabo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRelaLabo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRelaLabo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRelaLabo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		

		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRelaLaboBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRelaLaboBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRelaLaboConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRelaLaboConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoRelaLabo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRelaLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRelaLabo tiporelalabo:tiporelalabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporelalabo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRelaLabo tiporelalabo:tiporelalabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporelalabo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRelaLaboConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRelaLabo tiporelalabo:tiporelalabosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporelalabo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRelaLabo(row);				
			//	iRow++;
			//}				
			
			//for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRelaLabo(tiporelalaboAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRelaLabo(false);
			
			//SI ES MANUAL
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRelaLabo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRelaLabo(false);
			
			//SI ES MANUAL
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRelaLabo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRelaLabo(false);
			
			//SI ES MANUAL
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRelaLabo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRelaLabo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRelaLabo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRelaLabo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRelaLabo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRelaLabo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRelaLabo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRelaLabo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRelaLabo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRelaLabo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRelaLabo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRelaLabo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRelaLabo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRelaLabo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRelaLabo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRelaLabo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRelaLabo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRelaLabo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRelaLabo();
		
		this.inicializarActualizarBindingBotonesManualTipoRelaLabo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRelaLabo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRelaLabo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRelaLabo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRelaLabo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRelaLabo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRelaLabo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRelaLabo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionNuevoTipoRelaLabo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionSinCerrarTipoRelaLabo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionSinMensajeTipoRelaLabo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRelaLabo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRelaLabo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRelaLabo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
				this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionNuevoTipoRelaLabo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionSinCerrarTipoRelaLabo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRelaLabo.jCheckBoxPostAccionSinMensajeTipoRelaLabo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRelaLabo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRelaLabo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRelaLabo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRelaLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRelaLabo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRelaLabo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRelaLabo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRelaLabo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRelaLabo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRelaLabo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRelaLabo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRelaLabo() throws Exception {
		try	{
			if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRelaLabo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRelaLabo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRelaLabo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRelaLabo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRelaLabo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRelaLabo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRelaLabo.addItem(reporte);
			}
			
			
			if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRelaLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRelaLabo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRelaLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRelaLabo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRelaLabo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRelaLabo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRelaLabo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRelaLabo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRelaLabo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRelaLabo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRelaLabo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRelaLabo(Boolean esInicializar) throws Exception {				
		if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRelaLabo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRelaLabo() throws Exception {
		this.inicializarActualizarBindingTablaTipoRelaLabo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRelaLabo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRelaLaboOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLaboOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRelaLabo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporelalaboLogic.getTipoRelaLabos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporelalabos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRelaLabo.setModel(new TipoRelaLaboModel(this.tiporelalaboLogic.getTipoRelaLabos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRelaLabo.setModel(new TipoRelaLaboModel(this.tiporelalabos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRelaLabo!=null && this.jInternalFrameOrderByTipoRelaLabo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRelaLabo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,tiporelalaboConstantesFunciones.resaltarSeleccionarTipoRelaLabo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRelaLaboConstantesFunciones.SCLASSWEBTITULO,tiporelalaboConstantesFunciones.resaltarSeleccionarTipoRelaLabo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,TipoRelaLaboConstantesFunciones.LABEL_ID));

		if(this.tiporelalaboConstantesFunciones.mostraridTipoRelaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRelaLaboConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporelalaboConstantesFunciones.resaltaridTipoRelaLabo,this.tiporelalaboConstantesFunciones.activaridTipoRelaLabo,this,true,"idTipoRelaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporelalaboConstantesFunciones.resaltaridTipoRelaLabo,this.tiporelalaboConstantesFunciones.activaridTipoRelaLabo,this,true,"idTipoRelaLabo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporelalaboConstantesFunciones.mostrarid_empresaTipoRelaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporelalaboConstantesFunciones.resaltarid_empresaTipoRelaLabo,this,this.tiporelalaboConstantesFunciones.activarid_empresaTipoRelaLabo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporelalaboConstantesFunciones.resaltarid_empresaTipoRelaLabo,this,this.tiporelalaboConstantesFunciones.activarid_empresaTipoRelaLabo,false,"id_empresaTipoRelaLabo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,TipoRelaLaboConstantesFunciones.LABEL_CODIGO));

		if(this.tiporelalaboConstantesFunciones.mostrarcodigoTipoRelaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRelaLaboConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporelalaboConstantesFunciones.resaltarcodigoTipoRelaLabo,this.tiporelalaboConstantesFunciones.activarcodigoTipoRelaLabo,this,true,"codigoTipoRelaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporelalaboConstantesFunciones.resaltarcodigoTipoRelaLabo,this.tiporelalaboConstantesFunciones.activarcodigoTipoRelaLabo,this,true,"codigoTipoRelaLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,TipoRelaLaboConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporelalaboConstantesFunciones.mostrarnombreTipoRelaLabo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRelaLaboConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporelalaboConstantesFunciones.resaltarnombreTipoRelaLabo,this.tiporelalaboConstantesFunciones.activarnombreTipoRelaLabo,this,true,"nombreTipoRelaLabo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporelalaboConstantesFunciones.resaltarnombreTipoRelaLabo,this.tiporelalaboConstantesFunciones.activarnombreTipoRelaLabo,this,true,"nombreTipoRelaLabo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRelaLaboPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosInformacionLaboral && this.tiporelalaboConstantesFunciones.mostrarInformacionLaboralTipoRelaLabo && !TipoRelaLaboConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Informacion Laborales");
				tableColumn.setHeaderValue("Informacion Laborales");
				tableColumn.setCellRenderer(new InformacionLaboralTableCell(tiporelalaboConstantesFunciones.resaltarInformacionLaboralTipoRelaLabo,this,this.tiporelalaboConstantesFunciones.activarInformacionLaboralTipoRelaLabo));
				tableColumn.setCellEditor(new InformacionLaboralTableCell(tiporelalaboConstantesFunciones.resaltarInformacionLaboralTipoRelaLabo,this,this.tiporelalaboConstantesFunciones.activarInformacionLaboralTipoRelaLabo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRelaLabo.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRelaLabo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRelaLabo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporelalaboSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRelaLabo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoRelaLabo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRelaLabo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporelalaboSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRelaLabo.moveColumn(this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRelaLabo.moveColumn(this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporelalaboSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRelaLabo.moveColumn(this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRelaLabo.moveColumn(this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRelaLabo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRelaLabo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRelaLabo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRelaLabo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRelaLabo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRelaLabo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRelaLabo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporelalaboLogic.getTipoRelaLabos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporelalabos.size()-1;
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
		//this.jTableDatosTipoRelaLabo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRelaLabo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRelaLabo();
			
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
				
				//this.isEsNuevoTipoRelaLabo=false;
					
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
				if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRelaLabo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRelaLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRelaLabo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporelalabo.getsType().equals("DUPLICADO")
				   || this.tiporelalabo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRelaLabo=true;
				
				} else {
					this.isEsNuevoTipoRelaLabo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporelalabo.getId()>=0 && !this.tiporelalabo.getIsNew()) {						
						this.isEsNuevoTipoRelaLabo=false;
						
					} else {
						this.isEsNuevoTipoRelaLabo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRelaLabo(esRelaciones);						
				
				this.seleccionarTipoRelaLabo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporelalabo.getId()<0) {
					this.isEsNuevoTipoRelaLabo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRelaLabo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRelaLabo(evt,rowIndex);
				}	
				
				if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRelaLabo: " + this.dDif); 
					}
				}								
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRelaLabo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporelalabo)) {
					if(this.tiporelalabo.getId()>0) {
						this.tiporelalabo.setIsDeleted(true);
						
						this.tiporelalabosEliminados.add(this.tiporelalabo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporelalaboLogic.getTipoRelaLabos().remove(this.tiporelalabo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporelalabos.remove(this.tiporelalabo);				
					}
					
					
					((TipoRelaLaboModel) this.jTableDatosTipoRelaLabo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRelaLabo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRelaLabo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRelaLabo) {
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRelaLabo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRelaLabo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRelaLabo(this.tiporelalabo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporelalaboConstantesFunciones.cargarid_empresaTipoRelaLabo || this.tiporelalaboConstantesFunciones.event_dependid_empresaTipoRelaLabo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporelalabo.getid_empresa());
									//this.inicializarActualizarBindingTipoRelaLabo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporelalabo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporelalabo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporelalabo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRelaLabo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRelaLabo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRelaLabo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRelaLabo(TipoRelaLabo tiporelalabo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRelaLabo(tiporelalabo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRelaLabo(TipoRelaLabo tiporelalabo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRelaLabo(tiporelalabo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRelaLabo(tiporelalabo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRelaLabo(tiporelalabo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRelaLabo(TipoRelaLabo tiporelalabo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setText(tiporelalabo.getId().toString());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setText(tiporelalabo.getcodigo());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setText(tiporelalabo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRelaLabo tiporelalaboLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporelalaboLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRelaLabo tiporelalaboLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporelalaboLocal=this.tiporelalabo;
			} else {
				tiporelalaboLocal=this.tiporelalaboAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporelalaboLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRelaLabo(tiporelalaboLocal,true);
					
					if(tiporelalaboSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporelalaboLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporelalaboLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRelaLabo(TipoRelaLabo tiporelalabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRelaLabo(tiporelalabo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(tiporelalabo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRelaLabo(TipoRelaLabo tiporelalabo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRelaLabo(tiporelalabo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRelaLabo(TipoRelaLabo tiporelalabo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.getText()==null || this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.getText()=="" || this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setText("0");
			}

			if(conColumnasBase) {tiporelalabo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRelaLaboConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelIdTipoRelaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporelalabo.setcodigo(this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRelaLaboConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelcodigoTipoRelaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporelalabo.setnombre(this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRelaLaboConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRelaLabo.jLabelnombreTipoRelaLabo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRelaLabo(TipoRelaLabo tiporelalaboBean,TipoRelaLabo tiporelalabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRelaLabo(TipoRelaLabo tiporelalaboOrigen,TipoRelaLabo tiporelalabo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporelalaboOrigen.getId()!=null && !tiporelalaboOrigen.getId().equals(0L))) {tiporelalabo.setId(tiporelalaboOrigen.getId());}}
			if(conDefault || (!conDefault && tiporelalaboOrigen.getcodigo()!=null && !tiporelalaboOrigen.getcodigo().equals(""))) {tiporelalabo.setcodigo(tiporelalaboOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporelalaboOrigen.getnombre()!=null && !tiporelalaboOrigen.getnombre().equals(""))) {tiporelalabo.setnombre(tiporelalaboOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRelaLabo(TipoRelaLabo tiporelalabo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setText(tiporelalabo.getId().toString());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setText(tiporelalabo.getcodigo());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setText(tiporelalabo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRelaLabo(TipoRelaLaboBean tiporelalaboBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setText(tiporelalaboBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setText(tiporelalaboBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setText(tiporelalaboBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRelaLabo(TipoRelaLaboParameterReturnGeneral tiporelalaboReturnGeneral,TipoRelaLaboBean tiporelalaboBean,Boolean conDefault) throws Exception { 
		try {
			TipoRelaLabo tiporelalaboLocal=new TipoRelaLabo();
			
			tiporelalaboLocal=tiporelalaboReturnGeneral.getTipoRelaLabo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporelalaboLocal.getId()!=null && !tiporelalaboLocal.getId().equals(0L))) {tiporelalaboBean.setId(tiporelalaboLocal.getId());}}
			if(conDefault || (!conDefault && tiporelalaboLocal.getcodigo()!=null && !tiporelalaboLocal.getcodigo().equals(""))) {tiporelalaboBean.setcodigo(tiporelalaboLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporelalaboLocal.getnombre()!=null && !tiporelalaboLocal.getnombre().equals(""))) {tiporelalaboBean.setnombre(tiporelalaboLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRelaLaboGenerico(Long idTipoRelaLaboSeleccionado,JComboBox jComboBoxTipoRelaLabo,List<TipoRelaLabo> tiporelalabosLocal)throws Exception {
		try {
			TipoRelaLabo  tiporelalaboTemp=null;

			for(TipoRelaLabo tiporelalaboAux:tiporelalabosLocal) {
				if(tiporelalaboAux.getId()!=null && tiporelalaboAux.getId().equals(idTipoRelaLaboSeleccionado)) {
					tiporelalaboTemp=tiporelalaboAux;
					break;
				}
			}

			jComboBoxTipoRelaLabo.setSelectedItem(tiporelalaboTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRelaLaboGenerico(JComboBox jComboBoxTipoRelaLabo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRelaLabo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRelaLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRelaLabo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRelaLabo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRelaLabo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRelaLabo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("InformacionLaboral")) {
			jButtonInformacionLaboralActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporelalabo=(TipoRelaLabo) tiporelalaboLogic.getTipoRelaLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporelalabo =(TipoRelaLabo) tiporelalabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporelalabo.getIsNew() && !tiporelalabo.getIsChanged() && !tiporelalabo.getIsDeleted()) {
				sDescripcion=tiporelalabo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporelalabo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRelaLabo tiporelalaboRow=new TipoRelaLabo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporelalaboRow=(TipoRelaLabo) tiporelalaboLogic.getTipoRelaLabos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporelalaboRow=(TipoRelaLabo) tiporelalabos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonInformacionLaboralActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRelaLabo tiporelalabo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRelaLabo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalabo = (TipoRelaLabo)this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporelalabo = (TipoRelaLabo)this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporelalabo!=null) {
						this.tiporelalabo = tiporelalabo;
					} else {
						this.tiporelalabo = new TipoRelaLabo();
					}
				}

				if(this.isTienePermisosInformacionLaboral && this.permiteMantenimiento(this.tiporelalabo)) {
					InformacionLaboralBeanSwingJInternalFrame informacionlaboralBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup=new InformacionLaboralBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						informacionlaboralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup;
					} else {
						informacionlaboralBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame;
					}

					List<TipoRelaLabo> tiporelalabos=new ArrayList<TipoRelaLabo>();
					tiporelalabos.add(this.tiporelalabo);
					if(!esRelacionado) {
						//informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setConGuardarRelaciones(false);
						//informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					informacionlaboralBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRelaLabo.cargarInformacionLaboralBeanSwingJInternalFrame(tiporelalabos,this.tiporelalabo,informacionlaboralBeanSwingJInternalFrame,/*conInicializar,*/informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getConGuardarRelaciones(),informacionlaboralBeanSwingJInternalFrame.informacionlaboralSessionBean.getEsGuardarRelacionado());
					informacionlaboralBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						informacionlaboralBeanSwingJInternalFrame.actualizarEstadoPanelsInformacionLaboral("no_relacionado");

						informacionlaboralBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(InformacionLaboralConstantesFunciones.ITAMANIOFILATABLA + (InformacionLaboralConstantesFunciones.ITAMANIOFILATABLA/2));

						informacionlaboralBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRelaLabo=(TitledBorder)this.jScrollPanelDatosTipoRelaLabo.getBorder();
						TitledBorder titledBorderInformacionLaboral=(TitledBorder)informacionlaboralBeanSwingJInternalFrame.jScrollPanelDatosInformacionLaboral.getBorder();

						titledBorderInformacionLaboral.setTitle(titledBorderTipoRelaLabo.getTitle() + " -> Informacion Laboral");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,informacionlaboralBeanSwingJInternalFrame);
						}

						informacionlaboralBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(informacionlaboralBeanSwingJInternalFrame);

						informacionlaboralBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Informacion Laboral",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRelaLabo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));			
			this.jButtonDuplicarTipoRelaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoRelaLabo && this.isPermisoDuplicarTipoRelaLabo));			
			this.jButtonCopiarTipoRelaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoRelaLabo && this.isPermisoCopiarTipoRelaLabo));
			this.jButtonVerFormTipoRelaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoRelaLabo && this.isPermisoVerFormTipoRelaLabo));
			
			this.jButtonAbrirOrderByTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));			
			
			this.jButtonNuevoRelacionesTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));			
			this.jButtonNuevoGuardarCambiosTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarTipoRelaLabo.setVisible((this.isVisibilidadCeldaModificarTipoRelaLabo && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoRelaLabo && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoRelaLabo && this.isPermisoEliminarTipoRelaLabo));
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoRelaLabo);							
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));						
			this.jButtonDuplicarToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoRelaLabo && this.isPermisoDuplicarTipoRelaLabo));						
			this.jButtonCopiarToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoRelaLabo && this.isPermisoCopiarTipoRelaLabo));			
			this.jButtonVerFormToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoRelaLabo && this.isPermisoVerFormTipoRelaLabo));			
			this.jButtonAbrirOrderByToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));
			this.jButtonNuevoRelacionesToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));			
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaModificarTipoRelaLabo && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoRelaLabo  && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoRelaLabo && this.isPermisoEliminarTipoRelaLabo));
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarToolBarTipoRelaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoRelaLabo);				
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));			
			this.jMenuItemDuplicarTipoRelaLabo.setVisible((this.isVisibilidadCeldaDuplicarTipoRelaLabo && this.isPermisoDuplicarTipoRelaLabo));			
			this.jMenuItemCopiarTipoRelaLabo.setVisible((this.isVisibilidadCeldaCopiarTipoRelaLabo && this.isPermisoCopiarTipoRelaLabo));			
			this.jMenuItemVerFormTipoRelaLabo.setVisible((this.isVisibilidadCeldaVerFormTipoRelaLabo && this.isPermisoVerFormTipoRelaLabo));			
			this.jMenuItemAbrirOrderByTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));			
			//this.jMenuItemMostrarOcultarTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));
			this.jMenuItemDetalleAbrirOrderByTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));			
			//this.jMenuItemDetalleMostrarOcultarTipoRelaLabo.setVisible((this.isVisibilidadCeldaOrdenTipoRelaLabo && this.isPermisoOrdenTipoRelaLabo));			
			this.jMenuItemNuevoRelacionesTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo));			
			this.jMenuItemNuevoGuardarCambiosTipoRelaLabo.setVisible((this.isVisibilidadCeldaNuevoTipoRelaLabo && this.isPermisoNuevoTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));									
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemModificarTipoRelaLabo.setVisible((this.isVisibilidadCeldaModificarTipoRelaLabo && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemActualizarTipoRelaLabo.setVisible((this.isVisibilidadCeldaActualizarTipoRelaLabo && this.isPermisoActualizarTipoRelaLabo));	
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemEliminarTipoRelaLabo.setVisible((this.isVisibilidadCeldaEliminarTipoRelaLabo && this.isPermisoEliminarTipoRelaLabo));
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemCancelarTipoRelaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoRelaLabo);				
			}
			
			this.jMenuItemGuardarCambiosTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));						
			this.jMenuItemGuardarCambiosTablaTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=this.jButtonNuevoTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRelaLabo=this.jButtonDuplicarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaCopiarTipoRelaLabo=this.jButtonCopiarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaVerFormTipoRelaLabo=this.jButtonVerFormTipoRelaLabo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRelaLabo=this.jButtonAbrirOrderByTipoRelaLabo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=this.jButtonNuevoRelacionesTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaModificarTipoRelaLabo=this.jButtonModificarTipoRelaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.isVisibilidadCeldaActualizarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaGuardarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=this.jButtonGuardarCambiosTablaTipoRelaLabo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRelaLabo=this.jButtonNuevoToolBarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=this.jButtonNuevoRelacionesToolBarTipoRelaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.isVisibilidadCeldaModificarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarToolBarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarToolBarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarToolBarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarToolBarTipoRelaLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRelaLabo=this.jButtonGuardarCambiosToolBarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRelaLabo=this.jMenuItemNuevoTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=this.jMenuItemNuevoRelacionesTipoRelaLabo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.isVisibilidadCeldaModificarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemModificarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaActualizarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemActualizarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaEliminarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemEliminarTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaCancelarTipoRelaLabo=this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemCancelarTipoRelaLabo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRelaLabo=this.jMenuItemGuardarCambiosTipoRelaLabo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=this.jMenuItemGuardarCambiosTablaTipoRelaLabo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRelaLabo(Boolean esInicializar) {
		if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRelaLabo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRelaLabo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRelaLabo() {
		this.jButtonNuevoTipoRelaLabo.setVisible(this.isPermisoNuevoTipoRelaLabo);			
		this.jButtonDuplicarTipoRelaLabo.setVisible(this.isPermisoDuplicarTipoRelaLabo);			
		this.jButtonCopiarTipoRelaLabo.setVisible(this.isPermisoCopiarTipoRelaLabo);			
		this.jButtonVerFormTipoRelaLabo.setVisible(this.isPermisoVerFormTipoRelaLabo);			
		
		this.jButtonAbrirOrderByTipoRelaLabo.setVisible(this.isPermisoOrdenTipoRelaLabo);					
		
		this.jButtonNuevoRelacionesTipoRelaLabo.setVisible(this.isPermisoNuevoTipoRelaLabo);			
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarTipoRelaLabo.setVisible(this.isPermisoActualizarTipoRelaLabo);	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.setVisible(this.isPermisoActualizarTipoRelaLabo);	
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.setVisible(this.isPermisoEliminarTipoRelaLabo);
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoRelaLabo);						
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.setVisible(this.isPermisoGuardarCambiosTipoRelaLabo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.setVisible(this.isPermisoActualizarTipoRelaLabo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRelaLabo() {
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarTipoRelaLabo.setVisible(this.isPermisoActualizarTipoRelaLabo);	
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.setVisible(this.isPermisoActualizarTipoRelaLabo);	
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.setVisible(this.isPermisoEliminarTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.setVisible(this.isVisibilidadCeldaCancelarTipoRelaLabo);							
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.setVisible((this.isVisibilidadCeldaGuardarTipoRelaLabo && this.isPermisoGuardarCambiosTipoRelaLabo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRelaLabo() {
		if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRelaLabo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRelaLabo() {
	}
	
	public void jTableDatosTipoRelaLaboListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRelaLabo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRelaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.gettiporelalabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporelalabo==null) {
						this.tiporelalabo = new TipoRelaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				}

				if(this.tiporelalabo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporelalabo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRelaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRelaLaboUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRelaLabo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRelaLabo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRelaLabo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.gettiporelalabo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporelalaboLogic.getConnexion());

				if(this.tiporelalabo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporelalabo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRelaLabo=(TitledBorder)this.jScrollPanelDatosTipoRelaLabo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRelaLabo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRelaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.gettiporelalabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporelalabo==null) {
						this.tiporelalabo = new TipoRelaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				}

				if(this.tiporelalabo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporelalabo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRelaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRelaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.gettiporelalabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporelalabo==null) {
						this.tiporelalabo = new TipoRelaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				}

				if(this.tiporelalabo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporelalabo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRelaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRelaLaboBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.gettiporelalabo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporelalabo==null) {
						this.tiporelalabo = new TipoRelaLabo();
					}

					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);
				}

				if(this.tiporelalabo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporelalabo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRelaLabo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoRelaLaboActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRelaLabo(false,false);

			this.getTipoRelaLabosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRelaLabo(false);

			//if(TipoRelaLaboBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRelaLabo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporelalaboLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRelaLabo() {
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
			this.jInternalFrameDetalleFormTipoRelaLabo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRelaLabo.dispose();
			this.jInternalFrameDetalleFormTipoRelaLabo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
			this.jInternalFrameReporteDinamicoTipoRelaLabo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRelaLabo.dispose();
			this.jInternalFrameReporteDinamicoTipoRelaLabo=null;
		}
		
		if(this.jInternalFrameImportacionTipoRelaLabo!=null) {
			this.jInternalFrameImportacionTipoRelaLabo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRelaLabo.dispose();
			this.jInternalFrameImportacionTipoRelaLabo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRelaLabo();
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRelaLabo")) {
				jButtonDuplicarTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRelaLabo")) {
				jButtonCopiarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRelaLabo")) {
				jButtonVerFormTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRelaLabo")) {
				jButtonDuplicarTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRelaLabo")) {
				jButtonDuplicarTipoRelaLaboActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRelaLabo")) {
				jButtonModificarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRelaLabo")) {
				jButtonModificarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRelaLabo")) {
				jButtonModificarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRelaLabo")) {
				jButtonActualizarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRelaLabo")) {
				jButtonActualizarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRelaLabo")) {
				jButtonActualizarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRelaLabo")) {
				jButtonEliminarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRelaLabo")) {
				jButtonEliminarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRelaLabo")) {
				jButtonEliminarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRelaLabo")) {
				jButtonCancelarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRelaLabo")) {
				jButtonCancelarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRelaLabo")) {
				jButtonCancelarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRelaLabo")) {
				jButtonCerrarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRelaLabo")) {
				jButtonCerrarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRelaLabo")) {
				jButtonCerrarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRelaLabo")) {
				jButtonMostrarOcultarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRelaLabo")) {
				jButtonCancelarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRelaLabo")) {
				jButtonCopiarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRelaLabo")) {
				jButtonVerFormTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRelaLabo")) {
				jButtonCopiarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRelaLabo")) {
				jButtonVerFormTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRelaLabo")) {
				jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRelaLabo")) {
				jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRelaLabo")) {
				jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRelaLabo")) {
				jButtonAnterioresTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRelaLabo")) {
				jButtonAnterioresTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRelaLabo")) {
				jButtonAnterioresTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRelaLabo")) {
				jButtonSiguientesTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRelaLabo")) {
				jButtonSiguientesTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRelaLabo")) {
				jButtonSiguientesTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRelaLabo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRelaLabo")) {
				jButtonAbrirOrderByTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRelaLabo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRelaLabo")) {
				jButtonMostrarOcultarTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRelaLabo")) {
				jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRelaLabo")) {
				jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRelaLabo")) {
				jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRelaLabo")) {
				jButtonCerrarReporteDinamicoTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRelaLabo")) {
				jButtonGenerarReporteDinamicoTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRelaLabo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRelaLabo")) {
				jButtonCerrarImportacionTipoRelaLaboActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRelaLabo")) {
				
				jButtonGenerarImportacionTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRelaLabo")) {
				
				jButtonAbrirImportacionTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRelaLabo")) {
				jComboBoxTiposAccionesTipoRelaLaboActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRelaLabo")) {
				jComboBoxTiposRelacionesTipoRelaLaboActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRelaLabo")) {
				jComboBoxTiposAccionesTipoRelaLaboActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRelaLabo")) {
				
				jComboBoxTiposSeleccionarTipoRelaLaboActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRelaLabo")) {
				jTextFieldValorCampoGeneralTipoRelaLaboActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRelaLabo")) {
				jButtonAbrirOrderByTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRelaLabo")) {
				jButtonAbrirOrderByTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRelaLabo")) {
				jButtonCerrarOrderByTipoRelaLaboActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRelaLaboBusqueda")) {
				this.jButtonidTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRelaLaboUpdate")) {
				this.jButtonid_empresaTipoRelaLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRelaLaboBusqueda")) {
				this.jButtonid_empresaTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRelaLaboBusqueda")) {
				this.jButtoncodigoTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRelaLaboBusqueda")) {
				this.jButtonnombreTipoRelaLaboBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRelaLabo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRelaLabo tiporelalaboLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporelalaboLocal=this.tiporelalabo;
			} else {
				tiporelalaboLocal=this.tiporelalaboAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
							
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
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
			
			


			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
								
						
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
								
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
							
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
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
			
			


			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
								
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRelaLabo")) {
					jCheckBoxSeleccionarTodosTipoRelaLaboItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRelaLabo")) {
					jCheckBoxSeleccionadosTipoRelaLaboItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRelaLabo")) {
					
				}
				
				


				
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
												
				
				


				
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
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
			
			


			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRelaLaboActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporelalabo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporelalabo);
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
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
				
				


				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRelaLabo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRelaLabo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRelaLaboActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporelalaboAnterior =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRelaLabo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRelaLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRelaLabo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporelalabo =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporelalabo =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporelalabo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRelaLabo")) {
				
				}
				
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRelaLabo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRelaLabo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRelaLabo")) {
			
			}
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRelaLabo();
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRelaLabo")) {
				jButtonDuplicarTipoRelaLaboActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRelaLabo")) {
				jButtonCopiarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRelaLabo")) {
				jButtonVerFormTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRelaLabo")) {
				jButtonNuevoTipoRelaLaboActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRelaLabo")) {
				jButtonModificarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRelaLabo")) {
				jButtonActualizarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRelaLabo")) {
				jButtonEliminarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRelaLabo")) {
				jButtonCancelarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRelaLabo")) {
				jButtonCerrarTipoRelaLaboActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRelaLabo")) {
				jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRelaLabo")) {
				jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRelaLabo")) {
				jButtonAbrirOrderByTipoRelaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRelaLabo")) {
				jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRelaLabo")) {
				jButtonAnterioresTipoRelaLaboActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRelaLabo")) {
				jButtonSiguientesTipoRelaLaboActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRelaLaboBusqueda")) {
				this.jButtonidTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRelaLaboUpdate")) {
				this.jButtonid_empresaTipoRelaLaboUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRelaLaboBusqueda")) {
				this.jButtonid_empresaTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRelaLaboBusqueda")) {
				this.jButtoncodigoTipoRelaLaboBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRelaLaboBusqueda")) {
				this.jButtonnombreTipoRelaLaboBusquedaActionPerformed(evt);
			}
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRelaLabo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRelaLabo")) {
				closingInternalFrameTipoRelaLabo();
				
			} else if(sTipo.equals("jButtonCancelarTipoRelaLabo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRelaLabo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRelaLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoRelaLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRelaLabo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRelaLaboActionPerformed(null);
			}
			
			TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporelalabo,new Object(),this.tiporelalaboParameterGeneral,this.tiporelalaboReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRelaLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRelaLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRelaLabo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporelalabo)) {
			if(!esControlTabla) {
				if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);			
				}
				
				if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRelaLabo(this.tiporelalabo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporelalaboReturnGeneral=tiporelalaboLogic.procesarEventosTipoRelaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporelalaboLogic.getTipoRelaLabos(),this.tiporelalabo,this.tiporelalaboParameterGeneral,this.isEsNuevoTipoRelaLabo,classes);//this.tiporelalaboLogic.getTipoRelaLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRelaLabo(this.tiporelalaboReturnGeneral,this.tiporelalaboBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRelaLabo(classes,this.tiporelalaboReturnGeneral,this.tiporelalaboBean,false);
					}
						
					if(this.tiporelalaboReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo());	
					}
						
					if(this.tiporelalaboReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo(),classes);//this.tiporelalaboBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRelaLabo(this.tiporelalabo,classes);//this.tiporelalaboBean);									
				}
			
				if(TipoRelaLaboJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRelaLabo(this.tiporelalabo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRelaLabo(this.tiporelalabo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporelalaboAnterior!=null) {
						this.tiporelalabo=this.tiporelalaboAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporelalaboReturnGeneral=tiporelalaboLogic.procesarEventosTipoRelaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporelalaboLogic.getTipoRelaLabos(),this.tiporelalabo,this.tiporelalaboParameterGeneral,this.isEsNuevoTipoRelaLabo,classes);//this.tiporelalaboLogic.getTipoRelaLabo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporelalaboSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporelalaboSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporelalaboReturnGeneral.getTipoRelaLabo(),tiporelalaboLogic.getTipoRelaLabos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporelalaboReturnGeneral.getTipoRelaLabo(),this.tiporelalabos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRelaLabo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRelaLabo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRelaLabo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRelaLabo() throws Exception {
		
		TipoRelaLaboModel tiporelalaboModel=(TipoRelaLaboModel)this.jTableDatosTipoRelaLabo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporelalaboModel.tiporelalabos=this.tiporelalaboLogic.getTipoRelaLabos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporelalaboModel.tiporelalabos=this.tiporelalabos;
		}
		
		
		((TipoRelaLaboModel) this.jTableDatosTipoRelaLabo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRelaLabo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporelalaboAnterior(),this.tiporelalaboLogic.getTipoRelaLabos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporelalaboAnterior(),this.tiporelalabos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRelaLabo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRelaLabo(TipoRelaLabo tiporelalabo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(tiporelalabo.getInformacionLaborals());
					this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
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
										
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporelalabo,new Object(),generalEntityParameterGeneral,this.tiporelalaboReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporelalaboSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRelaLaboConstantesFunciones.getClassesRelationshipsOfTipoRelaLabo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRelaLaboConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRelaLabo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRelaLabo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRelaLaboBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporelalabo,new Object(),generalEntityParameterGeneral,this.tiporelalaboReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRelaLabo(TipoRelaLaboBean tiporelalaboBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.setInformacionLaborals(tiporelalabo.getInformacionLaborals());
					this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.inicializarActualizarBindingTablaInformacionLaboral(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRelaLabo(ArrayList<Classe> classes,TipoRelaLaboReturnGeneral tiporelalaboReturnGeneral,TipoRelaLaboBean tiporelalaboBean,Boolean conDefault) throws Exception {
		
			this.tiporelalaboBean.setInformacionLaborals(tiporelalaboReturnGeneral.getTipoRelaLabo().getInformacionLaborals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRelaLabo(TipoRelaLabo tiporelalabo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(InformacionLaboral.class)) {
					tiporelalabo.setInformacionLaborals(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralBeanSwingJInternalFrame.informacionlaboralLogic.getInformacionLaborals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporelalabo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRelaLabo = new TipoRelaLaboDetalleFormJInternalFrame(jDesktopPane,this.tiporelalaboSessionBean.getConGuardarRelaciones(),this.tiporelalaboSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.setVisible(false);
		this.jInternalFrameDetalleFormTipoRelaLabo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRelaLabo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRelaLabo.tiporelalaboLogic=this.tiporelalaboLogic;
		
		this.cargarCombosFrameForeignKeyTipoRelaLabo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRelaLabo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRelaLabo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRelaLabo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRelaLabo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRelaLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRelaLabo"));
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoRelaLabo"));

		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRelaLabo"));
					
		this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemModificarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRelaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoRelaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRelaLabo"));
						
		this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemActualizarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRelaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoRelaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRelaLabo"));
								
		this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemEliminarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRelaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoRelaLabo"));
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRelaLabo"));
					
		this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemCancelarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRelaLabo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemDetalleCerrarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRelaLabo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRelaLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRelaLabo"));
		
		
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRelaLabo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonidTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRelaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtoncodigoTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonnombreTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRelaLaboBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRelaLabo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRelaLabo"));
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRelaLabo"));
		}
		
		this.jTableDatosTipoRelaLabo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRelaLabo"));
		
		this.jTableDatosTipoRelaLabo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRelaLabo"));
		
		this.jButtonNuevoTipoRelaLabo.addActionListener(new ButtonActionListener(this,"NuevoTipoRelaLabo"));
		
		this.jButtonDuplicarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"DuplicarTipoRelaLabo"));
		
		this.jButtonCopiarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"CopiarTipoRelaLabo"));
		
		this.jButtonVerFormTipoRelaLabo.addActionListener(new ButtonActionListener(this,"VerFormTipoRelaLabo"));
		
		
		this.jButtonNuevoToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRelaLabo"));
			
		this.jButtonDuplicarToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRelaLabo"));
			
		this.jMenuItemNuevoTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRelaLabo"));
			
		this.jMenuItemDuplicarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRelaLabo"));		
		
		
		this.jButtonNuevoRelacionesTipoRelaLabo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRelaLabo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRelaLabo"));
			
		this.jMenuItemNuevoRelacionesTipoRelaLabo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRelaLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ModificarTipoRelaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonModificarToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRelaLabo"));
			
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemModificarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRelaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"ActualizarTipoRelaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonActualizarToolBarTipoRelaLabo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRelaLabo"));
				
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemActualizarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRelaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"EliminarTipoRelaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonEliminarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRelaLabo"));
						
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemEliminarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRelaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CancelarTipoRelaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonCancelarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRelaLabo"));
			
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemCancelarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRelaLabo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRelaLabo"));		
		
		
		this.jButtonCerrarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CerrarTipoRelaLabo"));
		
		
		this.jButtonCerrarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRelaLabo"));
			
		this.jMenuItemCerrarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRelaLabo"));
			
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jMenuItemDetalleCerrarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRelaLabo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRelaLabo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRelaLabo"));
		}
		
		this.jButtonCopiarToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRelaLabo"));
			
		this.jButtonVerFormToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRelaLabo"));
		
		this.jMenuItemGuardarCambiosTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRelaLabo"));
			
		this.jMenuItemCopiarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRelaLabo"));		
		
		this.jMenuItemVerFormTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRelaLabo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRelaLabo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRelaLabo"));
			
		this.jMenuItemGuardarCambiosTablaTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRelaLabo"));		
		
		
		
		this.jButtonRecargarInformacionTipoRelaLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRelaLabo"));
					
		this.jButtonRecargarInformacionToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRelaLabo"));
		
		this.jMenuItemRecargarInformacionTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRelaLabo"));		
		
		
		
		this.jButtonAnterioresTipoRelaLabo.addActionListener (new ButtonActionListener(this,"AnterioresTipoRelaLabo"));
		
		
		this.jButtonAnterioresToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRelaLabo"));
		
		this.jMenuItemAnterioresTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRelaLabo"));		
		
		
		this.jButtonSiguientesTipoRelaLabo.addActionListener (new ButtonActionListener(this,"SiguientesTipoRelaLabo"));
		
		
		this.jButtonSiguientesToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRelaLabo"));
			
		this.jMenuItemSiguientesTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRelaLabo"));
			
		this.jMenuItemAbrirOrderByTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRelaLabo"));
			
		this.jMenuItemMostrarOcultarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRelaLabo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRelaLabo"));
			
		this.jMenuItemDetalleMostarOcultarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRelaLabo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRelaLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRelaLabo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRelaLabo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRelaLabo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRelaLabo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRelaLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRelaLabo"));

		this.jCheckBoxSeleccionadosTipoRelaLabo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRelaLabo"));
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRelaLabo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRelaLabo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRelaLabo"));
			
		this.jComboBoxTiposAccionesTipoRelaLabo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRelaLabo"));
					
		this.jComboBoxTiposSeleccionarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRelaLabo"));
			
		this.jTextFieldValorCampoGeneralTipoRelaLabo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRelaLabo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonidTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRelaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtoncodigoTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonnombreTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRelaLaboBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRelaLabo!=null) {
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRelaLabo"));
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRelaLabo"));
				this.jInternalFrameReporteDinamicoTipoRelaLabo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRelaLabo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRelaLabo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRelaLabo"));				
			//this.jButtonGenerarReporteDinamicoTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRelaLabo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRelaLabo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRelaLabo!=null) {
				this.jInternalFrameImportacionTipoRelaLabo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRelaLabo"));
				this.jInternalFrameImportacionTipoRelaLabo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRelaLabo"));
				this.jInternalFrameImportacionTipoRelaLabo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRelaLabo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRelaLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRelaLabo"));
			
			this.jButtonAbrirOrderByToolBarTipoRelaLabo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRelaLabo"));			
			
			if(this.jInternalFrameOrderByTipoRelaLabo!=null) {
				this.jInternalFrameOrderByTipoRelaLabo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRelaLabo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRelaLabo.jTabbedPaneRelacionesTipoRelaLabo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRelaLabo"));
		
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
            		closingInternalFrameTipoRelaLabo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRelaLabo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRelaLabo = (JInternalFrameBase)event.getSource();
	            	
	            TipoRelaLaboBeanSwingJInternalFrame jInternalFrameParent=(TipoRelaLaboBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRelaLabo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRelaLaboActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRelaLabo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRelaLaboListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRelaLabo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRelaLabo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRelaLabo";
		inputMap = this.jButtonNuevoTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRelaLaboActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRelaLaboActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRelaLabo";
		inputMap = this.jButtonNuevoRelacionesTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRelaLaboActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRelaLabo";
		inputMap = this.jButtonModificarTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRelaLabo";
		inputMap = this.jButtonActualizarTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRelaLabo";
		inputMap = this.jButtonEliminarTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRelaLabo";
		inputMap = this.jButtonCancelarTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRelaLabo";
		inputMap = this.jButtonCerrarTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRelaLabo";
		inputMap = this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonGuardarCambiosTipoRelaLabo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRelaLaboActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRelaLabo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRelaLaboItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRelaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRelaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRelaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRelaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRelaLabo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRelaLaboActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonidTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRelaLaboBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonid_empresaTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtoncodigoTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRelaLaboBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRelaLabo.jButtonnombreTipoRelaLaboBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRelaLaboBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRelaLabo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRelaLaboActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRelaLaboActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRelaLabo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRelaLabo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
					tiporelalaboAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRelaLabo tiporelalaboAux:tiporelalabos) {
					tiporelalaboAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRelaLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
						tiporelalaboAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRelaLabo tiporelalaboAux:tiporelalabos) {
						tiporelalaboAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRelaLabo tiporelalaboAux:tiporelalabos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRelaLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRelaLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRelaLaboItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRelaLabo.getSelectedRows();
			
			TipoRelaLabo tiporelalaboLocal=new TipoRelaLabo();
			
			//this.seleccionarTodosTipoRelaLabo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporelalaboLocal =(TipoRelaLabo) this.tiporelalaboLogic.getTipoRelaLabos().toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporelalaboLocal =(TipoRelaLabo) this.tiporelalabos.toArray()[this.jTableDatosTipoRelaLabo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporelalaboLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
						tiporelalaboAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRelaLabo tiporelalaboAux:tiporelalabos) {
						tiporelalaboAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRelaLabo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRelaLabo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRelaLabo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRelaLaboItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRelaLaboParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRelaLaboActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRelaLabo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRelaLabo tiporelalaboAux:this.tiporelalaboLogic.getTipoRelaLabos()) {
				
						if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporelalaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporelalaboAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRelaLabo tiporelalaboAux:tiporelalabos) {
					
						if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporelalaboAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporelalaboAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRelaLaboActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRelaLabo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRelaLabo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRelaLabo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRelaLabo(conSplash);
				
					this.generarReporteTipoRelaLabosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRelaLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRelaLabosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRelaLabosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRelaLabo();
				
				this.exportarTipoRelaLabosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRelaLabos();
				//this.importarTipoRelaLabos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRelaLabo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRelaLabosSeleccionados();
				//this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Rela Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRelaLabo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRelaLabo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRelaLabo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRelaLaboBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRelaLabo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRelaLabo(conSplash);
					
						//this.actualizarParametrosGeneralTipoRelaLabo();
						
						this.generarReporteProcesoAccionTipoRelaLabosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRelaLaboBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Rela LaboS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Rela Labo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRelaLabo();
				
						this.actualizarParametrosGeneralTipoRelaLabo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporelalaboReturnGeneral=tiporelalaboLogic.procesarAccionTipoRelaLabosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporelalaboLogic.getTipoRelaLabos(),this.tiporelalaboParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRelaLaboReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRelaLabo();
					
					TipoRelaLaboBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRelaLaboReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRelaLabo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxTiposAccionesFormularioTipoRelaLabo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRelaLabo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRelaLaboActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRelaLabo();
			
			if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
			TipoRelaLabo tiporelalabo=new TipoRelaLabo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRelaLabo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRelaLabo.getSelectedItem();
			
			
			
			
			tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporelalabosSeleccionados.size()==1) {
				for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
					tiporelalabo=tiporelalaboAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Informacion Laboral")) {
					jButtonInformacionLaboralActionPerformed(null,rowIndex,true,false,tiporelalabo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRelaLabo();
			
      		//this.finishProcessTipoRelaLabo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRelaLaboReturnGeneral() throws Exception {
		if(this.tiporelalaboReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporelalaboReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporelalaboReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporelalaboReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporelalaboReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporelalaboReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRelaLabo(false);
		}
		
		if(this.tiporelalaboReturnGeneral.getConRetornoLista() || this.tiporelalaboReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporelalaboReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporelalaboLogic.setTipoRelaLabos(this.tiporelalaboReturnGeneral.getTipoRelaLabos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporelalaboReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporelalaboLogic.setTipoRelaLabo(this.tiporelalaboReturnGeneral.getTipoRelaLabo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRelaLabo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRelaLabo() throws Exception {
		
		
	}
	
	public ArrayList<TipoRelaLabo> getTipoRelaLabosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRelaLabo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRelaLabo tiporelalaboAux:tiporelalaboLogic.getTipoRelaLabos()) {
					if(tiporelalaboAux.getIsSelected()) {
						tiporelalabosSeleccionados.add(tiporelalaboAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRelaLabo tiporelalaboAux:this.tiporelalabos) {
					if(tiporelalaboAux.getIsSelected()) {
						tiporelalabosSeleccionados.add(tiporelalaboAux);				
					}
				}
			}
			
			if(tiporelalabosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporelalabosSeleccionados.addAll(this.tiporelalaboLogic.getTipoRelaLabos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporelalabosSeleccionados.addAll(this.tiporelalabos);				
					}
				}
			}
		} else {
			tiporelalabosSeleccionados.add(this.tiporelalabo);
		}
		
		return tiporelalabosSeleccionados;
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
	
	public void generarReporteTipoRelaLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRelaLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRelaLabosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRelaLabosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRelaLabosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRelaLabosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Rela Labo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRelaLabosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRelaLabo();
		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRelaLabo();
		
		
		//this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados ,tiporelalaboImplementable,tiporelalaboImplementableHome);
	}
	
	public void mostrarImportacionTipoRelaLabos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRelaLabo();
		
		this.abrirFrameImportacionTipoRelaLabo();		
		
			
		//this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados ,tiporelalaboImplementable,tiporelalaboImplementableHome);
	}
	
	public void importarTipoRelaLabos() throws Exception {		
	
	}
	
	public void exportarTipoRelaLabosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRelaLabosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRelaLabosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRelaLabosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Rela Labo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRelaLabo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRelaLabo(tiporelalaboAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporelalaboAux.setsDetalleGeneralEntityReporte(tiporelalaboAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRelaLabo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRelaLaboConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRelaLaboConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRelaLaboConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRelaLaboConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRelaLabo(TipoRelaLabo tiporelalabo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporelalabo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporelalabo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporelalabo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporelalabo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporelalabo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRelaLabos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRelaLabo(row);				
				iRow++;
			}				
			
			for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRelaLabo(tiporelalaboAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRelaLabosSeleccionados() throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();		
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporelalabo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporelalabos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporelalabo");
			//elementRoot.appendChild(element);
		
			for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
				element = document.createElement("tiporelalabo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRelaLabo(tiporelalaboAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rela Labo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRelaLabo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRelaLabo(TipoRelaLabo tiporelalabo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporelalabo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporelalabo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporelalabo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporelalabo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRelaLabo(TipoRelaLabo tiporelalabo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRelaLaboConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporelalabo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRelaLaboConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporelalabo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRelaLaboConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporelalabo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoRelaLaboConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporelalabo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRelaLaboConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporelalabo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRelaLabosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRelaLabo> tiporelalabosSeleccionados=new ArrayList<TipoRelaLabo>();
		
		tiporelalabosSeleccionados=this.getTipoRelaLabosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRelaLabo(tiporelalabosSeleccionados);
		
		this.generarReporteTipoRelaLabos("Todos",tiporelalabosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRelaLabo(ArrayList<TipoRelaLabo> tiporelalabosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRelaLabo tiporelalaboAux:tiporelalabosSeleccionados) {
				tiporelalaboAux.setsDetalleGeneralEntityReporte(tiporelalaboAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporelalaboAux.setsDescripcionGeneralEntityReporte1(tiporelalaboAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporelalaboAux.setsDescripcionGeneralEntityReporte1(tiporelalaboAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRelaLaboConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporelalaboAux.setsDescripcionGeneralEntityReporte1(tiporelalaboAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRelaLaboConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRelaLabo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRelaLabo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=true;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=true;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=true;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=true;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=true;
			this.isVisibilidadCeldaModificarTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
			this.isVisibilidadCeldaModificarTipoRelaLabo=true;
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
			this.isVisibilidadCeldaCancelarTipoRelaLabo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRelaLabo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRelaLaboJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRelaLabo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=true;
		} else {
			this.actualizarEstadoPanelsTipoRelaLabo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRelaLabo=false;
			//this.isVisibilidadCeldaVerFormTipoRelaLabo=false;
			this.isVisibilidadCeldaDuplicarTipoRelaLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporelalaboSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			if(!tiporelalaboSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;												
			}
			
			this.jButtonCerrarTipoRelaLabo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRelaLabo=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporelalabo)) {
			this.isVisibilidadCeldaActualizarTipoRelaLabo=false;
			this.isVisibilidadCeldaEliminarTipoRelaLabo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRelaLabo() {
		this.isVisibilidadCeldaNuevoTipoRelaLabo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRelaLabo=false;
	}
	
	public void actualizarEstadoPanelsTipoRelaLabo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRelaLabo!=null) {
				this.jScrollPanelDatosEdicionTipoRelaLabo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRelaLabo!=null) {
				this.jScrollPanelDatosTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRelaLabo!=null) {
				this.jPanelPaginacionTipoRelaLabo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
					this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporelalaboSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRelaLabo!=null) {
				this.jTabbedPaneBusquedasTipoRelaLabo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRelaLabo!=null) {
				this.jPanelParametrosReportesTipoRelaLabo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoRelaLaboParaInformacionLaborales() throws Exception {
		Boolean isPaginaPopupInformacionLaboral=false;

		try {

			if(this.tiporelalaboSessionBean==null) {
				this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean=new InformacionLaboralSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setsPathNavegacionActual(tiporelalaboSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+InformacionLaboralConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupInformacionLaboral=this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeInformacionLaboral(false);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeInformacionLaboral(TipoRelaLaboConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setisBusquedaDesdeForeignKeySesionTipoRelaLabo(true);
			this.jInternalFrameDetalleFormTipoRelaLabo.informacionlaboralSessionBean.setlidTipoRelaLaboActual(this.idTipoRelaLaboActual);

			tiporelalaboSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRelaLabo(true);
			tiporelalaboSessionBean.setlIdTipoRelaLaboActualForeignKey(this.idTipoRelaLaboActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRelaLaboSessionBean tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		
		if(this.tiporelalaboSessionBean==null) {
			this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		}
		
		this.tiporelalaboSessionBean.setsUltimaBusquedaTipoRelaLabo(this.getsAccionBusqueda());
		this.tiporelalaboSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporelalaboSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporelalaboSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRelaLaboSessionBean tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		
		if(this.tiporelalaboSessionBean==null) {
			this.tiporelalaboSessionBean=new TipoRelaLaboSessionBean();
		}
		
		if(this.tiporelalaboSessionBean.getsUltimaBusquedaTipoRelaLabo()!=null&&!this.tiporelalaboSessionBean.getsUltimaBusquedaTipoRelaLabo().equals("")) {
			this.setsAccionBusqueda(tiporelalaboSessionBean.getsUltimaBusquedaTipoRelaLabo());
			this.setiNumeroPaginacion(tiporelalaboSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporelalaboSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporelalaboSessionBean.getid_empresa());
				tiporelalaboSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporelalaboSessionBean.setsUltimaBusquedaTipoRelaLabo("");
		this.tiporelalaboSessionBean.setiNumeroPaginacion(TipoRelaLaboConstantesFunciones.INUMEROPAGINACION);
		this.tiporelalaboSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRelaLabo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRelaLabo() {
		this.updateBorderResaltarBusquedasFormularioTipoRelaLabo();
		this.updateVisibilidadBusquedasFormularioTipoRelaLabo();
		this.updateHabilitarBusquedasFormularioTipoRelaLabo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRelaLabo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRelaLabo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRelaLabo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRelaLabo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRelaLabo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRelaLabo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRelaLabo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoRelaLabo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRelaLabo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRelaLabo();
		this.updateVisibilidadResaltarControlesFormularioTipoRelaLabo();
		this.updateHabilitarResaltarControlesFormularioTipoRelaLabo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRelaLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporelalaboConstantesFunciones.resaltaridTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo!=null) {this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setBorder(this.tiporelalaboConstantesFunciones.resaltaridTipoRelaLabo);}
		if(this.tiporelalaboConstantesFunciones.resaltarid_empresaTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo!=null) {this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setBorder(this.tiporelalaboConstantesFunciones.resaltarid_empresaTipoRelaLabo);}
		if(this.tiporelalaboConstantesFunciones.resaltarcodigoTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo!=null) {this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setBorder(this.tiporelalaboConstantesFunciones.resaltarcodigoTipoRelaLabo);}
		if(this.tiporelalaboConstantesFunciones.resaltarnombreTipoRelaLabo!=null && this.jInternalFrameDetalleFormTipoRelaLabo!=null) {this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setBorder(this.tiporelalaboConstantesFunciones.resaltarnombreTipoRelaLabo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRelaLabo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
	
		//this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostraridTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jPanelidTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostraridTipoRelaLabo);
		//this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarid_empresaTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jPanelid_empresaTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarid_empresaTipoRelaLabo);
		//this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarcodigoTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jPanelcodigoTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarcodigoTipoRelaLabo);
		//this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarnombreTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jPanelnombreTipoRelaLabo.setVisible(this.tiporelalaboConstantesFunciones.mostrarnombreTipoRelaLabo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRelaLabo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRelaLabo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRelaLabo!=null) {
	
		this.jInternalFrameDetalleFormTipoRelaLabo.jLabelidTipoRelaLabo.setEnabled(this.tiporelalaboConstantesFunciones.activaridTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jComboBoxid_empresaTipoRelaLabo.setEnabled(this.tiporelalaboConstantesFunciones.activarid_empresaTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jTextFieldcodigoTipoRelaLabo.setEnabled(this.tiporelalaboConstantesFunciones.activarcodigoTipoRelaLabo);
		this.jInternalFrameDetalleFormTipoRelaLabo.jTextAreanombreTipoRelaLabo.setEnabled(this.tiporelalaboConstantesFunciones.activarnombreTipoRelaLabo);
		}
	}
	
		
}