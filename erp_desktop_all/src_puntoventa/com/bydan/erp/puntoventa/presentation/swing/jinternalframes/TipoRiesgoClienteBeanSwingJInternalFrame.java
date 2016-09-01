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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.TipoRiesgoClienteConstantesFunciones;
import com.bydan.erp.puntoventa.util.TipoRiesgoClienteParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.TipoRiesgoClienteParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.TipoRiesgoClienteBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
public class TipoRiesgoClienteBeanSwingJInternalFrame extends TipoRiesgoClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRiesgoClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRiesgoCliente> tiporiesgoclienteValidator = new ClassValidator<TipoRiesgoCliente>(TipoRiesgoCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRiesgoCliente tiporiesgocliente;	
	public TipoRiesgoCliente tiporiesgoclienteAux;
	public TipoRiesgoCliente tiporiesgoclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRiesgoCliente tiporiesgoclienteTotales;
	public Long idTipoRiesgoClienteActual;
	public Long iIdNuevoTipoRiesgoCliente=0L;
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
	
	public Boolean isPermisoTodoTipoRiesgoCliente;
	public Boolean isPermisoNuevoTipoRiesgoCliente;
	public Boolean isPermisoActualizarTipoRiesgoCliente;
	public Boolean isPermisoActualizarOriginalTipoRiesgoCliente;
	public Boolean isPermisoEliminarTipoRiesgoCliente;
	public Boolean isPermisoGuardarCambiosTipoRiesgoCliente;
	public Boolean isPermisoConsultaTipoRiesgoCliente;
	public Boolean isPermisoBusquedaTipoRiesgoCliente;
	public Boolean isPermisoReporteTipoRiesgoCliente;
	public Boolean isPermisoPaginacionMedioTipoRiesgoCliente;
	public Boolean isPermisoPaginacionAltoTipoRiesgoCliente;
	public Boolean isPermisoPaginacionTodoTipoRiesgoCliente;
	public Boolean isPermisoCopiarTipoRiesgoCliente;
	public Boolean isPermisoVerFormTipoRiesgoCliente;
	public Boolean isPermisoDuplicarTipoRiesgoCliente;
	public Boolean isPermisoOrdenTipoRiesgoCliente;
	
	
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
	
	public TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteReturnGeneral;
	public TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRiesgoCliente=false;
	public Boolean esParaAccionDesdeFormularioTipoRiesgoCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRiesgoClienteSessionBeanAdditional tiporiesgoclienteSessionBeanAdditional=null;
	
	public TipoRiesgoClienteSessionBeanAdditional getTipoRiesgoClienteSessionBeanAdditional() {
		return this.tiporiesgoclienteSessionBeanAdditional;
	}
	
	public void setTipoRiesgoClienteSessionBeanAdditional(TipoRiesgoClienteSessionBeanAdditional tiporiesgoclienteSessionBeanAdditional) {
		try {
			this.tiporiesgoclienteSessionBeanAdditional=tiporiesgoclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRiesgoClienteBeanSwingJInternalFrameAdditional tiporiesgoclienteBeanSwingJInternalFrameAdditional=null;
	//public class TipoRiesgoClienteBeanSwingJInternalFrame
	
	public TipoRiesgoClienteBeanSwingJInternalFrameAdditional getTipoRiesgoClienteBeanSwingJInternalFrameAdditional() {
		return this.tiporiesgoclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRiesgoClienteBeanSwingJInternalFrameAdditional(TipoRiesgoClienteBeanSwingJInternalFrameAdditional tiporiesgoclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporiesgoclienteBeanSwingJInternalFrameAdditional=tiporiesgoclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRiesgoClienteLogic tiporiesgoclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRiesgoCliente tiporiesgoclienteBean;
	public TipoRiesgoClienteConstantesFunciones tiporiesgoclienteConstantesFunciones;
	//public TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRiesgoCliente> tiporiesgoclientes;	
	//public List<TipoRiesgoCliente> tiporiesgoclientesEliminados;
	//public List<TipoRiesgoCliente> tiporiesgoclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRiesgoCliente=true;
	public Boolean isVisibilidadCeldaCopiarTipoRiesgoCliente=true;
	public Boolean isVisibilidadCeldaVerFormTipoRiesgoCliente=true;
	public Boolean isVisibilidadCeldaOrdenTipoRiesgoCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaModificarTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaCancelarTipoRiesgoCliente=false;
	public Boolean isVisibilidadCeldaGuardarTipoRiesgoCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRiesgoCliente() {
		return this.iIdNuevoTipoRiesgoCliente;
	}

	public void setiIdNuevoTipoRiesgoCliente(Long iIdNuevoTipoRiesgoCliente) {
		this.iIdNuevoTipoRiesgoCliente = iIdNuevoTipoRiesgoCliente;
	}
	
	public Long getidTipoRiesgoClienteActual() {
		return this.idTipoRiesgoClienteActual;
	}

	public void setidTipoRiesgoClienteActual(Long idTipoRiesgoClienteActual) {
		this.idTipoRiesgoClienteActual = idTipoRiesgoClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRiesgoCliente gettiporiesgocliente() {
		return this.tiporiesgocliente;
	}

	public void settiporiesgocliente(TipoRiesgoCliente tiporiesgocliente) {
		this.tiporiesgocliente = tiporiesgocliente;
	}
	
	public TipoRiesgoCliente gettiporiesgoclienteAux() {
		return this.tiporiesgoclienteAux;
	}

	public void settiporiesgoclienteAux(TipoRiesgoCliente tiporiesgoclienteAux) {
		this.tiporiesgoclienteAux = tiporiesgoclienteAux;
	}				
	
	public TipoRiesgoCliente gettiporiesgoclienteAnterior() {
		return this.tiporiesgoclienteAnterior;
	}

	public void settiporiesgoclienteAnterior(TipoRiesgoCliente tiporiesgoclienteAnterior) {
		this.tiporiesgoclienteAnterior = tiporiesgoclienteAnterior;
	}	
	
	public TipoRiesgoCliente gettiporiesgoclienteTotales() {
		return this.tiporiesgoclienteTotales;
	}

	public void settiporiesgoclienteTotales(TipoRiesgoCliente tiporiesgoclienteTotales) {
		this.tiporiesgoclienteTotales = tiporiesgoclienteTotales;
	}	
	
	public TipoRiesgoCliente gettiporiesgoclienteBean() {
		return this.tiporiesgoclienteBean;
	}

	public void settiporiesgoclienteBean(TipoRiesgoCliente tiporiesgoclienteBean) {
		this.tiporiesgoclienteBean = tiporiesgoclienteBean;
	}	
	
	public TipoRiesgoClienteParameterReturnGeneral gettiporiesgoclienteReturnGeneral() {
		return this.tiporiesgoclienteReturnGeneral;
	}

	public void settiporiesgoclienteReturnGeneral(TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteReturnGeneral) {
		this.tiporiesgoclienteReturnGeneral = tiporiesgoclienteReturnGeneral;
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
	
	
	public TipoRiesgoClienteLogic getTipoRiesgoClienteLogic()	{		
		return tiporiesgoclienteLogic;
	}

	public void setTipoRiesgoClienteLogic(TipoRiesgoClienteLogic tiporiesgoclienteLogic) {
		this.tiporiesgoclienteLogic = tiporiesgoclienteLogic;
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
	
	public Boolean getIsEsNuevoTipoRiesgoCliente() {
		return isEsNuevoTipoRiesgoCliente;
	}

	public void setIsEsNuevoTipoRiesgoCliente(Boolean isEsNuevoTipoRiesgoCliente) {
		this.isEsNuevoTipoRiesgoCliente = isEsNuevoTipoRiesgoCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRiesgoCliente() {
		return esParaAccionDesdeFormularioTipoRiesgoCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRiesgoCliente(Boolean esParaAccionDesdeFormularioTipoRiesgoCliente) {
		this.esParaAccionDesdeFormularioTipoRiesgoCliente = esParaAccionDesdeFormularioTipoRiesgoCliente;
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

			if(this.tiporiesgoclienteSessionBean==null) {
				this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
			}

			if(!this.tiporiesgoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporiesgoclienteSessionBean.getlidEmpresaActual());
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

					if(this.tiporiesgocliente!=null) {
						this.tiporiesgocliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
						this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRiesgoCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
						if(this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRiesgoClienteGenerico)throws Exception
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
				jComboBoxid_empresaTipoRiesgoClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRiesgoClienteGenerico!=null && jComboBoxid_empresaTipoRiesgoClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRiesgoClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRiesgoCliente tiporiesgocliente,JComboBox jComboBoxid_empresaTipoRiesgoClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRiesgoClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRiesgoClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporiesgocliente.setid_empresa(empresaAux.getId());
				tiporiesgocliente.setempresa_descripcion(TipoRiesgoClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporiesgocliente.setEmpresa(empresaAux);			}
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

					if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { 
							this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { 
					}

					if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
							this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
							this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRiesgoCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRiesgoClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoRiesgoCliente(this.tiporiesgoclienteLogic.getTipoRiesgoClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRiesgoClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoRiesgoCliente(this.tiporiesgoclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporiesgoclienteLogic.setTipoRiesgoClientes(this.tiporiesgoclientes);
			tiporiesgoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRiesgoClienteParameterReturnGeneral getTipoRiesgoClienteParameterGeneral() {
		return this.tiporiesgoclienteParameterGeneral;
	}
	
	public void setTipoRiesgoClienteParameterGeneral(TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteParameterGeneral) {
		this.tiporiesgoclienteParameterGeneral = tiporiesgoclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRiesgoCliente() {
		return isPermisoTodoTipoRiesgoCliente;
	}

	public void setIsPermisoTodoTipoRiesgoCliente(Boolean isPermisoTodoTipoRiesgoCliente) {
		this.isPermisoTodoTipoRiesgoCliente = isPermisoTodoTipoRiesgoCliente;
	}

	public Boolean getIsPermisoNuevoTipoRiesgoCliente() {
		return isPermisoNuevoTipoRiesgoCliente;
	}

	public void setIsPermisoNuevoTipoRiesgoCliente(Boolean isPermisoNuevoTipoRiesgoCliente) {
		this.isPermisoNuevoTipoRiesgoCliente = isPermisoNuevoTipoRiesgoCliente;
	}

	public Boolean getIsPermisoActualizarTipoRiesgoCliente() {
		return isPermisoActualizarTipoRiesgoCliente;
	}

	public void setIsPermisoActualizarTipoRiesgoCliente(Boolean isPermisoActualizarTipoRiesgoCliente) {
		this.isPermisoActualizarTipoRiesgoCliente = isPermisoActualizarTipoRiesgoCliente;
	}

	public Boolean getIsPermisoEliminarTipoRiesgoCliente() {
		return isPermisoEliminarTipoRiesgoCliente;
	}

	public void setIsPermisoEliminarTipoRiesgoCliente(Boolean isPermisoEliminarTipoRiesgoCliente) {
		this.isPermisoEliminarTipoRiesgoCliente = isPermisoEliminarTipoRiesgoCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRiesgoCliente() {
		return isPermisoGuardarCambiosTipoRiesgoCliente;
	}

	public void setIsPermisoGuardarCambiosTipoRiesgoCliente(Boolean isPermisoGuardarCambiosTipoRiesgoCliente) {
		this.isPermisoGuardarCambiosTipoRiesgoCliente = isPermisoGuardarCambiosTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoConsultaTipoRiesgoCliente() {
		return isPermisoConsultaTipoRiesgoCliente;
	}

	public void setIsPermisoConsultaTipoRiesgoCliente(Boolean isPermisoConsultaTipoRiesgoCliente) {
		this.isPermisoConsultaTipoRiesgoCliente = isPermisoConsultaTipoRiesgoCliente;
	}

	public Boolean getIsPermisoBusquedaTipoRiesgoCliente() {
		return isPermisoBusquedaTipoRiesgoCliente;
	}

	public void setIsPermisoBusquedaTipoRiesgoCliente(Boolean isPermisoBusquedaTipoRiesgoCliente) {
		this.isPermisoBusquedaTipoRiesgoCliente = isPermisoBusquedaTipoRiesgoCliente;
	}

	public Boolean getIsPermisoReporteTipoRiesgoCliente() {
		return isPermisoReporteTipoRiesgoCliente;
	}

	public void setIsPermisoReporteTipoRiesgoCliente(Boolean isPermisoReporteTipoRiesgoCliente) {
		this.isPermisoReporteTipoRiesgoCliente = isPermisoReporteTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRiesgoCliente() {
		return isPermisoPaginacionMedioTipoRiesgoCliente;
	}

	public void setIsPermisoPaginacionMedioTipoRiesgoCliente(Boolean isPermisoPaginacionMedioTipoRiesgoCliente) {
		this.isPermisoPaginacionMedioTipoRiesgoCliente = isPermisoPaginacionMedioTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRiesgoCliente() {
		return isPermisoPaginacionTodoTipoRiesgoCliente;
	}

	public void setIsPermisoPaginacionTodoTipoRiesgoCliente(Boolean isPermisoPaginacionTodoTipoRiesgoCliente) {
		this.isPermisoPaginacionTodoTipoRiesgoCliente = isPermisoPaginacionTodoTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRiesgoCliente() {
		return isPermisoPaginacionAltoTipoRiesgoCliente;
	}

	public void setIsPermisoPaginacionAltoTipoRiesgoCliente(Boolean isPermisoPaginacionAltoTipoRiesgoCliente) {
		this.isPermisoPaginacionAltoTipoRiesgoCliente = isPermisoPaginacionAltoTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoCopiarTipoRiesgoCliente() {
		return isPermisoCopiarTipoRiesgoCliente;
	}

	public void setIsPermisoCopiarTipoRiesgoCliente(Boolean isPermisoCopiarTipoRiesgoCliente) {
		this.isPermisoCopiarTipoRiesgoCliente = isPermisoCopiarTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoVerFormTipoRiesgoCliente() {
		return isPermisoVerFormTipoRiesgoCliente;
	}

	public void setIsPermisoVerFormTipoRiesgoCliente(Boolean isPermisoVerFormTipoRiesgoCliente) {
		this.isPermisoVerFormTipoRiesgoCliente = isPermisoVerFormTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoDuplicarTipoRiesgoCliente() {
		return isPermisoDuplicarTipoRiesgoCliente;
	}

	public void setIsPermisoDuplicarTipoRiesgoCliente(Boolean isPermisoDuplicarTipoRiesgoCliente) {
		this.isPermisoDuplicarTipoRiesgoCliente = isPermisoDuplicarTipoRiesgoCliente;
	}
	
	public Boolean getIsPermisoOrdenTipoRiesgoCliente() {
		return isPermisoOrdenTipoRiesgoCliente;
	}

	public void setIsPermisoOrdenTipoRiesgoCliente(Boolean isPermisoOrdenTipoRiesgoCliente) {
		this.isPermisoOrdenTipoRiesgoCliente = isPermisoOrdenTipoRiesgoCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRiesgoCliente() {
		return isVisibilidadCeldaNuevoTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaNuevoTipoRiesgoCliente(Boolean isVisibilidadCeldaNuevoTipoRiesgoCliente) {
		this.isVisibilidadCeldaNuevoTipoRiesgoCliente = isVisibilidadCeldaNuevoTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRiesgoCliente() {
		return isVisibilidadCeldaDuplicarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRiesgoCliente(Boolean isVisibilidadCeldaDuplicarTipoRiesgoCliente) {
		this.isVisibilidadCeldaDuplicarTipoRiesgoCliente = isVisibilidadCeldaDuplicarTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRiesgoCliente() {
		return isVisibilidadCeldaCopiarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaCopiarTipoRiesgoCliente(Boolean isVisibilidadCeldaCopiarTipoRiesgoCliente) {
		this.isVisibilidadCeldaCopiarTipoRiesgoCliente = isVisibilidadCeldaCopiarTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRiesgoCliente() {
		return isVisibilidadCeldaVerFormTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaVerFormTipoRiesgoCliente(Boolean isVisibilidadCeldaVerFormTipoRiesgoCliente) {
		this.isVisibilidadCeldaVerFormTipoRiesgoCliente = isVisibilidadCeldaVerFormTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRiesgoCliente() {
		return isVisibilidadCeldaOrdenTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaOrdenTipoRiesgoCliente(Boolean isVisibilidadCeldaOrdenTipoRiesgoCliente) {
		this.isVisibilidadCeldaOrdenTipoRiesgoCliente = isVisibilidadCeldaOrdenTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente() {
		return isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente(Boolean isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente = isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRiesgoCliente() {
		return isVisibilidadCeldaModificarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaModificarTipoRiesgoCliente(Boolean isVisibilidadCeldaModificarTipoRiesgoCliente) {
		this.isVisibilidadCeldaModificarTipoRiesgoCliente = isVisibilidadCeldaModificarTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRiesgoCliente() {
		return isVisibilidadCeldaActualizarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaActualizarTipoRiesgoCliente(Boolean isVisibilidadCeldaActualizarTipoRiesgoCliente) {
		this.isVisibilidadCeldaActualizarTipoRiesgoCliente = isVisibilidadCeldaActualizarTipoRiesgoCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRiesgoCliente() {
		return isVisibilidadCeldaEliminarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaEliminarTipoRiesgoCliente(Boolean isVisibilidadCeldaEliminarTipoRiesgoCliente) {
		this.isVisibilidadCeldaEliminarTipoRiesgoCliente = isVisibilidadCeldaEliminarTipoRiesgoCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRiesgoCliente() {
		return isVisibilidadCeldaCancelarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaCancelarTipoRiesgoCliente(Boolean isVisibilidadCeldaCancelarTipoRiesgoCliente) {
		this.isVisibilidadCeldaCancelarTipoRiesgoCliente = isVisibilidadCeldaCancelarTipoRiesgoCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRiesgoCliente() {
		return isVisibilidadCeldaGuardarTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaGuardarTipoRiesgoCliente(Boolean isVisibilidadCeldaGuardarTipoRiesgoCliente) {
		this.isVisibilidadCeldaGuardarTipoRiesgoCliente = isVisibilidadCeldaGuardarTipoRiesgoCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRiesgoCliente() {
		return isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRiesgoCliente(Boolean isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente) {
		this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente = isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente;
	}
		
	public TipoRiesgoClienteSessionBean gettiporiesgoclienteSessionBean() {
		return this.tiporiesgoclienteSessionBean;
	}
	
	public void settiporiesgoclienteSessionBean(TipoRiesgoClienteSessionBean tiporiesgoclienteSessionBean) {
		this.tiporiesgoclienteSessionBean=tiporiesgoclienteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporiesgocliente,null);
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
	
	public void bugActualizarReferenciaActual(TipoRiesgoCliente tiporiesgocliente,TipoRiesgoCliente tiporiesgoclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRiesgoCliente(tiporiesgocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporiesgoclienteAux.setId(tiporiesgocliente.getId());
		tiporiesgoclienteAux.setVersionRow(tiporiesgocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRiesgoCliente();
		
			int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporiesgoclienteValidator.getInvalidValues(this.tiporiesgocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporiesgoclienteLogic.setDatosCliente(datosCliente);
			tiporiesgoclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporiesgoclienteAux=new  TipoRiesgoCliente();
				
				tiporiesgoclienteAux.setIsNew(true);
				tiporiesgoclienteAux.setIsChanged(true);
				
				tiporiesgoclienteAux.setTipoRiesgoClienteOriginal(this.tiporiesgocliente);
				
				tiporiesgoclienteAux.setId(this.tiporiesgocliente.getId());	
				tiporiesgoclienteAux.setVersionRow(this.tiporiesgocliente.getVersionRow());	
				tiporiesgoclienteAux.setid_empresa(this.tiporiesgocliente.getid_empresa());	
				tiporiesgoclienteAux.setnombre(this.tiporiesgocliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteLogic.saveTipoRiesgoClientes();//WithConnection
						//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);
					
					this.refrescarForeignKeysDescripcionesTipoRiesgoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporiesgoclienteLogic.saveTipoRiesgoClienteRelaciones(tiporiesgoclienteAux);//WithConnection
								//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporiesgoclienteAux=new  TipoRiesgoCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() && this.tiporiesgocliente.getId()>=0)) {
						
					tiporiesgoclienteAux.setIsNew(false);
				}
				
				tiporiesgoclienteAux.setIsDeleted(false);
			
				tiporiesgoclienteAux.setId(this.tiporiesgocliente.getId());	
				tiporiesgoclienteAux.setVersionRow(this.tiporiesgocliente.getVersionRow());	
				tiporiesgoclienteAux.setid_empresa(this.tiporiesgocliente.getid_empresa());	
				tiporiesgoclienteAux.setnombre(this.tiporiesgocliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteLogic.saveTipoRiesgoClientes();//WithConnection
						//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);
					
					this.refrescarForeignKeysDescripcionesTipoRiesgoCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporiesgoclienteLogic.saveTipoRiesgoClienteRelaciones(tiporiesgoclienteAux);//WithConnection
								//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporiesgocliente,tiporiesgoclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporiesgoclienteAux=new  TipoRiesgoCliente();
				
				tiporiesgoclienteAux.setIsNew(false);
				tiporiesgoclienteAux.setIsChanged(false);
				
				tiporiesgoclienteAux.setIsDeleted(true);
				
				tiporiesgoclienteAux.setId(this.tiporiesgocliente.getId());	
				tiporiesgoclienteAux.setVersionRow(this.tiporiesgocliente.getVersionRow());	
				tiporiesgoclienteAux.setid_empresa(this.tiporiesgocliente.getid_empresa());	
				tiporiesgoclienteAux.setnombre(this.tiporiesgocliente.getnombre());	
				
				if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporiesgoclienteAux.getId()>=0) {	
						this.tiporiesgoclientesEliminados.add(tiporiesgoclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteLogic.saveTipoRiesgoClientes();//WithConnection
						//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporiesgoclienteLogic.saveTipoRiesgoClienteRelaciones(tiporiesgoclienteAux);//WithConnection
								//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
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
							if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporiesgoclienteAux,tiporiesgoclienteLogic.getTipoRiesgoClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporiesgoclienteAux,tiporiesgoclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.getTipoRiesgoClientes().addAll(this.tiporiesgoclientesEliminados);
					
					tiporiesgoclienteLogic.saveTipoRiesgoClientes();//WithConnection
					//tiporiesgoclienteLogic.getSetVersionRowTipoRiesgoClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRiesgoCliente();
				
				this.tiporiesgoclientesEliminados= new ArrayList<TipoRiesgoCliente>();		
			}
			
			if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Riesgo Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporiesgocliente=tiporiesgoclienteAux;
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
      		//this.finishProcessTipoRiesgoCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRiesgoCliente tiporiesgoclienteLocal) throws Exception {
		
		if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRiesgoCliente tiporiesgoclienteLocal) throws Exception {	
		if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporiesgoclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRiesgoClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporiesgoclienteValidator.getInvalidValues(this.tiporiesgocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRiesgoCliente tiporiesgocliente,List<TipoRiesgoCliente> tiporiesgoclientes) throws Exception {
		try	{		
			TipoRiesgoClienteConstantesFunciones.actualizarLista(tiporiesgocliente,tiporiesgoclientes,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRiesgoCliente tiporiesgocliente,List<TipoRiesgoCliente> tiporiesgoclientes) throws Exception {
		try	{			
			TipoRiesgoClienteConstantesFunciones.actualizarSelectedLista(tiporiesgocliente,tiporiesgoclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRiesgoCliente> tiporiesgoclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporiesgoclientesLocal=this.tiporiesgoclienteLogic.getTipoRiesgoClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporiesgoclientesLocal=this.tiporiesgoclientes;
			}
			//ARCHITECTURE
		
			for(TipoRiesgoCliente tiporiesgoclienteLocal:tiporiesgoclientesLocal) {
				if(this.permiteMantenimiento(tiporiesgoclienteLocal) && tiporiesgoclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRiesgoClienteConstantesFunciones.getTipoRiesgoClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRiesgoClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelid_empresaTipoRiesgoCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRiesgoClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelnombreTipoRiesgoCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelid_empresaTipoRiesgoCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelnombreTipoRiesgoCliente,"");
		
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
		this.iIdNuevoTipoRiesgoCliente--;	
		
		
		this.tiporiesgoclienteAux=new TipoRiesgoCliente();
		
		this.tiporiesgoclienteAux.setId(this.iIdNuevoTipoRiesgoCliente);
		this.tiporiesgoclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporiesgoclienteLogic.getTipoRiesgoClientes().add(this.tiporiesgoclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporiesgoclientes.add(this.tiporiesgoclienteAux);
		}
		//ARCHITECTURE
		
		this.tiporiesgocliente=this.tiporiesgoclienteAux;
		
		if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCliente(this.tiporiesgocliente);
		}
				
		//this.setDefaultControlesTipoRiesgoCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRiesgoCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRiesgoCliente(this.tiporiesgoclienteBean,this.tiporiesgocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
			classes=TipoRiesgoClienteConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.procesarEventosTipoRiesgoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this.tiporiesgocliente,this.tiporiesgoclienteParameterGeneral,this.isEsNuevoTipoRiesgoCliente,classes);//this.tiporiesgoclienteLogic.getTipoRiesgoCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral,this.tiporiesgoclienteBean,false);
		
		if(this.tiporiesgoclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente());
		}
		
		if(this.tiporiesgoclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente(),classes);//this.tiporiesgoclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRiesgoCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRiesgoCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.RecargarFormTipoRiesgoCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
						
			if(tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCliente();
			}
			
			this.actualizarVisualTableDatosTipoRiesgoCliente();
			
			this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCliente(), this.getIndiceNuevoTipoRiesgoCliente());
			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
						
			this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRiesgoCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setEnabled(isHabilitar && this.tiporiesgoclienteConstantesFunciones.activarnombreTipoRiesgoCliente);	
		//
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setEnabled(isHabilitar && this.tiporiesgoclienteConstantesFunciones.activarid_empresaTipoRiesgoCliente);
	};
	
	public void setDefaultControlesTipoRiesgoCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRiesgoCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(true);			
			this.tiporiesgoclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.setVisible(true);
			
					
		} else {
			//this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(false);			
			this.tiporiesgoclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoRiesgoCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				if(tiporiesgoclienteAux.getId().equals(this.iIdNuevoTipoRiesgoCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclientes) {
				if(tiporiesgoclienteAux.getId().equals(this.iIdNuevoTipoRiesgoCliente)) {
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
	
	public int getIndiceActualTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				if(tiporiesgoclienteAux.getId().equals(tiporiesgocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclientes) {
				if(tiporiesgoclienteAux.getId().equals(tiporiesgocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRiesgoCliente(TipoRiesgoCliente tiporiesgoclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				if(tiporiesgoclienteAux.getTipoRiesgoClienteOriginal().getId().equals(tiporiesgoclienteOriginal.getId())) {
					existe=true;
					tiporiesgoclienteOriginal.setId(tiporiesgoclienteAux.getId());
					tiporiesgoclienteOriginal.setVersionRow(tiporiesgoclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclientes) {
				if(tiporiesgoclienteAux.getTipoRiesgoClienteOriginal().getId().equals(tiporiesgoclienteOriginal.getId())) {
					existe=true;
					tiporiesgoclienteOriginal.setId(tiporiesgoclienteAux.getId());
					tiporiesgoclienteOriginal.setVersionRow(tiporiesgoclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRiesgoCliente(Boolean esParaCancelar) throws Exception {
		tiporiesgoclientesAux=new ArrayList<TipoRiesgoCliente>();
		tiporiesgoclienteAux=new TipoRiesgoCliente();
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
					if(tiporiesgoclienteAux.getId()<0) {
						tiporiesgoclientesAux.add(tiporiesgoclienteAux);
					}		
				}
				this.iIdNuevoTipoRiesgoCliente=0L;
				this.tiporiesgoclienteLogic.getTipoRiesgoClientes().removeAll(tiporiesgoclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclientes) {
					if(tiporiesgoclienteAux.getId()<0) {
						tiporiesgoclientesAux.add(tiporiesgoclienteAux);
					}		
				}
				this.iIdNuevoTipoRiesgoCliente=0L;
				this.tiporiesgoclientes.removeAll(tiporiesgoclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRiesgoCliente 
					&& this.tiporiesgoclienteLogic.getTipoRiesgoClientes().size()>0
					) {
					tiporiesgoclienteAux=this.tiporiesgoclienteLogic.getTipoRiesgoClientes().get(this.tiporiesgoclienteLogic.getTipoRiesgoClientes().size() - 1);
				
					if(tiporiesgoclienteAux.getId()<0) {
						this.tiporiesgoclienteLogic.getTipoRiesgoClientes().remove(tiporiesgoclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRiesgoCliente && this.tiporiesgoclientes.size()>0) {
					tiporiesgoclienteAux=this.tiporiesgoclientes.get(this.tiporiesgoclientes.size() - 1);
				
					if(tiporiesgoclienteAux.getId()<0) {
						this.tiporiesgoclientes.remove(tiporiesgoclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRiesgoCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporiesgocliente.getId()<0) {
				this.tiporiesgoclienteLogic.getTipoRiesgoClientes().remove(this.tiporiesgocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporiesgocliente.getId()<0) {
				this.tiporiesgoclientes.remove(this.tiporiesgocliente);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRiesgoCliente(List<TipoRiesgoCliente> tiporiesgoclientesAux) throws Exception {
		TipoRiesgoClienteConstantesFunciones.setEstadosInicialesTipoRiesgoCliente(tiporiesgoclientesAux);
	}
	
	public void setEstadosInicialesTipoRiesgoCliente(TipoRiesgoCliente tiporiesgoclienteAux) throws Exception {
		TipoRiesgoClienteConstantesFunciones.setEstadosInicialesTipoRiesgoCliente(tiporiesgoclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRiesgoClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRiesgoClienteActual()) {
				if(!this.isEsNuevoTipoRiesgoCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRiesgoCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRiesgoClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Riesgo Cliente ?", "MANTENIMIENTO DE Tipo Riesgo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRiesgoCliente tiporiesgocliente) throws Exception {
		TipoRiesgoClienteConstantesFunciones.seleccionarAsignar(this.tiporiesgocliente,tiporiesgocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRiesgoCliente=this.isPermisoActualizarOriginalTipoRiesgoCliente;
			
			
			this.seleccionarAsignar(tiporiesgocliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRiesgoClienteConstantesFunciones.quitarEspaciosTipoRiesgoCliente(this.tiporiesgocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporiesgoclienteSessionBean.setsFuncionBusquedaRapida(this.tiporiesgoclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRiesgoCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRiesgoCliente(esParaCancelar);				
				this.cancelarNuevoTipoRiesgoCliente(esParaCancelar);								
			}
			
			this.tiporiesgocliente=new TipoRiesgoCliente();
			
			this.inicializarTipoRiesgoCliente();
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRiesgoCliente() throws Exception {
		try {
			TipoRiesgoClienteConstantesFunciones.inicializarTipoRiesgoCliente(this.tiporiesgocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporiesgoclienteLogic.getTipoRiesgoClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRiesgoClientes(String sAccionBusqueda,List<TipoRiesgoCliente> tiporiesgoclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRiesgoCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRiesgoClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRiesgoClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRiesgoCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Riesgo Clientes");		
		parameters.put("busquedapor", TipoRiesgoClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRiesgoCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRiesgoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRiesgoClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRiesgoCliente=new JRBeanArrayDataSource(TipoRiesgoClienteJInternalFrame.TraerTipoRiesgoClienteBeans(tiporiesgoclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRiesgoCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRiesgoClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRiesgoClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRiesgoClienteBean.TraerTipoRiesgoClienteBeans(tiporiesgoclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRiesgoClienteActionPerformed(null);
					//this.generarExcelReporteTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRiesgoClientes(sAccionBusqueda,sTipoArchivoReporte,tiporiesgoclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRiesgoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCliente> tiporiesgoclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRiesgoCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRiesgoCliente tiporiesgocliente : tiporiesgoclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRiesgoClienteConstantesFunciones.generarExcelReporteDataTipoRiesgoCliente("NORMAL",row,workbook,tiporiesgocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRiesgoCliente(String sTipo,Row row,Workbook workbook) {
		
		TipoRiesgoClienteConstantesFunciones.generarExcelReporteHeaderTipoRiesgoCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRiesgoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCliente> tiporiesgoclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRiesgoCliente tiporiesgocliente : tiporiesgoclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRiesgoClienteConstantesFunciones.getTipoRiesgoClienteDescripcion(tiporiesgocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporiesgocliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporiesgocliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRiesgoClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRiesgoCliente> tiporiesgoclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRiesgoCliente> tiporiesgoclientesRespaldo=null;
		
		classes=TipoRiesgoClienteConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporiesgoclienteLogic.setDatosCliente(this.datosCliente);
		this.tiporiesgoclienteLogic.setDatosDeep(this.datosDeep);
		this.tiporiesgoclienteLogic.setIsConDeep(true);
		
		tiporiesgoclientesRespaldo=this.tiporiesgoclienteLogic.getTipoRiesgoClientes();
		
		this.tiporiesgoclienteLogic.setTipoRiesgoClientes(tiporiesgoclientesParaReportes);	
		this.tiporiesgoclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporiesgoclientesParaReportes=this.tiporiesgoclienteLogic.getTipoRiesgoClientes();
		this.tiporiesgoclienteLogic.setTipoRiesgoClientes(tiporiesgoclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRiesgoClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRiesgoCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRiesgoCliente tiporiesgocliente : tiporiesgoclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRiesgoCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRiesgoClienteConstantesFunciones.generarExcelReporteDataTipoRiesgoCliente("NORMAL",row,workbook,tiporiesgocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRiesgoClienteConstantesFunciones.getTipoRiesgoClienteDescripcion(tiporiesgocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRiesgoCliente() throws Exception {		
		this.startProcessTipoRiesgoCliente(true);
	}
	
	public void startProcessTipoRiesgoCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRiesgoCliente ,this.jPanelParametrosReportesTipoRiesgoCliente, this.jScrollPanelDatosTipoRiesgoCliente,this.jPanelPaginacionTipoRiesgoCliente, this.jScrollPanelDatosEdicionTipoRiesgoCliente, this.jPanelAccionesTipoRiesgoCliente,this.jPanelAccionesFormularioTipoRiesgoCliente,this.jmenuBarTipoRiesgoCliente,this.jmenuBarDetalleTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRiesgoCliente=this.jTabbedPaneBusquedasTipoRiesgoCliente; 
		
		final JPanel jPanelParametrosReportesTipoRiesgoCliente=this.jPanelParametrosReportesTipoRiesgoCliente;
		//final JScrollPane jScrollPanelDatosTipoRiesgoCliente=this.jScrollPanelDatosTipoRiesgoCliente;
		final JTable jTableDatosTipoRiesgoCliente=this.jTableDatosTipoRiesgoCliente;		
		final JPanel jPanelPaginacionTipoRiesgoCliente=this.jPanelPaginacionTipoRiesgoCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoRiesgoCliente=this.jScrollPanelDatosEdicionTipoRiesgoCliente;
		final JPanel jPanelAccionesTipoRiesgoCliente=this.jPanelAccionesTipoRiesgoCliente;
		
		JPanel jPanelCamposAuxiliarTipoRiesgoCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRiesgoCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			jPanelCamposAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelCamposTipoRiesgoCliente;
			jPanelAccionesFormularioAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelAccionesFormularioTipoRiesgoCliente;
		}
		
		final JPanel jPanelCamposTipoRiesgoCliente=jPanelCamposAuxiliarTipoRiesgoCliente;
		final JPanel jPanelAccionesFormularioTipoRiesgoCliente=jPanelAccionesFormularioAuxiliarTipoRiesgoCliente;
		
		
		final JMenuBar jmenuBarTipoRiesgoCliente=this.jmenuBarTipoRiesgoCliente;
		final JToolBar jTtoolBarTipoRiesgoCliente=this.jTtoolBarTipoRiesgoCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRiesgoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRiesgoCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			jmenuBarDetalleAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jmenuBarDetalleTipoRiesgoCliente;
			jTtoolBarDetalleAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jTtoolBarDetalleTipoRiesgoCliente;
		}
		
		final JMenuBar jmenuBarDetalleTipoRiesgoCliente=jmenuBarDetalleAuxiliarTipoRiesgoCliente;
		final JToolBar jTtoolBarDetalleTipoRiesgoCliente=jTtoolBarDetalleAuxiliarTipoRiesgoCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRiesgoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRiesgoCliente;
			processRunnable.jTableDatos=jTableDatosTipoRiesgoCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoRiesgoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRiesgoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRiesgoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRiesgoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRiesgoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRiesgoCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoRiesgoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRiesgoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRiesgoCliente ,jPanelParametrosReportesTipoRiesgoCliente,jTableDatosTipoRiesgoCliente, /*jScrollPanelDatosTipoRiesgoCliente,*/jPanelCamposTipoRiesgoCliente,jPanelPaginacionTipoRiesgoCliente, /*jScrollPanelDatosEdicionTipoRiesgoCliente,*/ jPanelAccionesTipoRiesgoCliente,jPanelAccionesFormularioTipoRiesgoCliente,jmenuBarTipoRiesgoCliente,jmenuBarDetalleTipoRiesgoCliente,jTtoolBarTipoRiesgoCliente,jTtoolBarDetalleTipoRiesgoCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRiesgoCliente ,jPanelParametrosReportesTipoRiesgoCliente, jScrollPanelDatosTipoRiesgoCliente,jPanelPaginacionTipoRiesgoCliente, jScrollPanelDatosEdicionTipoRiesgoCliente, jPanelAccionesTipoRiesgoCliente,jPanelAccionesFormularioTipoRiesgoCliente,jmenuBarTipoRiesgoCliente,jmenuBarDetalleTipoRiesgoCliente,jTtoolBarTipoRiesgoCliente,jTtoolBarDetalleTipoRiesgoCliente);
						
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
	
	public void finishProcessTipoRiesgoCliente() {// throws Exception 
		this.finishProcessTipoRiesgoCliente(true);
	}
	
	public void finishProcessTipoRiesgoCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRiesgoCliente ,this.jPanelParametrosReportesTipoRiesgoCliente, this.jScrollPanelDatosTipoRiesgoCliente,this.jPanelPaginacionTipoRiesgoCliente, this.jScrollPanelDatosEdicionTipoRiesgoCliente, this.jPanelAccionesTipoRiesgoCliente,this.jPanelAccionesFormularioTipoRiesgoCliente,this.jmenuBarTipoRiesgoCliente,this.jmenuBarDetalleTipoRiesgoCliente,this.jTtoolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRiesgoCliente=this.jTabbedPaneBusquedasTipoRiesgoCliente; 
		
		final JPanel jPanelParametrosReportesTipoRiesgoCliente=this.jPanelParametrosReportesTipoRiesgoCliente;
		//final JScrollPane jScrollPanelDatosTipoRiesgoCliente=this.jScrollPanelDatosTipoRiesgoCliente;
		final JTable jTableDatosTipoRiesgoCliente=this.jTableDatosTipoRiesgoCliente;		
		final JPanel jPanelPaginacionTipoRiesgoCliente=this.jPanelPaginacionTipoRiesgoCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoRiesgoCliente=this.jScrollPanelDatosEdicionTipoRiesgoCliente;
		final JPanel jPanelAccionesTipoRiesgoCliente=this.jPanelAccionesTipoRiesgoCliente;
		
		JPanel jPanelCamposAuxiliarTipoRiesgoCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRiesgoCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			jPanelCamposAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelCamposTipoRiesgoCliente;
			jPanelAccionesFormularioAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelAccionesFormularioTipoRiesgoCliente;
		}
		
		final JPanel jPanelCamposTipoRiesgoCliente=jPanelCamposAuxiliarTipoRiesgoCliente;
		final JPanel jPanelAccionesFormularioTipoRiesgoCliente=jPanelAccionesFormularioAuxiliarTipoRiesgoCliente;
		
		
		final JMenuBar jmenuBarTipoRiesgoCliente=this.jmenuBarTipoRiesgoCliente;		
		final JToolBar jTtoolBarTipoRiesgoCliente=this.jTtoolBarTipoRiesgoCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRiesgoCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRiesgoCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			jmenuBarDetalleAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jmenuBarDetalleTipoRiesgoCliente;
			jTtoolBarDetalleAuxiliarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jTtoolBarDetalleTipoRiesgoCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRiesgoCliente=jmenuBarDetalleAuxiliarTipoRiesgoCliente;
		final JToolBar jTtoolBarDetalleTipoRiesgoCliente=jTtoolBarDetalleAuxiliarTipoRiesgoCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRiesgoCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRiesgoCliente;
			processRunnable.jTableDatos=jTableDatosTipoRiesgoCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoRiesgoCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRiesgoCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRiesgoCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRiesgoCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRiesgoCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRiesgoCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoRiesgoCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRiesgoCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRiesgoCliente ,jPanelParametrosReportesTipoRiesgoCliente, jTableDatosTipoRiesgoCliente,/*jScrollPanelDatosTipoRiesgoCliente,*/jPanelCamposTipoRiesgoCliente,jPanelPaginacionTipoRiesgoCliente, /*jScrollPanelDatosEdicionTipoRiesgoCliente,*/ jPanelAccionesTipoRiesgoCliente,jPanelAccionesFormularioTipoRiesgoCliente,jmenuBarTipoRiesgoCliente,jmenuBarDetalleTipoRiesgoCliente,jTtoolBarTipoRiesgoCliente,jTtoolBarDetalleTipoRiesgoCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRiesgoCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRiesgoCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRiesgoCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRiesgoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRiesgoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRiesgoCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRiesgoCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRiesgoCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRiesgoCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporiesgoclienteConstantesFunciones.getsFinalQueryTipoRiesgoCliente();
		String  finalQueryPaginacionTodos=this.tiporiesgoclienteConstantesFunciones.getsFinalQueryTipoRiesgoCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRiesgoClienteConstantesFunciones.getArrayColumnasGlobalesNoTipoRiesgoCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRiesgoClienteConstantesFunciones.getArrayColumnasGlobalesTipoRiesgoCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRiesgoClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporiesgoclientesEliminados= new ArrayList<TipoRiesgoCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRiesgoCliente();
		
				///*TipoRiesgoClienteSessionBean*/this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
			
			if(this.tiporiesgoclienteSessionBean==null) {
				this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
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
					this.iNumeroPaginacion=TipoRiesgoClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRiesgoClienteConstantesFunciones.getClassesForeignKeysOfTipoRiesgoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporiesgocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporiesgoclientesAux= new ArrayList<TipoRiesgoCliente>();
			
				
			tiporiesgoclienteLogic.setDatosCliente(this.datosCliente);
			tiporiesgoclienteLogic.setDatosDeep(this.datosDeep);
			tiporiesgoclienteLogic.setIsConDeep(true);
			
			
			tiporiesgoclienteLogic.getTipoRiesgoClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporiesgoclienteLogic.getTodosTipoRiesgoClientes(finalQueryGlobal,pagination);
					
					//tiporiesgoclienteLogic.getTodosTipoRiesgoClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporiesgoclienteLogic.getTipoRiesgoClientes()==null|| tiporiesgoclienteLogic.getTipoRiesgoClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgoclientesAux= new ArrayList<TipoRiesgoCliente>();
							tiporiesgoclientesAux.addAll(tiporiesgoclienteLogic.getTipoRiesgoClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgoclientesAux= new ArrayList<TipoRiesgoCliente>();
							tiporiesgoclientesAux.addAll(tiporiesgoclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgoclienteLogic.getTodosTipoRiesgoClientes(finalQueryGlobal+"",this.pagination);												
							
							//tiporiesgoclienteLogic.getTodosTipoRiesgoClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclienteLogic.getTipoRiesgoClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporiesgoclienteLogic.setTipoRiesgoClientes(new ArrayList<TipoRiesgoCliente>());					
							tiporiesgoclienteLogic.getTipoRiesgoClientes().addAll(tiporiesgoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgoclientes=new ArrayList<TipoRiesgoCliente>();
							tiporiesgoclientes.addAll(tiporiesgoclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRiesgoCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRiesgoCliente=this.idActual;
				
				} else if(this.idTipoRiesgoClienteActual!=null && this.idTipoRiesgoClienteActual!=0L) {
					idTipoRiesgoCliente=idTipoRiesgoClienteActual;
				}
				
					
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndicePorId(idTipoRiesgoCliente);
				
				this.tiporiesgoclientes=new ArrayList<TipoRiesgoCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporiesgoclienteLogic.getEntity(idTipoRiesgoCliente);
					
					//tiporiesgoclienteLogic.getEntityWithConnection(idTipoRiesgoCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporiesgoclienteLogic.setTipoRiesgoClientes(new ArrayList<TipoRiesgoCliente>());
					tiporiesgoclienteLogic.getTipoRiesgoClientes().add(tiporiesgoclienteLogic.getTipoRiesgoCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporiesgoclientes=new ArrayList<TipoRiesgoCliente>();
					this.tiporiesgoclientes.add(tiporiesgocliente);
				}
				
				if(tiporiesgoclienteLogic.getTipoRiesgoCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporiesgoclienteLogic.getTipoRiesgoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporiesgoclienteLogic.getTipoRiesgoClientes()==null||tiporiesgoclienteLogic.getTipoRiesgoClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporiesgoclientes==null|| tiporiesgoclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclientesAux=new ArrayList<TipoRiesgoCliente>();
						tiporiesgoclientesAux.addAll(tiporiesgoclienteLogic.getTipoRiesgoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgoclientesAux=new ArrayList<TipoRiesgoCliente>();
							tiporiesgoclientesAux.addAll(tiporiesgoclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporiesgoclienteLogic.getTipoRiesgoClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRiesgoClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRiesgoClientes("FK_IdEmpresa",tiporiesgoclienteLogic.getTipoRiesgoClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRiesgoClientes("FK_IdEmpresa",tiporiesgoclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteLogic.setTipoRiesgoClientes(new ArrayList<TipoRiesgoCliente>());
						tiporiesgoclienteLogic.getTipoRiesgoClientes().addAll(tiporiesgoclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgoclientes=new ArrayList<TipoRiesgoCliente>();
							tiporiesgoclientes.addAll(tiporiesgoclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRiesgoCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRiesgoCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporiesgoclienteLogic.getTipoRiesgoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgoclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporiesgoclienteLogic.getTipoRiesgoClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporiesgoclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRiesgoCliente tiporiesgocliente) {
		Boolean permite=true;
		
		if(this.tiporiesgocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRiesgoClienteConstantesFunciones.getOrderByListaTipoRiesgoCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRiesgoClienteConstantesFunciones.getOrderByListaTipoRiesgoCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCliente tiporiesgocliente:tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				if(tiporiesgocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgoclienteTotales=tiporiesgocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCliente tiporiesgocliente:this.tiporiesgoclientes) {
				if(tiporiesgocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgoclienteTotales=tiporiesgocliente;
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
			this.tiporiesgoclienteAux=new TipoRiesgoCliente();
			this.tiporiesgoclienteAux.setsType(Constantes2.S_TOTALES);
			this.tiporiesgoclienteAux.setIsNew(false);
			this.tiporiesgoclienteAux.setIsChanged(false);
			this.tiporiesgoclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRiesgoClienteConstantesFunciones.TotalizarValoresFilaTipoRiesgoCliente(this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this.tiporiesgoclienteAux);
				
				this.tiporiesgoclienteLogic.getTipoRiesgoClientes().add(this.tiporiesgoclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRiesgoClienteConstantesFunciones.TotalizarValoresFilaTipoRiesgoCliente(this.tiporiesgoclientes,this.tiporiesgoclienteAux);
				
				this.tiporiesgoclientes.add(this.tiporiesgoclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporiesgoclienteTotales=new TipoRiesgoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporiesgoclienteLogic.getTipoRiesgoClientes().remove(tiporiesgoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporiesgoclientes.remove(tiporiesgoclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporiesgoclienteTotales=new TipoRiesgoCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRiesgoCliente tiporiesgocliente:tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				if(tiporiesgocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgoclienteTotales=tiporiesgocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRiesgoClienteConstantesFunciones.TotalizarValoresFilaTipoRiesgoCliente(this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),tiporiesgoclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRiesgoCliente tiporiesgocliente:this.tiporiesgoclientes) {
				if(tiporiesgocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tiporiesgoclienteTotales=tiporiesgocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRiesgoClienteConstantesFunciones.TotalizarValoresFilaTipoRiesgoCliente(this.tiporiesgoclientes,tiporiesgoclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRiesgoClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRiesgoClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporiesgoclienteLogic.getTipoRiesgoClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoRiesgoCliente() {
		this.isPermisoTodoTipoRiesgoCliente=false;
		this.isPermisoNuevoTipoRiesgoCliente=false;
		this.isPermisoActualizarTipoRiesgoCliente=false;
		this.isPermisoActualizarOriginalTipoRiesgoCliente=false;
		this.isPermisoEliminarTipoRiesgoCliente=false;
		this.isPermisoGuardarCambiosTipoRiesgoCliente=false;
		this.isPermisoConsultaTipoRiesgoCliente=false;
		this.isPermisoBusquedaTipoRiesgoCliente=false;
		this.isPermisoReporteTipoRiesgoCliente=false;		
		this.isPermisoOrdenTipoRiesgoCliente=false;		
		this.isPermisoPaginacionMedioTipoRiesgoCliente=false;		
		this.isPermisoPaginacionAltoTipoRiesgoCliente=false;
		this.isPermisoPaginacionTodoTipoRiesgoCliente=false;
		this.isPermisoCopiarTipoRiesgoCliente=false;		
		this.isPermisoVerFormTipoRiesgoCliente=false;		
		this.isPermisoDuplicarTipoRiesgoCliente=false;		
		this.isPermisoOrdenTipoRiesgoCliente=false;		
	}
	
	public void setPermisosUsuarioTipoRiesgoCliente(Boolean isPermiso) {
		this.isPermisoTodoTipoRiesgoCliente=isPermiso;
		this.isPermisoNuevoTipoRiesgoCliente=isPermiso;
		this.isPermisoActualizarTipoRiesgoCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoRiesgoCliente=isPermiso;
		this.isPermisoEliminarTipoRiesgoCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoRiesgoCliente=isPermiso;
		this.isPermisoConsultaTipoRiesgoCliente=isPermiso;
		this.isPermisoBusquedaTipoRiesgoCliente=isPermiso;
		this.isPermisoReporteTipoRiesgoCliente=isPermiso;
		this.isPermisoOrdenTipoRiesgoCliente=isPermiso;		
		this.isPermisoPaginacionMedioTipoRiesgoCliente=isPermiso;		
		this.isPermisoPaginacionAltoTipoRiesgoCliente=isPermiso;		
		this.isPermisoPaginacionTodoTipoRiesgoCliente=isPermiso;		
		this.isPermisoCopiarTipoRiesgoCliente=isPermiso;		
		this.isPermisoVerFormTipoRiesgoCliente=isPermiso;		
		this.isPermisoDuplicarTipoRiesgoCliente=isPermiso;
		this.isPermisoOrdenTipoRiesgoCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRiesgoCliente(Boolean isPermiso) {
		//this.isPermisoTodoTipoRiesgoCliente=isPermiso;
		this.isPermisoNuevoTipoRiesgoCliente=isPermiso;
		this.isPermisoActualizarTipoRiesgoCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoRiesgoCliente=isPermiso;
		this.isPermisoEliminarTipoRiesgoCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoRiesgoCliente=isPermiso;
		//this.isPermisoConsultaTipoRiesgoCliente=isPermiso;
		//this.isPermisoBusquedaTipoRiesgoCliente=isPermiso;
		//this.isPermisoReporteTipoRiesgoCliente=isPermiso;
		//this.isPermisoOrdenTipoRiesgoCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRiesgoCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRiesgoCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRiesgoCliente=isPermiso;		
		//this.isPermisoCopiarTipoRiesgoCliente=isPermiso;		
		//this.isPermisoDuplicarTipoRiesgoCliente=isPermiso;
		//this.isPermisoOrdenTipoRiesgoCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRiesgoClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoRiesgoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRiesgoCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRiesgoClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRiesgoClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRiesgoClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRiesgoClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoRiesgoCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRiesgoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRiesgoClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRiesgoCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRiesgoCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRiesgoCliente=this.isPermisoActualizarTipoRiesgoCliente;
			this.isPermisoEliminarTipoRiesgoCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRiesgoCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRiesgoCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRiesgoCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRiesgoCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRiesgoCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRiesgoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRiesgoCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRiesgoCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRiesgoCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRiesgoCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRiesgoCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRiesgoCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRiesgoCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRiesgoCliente.setToolTipText(this.jTableDatosTipoRiesgoCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRiesgoCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRiesgoCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRiesgoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRiesgoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRiesgoCliente() throws Exception {
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
	public void inicializarCombosForeignKeyTipoRiesgoClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRiesgoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRiesgoClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRiesgoClienteListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoRiesgoClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteReturnGeneral=new TipoRiesgoClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporiesgoclienteConstantesFunciones.cargarid_empresaTipoRiesgoCliente)
					 || (this.esRecargarFks && this.tiporiesgoclienteConstantesFunciones.cargarid_empresaTipoRiesgoCliente)) {

					if(!this.tiporiesgoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporiesgoclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.cargarCombosLoteForeignKeyTipoRiesgoCliente(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporiesgoclienteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRiesgoCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporiesgoclienteSessionBean==null) {
				this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
			}

			if(!this.tiporiesgoclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRiesgoCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRiesgoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRiesgoCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRiesgoCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRiesgoCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRiesgoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRiesgoCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRiesgoCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRiesgoCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRiesgoCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRiesgoCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente!=null && this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoRiesgoClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRiesgoClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRiesgoClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean(); 
		this.tiporiesgoclienteConstantesFunciones=new TipoRiesgoClienteConstantesFunciones(); 
		this.tiporiesgoclienteBean=new TipoRiesgoCliente();//(this.tiporiesgoclienteConstantesFunciones); 		
		this.tiporiesgoclienteReturnGeneral=new TipoRiesgoClienteParameterReturnGeneral(); 
		
		this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRiesgoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRiesgoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRiesgoClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRiesgoCliente(true);
			
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
			
			this.tiporiesgoclienteConstantesFunciones=new TipoRiesgoClienteConstantesFunciones(); 
			this.tiporiesgoclienteBean=new TipoRiesgoCliente();//this.tiporiesgoclienteConstantesFunciones); 			
			this.tiporiesgoclienteReturnGeneral=new TipoRiesgoClienteParameterReturnGeneral(); 
		
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Riesgo Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporiesgocliente=new TipoRiesgoCliente();
			this.tiporiesgoclientes = new ArrayList<TipoRiesgoCliente>();
			this.tiporiesgoclientesAux = new ArrayList<TipoRiesgoCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic=new TipoRiesgoClienteLogic();
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporiesgoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRiesgoCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRiesgoCliente);	
					}
					
					if(this.jInternalFrameImportacionTipoRiesgoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRiesgoCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRiesgoCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRiesgoCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRiesgoCliente);
				this.jInternalFrameDetalleFormTipoRiesgoCliente.setVisible(false);
				this.jInternalFrameDetalleFormTipoRiesgoCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRiesgoCliente);
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRiesgoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRiesgoCliente);
					this.jInternalFrameImportacionTipoRiesgoCliente.setVisible(false);
					this.jInternalFrameImportacionTipoRiesgoCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRiesgoCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRiesgoCliente);
					this.jInternalFrameOrderByTipoRiesgoCliente.setVisible(false);
					this.jInternalFrameOrderByTipoRiesgoCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRiesgoClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRiesgoClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporiesgoclienteReturnGeneral=new TipoRiesgoClienteParameterReturnGeneral();
			
			this.tiporiesgoclienteParameterGeneral=new TipoRiesgoClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporiesgoclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRiesgoClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRiesgoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado(),this.tiporiesgoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRiesgoClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado(),this.tiporiesgoclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaDuplicarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaCopiarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaVerFormTipoRiesgoCliente=true;
			this.isVisibilidadCeldaOrdenTipoRiesgoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRiesgoCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRiesgoCliente(false);
			
			this.setPermisosUsuarioTipoRiesgoCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() && this.tiporiesgoclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRiesgoClienteClasesRelacionadas();
			}
			
			if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRiesgoClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRiesgoCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCliente();
			}
			
			if(!this.isPermisoBusquedaTipoRiesgoCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRiesgoCliente,this.isPermisoPaginacionMedioTipoRiesgoCliente,this.isPermisoPaginacionTodoTipoRiesgoCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRiesgoClienteConstantesFunciones.getTiposSeleccionarTipoRiesgoCliente());
				
				this.tiposColumnasSelect=TipoRiesgoClienteConstantesFunciones.getTiposSeleccionarTipoRiesgoCliente(true);
				
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
			//if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRiesgoCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRiesgoCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRiesgoCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCliente() ;
			
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
				tiporiesgoclienteImplementable= (TipoRiesgoClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRiesgoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporiesgoclienteImplementableHome= (TipoRiesgoClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRiesgoClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporiesgoclientes= new ArrayList<TipoRiesgoCliente>();
			this.tiporiesgoclientesEliminados= new ArrayList<TipoRiesgoCliente>();
						
			this.isEsNuevoTipoRiesgoCliente=false;
			this.esParaAccionDesdeFormularioTipoRiesgoCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRiesgoCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRiesgoCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRiesgoClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRiesgoCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRiesgoCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRiesgoCliente();
			}
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRiesgoCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRiesgoCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRiesgoCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRiesgoCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRiesgoCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRiesgoCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRiesgoCliente")) {
				iIndex=this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRiesgoCliente();	
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
	
	public void cargarCombosForeignKeyTipoRiesgoCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRiesgoCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRiesgoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRiesgoClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRiesgoCliente();
		
		this.cargarCombosFrameForeignKeyTipoRiesgoCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRiesgoCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCliente();
		}
	}
	
	
	
	public void jButtonNuevoTipoRiesgoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			
			if(jTableDatosTipoRiesgoCliente.getRowCount()>=1) {
				jTableDatosTipoRiesgoCliente.removeRowSelectionInterval(0, jTableDatosTipoRiesgoCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRiesgoCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRiesgoCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRiesgoCliente(true);			
			//this.tiporiesgocliente=new TipoRiesgoCliente();
			//this.tiporiesgocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente() ;
			
			if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporiesgocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);				
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRiesgoCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRiesgoClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRiesgoCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRiesgoCliente.getSelectedRows().length;			
			}
			
			tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRiesgoCliente--;			
				//TipoRiesgoCliente tiporiesgoclienteAux= new TipoRiesgoCliente();			
				//tiporiesgoclienteAux.setId(this.iIdNuevoTipoRiesgoCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRiesgoCliente tiporiesgoclienteOrigen=new TipoRiesgoCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRiesgoCliente tiporiesgoclienteOrigen : tiporiesgoclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporiesgoclienteOrigen =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporiesgoclienteOrigen =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRiesgoCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporiesgocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRiesgoCliente(tiporiesgoclienteOrigen,this.tiporiesgocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporiesgoclienteLogic.getTipoRiesgoClientes().add(this.tiporiesgoclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporiesgoclientes.add(this.tiporiesgoclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
				
				this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCliente(), this.getIndiceNuevoTipoRiesgoCliente());
				
				int iLastRow =  this.jTableDatosTipoRiesgoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRiesgoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRiesgoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();									
		
			TipoRiesgoCliente tiporiesgoclienteOrigen=new TipoRiesgoCliente();
			TipoRiesgoCliente tiporiesgoclienteDestino=new TipoRiesgoCliente();
				
			tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRiesgoCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporiesgoclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRiesgoCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteOrigen =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporiesgoclienteOrigen =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporiesgoclienteDestino =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporiesgoclienteDestino =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporiesgoclienteOrigen =tiporiesgoclientesSeleccionados.get(0);
				tiporiesgoclienteDestino =tiporiesgoclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRiesgoCliente(tiporiesgoclienteOrigen,tiporiesgoclienteDestino,true,false);
				
				tiporiesgoclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporiesgoclienteDestino,tiporiesgoclienteLogic.getTipoRiesgoClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporiesgoclienteDestino,tiporiesgoclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
				
				//this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCliente(), this.getIndiceNuevoTipoRiesgoCliente());
				
				int iLastRow =  this.jTableDatosTipoRiesgoCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRiesgoCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRiesgoCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRiesgoCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(!isVisible);
			this.jPanelPaginacionTipoRiesgoCliente.setVisible(!isVisible);
			this.jPanelAccionesTipoRiesgoCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRiesgoCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRiesgoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRiesgoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRiesgoCliente();
			
			this.abrirFrameOrderByTipoRiesgoCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRiesgoCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRiesgoCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRiesgoCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRiesgoCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRiesgoCliente.setSize(this.jInternalFrameDetalleFormTipoRiesgoCliente.iWidthFormulario,this.jInternalFrameDetalleFormTipoRiesgoCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRiesgoCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRiesgoCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRiesgoCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRiesgoCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCliente.jContentPaneDetalleTipoRiesgoCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCliente.jContentPaneDetalleTipoRiesgoCliente.getWidth(),TipoRiesgoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCliente.jContentPaneDetalleTipoRiesgoCliente.getWidth(),TipoRiesgoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRiesgoCliente.jContentPaneDetalleTipoRiesgoCliente.getWidth(),TipoRiesgoClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRiesgoCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRiesgoCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRiesgoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRiesgoCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRiesgoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCliente,false,this);
				} else {
					this.jInternalFrameOrderByTipoRiesgoCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRiesgoCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRiesgoCliente);
				this.jInternalFrameOrderByTipoRiesgoCliente.setVisible(false);
				this.jInternalFrameOrderByTipoRiesgoCliente.setSelected(false);
				
				this.jInternalFrameOrderByTipoRiesgoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRiesgoCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRiesgoCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRiesgoCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRiesgoCliente==null) {
				
				this.jInternalFrameImportacionTipoRiesgoCliente=new ImportacionJInternalFrame(TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRiesgoCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRiesgoCliente);
				this.jInternalFrameImportacionTipoRiesgoCliente.setVisible(false);
				this.jInternalFrameImportacionTipoRiesgoCliente.setSelected(false);


				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRiesgoCliente"));
				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRiesgoCliente"));
				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRiesgoCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRiesgoCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente==null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente=new ReporteDinamicoJInternalFrame(TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRiesgoCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRiesgoCliente);
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCliente"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCliente"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoRiesgoCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRiesgoCliente);
			
	       	this.jInternalFrameDetalleFormTipoRiesgoCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRiesgoCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRiesgoCliente.dispose();
			//this.jInternalFrameDetalleFormTipoRiesgoCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRiesgoCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRiesgoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRiesgoCliente.setVisible(true);
	        this.jInternalFrameImportacionTipoRiesgoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRiesgoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRiesgoCliente.setVisible(true);
	        this.jInternalFrameOrderByTipoRiesgoCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRiesgoCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRiesgoCliente.setVisible(false);
	        this.jInternalFrameOrderByTipoRiesgoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRiesgoCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRiesgoCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRiesgoCliente.setVisible(false);
	        this.jInternalFrameImportacionTipoRiesgoCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRiesgoCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRiesgoCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRiesgoCliente(true);
			//this.isEsNuevoTipoRiesgoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false) ;
			
			if(tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRiesgoClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRiesgoCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRiesgoCliente(true);
			//this.isEsNuevoTipoRiesgoCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporiesgocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false) ;
			
			if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRiesgoCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRiesgoCliente(false);
			
			//if(!this.isEsNuevoTipoRiesgoCliente) {								
				int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
				
			}
			
			if(this.permiteMantenimiento(this.tiporiesgocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRiesgoCliente=true;
					this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
					this.isEsNuevoTipoRiesgoCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRiesgoCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRiesgoCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(false);
				
				this.habilitarDeshabilitarControlesTipoRiesgoCliente(false);
			
												
				
				if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRiesgoCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRiesgoClienteActionPerformed(evt,tiporiesgoclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRiesgoCliente(this.tiporiesgocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporiesgoclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporiesgocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				this.tiporiesgocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				this.tiporiesgocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporiesgocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRiesgoClienteModel) this.jTableDatosTipoRiesgoCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRiesgoCliente=true;
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
				this.isEsNuevoTipoRiesgoCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(false);
				
				this.habilitarDeshabilitarControlesTipoRiesgoCliente(false);
				
				
				
				if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRiesgoCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRiesgoCliente.getRowCount()>=1) {
				jTableDatosTipoRiesgoCliente.removeRowSelectionInterval(0, jTableDatosTipoRiesgoCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRiesgoCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(false) ;
			
			this.isEsNuevoTipoRiesgoCliente=false;
			
			if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRiesgoCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRiesgoCliente(false);
				
				//SI ES MANUAL
				if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRiesgoCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRiesgoCliente--;			
			//TipoRiesgoCliente tiporiesgoclienteAux= new TipoRiesgoCliente();			
			//tiporiesgoclienteAux.setId(this.iIdNuevoTipoRiesgoCliente);
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRiesgoCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
			
			this.tiporiesgocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporiesgoclienteLogic.getTipoRiesgoClientes().add(this.tiporiesgoclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporiesgoclientes.add(this.tiporiesgoclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			
			this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(this.getIndiceNuevoTipoRiesgoCliente(), this.getIndiceNuevoTipoRiesgoCliente());
			
			int iLastRow =  this.jTableDatosTipoRiesgoCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRiesgoCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRiesgoCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
			
			//SI ES MANUAL
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCliente();
			}
			
			//this.abrirFrameTreeTipoRiesgoCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Riesgo ClienteS ?", "MANTENIMIENTO DE Tipo Riesgo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRiesgoCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRiesgoCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.procesarImportacionTipoRiesgoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporiesgoclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRiesgoClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRiesgoCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRiesgoCliente.setFileImportacion(this.jInternalFrameImportacionTipoRiesgoCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRiesgoCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRiesgoCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRiesgoCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRiesgoCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		

		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRiesgoClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRiesgoClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRiesgoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRiesgoCliente tiporiesgocliente:tiporiesgoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporiesgocliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRiesgoCliente tiporiesgocliente:tiporiesgoclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporiesgocliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRiesgoCliente(row);				
			//	iRow++;
			//}				
			
			//for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRiesgoCliente(tiporiesgoclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
			
			//SI ES MANUAL
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRiesgoCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
			
			//SI ES MANUAL
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRiesgoCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
			
			//SI ES MANUAL
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRiesgoCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRiesgoCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRiesgoCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRiesgoCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRiesgoCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRiesgoCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRiesgoCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRiesgoCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRiesgoCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRiesgoCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRiesgoCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRiesgoCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRiesgoCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRiesgoCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRiesgoCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRiesgoCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRiesgoCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRiesgoCliente();
		
		this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRiesgoCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRiesgoCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRiesgoCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionNuevoTipoRiesgoCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRiesgoCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRiesgoCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionNuevoTipoRiesgoCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRiesgoCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRiesgoCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRiesgoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRiesgoCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRiesgoCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRiesgoCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRiesgoCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRiesgoCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRiesgoCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRiesgoCliente() throws Exception {
		try	{
			if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRiesgoCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRiesgoCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRiesgoCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRiesgoCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRiesgoCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRiesgoCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRiesgoCliente.addItem(reporte);
			}
			
			
			if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRiesgoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRiesgoCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRiesgoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRiesgoCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRiesgoCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRiesgoCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRiesgoCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRiesgoCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRiesgoCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRiesgoCliente(Boolean esInicializar) throws Exception {				
		if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRiesgoCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRiesgoCliente() throws Exception {
		this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRiesgoCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRiesgoClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRiesgoCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporiesgoclienteLogic.getTipoRiesgoClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporiesgoclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRiesgoCliente.setModel(new TipoRiesgoClienteModel(this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRiesgoCliente.setModel(new TipoRiesgoClienteModel(this.tiporiesgoclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRiesgoCliente!=null && this.jInternalFrameOrderByTipoRiesgoCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRiesgoCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,tiporiesgoclienteConstantesFunciones.resaltarSeleccionarTipoRiesgoCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO,tiporiesgoclienteConstantesFunciones.resaltarSeleccionarTipoRiesgoCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,TipoRiesgoClienteConstantesFunciones.LABEL_ID));

		if(this.tiporiesgoclienteConstantesFunciones.mostraridTipoRiesgoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporiesgoclienteConstantesFunciones.resaltaridTipoRiesgoCliente,this.tiporiesgoclienteConstantesFunciones.activaridTipoRiesgoCliente,this,true,"idTipoRiesgoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporiesgoclienteConstantesFunciones.resaltaridTipoRiesgoCliente,this.tiporiesgoclienteConstantesFunciones.activaridTipoRiesgoCliente,this,true,"idTipoRiesgoCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporiesgoclienteConstantesFunciones.mostrarid_empresaTipoRiesgoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporiesgoclienteConstantesFunciones.resaltarid_empresaTipoRiesgoCliente,this,this.tiporiesgoclienteConstantesFunciones.activarid_empresaTipoRiesgoCliente));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporiesgoclienteConstantesFunciones.resaltarid_empresaTipoRiesgoCliente,this,this.tiporiesgoclienteConstantesFunciones.activarid_empresaTipoRiesgoCliente,false,"id_empresaTipoRiesgoCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporiesgoclienteConstantesFunciones.mostrarnombreTipoRiesgoCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporiesgoclienteConstantesFunciones.resaltarnombreTipoRiesgoCliente,this.tiporiesgoclienteConstantesFunciones.activarnombreTipoRiesgoCliente,this,true,"nombreTipoRiesgoCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporiesgoclienteConstantesFunciones.resaltarnombreTipoRiesgoCliente,this.tiporiesgoclienteConstantesFunciones.activarnombreTipoRiesgoCliente,this,true,"nombreTipoRiesgoCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRiesgoClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRiesgoCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRiesgoCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRiesgoCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRiesgoCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRiesgoCliente.moveColumn(this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRiesgoCliente.moveColumn(this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRiesgoCliente.moveColumn(this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRiesgoCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRiesgoCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRiesgoCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRiesgoCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRiesgoCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRiesgoCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporiesgoclienteLogic.getTipoRiesgoClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporiesgoclientes.size()-1;
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
		//this.jTableDatosTipoRiesgoCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRiesgoCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRiesgoCliente();
			
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
				
				//this.isEsNuevoTipoRiesgoCliente=false;
					
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
				if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRiesgoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRiesgoCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporiesgocliente.getsType().equals("DUPLICADO")
				   || this.tiporiesgocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRiesgoCliente=true;
				
				} else {
					this.isEsNuevoTipoRiesgoCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporiesgocliente.getId()>=0 && !this.tiporiesgocliente.getIsNew()) {						
						this.isEsNuevoTipoRiesgoCliente=false;
						
					} else {
						this.isEsNuevoTipoRiesgoCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRiesgoCliente(esRelaciones);						
				
				this.seleccionarTipoRiesgoCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporiesgocliente.getId()<0) {
					this.isEsNuevoTipoRiesgoCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRiesgoCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRiesgoCliente(evt,rowIndex);
				}	
				
				if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRiesgoCliente: " + this.dDif); 
					}
				}								
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRiesgoCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporiesgocliente)) {
					if(this.tiporiesgocliente.getId()>0) {
						this.tiporiesgocliente.setIsDeleted(true);
						
						this.tiporiesgoclientesEliminados.add(this.tiporiesgocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporiesgoclienteLogic.getTipoRiesgoClientes().remove(this.tiporiesgocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporiesgoclientes.remove(this.tiporiesgocliente);				
					}
					
					
					((TipoRiesgoClienteModel) this.jTableDatosTipoRiesgoCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRiesgoCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRiesgoCliente) {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRiesgoCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRiesgoCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporiesgoclienteConstantesFunciones.cargarid_empresaTipoRiesgoCliente || this.tiporiesgoclienteConstantesFunciones.event_dependid_empresaTipoRiesgoCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporiesgocliente.getid_empresa());
									//this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporiesgocliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporiesgocliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporiesgocliente.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRiesgoCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRiesgoCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRiesgoCliente(tiporiesgocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRiesgoCliente(tiporiesgocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRiesgoCliente(tiporiesgocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCliente(tiporiesgocliente);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setText(tiporiesgocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setText(tiporiesgocliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRiesgoCliente tiporiesgoclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporiesgoclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRiesgoCliente tiporiesgoclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporiesgoclienteLocal=this.tiporiesgocliente;
			} else {
				tiporiesgoclienteLocal=this.tiporiesgoclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporiesgoclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRiesgoCliente(tiporiesgoclienteLocal,true);
					
					if(tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporiesgoclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporiesgoclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(tiporiesgocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(tiporiesgocliente);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(tiporiesgocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.getText()==null || this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.getText()=="" || this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setText("0");
			}

			if(conColumnasBase) {tiporiesgocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRiesgoClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelIdTipoRiesgoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporiesgocliente.setnombre(this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelnombreTipoRiesgoCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRiesgoCliente(TipoRiesgoCliente tiporiesgoclienteBean,TipoRiesgoCliente tiporiesgocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRiesgoCliente(TipoRiesgoCliente tiporiesgoclienteOrigen,TipoRiesgoCliente tiporiesgocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporiesgoclienteOrigen.getId()!=null && !tiporiesgoclienteOrigen.getId().equals(0L))) {tiporiesgocliente.setId(tiporiesgoclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tiporiesgoclienteOrigen.getnombre()!=null && !tiporiesgoclienteOrigen.getnombre().equals(""))) {tiporiesgocliente.setnombre(tiporiesgoclienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setText(tiporiesgocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setText(tiporiesgocliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRiesgoCliente(TipoRiesgoClienteBean tiporiesgoclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setText(tiporiesgoclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setText(tiporiesgoclienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRiesgoCliente(TipoRiesgoClienteParameterReturnGeneral tiporiesgoclienteReturnGeneral,TipoRiesgoClienteBean tiporiesgoclienteBean,Boolean conDefault) throws Exception { 
		try {
			TipoRiesgoCliente tiporiesgoclienteLocal=new TipoRiesgoCliente();
			
			tiporiesgoclienteLocal=tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporiesgoclienteLocal.getId()!=null && !tiporiesgoclienteLocal.getId().equals(0L))) {tiporiesgoclienteBean.setId(tiporiesgoclienteLocal.getId());}}
			if(conDefault || (!conDefault && tiporiesgoclienteLocal.getnombre()!=null && !tiporiesgoclienteLocal.getnombre().equals(""))) {tiporiesgoclienteBean.setnombre(tiporiesgoclienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRiesgoClienteGenerico(Long idTipoRiesgoClienteSeleccionado,JComboBox jComboBoxTipoRiesgoCliente,List<TipoRiesgoCliente> tiporiesgoclientesLocal)throws Exception {
		try {
			TipoRiesgoCliente  tiporiesgoclienteTemp=null;

			for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesLocal) {
				if(tiporiesgoclienteAux.getId()!=null && tiporiesgoclienteAux.getId().equals(idTipoRiesgoClienteSeleccionado)) {
					tiporiesgoclienteTemp=tiporiesgoclienteAux;
					break;
				}
			}

			jComboBoxTipoRiesgoCliente.setSelectedItem(tiporiesgoclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRiesgoClienteGenerico(JComboBox jComboBoxTipoRiesgoCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRiesgoCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRiesgoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRiesgoCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRiesgoCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgocliente=(TipoRiesgoCliente) tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporiesgocliente =(TipoRiesgoCliente) tiporiesgoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporiesgocliente.getIsNew() && !tiporiesgocliente.getIsChanged() && !tiporiesgocliente.getIsDeleted()) {
				sDescripcion=tiporiesgocliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporiesgocliente.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRiesgoCliente tiporiesgoclienteRow=new TipoRiesgoCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgoclienteRow=(TipoRiesgoCliente) tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporiesgoclienteRow=(TipoRiesgoCliente) tiporiesgoclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRiesgoCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));			
			this.jButtonDuplicarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCliente && this.isPermisoDuplicarTipoRiesgoCliente));			
			this.jButtonCopiarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCliente && this.isPermisoCopiarTipoRiesgoCliente));
			this.jButtonVerFormTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCliente && this.isPermisoVerFormTipoRiesgoCliente));
			
			this.jButtonAbrirOrderByTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));			
			
			this.jButtonNuevoRelacionesTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));			
			this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCliente && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCliente && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCliente && this.isPermisoEliminarTipoRiesgoCliente));
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCliente);							
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));						
			this.jButtonDuplicarToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCliente && this.isPermisoDuplicarTipoRiesgoCliente));						
			this.jButtonCopiarToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCliente && this.isPermisoCopiarTipoRiesgoCliente));			
			this.jButtonVerFormToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCliente && this.isPermisoVerFormTipoRiesgoCliente));			
			this.jButtonAbrirOrderByToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));
			this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));			
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCliente && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCliente  && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCliente && this.isPermisoEliminarTipoRiesgoCliente));
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarToolBarTipoRiesgoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCliente);				
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));			
			this.jMenuItemDuplicarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoRiesgoCliente && this.isPermisoDuplicarTipoRiesgoCliente));			
			this.jMenuItemCopiarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaCopiarTipoRiesgoCliente && this.isPermisoCopiarTipoRiesgoCliente));			
			this.jMenuItemVerFormTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaVerFormTipoRiesgoCliente && this.isPermisoVerFormTipoRiesgoCliente));			
			this.jMenuItemAbrirOrderByTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));			
			//this.jMenuItemMostrarOcultarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));
			this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));			
			//this.jMenuItemDetalleMostrarOcultarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaOrdenTipoRiesgoCliente && this.isPermisoOrdenTipoRiesgoCliente));			
			this.jMenuItemNuevoRelacionesTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente));			
			this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaNuevoTipoRiesgoCliente && this.isPermisoNuevoTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));									
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemModificarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaModificarTipoRiesgoCliente && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemActualizarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaActualizarTipoRiesgoCliente && this.isPermisoActualizarTipoRiesgoCliente));	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemEliminarTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaEliminarTipoRiesgoCliente && this.isPermisoEliminarTipoRiesgoCliente));
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemCancelarTipoRiesgoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCliente);				
			}
			
			this.jMenuItemGuardarCambiosTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));						
			this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=this.jButtonNuevoTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRiesgoCliente=this.jButtonDuplicarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaCopiarTipoRiesgoCliente=this.jButtonCopiarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaVerFormTipoRiesgoCliente=this.jButtonVerFormTipoRiesgoCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRiesgoCliente=this.jButtonAbrirOrderByTipoRiesgoCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=this.jButtonNuevoRelacionesTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=this.jButtonModificarTipoRiesgoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaGuardarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=this.jButtonGuardarCambiosTablaTipoRiesgoCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=this.jButtonNuevoToolBarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarToolBarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarToolBarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarToolBarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarToolBarTipoRiesgoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRiesgoCliente=this.jButtonGuardarCambiosToolBarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=this.jMenuItemNuevoTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=this.jMenuItemNuevoRelacionesTipoRiesgoCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemModificarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemActualizarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemEliminarTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemCancelarTipoRiesgoCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRiesgoCliente=this.jMenuItemGuardarCambiosTipoRiesgoCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRiesgoCliente(Boolean esInicializar) {
		if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRiesgoCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRiesgoCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCliente() {
		this.jButtonNuevoTipoRiesgoCliente.setVisible(this.isPermisoNuevoTipoRiesgoCliente);			
		this.jButtonDuplicarTipoRiesgoCliente.setVisible(this.isPermisoDuplicarTipoRiesgoCliente);			
		this.jButtonCopiarTipoRiesgoCliente.setVisible(this.isPermisoCopiarTipoRiesgoCliente);			
		this.jButtonVerFormTipoRiesgoCliente.setVisible(this.isPermisoVerFormTipoRiesgoCliente);			
		
		this.jButtonAbrirOrderByTipoRiesgoCliente.setVisible(this.isPermisoOrdenTipoRiesgoCliente);					
		
		this.jButtonNuevoRelacionesTipoRiesgoCliente.setVisible(this.isPermisoNuevoTipoRiesgoCliente);			
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarTipoRiesgoCliente.setVisible(this.isPermisoActualizarTipoRiesgoCliente);	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.setVisible(this.isPermisoActualizarTipoRiesgoCliente);	
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.setVisible(this.isPermisoEliminarTipoRiesgoCliente);
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCliente);						
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.setVisible(this.isPermisoGuardarCambiosTipoRiesgoCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setVisible(this.isPermisoActualizarTipoRiesgoCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRiesgoCliente() {
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarTipoRiesgoCliente.setVisible(this.isPermisoActualizarTipoRiesgoCliente);	
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.setVisible(this.isPermisoActualizarTipoRiesgoCliente);	
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.setVisible(this.isPermisoEliminarTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.setVisible(this.isVisibilidadCeldaCancelarTipoRiesgoCliente);							
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.setVisible((this.isVisibilidadCeldaGuardarTipoRiesgoCliente && this.isPermisoGuardarCambiosTipoRiesgoCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRiesgoCliente() {
		if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRiesgoCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRiesgoCliente() {
	}
	
	public void jTableDatosTipoRiesgoClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRiesgoCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRiesgoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.gettiporiesgocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocliente==null) {
						this.tiporiesgocliente = new TipoRiesgoCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
				}

				if(this.tiporiesgocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporiesgocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRiesgoClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRiesgoCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRiesgoCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRiesgoCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.gettiporiesgocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporiesgoclienteLogic.getConnexion());

				if(this.tiporiesgocliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporiesgocliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRiesgoCliente=(TitledBorder)this.jScrollPanelDatosTipoRiesgoCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRiesgoCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRiesgoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.gettiporiesgocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocliente==null) {
						this.tiporiesgocliente = new TipoRiesgoCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
				}

				if(this.tiporiesgocliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporiesgocliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRiesgoClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.gettiporiesgocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporiesgocliente==null) {
						this.tiporiesgocliente = new TipoRiesgoCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);
				}

				if(this.tiporiesgocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporiesgocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRiesgoCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoRiesgoClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);

			this.getTipoRiesgoClientesFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRiesgoCliente(false);

			//if(TipoRiesgoClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporiesgoclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRiesgoCliente() {
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.dispose();
			this.jInternalFrameDetalleFormTipoRiesgoCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
			this.jInternalFrameReporteDinamicoTipoRiesgoCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRiesgoCliente.dispose();
			this.jInternalFrameReporteDinamicoTipoRiesgoCliente=null;
		}
		
		if(this.jInternalFrameImportacionTipoRiesgoCliente!=null) {
			this.jInternalFrameImportacionTipoRiesgoCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRiesgoCliente.dispose();
			this.jInternalFrameImportacionTipoRiesgoCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRiesgoCliente();
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRiesgoCliente")) {
				jButtonDuplicarTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRiesgoCliente")) {
				jButtonCopiarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRiesgoCliente")) {
				jButtonVerFormTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRiesgoCliente")) {
				jButtonDuplicarTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRiesgoCliente")) {
				jButtonDuplicarTipoRiesgoClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRiesgoCliente")) {
				jButtonModificarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRiesgoCliente")) {
				jButtonModificarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRiesgoCliente")) {
				jButtonModificarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRiesgoCliente")) {
				jButtonActualizarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRiesgoCliente")) {
				jButtonActualizarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRiesgoCliente")) {
				jButtonActualizarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRiesgoCliente")) {
				jButtonEliminarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRiesgoCliente")) {
				jButtonEliminarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRiesgoCliente")) {
				jButtonEliminarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRiesgoCliente")) {
				jButtonCancelarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRiesgoCliente")) {
				jButtonCancelarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRiesgoCliente")) {
				jButtonCancelarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRiesgoCliente")) {
				jButtonCerrarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRiesgoCliente")) {
				jButtonCerrarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRiesgoCliente")) {
				jButtonCerrarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRiesgoCliente")) {
				jButtonMostrarOcultarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRiesgoCliente")) {
				jButtonCancelarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRiesgoCliente")) {
				jButtonCopiarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRiesgoCliente")) {
				jButtonVerFormTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRiesgoCliente")) {
				jButtonCopiarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRiesgoCliente")) {
				jButtonVerFormTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRiesgoCliente")) {
				jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRiesgoCliente")) {
				jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRiesgoCliente")) {
				jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRiesgoCliente")) {
				jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRiesgoCliente")) {
				jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRiesgoCliente")) {
				jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRiesgoCliente")) {
				jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRiesgoCliente")) {
				jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRiesgoCliente")) {
				jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRiesgoCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRiesgoCliente")) {
				jButtonAbrirOrderByTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRiesgoCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRiesgoCliente")) {
				jButtonMostrarOcultarTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRiesgoCliente")) {
				jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRiesgoCliente")) {
				jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRiesgoCliente")) {
				jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRiesgoCliente")) {
				jButtonCerrarReporteDinamicoTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRiesgoCliente")) {
				jButtonGenerarReporteDinamicoTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRiesgoCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRiesgoCliente")) {
				jButtonCerrarImportacionTipoRiesgoClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRiesgoCliente")) {
				
				jButtonGenerarImportacionTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRiesgoCliente")) {
				
				jButtonAbrirImportacionTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRiesgoCliente")) {
				jComboBoxTiposAccionesTipoRiesgoClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRiesgoCliente")) {
				jComboBoxTiposRelacionesTipoRiesgoClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRiesgoCliente")) {
				jComboBoxTiposAccionesTipoRiesgoClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRiesgoCliente")) {
				
				jComboBoxTiposSeleccionarTipoRiesgoClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRiesgoCliente")) {
				jTextFieldValorCampoGeneralTipoRiesgoClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRiesgoCliente")) {
				jButtonAbrirOrderByTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRiesgoCliente")) {
				jButtonAbrirOrderByTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRiesgoCliente")) {
				jButtonCerrarOrderByTipoRiesgoClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRiesgoClienteBusqueda")) {
				this.jButtonidTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRiesgoClienteUpdate")) {
				this.jButtonid_empresaTipoRiesgoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRiesgoClienteBusqueda")) {
				this.jButtonid_empresaTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRiesgoClienteBusqueda")) {
				this.jButtonnombreTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRiesgoCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRiesgoCliente tiporiesgoclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporiesgoclienteLocal=this.tiporiesgocliente;
			} else {
				tiporiesgoclienteLocal=this.tiporiesgoclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
							
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
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
			
			


			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
								
						
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
								
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
							
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
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
			
			


			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
								
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRiesgoCliente")) {
					jCheckBoxSeleccionarTodosTipoRiesgoClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRiesgoCliente")) {
					jCheckBoxSeleccionadosTipoRiesgoClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRiesgoCliente")) {
					
				}
				
				


				
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
												
				
				


				
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
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
			
			


			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporiesgocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporiesgocliente);
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
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
				
				


				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRiesgoCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRiesgoCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRiesgoClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporiesgoclienteAnterior =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRiesgoCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRiesgoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRiesgoCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporiesgocliente =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporiesgocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRiesgoCliente")) {
				
				}
				
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRiesgoCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRiesgoCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRiesgoCliente")) {
			
			}
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRiesgoCliente();
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRiesgoCliente")) {
				jButtonDuplicarTipoRiesgoClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRiesgoCliente")) {
				jButtonCopiarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRiesgoCliente")) {
				jButtonVerFormTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRiesgoCliente")) {
				jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRiesgoCliente")) {
				jButtonModificarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRiesgoCliente")) {
				jButtonActualizarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRiesgoCliente")) {
				jButtonEliminarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRiesgoCliente")) {
				jButtonCancelarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRiesgoCliente")) {
				jButtonCerrarTipoRiesgoClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRiesgoCliente")) {
				jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRiesgoCliente")) {
				jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRiesgoCliente")) {
				jButtonAbrirOrderByTipoRiesgoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRiesgoCliente")) {
				jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRiesgoCliente")) {
				jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRiesgoCliente")) {
				jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRiesgoClienteBusqueda")) {
				this.jButtonidTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRiesgoClienteUpdate")) {
				this.jButtonid_empresaTipoRiesgoClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRiesgoClienteBusqueda")) {
				this.jButtonid_empresaTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRiesgoClienteBusqueda")) {
				this.jButtonnombreTipoRiesgoClienteBusquedaActionPerformed(evt);
			}
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRiesgoCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRiesgoCliente")) {
				closingInternalFrameTipoRiesgoCliente();
				
			} else if(sTipo.equals("jButtonCancelarTipoRiesgoCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRiesgoCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRiesgoClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoRiesgoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRiesgoCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRiesgoClienteActionPerformed(null);
			}
			
			TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporiesgocliente,new Object(),this.tiporiesgoclienteParameterGeneral,this.tiporiesgoclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRiesgoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRiesgoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRiesgoCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporiesgocliente)) {
			if(!esControlTabla) {
				if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);			
				}
				
				if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.procesarEventosTipoRiesgoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this.tiporiesgocliente,this.tiporiesgoclienteParameterGeneral,this.isEsNuevoTipoRiesgoCliente,classes);//this.tiporiesgoclienteLogic.getTipoRiesgoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral,this.tiporiesgoclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRiesgoCliente(classes,this.tiporiesgoclienteReturnGeneral,this.tiporiesgoclienteBean,false);
					}
						
					if(this.tiporiesgoclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente());	
					}
						
					if(this.tiporiesgoclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente(),classes);//this.tiporiesgoclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCliente(this.tiporiesgocliente,classes);//this.tiporiesgoclienteBean);									
				}
			
				if(TipoRiesgoClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRiesgoCliente(this.tiporiesgocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRiesgoCliente(this.tiporiesgocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporiesgoclienteAnterior!=null) {
						this.tiporiesgocliente=this.tiporiesgoclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.procesarEventosTipoRiesgoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this.tiporiesgocliente,this.tiporiesgoclienteParameterGeneral,this.isEsNuevoTipoRiesgoCliente,classes);//this.tiporiesgoclienteLogic.getTipoRiesgoCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente(),tiporiesgoclienteLogic.getTipoRiesgoClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente(),this.tiporiesgoclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRiesgoCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRiesgoCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRiesgoCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRiesgoCliente() throws Exception {
		
		TipoRiesgoClienteModel tiporiesgoclienteModel=(TipoRiesgoClienteModel)this.jTableDatosTipoRiesgoCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporiesgoclienteModel.tiporiesgoclientes=this.tiporiesgoclienteLogic.getTipoRiesgoClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporiesgoclienteModel.tiporiesgoclientes=this.tiporiesgoclientes;
		}
		
		
		((TipoRiesgoClienteModel) this.jTableDatosTipoRiesgoCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRiesgoCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporiesgoclienteAnterior(),this.tiporiesgoclienteLogic.getTipoRiesgoClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporiesgoclienteAnterior(),this.tiporiesgoclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRiesgoCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
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
										
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgocliente,new Object(),generalEntityParameterGeneral,this.tiporiesgoclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRiesgoClienteConstantesFunciones.getClassesRelationshipsOfTipoRiesgoCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRiesgoClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRiesgoCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRiesgoCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRiesgoClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporiesgocliente,new Object(),generalEntityParameterGeneral,this.tiporiesgoclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRiesgoCliente(TipoRiesgoClienteBean tiporiesgoclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRiesgoCliente(ArrayList<Classe> classes,TipoRiesgoClienteReturnGeneral tiporiesgoclienteReturnGeneral,TipoRiesgoClienteBean tiporiesgoclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporiesgocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente = new TipoRiesgoClienteDetalleFormJInternalFrame(jDesktopPane,this.tiporiesgoclienteSessionBean.getConGuardarRelaciones(),this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.setVisible(false);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.tiporiesgoclienteLogic=this.tiporiesgoclienteLogic;
		
		this.cargarCombosFrameForeignKeyTipoRiesgoCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRiesgoCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRiesgoCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRiesgoCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRiesgoCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRiesgoCliente"));
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoRiesgoCliente"));

		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRiesgoCliente"));
					
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemModificarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRiesgoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoRiesgoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRiesgoCliente"));
						
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemActualizarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRiesgoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoRiesgoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRiesgoCliente"));
								
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemEliminarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRiesgoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoRiesgoCliente"));
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRiesgoCliente"));
					
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemCancelarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRiesgoCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemDetalleCerrarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRiesgoCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRiesgoCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonidTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonnombreTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRiesgoCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRiesgoCliente"));
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRiesgoCliente"));
		}
		
		this.jTableDatosTipoRiesgoCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRiesgoCliente"));
		
		this.jTableDatosTipoRiesgoCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRiesgoCliente"));
		
		this.jButtonNuevoTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"NuevoTipoRiesgoCliente"));
		
		this.jButtonDuplicarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"DuplicarTipoRiesgoCliente"));
		
		this.jButtonCopiarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"CopiarTipoRiesgoCliente"));
		
		this.jButtonVerFormTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"VerFormTipoRiesgoCliente"));
		
		
		this.jButtonNuevoToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRiesgoCliente"));
			
		this.jButtonDuplicarToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRiesgoCliente"));
			
		this.jMenuItemNuevoTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRiesgoCliente"));
			
		this.jMenuItemDuplicarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRiesgoCliente"));		
		
		
		this.jButtonNuevoRelacionesTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRiesgoCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRiesgoCliente"));
			
		this.jMenuItemNuevoRelacionesTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRiesgoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoRiesgoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonModificarToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRiesgoCliente"));
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemModificarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRiesgoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoRiesgoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonActualizarToolBarTipoRiesgoCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRiesgoCliente"));
				
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemActualizarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRiesgoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoRiesgoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonEliminarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRiesgoCliente"));
						
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemEliminarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRiesgoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoRiesgoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonCancelarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRiesgoCliente"));
			
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemCancelarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRiesgoCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRiesgoCliente"));		
		
		
		this.jButtonCerrarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CerrarTipoRiesgoCliente"));
		
		
		this.jButtonCerrarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRiesgoCliente"));
			
		this.jMenuItemCerrarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRiesgoCliente"));
			
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jMenuItemDetalleCerrarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRiesgoCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRiesgoCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRiesgoCliente"));
		}
		
		this.jButtonCopiarToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRiesgoCliente"));
			
		this.jButtonVerFormToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRiesgoCliente"));
		
		this.jMenuItemGuardarCambiosTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRiesgoCliente"));
			
		this.jMenuItemCopiarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRiesgoCliente"));		
		
		this.jMenuItemVerFormTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRiesgoCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRiesgoCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRiesgoCliente"));
			
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRiesgoCliente"));		
		
		
		
		this.jButtonRecargarInformacionTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRiesgoCliente"));
					
		this.jButtonRecargarInformacionToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRiesgoCliente"));
		
		this.jMenuItemRecargarInformacionTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRiesgoCliente"));		
		
		
		
		this.jButtonAnterioresTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"AnterioresTipoRiesgoCliente"));
		
		
		this.jButtonAnterioresToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRiesgoCliente"));
		
		this.jMenuItemAnterioresTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRiesgoCliente"));		
		
		
		this.jButtonSiguientesTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"SiguientesTipoRiesgoCliente"));
		
		
		this.jButtonSiguientesToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRiesgoCliente"));
			
		this.jMenuItemSiguientesTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRiesgoCliente"));
			
		this.jMenuItemAbrirOrderByTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRiesgoCliente"));
			
		this.jMenuItemMostrarOcultarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRiesgoCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRiesgoCliente"));
			
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRiesgoCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRiesgoCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRiesgoCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRiesgoCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRiesgoCliente"));

		this.jCheckBoxSeleccionadosTipoRiesgoCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRiesgoCliente"));
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRiesgoCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRiesgoCliente"));
			
		this.jComboBoxTiposAccionesTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRiesgoCliente"));
					
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRiesgoCliente"));
			
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRiesgoCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonidTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonnombreTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRiesgoCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCliente"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCliente"));
				this.jInternalFrameReporteDinamicoTipoRiesgoCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRiesgoCliente"));				
			//this.jButtonGenerarReporteDinamicoTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRiesgoCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRiesgoCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRiesgoCliente!=null) {
				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRiesgoCliente"));
				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRiesgoCliente"));
				this.jInternalFrameImportacionTipoRiesgoCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRiesgoCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRiesgoCliente"));
			
			this.jButtonAbrirOrderByToolBarTipoRiesgoCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRiesgoCliente"));			
			
			if(this.jInternalFrameOrderByTipoRiesgoCliente!=null) {
				this.jInternalFrameOrderByTipoRiesgoCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRiesgoCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRiesgoCliente.jTabbedPaneRelacionesTipoRiesgoCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRiesgoCliente"));
		
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
            		closingInternalFrameTipoRiesgoCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRiesgoCliente = (JInternalFrameBase)event.getSource();
	            	
	            TipoRiesgoClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoRiesgoClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRiesgoCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRiesgoClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRiesgoCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRiesgoClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRiesgoCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRiesgoCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRiesgoCliente";
		inputMap = this.jButtonNuevoTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRiesgoCliente";
		inputMap = this.jButtonNuevoRelacionesTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRiesgoClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRiesgoCliente";
		inputMap = this.jButtonModificarTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRiesgoCliente";
		inputMap = this.jButtonActualizarTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRiesgoCliente";
		inputMap = this.jButtonEliminarTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRiesgoCliente";
		inputMap = this.jButtonCancelarTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRiesgoCliente";
		inputMap = this.jButtonCerrarTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRiesgoCliente";
		inputMap = this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonGuardarCambiosTipoRiesgoCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRiesgoClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRiesgoCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRiesgoClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRiesgoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRiesgoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRiesgoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRiesgoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRiesgoCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRiesgoClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonidTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRiesgoClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonid_empresaTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRiesgoClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jButtonnombreTipoRiesgoClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRiesgoClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRiesgoCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRiesgoClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRiesgoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRiesgoCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRiesgoCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
					tiporiesgoclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientes) {
					tiporiesgoclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRiesgoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
						tiporiesgoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientes) {
						tiporiesgoclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRiesgoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRiesgoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRiesgoClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRiesgoCliente.getSelectedRows();
			
			TipoRiesgoCliente tiporiesgoclienteLocal=new TipoRiesgoCliente();
			
			//this.seleccionarTodosTipoRiesgoCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporiesgoclienteLocal =(TipoRiesgoCliente) this.tiporiesgoclienteLogic.getTipoRiesgoClientes().toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporiesgoclienteLocal =(TipoRiesgoCliente) this.tiporiesgoclientes.toArray()[this.jTableDatosTipoRiesgoCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporiesgoclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
						tiporiesgoclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientes) {
						tiporiesgoclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRiesgoCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRiesgoCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRiesgoCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRiesgoClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRiesgoClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRiesgoClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRiesgoCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
				
						if(sTipoSeleccionar.equals(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporiesgoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientes) {
					
						if(sTipoSeleccionar.equals(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporiesgoclienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRiesgoClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRiesgoCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRiesgoCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRiesgoCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRiesgoCliente(conSplash);
				
					this.generarReporteTipoRiesgoClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRiesgoClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRiesgoClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRiesgoClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRiesgoCliente();
				
				this.exportarTipoRiesgoClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRiesgoClientes();
				//this.importarTipoRiesgoClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRiesgoCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRiesgoClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Riesgo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRiesgoCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRiesgoCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRiesgoCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRiesgoClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRiesgoCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRiesgoCliente(conSplash);
					
						//this.actualizarParametrosGeneralTipoRiesgoCliente();
						
						this.generarReporteProcesoAccionTipoRiesgoClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRiesgoClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Riesgo ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Riesgo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRiesgoCliente();
				
						this.actualizarParametrosGeneralTipoRiesgoCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporiesgoclienteReturnGeneral=tiporiesgoclienteLogic.procesarAccionTipoRiesgoClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporiesgoclienteLogic.getTipoRiesgoClientes(),this.tiporiesgoclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRiesgoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRiesgoCliente();
					
					TipoRiesgoClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRiesgoClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRiesgoCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRiesgoCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRiesgoClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRiesgoCliente();
			
			if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
			TipoRiesgoCliente tiporiesgocliente=new TipoRiesgoCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRiesgoCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRiesgoCliente.getSelectedItem();
			
			
			
			
			tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporiesgoclientesSeleccionados.size()==1) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
					tiporiesgocliente=tiporiesgoclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRiesgoCliente();
			
      		//this.finishProcessTipoRiesgoCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRiesgoClienteReturnGeneral() throws Exception {
		if(this.tiporiesgoclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporiesgoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporiesgoclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporiesgoclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporiesgoclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporiesgoclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
		}
		
		if(this.tiporiesgoclienteReturnGeneral.getConRetornoLista() || this.tiporiesgoclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporiesgoclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporiesgoclienteLogic.setTipoRiesgoClientes(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporiesgoclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporiesgoclienteLogic.setTipoRiesgoCliente(this.tiporiesgoclienteReturnGeneral.getTipoRiesgoCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRiesgoCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRiesgoCliente() throws Exception {
		
		
	}
	
	public ArrayList<TipoRiesgoCliente> getTipoRiesgoClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRiesgoCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclienteLogic.getTipoRiesgoClientes()) {
					if(tiporiesgoclienteAux.getIsSelected()) {
						tiporiesgoclientesSeleccionados.add(tiporiesgoclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRiesgoCliente tiporiesgoclienteAux:this.tiporiesgoclientes) {
					if(tiporiesgoclienteAux.getIsSelected()) {
						tiporiesgoclientesSeleccionados.add(tiporiesgoclienteAux);				
					}
				}
			}
			
			if(tiporiesgoclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporiesgoclientesSeleccionados.addAll(this.tiporiesgoclienteLogic.getTipoRiesgoClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporiesgoclientesSeleccionados.addAll(this.tiporiesgoclientes);				
					}
				}
			}
		} else {
			tiporiesgoclientesSeleccionados.add(this.tiporiesgocliente);
		}
		
		return tiporiesgoclientesSeleccionados;
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
	
	public void generarReporteTipoRiesgoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRiesgoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRiesgoClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRiesgoClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRiesgoClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Riesgo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRiesgoClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRiesgoCliente();
		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRiesgoCliente();
		
		
		//this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados ,tiporiesgoclienteImplementable,tiporiesgoclienteImplementableHome);
	}
	
	public void mostrarImportacionTipoRiesgoClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRiesgoCliente();
		
		this.abrirFrameImportacionTipoRiesgoCliente();		
		
			
		//this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados ,tiporiesgoclienteImplementable,tiporiesgoclienteImplementableHome);
	}
	
	public void importarTipoRiesgoClientes() throws Exception {		
	
	}
	
	public void exportarTipoRiesgoClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRiesgoClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRiesgoClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRiesgoClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Riesgo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRiesgoCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRiesgoCliente(tiporiesgoclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporiesgoclienteAux.setsDetalleGeneralEntityReporte(tiporiesgoclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRiesgoCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRiesgoClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporiesgocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporiesgocliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRiesgoClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRiesgoCliente(row);				
				iRow++;
			}				
			
			for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRiesgoCliente(tiporiesgoclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRiesgoClientesSeleccionados() throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();		
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporiesgocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporiesgoclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporiesgocliente");
			//elementRoot.appendChild(element);
		
			for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
				element = document.createElement("tiporiesgocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRiesgoCliente(tiporiesgoclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Riesgo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRiesgoCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporiesgocliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRiesgoCliente(TipoRiesgoCliente tiporiesgocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRiesgoClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporiesgocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRiesgoClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporiesgocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRiesgoClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporiesgocliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(TipoRiesgoClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporiesgocliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRiesgoClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados=new ArrayList<TipoRiesgoCliente>();
		
		tiporiesgoclientesSeleccionados=this.getTipoRiesgoClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRiesgoCliente(tiporiesgoclientesSeleccionados);
		
		this.generarReporteTipoRiesgoClientes("Todos",tiporiesgoclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRiesgoCliente(ArrayList<TipoRiesgoCliente> tiporiesgoclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRiesgoCliente tiporiesgoclienteAux:tiporiesgoclientesSeleccionados) {
				tiporiesgoclienteAux.setsDetalleGeneralEntityReporte(tiporiesgoclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporiesgoclienteAux.setsDescripcionGeneralEntityReporte1(tiporiesgoclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporiesgoclienteAux.setsDescripcionGeneralEntityReporte1(tiporiesgoclienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRiesgoClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRiesgoCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRiesgoCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=true;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
			this.isVisibilidadCeldaModificarTipoRiesgoCliente=true;
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaCancelarTipoRiesgoCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRiesgoCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=true;
		} else {
			this.actualizarEstadoPanelsTipoRiesgoCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRiesgoCliente=false;
			//this.isVisibilidadCeldaVerFormTipoRiesgoCliente=false;
			this.isVisibilidadCeldaDuplicarTipoRiesgoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRiesgoCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRiesgoCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;												
			}
			
			this.jButtonCerrarTipoRiesgoCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRiesgoCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporiesgocliente)) {
			this.isVisibilidadCeldaActualizarTipoRiesgoCliente=false;
			this.isVisibilidadCeldaEliminarTipoRiesgoCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRiesgoCliente() {
	}
	
	public void actualizarEstadoPanelsTipoRiesgoCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosEdicionTipoRiesgoCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRiesgoCliente!=null) {
				this.jScrollPanelDatosTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRiesgoCliente!=null) {
				this.jPanelPaginacionTipoRiesgoCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
					this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRiesgoCliente!=null) {
				this.jTabbedPaneBusquedasTipoRiesgoCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRiesgoCliente!=null) {
				this.jPanelParametrosReportesTipoRiesgoCliente.setVisible(true);
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
		
		//TipoRiesgoClienteSessionBean tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		
		if(this.tiporiesgoclienteSessionBean==null) {
			this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		}
		
		this.tiporiesgoclienteSessionBean.setsUltimaBusquedaTipoRiesgoCliente(this.getsAccionBusqueda());
		this.tiporiesgoclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporiesgoclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporiesgoclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRiesgoClienteSessionBean tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		
		if(this.tiporiesgoclienteSessionBean==null) {
			this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		}
		
		if(this.tiporiesgoclienteSessionBean.getsUltimaBusquedaTipoRiesgoCliente()!=null&&!this.tiporiesgoclienteSessionBean.getsUltimaBusquedaTipoRiesgoCliente().equals("")) {
			this.setsAccionBusqueda(tiporiesgoclienteSessionBean.getsUltimaBusquedaTipoRiesgoCliente());
			this.setiNumeroPaginacion(tiporiesgoclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporiesgoclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporiesgoclienteSessionBean.getid_empresa());
				tiporiesgoclienteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporiesgoclienteSessionBean.setsUltimaBusquedaTipoRiesgoCliente("");
		this.tiporiesgoclienteSessionBean.setiNumeroPaginacion(TipoRiesgoClienteConstantesFunciones.INUMEROPAGINACION);
		this.tiporiesgoclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRiesgoCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRiesgoCliente() {
		this.updateBorderResaltarBusquedasFormularioTipoRiesgoCliente();
		this.updateVisibilidadBusquedasFormularioTipoRiesgoCliente();
		this.updateHabilitarBusquedasFormularioTipoRiesgoCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRiesgoCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRiesgoCliente.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRiesgoCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRiesgoCliente.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRiesgoCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRiesgoCliente.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRiesgoCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoRiesgoCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRiesgoCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRiesgoCliente();
		this.updateVisibilidadResaltarControlesFormularioTipoRiesgoCliente();
		this.updateHabilitarResaltarControlesFormularioTipoRiesgoCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRiesgoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporiesgoclienteConstantesFunciones.resaltaridTipoRiesgoCliente!=null && this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setBorder(this.tiporiesgoclienteConstantesFunciones.resaltaridTipoRiesgoCliente);}
		if(this.tiporiesgoclienteConstantesFunciones.resaltarid_empresaTipoRiesgoCliente!=null && this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setBorder(this.tiporiesgoclienteConstantesFunciones.resaltarid_empresaTipoRiesgoCliente);}
		if(this.tiporiesgoclienteConstantesFunciones.resaltarnombreTipoRiesgoCliente!=null && this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setBorder(this.tiporiesgoclienteConstantesFunciones.resaltarnombreTipoRiesgoCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRiesgoCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
	
		//this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostraridTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelidTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostraridTipoRiesgoCliente);
		//this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostrarid_empresaTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelid_empresaTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostrarid_empresaTipoRiesgoCliente);
		//this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostrarnombreTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jPanelnombreTipoRiesgoCliente.setVisible(this.tiporiesgoclienteConstantesFunciones.mostrarnombreTipoRiesgoCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRiesgoCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRiesgoCliente!=null) {
	
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jLabelidTipoRiesgoCliente.setEnabled(this.tiporiesgoclienteConstantesFunciones.activaridTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jComboBoxid_empresaTipoRiesgoCliente.setEnabled(this.tiporiesgoclienteConstantesFunciones.activarid_empresaTipoRiesgoCliente);
		this.jInternalFrameDetalleFormTipoRiesgoCliente.jTextAreanombreTipoRiesgoCliente.setEnabled(this.tiporiesgoclienteConstantesFunciones.activarnombreTipoRiesgoCliente);
		}
	}
	
		
}