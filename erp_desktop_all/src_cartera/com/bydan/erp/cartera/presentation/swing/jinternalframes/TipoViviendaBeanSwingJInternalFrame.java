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

import com.bydan.erp.cartera.util.TipoViviendaConstantesFunciones;
import com.bydan.erp.cartera.util.TipoViviendaParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoViviendaParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoViviendaBean;
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
public class TipoViviendaBeanSwingJInternalFrame extends TipoViviendaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoViviendaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoVivienda> tipoviviendaValidator = new ClassValidator<TipoVivienda>(TipoVivienda.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoVivienda tipovivienda;	
	public TipoVivienda tipoviviendaAux;
	public TipoVivienda tipoviviendaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoVivienda tipoviviendaTotales;
	public Long idTipoViviendaActual;
	public Long iIdNuevoTipoVivienda=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDireccion=false;

	public Boolean getIsTienePermisosDireccion() {
		return isTienePermisosDireccion;
	}

	public void setIsTienePermisosDireccion(Boolean isTienePermisosDireccion) {
		this.isTienePermisosDireccion= isTienePermisosDireccion;
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
	
	public Boolean isPermisoTodoTipoVivienda;
	public Boolean isPermisoNuevoTipoVivienda;
	public Boolean isPermisoActualizarTipoVivienda;
	public Boolean isPermisoActualizarOriginalTipoVivienda;
	public Boolean isPermisoEliminarTipoVivienda;
	public Boolean isPermisoGuardarCambiosTipoVivienda;
	public Boolean isPermisoConsultaTipoVivienda;
	public Boolean isPermisoBusquedaTipoVivienda;
	public Boolean isPermisoReporteTipoVivienda;
	public Boolean isPermisoPaginacionMedioTipoVivienda;
	public Boolean isPermisoPaginacionAltoTipoVivienda;
	public Boolean isPermisoPaginacionTodoTipoVivienda;
	public Boolean isPermisoCopiarTipoVivienda;
	public Boolean isPermisoVerFormTipoVivienda;
	public Boolean isPermisoDuplicarTipoVivienda;
	public Boolean isPermisoOrdenTipoVivienda;
	
	
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
	
	public TipoViviendaParameterReturnGeneral tipoviviendaReturnGeneral;
	public TipoViviendaParameterReturnGeneral tipoviviendaParameterGeneral;
	
	

	public DireccionLogic direccionLogic=null;

	public DireccionLogic getDireccionLogic() {
		return direccionLogic;
	}

	public void setDireccionLogic(DireccionLogic direccionLogic) {
		this.direccionLogic = direccionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoVivienda=false;
	public Boolean esParaAccionDesdeFormularioTipoVivienda=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoViviendaSessionBeanAdditional tipoviviendaSessionBeanAdditional=null;
	
	public TipoViviendaSessionBeanAdditional getTipoViviendaSessionBeanAdditional() {
		return this.tipoviviendaSessionBeanAdditional;
	}
	
	public void setTipoViviendaSessionBeanAdditional(TipoViviendaSessionBeanAdditional tipoviviendaSessionBeanAdditional) {
		try {
			this.tipoviviendaSessionBeanAdditional=tipoviviendaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoViviendaBeanSwingJInternalFrameAdditional tipoviviendaBeanSwingJInternalFrameAdditional=null;
	//public class TipoViviendaBeanSwingJInternalFrame
	
	public TipoViviendaBeanSwingJInternalFrameAdditional getTipoViviendaBeanSwingJInternalFrameAdditional() {
		return this.tipoviviendaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoViviendaBeanSwingJInternalFrameAdditional(TipoViviendaBeanSwingJInternalFrameAdditional tipoviviendaBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoviviendaBeanSwingJInternalFrameAdditional=tipoviviendaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoViviendaLogic tipoviviendaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoVivienda tipoviviendaBean;
	public TipoViviendaConstantesFunciones tipoviviendaConstantesFunciones;
	//public TipoViviendaParameterReturnGeneral tipoviviendaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoVivienda> tipoviviendas;	
	//public List<TipoVivienda> tipoviviendasEliminados;
	//public List<TipoVivienda> tipoviviendasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoVivienda=false;
	public Boolean isVisibilidadCeldaDuplicarTipoVivienda=true;
	public Boolean isVisibilidadCeldaCopiarTipoVivienda=true;
	public Boolean isVisibilidadCeldaVerFormTipoVivienda=true;
	public Boolean isVisibilidadCeldaOrdenTipoVivienda=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
	public Boolean isVisibilidadCeldaModificarTipoVivienda=false;
	public Boolean isVisibilidadCeldaActualizarTipoVivienda=false;
	public Boolean isVisibilidadCeldaEliminarTipoVivienda=false;
	public Boolean isVisibilidadCeldaCancelarTipoVivienda=false;
	public Boolean isVisibilidadCeldaGuardarTipoVivienda=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoVivienda=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoVivienda() {
		return this.iIdNuevoTipoVivienda;
	}

	public void setiIdNuevoTipoVivienda(Long iIdNuevoTipoVivienda) {
		this.iIdNuevoTipoVivienda = iIdNuevoTipoVivienda;
	}
	
	public Long getidTipoViviendaActual() {
		return this.idTipoViviendaActual;
	}

	public void setidTipoViviendaActual(Long idTipoViviendaActual) {
		this.idTipoViviendaActual = idTipoViviendaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoVivienda gettipovivienda() {
		return this.tipovivienda;
	}

	public void settipovivienda(TipoVivienda tipovivienda) {
		this.tipovivienda = tipovivienda;
	}
	
	public TipoVivienda gettipoviviendaAux() {
		return this.tipoviviendaAux;
	}

	public void settipoviviendaAux(TipoVivienda tipoviviendaAux) {
		this.tipoviviendaAux = tipoviviendaAux;
	}				
	
	public TipoVivienda gettipoviviendaAnterior() {
		return this.tipoviviendaAnterior;
	}

	public void settipoviviendaAnterior(TipoVivienda tipoviviendaAnterior) {
		this.tipoviviendaAnterior = tipoviviendaAnterior;
	}	
	
	public TipoVivienda gettipoviviendaTotales() {
		return this.tipoviviendaTotales;
	}

	public void settipoviviendaTotales(TipoVivienda tipoviviendaTotales) {
		this.tipoviviendaTotales = tipoviviendaTotales;
	}	
	
	public TipoVivienda gettipoviviendaBean() {
		return this.tipoviviendaBean;
	}

	public void settipoviviendaBean(TipoVivienda tipoviviendaBean) {
		this.tipoviviendaBean = tipoviviendaBean;
	}	
	
	public TipoViviendaParameterReturnGeneral gettipoviviendaReturnGeneral() {
		return this.tipoviviendaReturnGeneral;
	}

	public void settipoviviendaReturnGeneral(TipoViviendaParameterReturnGeneral tipoviviendaReturnGeneral) {
		this.tipoviviendaReturnGeneral = tipoviviendaReturnGeneral;
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
	
	
	public TipoViviendaLogic getTipoViviendaLogic()	{		
		return tipoviviendaLogic;
	}

	public void setTipoViviendaLogic(TipoViviendaLogic tipoviviendaLogic) {
		this.tipoviviendaLogic = tipoviviendaLogic;
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
	
	public Boolean getIsEsNuevoTipoVivienda() {
		return isEsNuevoTipoVivienda;
	}

	public void setIsEsNuevoTipoVivienda(Boolean isEsNuevoTipoVivienda) {
		this.isEsNuevoTipoVivienda = isEsNuevoTipoVivienda;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoVivienda() {
		return esParaAccionDesdeFormularioTipoVivienda;
	}
	
	public void setEsParaAccionDesdeFormularioTipoVivienda(Boolean esParaAccionDesdeFormularioTipoVivienda) {
		this.esParaAccionDesdeFormularioTipoVivienda = esParaAccionDesdeFormularioTipoVivienda;
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

			if(this.tipoviviendaSessionBean==null) {
				this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
			}

			if(!this.tipoviviendaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoviviendaSessionBean.getlidEmpresaActual());
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

					if(this.tipovivienda!=null) {
						this.tipovivienda.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
						this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoVivienda.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
						if(this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoViviendaGenerico)throws Exception
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
				jComboBoxid_empresaTipoViviendaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoViviendaGenerico!=null && jComboBoxid_empresaTipoViviendaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoViviendaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoVivienda tipovivienda,JComboBox jComboBoxid_empresaTipoViviendaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoViviendaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoViviendaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipovivienda.setid_empresa(empresaAux.getId());
				tipovivienda.setempresa_descripcion(TipoViviendaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipovivienda.setEmpresa(empresaAux);			}
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

					if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoVivienda!=null) { 
							this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoVivienda!=null) { 
					}

					if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
							this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
							this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoVivienda() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoViviendaConstantesFunciones.refrescarForeignKeysDescripcionesTipoVivienda(this.tipoviviendaLogic.getTipoViviendas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoViviendaConstantesFunciones.refrescarForeignKeysDescripcionesTipoVivienda(this.tipoviviendas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoviviendaLogic.setTipoViviendas(this.tipoviviendas);
			tipoviviendaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoViviendaParameterReturnGeneral getTipoViviendaParameterGeneral() {
		return this.tipoviviendaParameterGeneral;
	}
	
	public void setTipoViviendaParameterGeneral(TipoViviendaParameterReturnGeneral tipoviviendaParameterGeneral) {
		this.tipoviviendaParameterGeneral = tipoviviendaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoVivienda() {
		return isPermisoTodoTipoVivienda;
	}

	public void setIsPermisoTodoTipoVivienda(Boolean isPermisoTodoTipoVivienda) {
		this.isPermisoTodoTipoVivienda = isPermisoTodoTipoVivienda;
	}

	public Boolean getIsPermisoNuevoTipoVivienda() {
		return isPermisoNuevoTipoVivienda;
	}

	public void setIsPermisoNuevoTipoVivienda(Boolean isPermisoNuevoTipoVivienda) {
		this.isPermisoNuevoTipoVivienda = isPermisoNuevoTipoVivienda;
	}

	public Boolean getIsPermisoActualizarTipoVivienda() {
		return isPermisoActualizarTipoVivienda;
	}

	public void setIsPermisoActualizarTipoVivienda(Boolean isPermisoActualizarTipoVivienda) {
		this.isPermisoActualizarTipoVivienda = isPermisoActualizarTipoVivienda;
	}

	public Boolean getIsPermisoEliminarTipoVivienda() {
		return isPermisoEliminarTipoVivienda;
	}

	public void setIsPermisoEliminarTipoVivienda(Boolean isPermisoEliminarTipoVivienda) {
		this.isPermisoEliminarTipoVivienda = isPermisoEliminarTipoVivienda;
	}

	public Boolean getIsPermisoGuardarCambiosTipoVivienda() {
		return isPermisoGuardarCambiosTipoVivienda;
	}

	public void setIsPermisoGuardarCambiosTipoVivienda(Boolean isPermisoGuardarCambiosTipoVivienda) {
		this.isPermisoGuardarCambiosTipoVivienda = isPermisoGuardarCambiosTipoVivienda;
	}
	
	public Boolean getIsPermisoConsultaTipoVivienda() {
		return isPermisoConsultaTipoVivienda;
	}

	public void setIsPermisoConsultaTipoVivienda(Boolean isPermisoConsultaTipoVivienda) {
		this.isPermisoConsultaTipoVivienda = isPermisoConsultaTipoVivienda;
	}

	public Boolean getIsPermisoBusquedaTipoVivienda() {
		return isPermisoBusquedaTipoVivienda;
	}

	public void setIsPermisoBusquedaTipoVivienda(Boolean isPermisoBusquedaTipoVivienda) {
		this.isPermisoBusquedaTipoVivienda = isPermisoBusquedaTipoVivienda;
	}

	public Boolean getIsPermisoReporteTipoVivienda() {
		return isPermisoReporteTipoVivienda;
	}

	public void setIsPermisoReporteTipoVivienda(Boolean isPermisoReporteTipoVivienda) {
		this.isPermisoReporteTipoVivienda = isPermisoReporteTipoVivienda;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoVivienda() {
		return isPermisoPaginacionMedioTipoVivienda;
	}

	public void setIsPermisoPaginacionMedioTipoVivienda(Boolean isPermisoPaginacionMedioTipoVivienda) {
		this.isPermisoPaginacionMedioTipoVivienda = isPermisoPaginacionMedioTipoVivienda;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoVivienda() {
		return isPermisoPaginacionTodoTipoVivienda;
	}

	public void setIsPermisoPaginacionTodoTipoVivienda(Boolean isPermisoPaginacionTodoTipoVivienda) {
		this.isPermisoPaginacionTodoTipoVivienda = isPermisoPaginacionTodoTipoVivienda;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoVivienda() {
		return isPermisoPaginacionAltoTipoVivienda;
	}

	public void setIsPermisoPaginacionAltoTipoVivienda(Boolean isPermisoPaginacionAltoTipoVivienda) {
		this.isPermisoPaginacionAltoTipoVivienda = isPermisoPaginacionAltoTipoVivienda;
	}
	
	public Boolean getIsPermisoCopiarTipoVivienda() {
		return isPermisoCopiarTipoVivienda;
	}

	public void setIsPermisoCopiarTipoVivienda(Boolean isPermisoCopiarTipoVivienda) {
		this.isPermisoCopiarTipoVivienda = isPermisoCopiarTipoVivienda;
	}
	
	public Boolean getIsPermisoVerFormTipoVivienda() {
		return isPermisoVerFormTipoVivienda;
	}

	public void setIsPermisoVerFormTipoVivienda(Boolean isPermisoVerFormTipoVivienda) {
		this.isPermisoVerFormTipoVivienda = isPermisoVerFormTipoVivienda;
	}
	
	public Boolean getIsPermisoDuplicarTipoVivienda() {
		return isPermisoDuplicarTipoVivienda;
	}

	public void setIsPermisoDuplicarTipoVivienda(Boolean isPermisoDuplicarTipoVivienda) {
		this.isPermisoDuplicarTipoVivienda = isPermisoDuplicarTipoVivienda;
	}
	
	public Boolean getIsPermisoOrdenTipoVivienda() {
		return isPermisoOrdenTipoVivienda;
	}

	public void setIsPermisoOrdenTipoVivienda(Boolean isPermisoOrdenTipoVivienda) {
		this.isPermisoOrdenTipoVivienda = isPermisoOrdenTipoVivienda;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoVivienda() {
		return isVisibilidadCeldaNuevoTipoVivienda;
	}

	public void setIsVisibilidadCeldaNuevoTipoVivienda(Boolean isVisibilidadCeldaNuevoTipoVivienda) {
		this.isVisibilidadCeldaNuevoTipoVivienda = isVisibilidadCeldaNuevoTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoVivienda() {
		return isVisibilidadCeldaDuplicarTipoVivienda;
	}

	public void setIsVisibilidadCeldaDuplicarTipoVivienda(Boolean isVisibilidadCeldaDuplicarTipoVivienda) {
		this.isVisibilidadCeldaDuplicarTipoVivienda = isVisibilidadCeldaDuplicarTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoVivienda() {
		return isVisibilidadCeldaCopiarTipoVivienda;
	}

	public void setIsVisibilidadCeldaCopiarTipoVivienda(Boolean isVisibilidadCeldaCopiarTipoVivienda) {
		this.isVisibilidadCeldaCopiarTipoVivienda = isVisibilidadCeldaCopiarTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoVivienda() {
		return isVisibilidadCeldaVerFormTipoVivienda;
	}

	public void setIsVisibilidadCeldaVerFormTipoVivienda(Boolean isVisibilidadCeldaVerFormTipoVivienda) {
		this.isVisibilidadCeldaVerFormTipoVivienda = isVisibilidadCeldaVerFormTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoVivienda() {
		return isVisibilidadCeldaOrdenTipoVivienda;
	}

	public void setIsVisibilidadCeldaOrdenTipoVivienda(Boolean isVisibilidadCeldaOrdenTipoVivienda) {
		this.isVisibilidadCeldaOrdenTipoVivienda = isVisibilidadCeldaOrdenTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoVivienda() {
		return isVisibilidadCeldaNuevoRelacionesTipoVivienda;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoVivienda(Boolean isVisibilidadCeldaNuevoRelacionesTipoVivienda) {
		this.isVisibilidadCeldaNuevoRelacionesTipoVivienda = isVisibilidadCeldaNuevoRelacionesTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoVivienda() {
		return isVisibilidadCeldaModificarTipoVivienda;
	}

	public void setIsVisibilidadCeldaModificarTipoVivienda(Boolean isVisibilidadCeldaModificarTipoVivienda) {
		this.isVisibilidadCeldaModificarTipoVivienda = isVisibilidadCeldaModificarTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoVivienda() {
		return isVisibilidadCeldaActualizarTipoVivienda;
	}

	public void setIsVisibilidadCeldaActualizarTipoVivienda(Boolean isVisibilidadCeldaActualizarTipoVivienda) {
		this.isVisibilidadCeldaActualizarTipoVivienda = isVisibilidadCeldaActualizarTipoVivienda;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoVivienda() {
		return isVisibilidadCeldaEliminarTipoVivienda;
	}

	public void setIsVisibilidadCeldaEliminarTipoVivienda(Boolean isVisibilidadCeldaEliminarTipoVivienda) {
		this.isVisibilidadCeldaEliminarTipoVivienda = isVisibilidadCeldaEliminarTipoVivienda;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoVivienda() {
		return isVisibilidadCeldaCancelarTipoVivienda;
	}

	public void setIsVisibilidadCeldaCancelarTipoVivienda(Boolean isVisibilidadCeldaCancelarTipoVivienda) {
		this.isVisibilidadCeldaCancelarTipoVivienda = isVisibilidadCeldaCancelarTipoVivienda;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoVivienda() {
		return isVisibilidadCeldaGuardarTipoVivienda;
	}

	public void setIsVisibilidadCeldaGuardarTipoVivienda(Boolean isVisibilidadCeldaGuardarTipoVivienda) {
		this.isVisibilidadCeldaGuardarTipoVivienda = isVisibilidadCeldaGuardarTipoVivienda;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoVivienda() {
		return isVisibilidadCeldaGuardarCambiosTipoVivienda;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoVivienda(Boolean isVisibilidadCeldaGuardarCambiosTipoVivienda) {
		this.isVisibilidadCeldaGuardarCambiosTipoVivienda = isVisibilidadCeldaGuardarCambiosTipoVivienda;
	}
		
	public TipoViviendaSessionBean gettipoviviendaSessionBean() {
		return this.tipoviviendaSessionBean;
	}
	
	public void settipoviviendaSessionBean(TipoViviendaSessionBean tipoviviendaSessionBean) {
		this.tipoviviendaSessionBean=tipoviviendaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(TipoVivienda tipovivienda)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipovivienda,null);
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
	
	public void bugActualizarReferenciaActual(TipoVivienda tipovivienda,TipoVivienda tipoviviendaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoVivienda(tipovivienda);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoviviendaAux.setId(tipovivienda.getId());
		tipoviviendaAux.setVersionRow(tipovivienda.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoVivienda();
		
			int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoviviendaValidator.getInvalidValues(this.tipovivienda);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoviviendaLogic.setDatosCliente(datosCliente);
			tipoviviendaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoviviendaAux=new  TipoVivienda();
				
				tipoviviendaAux.setIsNew(true);
				tipoviviendaAux.setIsChanged(true);
				
				tipoviviendaAux.setTipoViviendaOriginal(this.tipovivienda);
				
				tipoviviendaAux.setId(this.tipovivienda.getId());	
				tipoviviendaAux.setVersionRow(this.tipovivienda.getVersionRow());	
				tipoviviendaAux.setid_empresa(this.tipovivienda.getid_empresa());	
				tipoviviendaAux.setcodigo(this.tipovivienda.getcodigo());	
				tipoviviendaAux.setnombre(this.tipovivienda.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviviendaAux,tipoviviendas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaLogic.saveTipoViviendas();//WithConnection
						//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);
					
					this.refrescarForeignKeysDescripcionesTipoVivienda();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoviviendaLogic.saveTipoViviendaRelaciones(tipoviviendaAux,this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoviviendaAux.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoviviendaAux,tipoviviendas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoviviendaAux=new  TipoVivienda();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoviviendaSessionBean.getEsGuardarRelacionado() && this.tipovivienda.getId()>=0)) {
						
					tipoviviendaAux.setIsNew(false);
				}
				
				tipoviviendaAux.setIsDeleted(false);
			
				tipoviviendaAux.setId(this.tipovivienda.getId());	
				tipoviviendaAux.setVersionRow(this.tipovivienda.getVersionRow());	
				tipoviviendaAux.setid_empresa(this.tipovivienda.getid_empresa());	
				tipoviviendaAux.setcodigo(this.tipovivienda.getcodigo());	
				tipoviviendaAux.setnombre(this.tipovivienda.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviviendaAux,tipoviviendas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaLogic.saveTipoViviendas();//WithConnection
						//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);
					
					this.refrescarForeignKeysDescripcionesTipoVivienda();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoviviendaLogic.saveTipoViviendaRelaciones(tipoviviendaAux,this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoviviendaAux.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoviviendaAux,tipoviviendas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipovivienda,tipoviviendaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoviviendaAux=new  TipoVivienda();
				
				tipoviviendaAux.setIsNew(false);
				tipoviviendaAux.setIsChanged(false);
				
				tipoviviendaAux.setIsDeleted(true);
				
				tipoviviendaAux.setId(this.tipovivienda.getId());	
				tipoviviendaAux.setVersionRow(this.tipovivienda.getVersionRow());	
				tipoviviendaAux.setid_empresa(this.tipovivienda.getid_empresa());	
				tipoviviendaAux.setcodigo(this.tipovivienda.getcodigo());	
				tipoviviendaAux.setnombre(this.tipovivienda.getnombre());	
				
				if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoviviendaAux.getId()>=0) {	
						this.tipoviviendasEliminados.add(tipoviviendaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviviendaAux,tipoviviendas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaLogic.saveTipoViviendas();//WithConnection
						//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoviviendaLogic.saveTipoViviendaRelaciones(tipoviviendaAux,this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoviviendaAux.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoviviendaAux,tipoviviendaLogic.getTipoViviendas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoviviendaAux,tipoviviendas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getTipoViviendas().addAll(this.tipoviviendasEliminados);
					
					tipoviviendaLogic.saveTipoViviendas();//WithConnection
					//tipoviviendaLogic.getSetVersionRowTipoViviendas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoVivienda();
				
				this.tipoviviendasEliminados= new ArrayList<TipoVivienda>();		
			}
			
			if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Vivienda GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipovivienda=tipoviviendaAux;
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
      		//this.finishProcessTipoVivienda();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoVivienda tipoviviendaLocal) throws Exception {
		
		if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoviviendaLocal.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
			
			} else {
			
				tipoviviendaLocal.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoVivienda tipoviviendaLocal) throws Exception {	
		if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoviviendaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoViviendaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoviviendaValidator.getInvalidValues(this.tipovivienda);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoVivienda tipovivienda,List<TipoVivienda> tipoviviendas) throws Exception {
		try	{		
			TipoViviendaConstantesFunciones.actualizarLista(tipovivienda,tipoviviendas,this.tipoviviendaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoVivienda tipovivienda,List<TipoVivienda> tipoviviendas) throws Exception {
		try	{			
			TipoViviendaConstantesFunciones.actualizarSelectedLista(tipovivienda,tipoviviendas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoVivienda> tipoviviendasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoviviendasLocal=this.tipoviviendaLogic.getTipoViviendas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoviviendasLocal=this.tipoviviendas;
			}
			//ARCHITECTURE
		
			for(TipoVivienda tipoviviendaLocal:tipoviviendasLocal) {
				if(this.permiteMantenimiento(tipoviviendaLocal) && tipoviviendaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoViviendaConstantesFunciones.getTipoViviendaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoViviendaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelid_empresaTipoVivienda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoViviendaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelcodigoTipoVivienda,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoViviendaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelnombreTipoVivienda,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVivienda.jLabelid_empresaTipoVivienda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVivienda.jLabelcodigoTipoVivienda,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoVivienda.jLabelnombreTipoVivienda,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Direccion")) {
			if(this.tipovivienda==null) {
				this.tipovivienda= new TipoVivienda();
			}

			if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoVivienda
				this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);

				this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.getdireccion().setTipoVivienda(this.tipovivienda);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoVivienda--;	
		
		
		this.tipoviviendaAux=new TipoVivienda();
		
		this.tipoviviendaAux.setId(this.iIdNuevoTipoVivienda);
		this.tipoviviendaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoviviendaLogic.getTipoViviendas().add(this.tipoviviendaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoviviendas.add(this.tipoviviendaAux);
		}
		//ARCHITECTURE
		
		this.tipovivienda=this.tipoviviendaAux;
		
		if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoVivienda(this.tipovivienda);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVivienda(this.tipovivienda);
		}
				
		//this.setDefaultControlesTipoVivienda();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoVivienda();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoVivienda();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVivienda();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVivienda(this.tipoviviendaBean,this.tipovivienda,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoViviendaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
			classes=TipoViviendaConstantesFunciones.getClassesRelationshipsOfTipoVivienda(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoviviendaReturnGeneral=tipoviviendaLogic.procesarEventosTipoViviendasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoviviendaLogic.getTipoViviendas(),this.tipovivienda,this.tipoviviendaParameterGeneral,this.isEsNuevoTipoVivienda,classes);//this.tipoviviendaLogic.getTipoVivienda()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoVivienda(this.tipoviviendaReturnGeneral,this.tipoviviendaBean,false);
		
		if(this.tipoviviendaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda());
		}
		
		if(this.tipoviviendaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda(),classes);//this.tipoviviendaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoVivienda();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoVivienda();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoViviendaBeanSwingJInternalFrameAdditional.RecargarFormTipoVivienda(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoVivienda(false);
						
			if(tipoviviendaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado() && DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDireccionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVivienda();
			}
			
			this.actualizarVisualTableDatosTipoVivienda();
			
			this.jTableDatosTipoVivienda.setRowSelectionInterval(this.getIndiceNuevoTipoVivienda(), this.getIndiceNuevoTipoVivienda());
			
			this.seleccionarFilaTablaTipoViviendaActual();
						
			this.actualizarEstadoCeldasBotonesTipoVivienda("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoVivienda(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setEnabled(isHabilitar && this.tipoviviendaConstantesFunciones.activarcodigoTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setEnabled(isHabilitar && this.tipoviviendaConstantesFunciones.activarnombreTipoVivienda);	
		//
		this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setEnabled(isHabilitar && this.tipoviviendaConstantesFunciones.activarid_empresaTipoVivienda);
	};
	
	public void setDefaultControlesTipoVivienda() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoVivienda(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoviviendaSessionBean.setConGuardarRelaciones(true);			
			this.tipoviviendaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoviviendaSessionBean.setConGuardarRelaciones(false);			
			this.tipoviviendaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoVivienda() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
				if(tipoviviendaAux.getId().equals(this.iIdNuevoTipoVivienda)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendas) {
				if(tipoviviendaAux.getId().equals(this.iIdNuevoTipoVivienda)) {
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
	
	public int getIndiceActualTipoVivienda(TipoVivienda tipovivienda,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
				if(tipoviviendaAux.getId().equals(tipovivienda.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendas) {
				if(tipoviviendaAux.getId().equals(tipovivienda.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoVivienda(TipoVivienda tipoviviendaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
				if(tipoviviendaAux.getTipoViviendaOriginal().getId().equals(tipoviviendaOriginal.getId())) {
					existe=true;
					tipoviviendaOriginal.setId(tipoviviendaAux.getId());
					tipoviviendaOriginal.setVersionRow(tipoviviendaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVivienda tipoviviendaAux:this.tipoviviendas) {
				if(tipoviviendaAux.getTipoViviendaOriginal().getId().equals(tipoviviendaOriginal.getId())) {
					existe=true;
					tipoviviendaOriginal.setId(tipoviviendaAux.getId());
					tipoviviendaOriginal.setVersionRow(tipoviviendaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoVivienda(Boolean esParaCancelar) throws Exception {
		tipoviviendasAux=new ArrayList<TipoVivienda>();
		tipoviviendaAux=new TipoVivienda();
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
					if(tipoviviendaAux.getId()<0) {
						tipoviviendasAux.add(tipoviviendaAux);
					}		
				}
				this.iIdNuevoTipoVivienda=0L;
				this.tipoviviendaLogic.getTipoViviendas().removeAll(tipoviviendasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVivienda tipoviviendaAux:this.tipoviviendas) {
					if(tipoviviendaAux.getId()<0) {
						tipoviviendasAux.add(tipoviviendaAux);
					}		
				}
				this.iIdNuevoTipoVivienda=0L;
				this.tipoviviendas.removeAll(tipoviviendasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoVivienda 
					&& this.tipoviviendaLogic.getTipoViviendas().size()>0
					) {
					tipoviviendaAux=this.tipoviviendaLogic.getTipoViviendas().get(this.tipoviviendaLogic.getTipoViviendas().size() - 1);
				
					if(tipoviviendaAux.getId()<0) {
						this.tipoviviendaLogic.getTipoViviendas().remove(tipoviviendaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoVivienda && this.tipoviviendas.size()>0) {
					tipoviviendaAux=this.tipoviviendas.get(this.tipoviviendas.size() - 1);
				
					if(tipoviviendaAux.getId()<0) {
						this.tipoviviendas.remove(tipoviviendaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoVivienda(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipovivienda.getId()<0) {
				this.tipoviviendaLogic.getTipoViviendas().remove(this.tipovivienda);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipovivienda.getId()<0) {
				this.tipoviviendas.remove(this.tipovivienda);
			}
		}			
	}
	
	public void setEstadosInicialesTipoVivienda(List<TipoVivienda> tipoviviendasAux) throws Exception {
		TipoViviendaConstantesFunciones.setEstadosInicialesTipoVivienda(tipoviviendasAux);
	}
	
	public void setEstadosInicialesTipoVivienda(TipoVivienda tipoviviendaAux) throws Exception {
		TipoViviendaConstantesFunciones.setEstadosInicialesTipoVivienda(tipoviviendaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoViviendaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoViviendaActual()) {
				if(!this.isEsNuevoTipoVivienda) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoVivienda=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoViviendaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Vivienda ?", "MANTENIMIENTO DE Tipo Vivienda", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoVivienda tipovivienda) throws Exception {
		TipoViviendaConstantesFunciones.seleccionarAsignar(this.tipovivienda,tipovivienda);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoVivienda=this.isPermisoActualizarOriginalTipoVivienda;
			
			
			this.seleccionarAsignar(tipovivienda);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoViviendaConstantesFunciones.quitarEspaciosTipoVivienda(this.tipovivienda,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoVivienda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoviviendaSessionBean.setsFuncionBusquedaRapida(this.tipoviviendaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoVivienda) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoVivienda(esParaCancelar);				
				this.cancelarNuevoTipoVivienda(esParaCancelar);								
			}
			
			this.tipovivienda=new TipoVivienda();
			
			this.inicializarTipoVivienda();
			
			this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoVivienda() throws Exception {
		try {
			TipoViviendaConstantesFunciones.inicializarTipoVivienda(this.tipovivienda);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoviviendaLogic.getTipoViviendas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoViviendas(String sAccionBusqueda,List<TipoVivienda> tipoviviendasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoVivienda"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoViviendaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoViviendaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoVivienda"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Viviendas");		
		parameters.put("busquedapor", TipoViviendaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Direccion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoViviendaLogic tipoviviendaLogicAuxiliar=new TipoViviendaLogic();
					tipoviviendaLogicAuxiliar.setDatosCliente(tipoviviendaLogic.getDatosCliente());				
					tipoviviendaLogicAuxiliar.setTipoViviendas(tipoviviendasParaReportes);
					
					tipoviviendaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoViviendaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoviviendasParaReportes=tipoviviendaLogicAuxiliar.getTipoViviendas();
					
					//tipoviviendaLogic.getNewConnexionToDeep();
					
					//for (TipoVivienda tipovivienda:tipoviviendasParaReportes) {
					//	tipoviviendaLogic.deepLoad(tipovivienda, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoviviendaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoviviendaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDireccion = AuxiliarReportes.class.getResourceAsStream("DireccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_direccion", reportFileDireccion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoVivienda=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoViviendaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoViviendaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoVivienda=new JRBeanArrayDataSource(TipoViviendaJInternalFrame.TraerTipoViviendaBeans(tipoviviendasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoVivienda);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoViviendaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoViviendaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoViviendaBean.TraerTipoViviendaBeans(tipoviviendasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoViviendaActionPerformed(null);
					//this.generarExcelReporteTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoViviendas(sAccionBusqueda,sTipoArchivoReporte,tipoviviendasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoViviendas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVivienda> tipoviviendasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViviendas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVivienda("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoVivienda tipovivienda : tipoviviendasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoViviendaConstantesFunciones.generarExcelReporteDataTipoVivienda("NORMAL",row,workbook,tipovivienda,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoVivienda(String sTipo,Row row,Workbook workbook) {
		
		TipoViviendaConstantesFunciones.generarExcelReporteHeaderTipoVivienda(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoViviendas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVivienda> tipoviviendasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViviendas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoVivienda tipovivienda : tipoviviendasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoViviendaConstantesFunciones.getTipoViviendaDescripcion(tipovivienda));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovivienda.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoViviendaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovivienda.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoViviendaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipovivienda.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoViviendas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoVivienda> tipoviviendasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoVivienda> tipoviviendasRespaldo=null;
		
		classes=TipoViviendaConstantesFunciones.getClassesRelationshipsOfTipoVivienda(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoviviendaLogic.setDatosCliente(this.datosCliente);
		this.tipoviviendaLogic.setDatosDeep(this.datosDeep);
		this.tipoviviendaLogic.setIsConDeep(true);
		
		tipoviviendasRespaldo=this.tipoviviendaLogic.getTipoViviendas();
		
		this.tipoviviendaLogic.setTipoViviendas(tipoviviendasParaReportes);	
		this.tipoviviendaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoviviendasParaReportes=this.tipoviviendaLogic.getTipoViviendas();
		this.tipoviviendaLogic.setTipoViviendas(tipoviviendasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoViviendas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoVivienda("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoVivienda tipovivienda : tipoviviendasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoVivienda("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoViviendaConstantesFunciones.generarExcelReporteDataTipoVivienda("NORMAL",row,workbook,tipovivienda,cellStyleDataAux);
		
			
			


				//Direccion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DireccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipovivienda.getDireccions()!=null && tipovivienda.getDireccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DireccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DireccionConstantesFunciones.generarExcelReporteHeaderDireccion("RELACIONADO",row,workbook);
				}

				if(tipovivienda.getDireccions()!=null) {
					i2=0;
					for(Direccion direccion : tipovivienda.getDireccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DireccionConstantesFunciones.generarExcelReporteDataDireccion("RELACIONADO",row,workbook,direccion,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoViviendaConstantesFunciones.getTipoViviendaDescripcion(tipovivienda));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVivienda.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoVivienda() throws Exception {		
		this.startProcessTipoVivienda(true);
	}
	
	public void startProcessTipoVivienda(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoVivienda ,this.jPanelParametrosReportesTipoVivienda, this.jScrollPanelDatosTipoVivienda,this.jPanelPaginacionTipoVivienda, this.jScrollPanelDatosEdicionTipoVivienda, this.jPanelAccionesTipoVivienda,this.jPanelAccionesFormularioTipoVivienda,this.jmenuBarTipoVivienda,this.jmenuBarDetalleTipoVivienda,this.jTtoolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVivienda=this.jTabbedPaneBusquedasTipoVivienda; 
		
		final JPanel jPanelParametrosReportesTipoVivienda=this.jPanelParametrosReportesTipoVivienda;
		//final JScrollPane jScrollPanelDatosTipoVivienda=this.jScrollPanelDatosTipoVivienda;
		final JTable jTableDatosTipoVivienda=this.jTableDatosTipoVivienda;		
		final JPanel jPanelPaginacionTipoVivienda=this.jPanelPaginacionTipoVivienda;
		//final JScrollPane jScrollPanelDatosEdicionTipoVivienda=this.jScrollPanelDatosEdicionTipoVivienda;
		final JPanel jPanelAccionesTipoVivienda=this.jPanelAccionesTipoVivienda;
		
		JPanel jPanelCamposAuxiliarTipoVivienda=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoVivienda=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			jPanelCamposAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jPanelCamposTipoVivienda;
			jPanelAccionesFormularioAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jPanelAccionesFormularioTipoVivienda;
		}
		
		final JPanel jPanelCamposTipoVivienda=jPanelCamposAuxiliarTipoVivienda;
		final JPanel jPanelAccionesFormularioTipoVivienda=jPanelAccionesFormularioAuxiliarTipoVivienda;
		
		
		final JMenuBar jmenuBarTipoVivienda=this.jmenuBarTipoVivienda;
		final JToolBar jTtoolBarTipoVivienda=this.jTtoolBarTipoVivienda;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoVivienda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVivienda=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			jmenuBarDetalleAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jmenuBarDetalleTipoVivienda;
			jTtoolBarDetalleAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jTtoolBarDetalleTipoVivienda;
		}
		
		final JMenuBar jmenuBarDetalleTipoVivienda=jmenuBarDetalleAuxiliarTipoVivienda;
		final JToolBar jTtoolBarDetalleTipoVivienda=jTtoolBarDetalleAuxiliarTipoVivienda;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVivienda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVivienda;
			processRunnable.jTableDatos=jTableDatosTipoVivienda;
			processRunnable.jPanelCampos=jPanelCamposTipoVivienda;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVivienda;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVivienda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVivienda;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVivienda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVivienda;
			processRunnable.jTtoolBar=jTtoolBarTipoVivienda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVivienda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVivienda ,jPanelParametrosReportesTipoVivienda,jTableDatosTipoVivienda, /*jScrollPanelDatosTipoVivienda,*/jPanelCamposTipoVivienda,jPanelPaginacionTipoVivienda, /*jScrollPanelDatosEdicionTipoVivienda,*/ jPanelAccionesTipoVivienda,jPanelAccionesFormularioTipoVivienda,jmenuBarTipoVivienda,jmenuBarDetalleTipoVivienda,jTtoolBarTipoVivienda,jTtoolBarDetalleTipoVivienda);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoVivienda ,jPanelParametrosReportesTipoVivienda, jScrollPanelDatosTipoVivienda,jPanelPaginacionTipoVivienda, jScrollPanelDatosEdicionTipoVivienda, jPanelAccionesTipoVivienda,jPanelAccionesFormularioTipoVivienda,jmenuBarTipoVivienda,jmenuBarDetalleTipoVivienda,jTtoolBarTipoVivienda,jTtoolBarDetalleTipoVivienda);
						
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
	
	public void finishProcessTipoVivienda() {// throws Exception 
		this.finishProcessTipoVivienda(true);
	}
	
	public void finishProcessTipoVivienda(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoVivienda ,this.jPanelParametrosReportesTipoVivienda, this.jScrollPanelDatosTipoVivienda,this.jPanelPaginacionTipoVivienda, this.jScrollPanelDatosEdicionTipoVivienda, this.jPanelAccionesTipoVivienda,this.jPanelAccionesFormularioTipoVivienda,this.jmenuBarTipoVivienda,this.jmenuBarDetalleTipoVivienda,this.jTtoolBarTipoVivienda,this.jTtoolBarDetalleTipoVivienda);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoVivienda=this.jTabbedPaneBusquedasTipoVivienda; 
		
		final JPanel jPanelParametrosReportesTipoVivienda=this.jPanelParametrosReportesTipoVivienda;
		//final JScrollPane jScrollPanelDatosTipoVivienda=this.jScrollPanelDatosTipoVivienda;
		final JTable jTableDatosTipoVivienda=this.jTableDatosTipoVivienda;		
		final JPanel jPanelPaginacionTipoVivienda=this.jPanelPaginacionTipoVivienda;
		//final JScrollPane jScrollPanelDatosEdicionTipoVivienda=this.jScrollPanelDatosEdicionTipoVivienda;
		final JPanel jPanelAccionesTipoVivienda=this.jPanelAccionesTipoVivienda;
		
		JPanel jPanelCamposAuxiliarTipoVivienda=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoVivienda=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			jPanelCamposAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jPanelCamposTipoVivienda;
			jPanelAccionesFormularioAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jPanelAccionesFormularioTipoVivienda;
		}
		
		final JPanel jPanelCamposTipoVivienda=jPanelCamposAuxiliarTipoVivienda;
		final JPanel jPanelAccionesFormularioTipoVivienda=jPanelAccionesFormularioAuxiliarTipoVivienda;
		
		
		final JMenuBar jmenuBarTipoVivienda=this.jmenuBarTipoVivienda;		
		final JToolBar jTtoolBarTipoVivienda=this.jTtoolBarTipoVivienda;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoVivienda=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoVivienda=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			jmenuBarDetalleAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jmenuBarDetalleTipoVivienda;
			jTtoolBarDetalleAuxiliarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jTtoolBarDetalleTipoVivienda;		
		}
		
		final JMenuBar jmenuBarDetalleTipoVivienda=jmenuBarDetalleAuxiliarTipoVivienda;
		final JToolBar jTtoolBarDetalleTipoVivienda=jTtoolBarDetalleAuxiliarTipoVivienda;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoVivienda;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoVivienda;
			processRunnable.jTableDatos=jTableDatosTipoVivienda;
			processRunnable.jPanelCampos=jPanelCamposTipoVivienda;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoVivienda;
			processRunnable.jPanelAcciones=jPanelAccionesTipoVivienda;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoVivienda;
			
			
			processRunnable.jmenuBar=jmenuBarTipoVivienda;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoVivienda;
			processRunnable.jTtoolBar=jTtoolBarTipoVivienda;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoVivienda;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoVivienda ,jPanelParametrosReportesTipoVivienda, jTableDatosTipoVivienda,/*jScrollPanelDatosTipoVivienda,*/jPanelCamposTipoVivienda,jPanelPaginacionTipoVivienda, /*jScrollPanelDatosEdicionTipoVivienda,*/ jPanelAccionesTipoVivienda,jPanelAccionesFormularioTipoVivienda,jmenuBarTipoVivienda,jmenuBarDetalleTipoVivienda,jTtoolBarTipoVivienda,jTtoolBarDetalleTipoVivienda));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoVivienda(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoVivienda(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoVivienda(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoVivienda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoVivienda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoVivienda,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoVivienda(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoVivienda,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoVivienda,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoviviendaConstantesFunciones.getsFinalQueryTipoVivienda();
		String  finalQueryPaginacionTodos=this.tipoviviendaConstantesFunciones.getsFinalQueryTipoVivienda();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoViviendaConstantesFunciones.getArrayColumnasGlobalesNoTipoVivienda(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoViviendaConstantesFunciones.getArrayColumnasGlobalesTipoVivienda(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoViviendaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoviviendasEliminados= new ArrayList<TipoVivienda>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoVivienda();
		
				///*TipoViviendaSessionBean*/this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
			
			if(this.tipoviviendaSessionBean==null) {
				this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
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
					this.iNumeroPaginacion=TipoViviendaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoViviendaConstantesFunciones.getClassesForeignKeysOfTipoVivienda(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipovivienda."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoviviendasAux= new ArrayList<TipoVivienda>();
			
				
			tipoviviendaLogic.setDatosCliente(this.datosCliente);
			tipoviviendaLogic.setDatosDeep(this.datosDeep);
			tipoviviendaLogic.setIsConDeep(true);
			
			
			tipoviviendaLogic.getTipoViviendaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoviviendaLogic.getTodosTipoViviendas(finalQueryGlobal,pagination);
					
					//tipoviviendaLogic.getTodosTipoViviendasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoviviendaLogic.getTipoViviendas()==null|| tipoviviendaLogic.getTipoViviendas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviviendasAux= new ArrayList<TipoVivienda>();
							tipoviviendasAux.addAll(tipoviviendaLogic.getTipoViviendas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviviendasAux= new ArrayList<TipoVivienda>();
							tipoviviendasAux.addAll(tipoviviendas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviviendaLogic.getTodosTipoViviendas(finalQueryGlobal+"",this.pagination);												
							
							//tipoviviendaLogic.getTodosTipoViviendasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoViviendas("Todos",tipoviviendaLogic.getTipoViviendas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoviviendaLogic.setTipoViviendas(new ArrayList<TipoVivienda>());					
							tipoviviendaLogic.getTipoViviendas().addAll(tipoviviendasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviviendas=new ArrayList<TipoVivienda>();
							tipoviviendas.addAll(tipoviviendasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoVivienda=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoVivienda=this.idActual;
				
				} else if(this.idTipoViviendaActual!=null && this.idTipoViviendaActual!=0L) {
					idTipoVivienda=idTipoViviendaActual;
				}
				
					
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndicePorId(idTipoVivienda);
				
				this.tipoviviendas=new ArrayList<TipoVivienda>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoviviendaLogic.getEntity(idTipoVivienda);
					
					//tipoviviendaLogic.getEntityWithConnection(idTipoVivienda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviviendaLogic.setTipoViviendas(new ArrayList<TipoVivienda>());
					tipoviviendaLogic.getTipoViviendas().add(tipoviviendaLogic.getTipoVivienda());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoviviendas=new ArrayList<TipoVivienda>();
					this.tipoviviendas.add(tipovivienda);
				}
				
				if(tipoviviendaLogic.getTipoVivienda()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoviviendaLogic.getTipoViviendasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoviviendaLogic.getTipoViviendas()==null||tipoviviendaLogic.getTipoViviendas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoviviendas==null|| tipoviviendas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendasAux=new ArrayList<TipoVivienda>();
						tipoviviendasAux.addAll(tipoviviendaLogic.getTipoViviendas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviviendasAux=new ArrayList<TipoVivienda>();
							tipoviviendasAux.addAll(tipoviviendas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoviviendaLogic.getTipoViviendasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoViviendaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoViviendas("FK_IdEmpresa",tipoviviendaLogic.getTipoViviendas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoViviendas("FK_IdEmpresa",tipoviviendas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaLogic.setTipoViviendas(new ArrayList<TipoVivienda>());
						tipoviviendaLogic.getTipoViviendas().addAll(tipoviviendasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviviendas=new ArrayList<TipoVivienda>();
							tipoviviendas.addAll(tipoviviendasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoVivienda();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoVivienda();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoviviendaLogic.getTipoViviendas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviviendas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoviviendaLogic.getTipoViviendas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoviviendas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoVivienda tipovivienda) {
		Boolean permite=true;
		
		if(this.tipovivienda.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoViviendaConstantesFunciones.getOrderByListaTipoVivienda();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoViviendaConstantesFunciones.getOrderByListaTipoVivienda();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVivienda tipovivienda:tipoviviendaLogic.getTipoViviendas()) {
				if(tipovivienda.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviviendaTotales=tipovivienda;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVivienda tipovivienda:this.tipoviviendas) {
				if(tipovivienda.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviviendaTotales=tipovivienda;
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
			this.tipoviviendaAux=new TipoVivienda();
			this.tipoviviendaAux.setsType(Constantes2.S_TOTALES);
			this.tipoviviendaAux.setIsNew(false);
			this.tipoviviendaAux.setIsChanged(false);
			this.tipoviviendaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoViviendaConstantesFunciones.TotalizarValoresFilaTipoVivienda(this.tipoviviendaLogic.getTipoViviendas(),this.tipoviviendaAux);
				
				this.tipoviviendaLogic.getTipoViviendas().add(this.tipoviviendaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoViviendaConstantesFunciones.TotalizarValoresFilaTipoVivienda(this.tipoviviendas,this.tipoviviendaAux);
				
				this.tipoviviendas.add(this.tipoviviendaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoviviendaTotales=new TipoVivienda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoviviendaLogic.getTipoViviendas().remove(tipoviviendaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoviviendas.remove(tipoviviendaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoviviendaTotales=new TipoVivienda();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoVivienda tipovivienda:tipoviviendaLogic.getTipoViviendas()) {
				if(tipovivienda.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviviendaTotales=tipovivienda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoViviendaConstantesFunciones.TotalizarValoresFilaTipoVivienda(this.tipoviviendaLogic.getTipoViviendas(),tipoviviendaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoVivienda tipovivienda:this.tipoviviendas) {
				if(tipovivienda.getsType().equals(Constantes2.S_TOTALES)) {
					tipoviviendaTotales=tipovivienda;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoViviendaConstantesFunciones.TotalizarValoresFilaTipoVivienda(this.tipoviviendas,tipoviviendaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoViviendasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoViviendasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviviendaLogic.getTipoViviendasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoVivienda() {
		this.isPermisoTodoTipoVivienda=false;
		this.isPermisoNuevoTipoVivienda=false;
		this.isPermisoActualizarTipoVivienda=false;
		this.isPermisoActualizarOriginalTipoVivienda=false;
		this.isPermisoEliminarTipoVivienda=false;
		this.isPermisoGuardarCambiosTipoVivienda=false;
		this.isPermisoConsultaTipoVivienda=false;
		this.isPermisoBusquedaTipoVivienda=false;
		this.isPermisoReporteTipoVivienda=false;		
		this.isPermisoOrdenTipoVivienda=false;		
		this.isPermisoPaginacionMedioTipoVivienda=false;		
		this.isPermisoPaginacionAltoTipoVivienda=false;
		this.isPermisoPaginacionTodoTipoVivienda=false;
		this.isPermisoCopiarTipoVivienda=false;		
		this.isPermisoVerFormTipoVivienda=false;		
		this.isPermisoDuplicarTipoVivienda=false;		
		this.isPermisoOrdenTipoVivienda=false;		
	}
	
	public void setPermisosUsuarioTipoVivienda(Boolean isPermiso) {
		this.isPermisoTodoTipoVivienda=isPermiso;
		this.isPermisoNuevoTipoVivienda=isPermiso;
		this.isPermisoActualizarTipoVivienda=isPermiso;
		this.isPermisoActualizarOriginalTipoVivienda=isPermiso;
		this.isPermisoEliminarTipoVivienda=isPermiso;
		this.isPermisoGuardarCambiosTipoVivienda=isPermiso;
		this.isPermisoConsultaTipoVivienda=isPermiso;
		this.isPermisoBusquedaTipoVivienda=isPermiso;
		this.isPermisoReporteTipoVivienda=isPermiso;
		this.isPermisoOrdenTipoVivienda=isPermiso;		
		this.isPermisoPaginacionMedioTipoVivienda=isPermiso;		
		this.isPermisoPaginacionAltoTipoVivienda=isPermiso;		
		this.isPermisoPaginacionTodoTipoVivienda=isPermiso;		
		this.isPermisoCopiarTipoVivienda=isPermiso;		
		this.isPermisoVerFormTipoVivienda=isPermiso;		
		this.isPermisoDuplicarTipoVivienda=isPermiso;
		this.isPermisoOrdenTipoVivienda=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoVivienda(Boolean isPermiso) {
		//this.isPermisoTodoTipoVivienda=isPermiso;
		this.isPermisoNuevoTipoVivienda=isPermiso;
		this.isPermisoActualizarTipoVivienda=isPermiso;
		this.isPermisoActualizarOriginalTipoVivienda=isPermiso;
		this.isPermisoEliminarTipoVivienda=isPermiso;
		this.isPermisoGuardarCambiosTipoVivienda=isPermiso;
		//this.isPermisoConsultaTipoVivienda=isPermiso;
		//this.isPermisoBusquedaTipoVivienda=isPermiso;
		//this.isPermisoReporteTipoVivienda=isPermiso;
		//this.isPermisoOrdenTipoVivienda=isPermiso;		
		//this.isPermisoPaginacionMedioTipoVivienda=isPermiso;		
		//this.isPermisoPaginacionAltoTipoVivienda=isPermiso;		
		//this.isPermisoPaginacionTodoTipoVivienda=isPermiso;		
		//this.isPermisoCopiarTipoVivienda=isPermiso;		
		//this.isPermisoDuplicarTipoVivienda=isPermiso;
		//this.isPermisoOrdenTipoVivienda=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoViviendaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DireccionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoViviendaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDireccion=false;
		this.isTienePermisosDireccion=this.verificarGetPermisosUsuarioOpcionTipoViviendaClaseRelacionada(this.opcionsRelacionadas,DireccionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoVivienda(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoViviendaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDireccion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoViviendaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoViviendaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoViviendaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDireccion && this.jInternalFrameDetalleFormTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.remove(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoVivienda() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoViviendaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoViviendaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoVivienda=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoVivienda=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoVivienda=this.isPermisoActualizarTipoVivienda;
			this.isPermisoEliminarTipoVivienda=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoVivienda=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoVivienda=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoVivienda=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoVivienda=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoVivienda=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVivienda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoVivienda=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoVivienda=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoVivienda=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoVivienda=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoVivienda=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoVivienda=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoVivienda=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoVivienda.setToolTipText(this.jTableDatosTipoVivienda.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoVivienda(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoVivienda(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoViviendaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoViviendaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoVivienda() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDireccion && this.tipoviviendaConstantesFunciones.mostrarDireccionTipoVivienda && !TipoViviendaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Direccion");
			reporte.setsDescripcion("Direccion");
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
	public void inicializarCombosForeignKeyTipoViviendaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoViviendaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoViviendaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoViviendaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoViviendaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoViviendaParameterReturnGeneral tipoviviendaReturnGeneral=new TipoViviendaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoviviendaConstantesFunciones.cargarid_empresaTipoVivienda)
					 || (this.esRecargarFks && this.tipoviviendaConstantesFunciones.cargarid_empresaTipoVivienda)) {

					if(!this.tipoviviendaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoviviendaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoviviendaReturnGeneral=tipoviviendaLogic.cargarCombosLoteForeignKeyTipoVivienda(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoviviendaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoVivienda()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoviviendaSessionBean==null) {
				this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
			}

			if(!this.tipoviviendaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoVivienda()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoVivienda(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoVivienda()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVivienda();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoVivienda(TipoVivienda tipovivienda)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoVivienda(TipoVivienda tipovivienda,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoVivienda()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoVivienda()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoVivienda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoVivienda()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoVivienda()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoVivienda()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoVivienda(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoVivienda()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoViviendaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoViviendaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoViviendaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoviviendaSessionBean=new TipoViviendaSessionBean(); 
		this.tipoviviendaConstantesFunciones=new TipoViviendaConstantesFunciones(); 
		this.tipoviviendaBean=new TipoVivienda();//(this.tipoviviendaConstantesFunciones); 		
		this.tipoviviendaReturnGeneral=new TipoViviendaParameterReturnGeneral(); 
		
		this.tipoviviendaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviviendaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoViviendaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoViviendaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoViviendaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoVivienda(true);
			
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
			
			this.tipoviviendaConstantesFunciones=new TipoViviendaConstantesFunciones(); 
			this.tipoviviendaBean=new TipoVivienda();//this.tipoviviendaConstantesFunciones); 			
			this.tipoviviendaReturnGeneral=new TipoViviendaParameterReturnGeneral(); 
		
			TipoViviendaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Vivienda Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipovivienda=new TipoVivienda();
			this.tipoviviendas = new ArrayList<TipoVivienda>();
			this.tipoviviendasAux = new ArrayList<TipoVivienda>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic=new TipoViviendaLogic();
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoviviendaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoviviendaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoVivienda);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVivienda);	
					}
					
					if(this.jInternalFrameImportacionTipoVivienda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVivienda);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoVivienda!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoVivienda);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVivienda);
				this.jInternalFrameDetalleFormTipoVivienda.setVisible(false);
				this.jInternalFrameDetalleFormTipoVivienda.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVivienda);
					this.jInternalFrameReporteDinamicoTipoVivienda.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoVivienda.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoVivienda!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoVivienda);
					this.jInternalFrameImportacionTipoVivienda.setVisible(false);
					this.jInternalFrameImportacionTipoVivienda.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoVivienda!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoVivienda);
					this.jInternalFrameOrderByTipoVivienda.setVisible(false);
					this.jInternalFrameOrderByTipoVivienda.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoViviendaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoViviendaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoviviendaReturnGeneral=new TipoViviendaParameterReturnGeneral();
			
			this.tipoviviendaParameterGeneral=new TipoViviendaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoviviendaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoViviendaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DireccionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoViviendaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoviviendaSessionBean.getEsGuardarRelacionado(),this.tipoviviendaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoViviendaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoviviendaSessionBean.getEsGuardarRelacionado(),this.tipoviviendaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaDuplicarTipoVivienda=true;
			this.isVisibilidadCeldaCopiarTipoVivienda=true;
			this.isVisibilidadCeldaVerFormTipoVivienda=true;
			this.isVisibilidadCeldaOrdenTipoVivienda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=false;
			this.isVisibilidadCeldaGuardarTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoVivienda();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoVivienda(false);
			
			this.setPermisosUsuarioTipoVivienda();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoviviendaSessionBean.getEsGuardarRelacionado() && this.tipoviviendaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoViviendaClasesRelacionadas();
			}
			
			if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoViviendaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoVivienda();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoVivienda();
			}
			
			if(!this.isPermisoBusquedaTipoVivienda) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoVivienda,this.isPermisoPaginacionMedioTipoVivienda,this.isPermisoPaginacionTodoTipoVivienda);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoViviendaConstantesFunciones.getTiposSeleccionarTipoVivienda());
				
				this.tiposColumnasSelect=TipoViviendaConstantesFunciones.getTiposSeleccionarTipoVivienda(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoVivienda();				
				//this.tiposRelacionesSelect=TipoViviendaConstantesFunciones.getTiposRelacionesTipoVivienda(true);
				
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
			//if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoVivienda();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoVivienda(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoVivienda(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVivienda() ;
			
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
			
			
			this.direccionLogic=new DireccionLogic(); 
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
				tipoviviendaImplementable= (TipoViviendaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoViviendaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoviviendaImplementableHome= (TipoViviendaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoViviendaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoviviendas= new ArrayList<TipoVivienda>();
			this.tipoviviendasEliminados= new ArrayList<TipoVivienda>();
						
			this.isEsNuevoTipoVivienda=false;
			this.esParaAccionDesdeFormularioTipoVivienda=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoVivienda(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoVivienda();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoViviendaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoViviendaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoVivienda("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoVivienda(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoVivienda();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoVivienda();
			}
			
			TipoViviendaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoVivienda.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoVivienda.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoVivienda.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoVivienda(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoVivienda: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoVivienda() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DireccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DireccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoVivienda")) {
				iIndex=this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();	
				
				

				if(sTitle.equals("Direcciones")) {
					if(!DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoVivienda();

						this.cargarParteTabPanelRelacionadaDireccion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoVivienda();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDireccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoVivienda.cargarSessionConBeanSwingJInternalFrameDireccion(false,true,iIndex);
		this.jButtonDireccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDireccion();

		//this.jTabbedPaneRelacionesTipoVivienda.updateUI();
		//this.jTabbedPaneRelacionesTipoVivienda.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoVivienda.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Direccion")) {
				int row=this.jTableDatosTipoVivienda.getSelectedRow();
				jButtonDireccionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Direccion")) {

					if(this.isTienePermisosDireccion && this.tipoviviendaConstantesFunciones.mostrarDireccionTipoVivienda && !TipoViviendaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Direcciones"+"("+DireccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Direcciones");

						if(tipoviviendaConstantesFunciones.resaltarDireccionTipoVivienda!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoviviendaConstantesFunciones.resaltarDireccionTipoVivienda);
						}

						jmenuItem.setEnabled(this.tipoviviendaConstantesFunciones.activarDireccionTipoVivienda);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Direccion"));

						

						this.jInternalFrameDetalleFormTipoVivienda.jmenuDetalleTipoVivienda.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoVivienda(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoVivienda(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoVivienda(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoViviendaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoVivienda();
		
		this.cargarCombosFrameForeignKeyTipoVivienda();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoVivienda();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoVivienda();
		}
	}
	
	
	
	public void jButtonNuevoTipoViviendaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			
			if(jTableDatosTipoVivienda.getRowCount()>=1) {
				jTableDatosTipoVivienda.removeRowSelectionInterval(0, jTableDatosTipoVivienda.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoVivienda=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoVivienda(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoVivienda(true);			
			//this.tipovivienda=new TipoVivienda();
			//this.tipovivienda.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVivienda(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVivienda() ;
			
			if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVivienda(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipovivienda);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);				
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoVivienda: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoViviendaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoVivienda.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoVivienda.getSelectedRows().length;			
			}
			
			tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoVivienda--;			
				//TipoVivienda tipoviviendaAux= new TipoVivienda();			
				//tipoviviendaAux.setId(this.iIdNuevoTipoVivienda);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoVivienda tipoviviendaOrigen=new TipoVivienda();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoVivienda tipoviviendaOrigen : tipoviviendasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoviviendaOrigen =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoviviendaOrigen =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoVivienda();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipovivienda.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoVivienda(tipoviviendaOrigen,this.tipovivienda,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoviviendaLogic.getTipoViviendas().add(this.tipoviviendaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoviviendas.add(this.tipoviviendaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoVivienda(false);
				
				this.jTableDatosTipoVivienda.setRowSelectionInterval(this.getIndiceNuevoTipoVivienda(), this.getIndiceNuevoTipoVivienda());
				
				int iLastRow =  this.jTableDatosTipoVivienda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVivienda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVivienda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVivienda(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();									
		
			TipoVivienda tipoviviendaOrigen=new TipoVivienda();
			TipoVivienda tipoviviendaDestino=new TipoVivienda();
				
			tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoVivienda.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoviviendasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoVivienda.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaOrigen =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoviviendaOrigen =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoviviendaDestino =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoviviendaDestino =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoviviendaOrigen =tipoviviendasSeleccionados.get(0);
				tipoviviendaDestino =tipoviviendasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoVivienda(tipoviviendaOrigen,tipoviviendaDestino,true,false);
				
				tipoviviendaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoviviendaDestino,tipoviviendaLogic.getTipoViviendas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoviviendaDestino,tipoviviendas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoVivienda(false);
				
				//this.jTableDatosTipoVivienda.setRowSelectionInterval(this.getIndiceNuevoTipoVivienda(), this.getIndiceNuevoTipoVivienda());
				
				int iLastRow =  this.jTableDatosTipoVivienda.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoVivienda.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoVivienda.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVivienda(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoVivienda.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoVivienda.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoVivienda.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoVivienda.setVisible(!isVisible);
			this.jPanelPaginacionTipoVivienda.setVisible(!isVisible);
			this.jPanelAccionesTipoVivienda.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoVivienda();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoVivienda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoVivienda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoVivienda();
			
			this.abrirFrameOrderByTipoVivienda();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoVivienda();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoVivienda(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVivienda);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoVivienda.isMaximum()) {
					this.jInternalFrameDetalleFormTipoVivienda.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoVivienda.setSize(this.jInternalFrameDetalleFormTipoVivienda.iWidthFormulario,this.jInternalFrameDetalleFormTipoVivienda.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoVivienda.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoVivienda.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoVivienda.isMaximum()) {
						this.jInternalFrameDetalleFormTipoVivienda.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoVivienda.jContentPaneDetalleTipoVivienda.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoVivienda.jContentPaneDetalleTipoVivienda.getWidth(),TipoViviendaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoVivienda.jContentPaneDetalleTipoVivienda.getWidth(),TipoViviendaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoVivienda.jContentPaneDetalleTipoVivienda.getWidth(),TipoViviendaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDireccion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoVivienda.setVisible(true);
	        this.jInternalFrameDetalleFormTipoVivienda.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoVivienda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoVivienda==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoVivienda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVivienda,false,this);
				} else {
					this.jInternalFrameOrderByTipoVivienda=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoVivienda,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoVivienda);
				this.jInternalFrameOrderByTipoVivienda.setVisible(false);
				this.jInternalFrameOrderByTipoVivienda.setSelected(false);
				
				this.jInternalFrameOrderByTipoVivienda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVivienda"));
				
				this.inicializarActualizarBindingTablaOrderByTipoVivienda();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoVivienda() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoVivienda==null) {
				
				this.jInternalFrameImportacionTipoVivienda=new ImportacionJInternalFrame(TipoViviendaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoVivienda);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoVivienda);
				this.jInternalFrameImportacionTipoVivienda.setVisible(false);
				this.jInternalFrameImportacionTipoVivienda.setSelected(false);


				this.jInternalFrameImportacionTipoVivienda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVivienda"));
				this.jInternalFrameImportacionTipoVivienda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVivienda"));
				this.jInternalFrameImportacionTipoVivienda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVivienda"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoVivienda() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoVivienda==null) {
				this.jInternalFrameReporteDinamicoTipoVivienda=new ReporteDinamicoJInternalFrame(TipoViviendaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoVivienda);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoVivienda);
				this.jInternalFrameReporteDinamicoTipoVivienda.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoVivienda.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVivienda"));
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVivienda"));
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVivienda"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVivienda();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDireccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoVivienda.jContentPaneDetalleTipoVivienda.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoVivienda() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoVivienda);
			
	       	this.jInternalFrameDetalleFormTipoVivienda.setVisible(false);
	        this.jInternalFrameDetalleFormTipoVivienda.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoVivienda.dispose();
			//this.jInternalFrameDetalleFormTipoVivienda=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoVivienda() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoVivienda.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoVivienda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoVivienda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoVivienda.setVisible(true);
	        this.jInternalFrameImportacionTipoVivienda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoVivienda() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoVivienda.setVisible(true);
	        this.jInternalFrameOrderByTipoVivienda.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoVivienda() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoVivienda.setVisible(false);
	        this.jInternalFrameOrderByTipoVivienda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoVivienda() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoVivienda.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoVivienda.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoVivienda() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoVivienda.setVisible(false);
	        this.jInternalFrameImportacionTipoVivienda.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoVivienda(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoVivienda(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoVivienda(true);
			//this.isEsNuevoTipoVivienda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoVivienda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVivienda(false) ;
			
			if(tipoviviendaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado() && DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDireccionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVivienda(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVivienda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoViviendaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoVivienda(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoVivienda(true);
			//this.isEsNuevoTipoVivienda=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipovivienda.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoVivienda("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoVivienda(false) ;
			
			if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoVivienda(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVivienda(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoVivienda(false);
			
			//if(!this.isEsNuevoTipoVivienda) {								
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				
			}
			
			if(this.permiteMantenimiento(this.tipovivienda)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoVivienda=true;
					this.inicializarActualizarBindingTablaTipoVivienda(false);
					this.isEsNuevoTipoVivienda=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoVivienda=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoVivienda=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVivienda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVivienda(false);
				
				this.habilitarDeshabilitarControlesTipoVivienda(false);
			
												
				
				if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoVivienda();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoViviendaActionPerformed(evt,tipoviviendaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoVivienda(this.tipovivienda,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoVivienda.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoviviendaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipovivienda.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				this.tipovivienda.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				this.tipovivienda.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipovivienda)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoViviendaModel) this.jTableDatosTipoVivienda.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoVivienda=true;
				this.inicializarActualizarBindingTablaTipoVivienda(false);
				this.isEsNuevoTipoVivienda=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoVivienda(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVivienda(false);
				
				this.habilitarDeshabilitarControlesTipoVivienda(false);
				
				
				
				if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoVivienda();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoViviendaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoVivienda.getRowCount()>=1) {
				jTableDatosTipoVivienda.removeRowSelectionInterval(0, jTableDatosTipoVivienda.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoVivienda(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoVivienda(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoVivienda(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoVivienda(false) ;
			
			this.isEsNuevoTipoVivienda=false;
			
			if(TipoViviendaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoVivienda();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoVivienda(false);
				
				//SI ES MANUAL
				if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoVivienda();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoVivienda--;			
			//TipoVivienda tipoviviendaAux= new TipoVivienda();			
			//tipoviviendaAux.setId(this.iIdNuevoTipoVivienda);
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoVivienda();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
			
			this.tipovivienda.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoviviendaLogic.getTipoViviendas().add(this.tipoviviendaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoviviendas.add(this.tipoviviendaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoVivienda(false);
			
			this.jTableDatosTipoVivienda.setRowSelectionInterval(this.getIndiceNuevoTipoVivienda(), this.getIndiceNuevoTipoVivienda());
			
			int iLastRow =  this.jTableDatosTipoVivienda.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoVivienda.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoVivienda.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoVivienda(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVivienda(false);
			
			//SI ES MANUAL
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVivienda();
			}
			
			//this.abrirFrameTreeTipoVivienda();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ViviendaS ?", "MANTENIMIENTO DE Tipo Vivienda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoVivienda.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoVivienda();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoviviendaReturnGeneral=tipoviviendaLogic.procesarImportacionTipoViviendasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoviviendaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoViviendaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoVivienda.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoVivienda.setFileImportacion(this.jInternalFrameImportacionTipoVivienda.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoVivienda.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoVivienda.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoVivienda.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoVivienda.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		

		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoViviendaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoViviendaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoViviendaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoViviendaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoViviendaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoVivienda.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoViviendaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoViviendaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoViviendaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoViviendaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoViviendaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoViviendaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoViviendaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoViviendaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoViviendaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoViviendaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoViviendas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoViviendaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoVivienda tipovivienda:tipoviviendasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovivienda.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoViviendaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoVivienda tipovivienda:tipoviviendasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovivienda.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoViviendaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoVivienda tipovivienda:tipoviviendasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipovivienda.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoVivienda(row);				
			//	iRow++;
			//}				
			
			//for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoVivienda(tipoviviendaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVivienda(false);
			
			//SI ES MANUAL
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoVivienda();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVivienda(false);
			
			//SI ES MANUAL
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVivienda();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoViviendaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoVivienda(false);
			
			//SI ES MANUAL
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoVivienda();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoVivienda() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoVivienda.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoVivienda.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoVivienda.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoVivienda.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoVivienda.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoVivienda.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoVivienda.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoVivienda(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoVivienda(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoVivienda(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoVivienda(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoVivienda(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoVivienda(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVivienda(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoVivienda(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoVivienda() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoVivienda();
		
		this.inicializarActualizarBindingBotonesManualTipoVivienda(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVivienda();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoVivienda() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVivienda(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVivienda(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoVivienda.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoVivienda.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoVivienda.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionNuevoTipoVivienda.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionSinCerrarTipoVivienda.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionSinMensajeTipoVivienda.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoVivienda.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoVivienda.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoVivienda.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
				this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionNuevoTipoVivienda.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionSinCerrarTipoVivienda.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoVivienda.jCheckBoxPostAccionSinMensajeTipoVivienda.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoVivienda.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoVivienda.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoVivienda.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoVivienda.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoVivienda.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoVivienda.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoVivienda.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoVivienda.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoVivienda.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoVivienda(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoVivienda(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoVivienda() throws Exception {
		try	{
			if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVivienda();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVivienda() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoVivienda() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoVivienda.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoVivienda.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoVivienda.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoVivienda.addItem(reporte);
			}
			
			
			if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoVivienda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoVivienda.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoVivienda.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoVivienda.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoVivienda.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoVivienda.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoVivienda.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVivienda();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoVivienda() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
				this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
				this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoVivienda.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVivienda.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoVivienda.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoVivienda.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoVivienda.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoVivienda()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoVivienda(Boolean esInicializar) throws Exception {				
		if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoVivienda();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoVivienda() throws Exception {
		this.inicializarActualizarBindingTablaTipoVivienda(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoVivienda() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoViviendaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoViviendaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoVivienda(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoviviendaLogic.getTipoViviendas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoviviendas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoVivienda.setModel(new TipoViviendaModel(this.tipoviviendaLogic.getTipoViviendas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoVivienda.setModel(new TipoViviendaModel(this.tipoviviendas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoVivienda!=null && this.jInternalFrameOrderByTipoVivienda.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoVivienda();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO,tipoviviendaConstantesFunciones.resaltarSeleccionarTipoVivienda,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoViviendaConstantesFunciones.SCLASSWEBTITULO,tipoviviendaConstantesFunciones.resaltarSeleccionarTipoVivienda,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,TipoViviendaConstantesFunciones.LABEL_ID));

		if(this.tipoviviendaConstantesFunciones.mostraridTipoVivienda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViviendaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoviviendaConstantesFunciones.resaltaridTipoVivienda,this.tipoviviendaConstantesFunciones.activaridTipoVivienda,this,true,"idTipoVivienda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoviviendaConstantesFunciones.resaltaridTipoVivienda,this.tipoviviendaConstantesFunciones.activaridTipoVivienda,this,true,"idTipoVivienda","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,TipoViviendaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoviviendaConstantesFunciones.mostrarid_empresaTipoVivienda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViviendaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoviviendaConstantesFunciones.resaltarid_empresaTipoVivienda,this,this.tipoviviendaConstantesFunciones.activarid_empresaTipoVivienda));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoviviendaConstantesFunciones.resaltarid_empresaTipoVivienda,this,this.tipoviviendaConstantesFunciones.activarid_empresaTipoVivienda,false,"id_empresaTipoVivienda","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,TipoViviendaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoviviendaConstantesFunciones.mostrarcodigoTipoVivienda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViviendaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoviviendaConstantesFunciones.resaltarcodigoTipoVivienda,this.tipoviviendaConstantesFunciones.activarcodigoTipoVivienda,this,true,"codigoTipoVivienda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoviviendaConstantesFunciones.resaltarcodigoTipoVivienda,this.tipoviviendaConstantesFunciones.activarcodigoTipoVivienda,this,true,"codigoTipoVivienda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,TipoViviendaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoviviendaConstantesFunciones.mostrarnombreTipoVivienda && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoViviendaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoviviendaConstantesFunciones.resaltarnombreTipoVivienda,this.tipoviviendaConstantesFunciones.activarnombreTipoVivienda,this,true,"nombreTipoVivienda","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoviviendaConstantesFunciones.resaltarnombreTipoVivienda,this.tipoviviendaConstantesFunciones.activarnombreTipoVivienda,this,true,"nombreTipoVivienda","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoViviendaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDireccion && this.tipoviviendaConstantesFunciones.mostrarDireccionTipoVivienda && !TipoViviendaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Direcciones");
				tableColumn.setHeaderValue("Direcciones");
				tableColumn.setCellRenderer(new DireccionTableCell(tipoviviendaConstantesFunciones.resaltarDireccionTipoVivienda,this,this.tipoviviendaConstantesFunciones.activarDireccionTipoVivienda));
				tableColumn.setCellEditor(new DireccionTableCell(tipoviviendaConstantesFunciones.resaltarDireccionTipoVivienda,this,this.tipoviviendaConstantesFunciones.activarDireccionTipoVivienda));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoVivienda.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVivienda.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoVivienda.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoviviendaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoVivienda.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoVivienda.addColumn(tableColumn);
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
			
			this.jTableDatosTipoVivienda.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoviviendaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoVivienda.moveColumn(this.jTableDatosTipoVivienda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoVivienda.moveColumn(this.jTableDatosTipoVivienda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoviviendaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoVivienda.moveColumn(this.jTableDatosTipoVivienda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoVivienda.moveColumn(this.jTableDatosTipoVivienda.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoVivienda.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoVivienda.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoVivienda,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoVivienda.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoVivienda.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoVivienda.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoVivienda.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoVivienda.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoviviendaLogic.getTipoViviendas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoviviendas.size()-1;
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
		//this.jTableDatosTipoVivienda.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoVivienda.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoVivienda();
			
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
				
				//this.isEsNuevoTipoVivienda=false;
					
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
				if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoVivienda==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVivienda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVivienda.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipovivienda.getsType().equals("DUPLICADO")
				   || this.tipovivienda.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoVivienda=true;
				
				} else {
					this.isEsNuevoTipoVivienda=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipovivienda.getId()>=0 && !this.tipovivienda.getIsNew()) {						
						this.isEsNuevoTipoVivienda=false;
						
					} else {
						this.isEsNuevoTipoVivienda=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoVivienda(esRelaciones);						
				
				this.seleccionarTipoVivienda(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipovivienda.getId()<0) {
					this.isEsNuevoTipoVivienda=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoVivienda(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoVivienda(evt,rowIndex);
				}	
				
				if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoVivienda: " + this.dDif); 
					}
				}								
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoVivienda(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipovivienda)) {
					if(this.tipovivienda.getId()>0) {
						this.tipovivienda.setIsDeleted(true);
						
						this.tipoviviendasEliminados.add(this.tipovivienda);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoviviendaLogic.getTipoViviendas().remove(this.tipovivienda);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoviviendas.remove(this.tipovivienda);				
					}
					
					
					((TipoViviendaModel) this.jTableDatosTipoVivienda.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoVivienda(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoVivienda(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoVivienda) {
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoVivienda.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoVivienda.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoVivienda(this.tipovivienda);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoviviendaConstantesFunciones.cargarid_empresaTipoVivienda || this.tipoviviendaConstantesFunciones.event_dependid_empresaTipoVivienda) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipovivienda.getid_empresa());
									//this.inicializarActualizarBindingTipoVivienda(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipovivienda.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipovivienda.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipovivienda.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoVivienda("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoVivienda(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoVivienda() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVivienda(TipoVivienda tipovivienda) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoVivienda(tipovivienda,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoVivienda(TipoVivienda tipovivienda,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoVivienda(tipovivienda);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoVivienda(tipovivienda,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoVivienda(tipovivienda);
	}
	
	public void setVariablesObjetoActualToFormularioTipoVivienda(TipoVivienda tipovivienda) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setText(tipovivienda.getId().toString());
			this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setText(tipovivienda.getcodigo());
			this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setText(tipovivienda.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoVivienda tipoviviendaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoviviendaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoVivienda tipoviviendaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoviviendaLocal=this.tipovivienda;
			} else {
				tipoviviendaLocal=this.tipoviviendaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoviviendaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoVivienda(tipoviviendaLocal,true);
					
					if(tipoviviendaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoviviendaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoviviendaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoVivienda(TipoVivienda tipovivienda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVivienda(tipovivienda,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(tipovivienda);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVivienda(TipoVivienda tipovivienda,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoVivienda(tipovivienda,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoVivienda(TipoVivienda tipovivienda,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.getText()==null || this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.getText()=="" || this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setText("0");
			}

			if(conColumnasBase) {tipovivienda.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoViviendaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelIdTipoVivienda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovivienda.setcodigo(this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoViviendaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelcodigoTipoVivienda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipovivienda.setnombre(this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoViviendaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoVivienda.jLabelnombreTipoVivienda,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoVivienda(TipoVivienda tipoviviendaBean,TipoVivienda tipovivienda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoVivienda(TipoVivienda tipoviviendaOrigen,TipoVivienda tipovivienda,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoviviendaOrigen.getId()!=null && !tipoviviendaOrigen.getId().equals(0L))) {tipovivienda.setId(tipoviviendaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoviviendaOrigen.getcodigo()!=null && !tipoviviendaOrigen.getcodigo().equals(""))) {tipovivienda.setcodigo(tipoviviendaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoviviendaOrigen.getnombre()!=null && !tipoviviendaOrigen.getnombre().equals(""))) {tipovivienda.setnombre(tipoviviendaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVivienda(TipoVivienda tipovivienda) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setText(tipovivienda.getId().toString());
			this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setText(tipovivienda.getcodigo());
			this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setText(tipovivienda.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoVivienda(TipoViviendaBean tipoviviendaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setText(tipoviviendaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setText(tipoviviendaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setText(tipoviviendaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoVivienda(TipoViviendaParameterReturnGeneral tipoviviendaReturnGeneral,TipoViviendaBean tipoviviendaBean,Boolean conDefault) throws Exception { 
		try {
			TipoVivienda tipoviviendaLocal=new TipoVivienda();
			
			tipoviviendaLocal=tipoviviendaReturnGeneral.getTipoVivienda();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoviviendaLocal.getId()!=null && !tipoviviendaLocal.getId().equals(0L))) {tipoviviendaBean.setId(tipoviviendaLocal.getId());}}
			if(conDefault || (!conDefault && tipoviviendaLocal.getcodigo()!=null && !tipoviviendaLocal.getcodigo().equals(""))) {tipoviviendaBean.setcodigo(tipoviviendaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoviviendaLocal.getnombre()!=null && !tipoviviendaLocal.getnombre().equals(""))) {tipoviviendaBean.setnombre(tipoviviendaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoViviendaGenerico(Long idTipoViviendaSeleccionado,JComboBox jComboBoxTipoVivienda,List<TipoVivienda> tipoviviendasLocal)throws Exception {
		try {
			TipoVivienda  tipoviviendaTemp=null;

			for(TipoVivienda tipoviviendaAux:tipoviviendasLocal) {
				if(tipoviviendaAux.getId()!=null && tipoviviendaAux.getId().equals(idTipoViviendaSeleccionado)) {
					tipoviviendaTemp=tipoviviendaAux;
					break;
				}
			}

			jComboBoxTipoVivienda.setSelectedItem(tipoviviendaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoViviendaGenerico(JComboBox jComboBoxTipoVivienda,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVivienda.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoVivienda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoVivienda.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoVivienda.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoVivienda.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoVivienda.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Direccion")) {
			jButtonDireccionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipovivienda=(TipoVivienda) tipoviviendaLogic.getTipoViviendas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipovivienda =(TipoVivienda) tipoviviendas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipovivienda.getIsNew() && !tipovivienda.getIsChanged() && !tipovivienda.getIsDeleted()) {
				sDescripcion=tipovivienda.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipovivienda.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoVivienda tipoviviendaRow=new TipoVivienda();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoviviendaRow=(TipoVivienda) tipoviviendaLogic.getTipoViviendas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoviviendaRow=(TipoVivienda) tipoviviendas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDireccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoVivienda tipovivienda) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoVivienda==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovivienda = (TipoVivienda)this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipovivienda = (TipoVivienda)this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipovivienda!=null) {
						this.tipovivienda = tipovivienda;
					} else {
						this.tipovivienda = new TipoVivienda();
					}
				}

				if(this.isTienePermisosDireccion && this.permiteMantenimiento(this.tipovivienda)) {
					DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup=new DireccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						direccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup;
					} else {
						direccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame;
					}

					List<TipoVivienda> tipoviviendas=new ArrayList<TipoVivienda>();
					tipoviviendas.add(this.tipovivienda);
					if(!esRelacionado) {
						//direccionBeanSwingJInternalFrame.direccionSessionBean.setConGuardarRelaciones(false);
						//direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					direccionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoVivienda.cargarDireccionBeanSwingJInternalFrame(tipoviviendas,this.tipovivienda,direccionBeanSwingJInternalFrame,/*conInicializar,*/direccionBeanSwingJInternalFrame.direccionSessionBean.getConGuardarRelaciones(),direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado());
					direccionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("no_relacionado");

						direccionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DireccionConstantesFunciones.ITAMANIOFILATABLA + (DireccionConstantesFunciones.ITAMANIOFILATABLA/2));

						direccionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoVivienda=(TitledBorder)this.jScrollPanelDatosTipoVivienda.getBorder();
						TitledBorder titledBorderDireccion=(TitledBorder)direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.getBorder();

						titledBorderDireccion.setTitle(titledBorderTipoVivienda.getTitle() + " -> Direccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,direccionBeanSwingJInternalFrame);
						}

						direccionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(direccionBeanSwingJInternalFrame);

						direccionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Direccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoVivienda(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda));			
			this.jButtonDuplicarTipoVivienda.setVisible((this.isVisibilidadCeldaDuplicarTipoVivienda && this.isPermisoDuplicarTipoVivienda));			
			this.jButtonCopiarTipoVivienda.setVisible((this.isVisibilidadCeldaCopiarTipoVivienda && this.isPermisoCopiarTipoVivienda));
			this.jButtonVerFormTipoVivienda.setVisible((this.isVisibilidadCeldaVerFormTipoVivienda && this.isPermisoVerFormTipoVivienda));
			
			this.jButtonAbrirOrderByTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));			
			
			this.jButtonNuevoRelacionesTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVivienda && this.isPermisoNuevoTipoVivienda));			
			this.jButtonNuevoGuardarCambiosTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarTipoVivienda.setVisible((this.isVisibilidadCeldaModificarTipoVivienda && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.setVisible((this.isVisibilidadCeldaActualizarTipoVivienda && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.setVisible((this.isVisibilidadCeldaEliminarTipoVivienda && this.isPermisoEliminarTipoVivienda));
			this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.setVisible(this.isVisibilidadCeldaCancelarTipoVivienda);							
			this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda));						
			this.jButtonDuplicarToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaDuplicarTipoVivienda && this.isPermisoDuplicarTipoVivienda));						
			this.jButtonCopiarToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaCopiarTipoVivienda && this.isPermisoCopiarTipoVivienda));			
			this.jButtonVerFormToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaVerFormTipoVivienda && this.isPermisoVerFormTipoVivienda));			
			this.jButtonAbrirOrderByToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));
			this.jButtonNuevoRelacionesToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVivienda && this.isPermisoNuevoTipoVivienda));			
			this.jButtonNuevoGuardarCambiosToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));			
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaModificarTipoVivienda && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaActualizarTipoVivienda  && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaEliminarTipoVivienda && this.isPermisoEliminarTipoVivienda));
			this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarToolBarTipoVivienda.setVisible(this.isVisibilidadCeldaCancelarTipoVivienda);				
			this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda));			
			this.jMenuItemDuplicarTipoVivienda.setVisible((this.isVisibilidadCeldaDuplicarTipoVivienda && this.isPermisoDuplicarTipoVivienda));			
			this.jMenuItemCopiarTipoVivienda.setVisible((this.isVisibilidadCeldaCopiarTipoVivienda && this.isPermisoCopiarTipoVivienda));			
			this.jMenuItemVerFormTipoVivienda.setVisible((this.isVisibilidadCeldaVerFormTipoVivienda && this.isPermisoVerFormTipoVivienda));			
			this.jMenuItemAbrirOrderByTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));			
			//this.jMenuItemMostrarOcultarTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));
			this.jMenuItemDetalleAbrirOrderByTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));			
			//this.jMenuItemDetalleMostrarOcultarTipoVivienda.setVisible((this.isVisibilidadCeldaOrdenTipoVivienda && this.isPermisoOrdenTipoVivienda));			
			this.jMenuItemNuevoRelacionesTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoVivienda && this.isPermisoNuevoTipoVivienda));			
			this.jMenuItemNuevoGuardarCambiosTipoVivienda.setVisible((this.isVisibilidadCeldaNuevoTipoVivienda && this.isPermisoNuevoTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));									
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemModificarTipoVivienda.setVisible((this.isVisibilidadCeldaModificarTipoVivienda && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemActualizarTipoVivienda.setVisible((this.isVisibilidadCeldaActualizarTipoVivienda && this.isPermisoActualizarTipoVivienda));	
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemEliminarTipoVivienda.setVisible((this.isVisibilidadCeldaEliminarTipoVivienda && this.isPermisoEliminarTipoVivienda));
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemCancelarTipoVivienda.setVisible(this.isVisibilidadCeldaCancelarTipoVivienda);				
			}
			
			this.jMenuItemGuardarCambiosTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));						
			this.jMenuItemGuardarCambiosTablaTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoVivienda=this.jButtonNuevoTipoVivienda.isVisible();
			this.isVisibilidadCeldaDuplicarTipoVivienda=this.jButtonDuplicarTipoVivienda.isVisible();
			this.isVisibilidadCeldaCopiarTipoVivienda=this.jButtonCopiarTipoVivienda.isVisible();
			this.isVisibilidadCeldaVerFormTipoVivienda=this.jButtonVerFormTipoVivienda.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoVivienda=this.jButtonAbrirOrderByTipoVivienda.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=this.jButtonNuevoRelacionesTipoVivienda.isVisible();
			this.isVisibilidadCeldaModificarTipoVivienda=this.jButtonModificarTipoVivienda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.isVisibilidadCeldaActualizarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.isVisible();
			this.isVisibilidadCeldaEliminarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.isVisible();
			this.isVisibilidadCeldaCancelarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.isVisible();
			this.isVisibilidadCeldaGuardarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=this.jButtonGuardarCambiosTablaTipoVivienda.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoVivienda=this.jButtonNuevoToolBarTipoVivienda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=this.jButtonNuevoRelacionesToolBarTipoVivienda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.isVisibilidadCeldaModificarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarToolBarTipoVivienda.isVisible();
			this.isVisibilidadCeldaActualizarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarToolBarTipoVivienda.isVisible();
			this.isVisibilidadCeldaEliminarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarToolBarTipoVivienda.isVisible();
			this.isVisibilidadCeldaCancelarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarToolBarTipoVivienda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVivienda=this.jButtonGuardarCambiosToolBarTipoVivienda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=this.jButtonGuardarCambiosTablaToolBarTipoVivienda.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoVivienda=this.jMenuItemNuevoTipoVivienda.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=this.jMenuItemNuevoRelacionesTipoVivienda.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.isVisibilidadCeldaModificarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jMenuItemModificarTipoVivienda.isVisible();
			this.isVisibilidadCeldaActualizarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jMenuItemActualizarTipoVivienda.isVisible();
			this.isVisibilidadCeldaEliminarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jMenuItemEliminarTipoVivienda.isVisible();
			this.isVisibilidadCeldaCancelarTipoVivienda=this.jInternalFrameDetalleFormTipoVivienda.jMenuItemCancelarTipoVivienda.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoVivienda=this.jMenuItemGuardarCambiosTipoVivienda.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=this.jMenuItemGuardarCambiosTablaTipoVivienda.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoVivienda(Boolean esInicializar) {
		if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVivienda();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoVivienda(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoVivienda() {
		this.jButtonNuevoTipoVivienda.setVisible(this.isPermisoNuevoTipoVivienda);			
		this.jButtonDuplicarTipoVivienda.setVisible(this.isPermisoDuplicarTipoVivienda);			
		this.jButtonCopiarTipoVivienda.setVisible(this.isPermisoCopiarTipoVivienda);			
		this.jButtonVerFormTipoVivienda.setVisible(this.isPermisoVerFormTipoVivienda);			
		
		this.jButtonAbrirOrderByTipoVivienda.setVisible(this.isPermisoOrdenTipoVivienda);					
		
		this.jButtonNuevoRelacionesTipoVivienda.setVisible(this.isPermisoNuevoTipoVivienda);			
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarTipoVivienda.setVisible(this.isPermisoActualizarTipoVivienda);	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.setVisible(this.isPermisoActualizarTipoVivienda);	
			this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.setVisible(this.isPermisoEliminarTipoVivienda);
			this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.setVisible(this.isVisibilidadCeldaCancelarTipoVivienda);						
			this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.setVisible(this.isPermisoGuardarCambiosTipoVivienda);							
		}
		
		this.jButtonGuardarCambiosTablaTipoVivienda.setVisible(this.isPermisoActualizarTipoVivienda);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVivienda() {
		this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarTipoVivienda.setVisible(this.isPermisoActualizarTipoVivienda);	
		this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.setVisible(this.isPermisoActualizarTipoVivienda);	
		this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.setVisible(this.isPermisoEliminarTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.setVisible(this.isVisibilidadCeldaCancelarTipoVivienda);							
		this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.setVisible((this.isVisibilidadCeldaGuardarTipoVivienda && this.isPermisoGuardarCambiosTipoVivienda));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoVivienda() {
		if(TipoViviendaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoVivienda();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoVivienda() {
	}
	
	public void jTableDatosTipoViviendaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoVivienda(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoViviendaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.gettipovivienda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovivienda==null) {
						this.tipovivienda = new TipoVivienda();
					}

					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				}

				if(this.tipovivienda.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipovivienda.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVivienda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoViviendaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoVivienda(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoVivienda.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoVivienda.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoVivienda(this.gettipovivienda(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoviviendaLogic.getConnexion());

				if(this.tipovivienda.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipovivienda.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoVivienda=(TitledBorder)this.jScrollPanelDatosTipoVivienda.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoVivienda.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoViviendaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.gettipovivienda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovivienda==null) {
						this.tipovivienda = new TipoVivienda();
					}

					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				}

				if(this.tipovivienda.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipovivienda.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVivienda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoViviendaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.gettipovivienda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovivienda==null) {
						this.tipovivienda = new TipoVivienda();
					}

					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				}

				if(this.tipovivienda.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipovivienda.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVivienda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoViviendaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.gettipovivienda(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipovivienda==null) {
						this.tipovivienda = new TipoVivienda();
					}

					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);
				}

				if(this.tipovivienda.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipovivienda.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoVivienda(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoViviendaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoVivienda(false,false);

			this.getTipoViviendasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoVivienda(false);

			//if(TipoViviendaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoVivienda(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoviviendaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoVivienda() {
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
		

		if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
			this.jInternalFrameDetalleFormTipoVivienda.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoVivienda.dispose();
			this.jInternalFrameDetalleFormTipoVivienda=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
			this.jInternalFrameReporteDinamicoTipoVivienda.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoVivienda.dispose();
			this.jInternalFrameReporteDinamicoTipoVivienda=null;
		}
		
		if(this.jInternalFrameImportacionTipoVivienda!=null) {
			this.jInternalFrameImportacionTipoVivienda.setVisible(false);	    			
			this.jInternalFrameImportacionTipoVivienda.dispose();
			this.jInternalFrameImportacionTipoVivienda=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoVivienda();
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoVivienda")) {
				jButtonDuplicarTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoVivienda")) {
				jButtonCopiarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoVivienda")) {
				jButtonVerFormTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoVivienda")) {
				jButtonDuplicarTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoVivienda")) {
				jButtonDuplicarTipoViviendaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoVivienda")) {
				jButtonModificarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoVivienda")) {
				jButtonModificarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoVivienda")) {
				jButtonModificarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoVivienda")) {
				jButtonActualizarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoVivienda")) {
				jButtonActualizarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoVivienda")) {
				jButtonActualizarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoVivienda")) {
				jButtonEliminarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoVivienda")) {
				jButtonEliminarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoVivienda")) {
				jButtonEliminarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoVivienda")) {
				jButtonCancelarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoVivienda")) {
				jButtonCancelarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoVivienda")) {
				jButtonCancelarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoVivienda")) {
				jButtonCerrarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoVivienda")) {
				jButtonCerrarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoVivienda")) {
				jButtonCerrarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoVivienda")) {
				jButtonMostrarOcultarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoVivienda")) {
				jButtonCancelarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoVivienda")) {
				jButtonCopiarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoVivienda")) {
				jButtonVerFormTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoVivienda")) {
				jButtonCopiarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoVivienda")) {
				jButtonVerFormTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoVivienda")) {
				jButtonRecargarInformacionTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoVivienda")) {
				jButtonRecargarInformacionTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoVivienda")) {
				jButtonRecargarInformacionTipoViviendaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoVivienda")) {
				jButtonAnterioresTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoVivienda")) {
				jButtonAnterioresTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoVivienda")) {
				jButtonAnterioresTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoVivienda")) {
				jButtonSiguientesTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoVivienda")) {
				jButtonSiguientesTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoVivienda")) {
				jButtonSiguientesTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoVivienda") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoVivienda")) {
				jButtonAbrirOrderByTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoVivienda") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoVivienda")) {
				jButtonMostrarOcultarTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVivienda")) {
				jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoVivienda")) {
				jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoVivienda")) {
				jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoVivienda")) {
				jButtonCerrarReporteDinamicoTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoVivienda")) {
				jButtonGenerarReporteDinamicoTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoVivienda")) {
				
				jButtonGenerarExcelReporteDinamicoTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoVivienda")) {
				jButtonCerrarImportacionTipoViviendaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoVivienda")) {
				
				jButtonGenerarImportacionTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoVivienda")) {
				
				jButtonAbrirImportacionTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoVivienda")) {
				jComboBoxTiposAccionesTipoViviendaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoVivienda")) {
				jComboBoxTiposRelacionesTipoViviendaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoVivienda")) {
				jComboBoxTiposAccionesTipoViviendaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoVivienda")) {
				
				jComboBoxTiposSeleccionarTipoViviendaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoVivienda")) {
				jTextFieldValorCampoGeneralTipoViviendaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoVivienda")) {
				jButtonAbrirOrderByTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoVivienda")) {
				jButtonAbrirOrderByTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoVivienda")) {
				jButtonCerrarOrderByTipoViviendaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoViviendaBusqueda")) {
				this.jButtonidTipoViviendaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoViviendaUpdate")) {
				this.jButtonid_empresaTipoViviendaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoViviendaBusqueda")) {
				this.jButtonid_empresaTipoViviendaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoViviendaBusqueda")) {
				this.jButtoncodigoTipoViviendaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoViviendaBusqueda")) {
				this.jButtonnombreTipoViviendaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoVivienda();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoVivienda tipoviviendaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoviviendaLocal=this.tipovivienda;
			} else {
				tipoviviendaLocal=this.tipoviviendaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
							
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
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
			
			


			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
								
						
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
								
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
							
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
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
			
			


			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
								
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoVivienda")) {
					jCheckBoxSeleccionarTodosTipoViviendaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoVivienda")) {
					jCheckBoxSeleccionadosTipoViviendaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoVivienda")) {
					
				}
				
				


				
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
												
				
				


				
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
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
			
			


			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoViviendaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipovivienda);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipovivienda);
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
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
				
				


				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoVivienda.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoVivienda.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoViviendaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoviviendaAnterior =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoVivienda")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoViviendaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoVivienda.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipovivienda =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipovivienda =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipovivienda);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoVivienda")) {
				
				}
				
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoVivienda")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoVivienda.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoVivienda")) {
			
			}
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoVivienda();
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoVivienda")) {
				jButtonDuplicarTipoViviendaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoVivienda")) {
				jButtonCopiarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoVivienda")) {
				jButtonVerFormTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoVivienda")) {
				jButtonNuevoTipoViviendaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoVivienda")) {
				jButtonModificarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoVivienda")) {
				jButtonActualizarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoVivienda")) {
				jButtonEliminarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoVivienda")) {
				jButtonCancelarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoVivienda")) {
				jButtonCerrarTipoViviendaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoVivienda")) {
				jButtonGuardarCambiosTipoViviendaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoVivienda")) {
				jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoVivienda")) {
				jButtonAbrirOrderByTipoViviendaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoVivienda")) {
				jButtonRecargarInformacionTipoViviendaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoVivienda")) {
				jButtonAnterioresTipoViviendaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoVivienda")) {
				jButtonSiguientesTipoViviendaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoViviendaBusqueda")) {
				this.jButtonidTipoViviendaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoViviendaUpdate")) {
				this.jButtonid_empresaTipoViviendaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoViviendaBusqueda")) {
				this.jButtonid_empresaTipoViviendaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoViviendaBusqueda")) {
				this.jButtoncodigoTipoViviendaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoViviendaBusqueda")) {
				this.jButtonnombreTipoViviendaBusquedaActionPerformed(evt);
			}
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoVivienda();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoVivienda")) {
				closingInternalFrameTipoVivienda();
				
			} else if(sTipo.equals("jButtonCancelarTipoVivienda")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoVivienda = (JInternalFrameBase)evt.getSource();
	            	
	            TipoViviendaBeanSwingJInternalFrame jInternalFrameParent=(TipoViviendaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVivienda.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoViviendaActionPerformed(null);
			}
			
			TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipovivienda,new Object(),this.tipoviviendaParameterGeneral,this.tipoviviendaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoVivienda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoVivienda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoVivienda(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipovivienda)) {
			if(!esControlTabla) {
				if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);			
				}
				
				if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoVivienda(this.tipovivienda,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoviviendaReturnGeneral=tipoviviendaLogic.procesarEventosTipoViviendasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviviendaLogic.getTipoViviendas(),this.tipovivienda,this.tipoviviendaParameterGeneral,this.isEsNuevoTipoVivienda,classes);//this.tipoviviendaLogic.getTipoVivienda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoVivienda(this.tipoviviendaReturnGeneral,this.tipoviviendaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoVivienda(classes,this.tipoviviendaReturnGeneral,this.tipoviviendaBean,false);
					}
						
					if(this.tipoviviendaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda());	
					}
						
					if(this.tipoviviendaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda(),classes);//this.tipoviviendaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoVivienda(this.tipovivienda,classes);//this.tipoviviendaBean);									
				}
			
				if(TipoViviendaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoVivienda(this.tipovivienda,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoVivienda(this.tipovivienda);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoviviendaAnterior!=null) {
						this.tipovivienda=this.tipoviviendaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoviviendaReturnGeneral=tipoviviendaLogic.procesarEventosTipoViviendasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoviviendaLogic.getTipoViviendas(),this.tipovivienda,this.tipoviviendaParameterGeneral,this.isEsNuevoTipoVivienda,classes);//this.tipoviviendaLogic.getTipoVivienda()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoviviendaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoviviendaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoviviendaReturnGeneral.getTipoVivienda(),tipoviviendaLogic.getTipoViviendas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoviviendaReturnGeneral.getTipoVivienda(),this.tipoviviendas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoVivienda.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoVivienda.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoVivienda();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoVivienda() throws Exception {
		
		TipoViviendaModel tipoviviendaModel=(TipoViviendaModel)this.jTableDatosTipoVivienda.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoviviendaModel.tipoviviendas=this.tipoviviendaLogic.getTipoViviendas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoviviendaModel.tipoviviendas=this.tipoviviendas;
		}
		
		
		((TipoViviendaModel) this.jTableDatosTipoVivienda.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoVivienda() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoviviendaAnterior(),this.tipoviviendaLogic.getTipoViviendas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoviviendaAnterior(),this.tipoviviendas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoVivienda();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoVivienda(TipoVivienda tipovivienda,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(tipovivienda.getDireccions());
					this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
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
										
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovivienda,new Object(),generalEntityParameterGeneral,this.tipoviviendaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoviviendaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoViviendaConstantesFunciones.getClassesRelationshipsOfTipoVivienda(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoViviendaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoVivienda(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoVivienda(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoViviendaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipovivienda,new Object(),generalEntityParameterGeneral,this.tipoviviendaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoVivienda(TipoViviendaBean tipoviviendaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(tipovivienda.getDireccions());
					this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoVivienda(ArrayList<Classe> classes,TipoViviendaReturnGeneral tipoviviendaReturnGeneral,TipoViviendaBean tipoviviendaBean,Boolean conDefault) throws Exception {
		
			this.tipoviviendaBean.setDireccions(tipoviviendaReturnGeneral.getTipoVivienda().getDireccions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoVivienda(TipoVivienda tipovivienda,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					tipovivienda.setDireccions(this.jInternalFrameDetalleFormTipoVivienda.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipovivienda)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoVivienda = new TipoViviendaDetalleFormJInternalFrame(jDesktopPane,this.tipoviviendaSessionBean.getConGuardarRelaciones(),this.tipoviviendaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.setVisible(false);
		this.jInternalFrameDetalleFormTipoVivienda.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoVivienda.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoVivienda.tipoviviendaLogic=this.tipoviviendaLogic;
		
		this.cargarCombosFrameForeignKeyTipoVivienda("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoVivienda();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoVivienda();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoVivienda("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoVivienda();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoVivienda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVivienda"));
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarTipoVivienda.addActionListener(new ButtonActionListener(this,"ModificarTipoVivienda"));

		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVivienda"));
					
		this.jInternalFrameDetalleFormTipoVivienda.jMenuItemModificarTipoVivienda.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVivienda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.addActionListener (new ButtonActionListener(this,"ActualizarTipoVivienda"));
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVivienda"));
						
		this.jInternalFrameDetalleFormTipoVivienda.jMenuItemActualizarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVivienda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.addActionListener (new ButtonActionListener(this,"EliminarTipoVivienda"));
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVivienda"));
								
		this.jInternalFrameDetalleFormTipoVivienda.jMenuItemEliminarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVivienda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.addActionListener (new ButtonActionListener(this,"CancelarTipoVivienda"));
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVivienda"));
					
		this.jInternalFrameDetalleFormTipoVivienda.jMenuItemCancelarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVivienda"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jMenuItemDetalleCerrarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVivienda"));		
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVivienda"));
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVivienda"));
		
		
		
		this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVivienda"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonidTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViviendaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtoncodigoTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonnombreTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViviendaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVivienda"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoVivienda"));
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoVivienda"));
		}
		
		this.jTableDatosTipoVivienda.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoVivienda"));
		
		this.jTableDatosTipoVivienda.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoVivienda"));
		
		this.jButtonNuevoTipoVivienda.addActionListener(new ButtonActionListener(this,"NuevoTipoVivienda"));
		
		this.jButtonDuplicarTipoVivienda.addActionListener(new ButtonActionListener(this,"DuplicarTipoVivienda"));
		
		this.jButtonCopiarTipoVivienda.addActionListener(new ButtonActionListener(this,"CopiarTipoVivienda"));
		
		this.jButtonVerFormTipoVivienda.addActionListener(new ButtonActionListener(this,"VerFormTipoVivienda"));
		
		
		this.jButtonNuevoToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoVivienda"));
			
		this.jButtonDuplicarToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoVivienda"));
			
		this.jMenuItemNuevoTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoVivienda"));
			
		this.jMenuItemDuplicarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoVivienda"));		
		
		
		this.jButtonNuevoRelacionesTipoVivienda.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoVivienda"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoVivienda"));
			
		this.jMenuItemNuevoRelacionesTipoVivienda.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoVivienda"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarTipoVivienda.addActionListener(new ButtonActionListener(this,"ModificarTipoVivienda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonModificarToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoVivienda"));
			
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemModificarTipoVivienda.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoVivienda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarTipoVivienda.addActionListener (new ButtonActionListener(this,"ActualizarTipoVivienda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonActualizarToolBarTipoVivienda.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoVivienda"));
				
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemActualizarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoVivienda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarTipoVivienda.addActionListener (new ButtonActionListener(this,"EliminarTipoVivienda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonEliminarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoVivienda"));
						
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemEliminarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoVivienda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarTipoVivienda.addActionListener (new ButtonActionListener(this,"CancelarTipoVivienda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonCancelarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoVivienda"));
			
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemCancelarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoVivienda"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoVivienda"));		
		
		
		this.jButtonCerrarTipoVivienda.addActionListener (new ButtonActionListener(this,"CerrarTipoVivienda"));
		
		
		this.jButtonCerrarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoVivienda"));
			
		this.jMenuItemCerrarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoVivienda"));
			
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jMenuItemDetalleCerrarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoVivienda"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoVivienda"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoVivienda"));
		}
		
		this.jButtonCopiarToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoVivienda"));
			
		this.jButtonVerFormToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoVivienda"));
		
		this.jMenuItemGuardarCambiosTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoVivienda"));
			
		this.jMenuItemCopiarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoVivienda"));		
		
		this.jMenuItemVerFormTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoVivienda"));		
		
		
		this.jButtonGuardarCambiosTablaTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVivienda"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoVivienda"));
			
		this.jMenuItemGuardarCambiosTablaTipoVivienda.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoVivienda"));		
		
		
		
		this.jButtonRecargarInformacionTipoVivienda.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoVivienda"));
					
		this.jButtonRecargarInformacionToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoVivienda"));
		
		this.jMenuItemRecargarInformacionTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoVivienda"));		
		
		
		
		this.jButtonAnterioresTipoVivienda.addActionListener (new ButtonActionListener(this,"AnterioresTipoVivienda"));
		
		
		this.jButtonAnterioresToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoVivienda"));
		
		this.jMenuItemAnterioresTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoVivienda"));		
		
		
		this.jButtonSiguientesTipoVivienda.addActionListener (new ButtonActionListener(this,"SiguientesTipoVivienda"));
		
		
		this.jButtonSiguientesToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoVivienda"));
			
		this.jMenuItemSiguientesTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoVivienda"));
			
		this.jMenuItemAbrirOrderByTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoVivienda"));
			
		this.jMenuItemMostrarOcultarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoVivienda"));
			
		this.jMenuItemDetalleAbrirOrderByTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoVivienda"));
			
		this.jMenuItemDetalleMostarOcultarTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoVivienda"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoVivienda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoVivienda"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoVivienda"));
			
		this.jMenuItemNuevoGuardarCambiosTipoVivienda.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoVivienda"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoVivienda.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoVivienda"));

		this.jCheckBoxSeleccionadosTipoVivienda.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoVivienda"));
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoVivienda"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoVivienda.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoVivienda"));
			
		this.jComboBoxTiposAccionesTipoVivienda.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoVivienda"));
					
		this.jComboBoxTiposSeleccionarTipoVivienda.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoVivienda"));
			
		this.jTextFieldValorCampoGeneralTipoVivienda.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoVivienda"));		
		
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonidTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViviendaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtoncodigoTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonnombreTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViviendaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoVivienda!=null) {
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVivienda"));
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVivienda"));
				this.jInternalFrameReporteDinamicoTipoVivienda.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVivienda"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoVivienda.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoVivienda"));				
			//this.jButtonGenerarReporteDinamicoTipoVivienda.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoVivienda"));
			//this.jButtonGenerarExcelReporteDinamicoTipoVivienda.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoVivienda"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoVivienda!=null) {
				this.jInternalFrameImportacionTipoVivienda.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoVivienda"));
				this.jInternalFrameImportacionTipoVivienda.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoVivienda"));
				this.jInternalFrameImportacionTipoVivienda.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoVivienda"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoVivienda.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoVivienda"));
			
			this.jButtonAbrirOrderByToolBarTipoVivienda.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoVivienda"));			
			
			if(this.jInternalFrameOrderByTipoVivienda!=null) {
				this.jInternalFrameOrderByTipoVivienda.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoVivienda"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoVivienda.jTabbedPaneRelacionesTipoVivienda.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoVivienda"));
		
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
            		closingInternalFrameTipoVivienda();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoVivienda.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoVivienda = (JInternalFrameBase)event.getSource();
	            	
	            TipoViviendaBeanSwingJInternalFrame jInternalFrameParent=(TipoViviendaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoVivienda.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoViviendaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoVivienda.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoViviendaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoVivienda.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoVivienda.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoVivienda";
		inputMap = this.jButtonNuevoTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoViviendaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoViviendaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoVivienda";
		inputMap = this.jButtonNuevoRelacionesTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoViviendaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoVivienda";
		inputMap = this.jButtonModificarTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoVivienda";
		inputMap = this.jButtonActualizarTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoVivienda";
		inputMap = this.jButtonEliminarTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoVivienda";
		inputMap = this.jButtonCancelarTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoVivienda";
		inputMap = this.jButtonCerrarTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoVivienda";
		inputMap = this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoVivienda.jButtonGuardarCambiosTipoVivienda.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoViviendaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoVivienda.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoViviendaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoVivienda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoViviendaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoVivienda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoViviendaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoVivienda.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoViviendaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonidTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoViviendaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonid_empresaTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtoncodigoTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoViviendaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoVivienda.jButtonnombreTipoViviendaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoViviendaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoVivienda.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoViviendaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoViviendaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoVivienda.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoVivienda(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
					tipoviviendaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVivienda tipoviviendaAux:tipoviviendas) {
					tipoviviendaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoViviendaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
						tipoviviendaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVivienda tipoviviendaAux:tipoviviendas) {
						tipoviviendaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVivienda tipoviviendaAux:tipoviviendas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVivienda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVivienda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVivienda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoViviendaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoVivienda.getSelectedRows();
			
			TipoVivienda tipoviviendaLocal=new TipoVivienda();
			
			//this.seleccionarTodosTipoVivienda(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviviendaLocal =(TipoVivienda) this.tipoviviendaLogic.getTipoViviendas().toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoviviendaLocal =(TipoVivienda) this.tipoviviendas.toArray()[this.jTableDatosTipoVivienda.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoviviendaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
						tipoviviendaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoVivienda tipoviviendaAux:tipoviviendas) {
						tipoviviendaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoVivienda(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoVivienda.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoVivienda.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoVivienda,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoViviendaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoViviendaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoViviendaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoVivienda.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoVivienda tipoviviendaAux:this.tipoviviendaLogic.getTipoViviendas()) {
				
						if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoviviendaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoviviendaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVivienda tipoviviendaAux:tipoviviendas) {
					
						if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoviviendaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoviviendaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoVivienda(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoViviendaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoVivienda=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoVivienda.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoVivienda) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoVivienda(conSplash);
				
					this.generarReporteTipoViviendasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoViviendasSeleccionados();
				//this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoViviendasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoViviendasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVivienda();
				
				this.exportarTipoViviendasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoViviendas();
				//this.importarTipoViviendas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoVivienda();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoViviendasSeleccionados();
				//this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Vivienda", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoVivienda();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoVivienda)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoVivienda(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoViviendaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoVivienda) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoVivienda(conSplash);
					
						//this.actualizarParametrosGeneralTipoVivienda();
						
						this.generarReporteProcesoAccionTipoViviendasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoViviendaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ViviendaS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Vivienda", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoVivienda();
				
						this.actualizarParametrosGeneralTipoVivienda();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoviviendaReturnGeneral=tipoviviendaLogic.procesarAccionTipoViviendasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoviviendaLogic.getTipoViviendas(),this.tipoviviendaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoViviendaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoVivienda();
					
					TipoViviendaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoViviendaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoVivienda.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoVivienda.jComboBoxTiposAccionesFormularioTipoVivienda.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoVivienda(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoViviendaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoVivienda();
			
			if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
			TipoVivienda tipovivienda=new TipoVivienda();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoVivienda(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoVivienda.getSelectedItem();
			
			
			
			
			tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoviviendasSeleccionados.size()==1) {
				for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
					tipovivienda=tipoviviendaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Direccion")) {
					jButtonDireccionActionPerformed(null,rowIndex,true,false,tipovivienda);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoVivienda();
			
      		//this.finishProcessTipoVivienda(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoViviendaReturnGeneral() throws Exception {
		if(this.tipoviviendaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoviviendaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoviviendaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoviviendaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoviviendaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoviviendaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoVivienda(false);
		}
		
		if(this.tipoviviendaReturnGeneral.getConRetornoLista() || this.tipoviviendaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoviviendaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoviviendaLogic.setTipoViviendas(this.tipoviviendaReturnGeneral.getTipoViviendas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoviviendaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoviviendaLogic.setTipoVivienda(this.tipoviviendaReturnGeneral.getTipoVivienda());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoVivienda(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoVivienda() throws Exception {
		
		
	}
	
	public ArrayList<TipoVivienda> getTipoViviendasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoVivienda) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoVivienda tipoviviendaAux:tipoviviendaLogic.getTipoViviendas()) {
					if(tipoviviendaAux.getIsSelected()) {
						tipoviviendasSeleccionados.add(tipoviviendaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoVivienda tipoviviendaAux:this.tipoviviendas) {
					if(tipoviviendaAux.getIsSelected()) {
						tipoviviendasSeleccionados.add(tipoviviendaAux);				
					}
				}
			}
			
			if(tipoviviendasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoviviendasSeleccionados.addAll(this.tipoviviendaLogic.getTipoViviendas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoviviendasSeleccionados.addAll(this.tipoviviendas);				
					}
				}
			}
		} else {
			tipoviviendasSeleccionados.add(this.tipovivienda);
		}
		
		return tipoviviendasSeleccionados;
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
	
	public void generarReporteTipoViviendasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoViviendasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoViviendasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoViviendasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoViviendasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoViviendasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Vivienda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoViviendasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoVivienda();
		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoVivienda();
		
		
		//this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados ,tipoviviendaImplementable,tipoviviendaImplementableHome);
	}
	
	public void mostrarImportacionTipoViviendas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoVivienda();
		
		this.abrirFrameImportacionTipoVivienda();		
		
			
		//this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados ,tipoviviendaImplementable,tipoviviendaImplementableHome);
	}
	
	public void importarTipoViviendas() throws Exception {		
	
	}
	
	public void exportarTipoViviendasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoViviendasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoViviendasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoViviendasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Vivienda",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoVivienda(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoVivienda(tipoviviendaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoviviendaAux.setsDetalleGeneralEntityReporte(tipoviviendaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoVivienda(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoViviendaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViviendaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViviendaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViviendaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoViviendaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoVivienda(TipoVivienda tipovivienda,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipovivienda.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovivienda.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovivienda.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovivienda.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipovivienda.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoViviendas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoVivienda(row);				
				iRow++;
			}				
			
			for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoVivienda(tipoviviendaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoViviendasSeleccionados() throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();		
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipovivienda.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoviviendas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipovivienda");
			//elementRoot.appendChild(element);
		
			for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
				element = document.createElement("tipovivienda");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoVivienda(tipoviviendaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Vivienda",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoVivienda(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoViviendaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoVivienda(TipoVivienda tipovivienda,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipovivienda.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovivienda.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovivienda.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipovivienda.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoVivienda(TipoVivienda tipovivienda,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoViviendaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipovivienda.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoViviendaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipovivienda.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoViviendaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipovivienda.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoViviendaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipovivienda.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoViviendaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipovivienda.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoViviendasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoVivienda> tipoviviendasSeleccionados=new ArrayList<TipoVivienda>();
		
		tipoviviendasSeleccionados=this.getTipoViviendasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoVivienda(tipoviviendasSeleccionados);
		
		this.generarReporteTipoViviendas("Todos",tipoviviendasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoVivienda(ArrayList<TipoVivienda> tipoviviendasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoVivienda tipoviviendaAux:tipoviviendasSeleccionados) {
				tipoviviendaAux.setsDetalleGeneralEntityReporte(tipoviviendaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoviviendaAux.setsDescripcionGeneralEntityReporte1(tipoviviendaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoviviendaAux.setsDescripcionGeneralEntityReporte1(tipoviviendaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoViviendaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoviviendaAux.setsDescripcionGeneralEntityReporte1(tipoviviendaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoViviendaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoVivienda(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoVivienda=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=true;
				this.isVisibilidadCeldaGuardarCambiosTipoVivienda=true;
			}
			
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=true;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=true;
			this.isVisibilidadCeldaEliminarTipoVivienda=true;
			this.isVisibilidadCeldaCancelarTipoVivienda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=true;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoVivienda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=true;
			this.isVisibilidadCeldaModificarTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
			this.isVisibilidadCeldaModificarTipoVivienda=true;
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
			this.isVisibilidadCeldaCancelarTipoVivienda=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoVivienda=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoViviendaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoVivienda=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=true;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=true;
		} else {
			this.actualizarEstadoPanelsTipoVivienda(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoVivienda=false;
			//this.isVisibilidadCeldaVerFormTipoVivienda=false;
			this.isVisibilidadCeldaDuplicarTipoVivienda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoviviendaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoVivienda=false;
			this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoviviendaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;												
			}
			
			this.jButtonCerrarTipoVivienda.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoVivienda=false;
		}
		
		if(!this.permiteMantenimiento(this.tipovivienda)) {
			this.isVisibilidadCeldaActualizarTipoVivienda=false;
			this.isVisibilidadCeldaEliminarTipoVivienda=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoVivienda() {
		this.isVisibilidadCeldaNuevoTipoVivienda=false;
		this.isVisibilidadCeldaGuardarCambiosTipoVivienda=false;
	}
	
	public void actualizarEstadoPanelsTipoVivienda(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoVivienda!=null) {
				this.jScrollPanelDatosEdicionTipoVivienda.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoVivienda!=null) {
				this.jScrollPanelDatosTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoVivienda!=null) {
				this.jPanelPaginacionTipoVivienda.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
					this.jTabbedPaneBusquedasTipoVivienda.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoviviendaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoVivienda!=null) {
				this.jTabbedPaneBusquedasTipoVivienda.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoVivienda!=null) {
				this.jPanelParametrosReportesTipoVivienda.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoViviendaParaDirecciones() throws Exception {
		Boolean isPaginaPopupDireccion=false;

		try {

			if(this.tipoviviendaSessionBean==null) {
				this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean=new DireccionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setsPathNavegacionActual(tipoviviendaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DireccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDireccion=this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDireccion(false);
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDireccion(TipoViviendaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoVivienda(true);
			this.jInternalFrameDetalleFormTipoVivienda.direccionSessionBean.setlidTipoViviendaActual(this.idTipoViviendaActual);

			tipoviviendaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoVivienda(true);
			tipoviviendaSessionBean.setlIdTipoViviendaActualForeignKey(this.idTipoViviendaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoViviendaSessionBean tipoviviendaSessionBean=new TipoViviendaSessionBean();
		
		if(this.tipoviviendaSessionBean==null) {
			this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
		}
		
		this.tipoviviendaSessionBean.setsUltimaBusquedaTipoVivienda(this.getsAccionBusqueda());
		this.tipoviviendaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoviviendaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoviviendaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoViviendaSessionBean tipoviviendaSessionBean=new TipoViviendaSessionBean();
		
		if(this.tipoviviendaSessionBean==null) {
			this.tipoviviendaSessionBean=new TipoViviendaSessionBean();
		}
		
		if(this.tipoviviendaSessionBean.getsUltimaBusquedaTipoVivienda()!=null&&!this.tipoviviendaSessionBean.getsUltimaBusquedaTipoVivienda().equals("")) {
			this.setsAccionBusqueda(tipoviviendaSessionBean.getsUltimaBusquedaTipoVivienda());
			this.setiNumeroPaginacion(tipoviviendaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoviviendaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoviviendaSessionBean.getid_empresa());
				tipoviviendaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoviviendaSessionBean.setsUltimaBusquedaTipoVivienda("");
		this.tipoviviendaSessionBean.setiNumeroPaginacion(TipoViviendaConstantesFunciones.INUMEROPAGINACION);
		this.tipoviviendaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoVivienda(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoVivienda() {
		this.updateBorderResaltarBusquedasFormularioTipoVivienda();
		this.updateVisibilidadBusquedasFormularioTipoVivienda();
		this.updateHabilitarBusquedasFormularioTipoVivienda();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoVivienda() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoVivienda.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoVivienda() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoVivienda.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoVivienda() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoVivienda.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoVivienda(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoVivienda.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoVivienda() throws Exception {

		if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoVivienda();
		this.updateVisibilidadResaltarControlesFormularioTipoVivienda();
		this.updateHabilitarResaltarControlesFormularioTipoVivienda();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoVivienda() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoviviendaConstantesFunciones.resaltaridTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda!=null) {this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setBorder(this.tipoviviendaConstantesFunciones.resaltaridTipoVivienda);}
		if(this.tipoviviendaConstantesFunciones.resaltarid_empresaTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda!=null) {this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setBorder(this.tipoviviendaConstantesFunciones.resaltarid_empresaTipoVivienda);}
		if(this.tipoviviendaConstantesFunciones.resaltarcodigoTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda!=null) {this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setBorder(this.tipoviviendaConstantesFunciones.resaltarcodigoTipoVivienda);}
		if(this.tipoviviendaConstantesFunciones.resaltarnombreTipoVivienda!=null && this.jInternalFrameDetalleFormTipoVivienda!=null) {this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setBorder(this.tipoviviendaConstantesFunciones.resaltarnombreTipoVivienda);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoVivienda() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
	
		//this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostraridTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jPanelidTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostraridTipoVivienda);
		//this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarid_empresaTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jPanelid_empresaTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarid_empresaTipoVivienda);
		//this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarcodigoTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jPanelcodigoTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarcodigoTipoVivienda);
		//this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarnombreTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jPanelnombreTipoVivienda.setVisible(this.tipoviviendaConstantesFunciones.mostrarnombreTipoVivienda);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoVivienda() throws Exception {
		if(this.jInternalFrameDetalleFormTipoVivienda==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoVivienda!=null) {
	
		this.jInternalFrameDetalleFormTipoVivienda.jLabelidTipoVivienda.setEnabled(this.tipoviviendaConstantesFunciones.activaridTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jComboBoxid_empresaTipoVivienda.setEnabled(this.tipoviviendaConstantesFunciones.activarid_empresaTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jTextFieldcodigoTipoVivienda.setEnabled(this.tipoviviendaConstantesFunciones.activarcodigoTipoVivienda);
		this.jInternalFrameDetalleFormTipoVivienda.jTextAreanombreTipoVivienda.setEnabled(this.tipoviviendaConstantesFunciones.activarnombreTipoVivienda);
		}
	}
	
		
}