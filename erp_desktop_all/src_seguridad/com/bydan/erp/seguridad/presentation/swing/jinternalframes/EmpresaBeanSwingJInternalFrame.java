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

import com.bydan.erp.seguridad.util.EmpresaConstantesFunciones;
import com.bydan.erp.seguridad.util.EmpresaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.EmpresaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.EmpresaBean;
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
public class EmpresaBeanSwingJInternalFrame extends EmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Empresa> empresaValidator = new ClassValidator<Empresa>(Empresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Empresa empresa;	
	public Empresa empresaAux;
	public Empresa empresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Empresa empresaTotales;
	public Long idEmpresaActual;
	public Long iIdNuevoEmpresa=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

	public String sFinalQueryComboCiudad="";

	public List<Ciudad> ciudadsForeignKey;

	public List<Ciudad> getciudadsForeignKey() {
		return ciudadsForeignKey;
	}

	public void setciudadsForeignKey(List<Ciudad> ciudadsForeignKey) {
		this.ciudadsForeignKey = ciudadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ciudad ciudadForeignKey;

	public Ciudad getciudadForeignKey() {
		return ciudadForeignKey;
	}

	public void setciudadForeignKey(Ciudad ciudadForeignKey) {
		this.ciudadForeignKey = ciudadForeignKey;
	}

	public String sFinalQueryComboTipoEmpresa="";

	public List<TipoEmpresa> tipoempresasForeignKey;

	public List<TipoEmpresa> gettipoempresasForeignKey() {
		return tipoempresasForeignKey;
	}

	public void settipoempresasForeignKey(List<TipoEmpresa> tipoempresasForeignKey) {
		this.tipoempresasForeignKey = tipoempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoEmpresa tipoempresaForeignKey;

	public TipoEmpresa gettipoempresaForeignKey() {
		return tipoempresaForeignKey;
	}

	public void settipoempresaForeignKey(TipoEmpresa tipoempresaForeignKey) {
		this.tipoempresaForeignKey = tipoempresaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosSucursal=false;

	public Boolean getIsTienePermisosSucursal() {
		return isTienePermisosSucursal;
	}

	public void setIsTienePermisosSucursal(Boolean isTienePermisosSucursal) {
		this.isTienePermisosSucursal= isTienePermisosSucursal;
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
	
	public Boolean isPermisoTodoEmpresa;
	public Boolean isPermisoNuevoEmpresa;
	public Boolean isPermisoActualizarEmpresa;
	public Boolean isPermisoActualizarOriginalEmpresa;
	public Boolean isPermisoEliminarEmpresa;
	public Boolean isPermisoGuardarCambiosEmpresa;
	public Boolean isPermisoConsultaEmpresa;
	public Boolean isPermisoBusquedaEmpresa;
	public Boolean isPermisoReporteEmpresa;
	public Boolean isPermisoPaginacionMedioEmpresa;
	public Boolean isPermisoPaginacionAltoEmpresa;
	public Boolean isPermisoPaginacionTodoEmpresa;
	public Boolean isPermisoCopiarEmpresa;
	public Boolean isPermisoVerFormEmpresa;
	public Boolean isPermisoDuplicarEmpresa;
	public Boolean isPermisoOrdenEmpresa;
	
	
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
	
	public EmpresaParameterReturnGeneral empresaReturnGeneral;
	public EmpresaParameterReturnGeneral empresaParameterGeneral;
	
	

	public SucursalLogic sucursalLogic=null;

	public SucursalLogic getSucursalLogic() {
		return sucursalLogic;
	}

	public void setSucursalLogic(SucursalLogic sucursalLogic) {
		this.sucursalLogic = sucursalLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpresa=false;
	public Boolean esParaAccionDesdeFormularioEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpresaSessionBeanAdditional empresaSessionBeanAdditional=null;
	
	public EmpresaSessionBeanAdditional getEmpresaSessionBeanAdditional() {
		return this.empresaSessionBeanAdditional;
	}
	
	public void setEmpresaSessionBeanAdditional(EmpresaSessionBeanAdditional empresaSessionBeanAdditional) {
		try {
			this.empresaSessionBeanAdditional=empresaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpresaBeanSwingJInternalFrameAdditional empresaBeanSwingJInternalFrameAdditional=null;
	//public class EmpresaBeanSwingJInternalFrame
	
	public EmpresaBeanSwingJInternalFrameAdditional getEmpresaBeanSwingJInternalFrameAdditional() {
		return this.empresaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpresaBeanSwingJInternalFrameAdditional(EmpresaBeanSwingJInternalFrameAdditional empresaBeanSwingJInternalFrameAdditional) {
		try {
			this.empresaBeanSwingJInternalFrameAdditional=empresaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpresaLogic empresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Empresa empresaBean;
	public EmpresaConstantesFunciones empresaConstantesFunciones;
	//public EmpresaParameterReturnGeneral empresaReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	public TipoEmpresaLogic tipoempresaLogic;
	
	//PARAMETROS
	
	
	//public List<Empresa> empresas;	
	//public List<Empresa> empresasEliminados;
	//public List<Empresa> empresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpresa=false;
	public Boolean isVisibilidadCeldaModificarEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpresa=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdPaisPorNombre=false;
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdTipoEmpresa=false;
	
	public Long getiIdNuevoEmpresa() {
		return this.iIdNuevoEmpresa;
	}

	public void setiIdNuevoEmpresa(Long iIdNuevoEmpresa) {
		this.iIdNuevoEmpresa = iIdNuevoEmpresa;
	}
	
	public Long getidEmpresaActual() {
		return this.idEmpresaActual;
	}

	public void setidEmpresaActual(Long idEmpresaActual) {
		this.idEmpresaActual = idEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Empresa getempresa() {
		return this.empresa;
	}

	public void setempresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	public Empresa getempresaAux() {
		return this.empresaAux;
	}

	public void setempresaAux(Empresa empresaAux) {
		this.empresaAux = empresaAux;
	}				
	
	public Empresa getempresaAnterior() {
		return this.empresaAnterior;
	}

	public void setempresaAnterior(Empresa empresaAnterior) {
		this.empresaAnterior = empresaAnterior;
	}	
	
	public Empresa getempresaTotales() {
		return this.empresaTotales;
	}

	public void setempresaTotales(Empresa empresaTotales) {
		this.empresaTotales = empresaTotales;
	}	
	
	public Empresa getempresaBean() {
		return this.empresaBean;
	}

	public void setempresaBean(Empresa empresaBean) {
		this.empresaBean = empresaBean;
	}	
	
	public EmpresaParameterReturnGeneral getempresaReturnGeneral() {
		return this.empresaReturnGeneral;
	}

	public void setempresaReturnGeneral(EmpresaParameterReturnGeneral empresaReturnGeneral) {
		this.empresaReturnGeneral = empresaReturnGeneral;
	}	
	
	
	public Long id_paisBusquedaPorIdPaisPorNombre=-1L;

	public Long getid_paisBusquedaPorIdPaisPorNombre() {
		return this.id_paisBusquedaPorIdPaisPorNombre;
	}

	public void setid_paisBusquedaPorIdPaisPorNombre(Long id_paisBusquedaPorIdPaisPorNombre) {
		this.id_paisBusquedaPorIdPaisPorNombre = id_paisBusquedaPorIdPaisPorNombre;
	}

;
	public String nombreBusquedaPorIdPaisPorNombre="";

	public String getnombreBusquedaPorIdPaisPorNombre() {
		return this.nombreBusquedaPorIdPaisPorNombre;
	}

	public void setnombreBusquedaPorIdPaisPorNombre(String nombreBusquedaPorIdPaisPorNombre) {
		this.nombreBusquedaPorIdPaisPorNombre = nombreBusquedaPorIdPaisPorNombre;
	}

	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_tipo_empresaFK_IdTipoEmpresa=-1L;

	public Long getid_tipo_empresaFK_IdTipoEmpresa() {
		return this.id_tipo_empresaFK_IdTipoEmpresa;
	}

	public void setid_tipo_empresaFK_IdTipoEmpresa(Long id_tipo_empresaFK_IdTipoEmpresa) {
		this.id_tipo_empresaFK_IdTipoEmpresa = id_tipo_empresaFK_IdTipoEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpresaLogic getEmpresaLogic()	{		
		return empresaLogic;
	}

	public void setEmpresaLogic(EmpresaLogic empresaLogic) {
		this.empresaLogic = empresaLogic;
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
	
	public Boolean getIsEsNuevoEmpresa() {
		return isEsNuevoEmpresa;
	}

	public void setIsEsNuevoEmpresa(Boolean isEsNuevoEmpresa) {
		this.isEsNuevoEmpresa = isEsNuevoEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpresa() {
		return esParaAccionDesdeFormularioEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioEmpresa(Boolean esParaAccionDesdeFormularioEmpresa) {
		this.esParaAccionDesdeFormularioEmpresa = esParaAccionDesdeFormularioEmpresa;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
			}

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(empresaSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
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

	public void cargarCombosCiudadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ciudadsForeignKey=new ArrayList<Ciudad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CiudadLogic ciudadLogic=new CiudadLogic();

			ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
			}

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

					ciudadLogic.getTodosCiudadsWithConnection(sFinalQuery,new Pagination());

					this.ciudadsForeignKey=ciudadLogic.getCiudads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCiudad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(empresaSessionBean.getlidCiudadActual());
					this.ciudadsForeignKey.add(ciudadLogic.getCiudad());
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

	public void cargarCombosTipoEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoEmpresaLogic tipoempresaLogic=new TipoEmpresaLogic();

			tipoempresaLogic.getTipoEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
			}

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.getTipoEmpresaDataAccess().setIsForForeingKeyData(true);

					tipoempresaLogic.getTodosTipoEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipoempresasForeignKey=tipoempresaLogic.getTipoEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoempresaLogic.getEntityWithConnection(empresaSessionBean.getlidTipoEmpresaActual());
					this.tipoempresasForeignKey.add(tipoempresaLogic.getTipoEmpresa());
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

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.empresa!=null) {
						this.empresa.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisEmpresa.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaPorIdPaisPorNombre") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa!=null) {
						jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa!=null) {
							//jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setSelectedItem(paisTemp);
							if(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.getItemCount()>0) {
								jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setSelectedIndex(0);
							}
						}
					}
				}
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisEmpresa!=null) {
						jComboBoxid_paisFK_IdPaisEmpresa.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisEmpresa!=null) {
							//jComboBoxid_paisFK_IdPaisEmpresa.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisEmpresa.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisEmpresa.setSelectedIndex(0);
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

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisEmpresaGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisEmpresaGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisEmpresaGenerico!=null && jComboBoxid_paisEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_paisEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCiudadForeignKey(Long idCiudadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ciudadTemp!=null) {

					if(this.empresa!=null) {
						this.empresa.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadEmpresa.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setSelectedIndex(0);
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

	public String getActualCiudadForeignKeyDescripcion(Long idCiudadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}


			sDescripcion=CiudadConstantesFunciones.getCiudadDescripcion(ciudadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadEmpresaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsForeignKey) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			if(ciudadTemp!=null) {
				jComboBoxid_ciudadEmpresaGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadEmpresaGenerico!=null && jComboBoxid_ciudadEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_ciudadEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoEmpresaForeignKey(Long idTipoEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoempresaTemp!=null) {

					if(this.empresa!=null) {
						this.empresa.setTipoEmpresa(tipoempresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setSelectedItem(tipoempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_empresaEmpresa.setSelectedItem(tipoempresaTemp);
					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoempresaTemp!=null && jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa!=null) {
						jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setSelectedItem(tipoempresaTemp);
					} else {
						if(jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa!=null) {
							//jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setSelectedItem(tipoempresaTemp);
							if(jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.getItemCount()>0) {
								jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setSelectedIndex(0);
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

	public String getActualTipoEmpresaForeignKeyDescripcion(Long idTipoEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}


			sDescripcion=TipoEmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoEmpresaForeignKeyGenerico(Long idTipoEmpresaSeleccionado,JComboBox jComboBoxid_tipo_empresaEmpresaGenerico)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaTemp=null;

			for(TipoEmpresa tipoempresaAux:tipoempresasForeignKey) {
				if(tipoempresaAux.getId()!=null && tipoempresaAux.getId().equals(idTipoEmpresaSeleccionado)) {
					tipoempresaTemp=tipoempresaAux;
					break;
				}
			}

			if(tipoempresaTemp!=null) {
				jComboBoxid_tipo_empresaEmpresaGenerico.setSelectedItem(tipoempresaTemp);
			} else {
				if(jComboBoxid_tipo_empresaEmpresaGenerico!=null && jComboBoxid_tipo_empresaEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_empresaEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Empresa empresa,JComboBox jComboBoxid_paisEmpresaGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisEmpresaGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisEmpresaGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				empresa.setid_pais(paisAux.getId());
				empresa.setpais_descripcion(EmpresaConstantesFunciones.getPaisDescripcion(paisAux));
				empresa.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Empresa empresa,JComboBox jComboBoxid_ciudadEmpresaGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadEmpresaGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadEmpresaGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				empresa.setid_ciudad(ciudadAux.getId());
				empresa.setciudad_descripcion(EmpresaConstantesFunciones.getCiudadDescripcion(ciudadAux));
				empresa.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoEmpresaForeignKey(Empresa empresa,JComboBox jComboBoxid_tipo_empresaEmpresaGenerico)throws Exception
	{
		try
		{
			TipoEmpresa  tipoempresaAux=new TipoEmpresa();

			if(jComboBoxid_tipo_empresaEmpresaGenerico==null) {
				tipoempresaAux=(TipoEmpresa)this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.getSelectedItem();
			} else {
				tipoempresaAux=(TipoEmpresa)jComboBoxid_tipo_empresaEmpresaGenerico.getSelectedItem();
			}

			if(tipoempresaAux!=null && tipoempresaAux.getId()!=null) {
				empresa.setid_tipo_empresa(tipoempresaAux.getId());
				empresa.settipoempresa_descripcion(EmpresaConstantesFunciones.getTipoEmpresaDescripcion(tipoempresaAux));
				empresa.setTipoEmpresa(tipoempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) { 
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) { 
					}

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaPorIdPaisPorNombre") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.addItem(pais);
							}
						}

						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}
					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisEmpresa.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisEmpresa.addItem(pais);
							}
						}

						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCiudadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCiudad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) { 
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) { 
					}

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) { 
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.removeAllItems();

							for(TipoEmpresa tipoempresa:this.tipoempresasForeignKey) {
								this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.addItem(tipoempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpresa!=null) { 
					}

					if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.removeAllItems();

							for(TipoEmpresa tipoempresa:this.tipoempresasForeignKey) {
								this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.addItem(tipoempresa);
							}
						}

						if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.setSelectedIndex(iIndexSelected);
						}
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisEmpresa.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisEmpresa.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCiudadForeignKey(Ciudad ciudad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoEmpresaForeignKey(TipoEmpresa tipoempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setSelectedItem(tipoempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpresa!=null) {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setSelectedItem(tipoempresa);
						} else {
							this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpresaConstantesFunciones.refrescarForeignKeysDescripcionesEmpresa(this.empresaLogic.getEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpresaConstantesFunciones.refrescarForeignKeysDescripcionesEmpresa(this.empresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
		classes.add(new Classe(TipoEmpresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empresaLogic.setEmpresas(this.empresas);
			empresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpresaParameterReturnGeneral getEmpresaParameterGeneral() {
		return this.empresaParameterGeneral;
	}
	
	public void setEmpresaParameterGeneral(EmpresaParameterReturnGeneral empresaParameterGeneral) {
		this.empresaParameterGeneral = empresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpresa() {
		return isPermisoTodoEmpresa;
	}

	public void setIsPermisoTodoEmpresa(Boolean isPermisoTodoEmpresa) {
		this.isPermisoTodoEmpresa = isPermisoTodoEmpresa;
	}

	public Boolean getIsPermisoNuevoEmpresa() {
		return isPermisoNuevoEmpresa;
	}

	public void setIsPermisoNuevoEmpresa(Boolean isPermisoNuevoEmpresa) {
		this.isPermisoNuevoEmpresa = isPermisoNuevoEmpresa;
	}

	public Boolean getIsPermisoActualizarEmpresa() {
		return isPermisoActualizarEmpresa;
	}

	public void setIsPermisoActualizarEmpresa(Boolean isPermisoActualizarEmpresa) {
		this.isPermisoActualizarEmpresa = isPermisoActualizarEmpresa;
	}

	public Boolean getIsPermisoEliminarEmpresa() {
		return isPermisoEliminarEmpresa;
	}

	public void setIsPermisoEliminarEmpresa(Boolean isPermisoEliminarEmpresa) {
		this.isPermisoEliminarEmpresa = isPermisoEliminarEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosEmpresa() {
		return isPermisoGuardarCambiosEmpresa;
	}

	public void setIsPermisoGuardarCambiosEmpresa(Boolean isPermisoGuardarCambiosEmpresa) {
		this.isPermisoGuardarCambiosEmpresa = isPermisoGuardarCambiosEmpresa;
	}
	
	public Boolean getIsPermisoConsultaEmpresa() {
		return isPermisoConsultaEmpresa;
	}

	public void setIsPermisoConsultaEmpresa(Boolean isPermisoConsultaEmpresa) {
		this.isPermisoConsultaEmpresa = isPermisoConsultaEmpresa;
	}

	public Boolean getIsPermisoBusquedaEmpresa() {
		return isPermisoBusquedaEmpresa;
	}

	public void setIsPermisoBusquedaEmpresa(Boolean isPermisoBusquedaEmpresa) {
		this.isPermisoBusquedaEmpresa = isPermisoBusquedaEmpresa;
	}

	public Boolean getIsPermisoReporteEmpresa() {
		return isPermisoReporteEmpresa;
	}

	public void setIsPermisoReporteEmpresa(Boolean isPermisoReporteEmpresa) {
		this.isPermisoReporteEmpresa = isPermisoReporteEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpresa() {
		return isPermisoPaginacionMedioEmpresa;
	}

	public void setIsPermisoPaginacionMedioEmpresa(Boolean isPermisoPaginacionMedioEmpresa) {
		this.isPermisoPaginacionMedioEmpresa = isPermisoPaginacionMedioEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpresa() {
		return isPermisoPaginacionTodoEmpresa;
	}

	public void setIsPermisoPaginacionTodoEmpresa(Boolean isPermisoPaginacionTodoEmpresa) {
		this.isPermisoPaginacionTodoEmpresa = isPermisoPaginacionTodoEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpresa() {
		return isPermisoPaginacionAltoEmpresa;
	}

	public void setIsPermisoPaginacionAltoEmpresa(Boolean isPermisoPaginacionAltoEmpresa) {
		this.isPermisoPaginacionAltoEmpresa = isPermisoPaginacionAltoEmpresa;
	}
	
	public Boolean getIsPermisoCopiarEmpresa() {
		return isPermisoCopiarEmpresa;
	}

	public void setIsPermisoCopiarEmpresa(Boolean isPermisoCopiarEmpresa) {
		this.isPermisoCopiarEmpresa = isPermisoCopiarEmpresa;
	}
	
	public Boolean getIsPermisoVerFormEmpresa() {
		return isPermisoVerFormEmpresa;
	}

	public void setIsPermisoVerFormEmpresa(Boolean isPermisoVerFormEmpresa) {
		this.isPermisoVerFormEmpresa = isPermisoVerFormEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarEmpresa() {
		return isPermisoDuplicarEmpresa;
	}

	public void setIsPermisoDuplicarEmpresa(Boolean isPermisoDuplicarEmpresa) {
		this.isPermisoDuplicarEmpresa = isPermisoDuplicarEmpresa;
	}
	
	public Boolean getIsPermisoOrdenEmpresa() {
		return isPermisoOrdenEmpresa;
	}

	public void setIsPermisoOrdenEmpresa(Boolean isPermisoOrdenEmpresa) {
		this.isPermisoOrdenEmpresa = isPermisoOrdenEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpresa() {
		return isVisibilidadCeldaNuevoEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoEmpresa(Boolean isVisibilidadCeldaNuevoEmpresa) {
		this.isVisibilidadCeldaNuevoEmpresa = isVisibilidadCeldaNuevoEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpresa() {
		return isVisibilidadCeldaDuplicarEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarEmpresa(Boolean isVisibilidadCeldaDuplicarEmpresa) {
		this.isVisibilidadCeldaDuplicarEmpresa = isVisibilidadCeldaDuplicarEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpresa() {
		return isVisibilidadCeldaCopiarEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarEmpresa(Boolean isVisibilidadCeldaCopiarEmpresa) {
		this.isVisibilidadCeldaCopiarEmpresa = isVisibilidadCeldaCopiarEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpresa() {
		return isVisibilidadCeldaVerFormEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormEmpresa(Boolean isVisibilidadCeldaVerFormEmpresa) {
		this.isVisibilidadCeldaVerFormEmpresa = isVisibilidadCeldaVerFormEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpresa() {
		return isVisibilidadCeldaOrdenEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenEmpresa(Boolean isVisibilidadCeldaOrdenEmpresa) {
		this.isVisibilidadCeldaOrdenEmpresa = isVisibilidadCeldaOrdenEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesEmpresa = isVisibilidadCeldaNuevoRelacionesEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpresa() {
		return isVisibilidadCeldaModificarEmpresa;
	}

	public void setIsVisibilidadCeldaModificarEmpresa(Boolean isVisibilidadCeldaModificarEmpresa) {
		this.isVisibilidadCeldaModificarEmpresa = isVisibilidadCeldaModificarEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpresa() {
		return isVisibilidadCeldaActualizarEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarEmpresa(Boolean isVisibilidadCeldaActualizarEmpresa) {
		this.isVisibilidadCeldaActualizarEmpresa = isVisibilidadCeldaActualizarEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpresa() {
		return isVisibilidadCeldaEliminarEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarEmpresa(Boolean isVisibilidadCeldaEliminarEmpresa) {
		this.isVisibilidadCeldaEliminarEmpresa = isVisibilidadCeldaEliminarEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpresa() {
		return isVisibilidadCeldaCancelarEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarEmpresa(Boolean isVisibilidadCeldaCancelarEmpresa) {
		this.isVisibilidadCeldaCancelarEmpresa = isVisibilidadCeldaCancelarEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpresa() {
		return isVisibilidadCeldaGuardarEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarEmpresa(Boolean isVisibilidadCeldaGuardarEmpresa) {
		this.isVisibilidadCeldaGuardarEmpresa = isVisibilidadCeldaGuardarEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpresa() {
		return isVisibilidadCeldaGuardarCambiosEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpresa(Boolean isVisibilidadCeldaGuardarCambiosEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosEmpresa = isVisibilidadCeldaGuardarCambiosEmpresa;
	}
		
	public EmpresaSessionBean getempresaSessionBean() {
		return this.empresaSessionBean;
	}
	
	public void setempresaSessionBean(EmpresaSessionBean empresaSessionBean) {
		this.empresaSessionBean=empresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdPaisPorNombre() {
		return this.isVisibilidadBusquedaPorIdPaisPorNombre;
	}

	public void setisVisibilidadBusquedaPorIdPaisPorNombre(Boolean isVisibilidadBusquedaPorIdPaisPorNombre) {
		this.isVisibilidadBusquedaPorIdPaisPorNombre=isVisibilidadBusquedaPorIdPaisPorNombre;
	}

	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdTipoEmpresa() {
		return this.isVisibilidadFK_IdTipoEmpresa;
	}

	public void setisVisibilidadFK_IdTipoEmpresa(Boolean isVisibilidadFK_IdTipoEmpresa) {
		this.isVisibilidadFK_IdTipoEmpresa=isVisibilidadFK_IdTipoEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpresa(Empresa empresa)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(empresa,null);
				this.setActualParaGuardarCiudadForeignKey(empresa,null);
				this.setActualParaGuardarTipoEmpresaForeignKey(empresa,null);
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
	
	public void bugActualizarReferenciaActual(Empresa empresa,Empresa empresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpresa(empresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empresaAux.setId(empresa.getId());
		empresaAux.setVersionRow(empresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpresa();
		
			int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empresaValidator.getInvalidValues(this.empresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empresaLogic.setDatosCliente(datosCliente);
			empresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empresaAux=new  Empresa();
				
				empresaAux.setIsNew(true);
				empresaAux.setIsChanged(true);
				
				empresaAux.setEmpresaOriginal(this.empresa);
				
				empresaAux.setId(this.empresa.getId());	
				empresaAux.setVersionRow(this.empresa.getVersionRow());	
				empresaAux.setid_pais(this.empresa.getid_pais());	
				empresaAux.setid_ciudad(this.empresa.getid_ciudad());	
				empresaAux.setid_tipo_empresa(this.empresa.getid_tipo_empresa());	
				empresaAux.setnombre(this.empresa.getnombre());	
				empresaAux.setdireccion(this.empresa.getdireccion());	
				empresaAux.setruc(this.empresa.getruc());	
				empresaAux.setmail(this.empresa.getmail());	
				empresaAux.settelefono(this.empresa.gettelefono());	
				empresaAux.setfax(this.empresa.getfax());	
				empresaAux.setcodigo_postal(this.empresa.getcodigo_postal());	
				empresaAux.setiva(this.empresa.getiva());	
				empresaAux.setactividad_principal(this.empresa.getactividad_principal());	
				empresaAux.setactividad_secundaria(this.empresa.getactividad_secundaria());	
				empresaAux.setcontador_nombre(this.empresa.getcontador_nombre());	
				empresaAux.setcontador_ruc(this.empresa.getcontador_ruc());	
				empresaAux.setcontador_licencia(this.empresa.getcontador_licencia());	
				empresaAux.setrepresentante_nombre(this.empresa.getrepresentante_nombre());	
				empresaAux.setrepresentante_cedula(this.empresa.getrepresentante_cedula());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empresaAux,empresaLogic.getEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaAux,empresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.saveEmpresas();//WithConnection
						//empresaLogic.getSetVersionRowEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empresa,empresaAux);
					
					this.refrescarForeignKeysDescripcionesEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals().addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals.addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaLogic.saveEmpresaRelaciones(empresaAux,this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());//WithConnection
								//empresaLogic.getSetVersionRowEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empresa,empresaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.setSucursals(new ArrayList<Sucursal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals= new ArrayList<Sucursal>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();}
							empresaAux.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empresaAux,empresaLogic.getEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empresaAux,empresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empresa,empresaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empresaAux=new  Empresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empresaSessionBean.getEsGuardarRelacionado() 
					|| (this.empresaSessionBean.getEsGuardarRelacionado() && this.empresa.getId()>=0)) {
						
					empresaAux.setIsNew(false);
				}
				
				empresaAux.setIsDeleted(false);
			
				empresaAux.setId(this.empresa.getId());	
				empresaAux.setVersionRow(this.empresa.getVersionRow());	
				empresaAux.setid_pais(this.empresa.getid_pais());	
				empresaAux.setid_ciudad(this.empresa.getid_ciudad());	
				empresaAux.setid_tipo_empresa(this.empresa.getid_tipo_empresa());	
				empresaAux.setnombre(this.empresa.getnombre());	
				empresaAux.setdireccion(this.empresa.getdireccion());	
				empresaAux.setruc(this.empresa.getruc());	
				empresaAux.setmail(this.empresa.getmail());	
				empresaAux.settelefono(this.empresa.gettelefono());	
				empresaAux.setfax(this.empresa.getfax());	
				empresaAux.setcodigo_postal(this.empresa.getcodigo_postal());	
				empresaAux.setiva(this.empresa.getiva());	
				empresaAux.setactividad_principal(this.empresa.getactividad_principal());	
				empresaAux.setactividad_secundaria(this.empresa.getactividad_secundaria());	
				empresaAux.setcontador_nombre(this.empresa.getcontador_nombre());	
				empresaAux.setcontador_ruc(this.empresa.getcontador_ruc());	
				empresaAux.setcontador_licencia(this.empresa.getcontador_licencia());	
				empresaAux.setrepresentante_nombre(this.empresa.getrepresentante_nombre());	
				empresaAux.setrepresentante_cedula(this.empresa.getrepresentante_cedula());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empresaAux,empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaAux,empresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.saveEmpresas();//WithConnection
						//empresaLogic.getSetVersionRowEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empresa,empresaAux);
					
					this.refrescarForeignKeysDescripcionesEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals().addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals.addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaLogic.saveEmpresaRelaciones(empresaAux,this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());//WithConnection
								//empresaLogic.getSetVersionRowEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empresa,empresaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.setSucursals(new ArrayList<Sucursal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals= new ArrayList<Sucursal>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();}
							empresaAux.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empresaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empresaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empresaAux,empresaLogic.getEmpresas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empresaAux,empresas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empresa,empresaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empresaAux=new  Empresa();
				
				empresaAux.setIsNew(false);
				empresaAux.setIsChanged(false);
				
				empresaAux.setIsDeleted(true);
				
				empresaAux.setId(this.empresa.getId());	
				empresaAux.setVersionRow(this.empresa.getVersionRow());	
				empresaAux.setid_pais(this.empresa.getid_pais());	
				empresaAux.setid_ciudad(this.empresa.getid_ciudad());	
				empresaAux.setid_tipo_empresa(this.empresa.getid_tipo_empresa());	
				empresaAux.setnombre(this.empresa.getnombre());	
				empresaAux.setdireccion(this.empresa.getdireccion());	
				empresaAux.setruc(this.empresa.getruc());	
				empresaAux.setmail(this.empresa.getmail());	
				empresaAux.settelefono(this.empresa.gettelefono());	
				empresaAux.setfax(this.empresa.getfax());	
				empresaAux.setcodigo_postal(this.empresa.getcodigo_postal());	
				empresaAux.setiva(this.empresa.getiva());	
				empresaAux.setactividad_principal(this.empresa.getactividad_principal());	
				empresaAux.setactividad_secundaria(this.empresa.getactividad_secundaria());	
				empresaAux.setcontador_nombre(this.empresa.getcontador_nombre());	
				empresaAux.setcontador_ruc(this.empresa.getcontador_ruc());	
				empresaAux.setcontador_licencia(this.empresa.getcontador_licencia());	
				empresaAux.setrepresentante_nombre(this.empresa.getrepresentante_nombre());	
				empresaAux.setrepresentante_cedula(this.empresa.getrepresentante_cedula());	
				
				if(this.empresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empresaAux.getId()>=0) {	
						this.empresasEliminados.add(empresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empresaAux,empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaAux,empresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.saveEmpresas();//WithConnection
						//empresaLogic.getSetVersionRowEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals().addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals.addAll(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaLogic.saveEmpresaRelaciones(empresaAux,this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());//WithConnection
								//empresaLogic.getSetVersionRowEmpresas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.setSucursals(new ArrayList<Sucursal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals= new ArrayList<Sucursal>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.quitarFilaTotales();}
							empresaAux.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.empresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empresaAux,empresaLogic.getEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empresaAux,empresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getEmpresas().addAll(this.empresasEliminados);
					
					empresaLogic.saveEmpresas();//WithConnection
					//empresaLogic.getSetVersionRowEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpresa();
				
				this.empresasEliminados= new ArrayList<Empresa>();		
			}
			
			if(this.empresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empresa=empresaAux;
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
      		//this.finishProcessEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(Empresa empresaLocal) throws Exception {
		
		if(this.empresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				empresaLocal.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());
			
			} else {
			
				empresaLocal.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Empresa empresaLocal) throws Exception {	
		if(this.empresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				empresaLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				empresaLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoEmpresaDetalleFormJInternalFrame.class)) {
				TipoEmpresaBeanSwingJInternalFrame tipoempresaBeanSwingJInternalFrameLocal=(TipoEmpresaBeanSwingJInternalFrame) ((TipoEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoEmpresa(tipoempresaBeanSwingJInternalFrameLocal.gettipoempresa(),true);
				tipoempresaBeanSwingJInternalFrameLocal.actualizarLista(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa,this.tipoempresasForeignKey);

				tipoempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa);

				empresaLocal.setTipoEmpresa(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa);

				this.addItemDefectoCombosForeignKeyTipoEmpresa();
				this.cargarCombosFrameTipoEmpresasForeignKey("Formulario");
				this.setActualTipoEmpresaForeignKey(tipoempresaBeanSwingJInternalFrameLocal.tipoempresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empresaValidator.getInvalidValues(this.empresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Empresa empresa,List<Empresa> empresas) throws Exception {
		try	{		
			EmpresaConstantesFunciones.actualizarLista(empresa,empresas,this.empresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Empresa empresa,List<Empresa> empresas) throws Exception {
		try	{			
			EmpresaConstantesFunciones.actualizarSelectedLista(empresa,empresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Empresa> empresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empresasLocal=this.empresaLogic.getEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empresasLocal=this.empresas;
			}
			//ARCHITECTURE
		
			for(Empresa empresaLocal:empresasLocal) {
				if(this.permiteMantenimiento(empresaLocal) && empresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpresaConstantesFunciones.getEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelid_paisEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelid_ciudadEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.IDTIPOEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelid_tipo_empresaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelnombreEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabeldireccionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrucEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.MAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelmailEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabeltelefonoEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.FAX)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelfaxEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.CODIGOPOSTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcodigo_postalEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelivaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.ACTIVIDADPRINCIPAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_principalEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.ACTIVIDADSECUNDARIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_secundariaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.CONTADORNOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_nombreEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.CONTADORRUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_rucEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.CONTADORLICENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_licenciaEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.REPRESENTANTENOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_nombreEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaConstantesFunciones.REPRESENTANTECEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_cedulaEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelid_paisEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelid_ciudadEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelid_tipo_empresaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelnombreEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabeldireccionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelrucEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelmailEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabeltelefonoEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelfaxEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelcodigo_postalEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelivaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_principalEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_secundariaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_nombreEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_rucEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_licenciaEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_nombreEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_cedulaEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Sucursal")) {
			if(this.empresa==null) {
				this.empresa= new Empresa();
			}

			if(this.empresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEmpresa
				this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);

				this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.getsucursal().setEmpresa(this.empresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEmpresa--;	
		
		
		this.empresaAux=new Empresa();
		
		this.empresaAux.setId(this.iIdNuevoEmpresa);
		this.empresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empresaLogic.getEmpresas().add(this.empresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empresas.add(this.empresaAux);
		}
		//ARCHITECTURE
		
		this.empresa=this.empresaAux;
		
		if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpresa(this.empresa);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpresa(this.empresa);
		}
				
		//this.setDefaultControlesEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpresa(this.empresaBean,this.empresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empresaSessionBean.getConGuardarRelaciones()) {
			classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empresaReturnGeneral=empresaLogic.procesarEventosEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresaLogic.getEmpresas(),this.empresa,this.empresaParameterGeneral,this.isEsNuevoEmpresa,classes);//this.empresaLogic.getEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpresa(this.empresaReturnGeneral,this.empresaBean,false);
		
		if(this.empresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpresa(this.empresaReturnGeneral.getEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpresa(this.empresaReturnGeneral.getEmpresa());
		}
		
		if(this.empresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpresa(this.empresaReturnGeneral.getEmpresa(),classes);//this.empresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpresaBeanSwingJInternalFrameAdditional.RecargarFormEmpresa(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpresa(false);
						
			if(empresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalSessionBean.getEsGuardarRelacionado() && SucursalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSucursalActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresa();
			}
			
			this.actualizarVisualTableDatosEmpresa();
			
			this.jTableDatosEmpresa.setRowSelectionInterval(this.getIndiceNuevoEmpresa(), this.getIndiceNuevoEmpresa());
			
			this.seleccionarFilaTablaEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarnombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activardireccionEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarrucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarmailEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activartelefonoEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarfaxEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarcodigo_postalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarivaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activaractividad_principalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activaractividad_secundariaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarcontador_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarcontador_rucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarcontador_licenciaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarrepresentante_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarrepresentante_cedulaEmpresa);	
		
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarid_paisEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarid_ciudadEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setEnabled(isHabilitar && this.empresaConstantesFunciones.activarid_tipo_empresaEmpresa);
	};
	
	public void setDefaultControlesEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empresaSessionBean.setConGuardarRelaciones(true);			
			this.empresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.empresaSessionBean.setConGuardarRelaciones(false);			
			this.empresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
				if(empresaAux.getId().equals(this.iIdNuevoEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empresa empresaAux:this.empresas) {
				if(empresaAux.getId().equals(this.iIdNuevoEmpresa)) {
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
	
	public int getIndiceActualEmpresa(Empresa empresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
				if(empresaAux.getId().equals(empresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empresa empresaAux:this.empresas) {
				if(empresaAux.getId().equals(empresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpresa(Empresa empresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
				if(empresaAux.getEmpresaOriginal().getId().equals(empresaOriginal.getId())) {
					existe=true;
					empresaOriginal.setId(empresaAux.getId());
					empresaOriginal.setVersionRow(empresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empresa empresaAux:this.empresas) {
				if(empresaAux.getEmpresaOriginal().getId().equals(empresaOriginal.getId())) {
					existe=true;
					empresaOriginal.setId(empresaAux.getId());
					empresaOriginal.setVersionRow(empresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpresa(Boolean esParaCancelar) throws Exception {
		empresasAux=new ArrayList<Empresa>();
		empresaAux=new Empresa();
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
					if(empresaAux.getId()<0) {
						empresasAux.add(empresaAux);
					}		
				}
				this.iIdNuevoEmpresa=0L;
				this.empresaLogic.getEmpresas().removeAll(empresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empresa empresaAux:this.empresas) {
					if(empresaAux.getId()<0) {
						empresasAux.add(empresaAux);
					}		
				}
				this.iIdNuevoEmpresa=0L;
				this.empresas.removeAll(empresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpresa 
					&& this.empresaLogic.getEmpresas().size()>0
					) {
					empresaAux=this.empresaLogic.getEmpresas().get(this.empresaLogic.getEmpresas().size() - 1);
				
					if(empresaAux.getId()<0) {
						this.empresaLogic.getEmpresas().remove(empresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpresa && this.empresas.size()>0) {
					empresaAux=this.empresas.get(this.empresas.size() - 1);
				
					if(empresaAux.getId()<0) {
						this.empresas.remove(empresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empresa.getId()<0) {
				this.empresaLogic.getEmpresas().remove(this.empresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empresa.getId()<0) {
				this.empresas.remove(this.empresa);
			}
		}			
	}
	
	public void setEstadosInicialesEmpresa(List<Empresa> empresasAux) throws Exception {
		EmpresaConstantesFunciones.setEstadosInicialesEmpresa(empresasAux);
	}
	
	public void setEstadosInicialesEmpresa(Empresa empresaAux) throws Exception {
		EmpresaConstantesFunciones.setEstadosInicialesEmpresa(empresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpresaActual()) {
				if(!this.isEsNuevoEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empresa ?", "MANTENIMIENTO DE Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Empresa empresa) throws Exception {
		EmpresaConstantesFunciones.seleccionarAsignar(this.empresa,empresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpresa=this.isPermisoActualizarOriginalEmpresa;
			
			
			this.seleccionarAsignar(empresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpresaConstantesFunciones.quitarEspaciosEmpresa(this.empresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empresaSessionBean.setsFuncionBusquedaRapida(this.empresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpresa(esParaCancelar);				
				this.cancelarNuevoEmpresa(esParaCancelar);								
			}
			
			this.empresa=new Empresa();
			
			this.inicializarEmpresa();
			
			this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpresa() throws Exception {
		try {
			EmpresaConstantesFunciones.inicializarEmpresa(this.empresa);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empresaLogic.getEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpresas(String sAccionBusqueda,List<Empresa> empresasParaReportes) throws Exception {
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
					sPathReporteFinal="Empresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Empresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empresas");		
		parameters.put("busquedapor", EmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Sucursal.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EmpresaLogic empresaLogicAuxiliar=new EmpresaLogic();
					empresaLogicAuxiliar.setDatosCliente(empresaLogic.getDatosCliente());				
					empresaLogicAuxiliar.setEmpresas(empresasParaReportes);
					
					empresaLogicAuxiliar.cargarRelacionesLoteForeignKeyEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					empresasParaReportes=empresaLogicAuxiliar.getEmpresas();
					
					//empresaLogic.getNewConnexionToDeep();
					
					//for (Empresa empresa:empresasParaReportes) {
					//	empresaLogic.deepLoad(empresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//empresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//empresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileSucursal = AuxiliarReportes.class.getResourceAsStream("SucursalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_sucursal", reportFileSucursal);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpresa=new JRBeanArrayDataSource(EmpresaJInternalFrame.TraerEmpresaBeans(empresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpresaBean.TraerEmpresaBeans(empresasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpresaActionPerformed(null);
					//this.generarExcelReporteEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpresas(sAccionBusqueda,sTipoArchivoReporte,empresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<Empresa> empresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Empresa empresa : empresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpresaConstantesFunciones.generarExcelReporteDataEmpresa("NORMAL",row,workbook,empresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpresa(String sTipo,Row row,Workbook workbook) {
		
		EmpresaConstantesFunciones.generarExcelReporteHeaderEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<Empresa> empresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Empresa empresa : empresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpresaConstantesFunciones.getEmpresaDescripcion(empresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.gettipoempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_MAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_MAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getmail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_FAX))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_FAX);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getfax());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getcodigo_postal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getactividad_principal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getactividad_secundaria());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getcontador_nombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_CONTADORRUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORRUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getcontador_ruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getcontador_licencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getrepresentante_nombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresa.getrepresentante_cedula());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<Empresa> empresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Empresa> empresasRespaldo=null;
		
		classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empresaLogic.setDatosCliente(this.datosCliente);
		this.empresaLogic.setDatosDeep(this.datosDeep);
		this.empresaLogic.setIsConDeep(true);
		
		empresasRespaldo=this.empresaLogic.getEmpresas();
		
		this.empresaLogic.setEmpresas(empresasParaReportes);	
		this.empresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empresasParaReportes=this.empresaLogic.getEmpresas();
		this.empresaLogic.setEmpresas(empresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Empresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Empresa empresa : empresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpresaConstantesFunciones.generarExcelReporteDataEmpresa("NORMAL",row,workbook,empresa,cellStyleDataAux);
		
			
			


				//Sucursal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SucursalConstantesFunciones.SCLASSWEBTITULO))) {

				if(empresa.getSucursals()!=null && empresa.getSucursals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SucursalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SucursalConstantesFunciones.generarExcelReporteHeaderSucursal("RELACIONADO",row,workbook);
				}

				if(empresa.getSucursals()!=null) {
					i2=0;
					for(Sucursal sucursal : empresa.getSucursals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SucursalConstantesFunciones.generarExcelReporteDataSucursal("RELACIONADO",row,workbook,sucursal,cellStyleDataAuxHijo);
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
		cell.setCellValue(EmpresaConstantesFunciones.getEmpresaDescripcion(empresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpresa() throws Exception {		
		this.startProcessEmpresa(true);
	}
	
	public void startProcessEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpresa ,this.jPanelParametrosReportesEmpresa, this.jScrollPanelDatosEmpresa,this.jPanelPaginacionEmpresa, this.jScrollPanelDatosEdicionEmpresa, this.jPanelAccionesEmpresa,this.jPanelAccionesFormularioEmpresa,this.jmenuBarEmpresa,this.jmenuBarDetalleEmpresa,this.jTtoolBarEmpresa,this.jTtoolBarDetalleEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpresa=this.jTabbedPaneBusquedasEmpresa; 
		
		final JPanel jPanelParametrosReportesEmpresa=this.jPanelParametrosReportesEmpresa;
		//final JScrollPane jScrollPanelDatosEmpresa=this.jScrollPanelDatosEmpresa;
		final JTable jTableDatosEmpresa=this.jTableDatosEmpresa;		
		final JPanel jPanelPaginacionEmpresa=this.jPanelPaginacionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionEmpresa=this.jScrollPanelDatosEdicionEmpresa;
		final JPanel jPanelAccionesEmpresa=this.jPanelAccionesEmpresa;
		
		JPanel jPanelCamposAuxiliarEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
			jPanelCamposAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jPanelCamposEmpresa;
			jPanelAccionesFormularioAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jPanelAccionesFormularioEmpresa;
		}
		
		final JPanel jPanelCamposEmpresa=jPanelCamposAuxiliarEmpresa;
		final JPanel jPanelAccionesFormularioEmpresa=jPanelAccionesFormularioAuxiliarEmpresa;
		
		
		final JMenuBar jmenuBarEmpresa=this.jmenuBarEmpresa;
		final JToolBar jTtoolBarEmpresa=this.jTtoolBarEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
			jmenuBarDetalleAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jmenuBarDetalleEmpresa;
			jTtoolBarDetalleAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jTtoolBarDetalleEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleEmpresa=jmenuBarDetalleAuxiliarEmpresa;
		final JToolBar jTtoolBarDetalleEmpresa=jTtoolBarDetalleAuxiliarEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpresa;
			processRunnable.jTableDatos=jTableDatosEmpresa;
			processRunnable.jPanelCampos=jPanelCamposEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpresa;
			processRunnable.jTtoolBar=jTtoolBarEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpresa ,jPanelParametrosReportesEmpresa,jTableDatosEmpresa, /*jScrollPanelDatosEmpresa,*/jPanelCamposEmpresa,jPanelPaginacionEmpresa, /*jScrollPanelDatosEdicionEmpresa,*/ jPanelAccionesEmpresa,jPanelAccionesFormularioEmpresa,jmenuBarEmpresa,jmenuBarDetalleEmpresa,jTtoolBarEmpresa,jTtoolBarDetalleEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpresa ,jPanelParametrosReportesEmpresa, jScrollPanelDatosEmpresa,jPanelPaginacionEmpresa, jScrollPanelDatosEdicionEmpresa, jPanelAccionesEmpresa,jPanelAccionesFormularioEmpresa,jmenuBarEmpresa,jmenuBarDetalleEmpresa,jTtoolBarEmpresa,jTtoolBarDetalleEmpresa);
						
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
	
	public void finishProcessEmpresa() {// throws Exception 
		this.finishProcessEmpresa(true);
	}
	
	public void finishProcessEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpresa ,this.jPanelParametrosReportesEmpresa, this.jScrollPanelDatosEmpresa,this.jPanelPaginacionEmpresa, this.jScrollPanelDatosEdicionEmpresa, this.jPanelAccionesEmpresa,this.jPanelAccionesFormularioEmpresa,this.jmenuBarEmpresa,this.jmenuBarDetalleEmpresa,this.jTtoolBarEmpresa,this.jTtoolBarDetalleEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpresa=this.jTabbedPaneBusquedasEmpresa; 
		
		final JPanel jPanelParametrosReportesEmpresa=this.jPanelParametrosReportesEmpresa;
		//final JScrollPane jScrollPanelDatosEmpresa=this.jScrollPanelDatosEmpresa;
		final JTable jTableDatosEmpresa=this.jTableDatosEmpresa;		
		final JPanel jPanelPaginacionEmpresa=this.jPanelPaginacionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionEmpresa=this.jScrollPanelDatosEdicionEmpresa;
		final JPanel jPanelAccionesEmpresa=this.jPanelAccionesEmpresa;
		
		JPanel jPanelCamposAuxiliarEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
			jPanelCamposAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jPanelCamposEmpresa;
			jPanelAccionesFormularioAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jPanelAccionesFormularioEmpresa;
		}
		
		final JPanel jPanelCamposEmpresa=jPanelCamposAuxiliarEmpresa;
		final JPanel jPanelAccionesFormularioEmpresa=jPanelAccionesFormularioAuxiliarEmpresa;
		
		
		final JMenuBar jmenuBarEmpresa=this.jmenuBarEmpresa;		
		final JToolBar jTtoolBarEmpresa=this.jTtoolBarEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
			jmenuBarDetalleAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jmenuBarDetalleEmpresa;
			jTtoolBarDetalleAuxiliarEmpresa=this.jInternalFrameDetalleFormEmpresa.jTtoolBarDetalleEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleEmpresa=jmenuBarDetalleAuxiliarEmpresa;
		final JToolBar jTtoolBarDetalleEmpresa=jTtoolBarDetalleAuxiliarEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpresa;
			processRunnable.jTableDatos=jTableDatosEmpresa;
			processRunnable.jPanelCampos=jPanelCamposEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpresa;
			processRunnable.jTtoolBar=jTtoolBarEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpresa ,jPanelParametrosReportesEmpresa, jTableDatosEmpresa,/*jScrollPanelDatosEmpresa,*/jPanelCamposEmpresa,jPanelPaginacionEmpresa, /*jScrollPanelDatosEdicionEmpresa,*/ jPanelAccionesEmpresa,jPanelAccionesFormularioEmpresa,jmenuBarEmpresa,jmenuBarDetalleEmpresa,jTtoolBarEmpresa,jTtoolBarDetalleEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empresaConstantesFunciones.getsFinalQueryEmpresa();
		String  finalQueryPaginacionTodos=this.empresaConstantesFunciones.getsFinalQueryEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpresaConstantesFunciones.getArrayColumnasGlobalesNoEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empresasEliminados= new ArrayList<Empresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpresa();
		
				///*EmpresaSessionBean*/this.empresaSessionBean=new EmpresaSessionBean();
			
			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
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
					this.iNumeroPaginacion=EmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpresaConstantesFunciones.getClassesForeignKeysOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empresasAux= new ArrayList<Empresa>();
			
				
			empresaLogic.setDatosCliente(this.datosCliente);
			empresaLogic.setDatosDeep(this.datosDeep);
			empresaLogic.setIsConDeep(true);
			
			
			empresaLogic.getEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empresaLogic.getTodosEmpresas(finalQueryGlobal,pagination);
					
					//empresaLogic.getTodosEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empresaLogic.getEmpresas()==null|| empresaLogic.getEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresasAux= new ArrayList<Empresa>();
							empresasAux.addAll(empresaLogic.getEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresasAux= new ArrayList<Empresa>();
							empresasAux.addAll(empresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresaLogic.getTodosEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//empresaLogic.getTodosEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpresas("Todos",empresaLogic.getEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresaLogic.setEmpresas(new ArrayList<Empresa>());					
							empresaLogic.getEmpresas().addAll(empresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresas=new ArrayList<Empresa>();
							empresas.addAll(empresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpresa=this.idActual;
				
				} else if(this.idEmpresaActual!=null && this.idEmpresaActual!=0L) {
					idEmpresa=idEmpresaActual;
				}
				
					
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndicePorId(idEmpresa);
				
				this.empresas=new ArrayList<Empresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empresaLogic.getEntity(idEmpresa);
					
					//empresaLogic.getEntityWithConnection(idEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.setEmpresas(new ArrayList<Empresa>());
					empresaLogic.getEmpresas().add(empresaLogic.getEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresas=new ArrayList<Empresa>();
					this.empresas.add(empresa);
				}
				
				if(empresaLogic.getEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdPaisPorNombre")) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empresaLogic.getEmpresasBusquedaPorIdPaisPorNombre(finalQueryGlobal,pagination,id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empresaLogic.getEmpresas()==null||empresaLogic.getEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empresas==null|| empresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empresasAux=new ArrayList<Empresa>();
						empresasAux.addAll(empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresasAux=new ArrayList<Empresa>();
							empresasAux.addAll(empresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empresaLogic.getEmpresasBusquedaPorIdPaisPorNombre(finalQueryGlobal,pagination,id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceBusquedaPorIdPaisPorNombre(id_paisBusquedaPorIdPaisPorNombre,nombreBusquedaPorIdPaisPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpresas("BusquedaPorIdPaisPorNombre",empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpresas("BusquedaPorIdPaisPorNombre",empresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.setEmpresas(new ArrayList<Empresa>());
						empresaLogic.getEmpresas().addAll(empresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresas=new ArrayList<Empresa>();
							empresas.addAll(empresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empresaLogic.getEmpresasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empresaLogic.getEmpresas()==null||empresaLogic.getEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empresas==null|| empresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empresasAux=new ArrayList<Empresa>();
						empresasAux.addAll(empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresasAux=new ArrayList<Empresa>();
							empresasAux.addAll(empresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empresaLogic.getEmpresasFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpresas("FK_IdPais",empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpresas("FK_IdPais",empresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.setEmpresas(new ArrayList<Empresa>());
						empresaLogic.getEmpresas().addAll(empresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresas=new ArrayList<Empresa>();
							empresas.addAll(empresasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoEmpresa")) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(id_tipo_empresaFK_IdTipoEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empresaLogic.getEmpresasFK_IdTipoEmpresa(finalQueryGlobal,pagination,id_tipo_empresaFK_IdTipoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(id_tipo_empresaFK_IdTipoEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(id_tipo_empresaFK_IdTipoEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empresaLogic.getEmpresas()==null||empresaLogic.getEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empresas==null|| empresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empresasAux=new ArrayList<Empresa>();
						empresasAux.addAll(empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresasAux=new ArrayList<Empresa>();
							empresasAux.addAll(empresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empresaLogic.getEmpresasFK_IdTipoEmpresa(finalQueryGlobal,pagination,id_tipo_empresaFK_IdTipoEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(id_tipo_empresaFK_IdTipoEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpresaConstantesFunciones.getDetalleIndiceFK_IdTipoEmpresa(id_tipo_empresaFK_IdTipoEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpresas("FK_IdTipoEmpresa",empresaLogic.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpresas("FK_IdTipoEmpresa",empresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaLogic.setEmpresas(new ArrayList<Empresa>());
						empresaLogic.getEmpresas().addAll(empresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresas=new ArrayList<Empresa>();
							empresas.addAll(empresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empresaLogic.getEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empresaLogic.getEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Empresa empresa) {
		Boolean permite=true;
		
		if(this.empresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpresaConstantesFunciones.getOrderByListaEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpresaConstantesFunciones.getOrderByListaEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empresa empresa:empresaLogic.getEmpresas()) {
				if(empresa.getsType().equals(Constantes2.S_TOTALES)) {
					empresaTotales=empresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empresa empresa:this.empresas) {
				if(empresa.getsType().equals(Constantes2.S_TOTALES)) {
					empresaTotales=empresa;
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
			this.empresaAux=new Empresa();
			this.empresaAux.setsType(Constantes2.S_TOTALES);
			this.empresaAux.setIsNew(false);
			this.empresaAux.setIsChanged(false);
			this.empresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpresaConstantesFunciones.TotalizarValoresFilaEmpresa(this.empresaLogic.getEmpresas(),this.empresaAux);
				
				this.empresaLogic.getEmpresas().add(this.empresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpresaConstantesFunciones.TotalizarValoresFilaEmpresa(this.empresas,this.empresaAux);
				
				this.empresas.add(this.empresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empresaTotales=new Empresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empresaLogic.getEmpresas().remove(empresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empresas.remove(empresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empresaTotales=new Empresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Empresa empresa:empresaLogic.getEmpresas()) {
				if(empresa.getsType().equals(Constantes2.S_TOTALES)) {
					empresaTotales=empresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpresaConstantesFunciones.TotalizarValoresFilaEmpresa(this.empresaLogic.getEmpresas(),empresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Empresa empresa:this.empresas) {
				if(empresa.getsType().equals(Constantes2.S_TOTALES)) {
					empresaTotales=empresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpresaConstantesFunciones.TotalizarValoresFilaEmpresa(this.empresas,empresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpresasBusquedaPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpresasFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpresasFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpresasFK_IdTipoEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpresaPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEmpresasBusquedaPorIdPaisPorNombre(String sFinalQuery,Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresasBusquedaPorIdPaisPorNombre(sFinalQuery,this.pagination,id_pais,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpresasFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresasFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpresasFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresasFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpresasFK_IdTipoEmpresa(String sFinalQuery,Long id_tipo_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresasFK_IdTipoEmpresa(sFinalQuery,this.pagination,id_tipo_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpresaPorIdPaisPorNombre(Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresaPorIdPaisPorNombre(id_pais,nombre);
				
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
	
	public void inicializarPermisosEmpresa() {
		this.isPermisoTodoEmpresa=false;
		this.isPermisoNuevoEmpresa=false;
		this.isPermisoActualizarEmpresa=false;
		this.isPermisoActualizarOriginalEmpresa=false;
		this.isPermisoEliminarEmpresa=false;
		this.isPermisoGuardarCambiosEmpresa=false;
		this.isPermisoConsultaEmpresa=false;
		this.isPermisoBusquedaEmpresa=false;
		this.isPermisoReporteEmpresa=false;		
		this.isPermisoOrdenEmpresa=false;		
		this.isPermisoPaginacionMedioEmpresa=false;		
		this.isPermisoPaginacionAltoEmpresa=false;
		this.isPermisoPaginacionTodoEmpresa=false;
		this.isPermisoCopiarEmpresa=false;		
		this.isPermisoVerFormEmpresa=false;		
		this.isPermisoDuplicarEmpresa=false;		
		this.isPermisoOrdenEmpresa=false;		
	}
	
	public void setPermisosUsuarioEmpresa(Boolean isPermiso) {
		this.isPermisoTodoEmpresa=isPermiso;
		this.isPermisoNuevoEmpresa=isPermiso;
		this.isPermisoActualizarEmpresa=isPermiso;
		this.isPermisoActualizarOriginalEmpresa=isPermiso;
		this.isPermisoEliminarEmpresa=isPermiso;
		this.isPermisoGuardarCambiosEmpresa=isPermiso;
		this.isPermisoConsultaEmpresa=isPermiso;
		this.isPermisoBusquedaEmpresa=isPermiso;
		this.isPermisoReporteEmpresa=isPermiso;
		this.isPermisoOrdenEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoEmpresa=isPermiso;		
		this.isPermisoCopiarEmpresa=isPermiso;		
		this.isPermisoVerFormEmpresa=isPermiso;		
		this.isPermisoDuplicarEmpresa=isPermiso;
		this.isPermisoOrdenEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoEmpresa=isPermiso;
		this.isPermisoNuevoEmpresa=isPermiso;
		this.isPermisoActualizarEmpresa=isPermiso;
		this.isPermisoActualizarOriginalEmpresa=isPermiso;
		this.isPermisoEliminarEmpresa=isPermiso;
		this.isPermisoGuardarCambiosEmpresa=isPermiso;
		//this.isPermisoConsultaEmpresa=isPermiso;
		//this.isPermisoBusquedaEmpresa=isPermiso;
		//this.isPermisoReporteEmpresa=isPermiso;
		//this.isPermisoOrdenEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoEmpresa=isPermiso;		
		//this.isPermisoCopiarEmpresa=isPermiso;		
		//this.isPermisoDuplicarEmpresa=isPermiso;
		//this.isPermisoOrdenEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(SucursalConstantesFunciones.SNOMBREOPCION);
		
		if(EmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosSucursal=false;
		this.isTienePermisosSucursal=this.verificarGetPermisosUsuarioOpcionEmpresaClaseRelacionada(this.opcionsRelacionadas,SucursalConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosSucursal=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosSucursal && this.jInternalFrameDetalleFormEmpresa!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.remove(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpresa=this.isPermisoActualizarEmpresa;
			this.isPermisoEliminarEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpresa.setToolTipText(this.jTableDatosEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosSucursal && this.empresaConstantesFunciones.mostrarSucursalEmpresa && !EmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Sucursal");
			reporte.setsDescripcion("Sucursal");
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
	public void inicializarCombosForeignKeyEmpresaListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.tipoempresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpresaListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CiudadConstantesFunciones.SFINALQUERY;

				this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoempresasForeignKey==null||this.tipoempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpresaParameterReturnGeneral empresaReturnGeneral=new EmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.empresaConstantesFunciones.cargarid_paisEmpresa)
					 || (this.esRecargarFks && this.empresaConstantesFunciones.cargarid_paisEmpresa)) {

					if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+empresaSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.empresaConstantesFunciones.cargarid_ciudadEmpresa)
					 || (this.esRecargarFks && this.empresaConstantesFunciones.cargarid_ciudadEmpresa)) {

					if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+empresaSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}


				String finalQueryGlobalTipoEmpresa="";

				if(((this.tipoempresasForeignKey==null||this.tipoempresasForeignKey.size()<=0) && this.empresaConstantesFunciones.cargarid_tipo_empresaEmpresa)
					 || (this.esRecargarFks && this.empresaConstantesFunciones.cargarid_tipo_empresaEmpresa)) {

					if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoEmpresa, "");
						finalQueryGlobalTipoEmpresa+=TipoEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoEmpresa=" WHERE " + ConstantesSql.ID + "="+empresaSessionBean.getlidTipoEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empresaReturnGeneral=empresaLogic.cargarCombosLoteForeignKeyEmpresa(finalQueryGlobalPais,finalQueryGlobalCiudad,finalQueryGlobalTipoEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=empresaReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=empresaReturnGeneral.getciudadsForeignKey();
			}

			if(!finalQueryGlobalTipoEmpresa.equals("NONE")) {
				this.tipoempresasForeignKey=empresaReturnGeneral.gettipoempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyTipoEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
			}

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				Ciudad ciudad=new Ciudad();
				CiudadConstantesFunciones.setCiudadDescripcion(ciudad,Constantes.SMENSAJE_ESCOJA_OPCION);
				ciudad.setId(null);

				if(!CiudadConstantesFunciones.ExisteEnLista(this.ciudadsForeignKey,ciudad,true)) {

					this.ciudadsForeignKey.add(0,ciudad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoEmpresa()throws Exception {
		try {

			if(!this.empresaSessionBean.getisBusquedaDesdeForeignKeySesionTipoEmpresa()) {
				TipoEmpresa tipoempresa=new TipoEmpresa();
				TipoEmpresaConstantesFunciones.setTipoEmpresaDescripcion(tipoempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoempresa.setId(null);

				if(!TipoEmpresaConstantesFunciones.ExisteEnLista(this.tipoempresasForeignKey,tipoempresa,true)) {

					this.tipoempresasForeignKey.add(0,tipoempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpresa()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyPais(JComboBox jComboBoxPaisGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Pais paisLocal=(Pais)jComboBoxPaisGenerico.getSelectedItem();

			if(paisLocal!=null  && paisLocal.getId()!=null  && paisLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_pais="+paisLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboCiudad=sFinalQueryCombo;

			this.ciudadsForeignKey=new ArrayList<Ciudad>();
			this.cargarCombosForeignKeyCiudad(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.addItemListener(new ComboBoxItemListener(this,"id_paisEmpresa"));
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.addFocusListener(new ComboBoxFocusListener(this,"id_paisEmpresa"));
					}
				} else {
					if(this.jInternalFrameDetalleFormEmpresa!=null) {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.addActionListener(new ComboBoxActionListener(this,"id_paisEmpresa"));
						this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.addFocusListener(new ComboBoxFocusListener(this,"id_paisEmpresa"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa"));

						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa"));

					} else {
						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa"));

						this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa"));

					}
			
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisEmpresa.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisEmpresa"));

						this.jComboBoxid_paisFK_IdPaisEmpresa.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisEmpresa"));

					} else {
						this.jComboBoxid_paisFK_IdPaisEmpresa.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisEmpresa"));

						this.jComboBoxid_paisFK_IdPaisEmpresa.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisEmpresa"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpresa(Empresa empresa)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(empresa.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(empresa.getid_ciudad(),false,"Formulario");
			this.setActualTipoEmpresaForeignKey(empresa.getid_tipo_empresa(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpresa(Empresa empresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpresa()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.empresaConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.empresaConstantesFunciones.getid_ciudad(),false,"Formulario");
			this.setActualTipoEmpresaForeignKey(this.empresaConstantesFunciones.getid_tipo_empresa(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpresa()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameTipoEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa!=null && this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa!=null && this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormEmpresaPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormEmpresaid_ciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}




	
	



	public void recargarFormEmpresaid_ciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.empresa,jComboBoxGenericoCiudad);
			}

			if(this.empresa.getid_pais()!=null && this.empresa.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.empresa.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.empresa.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public EmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empresaSessionBean=new EmpresaSessionBean(); 
		this.empresaConstantesFunciones=new EmpresaConstantesFunciones(); 
		this.empresaBean=new Empresa();//(this.empresaConstantesFunciones); 		
		this.empresaReturnGeneral=new EmpresaParameterReturnGeneral(); 
		
		this.empresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpresa(true);
			
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
			
			this.empresaConstantesFunciones=new EmpresaConstantesFunciones(); 
			this.empresaBean=new Empresa();//this.empresaConstantesFunciones); 			
			this.empresaReturnGeneral=new EmpresaParameterReturnGeneral(); 
		
			EmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empresa=new Empresa();
			this.empresas = new ArrayList<Empresa>();
			this.empresasAux = new ArrayList<Empresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic=new EmpresaLogic();
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			//this.empresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpresa);	
					}
					
					if(this.jInternalFrameImportacionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpresa);
				this.jInternalFrameDetalleFormEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpresa);
					this.jInternalFrameReporteDinamicoEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpresa);
					this.jInternalFrameImportacionEmpresa.setVisible(false);
					this.jInternalFrameImportacionEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpresa);
					this.jInternalFrameOrderByEmpresa.setVisible(false);
					this.jInternalFrameOrderByEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empresaReturnGeneral=new EmpresaParameterReturnGeneral();
			
			this.empresaParameterGeneral=new EmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(SucursalConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empresaSessionBean.getEsGuardarRelacionado(),this.empresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empresaSessionBean.getEsGuardarRelacionado(),this.empresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaDuplicarEmpresa=true;
			this.isVisibilidadCeldaCopiarEmpresa=true;
			this.isVisibilidadCeldaVerFormEmpresa=true;
			this.isVisibilidadCeldaOrdenEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=false;
			this.isVisibilidadCeldaGuardarEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			
			
			this.isVisibilidadBusquedaPorIdPaisPorNombre=true;
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdTipoEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpresa(false);
			
			this.setPermisosUsuarioEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaSessionBean.getEsGuardarRelacionado() 
				|| (this.empresaSessionBean.getEsGuardarRelacionado() && this.empresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpresaClasesRelacionadas();
			}
			
			if(this.empresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpresa();
			}
			
			if(!this.isPermisoBusquedaEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpresa,this.isPermisoPaginacionMedioEmpresa,this.isPermisoPaginacionTodoEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpresaConstantesFunciones.getTiposSeleccionarEmpresa());
				
				this.tiposColumnasSelect=EmpresaConstantesFunciones.getTiposSeleccionarEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEmpresa();				
				//this.tiposRelacionesSelect=EmpresaConstantesFunciones.getTiposRelacionesEmpresa(true);
				
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
			//if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresa() ;
			
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
			
			
			this.sucursalLogic=new SucursalLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			this.tipoempresaLogic=new TipoEmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empresaImplementable= (EmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empresaImplementableHome= (EmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empresas= new ArrayList<Empresa>();
			this.empresasEliminados= new ArrayList<Empresa>();
						
			this.isEsNuevoEmpresa=false;
			this.esParaAccionDesdeFormularioEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpresaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpresa();
			}
			
			EmpresaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Empresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(SucursalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SucursalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Sucursales")) {
					if(!SucursalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEmpresa();

						this.cargarParteTabPanelRelacionadaSucursal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaSucursal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEmpresa.cargarSessionConBeanSwingJInternalFrameSucursal(false,true,iIndex);
		this.jButtonSucursalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSucursal();

		//this.jTabbedPaneRelacionesEmpresa.updateUI();
		//this.jTabbedPaneRelacionesEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Sucursal")) {
				int row=this.jTableDatosEmpresa.getSelectedRow();
				jButtonSucursalActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Sucursal")) {

					if(this.isTienePermisosSucursal && this.empresaConstantesFunciones.mostrarSucursalEmpresa && !EmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Sucursales"+"("+SucursalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Sucursales");

						if(empresaConstantesFunciones.resaltarSucursalEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(empresaConstantesFunciones.resaltarSucursalEmpresa);
						}

						jmenuItem.setEnabled(this.empresaConstantesFunciones.activarSucursalEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Sucursal"));

						

						this.jInternalFrameDetalleFormEmpresa.jmenuDetalleEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpresa();
		
		this.cargarCombosFrameForeignKeyEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpresa();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoEmpresa();
				this.cargarCombosFrameTipoEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaTipoEmpresa(this.tipoempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			
			if(jTableDatosEmpresa.getRowCount()>=1) {
				jTableDatosEmpresa.removeRowSelectionInterval(0, jTableDatosEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpresa(true);			
			//this.empresa=new Empresa();
			//this.empresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresa() ;
			
			if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.empresa);				
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			if(this.empresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Empresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpresa.getSelectedRows().length;			
			}
			
			empresasSeleccionados=this.getEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpresa--;			
				//Empresa empresaAux= new Empresa();			
				//empresaAux.setId(this.iIdNuevoEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Empresa empresaOrigen=new Empresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Empresa empresaOrigen : empresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empresaOrigen =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresaOrigen =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpresa(empresaOrigen,this.empresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empresaLogic.getEmpresas().add(this.empresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empresas.add(this.empresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpresa(false);
				
				this.jTableDatosEmpresa.setRowSelectionInterval(this.getIndiceNuevoEmpresa(), this.getIndiceNuevoEmpresa());
				
				int iLastRow =  this.jTableDatosEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();									
		
			Empresa empresaOrigen=new Empresa();
			Empresa empresaDestino=new Empresa();
				
			empresasSeleccionados=this.getEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaOrigen =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empresaOrigen =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaDestino =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empresaDestino =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empresaOrigen =empresasSeleccionados.get(0);
				empresaDestino =empresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpresa(empresaOrigen,empresaDestino,true,false);
				
				empresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empresaDestino,empresaLogic.getEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaDestino,empresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpresa(false);
				
				//this.jTableDatosEmpresa.setRowSelectionInterval(this.getIndiceNuevoEmpresa(), this.getIndiceNuevoEmpresa());
				
				int iLastRow =  this.jTableDatosEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionEmpresa.setVisible(!isVisible);
			this.jPanelAccionesEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpresa();
			
			this.abrirFrameOrderByEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpresa.setSize(this.jInternalFrameDetalleFormEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpresa.jContentPaneDetalleEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpresa.jContentPaneDetalleEmpresa.getWidth(),EmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpresa.jContentPaneDetalleEmpresa.getWidth(),EmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpresa.jContentPaneDetalleEmpresa.getWidth(),EmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(SucursalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSucursal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpresa);
				this.jInternalFrameOrderByEmpresa.setVisible(false);
				this.jInternalFrameOrderByEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpresa==null) {
				
				this.jInternalFrameImportacionEmpresa=new ImportacionJInternalFrame(EmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpresa);
				this.jInternalFrameImportacionEmpresa.setVisible(false);
				this.jInternalFrameImportacionEmpresa.setSelected(false);


				this.jInternalFrameImportacionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpresa"));
				this.jInternalFrameImportacionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpresa"));
				this.jInternalFrameImportacionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpresa==null) {
				this.jInternalFrameReporteDinamicoEmpresa=new ReporteDinamicoJInternalFrame(EmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpresa);
				this.jInternalFrameReporteDinamicoEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresa"));
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresa"));
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaSucursal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEmpresa.jContentPaneDetalleEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpresa);
			
	       	this.jInternalFrameDetalleFormEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpresa.dispose();
			//this.jInternalFrameDetalleFormEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpresa.setVisible(true);
	        this.jInternalFrameImportacionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpresa.setVisible(true);
	        this.jInternalFrameOrderByEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpresa.setVisible(false);
	        this.jInternalFrameOrderByEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpresa.setVisible(false);
	        this.jInternalFrameImportacionEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpresa(true);
			//this.isEsNuevoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresa(false) ;
			
			if(empresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalSessionBean.getEsGuardarRelacionado() && SucursalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSucursalActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpresa(true);
			//this.isEsNuevoEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpresa(false) ;
			
			if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpresa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCiudad(List<Ciudad> ciudadsForeignKey)throws Exception{
		TableColumn tableColumnCiudad=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpresa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoEmpresa(List<TipoEmpresa> tipoempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoEmpresa=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA));
		TableCellEditor tableCellEditorTipoEmpresa =tableColumnTipoEmpresa.getCellEditor();

		TipoEmpresaTableCell tipoempresaTableCellFk=(TipoEmpresaTableCell)tableCellEditorTipoEmpresa;

		if(tipoempresaTableCellFk!=null) {
			tipoempresaTableCellFk.settipoempresasForeignKey(tipoempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpresa.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoempresaTableCellFk.setRowActual(intSelectedRow);
			//tipoempresaTableCellFk.settipoempresasForeignKeyActual(tipoempresasForeignKey);
		//}


		if(tipoempresaTableCellFk!=null) {
			tipoempresaTableCellFk.RecargarTipoEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpresa(false);
			
			//if(!this.isEsNuevoEmpresa) {								
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				
			}
			
			if(this.permiteMantenimiento(this.empresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpresa=true;
					this.inicializarActualizarBindingTablaEmpresa(false);
					this.isEsNuevoEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresa(false);
				
				this.habilitarDeshabilitarControlesEmpresa(false);
			
												
				
				if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpresaActionPerformed(evt,empresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpresa(this.empresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.empresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.empresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpresaModel) this.jTableDatosEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpresa=true;
				this.inicializarActualizarBindingTablaEmpresa(false);
				this.isEsNuevoEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresa(false);
				
				this.habilitarDeshabilitarControlesEmpresa(false);
				
				
				
				if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpresa.getRowCount()>=1) {
				jTableDatosEmpresa.removeRowSelectionInterval(0, jTableDatosEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresa(false) ;
			
			this.isEsNuevoEmpresa=false;
			
			if(EmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpresa(false);
				
				//SI ES MANUAL
				if(EmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpresa--;			
			//Empresa empresaAux= new Empresa();			
			//empresaAux.setId(this.iIdNuevoEmpresa);
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
			
			this.empresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empresaLogic.getEmpresas().add(this.empresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empresas.add(this.empresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpresa(false);
			
			this.jTableDatosEmpresa.setRowSelectionInterval(this.getIndiceNuevoEmpresa(), this.getIndiceNuevoEmpresa());
			
			int iLastRow =  this.jTableDatosEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresa(false);
			
			//SI ES MANUAL
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresa();
			}
			
			//this.abrirFrameTreeEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EmpresaS ?", "MANTENIMIENTO DE Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empresaReturnGeneral=empresaLogic.procesarImportacionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpresa.setFileImportacion(this.jInternalFrameImportacionEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		

		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpresas("Todos",empresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpresaConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_MAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_il_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_il_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_il_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_il_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_FAX:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_x_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_x_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_x_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_x_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoPostal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoPostal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoPostal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoPostal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tividadPrincipal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tividadPrincipal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tividadPrincipal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tividadPrincipal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tividadSecundaria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tividadSecundaria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tividadSecundaria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tividadSecundaria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntadorNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntadorNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntadorNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntadorNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORRUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntadorRuc_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntadorRuc_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntadorRuc_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntadorRuc_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntadorLicencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntadorLicencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntadorLicencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntadorLicencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presentanteNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presentanteNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presentanteNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presentanteNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_presentanteCedula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_presentanteCedula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_presentanteCedula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_presentanteCedula_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpresaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case EmpresaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA:
					sNombreCampoCategoria="id_tipo_empresa";
					break;

				case EmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case EmpresaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case EmpresaConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoria="mail";
					break;

				case EmpresaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case EmpresaConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoria="fax";
					break;

				case EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL:
					sNombreCampoCategoria="codigo_postal";
					break;

				case EmpresaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL:
					sNombreCampoCategoria="actividad_principal";
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA:
					sNombreCampoCategoria="actividad_secundaria";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE:
					sNombreCampoCategoria="contador_nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORRUC:
					sNombreCampoCategoria="contador_ruc";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA:
					sNombreCampoCategoria="contador_licencia";
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					sNombreCampoCategoria="representante_nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA:
					sNombreCampoCategoria="representante_cedula";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpresaConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case EmpresaConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_empresa";
					break;

				case EmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case EmpresaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case EmpresaConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoriaValor="mail";
					break;

				case EmpresaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case EmpresaConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoriaValor="fax";
					break;

				case EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL:
					sNombreCampoCategoriaValor="codigo_postal";
					break;

				case EmpresaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL:
					sNombreCampoCategoriaValor="actividad_principal";
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA:
					sNombreCampoCategoriaValor="actividad_secundaria";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE:
					sNombreCampoCategoriaValor="contador_nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORRUC:
					sNombreCampoCategoriaValor="contador_ruc";
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA:
					sNombreCampoCategoriaValor="contador_licencia";
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					sNombreCampoCategoriaValor="representante_nombre";
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA:
					sNombreCampoCategoriaValor="representante_cedula";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpresaConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case EmpresaConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_empresa");
					break;

				case EmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case EmpresaConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case EmpresaConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case EmpresaConstantesFunciones.LABEL_MAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mail");
					break;

				case EmpresaConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case EmpresaConstantesFunciones.LABEL_FAX:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fax",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fax");
					break;

				case EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Postal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_postal");
					break;

				case EmpresaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Actividad Principal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"actividad_principal");
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Actividad Secundaria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"actividad_secundaria");
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contador_nombre");
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORRUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc.",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contador_ruc");
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Licencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contador_licencia");
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre .",sNombreCampoCategoria,sNombreCampoCategoriaValor,"representante_nombre");
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"representante_cedula");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Empresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpresaConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.gettipoempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_RUC);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_MAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_MAIL);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getmail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_FAX:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_FAX);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getfax());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getcodigo_postal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getactividad_principal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getactividad_secundaria());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getcontador_nombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORRUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORRUC);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getcontador_ruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getcontador_licencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getrepresentante_nombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA);
					iRow++;

					for(Empresa empresa:empresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresa.getrepresentante_cedula());
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
			//	this.getFilaCabeceraExportarExcelEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(Empresa empresaAux:empresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpresa(empresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresa(false);
			
			//SI ES MANUAL
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresa(false);
			
			//SI ES MANUAL
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresa(false);
			
			//SI ES MANUAL
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpresa();
		
		this.inicializarActualizarBindingBotonesManualEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionNuevoEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionSinCerrarEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionSinMensajeEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpresa!=null) {
				this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionNuevoEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionSinCerrarEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpresa.jCheckBoxPostAccionSinMensajeEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpresa() throws Exception {
		try	{
			if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpresa.addItem(reporte);
			}
			
			
			if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpresaConstantesFunciones.getTiposSeleccionarEmpresa(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpresaConstantesFunciones.getTiposSeleccionarEmpresa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpresaConstantesFunciones.getTiposSeleccionarEmpresa(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpresa.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpresa.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.getSelectedItem()!=null){this.id_paisBusquedaPorIdPaisPorNombre=((Pais)this.jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa.getSelectedItem()).getId();}
		this.nombreBusquedaPorIdPaisPorNombre=this.jTextAreanombreBusquedaPorIdPaisPorNombreEmpresa.getText();
		if(this.jComboBoxid_paisFK_IdPaisEmpresa.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisEmpresa.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.getSelectedItem()!=null){this.id_tipo_empresaFK_IdTipoEmpresa=((TipoEmpresa)this.jComboBoxid_tipo_empresaFK_IdTipoEmpresaEmpresa.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpresa(Boolean esInicializar) throws Exception {				
		if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empresaLogic.getEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpresa.setModel(new EmpresaModel(this.empresaLogic.getEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpresa.setModel(new EmpresaModel(this.empresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpresa!=null && this.jInternalFrameOrderByEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpresaConstantesFunciones.SCLASSWEBTITULO,empresaConstantesFunciones.resaltarSeleccionarEmpresa,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpresaConstantesFunciones.SCLASSWEBTITULO,empresaConstantesFunciones.resaltarSeleccionarEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_ID));

		if(this.empresaConstantesFunciones.mostraridEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empresaConstantesFunciones.resaltaridEmpresa,this.empresaConstantesFunciones.activaridEmpresa,iSizeTabla,this,true,"idEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltaridEmpresa,this.empresaConstantesFunciones.activaridEmpresa,this,true,"idEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDPAIS));

		if(this.empresaConstantesFunciones.mostrarid_paisEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.empresaConstantesFunciones.resaltarid_paisEmpresa,this,this.empresaConstantesFunciones.activarid_paisEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.empresaConstantesFunciones.resaltarid_paisEmpresa,this,this.empresaConstantesFunciones.activarid_paisEmpresa,true,"id_paisEmpresa","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDCIUDAD));

		if(this.empresaConstantesFunciones.mostrarid_ciudadEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.empresaConstantesFunciones.resaltarid_ciudadEmpresa,this,this.empresaConstantesFunciones.activarid_ciudadEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.empresaConstantesFunciones.resaltarid_ciudadEmpresa,this,this.empresaConstantesFunciones.activarid_ciudadEmpresa,true,"id_ciudadEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA));

		if(this.empresaConstantesFunciones.mostrarid_tipo_empresaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoEmpresaTableCell(this.tipoempresasForeignKey,this.empresaConstantesFunciones.resaltarid_tipo_empresaEmpresa,this,this.empresaConstantesFunciones.activarid_tipo_empresaEmpresa,iSizeTabla));
			tableColumn.setCellEditor(new TipoEmpresaTableCell(this.tipoempresasForeignKey,this.empresaConstantesFunciones.resaltarid_tipo_empresaEmpresa,this,this.empresaConstantesFunciones.activarid_tipo_empresaEmpresa,true,"id_tipo_empresaEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.empresaConstantesFunciones.mostrarnombreEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarnombreEmpresa,this.empresaConstantesFunciones.activarnombreEmpresa,iSizeTabla,this,true,"nombreEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarnombreEmpresa,this.empresaConstantesFunciones.activarnombreEmpresa,this,true,"nombreEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_DIRECCION));

		if(this.empresaConstantesFunciones.mostrardireccionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltardireccionEmpresa,this.empresaConstantesFunciones.activardireccionEmpresa,iSizeTabla,this,true,"direccionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltardireccionEmpresa,this.empresaConstantesFunciones.activardireccionEmpresa,this,true,"direccionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_RUC));

		if(this.empresaConstantesFunciones.mostrarrucEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarrucEmpresa,this.empresaConstantesFunciones.activarrucEmpresa,iSizeTabla,this,true,"rucEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarrucEmpresa,this.empresaConstantesFunciones.activarrucEmpresa,this,true,"rucEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_MAIL));

		if(this.empresaConstantesFunciones.mostrarmailEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_MAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarmailEmpresa,this.empresaConstantesFunciones.activarmailEmpresa,iSizeTabla,this,true,"mailEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarmailEmpresa,this.empresaConstantesFunciones.activarmailEmpresa,this,true,"mailEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_TELEFONO));

		if(this.empresaConstantesFunciones.mostrartelefonoEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltartelefonoEmpresa,this.empresaConstantesFunciones.activartelefonoEmpresa,iSizeTabla,this,true,"telefonoEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltartelefonoEmpresa,this.empresaConstantesFunciones.activartelefonoEmpresa,this,true,"telefonoEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_FAX));

		if(this.empresaConstantesFunciones.mostrarfaxEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_FAX,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarfaxEmpresa,this.empresaConstantesFunciones.activarfaxEmpresa,iSizeTabla,this,true,"faxEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarfaxEmpresa,this.empresaConstantesFunciones.activarfaxEmpresa,this,true,"faxEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL));

		if(this.empresaConstantesFunciones.mostrarcodigo_postalEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarcodigo_postalEmpresa,this.empresaConstantesFunciones.activarcodigo_postalEmpresa,iSizeTabla,this,true,"codigo_postalEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarcodigo_postalEmpresa,this.empresaConstantesFunciones.activarcodigo_postalEmpresa,this,true,"codigo_postalEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_IVA));

		if(this.empresaConstantesFunciones.mostrarivaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empresaConstantesFunciones.resaltarivaEmpresa,this.empresaConstantesFunciones.activarivaEmpresa,iSizeTabla,this,true,"ivaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarivaEmpresa,this.empresaConstantesFunciones.activarivaEmpresa,this,true,"ivaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL));

		if(this.empresaConstantesFunciones.mostraractividad_principalEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltaractividad_principalEmpresa,this.empresaConstantesFunciones.activaractividad_principalEmpresa,iSizeTabla,this,true,"actividad_principalEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltaractividad_principalEmpresa,this.empresaConstantesFunciones.activaractividad_principalEmpresa,this,true,"actividad_principalEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA));

		if(this.empresaConstantesFunciones.mostraractividad_secundariaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltaractividad_secundariaEmpresa,this.empresaConstantesFunciones.activaractividad_secundariaEmpresa,iSizeTabla,this,true,"actividad_secundariaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltaractividad_secundariaEmpresa,this.empresaConstantesFunciones.activaractividad_secundariaEmpresa,this,true,"actividad_secundariaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE));

		if(this.empresaConstantesFunciones.mostrarcontador_nombreEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarcontador_nombreEmpresa,this.empresaConstantesFunciones.activarcontador_nombreEmpresa,iSizeTabla,this,true,"contador_nombreEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarcontador_nombreEmpresa,this.empresaConstantesFunciones.activarcontador_nombreEmpresa,this,true,"contador_nombreEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_CONTADORRUC));

		if(this.empresaConstantesFunciones.mostrarcontador_rucEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_CONTADORRUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarcontador_rucEmpresa,this.empresaConstantesFunciones.activarcontador_rucEmpresa,iSizeTabla,this,true,"contador_rucEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarcontador_rucEmpresa,this.empresaConstantesFunciones.activarcontador_rucEmpresa,this,true,"contador_rucEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA));

		if(this.empresaConstantesFunciones.mostrarcontador_licenciaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarcontador_licenciaEmpresa,this.empresaConstantesFunciones.activarcontador_licenciaEmpresa,iSizeTabla,this,true,"contador_licenciaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarcontador_licenciaEmpresa,this.empresaConstantesFunciones.activarcontador_licenciaEmpresa,this,true,"contador_licenciaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE));

		if(this.empresaConstantesFunciones.mostrarrepresentante_nombreEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarrepresentante_nombreEmpresa,this.empresaConstantesFunciones.activarrepresentante_nombreEmpresa,iSizeTabla,this,true,"representante_nombreEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarrepresentante_nombreEmpresa,this.empresaConstantesFunciones.activarrepresentante_nombreEmpresa,this,true,"representante_nombreEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA));

		if(this.empresaConstantesFunciones.mostrarrepresentante_cedulaEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaConstantesFunciones.resaltarrepresentante_cedulaEmpresa,this.empresaConstantesFunciones.activarrepresentante_cedulaEmpresa,iSizeTabla,this,true,"representante_cedulaEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaConstantesFunciones.resaltarrepresentante_cedulaEmpresa,this.empresaConstantesFunciones.activarrepresentante_cedulaEmpresa,this,true,"representante_cedulaEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosSucursal && this.empresaConstantesFunciones.mostrarSucursalEmpresa && !EmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Sucursales");
				tableColumn.setHeaderValue("Sucursales");
				tableColumn.setCellRenderer(new SucursalTableCell(empresaConstantesFunciones.resaltarSucursalEmpresa,this,this.empresaConstantesFunciones.activarSucursalEmpresa));
				tableColumn.setCellEditor(new SucursalTableCell(empresaConstantesFunciones.resaltarSucursalEmpresa,this,this.empresaConstantesFunciones.activarSucursalEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEmpresa.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpresa && this.isPermisoGuardarCambiosEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empresaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.empresaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpresa && this.isPermisoGuardarCambiosEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.empresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpresa && this.isPermisoGuardarCambiosEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpresa.moveColumn(this.jTableDatosEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpresa.moveColumn(this.jTableDatosEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.empresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEmpresa.moveColumn(this.jTableDatosEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpresa.moveColumn(this.jTableDatosEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empresaLogic.getEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empresas.size()-1;
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
		//this.jTableDatosEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpresa();
			
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
				
				//this.isEsNuevoEmpresa=false;
					
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empresa.getsType().equals("DUPLICADO")
				   || this.empresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpresa=true;
				
				} else {
					this.isEsNuevoEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empresaSessionBean.getEsGuardarRelacionado()) {
					if(this.empresa.getId()>=0 && !this.empresa.getIsNew()) {						
						this.isEsNuevoEmpresa=false;
						
					} else {
						this.isEsNuevoEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpresa(esRelaciones);						
				
				this.seleccionarEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empresa.getId()<0) {
					this.isEsNuevoEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpresa(evt,rowIndex);
				}	
				
				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Empresa: " + this.dDif); 
					}
				}								
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empresa)) {
					if(this.empresa.getId()>0) {
						this.empresa.setIsDeleted(true);
						
						this.empresasEliminados.add(this.empresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empresaLogic.getEmpresas().remove(this.empresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empresas.remove(this.empresa);				
					}
					
					
					((EmpresaModel) this.jTableDatosEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpresa) {
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpresa(this.empresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.empresaConstantesFunciones.cargarid_paisEmpresa || this.empresaConstantesFunciones.event_dependid_paisEmpresa) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.empresa.getid_pais());
									//this.inicializarActualizarBindingEmpresa(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(empresa.getPais()!=null) {
							this.paissForeignKey.add(empresa.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.empresa.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.empresaConstantesFunciones.cargarid_ciudadEmpresa || this.empresaConstantesFunciones.event_dependid_ciudadEmpresa) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.empresa.getid_ciudad());
									//this.inicializarActualizarBindingEmpresa(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(empresa.getCiudad()!=null) {
							this.ciudadsForeignKey.add(empresa.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.empresa.getid_ciudad(),false,"Formulario");

					//TipoEmpresa
					if(!this.empresaConstantesFunciones.cargarid_tipo_empresaEmpresa || this.empresaConstantesFunciones.event_dependid_tipo_empresaEmpresa) {
						//this.cargarCombosTipoEmpresasForeignKeyLista(" where id="+this.empresa.getid_tipo_empresa());
									//this.inicializarActualizarBindingEmpresa(false,false);
						this.tipoempresasForeignKey=new ArrayList<TipoEmpresa>();

						if(empresa.getTipoEmpresa()!=null) {
							this.tipoempresasForeignKey.add(empresa.getTipoEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoEmpresa();
						this.cargarCombosFrameTipoEmpresasForeignKey("Todos");
					}
					this.setActualTipoEmpresaForeignKey(this.empresa.getid_tipo_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpresa(Empresa empresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpresa(empresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpresa(Empresa empresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpresa(empresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpresa(empresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpresa(empresa);
	}
	
	public void setVariablesObjetoActualToFormularioEmpresa(Empresa empresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setText(empresa.getId().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setText(empresa.getnombre());
			this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setText(empresa.getdireccion());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setText(empresa.getruc());
			this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setText(empresa.getmail());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setText(empresa.gettelefono());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setText(empresa.getfax());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setText(empresa.getcodigo_postal());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setText(empresa.getiva().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setText(empresa.getactividad_principal());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setText(empresa.getactividad_secundaria());
			this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setText(empresa.getcontador_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setText(empresa.getcontador_ruc());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setText(empresa.getcontador_licencia());
			this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setText(empresa.getrepresentante_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setText(empresa.getrepresentante_cedula());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Empresa empresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Empresa empresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empresaLocal=this.empresa;
			} else {
				empresaLocal=this.empresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpresa(empresaLocal,true);
					
					if(empresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpresa(Empresa empresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpresa(empresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(empresa);
	}
	
	public void setVariablesFormularioToObjetoActualEmpresa(Empresa empresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpresa(empresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpresa(Empresa empresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.getText()==null || this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.getText()=="" || this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setText("0");
			}

			if(conColumnasBase) {empresa.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelIdEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setnombre(this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelnombreEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setdireccion(this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabeldireccionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setruc(this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrucEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setmail(this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_MAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelmailEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.settelefono(this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabeltelefonoEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setfax(this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_FAX+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelfaxEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setcodigo_postal(this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcodigo_postalEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setiva(Double.parseDouble(this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelivaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setactividad_principal(this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_principalEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setactividad_secundaria(this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelactividad_secundariaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setcontador_nombre(this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_nombreEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setcontador_ruc(this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_CONTADORRUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_rucEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setcontador_licencia(this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelcontador_licenciaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setrepresentante_nombre(this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_nombreEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresa.setrepresentante_cedula(this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresa.jLabelrepresentante_cedulaEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpresa(Empresa empresaBean,Empresa empresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empresaBean.getid_pais()!=null && !empresaBean.getid_pais().equals(-1L))) {empresa.setid_pais(empresaBean.getid_pais());}
			if(conDefault || (!conDefault && empresaBean.getid_ciudad()!=null && !empresaBean.getid_ciudad().equals(-1L))) {empresa.setid_ciudad(empresaBean.getid_ciudad());}
			if(conDefault || (!conDefault && empresaBean.getid_tipo_empresa()!=null && !empresaBean.getid_tipo_empresa().equals(-1L))) {empresa.setid_tipo_empresa(empresaBean.getid_tipo_empresa());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpresa(Empresa empresaOrigen,Empresa empresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empresaOrigen.getId()!=null && !empresaOrigen.getId().equals(0L))) {empresa.setId(empresaOrigen.getId());}}
			if(conDefault || (!conDefault && empresaOrigen.getid_pais()!=null && !empresaOrigen.getid_pais().equals(-1L))) {empresa.setid_pais(empresaOrigen.getid_pais());}
			if(conDefault || (!conDefault && empresaOrigen.getid_ciudad()!=null && !empresaOrigen.getid_ciudad().equals(-1L))) {empresa.setid_ciudad(empresaOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && empresaOrigen.getid_tipo_empresa()!=null && !empresaOrigen.getid_tipo_empresa().equals(-1L))) {empresa.setid_tipo_empresa(empresaOrigen.getid_tipo_empresa());}
			if(conDefault || (!conDefault && empresaOrigen.getnombre()!=null && !empresaOrigen.getnombre().equals(""))) {empresa.setnombre(empresaOrigen.getnombre());}
			if(conDefault || (!conDefault && empresaOrigen.getdireccion()!=null && !empresaOrigen.getdireccion().equals(""))) {empresa.setdireccion(empresaOrigen.getdireccion());}
			if(conDefault || (!conDefault && empresaOrigen.getruc()!=null && !empresaOrigen.getruc().equals(""))) {empresa.setruc(empresaOrigen.getruc());}
			if(conDefault || (!conDefault && empresaOrigen.getmail()!=null && !empresaOrigen.getmail().equals(""))) {empresa.setmail(empresaOrigen.getmail());}
			if(conDefault || (!conDefault && empresaOrigen.gettelefono()!=null && !empresaOrigen.gettelefono().equals(""))) {empresa.settelefono(empresaOrigen.gettelefono());}
			if(conDefault || (!conDefault && empresaOrigen.getfax()!=null && !empresaOrigen.getfax().equals(""))) {empresa.setfax(empresaOrigen.getfax());}
			if(conDefault || (!conDefault && empresaOrigen.getcodigo_postal()!=null && !empresaOrigen.getcodigo_postal().equals(""))) {empresa.setcodigo_postal(empresaOrigen.getcodigo_postal());}
			if(conDefault || (!conDefault && empresaOrigen.getiva()!=null && !empresaOrigen.getiva().equals(0.0))) {empresa.setiva(empresaOrigen.getiva());}
			if(conDefault || (!conDefault && empresaOrigen.getactividad_principal()!=null && !empresaOrigen.getactividad_principal().equals(""))) {empresa.setactividad_principal(empresaOrigen.getactividad_principal());}
			if(conDefault || (!conDefault && empresaOrigen.getactividad_secundaria()!=null && !empresaOrigen.getactividad_secundaria().equals(""))) {empresa.setactividad_secundaria(empresaOrigen.getactividad_secundaria());}
			if(conDefault || (!conDefault && empresaOrigen.getcontador_nombre()!=null && !empresaOrigen.getcontador_nombre().equals(""))) {empresa.setcontador_nombre(empresaOrigen.getcontador_nombre());}
			if(conDefault || (!conDefault && empresaOrigen.getcontador_ruc()!=null && !empresaOrigen.getcontador_ruc().equals(""))) {empresa.setcontador_ruc(empresaOrigen.getcontador_ruc());}
			if(conDefault || (!conDefault && empresaOrigen.getcontador_licencia()!=null && !empresaOrigen.getcontador_licencia().equals(""))) {empresa.setcontador_licencia(empresaOrigen.getcontador_licencia());}
			if(conDefault || (!conDefault && empresaOrigen.getrepresentante_nombre()!=null && !empresaOrigen.getrepresentante_nombre().equals(""))) {empresa.setrepresentante_nombre(empresaOrigen.getrepresentante_nombre());}
			if(conDefault || (!conDefault && empresaOrigen.getrepresentante_cedula()!=null && !empresaOrigen.getrepresentante_cedula().equals(""))) {empresa.setrepresentante_cedula(empresaOrigen.getrepresentante_cedula());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpresa(Empresa empresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setText(empresa.getId().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setText(empresa.getnombre());
			this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setText(empresa.getdireccion());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setText(empresa.getruc());
			this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setText(empresa.getmail());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setText(empresa.gettelefono());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setText(empresa.getfax());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setText(empresa.getcodigo_postal());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setText(empresa.getiva().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setText(empresa.getactividad_principal());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setText(empresa.getactividad_secundaria());
			this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setText(empresa.getcontador_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setText(empresa.getcontador_ruc());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setText(empresa.getcontador_licencia());
			this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setText(empresa.getrepresentante_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setText(empresa.getrepresentante_cedula());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpresa(EmpresaBean empresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setText(empresaBean.getId().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setText(empresaBean.getnombre());
			this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setText(empresaBean.getdireccion());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setText(empresaBean.getruc());
			this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setText(empresaBean.getmail());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setText(empresaBean.gettelefono());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setText(empresaBean.getfax());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setText(empresaBean.getcodigo_postal());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setText(empresaBean.getiva().toString());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setText(empresaBean.getactividad_principal());
			this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setText(empresaBean.getactividad_secundaria());
			this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setText(empresaBean.getcontador_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setText(empresaBean.getcontador_ruc());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setText(empresaBean.getcontador_licencia());
			this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setText(empresaBean.getrepresentante_nombre());
			this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setText(empresaBean.getrepresentante_cedula());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpresa(EmpresaParameterReturnGeneral empresaReturnGeneral,EmpresaBean empresaBean,Boolean conDefault) throws Exception { 
		try {
			Empresa empresaLocal=new Empresa();
			
			empresaLocal=empresaReturnGeneral.getEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empresaLocal.getId()!=null && !empresaLocal.getId().equals(0L))) {empresaBean.setId(empresaLocal.getId());}}
			if(conDefault || (!conDefault && empresaLocal.getid_pais()!=null && !empresaLocal.getid_pais().equals(-1L))) {empresaBean.setid_pais(empresaLocal.getid_pais());}
			if(conDefault || (!conDefault && empresaLocal.getid_ciudad()!=null && !empresaLocal.getid_ciudad().equals(-1L))) {empresaBean.setid_ciudad(empresaLocal.getid_ciudad());}
			if(conDefault || (!conDefault && empresaLocal.getid_tipo_empresa()!=null && !empresaLocal.getid_tipo_empresa().equals(-1L))) {empresaBean.setid_tipo_empresa(empresaLocal.getid_tipo_empresa());}
			if(conDefault || (!conDefault && empresaLocal.getnombre()!=null && !empresaLocal.getnombre().equals(""))) {empresaBean.setnombre(empresaLocal.getnombre());}
			if(conDefault || (!conDefault && empresaLocal.getdireccion()!=null && !empresaLocal.getdireccion().equals(""))) {empresaBean.setdireccion(empresaLocal.getdireccion());}
			if(conDefault || (!conDefault && empresaLocal.getruc()!=null && !empresaLocal.getruc().equals(""))) {empresaBean.setruc(empresaLocal.getruc());}
			if(conDefault || (!conDefault && empresaLocal.getmail()!=null && !empresaLocal.getmail().equals(""))) {empresaBean.setmail(empresaLocal.getmail());}
			if(conDefault || (!conDefault && empresaLocal.gettelefono()!=null && !empresaLocal.gettelefono().equals(""))) {empresaBean.settelefono(empresaLocal.gettelefono());}
			if(conDefault || (!conDefault && empresaLocal.getfax()!=null && !empresaLocal.getfax().equals(""))) {empresaBean.setfax(empresaLocal.getfax());}
			if(conDefault || (!conDefault && empresaLocal.getcodigo_postal()!=null && !empresaLocal.getcodigo_postal().equals(""))) {empresaBean.setcodigo_postal(empresaLocal.getcodigo_postal());}
			if(conDefault || (!conDefault && empresaLocal.getiva()!=null && !empresaLocal.getiva().equals(0.0))) {empresaBean.setiva(empresaLocal.getiva());}
			if(conDefault || (!conDefault && empresaLocal.getactividad_principal()!=null && !empresaLocal.getactividad_principal().equals(""))) {empresaBean.setactividad_principal(empresaLocal.getactividad_principal());}
			if(conDefault || (!conDefault && empresaLocal.getactividad_secundaria()!=null && !empresaLocal.getactividad_secundaria().equals(""))) {empresaBean.setactividad_secundaria(empresaLocal.getactividad_secundaria());}
			if(conDefault || (!conDefault && empresaLocal.getcontador_nombre()!=null && !empresaLocal.getcontador_nombre().equals(""))) {empresaBean.setcontador_nombre(empresaLocal.getcontador_nombre());}
			if(conDefault || (!conDefault && empresaLocal.getcontador_ruc()!=null && !empresaLocal.getcontador_ruc().equals(""))) {empresaBean.setcontador_ruc(empresaLocal.getcontador_ruc());}
			if(conDefault || (!conDefault && empresaLocal.getcontador_licencia()!=null && !empresaLocal.getcontador_licencia().equals(""))) {empresaBean.setcontador_licencia(empresaLocal.getcontador_licencia());}
			if(conDefault || (!conDefault && empresaLocal.getrepresentante_nombre()!=null && !empresaLocal.getrepresentante_nombre().equals(""))) {empresaBean.setrepresentante_nombre(empresaLocal.getrepresentante_nombre());}
			if(conDefault || (!conDefault && empresaLocal.getrepresentante_cedula()!=null && !empresaLocal.getrepresentante_cedula().equals(""))) {empresaBean.setrepresentante_cedula(empresaLocal.getrepresentante_cedula());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpresaGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxEmpresa,List<Empresa> empresasLocal)throws Exception {
		try {
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasLocal) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			jComboBoxEmpresa.setSelectedItem(empresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpresaGenerico(JComboBox jComboBoxEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Sucursal")) {
			jButtonSucursalActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresa=(Empresa) empresaLogic.getEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empresa =(Empresa) empresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!empresa.getIsNew() && !empresa.getIsChanged() && !empresa.getIsDeleted()) {
				sDescripcion=empresa.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=empresa.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!empresa.getIsNew() && !empresa.getIsChanged() && !empresa.getIsDeleted()) {
				sDescripcion=empresa.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=empresa.getciudad_descripcion();
			}
		}

		if(sTipo.equals("TipoEmpresa")) {
			//sDescripcion=this.getActualTipoEmpresaForeignKeyDescripcion((Long)value);
			if(!empresa.getIsNew() && !empresa.getIsChanged() && !empresa.getIsDeleted()) {
				sDescripcion=empresa.gettipoempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empresa.gettipoempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Empresa empresaRow=new Empresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresaRow=(Empresa) empresaLogic.getEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empresaRow=(Empresa) empresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonSucursalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Empresa empresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa = (Empresa)this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.empresa = (Empresa)this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(empresa!=null) {
						this.empresa = empresa;
					} else {
						this.empresa = new Empresa();
					}
				}

				if(this.isTienePermisosSucursal && this.permiteMantenimiento(this.empresa)) {
					SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup=new SucursalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						sucursalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup;
					} else {
						sucursalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame;
					}

					List<Empresa> empresas=new ArrayList<Empresa>();
					empresas.add(this.empresa);
					if(!esRelacionado) {
						//sucursalBeanSwingJInternalFrame.sucursalSessionBean.setConGuardarRelaciones(false);
						//sucursalBeanSwingJInternalFrame.sucursalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					sucursalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEmpresa.cargarSucursalBeanSwingJInternalFrame(empresas,this.empresa,sucursalBeanSwingJInternalFrame,/*conInicializar,*/sucursalBeanSwingJInternalFrame.sucursalSessionBean.getConGuardarRelaciones(),sucursalBeanSwingJInternalFrame.sucursalSessionBean.getEsGuardarRelacionado());
					sucursalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						sucursalBeanSwingJInternalFrame.actualizarEstadoPanelsSucursal("no_relacionado");

						sucursalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SucursalConstantesFunciones.ITAMANIOFILATABLA + (SucursalConstantesFunciones.ITAMANIOFILATABLA/2));

						sucursalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEmpresa=(TitledBorder)this.jScrollPanelDatosEmpresa.getBorder();
						TitledBorder titledBorderSucursal=(TitledBorder)sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

						titledBorderSucursal.setTitle(titledBorderEmpresa.getTitle() + " -> Sucursal");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,sucursalBeanSwingJInternalFrame);
						}

						sucursalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(sucursalBeanSwingJInternalFrame);

						sucursalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.empresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Sucursal",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa));			
			this.jButtonDuplicarEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEmpresa && this.isPermisoDuplicarEmpresa));			
			this.jButtonCopiarEmpresa.setVisible((this.isVisibilidadCeldaCopiarEmpresa && this.isPermisoCopiarEmpresa));
			this.jButtonVerFormEmpresa.setVisible((this.isVisibilidadCeldaVerFormEmpresa && this.isPermisoVerFormEmpresa));
			
			this.jButtonAbrirOrderByEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));			
			
			this.jButtonNuevoRelacionesEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresa && this.isPermisoNuevoEmpresa));			
			this.jButtonNuevoGuardarCambiosEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa && this.isPermisoGuardarCambiosEmpresa));
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.jInternalFrameDetalleFormEmpresa.jButtonModificarEmpresa.setVisible((this.isVisibilidadCeldaModificarEmpresa && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.setVisible((this.isVisibilidadCeldaActualizarEmpresa && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.setVisible((this.isVisibilidadCeldaEliminarEmpresa && this.isPermisoEliminarEmpresa));
			this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.setVisible(this.isVisibilidadCeldaCancelarEmpresa);							
			this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.setVisible((this.isVisibilidadCeldaGuardarEmpresa && this.isPermisoGuardarCambiosEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresa && this.isPermisoGuardarCambiosEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa));						
			this.jButtonDuplicarToolBarEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEmpresa && this.isPermisoDuplicarEmpresa));						
			this.jButtonCopiarToolBarEmpresa.setVisible((this.isVisibilidadCeldaCopiarEmpresa && this.isPermisoCopiarEmpresa));			
			this.jButtonVerFormToolBarEmpresa.setVisible((this.isVisibilidadCeldaVerFormEmpresa && this.isPermisoVerFormEmpresa));			
			this.jButtonAbrirOrderByToolBarEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));
			this.jButtonNuevoRelacionesToolBarEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresa && this.isPermisoNuevoEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa && this.isPermisoGuardarCambiosEmpresa));			
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.jInternalFrameDetalleFormEmpresa.jButtonModificarToolBarEmpresa.setVisible((this.isVisibilidadCeldaModificarEmpresa && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jButtonActualizarToolBarEmpresa.setVisible((this.isVisibilidadCeldaActualizarEmpresa  && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jButtonEliminarToolBarEmpresa.setVisible((this.isVisibilidadCeldaEliminarEmpresa && this.isPermisoEliminarEmpresa));
			this.jInternalFrameDetalleFormEmpresa.jButtonCancelarToolBarEmpresa.setVisible(this.isVisibilidadCeldaCancelarEmpresa);				
			this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosToolBarEmpresa.setVisible((this.isVisibilidadCeldaGuardarEmpresa && this.isPermisoGuardarCambiosEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresa && this.isPermisoGuardarCambiosEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa));			
			this.jMenuItemDuplicarEmpresa.setVisible((this.isVisibilidadCeldaDuplicarEmpresa && this.isPermisoDuplicarEmpresa));			
			this.jMenuItemCopiarEmpresa.setVisible((this.isVisibilidadCeldaCopiarEmpresa && this.isPermisoCopiarEmpresa));			
			this.jMenuItemVerFormEmpresa.setVisible((this.isVisibilidadCeldaVerFormEmpresa && this.isPermisoVerFormEmpresa));			
			this.jMenuItemAbrirOrderByEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));			
			//this.jMenuItemMostrarOcultarEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));
			this.jMenuItemDetalleAbrirOrderByEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarEmpresa.setVisible((this.isVisibilidadCeldaOrdenEmpresa && this.isPermisoOrdenEmpresa));			
			this.jMenuItemNuevoRelacionesEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresa && this.isPermisoNuevoEmpresa));			
			this.jMenuItemNuevoGuardarCambiosEmpresa.setVisible((this.isVisibilidadCeldaNuevoEmpresa && this.isPermisoNuevoEmpresa && this.isPermisoGuardarCambiosEmpresa));									
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.jInternalFrameDetalleFormEmpresa.jMenuItemModificarEmpresa.setVisible((this.isVisibilidadCeldaModificarEmpresa && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jMenuItemActualizarEmpresa.setVisible((this.isVisibilidadCeldaActualizarEmpresa && this.isPermisoActualizarEmpresa));	
			this.jInternalFrameDetalleFormEmpresa.jMenuItemEliminarEmpresa.setVisible((this.isVisibilidadCeldaEliminarEmpresa && this.isPermisoEliminarEmpresa));
			this.jInternalFrameDetalleFormEmpresa.jMenuItemCancelarEmpresa.setVisible(this.isVisibilidadCeldaCancelarEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosEmpresa.setVisible((this.isVisibilidadCeldaGuardarEmpresa && this.isPermisoGuardarCambiosEmpresa));						
			this.jMenuItemGuardarCambiosTablaEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresa && this.isPermisoGuardarCambiosEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpresa=this.jButtonNuevoEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarEmpresa=this.jButtonDuplicarEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarEmpresa=this.jButtonCopiarEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormEmpresa=this.jButtonVerFormEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpresa=this.jButtonAbrirOrderByEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=this.jButtonNuevoRelacionesEmpresa.isVisible();
			this.isVisibilidadCeldaModificarEmpresa=this.jButtonModificarEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.isVisibilidadCeldaActualizarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpresa=this.jButtonGuardarCambiosTablaEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpresa=this.jButtonNuevoToolBarEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=this.jButtonNuevoRelacionesToolBarEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.isVisibilidadCeldaModificarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonModificarToolBarEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonActualizarToolBarEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonEliminarToolBarEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEmpresa=this.jInternalFrameDetalleFormEmpresa.jButtonCancelarToolBarEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpresa=this.jButtonGuardarCambiosToolBarEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpresa=this.jButtonGuardarCambiosTablaToolBarEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpresa=this.jMenuItemNuevoEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=this.jMenuItemNuevoRelacionesEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.isVisibilidadCeldaModificarEmpresa=this.jInternalFrameDetalleFormEmpresa.jMenuItemModificarEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarEmpresa=this.jInternalFrameDetalleFormEmpresa.jMenuItemActualizarEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarEmpresa=this.jInternalFrameDetalleFormEmpresa.jMenuItemEliminarEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarEmpresa=this.jInternalFrameDetalleFormEmpresa.jMenuItemCancelarEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpresa=this.jMenuItemGuardarCambiosEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpresa=this.jMenuItemGuardarCambiosTablaEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpresa(Boolean esInicializar) {
		if(EmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empresaSessionBean.getConGuardarRelaciones()) {
				//if(this.empresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpresa() {
		this.jButtonNuevoEmpresa.setVisible(this.isPermisoNuevoEmpresa);			
		this.jButtonDuplicarEmpresa.setVisible(this.isPermisoDuplicarEmpresa);			
		this.jButtonCopiarEmpresa.setVisible(this.isPermisoCopiarEmpresa);			
		this.jButtonVerFormEmpresa.setVisible(this.isPermisoVerFormEmpresa);			
		
		this.jButtonAbrirOrderByEmpresa.setVisible(this.isPermisoOrdenEmpresa);					
		
		this.jButtonNuevoRelacionesEmpresa.setVisible(this.isPermisoNuevoEmpresa);			
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonModificarEmpresa.setVisible(this.isPermisoActualizarEmpresa);	
			this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.setVisible(this.isPermisoActualizarEmpresa);	
			this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.setVisible(this.isPermisoEliminarEmpresa);
			this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.setVisible(this.isVisibilidadCeldaCancelarEmpresa);						
			this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.setVisible(this.isPermisoGuardarCambiosEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaEmpresa.setVisible(this.isPermisoActualizarEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpresa() {
		this.jInternalFrameDetalleFormEmpresa.jButtonModificarEmpresa.setVisible(this.isPermisoActualizarEmpresa);	
		this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.setVisible(this.isPermisoActualizarEmpresa);	
		this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.setVisible(this.isPermisoEliminarEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.setVisible(this.isVisibilidadCeldaCancelarEmpresa);							
		this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.setVisible((this.isVisibilidadCeldaGuardarEmpresa && this.isPermisoGuardarCambiosEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpresa() {
		if(EmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpresa() {
	}
	
	public void jTableDatosEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebEmpresa(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.empresaLogic.getConnexion());

				if(this.empresa.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.empresa.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpresa=(TitledBorder)this.jScrollPanelDatosEmpresa.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderEmpresa.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.empresa.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebEmpresa(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.empresaLogic.getConnexion());

				if(this.empresa.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.empresa.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpresa=(TitledBorder)this.jScrollPanelDatosEmpresa.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderEmpresa.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.empresa.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_empresaEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoempresa=true;

			idTienePermisotipoempresa=this.tienePermisosUsuarioEnPaginaWebEmpresa(TipoEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);

				this.tipoempresaBeanSwingJInternalFrame=new TipoEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoempresaBeanSwingJInternalFrame.getTipoEmpresaLogic().setConnexion(this.empresaLogic.getConnexion());

				if(this.empresa.getid_tipo_empresa()!=null) {
					this.tipoempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoempresaBeanSwingJInternalFrame.setIdActual(this.empresa.getid_tipo_empresa());
					this.tipoempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipoempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpresa=(TitledBorder)this.jScrollPanelDatosEmpresa.getBorder();
				TitledBorder titledBordertipoempresa=(TitledBorder)this.tipoempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoEmpresa.getBorder();

				titledBordertipoempresa.setTitle(titledBorderEmpresa.getTitle() + " -> Tipo Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_empresaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getid_tipo_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_empresa = "+this.empresa.getid_tipo_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.empresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.empresa.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.empresa.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmailEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getmail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mail like '%"+this.empresa.getmail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.empresa.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfaxEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getfax()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fax like '%"+this.empresa.getfax()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_postalEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getcodigo_postal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_postal like '%"+this.empresa.getcodigo_postal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.empresa.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonactividad_principalEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getactividad_principal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where actividad_principal like '%"+this.empresa.getactividad_principal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonactividad_secundariaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getactividad_secundaria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where actividad_secundaria like '%"+this.empresa.getactividad_secundaria()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontador_nombreEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getcontador_nombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contador_nombre like '%"+this.empresa.getcontador_nombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontador_rucEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getcontador_ruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contador_ruc like '%"+this.empresa.getcontador_ruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontador_licenciaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getcontador_licencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contador_licencia like '%"+this.empresa.getcontador_licencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrepresentante_nombreEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getrepresentante_nombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where representante_nombre like '%"+this.empresa.getrepresentante_nombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrepresentante_cedulaEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.getempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresa==null) {
						this.empresa = new Empresa();
					}

					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);
				}

				if(this.empresa.getrepresentante_cedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where representante_cedula like '%"+this.empresa.getrepresentante_cedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdPaisPorNombreEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpresa(false,false);

			this.getEmpresasBusquedaPorIdPaisPorNombre();

			this.inicializarActualizarBindingEmpresa(false);

			//if(EmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCiudadEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpresa(false,false);

			this.getEmpresasFK_IdCiudad();

			this.inicializarActualizarBindingEmpresa(false);

			//if(EmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpresa(false,false);

			this.getEmpresasFK_IdPais();

			this.inicializarActualizarBindingEmpresa(false);

			//if(EmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoEmpresaEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpresa(false,false);

			this.getEmpresasFK_IdTipoEmpresa();

			this.inicializarActualizarBindingEmpresa(false);

			//if(EmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpresa() {
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
			this.jInternalFrameDetalleFormEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpresa.dispose();
			this.jInternalFrameDetalleFormEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
			this.jInternalFrameReporteDinamicoEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpresa.dispose();
			this.jInternalFrameReporteDinamicoEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionEmpresa!=null) {
			this.jInternalFrameImportacionEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionEmpresa.dispose();
			this.jInternalFrameImportacionEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpresa();
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpresa")) {
				jButtonDuplicarEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpresa")) {
				jButtonCopiarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpresa")) {
				jButtonVerFormEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpresa")) {
				jButtonDuplicarEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpresa")) {
				jButtonDuplicarEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpresa")) {
				jButtonModificarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpresa")) {
				jButtonModificarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpresa")) {
				jButtonModificarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpresa")) {
				jButtonActualizarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpresa")) {
				jButtonActualizarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpresa")) {
				jButtonActualizarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpresa")) {
				jButtonEliminarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpresa")) {
				jButtonEliminarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpresa")) {
				jButtonEliminarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpresa")) {
				jButtonCancelarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpresa")) {
				jButtonCancelarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpresa")) {
				jButtonCancelarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpresa")) {
				jButtonCerrarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpresa")) {
				jButtonCerrarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpresa")) {
				jButtonCerrarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpresa")) {
				jButtonMostrarOcultarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpresa")) {
				jButtonCancelarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpresa")) {
				jButtonCopiarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpresa")) {
				jButtonVerFormEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpresa")) {
				jButtonCopiarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpresa")) {
				jButtonVerFormEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpresa")) {
				jButtonRecargarInformacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpresa")) {
				jButtonRecargarInformacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpresa")) {
				jButtonRecargarInformacionEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpresa")) {
				jButtonAnterioresEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpresa")) {
				jButtonAnterioresEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpresa")) {
				jButtonAnterioresEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpresa")) {
				jButtonSiguientesEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpresa")) {
				jButtonSiguientesEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpresa")) {
				jButtonSiguientesEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpresa")) {
				jButtonAbrirOrderByEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpresa")) {
				jButtonMostrarOcultarEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpresa")) {
				jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpresa")) {
				jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpresa")) {
				jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpresa")) {
				jButtonCerrarReporteDinamicoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpresa")) {
				jButtonGenerarReporteDinamicoEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpresa")) {
				jButtonCerrarImportacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpresa")) {
				
				jButtonGenerarImportacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpresa")) {
				
				jButtonAbrirImportacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpresa")) {
				jComboBoxTiposAccionesEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpresa")) {
				jComboBoxTiposRelacionesEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpresa")) {
				jComboBoxTiposAccionesEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpresa")) {
				
				jComboBoxTiposSeleccionarEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpresa")) {
				jTextFieldValorCampoGeneralEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpresa")) {
				jButtonAbrirOrderByEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpresa")) {
				jButtonAbrirOrderByEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpresa")) {
				jButtonCerrarOrderByEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpresaBusqueda")) {
				this.jButtonidEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEmpresaUpdate")) {
				this.jButtonid_paisEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEmpresaBusqueda")) {
				this.jButtonid_paisEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadEmpresaUpdate")) {
				this.jButtonid_ciudadEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadEmpresaBusqueda")) {
				this.jButtonid_ciudadEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_empresaEmpresaUpdate")) {
				this.jButtonid_tipo_empresaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_empresaEmpresaBusqueda")) {
				this.jButtonid_tipo_empresaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEmpresaBusqueda")) {
				this.jButtonnombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionEmpresaBusqueda")) {
				this.jButtondireccionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucEmpresaBusqueda")) {
				this.jButtonrucEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailEmpresaBusqueda")) {
				this.jButtonmailEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoEmpresaBusqueda")) {
				this.jButtontelefonoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxEmpresaBusqueda")) {
				this.jButtonfaxEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_postalEmpresaBusqueda")) {
				this.jButtoncodigo_postalEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaEmpresaBusqueda")) {
				this.jButtonivaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividad_principalEmpresaBusqueda")) {
				this.jButtonactividad_principalEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividad_secundariaEmpresaBusqueda")) {
				this.jButtonactividad_secundariaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_nombreEmpresaBusqueda")) {
				this.jButtoncontador_nombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_rucEmpresaBusqueda")) {
				this.jButtoncontador_rucEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_licenciaEmpresaBusqueda")) {
				this.jButtoncontador_licenciaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_nombreEmpresaBusqueda")) {
				this.jButtonrepresentante_nombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_cedulaEmpresaBusqueda")) {
				this.jButtonrepresentante_cedulaEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdPaisPorNombreEmpresa")) {
				this.jButtonBusquedaPorIdPaisPorNombreEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisEmpresa")) {
				this.jButtonFK_IdPaisEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoEmpresaEmpresa")) {
				this.jButtonFK_IdTipoEmpresaEmpresaActionPerformed(evt);
			}
			
			;
			
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Empresa empresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				empresaLocal=this.empresa;
			} else {
				empresaLocal=this.empresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
							
				
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
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
			
			


			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
								
						
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
								
				
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
							
				
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
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
			
			


			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
								
				
				


				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpresa")) {
					jCheckBoxSeleccionarTodosEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpresa")) {
					jCheckBoxSeleccionadosEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpresa")) {
					
				}
				
				


				
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
												
				
				


				
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisEmpresa")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa;
				}

				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					//classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmpresa(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
				//recargarFormEmpresaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
				//recargarFormEmpresaPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
			}
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisEmpresa")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa;
				}

				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					//classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmpresa(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
				//recargarFormEmpresaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
				//recargarFormEmpresaPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
			}
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresa);
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisEmpresa")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa;
				}

				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					//classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormEmpresa(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
				//recargarFormEmpresaPais(jComboBoxid_paisBusquedaPorIdPaisPorNombreEmpresa,"BusquedaPorIdPaisPorNombre");
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisEmpresa")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
				//recargarFormEmpresaPais(jComboBoxid_paisFK_IdPaisEmpresa,"FK_IdPais");
			}
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Empresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Empresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaAnterior =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaAnterior =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empresa =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empresa =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpresa")) {
				
				}
				
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpresa")) {
			
			}
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpresa();
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			if(sTipo.equals("NuevoEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpresa")) {
				jButtonDuplicarEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpresa")) {
				jButtonCopiarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpresa")) {
				jButtonVerFormEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpresa")) {
				jButtonNuevoEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpresa")) {
				jButtonModificarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpresa")) {
				jButtonActualizarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpresa")) {
				jButtonEliminarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpresa")) {
				jButtonCancelarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpresa")) {
				jButtonCerrarEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpresa")) {
				jButtonGuardarCambiosEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpresa")) {
				jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpresa")) {
				jButtonAbrirOrderByEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpresa")) {
				jButtonRecargarInformacionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpresa")) {
				jButtonAnterioresEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpresa")) {
				jButtonSiguientesEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpresaBusqueda")) {
				this.jButtonidEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisEmpresaUpdate")) {
				this.jButtonid_paisEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisEmpresaBusqueda")) {
				this.jButtonid_paisEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadEmpresaUpdate")) {
				this.jButtonid_ciudadEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadEmpresaBusqueda")) {
				this.jButtonid_ciudadEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_empresaEmpresaUpdate")) {
				this.jButtonid_tipo_empresaEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_empresaEmpresaBusqueda")) {
				this.jButtonid_tipo_empresaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEmpresaBusqueda")) {
				this.jButtonnombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionEmpresaBusqueda")) {
				this.jButtondireccionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucEmpresaBusqueda")) {
				this.jButtonrucEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailEmpresaBusqueda")) {
				this.jButtonmailEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoEmpresaBusqueda")) {
				this.jButtontelefonoEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxEmpresaBusqueda")) {
				this.jButtonfaxEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_postalEmpresaBusqueda")) {
				this.jButtoncodigo_postalEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaEmpresaBusqueda")) {
				this.jButtonivaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividad_principalEmpresaBusqueda")) {
				this.jButtonactividad_principalEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("actividad_secundariaEmpresaBusqueda")) {
				this.jButtonactividad_secundariaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_nombreEmpresaBusqueda")) {
				this.jButtoncontador_nombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_rucEmpresaBusqueda")) {
				this.jButtoncontador_rucEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contador_licenciaEmpresaBusqueda")) {
				this.jButtoncontador_licenciaEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_nombreEmpresaBusqueda")) {
				this.jButtonrepresentante_nombreEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("representante_cedulaEmpresaBusqueda")) {
				this.jButtonrepresentante_cedulaEmpresaBusquedaActionPerformed(evt);
			}
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpresa")) {
				closingInternalFrameEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            EmpresaBeanSwingJInternalFrame jInternalFrameParent=(EmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpresaActionPerformed(null);
			}
			
			EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empresa,new Object(),this.empresaParameterGeneral,this.empresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empresa)) {
			if(!esControlTabla) {
				if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);			
				}
				
				if(this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpresa(this.empresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empresaReturnGeneral=empresaLogic.procesarEventosEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaLogic.getEmpresas(),this.empresa,this.empresaParameterGeneral,this.isEsNuevoEmpresa,classes);//this.empresaLogic.getEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpresa(this.empresaReturnGeneral,this.empresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpresa(classes,this.empresaReturnGeneral,this.empresaBean,false);
					}
						
					if(this.empresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpresa(this.empresaReturnGeneral.getEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpresa(this.empresaReturnGeneral.getEmpresa());	
					}
						
					if(this.empresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpresa(this.empresaReturnGeneral.getEmpresa(),classes);//this.empresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpresa(this.empresa,classes);//this.empresaBean);									
				}
			
				if(EmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpresa(this.empresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresa(this.empresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empresaAnterior!=null) {
						this.empresa=this.empresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empresaReturnGeneral=empresaLogic.procesarEventosEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaLogic.getEmpresas(),this.empresa,this.empresaParameterGeneral,this.isEsNuevoEmpresa,classes);//this.empresaLogic.getEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empresaReturnGeneral.getEmpresa(),empresaLogic.getEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empresaReturnGeneral.getEmpresa(),this.empresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpresa() throws Exception {
		
		EmpresaModel empresaModel=(EmpresaModel)this.jTableDatosEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresaModel.empresas=this.empresaLogic.getEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empresaModel.empresas=this.empresas;
		}
		
		
		((EmpresaModel) this.jTableDatosEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempresaAnterior(),this.empresaLogic.getEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempresaAnterior(),this.empresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpresa(Empresa empresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Sucursal.class)) {
					this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.setSucursals(empresa.getSucursals());
					this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
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
										
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresa,new Object(),generalEntityParameterGeneral,this.empresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpresaConstantesFunciones.getClassesRelationshipsOfEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresa,new Object(),generalEntityParameterGeneral,this.empresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpresa(EmpresaBean empresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Sucursal.class)) {
					this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.setSucursals(empresa.getSucursals());
					this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpresa(ArrayList<Classe> classes,EmpresaReturnGeneral empresaReturnGeneral,EmpresaBean empresaBean,Boolean conDefault) throws Exception {
		
			this.empresaBean.setSucursals(empresaReturnGeneral.getEmpresa().getSucursals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpresa(Empresa empresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Sucursal.class)) {
					empresa.setSucursals(this.jInternalFrameDetalleFormEmpresa.sucursalBeanSwingJInternalFrame.sucursalLogic.getSucursals());
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
		if(!paraTabla && !this.permiteMantenimiento(this.empresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpresa = new EmpresaDetalleFormJInternalFrame(jDesktopPane,this.empresaSessionBean.getConGuardarRelaciones(),this.empresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpresa);
		this.jInternalFrameDetalleFormEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpresa.empresaLogic=this.empresaLogic;
		
		this.cargarCombosFrameForeignKeyEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpresa"));
		
		this.jInternalFrameDetalleFormEmpresa.jButtonModificarEmpresa.addActionListener(new ButtonActionListener(this,"ModificarEmpresa"));

		
		this.jInternalFrameDetalleFormEmpresa.jButtonModificarToolBarEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpresa"));
					
		this.jInternalFrameDetalleFormEmpresa.jMenuItemModificarEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarEmpresa"));
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonActualizarToolBarEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpresa"));
						
		this.jInternalFrameDetalleFormEmpresa.jMenuItemActualizarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.addActionListener (new ButtonActionListener(this,"EliminarEmpresa"));
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonEliminarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpresa"));
								
		this.jInternalFrameDetalleFormEmpresa.jMenuItemEliminarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.addActionListener (new ButtonActionListener(this,"CancelarEmpresa"));
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonCancelarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpresa"));
					
		this.jInternalFrameDetalleFormEmpresa.jMenuItemCancelarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jMenuItemDetalleCerrarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosToolBarEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosToolBarEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonidEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonnombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtondireccionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonmailEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"mailEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtontelefonoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonfaxEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"faxEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncodigo_postalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_postalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonivaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"ivaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_principalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_principalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_secundariaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_secundariaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_rucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_licenciaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_licenciaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_cedulaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_cedulaEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpresa"));
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpresa"));
		}
		
		this.jTableDatosEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpresa"));
		
		this.jTableDatosEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpresa"));
		
		this.jButtonNuevoEmpresa.addActionListener(new ButtonActionListener(this,"NuevoEmpresa"));
		
		this.jButtonDuplicarEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarEmpresa"));
		
		this.jButtonCopiarEmpresa.addActionListener(new ButtonActionListener(this,"CopiarEmpresa"));
		
		this.jButtonVerFormEmpresa.addActionListener(new ButtonActionListener(this,"VerFormEmpresa"));
		
		
		this.jButtonNuevoToolBarEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpresa"));
			
		this.jButtonDuplicarToolBarEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpresa"));
			
		this.jMenuItemNuevoEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpresa"));
			
		this.jMenuItemDuplicarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpresa"));		
		
		
		this.jButtonNuevoRelacionesEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpresa"));
			
		this.jMenuItemNuevoRelacionesEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonModificarEmpresa.addActionListener(new ButtonActionListener(this,"ModificarEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonModificarToolBarEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpresa"));
			
			this.jInternalFrameDetalleFormEmpresa.jMenuItemModificarEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpresa.jButtonActualizarEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonActualizarToolBarEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpresa"));
				
			this.jInternalFrameDetalleFormEmpresa.jMenuItemActualizarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonEliminarEmpresa.addActionListener (new ButtonActionListener(this,"EliminarEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonEliminarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpresa"));
						
			this.jInternalFrameDetalleFormEmpresa.jMenuItemEliminarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonCancelarEmpresa.addActionListener (new ButtonActionListener(this,"CancelarEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonCancelarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpresa"));
			
			this.jInternalFrameDetalleFormEmpresa.jMenuItemCancelarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpresa"));		
		
		
		this.jButtonCerrarEmpresa.addActionListener (new ButtonActionListener(this,"CerrarEmpresa"));
		
		
		this.jButtonCerrarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpresa"));
			
		this.jMenuItemCerrarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpresa"));
			
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jMenuItemDetalleCerrarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosToolBarEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresa"));
		}
		
		this.jButtonCopiarToolBarEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpresa"));
			
		this.jButtonVerFormToolBarEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpresa"));
		
		this.jMenuItemGuardarCambiosEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpresa"));
			
		this.jMenuItemCopiarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpresa"));		
		
		this.jMenuItemVerFormEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpresa"));
					
		this.jButtonRecargarInformacionToolBarEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpresa"));
		
		this.jMenuItemRecargarInformacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpresa"));		
		
		
		
		this.jButtonAnterioresEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresEmpresa"));
		
		
		this.jButtonAnterioresToolBarEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpresa"));
		
		this.jMenuItemAnterioresEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpresa"));		
		
		
		this.jButtonSiguientesEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesEmpresa"));
		
		
		this.jButtonSiguientesToolBarEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpresa"));
			
		this.jMenuItemSiguientesEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpresa"));
			
		this.jMenuItemAbrirOrderByEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpresa"));
			
		this.jMenuItemMostrarOcultarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpresa"));

		this.jCheckBoxSeleccionadosEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpresa"));
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpresa"));
			
		this.jComboBoxTiposAccionesEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpresa"));
					
		this.jComboBoxTiposSeleccionarEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpresa"));
			
		this.jTextFieldValorCampoGeneralEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonidEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonnombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtondireccionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonmailEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"mailEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtontelefonoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonfaxEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"faxEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncodigo_postalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_postalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonivaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"ivaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_principalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_principalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_secundariaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_secundariaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_rucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_licenciaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_licenciaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_cedulaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_cedulaEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdPaisPorNombreEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPaisPorNombreEmpresa"));

			this.jButtonFK_IdPaisEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdPaisEmpresa"));

			this.jButtonFK_IdTipoEmpresaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdTipoEmpresaEmpresa"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpresa!=null) {
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresa"));
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresa"));
				this.jInternalFrameReporteDinamicoEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresa"));				
			//this.jButtonGenerarReporteDinamicoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpresa!=null) {
				this.jInternalFrameImportacionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpresa"));
				this.jInternalFrameImportacionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpresa"));
				this.jInternalFrameImportacionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpresa"));
			
			this.jButtonAbrirOrderByToolBarEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpresa"));			
			
			if(this.jInternalFrameOrderByEmpresa!=null) {
				this.jInternalFrameOrderByEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresa.jTabbedPaneRelacionesEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpresa"));
		
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
            		closingInternalFrameEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            EmpresaBeanSwingJInternalFrame jInternalFrameParent=(EmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpresa";
		inputMap = this.jButtonNuevoEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpresa";
		inputMap = this.jButtonNuevoRelacionesEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpresa";
		inputMap = this.jButtonModificarEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpresa";
		inputMap = this.jButtonActualizarEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpresa";
		inputMap = this.jButtonEliminarEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpresa";
		inputMap = this.jButtonCancelarEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpresa";
		inputMap = this.jButtonCerrarEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpresa";
		inputMap = this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpresa.jButtonGuardarCambiosEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonidEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_paisEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_paisEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_paisEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_ciudadEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonid_tipo_empresaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_empresaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonnombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtondireccionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"direccionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonmailEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"mailEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtontelefonoEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonfaxEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"faxEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncodigo_postalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_postalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonivaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"ivaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_principalEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_principalEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonactividad_secundariaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"actividad_secundariaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_rucEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_rucEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtoncontador_licenciaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"contador_licenciaEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_nombreEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_nombreEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresa.jButtonrepresentante_cedulaEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"representante_cedulaEmpresaBusqueda"));
		
		
		this.jButtonBusquedaPorIdPaisPorNombreEmpresa.addActionListener(new ButtonActionListener(this,"BusquedaPorIdPaisPorNombreEmpresa"));

		this.jButtonFK_IdPaisEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdPaisEmpresa"));

		this.jButtonFK_IdTipoEmpresaEmpresa.addActionListener(new ButtonActionListener(this,"FK_IdTipoEmpresaEmpresa"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
					empresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empresa empresaAux:empresas) {
					empresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
						empresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empresa empresaAux:empresas) {
						empresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empresa empresaAux:empresas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpresa.getSelectedRows();
			
			Empresa empresaLocal=new Empresa();
			
			//this.seleccionarTodosEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLocal =(Empresa) this.empresaLogic.getEmpresas().toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empresaLocal =(Empresa) this.empresas.toArray()[this.jTableDatosEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
						empresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Empresa empresaAux:empresas) {
						empresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Empresa empresaAux:this.empresaLogic.getEmpresas()) {
				
						if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							empresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							empresaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							empresaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							empresaAux.setmail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							empresaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_FAX)) {
							existe=true;
							empresaAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL)) {
							existe=true;
							empresaAux.setcodigo_postal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							empresaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL)) {
							existe=true;
							empresaAux.setactividad_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA)) {
							existe=true;
							empresaAux.setactividad_secundaria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE)) {
							existe=true;
							empresaAux.setcontador_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORRUC)) {
							existe=true;
							empresaAux.setcontador_ruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA)) {
							existe=true;
							empresaAux.setcontador_licencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
							existe=true;
							empresaAux.setrepresentante_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA)) {
							existe=true;
							empresaAux.setrepresentante_cedula(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empresa empresaAux:empresas) {
					
						if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							empresaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							empresaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							empresaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							empresaAux.setmail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							empresaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_FAX)) {
							existe=true;
							empresaAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL)) {
							existe=true;
							empresaAux.setcodigo_postal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							empresaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL)) {
							existe=true;
							empresaAux.setactividad_principal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA)) {
							existe=true;
							empresaAux.setactividad_secundaria(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE)) {
							existe=true;
							empresaAux.setcontador_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORRUC)) {
							existe=true;
							empresaAux.setcontador_ruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA)) {
							existe=true;
							empresaAux.setcontador_licencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
							existe=true;
							empresaAux.setrepresentante_nombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA)) {
							existe=true;
							empresaAux.setrepresentante_cedula(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpresa(conSplash);
				
					this.generarReporteEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpresa();
				
				this.exportarEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpresas();
				//this.importarEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpresaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpresa) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpresa(conSplash);
					
						//this.actualizarParametrosGeneralEmpresa();
						
						this.generarReporteProcesoAccionEmpresasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpresaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EmpresaS SELECCIONADOS?", "MANTENIMIENTO DE Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpresa();
				
						this.actualizarParametrosGeneralEmpresa();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empresaReturnGeneral=empresaLogic.procesarAccionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empresaLogic.getEmpresas(),this.empresaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpresa();
					
					EmpresaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpresaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpresa.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpresa.jComboBoxTiposAccionesFormularioEmpresa.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpresa();
			
			if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
			Empresa empresa=new Empresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpresa.getSelectedItem();
			
			
			
			
			empresasSeleccionados=this.getEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empresasSeleccionados.size()==1) {
				for(Empresa empresaAux:empresasSeleccionados) {
					empresa=empresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Sucursal")) {
					jButtonSucursalActionPerformed(null,rowIndex,true,false,empresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpresa();
			
      		//this.finishProcessEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpresaReturnGeneral() throws Exception {
		if(this.empresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpresa(false);
		}
		
		if(this.empresaReturnGeneral.getConRetornoLista() || this.empresaReturnGeneral.getConRetornoObjeto()) {
			if(this.empresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empresaLogic.setEmpresas(this.empresaReturnGeneral.getEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empresaLogic.setEmpresa(this.empresaReturnGeneral.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<Empresa> getEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Empresa empresaAux:empresaLogic.getEmpresas()) {
					if(empresaAux.getIsSelected()) {
						empresasSeleccionados.add(empresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Empresa empresaAux:this.empresas) {
					if(empresaAux.getIsSelected()) {
						empresasSeleccionados.add(empresaAux);				
					}
				}
			}
			
			if(empresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empresasSeleccionados.addAll(this.empresaLogic.getEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empresasSeleccionados.addAll(this.empresas);				
					}
				}
			}
		} else {
			empresasSeleccionados.add(this.empresa);
		}
		
		return empresasSeleccionados;
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
	
	public void generarReporteEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpresas("Todos",empresasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpresas("Todos",empresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpresas("Todos",empresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpresa();
		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpresa();
		
		
		//this.generarReporteEmpresas("Todos",empresasSeleccionados ,empresaImplementable,empresaImplementableHome);
	}
	
	public void mostrarImportacionEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpresa();
		
		this.abrirFrameImportacionEmpresa();		
		
			
		//this.generarReporteEmpresas("Todos",empresasSeleccionados ,empresaImplementable,empresaImplementableHome);
	}
	
	public void importarEmpresas() throws Exception {		
	
	}
	
	public void exportarEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Empresa empresaAux:empresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpresa(empresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empresaAux.setsDetalleGeneralEntityReporte(empresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_MAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_FAX;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_CONTADORRUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpresa(Empresa empresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.gettipoempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getmail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getfax();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getcodigo_postal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getactividad_principal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getactividad_secundaria();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getcontador_nombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getcontador_ruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getcontador_licencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getrepresentante_nombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresa.getrepresentante_cedula();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Empresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpresa(row);				
				iRow++;
			}				
			
			for(Empresa empresaAux:empresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpresa(empresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpresasSeleccionados() throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();		
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empresa");
			//elementRoot.appendChild(element);
		
			for(Empresa empresaAux:empresasSeleccionados) {
				element = document.createElement("empresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpresa(empresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_MAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_FAX);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORRUC);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpresa(Empresa empresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.gettipoempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getmail());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getfax());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getcodigo_postal());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getactividad_principal());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getactividad_secundaria());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getcontador_nombre());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getcontador_ruc());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getcontador_licencia());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getrepresentante_nombre());
		cell = row.createCell(iColumn++);cell.setCellValue(empresa.getrepresentante_cedula());				
	}
	
	public void setFilaDatosExportarXmlEmpresa(Empresa empresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(EmpresaConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(empresa.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(EmpresaConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(empresa.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementtipoempresa_descripcion = document.createElement(EmpresaConstantesFunciones.IDTIPOEMPRESA);
		elementtipoempresa_descripcion.appendChild(document.createTextNode(empresa.gettipoempresa_descripcion()));
		element.appendChild(elementtipoempresa_descripcion);

		Element elementnombre = document.createElement(EmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(empresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(EmpresaConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(empresa.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementruc = document.createElement(EmpresaConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(empresa.getruc().trim()));
		element.appendChild(elementruc);

		Element elementmail = document.createElement(EmpresaConstantesFunciones.MAIL);
		elementmail.appendChild(document.createTextNode(empresa.getmail().trim()));
		element.appendChild(elementmail);

		Element elementtelefono = document.createElement(EmpresaConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(empresa.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementfax = document.createElement(EmpresaConstantesFunciones.FAX);
		elementfax.appendChild(document.createTextNode(empresa.getfax().trim()));
		element.appendChild(elementfax);

		Element elementcodigo_postal = document.createElement(EmpresaConstantesFunciones.CODIGOPOSTAL);
		elementcodigo_postal.appendChild(document.createTextNode(empresa.getcodigo_postal().trim()));
		element.appendChild(elementcodigo_postal);

		Element elementiva = document.createElement(EmpresaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(empresa.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementactividad_principal = document.createElement(EmpresaConstantesFunciones.ACTIVIDADPRINCIPAL);
		elementactividad_principal.appendChild(document.createTextNode(empresa.getactividad_principal().trim()));
		element.appendChild(elementactividad_principal);

		Element elementactividad_secundaria = document.createElement(EmpresaConstantesFunciones.ACTIVIDADSECUNDARIA);
		elementactividad_secundaria.appendChild(document.createTextNode(empresa.getactividad_secundaria().trim()));
		element.appendChild(elementactividad_secundaria);

		Element elementcontador_nombre = document.createElement(EmpresaConstantesFunciones.CONTADORNOMBRE);
		elementcontador_nombre.appendChild(document.createTextNode(empresa.getcontador_nombre().trim()));
		element.appendChild(elementcontador_nombre);

		Element elementcontador_ruc = document.createElement(EmpresaConstantesFunciones.CONTADORRUC);
		elementcontador_ruc.appendChild(document.createTextNode(empresa.getcontador_ruc().trim()));
		element.appendChild(elementcontador_ruc);

		Element elementcontador_licencia = document.createElement(EmpresaConstantesFunciones.CONTADORLICENCIA);
		elementcontador_licencia.appendChild(document.createTextNode(empresa.getcontador_licencia().trim()));
		element.appendChild(elementcontador_licencia);

		Element elementrepresentante_nombre = document.createElement(EmpresaConstantesFunciones.REPRESENTANTENOMBRE);
		elementrepresentante_nombre.appendChild(document.createTextNode(empresa.getrepresentante_nombre().trim()));
		element.appendChild(elementrepresentante_nombre);

		Element elementrepresentante_cedula = document.createElement(EmpresaConstantesFunciones.REPRESENTANTECEDULA);
		elementrepresentante_cedula.appendChild(document.createTextNode(empresa.getrepresentante_cedula().trim()));
		element.appendChild(elementrepresentante_cedula);
	}
	
	public void generarReporteGroupGenericoEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Empresa> empresasSeleccionados=new ArrayList<Empresa>();
		
		empresasSeleccionados=this.getEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpresa(empresasSeleccionados);
		
		this.generarReporteEmpresas("Todos",empresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpresa(ArrayList<Empresa> empresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Empresa empresaAux:empresasSeleccionados) {
				empresaAux.setsDetalleGeneralEntityReporte(empresaAux.toString());
			
				if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_IDTIPOEMPRESA)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.gettipoempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_RUC)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_MAIL)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getmail());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_FAX)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getfax());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CODIGOPOSTAL)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getcodigo_postal());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADPRINCIPAL)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getactividad_principal());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_ACTIVIDADSECUNDARIA)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getactividad_secundaria());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORNOMBRE)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getcontador_nombre());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORRUC)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getcontador_ruc());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_CONTADORLICENCIA)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getcontador_licencia());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTENOMBRE)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getrepresentante_nombre());
				}
				 else if(sTipoSeleccionar.equals(EmpresaConstantesFunciones.LABEL_REPRESENTANTECEDULA)) {
					existe=true;
					empresaAux.setsDescripcionGeneralEntityReporte1(empresaAux.getrepresentante_cedula());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=true;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=true;
			this.isVisibilidadCeldaEliminarEmpresa=true;
			this.isVisibilidadCeldaCancelarEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=true;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=true;
			this.isVisibilidadCeldaModificarEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
			this.isVisibilidadCeldaModificarEmpresa=true;
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
			this.isVisibilidadCeldaCancelarEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=true;
		} else {
			this.actualizarEstadoPanelsEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpresa=false;
			//this.isVisibilidadCeldaVerFormEmpresa=false;
			this.isVisibilidadCeldaDuplicarEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empresaSessionBean.getEsGuardarRelacionado()) {
			if(!empresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;												
			}
			
			this.jButtonCerrarEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.empresa)) {
			this.isVisibilidadCeldaActualizarEmpresa=false;
			this.isVisibilidadCeldaEliminarEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpresa() {
		this.isVisibilidadCeldaNuevoEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosEmpresa=false;
	}
	
	public void actualizarEstadoPanelsEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpresa!=null) {
				this.jScrollPanelDatosEdicionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpresa!=null) {
				this.jScrollPanelDatosEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresa!=null) {
				this.jPanelPaginacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpresa!=null) {
					this.jTabbedPaneBusquedasEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpresa!=null) {
				this.jTabbedPaneBusquedasEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpresa!=null) {
				this.jPanelParametrosReportesEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorIdPaisPorNombre=isParaPais;
			if(!this.isVisibilidadBusquedaPorIdPaisPorNombre) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelBusquedaPorIdPaisPorNombreEmpresa);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdPaisEmpresa);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdTipoEmpresaEmpresa);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadBusquedaPorIdPaisPorNombre=isParaCiudadNegation;
			if(!this.isVisibilidadBusquedaPorIdPaisPorNombre) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelBusquedaPorIdPaisPorNombreEmpresa);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdPaisEmpresa);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdTipoEmpresaEmpresa);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoEmpresa(Boolean isParaTipoEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoEmpresaNegation=!isParaTipoEmpresa;

			this.isVisibilidadBusquedaPorIdPaisPorNombre=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdPaisPorNombre) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelBusquedaPorIdPaisPorNombreEmpresa);}

			this.isVisibilidadFK_IdPais=isParaTipoEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdPaisEmpresa);}

			this.isVisibilidadFK_IdTipoEmpresa=isParaTipoEmpresa;
			if(!this.isVisibilidadFK_IdTipoEmpresa) {this.jTabbedPaneBusquedasEmpresa.remove(jPanelFK_IdTipoEmpresaEmpresa);}
		}
		
	}
	
	

	public String registrarSesionEmpresaParaSucursales() throws Exception {
		Boolean isPaginaPopupSucursal=false;

		try {

			if(this.empresaSessionBean==null) {
				this.empresaSessionBean=new EmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean==null) {
				this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean=new SucursalSessionBean();
			}

			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setsPathNavegacionActual(empresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SucursalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSucursal=this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSucursal(true);
			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSucursal(EmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setisBusquedaDesdeForeignKeySesionEmpresa(true);
			this.jInternalFrameDetalleFormEmpresa.sucursalSessionBean.setlidEmpresaActual(this.idEmpresaActual);

			empresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpresa(true);
			empresaSessionBean.setlIdEmpresaActualForeignKey(this.idEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpresaSessionBean empresaSessionBean=new EmpresaSessionBean();
		
		if(this.empresaSessionBean==null) {
			this.empresaSessionBean=new EmpresaSessionBean();
		}
		
		this.empresaSessionBean.setsUltimaBusquedaEmpresa(this.getsAccionBusqueda());
		this.empresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdPaisPorNombre")) {
			empresaSessionBean.setid_pais(this.getid_paisBusquedaPorIdPaisPorNombre());	
			empresaSessionBean.setnombre(this.getnombreBusquedaPorIdPaisPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			empresaSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoEmpresa")) {
			empresaSessionBean.setid_tipo_empresa(this.getid_tipo_empresaFK_IdTipoEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpresaSessionBean empresaSessionBean=new EmpresaSessionBean();
		
		if(this.empresaSessionBean==null) {
			this.empresaSessionBean=new EmpresaSessionBean();
		}
		
		if(this.empresaSessionBean.getsUltimaBusquedaEmpresa()!=null&&!this.empresaSessionBean.getsUltimaBusquedaEmpresa().equals("")) {
			this.setsAccionBusqueda(empresaSessionBean.getsUltimaBusquedaEmpresa());
			this.setiNumeroPaginacion(empresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdPaisPorNombre")) {
				this.setid_paisBusquedaPorIdPaisPorNombre(empresaSessionBean.getid_pais());
				empresaSessionBean.setid_pais(-1L);
				this.setnombreBusquedaPorIdPaisPorNombre(empresaSessionBean.getnombre());
				empresaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(empresaSessionBean.getid_pais());
				empresaSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoEmpresa")) {
				this.setid_tipo_empresaFK_IdTipoEmpresa(empresaSessionBean.getid_tipo_empresa());
				empresaSessionBean.setid_tipo_empresa(-1L);
			}
		}
		
		this.empresaSessionBean.setsUltimaBusquedaEmpresa("");
		this.empresaSessionBean.setiNumeroPaginacion(EmpresaConstantesFunciones.INUMEROPAGINACION);
		this.empresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpresa() {
		this.updateBorderResaltarBusquedasFormularioEmpresa();
		this.updateVisibilidadBusquedasFormularioEmpresa();
		this.updateHabilitarBusquedasFormularioEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpresa.getComponents().length>0) {
	

		if(this.empresaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreEmpresa!=null) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				jPanel.setBorder(this.empresaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreEmpresa);
			}
		}

		if(this.empresaConstantesFunciones.resaltarFK_IdPaisEmpresa!=null) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdPaisEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				jPanel.setBorder(this.empresaConstantesFunciones.resaltarFK_IdPaisEmpresa);
			}
		}

		if(this.empresaConstantesFunciones.resaltarFK_IdTipoEmpresaEmpresa!=null) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdTipoEmpresaEmpresa);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				jPanel.setBorder(this.empresaConstantesFunciones.resaltarFK_IdTipoEmpresaEmpresa);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empresaConstantesFunciones.mostrarBusquedaPorIdPaisPorNombreEmpresa);
			if(!this.empresaConstantesFunciones.mostrarBusquedaPorIdPaisPorNombreEmpresa && index>-1) {
				this.jTabbedPaneBusquedasEmpresa.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdPaisEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empresaConstantesFunciones.mostrarFK_IdPaisEmpresa);
			if(!this.empresaConstantesFunciones.mostrarFK_IdPaisEmpresa && index>-1) {
				this.jTabbedPaneBusquedasEmpresa.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdTipoEmpresaEmpresa);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empresaConstantesFunciones.mostrarFK_IdTipoEmpresaEmpresa);
			if(!this.empresaConstantesFunciones.mostrarFK_IdTipoEmpresaEmpresa && index>-1) {
				this.jTabbedPaneBusquedasEmpresa.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpresa.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empresaConstantesFunciones.activarBusquedaPorIdPaisPorNombreEmpresa);
				this.jTabbedPaneBusquedasEmpresa.setEnabledAt(index,this.empresaConstantesFunciones.activarBusquedaPorIdPaisPorNombreEmpresa);
			}

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdPaisEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empresaConstantesFunciones.activarFK_IdPaisEmpresa);
				this.jTabbedPaneBusquedasEmpresa.setEnabledAt(index,this.empresaConstantesFunciones.activarFK_IdPaisEmpresa);
			}

			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdTipoEmpresaEmpresa);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empresaConstantesFunciones.activarFK_IdTipoEmpresaEmpresa);
				this.jTabbedPaneBusquedasEmpresa.setEnabledAt(index,this.empresaConstantesFunciones.activarFK_IdTipoEmpresaEmpresa);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdPaisPorNombre")) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelBusquedaPorIdPaisPorNombreEmpresa);

			this.jTabbedPaneBusquedasEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);

			this.empresaConstantesFunciones.setResaltarBusquedaPorIdPaisPorNombreEmpresa(resaltar);

			jPanel.setBorder(this.empresaConstantesFunciones.resaltarBusquedaPorIdPaisPorNombreEmpresa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdPaisEmpresa);

			this.jTabbedPaneBusquedasEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);

			this.empresaConstantesFunciones.setResaltarFK_IdPaisEmpresa(resaltar);

			jPanel.setBorder(this.empresaConstantesFunciones.resaltarFK_IdPaisEmpresa);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoEmpresa")) {
			index= this.jTabbedPaneBusquedasEmpresa.indexOfComponent(this.jPanelFK_IdTipoEmpresaEmpresa);

			this.jTabbedPaneBusquedasEmpresa.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpresa.getComponent(index);

			this.empresaConstantesFunciones.setResaltarFK_IdTipoEmpresaEmpresa(resaltar);

			jPanel.setBorder(this.empresaConstantesFunciones.resaltarFK_IdTipoEmpresaEmpresa);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpresa();
		this.updateVisibilidadResaltarControlesFormularioEmpresa();
		this.updateHabilitarResaltarControlesFormularioEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empresaConstantesFunciones.resaltaridEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setBorder(this.empresaConstantesFunciones.resaltaridEmpresa);}
		if(this.empresaConstantesFunciones.resaltarid_paisEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setBorder(this.empresaConstantesFunciones.resaltarid_paisEmpresa);}
		if(this.empresaConstantesFunciones.resaltarid_ciudadEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setBorder(this.empresaConstantesFunciones.resaltarid_ciudadEmpresa);}
		if(this.empresaConstantesFunciones.resaltarid_tipo_empresaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setBorder(this.empresaConstantesFunciones.resaltarid_tipo_empresaEmpresa);}
		if(this.empresaConstantesFunciones.resaltarnombreEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setBorder(this.empresaConstantesFunciones.resaltarnombreEmpresa);}
		if(this.empresaConstantesFunciones.resaltardireccionEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setBorder(this.empresaConstantesFunciones.resaltardireccionEmpresa);}
		if(this.empresaConstantesFunciones.resaltarrucEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setBorder(this.empresaConstantesFunciones.resaltarrucEmpresa);}
		if(this.empresaConstantesFunciones.resaltarmailEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setBorder(this.empresaConstantesFunciones.resaltarmailEmpresa);}
		if(this.empresaConstantesFunciones.resaltartelefonoEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setBorder(this.empresaConstantesFunciones.resaltartelefonoEmpresa);}
		if(this.empresaConstantesFunciones.resaltarfaxEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setBorder(this.empresaConstantesFunciones.resaltarfaxEmpresa);}
		if(this.empresaConstantesFunciones.resaltarcodigo_postalEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setBorder(this.empresaConstantesFunciones.resaltarcodigo_postalEmpresa);}
		if(this.empresaConstantesFunciones.resaltarivaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setBorder(this.empresaConstantesFunciones.resaltarivaEmpresa);}
		if(this.empresaConstantesFunciones.resaltaractividad_principalEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setBorder(this.empresaConstantesFunciones.resaltaractividad_principalEmpresa);}
		if(this.empresaConstantesFunciones.resaltaractividad_secundariaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setBorder(this.empresaConstantesFunciones.resaltaractividad_secundariaEmpresa);}
		if(this.empresaConstantesFunciones.resaltarcontador_nombreEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setBorder(this.empresaConstantesFunciones.resaltarcontador_nombreEmpresa);}
		if(this.empresaConstantesFunciones.resaltarcontador_rucEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setBorder(this.empresaConstantesFunciones.resaltarcontador_rucEmpresa);}
		if(this.empresaConstantesFunciones.resaltarcontador_licenciaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setBorder(this.empresaConstantesFunciones.resaltarcontador_licenciaEmpresa);}
		if(this.empresaConstantesFunciones.resaltarrepresentante_nombreEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setBorder(this.empresaConstantesFunciones.resaltarrepresentante_nombreEmpresa);}
		if(this.empresaConstantesFunciones.resaltarrepresentante_cedulaEmpresa!=null && this.jInternalFrameDetalleFormEmpresa!=null) {this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setBorder(this.empresaConstantesFunciones.resaltarrepresentante_cedulaEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setVisible(this.empresaConstantesFunciones.mostraridEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelidEmpresa.setVisible(this.empresaConstantesFunciones.mostraridEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_paisEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelid_paisEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_paisEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_ciudadEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelid_ciudadEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_ciudadEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_tipo_empresaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelid_tipo_empresaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarid_tipo_empresaEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarnombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelnombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarnombreEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setVisible(this.empresaConstantesFunciones.mostrardireccionEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPaneldireccionEmpresa.setVisible(this.empresaConstantesFunciones.mostrardireccionEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelrucEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrucEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setVisible(this.empresaConstantesFunciones.mostrarmailEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelmailEmpresa.setVisible(this.empresaConstantesFunciones.mostrarmailEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setVisible(this.empresaConstantesFunciones.mostrartelefonoEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPaneltelefonoEmpresa.setVisible(this.empresaConstantesFunciones.mostrartelefonoEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setVisible(this.empresaConstantesFunciones.mostrarfaxEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelfaxEmpresa.setVisible(this.empresaConstantesFunciones.mostrarfaxEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcodigo_postalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelcodigo_postalEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcodigo_postalEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarivaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelivaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarivaEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setVisible(this.empresaConstantesFunciones.mostraractividad_principalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelactividad_principalEmpresa.setVisible(this.empresaConstantesFunciones.mostraractividad_principalEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setVisible(this.empresaConstantesFunciones.mostraractividad_secundariaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelactividad_secundariaEmpresa.setVisible(this.empresaConstantesFunciones.mostraractividad_secundariaEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelcontador_nombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_nombreEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_rucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelcontador_rucEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_rucEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_licenciaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelcontador_licenciaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarcontador_licenciaEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrepresentante_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelrepresentante_nombreEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrepresentante_nombreEmpresa);
		//this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrepresentante_cedulaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jPanelrepresentante_cedulaEmpresa.setVisible(this.empresaConstantesFunciones.mostrarrepresentante_cedulaEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpresa!=null) {
	
		this.jInternalFrameDetalleFormEmpresa.jLabelidEmpresa.setEnabled(this.empresaConstantesFunciones.activaridEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_paisEmpresa.setEnabled(this.empresaConstantesFunciones.activarid_paisEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_ciudadEmpresa.setEnabled(this.empresaConstantesFunciones.activarid_ciudadEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jComboBoxid_tipo_empresaEmpresa.setEnabled(this.empresaConstantesFunciones.activarid_tipo_empresaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreanombreEmpresa.setEnabled(this.empresaConstantesFunciones.activarnombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreadireccionEmpresa.setEnabled(this.empresaConstantesFunciones.activardireccionEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldrucEmpresa.setEnabled(this.empresaConstantesFunciones.activarrucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreamailEmpresa.setEnabled(this.empresaConstantesFunciones.activarmailEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldtelefonoEmpresa.setEnabled(this.empresaConstantesFunciones.activartelefonoEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldfaxEmpresa.setEnabled(this.empresaConstantesFunciones.activarfaxEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcodigo_postalEmpresa.setEnabled(this.empresaConstantesFunciones.activarcodigo_postalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldivaEmpresa.setEnabled(this.empresaConstantesFunciones.activarivaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_principalEmpresa.setEnabled(this.empresaConstantesFunciones.activaractividad_principalEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreaactividad_secundariaEmpresa.setEnabled(this.empresaConstantesFunciones.activaractividad_secundariaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextAreacontador_nombreEmpresa.setEnabled(this.empresaConstantesFunciones.activarcontador_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_rucEmpresa.setEnabled(this.empresaConstantesFunciones.activarcontador_rucEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldcontador_licenciaEmpresa.setEnabled(this.empresaConstantesFunciones.activarcontador_licenciaEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextArearepresentante_nombreEmpresa.setEnabled(this.empresaConstantesFunciones.activarrepresentante_nombreEmpresa);
		this.jInternalFrameDetalleFormEmpresa.jTextFieldrepresentante_cedulaEmpresa.setEnabled(this.empresaConstantesFunciones.activarrepresentante_cedulaEmpresa);
		}
	}
	
		
}