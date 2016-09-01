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

import com.bydan.erp.seguridad.util.SucursalConstantesFunciones;
import com.bydan.erp.seguridad.util.SucursalParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SucursalParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SucursalBean;
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
public class SucursalBeanSwingJInternalFrame extends SucursalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SucursalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Sucursal> sucursalValidator = new ClassValidator<Sucursal>(Sucursal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Sucursal sucursal;	
	public Sucursal sucursalAux;
	public Sucursal sucursalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Sucursal sucursalTotales;
	public Long idSucursalActual;
	public Long iIdNuevoSucursal=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCiudadActual=0L;

	public Long getidCiudadActual() {
		return idCiudadActual;
	}

	public void setidCiudadActual(Long idCiudadActual) {
		this.idCiudadActual= idCiudadActual;
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
	
	public Boolean isPermisoTodoSucursal;
	public Boolean isPermisoNuevoSucursal;
	public Boolean isPermisoActualizarSucursal;
	public Boolean isPermisoActualizarOriginalSucursal;
	public Boolean isPermisoEliminarSucursal;
	public Boolean isPermisoGuardarCambiosSucursal;
	public Boolean isPermisoConsultaSucursal;
	public Boolean isPermisoBusquedaSucursal;
	public Boolean isPermisoReporteSucursal;
	public Boolean isPermisoPaginacionMedioSucursal;
	public Boolean isPermisoPaginacionAltoSucursal;
	public Boolean isPermisoPaginacionTodoSucursal;
	public Boolean isPermisoCopiarSucursal;
	public Boolean isPermisoVerFormSucursal;
	public Boolean isPermisoDuplicarSucursal;
	public Boolean isPermisoOrdenSucursal;
	
	
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
	
	public SucursalParameterReturnGeneral sucursalReturnGeneral;
	public SucursalParameterReturnGeneral sucursalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSucursal=false;
	public Boolean esParaAccionDesdeFormularioSucursal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SucursalSessionBeanAdditional sucursalSessionBeanAdditional=null;
	
	public SucursalSessionBeanAdditional getSucursalSessionBeanAdditional() {
		return this.sucursalSessionBeanAdditional;
	}
	
	public void setSucursalSessionBeanAdditional(SucursalSessionBeanAdditional sucursalSessionBeanAdditional) {
		try {
			this.sucursalSessionBeanAdditional=sucursalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SucursalBeanSwingJInternalFrameAdditional sucursalBeanSwingJInternalFrameAdditional=null;
	//public class SucursalBeanSwingJInternalFrame
	
	public SucursalBeanSwingJInternalFrameAdditional getSucursalBeanSwingJInternalFrameAdditional() {
		return this.sucursalBeanSwingJInternalFrameAdditional;
	}
	
	public void setSucursalBeanSwingJInternalFrameAdditional(SucursalBeanSwingJInternalFrameAdditional sucursalBeanSwingJInternalFrameAdditional) {
		try {
			this.sucursalBeanSwingJInternalFrameAdditional=sucursalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SucursalLogic sucursalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Sucursal sucursalBean;
	public SucursalConstantesFunciones sucursalConstantesFunciones;
	//public SucursalParameterReturnGeneral sucursalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<Sucursal> sucursals;	
	//public List<Sucursal> sucursalsEliminados;
	//public List<Sucursal> sucursalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSucursal=false;
	public Boolean isVisibilidadCeldaDuplicarSucursal=true;
	public Boolean isVisibilidadCeldaCopiarSucursal=true;
	public Boolean isVisibilidadCeldaVerFormSucursal=true;
	public Boolean isVisibilidadCeldaOrdenSucursal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSucursal=false;
	public Boolean isVisibilidadCeldaModificarSucursal=false;
	public Boolean isVisibilidadCeldaActualizarSucursal=false;
	public Boolean isVisibilidadCeldaEliminarSucursal=false;
	public Boolean isVisibilidadCeldaCancelarSucursal=false;
	public Boolean isVisibilidadCeldaGuardarSucursal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSucursal=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoSucursal() {
		return this.iIdNuevoSucursal;
	}

	public void setiIdNuevoSucursal(Long iIdNuevoSucursal) {
		this.iIdNuevoSucursal = iIdNuevoSucursal;
	}
	
	public Long getidSucursalActual() {
		return this.idSucursalActual;
	}

	public void setidSucursalActual(Long idSucursalActual) {
		this.idSucursalActual = idSucursalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Sucursal getsucursal() {
		return this.sucursal;
	}

	public void setsucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	public Sucursal getsucursalAux() {
		return this.sucursalAux;
	}

	public void setsucursalAux(Sucursal sucursalAux) {
		this.sucursalAux = sucursalAux;
	}				
	
	public Sucursal getsucursalAnterior() {
		return this.sucursalAnterior;
	}

	public void setsucursalAnterior(Sucursal sucursalAnterior) {
		this.sucursalAnterior = sucursalAnterior;
	}	
	
	public Sucursal getsucursalTotales() {
		return this.sucursalTotales;
	}

	public void setsucursalTotales(Sucursal sucursalTotales) {
		this.sucursalTotales = sucursalTotales;
	}	
	
	public Sucursal getsucursalBean() {
		return this.sucursalBean;
	}

	public void setsucursalBean(Sucursal sucursalBean) {
		this.sucursalBean = sucursalBean;
	}	
	
	public SucursalParameterReturnGeneral getsucursalReturnGeneral() {
		return this.sucursalReturnGeneral;
	}

	public void setsucursalReturnGeneral(SucursalParameterReturnGeneral sucursalReturnGeneral) {
		this.sucursalReturnGeneral = sucursalReturnGeneral;
	}	
	
	
	public Long id_ciudadFK_IdCiudad=-1L;

	public Long getid_ciudadFK_IdCiudad() {
		return this.id_ciudadFK_IdCiudad;
	}

	public void setid_ciudadFK_IdCiudad(Long id_ciudadFK_IdCiudad) {
		this.id_ciudadFK_IdCiudad = id_ciudadFK_IdCiudad;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SucursalLogic getSucursalLogic()	{		
		return sucursalLogic;
	}

	public void setSucursalLogic(SucursalLogic sucursalLogic) {
		this.sucursalLogic = sucursalLogic;
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
	
	public Boolean getIsEsNuevoSucursal() {
		return isEsNuevoSucursal;
	}

	public void setIsEsNuevoSucursal(Boolean isEsNuevoSucursal) {
		this.isEsNuevoSucursal = isEsNuevoSucursal;
	}

	public Boolean getEsParaAccionDesdeFormularioSucursal() {
		return esParaAccionDesdeFormularioSucursal;
	}
	
	public void setEsParaAccionDesdeFormularioSucursal(Boolean esParaAccionDesdeFormularioSucursal) {
		this.esParaAccionDesdeFormularioSucursal = esParaAccionDesdeFormularioSucursal;
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

			empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.sucursalSessionBean==null) {
				this.sucursalSessionBean=new SucursalSessionBean();
			}

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

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
					empresaLogic.getEntityWithConnection(sucursalSessionBean.getlidEmpresaActual());
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

			if(this.sucursalSessionBean==null) {
				this.sucursalSessionBean=new SucursalSessionBean();
			}

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(sucursalSessionBean.getlidPaisActual());
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

			if(this.sucursalSessionBean==null) {
				this.sucursalSessionBean=new SucursalSessionBean();
			}

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(sucursalSessionBean.getlidCiudadActual());
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

					if(this.sucursal!=null) {
						this.sucursal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) {
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSucursal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSucursal!=null) {
						if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(empresaTemp!=null && jComboBoxid_empresaFK_IdEmpresaSucursal!=null) {
						jComboBoxid_empresaFK_IdEmpresaSucursal.setSelectedItem(empresaTemp);
					} else {
						if(jComboBoxid_empresaFK_IdEmpresaSucursal!=null) {
							//jComboBoxid_empresaFK_IdEmpresaSucursal.setSelectedItem(empresaTemp);
							if(jComboBoxid_empresaFK_IdEmpresaSucursal.getItemCount()>0) {
								jComboBoxid_empresaFK_IdEmpresaSucursal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSucursalGenerico)throws Exception
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
				jComboBoxid_empresaSucursalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSucursalGenerico!=null && jComboBoxid_empresaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_empresaSucursalGenerico.setSelectedIndex(0);
				}
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

					if(this.sucursal!=null) {
						this.sucursal.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) {
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisSucursal.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormSucursal!=null) {
						if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisSucursal!=null) {
						jComboBoxid_paisFK_IdPaisSucursal.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisSucursal!=null) {
							//jComboBoxid_paisFK_IdPaisSucursal.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisSucursal.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisSucursal.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisSucursalGenerico)throws Exception
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
				jComboBoxid_paisSucursalGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisSucursalGenerico!=null && jComboBoxid_paisSucursalGenerico.getItemCount()>0) {
					jComboBoxid_paisSucursalGenerico.setSelectedIndex(0);
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

					if(this.sucursal!=null) {
						this.sucursal.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) {
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadSucursal.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormSucursal!=null) {
						if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadSucursalGenerico)throws Exception
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
				jComboBoxid_ciudadSucursalGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadSucursalGenerico!=null && jComboBoxid_ciudadSucursalGenerico.getItemCount()>0) {
					jComboBoxid_ciudadSucursalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Sucursal sucursal,JComboBox jComboBoxid_empresaSucursalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSucursalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSucursalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				sucursal.setid_empresa(empresaAux.getId());
				sucursal.setempresa_descripcion(SucursalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				sucursal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Sucursal sucursal,JComboBox jComboBoxid_paisSucursalGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisSucursalGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisSucursalGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				sucursal.setid_pais(paisAux.getId());
				sucursal.setpais_descripcion(SucursalConstantesFunciones.getPaisDescripcion(paisAux));
				sucursal.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(Sucursal sucursal,JComboBox jComboBoxid_ciudadSucursalGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadSucursalGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadSucursalGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				sucursal.setid_ciudad(ciudadAux.getId());
				sucursal.setciudad_descripcion(SucursalConstantesFunciones.getCiudadDescripcion(ciudadAux));
				sucursal.setCiudad(ciudadAux);			}
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

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) { 
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) { 
					}

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empresaFK_IdEmpresaSucursal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jComboBoxid_empresaFK_IdEmpresaSucursal.addItem(empresa);
							}
						}

						if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) { 
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) { 
					}

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisSucursal.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisSucursal.addItem(pais);
							}
						}

						if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) { 
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSucursal!=null) { 
					}

					if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empresaFK_IdEmpresaSucursal.setSelectedItem(empresa);
						} else {
							this.jComboBoxid_empresaFK_IdEmpresaSucursal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisSucursal.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisSucursal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormSucursal!=null) {
							this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSucursal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SucursalConstantesFunciones.refrescarForeignKeysDescripcionesSucursal(this.sucursalLogic.getSucursals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SucursalConstantesFunciones.refrescarForeignKeysDescripcionesSucursal(this.sucursals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//sucursalLogic.setSucursals(this.sucursals);
			sucursalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SucursalParameterReturnGeneral getSucursalParameterGeneral() {
		return this.sucursalParameterGeneral;
	}
	
	public void setSucursalParameterGeneral(SucursalParameterReturnGeneral sucursalParameterGeneral) {
		this.sucursalParameterGeneral = sucursalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSucursal() {
		return isPermisoTodoSucursal;
	}

	public void setIsPermisoTodoSucursal(Boolean isPermisoTodoSucursal) {
		this.isPermisoTodoSucursal = isPermisoTodoSucursal;
	}

	public Boolean getIsPermisoNuevoSucursal() {
		return isPermisoNuevoSucursal;
	}

	public void setIsPermisoNuevoSucursal(Boolean isPermisoNuevoSucursal) {
		this.isPermisoNuevoSucursal = isPermisoNuevoSucursal;
	}

	public Boolean getIsPermisoActualizarSucursal() {
		return isPermisoActualizarSucursal;
	}

	public void setIsPermisoActualizarSucursal(Boolean isPermisoActualizarSucursal) {
		this.isPermisoActualizarSucursal = isPermisoActualizarSucursal;
	}

	public Boolean getIsPermisoEliminarSucursal() {
		return isPermisoEliminarSucursal;
	}

	public void setIsPermisoEliminarSucursal(Boolean isPermisoEliminarSucursal) {
		this.isPermisoEliminarSucursal = isPermisoEliminarSucursal;
	}

	public Boolean getIsPermisoGuardarCambiosSucursal() {
		return isPermisoGuardarCambiosSucursal;
	}

	public void setIsPermisoGuardarCambiosSucursal(Boolean isPermisoGuardarCambiosSucursal) {
		this.isPermisoGuardarCambiosSucursal = isPermisoGuardarCambiosSucursal;
	}
	
	public Boolean getIsPermisoConsultaSucursal() {
		return isPermisoConsultaSucursal;
	}

	public void setIsPermisoConsultaSucursal(Boolean isPermisoConsultaSucursal) {
		this.isPermisoConsultaSucursal = isPermisoConsultaSucursal;
	}

	public Boolean getIsPermisoBusquedaSucursal() {
		return isPermisoBusquedaSucursal;
	}

	public void setIsPermisoBusquedaSucursal(Boolean isPermisoBusquedaSucursal) {
		this.isPermisoBusquedaSucursal = isPermisoBusquedaSucursal;
	}

	public Boolean getIsPermisoReporteSucursal() {
		return isPermisoReporteSucursal;
	}

	public void setIsPermisoReporteSucursal(Boolean isPermisoReporteSucursal) {
		this.isPermisoReporteSucursal = isPermisoReporteSucursal;
	}
	
	public Boolean getIsPermisoPaginacionMedioSucursal() {
		return isPermisoPaginacionMedioSucursal;
	}

	public void setIsPermisoPaginacionMedioSucursal(Boolean isPermisoPaginacionMedioSucursal) {
		this.isPermisoPaginacionMedioSucursal = isPermisoPaginacionMedioSucursal;
	}
	
	public Boolean getIsPermisoPaginacionTodoSucursal() {
		return isPermisoPaginacionTodoSucursal;
	}

	public void setIsPermisoPaginacionTodoSucursal(Boolean isPermisoPaginacionTodoSucursal) {
		this.isPermisoPaginacionTodoSucursal = isPermisoPaginacionTodoSucursal;
	}
	
	public Boolean getIsPermisoPaginacionAltoSucursal() {
		return isPermisoPaginacionAltoSucursal;
	}

	public void setIsPermisoPaginacionAltoSucursal(Boolean isPermisoPaginacionAltoSucursal) {
		this.isPermisoPaginacionAltoSucursal = isPermisoPaginacionAltoSucursal;
	}
	
	public Boolean getIsPermisoCopiarSucursal() {
		return isPermisoCopiarSucursal;
	}

	public void setIsPermisoCopiarSucursal(Boolean isPermisoCopiarSucursal) {
		this.isPermisoCopiarSucursal = isPermisoCopiarSucursal;
	}
	
	public Boolean getIsPermisoVerFormSucursal() {
		return isPermisoVerFormSucursal;
	}

	public void setIsPermisoVerFormSucursal(Boolean isPermisoVerFormSucursal) {
		this.isPermisoVerFormSucursal = isPermisoVerFormSucursal;
	}
	
	public Boolean getIsPermisoDuplicarSucursal() {
		return isPermisoDuplicarSucursal;
	}

	public void setIsPermisoDuplicarSucursal(Boolean isPermisoDuplicarSucursal) {
		this.isPermisoDuplicarSucursal = isPermisoDuplicarSucursal;
	}
	
	public Boolean getIsPermisoOrdenSucursal() {
		return isPermisoOrdenSucursal;
	}

	public void setIsPermisoOrdenSucursal(Boolean isPermisoOrdenSucursal) {
		this.isPermisoOrdenSucursal = isPermisoOrdenSucursal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSucursal() {
		return isVisibilidadCeldaNuevoSucursal;
	}

	public void setIsVisibilidadCeldaNuevoSucursal(Boolean isVisibilidadCeldaNuevoSucursal) {
		this.isVisibilidadCeldaNuevoSucursal = isVisibilidadCeldaNuevoSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSucursal() {
		return isVisibilidadCeldaDuplicarSucursal;
	}

	public void setIsVisibilidadCeldaDuplicarSucursal(Boolean isVisibilidadCeldaDuplicarSucursal) {
		this.isVisibilidadCeldaDuplicarSucursal = isVisibilidadCeldaDuplicarSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSucursal() {
		return isVisibilidadCeldaCopiarSucursal;
	}

	public void setIsVisibilidadCeldaCopiarSucursal(Boolean isVisibilidadCeldaCopiarSucursal) {
		this.isVisibilidadCeldaCopiarSucursal = isVisibilidadCeldaCopiarSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSucursal() {
		return isVisibilidadCeldaVerFormSucursal;
	}

	public void setIsVisibilidadCeldaVerFormSucursal(Boolean isVisibilidadCeldaVerFormSucursal) {
		this.isVisibilidadCeldaVerFormSucursal = isVisibilidadCeldaVerFormSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSucursal() {
		return isVisibilidadCeldaOrdenSucursal;
	}

	public void setIsVisibilidadCeldaOrdenSucursal(Boolean isVisibilidadCeldaOrdenSucursal) {
		this.isVisibilidadCeldaOrdenSucursal = isVisibilidadCeldaOrdenSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSucursal() {
		return isVisibilidadCeldaNuevoRelacionesSucursal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSucursal(Boolean isVisibilidadCeldaNuevoRelacionesSucursal) {
		this.isVisibilidadCeldaNuevoRelacionesSucursal = isVisibilidadCeldaNuevoRelacionesSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSucursal() {
		return isVisibilidadCeldaModificarSucursal;
	}

	public void setIsVisibilidadCeldaModificarSucursal(Boolean isVisibilidadCeldaModificarSucursal) {
		this.isVisibilidadCeldaModificarSucursal = isVisibilidadCeldaModificarSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSucursal() {
		return isVisibilidadCeldaActualizarSucursal;
	}

	public void setIsVisibilidadCeldaActualizarSucursal(Boolean isVisibilidadCeldaActualizarSucursal) {
		this.isVisibilidadCeldaActualizarSucursal = isVisibilidadCeldaActualizarSucursal;
	}

	public Boolean getIsVisibilidadCeldaEliminarSucursal() {
		return isVisibilidadCeldaEliminarSucursal;
	}

	public void setIsVisibilidadCeldaEliminarSucursal(Boolean isVisibilidadCeldaEliminarSucursal) {
		this.isVisibilidadCeldaEliminarSucursal = isVisibilidadCeldaEliminarSucursal;
	}

	public Boolean getIsVisibilidadCeldaCancelarSucursal() {
		return isVisibilidadCeldaCancelarSucursal;
	}

	public void setIsVisibilidadCeldaCancelarSucursal(Boolean isVisibilidadCeldaCancelarSucursal) {
		this.isVisibilidadCeldaCancelarSucursal = isVisibilidadCeldaCancelarSucursal;
	}

	public Boolean getIsVisibilidadCeldaGuardarSucursal() {
		return isVisibilidadCeldaGuardarSucursal;
	}

	public void setIsVisibilidadCeldaGuardarSucursal(Boolean isVisibilidadCeldaGuardarSucursal) {
		this.isVisibilidadCeldaGuardarSucursal = isVisibilidadCeldaGuardarSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSucursal() {
		return isVisibilidadCeldaGuardarCambiosSucursal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSucursal(Boolean isVisibilidadCeldaGuardarCambiosSucursal) {
		this.isVisibilidadCeldaGuardarCambiosSucursal = isVisibilidadCeldaGuardarCambiosSucursal;
	}
		
	public SucursalSessionBean getsucursalSessionBean() {
		return this.sucursalSessionBean;
	}
	
	public void setsucursalSessionBean(SucursalSessionBean sucursalSessionBean) {
		this.sucursalSessionBean=sucursalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSucursal(Sucursal sucursal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(sucursal,null);
				this.setActualParaGuardarPaisForeignKey(sucursal,null);
				this.setActualParaGuardarCiudadForeignKey(sucursal,null);
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
	
	public void bugActualizarReferenciaActual(Sucursal sucursal,Sucursal sucursalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSucursal(sucursal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sucursalAux.setId(sucursal.getId());
		sucursalAux.setVersionRow(sucursal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSucursal();
		
			int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = sucursalValidator.getInvalidValues(this.sucursal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			sucursalLogic.setDatosCliente(datosCliente);
			sucursalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				sucursalAux=new  Sucursal();
				
				sucursalAux.setIsNew(true);
				sucursalAux.setIsChanged(true);
				
				sucursalAux.setSucursalOriginal(this.sucursal);
				
				sucursalAux.setId(this.sucursal.getId());	
				sucursalAux.setVersionRow(this.sucursal.getVersionRow());	
				sucursalAux.setid_empresa(this.sucursal.getid_empresa());	
				sucursalAux.setid_pais(this.sucursal.getid_pais());	
				sucursalAux.setid_ciudad(this.sucursal.getid_ciudad());	
				sucursalAux.setcodigo(this.sucursal.getcodigo());	
				sucursalAux.setnumero(this.sucursal.getnumero());	
				sucursalAux.setnombre(this.sucursal.getnombre());	
				sucursalAux.setdireccion(this.sucursal.getdireccion());	
				sucursalAux.setruc(this.sucursal.getruc());	
				sucursalAux.settelefono(this.sucursal.gettelefono());	
				sucursalAux.setfax(this.sucursal.getfax());	
				sucursalAux.setmail(this.sucursal.getmail());	
				sucursalAux.setresponsable(this.sucursal.getresponsable());	
				sucursalAux.setdescripcion(this.sucursal.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sucursalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sucursalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(sucursalAux,sucursalLogic.getSucursals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sucursalAux,sucursals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.sucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalLogic.saveSucursals();//WithConnection
						//sucursalLogic.getSetVersionRowSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sucursal,sucursalAux);
					
					this.refrescarForeignKeysDescripcionesSucursal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				sucursalAux=new  Sucursal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.sucursalSessionBean.getEsGuardarRelacionado() 
					|| (this.sucursalSessionBean.getEsGuardarRelacionado() && this.sucursal.getId()>=0)) {
						
					sucursalAux.setIsNew(false);
				}
				
				sucursalAux.setIsDeleted(false);
			
				sucursalAux.setId(this.sucursal.getId());	
				sucursalAux.setVersionRow(this.sucursal.getVersionRow());	
				sucursalAux.setid_empresa(this.sucursal.getid_empresa());	
				sucursalAux.setid_pais(this.sucursal.getid_pais());	
				sucursalAux.setid_ciudad(this.sucursal.getid_ciudad());	
				sucursalAux.setcodigo(this.sucursal.getcodigo());	
				sucursalAux.setnumero(this.sucursal.getnumero());	
				sucursalAux.setnombre(this.sucursal.getnombre());	
				sucursalAux.setdireccion(this.sucursal.getdireccion());	
				sucursalAux.setruc(this.sucursal.getruc());	
				sucursalAux.settelefono(this.sucursal.gettelefono());	
				sucursalAux.setfax(this.sucursal.getfax());	
				sucursalAux.setmail(this.sucursal.getmail());	
				sucursalAux.setresponsable(this.sucursal.getresponsable());	
				sucursalAux.setdescripcion(this.sucursal.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sucursalAux,sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sucursalAux,sucursals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.sucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalLogic.saveSucursals();//WithConnection
						//sucursalLogic.getSetVersionRowSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sucursal,sucursalAux);
					
					this.refrescarForeignKeysDescripcionesSucursal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				sucursalAux=new  Sucursal();
				
				sucursalAux.setIsNew(false);
				sucursalAux.setIsChanged(false);
				
				sucursalAux.setIsDeleted(true);
				
				sucursalAux.setId(this.sucursal.getId());	
				sucursalAux.setVersionRow(this.sucursal.getVersionRow());	
				sucursalAux.setid_empresa(this.sucursal.getid_empresa());	
				sucursalAux.setid_pais(this.sucursal.getid_pais());	
				sucursalAux.setid_ciudad(this.sucursal.getid_ciudad());	
				sucursalAux.setcodigo(this.sucursal.getcodigo());	
				sucursalAux.setnumero(this.sucursal.getnumero());	
				sucursalAux.setnombre(this.sucursal.getnombre());	
				sucursalAux.setdireccion(this.sucursal.getdireccion());	
				sucursalAux.setruc(this.sucursal.getruc());	
				sucursalAux.settelefono(this.sucursal.gettelefono());	
				sucursalAux.setfax(this.sucursal.getfax());	
				sucursalAux.setmail(this.sucursal.getmail());	
				sucursalAux.setresponsable(this.sucursal.getresponsable());	
				sucursalAux.setdescripcion(this.sucursal.getdescripcion());	
				
				if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.sucursalAux.getId()>=0) {	
						this.sucursalsEliminados.add(sucursalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(sucursalAux,sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sucursalAux,sucursals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.sucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalLogic.saveSucursals();//WithConnection
						//sucursalLogic.getSetVersionRowSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getSucursals().addAll(this.sucursalsEliminados);
					
					sucursalLogic.saveSucursals();//WithConnection
					//sucursalLogic.getSetVersionRowSucursals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSucursal();
				
				this.sucursalsEliminados= new ArrayList<Sucursal>();		
			}
			
			if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sucursal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sucursal=sucursalAux;
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
      		//this.finishProcessSucursal();
      	}
		
	}	
	
	public void actualizarRelaciones(Sucursal sucursalLocal) throws Exception {
		
		if(this.sucursalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Sucursal sucursalLocal) throws Exception {	
		if(this.sucursalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				sucursalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				sucursalLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				sucursalLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSucursalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sucursalValidator.getInvalidValues(this.sucursal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Sucursal sucursal,List<Sucursal> sucursals) throws Exception {
		try	{		
			SucursalConstantesFunciones.actualizarLista(sucursal,sucursals,this.sucursalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Sucursal sucursal,List<Sucursal> sucursals) throws Exception {
		try	{			
			SucursalConstantesFunciones.actualizarSelectedLista(sucursal,sucursals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Sucursal> sucursalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sucursalsLocal=this.sucursalLogic.getSucursals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sucursalsLocal=this.sucursals;
			}
			//ARCHITECTURE
		
			for(Sucursal sucursalLocal:sucursalsLocal) {
				if(this.permiteMantenimiento(sucursalLocal) && sucursalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SucursalConstantesFunciones.getSucursalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelid_empresaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelid_paisSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelid_ciudadSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelcodigoSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelnumeroSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelnombreSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeldireccionSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelrucSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeltelefonoSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.FAX)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelfaxSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.MAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelmailSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.RESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelresponsableSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SucursalConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeldescripcionSucursal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelid_empresaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelid_paisSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelid_ciudadSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelcodigoSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelnumeroSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelnombreSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabeldireccionSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelrucSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabeltelefonoSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelfaxSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelmailSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabelresponsableSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSucursal.jLabeldescripcionSucursal,"");
		
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
		this.iIdNuevoSucursal--;	
		
		
		this.sucursalAux=new Sucursal();
		
		this.sucursalAux.setId(this.iIdNuevoSucursal);
		this.sucursalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sucursalLogic.getSucursals().add(this.sucursalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sucursals.add(this.sucursalAux);
		}
		//ARCHITECTURE
		
		this.sucursal=this.sucursalAux;
		
		if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSucursal(this.sucursal);
			this.setVariablesObjetoActualToFormularioForeignKeySucursal(this.sucursal);
		}
				
		//this.setDefaultControlesSucursal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySucursal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySucursal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySucursal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSucursal(this.sucursalBean,this.sucursal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SucursalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.sucursalSessionBean.getConGuardarRelaciones()) {
			classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.sucursalReturnGeneral=sucursalLogic.procesarEventosSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sucursalLogic.getSucursals(),this.sucursal,this.sucursalParameterGeneral,this.isEsNuevoSucursal,classes);//this.sucursalLogic.getSucursal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSucursal(this.sucursalReturnGeneral,this.sucursalBean,false);
		
		if(this.sucursalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySucursal(this.sucursalReturnGeneral.getSucursal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSucursal(this.sucursalReturnGeneral.getSucursal());
		}
		
		if(this.sucursalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSucursal(this.sucursalReturnGeneral.getSucursal(),classes);//this.sucursalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySucursal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySucursal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SucursalBeanSwingJInternalFrameAdditional.RecargarFormSucursal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSucursal(false);
						
			if(sucursalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSucursal();
			}
			
			this.actualizarVisualTableDatosSucursal();
			
			this.jTableDatosSucursal.setRowSelectionInterval(this.getIndiceNuevoSucursal(), this.getIndiceNuevoSucursal());
			
			this.seleccionarFilaTablaSucursalActual();
						
			this.actualizarEstadoCeldasBotonesSucursal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSucursal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarcodigoSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarnumeroSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarnombreSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activardireccionSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarrucSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activartelefonoSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarfaxSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarmailSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarresponsableSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activardescripcionSucursal);	
		
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarid_empresaSucursal);
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarid_paisSucursal);
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setEnabled(isHabilitar && this.sucursalConstantesFunciones.activarid_ciudadSucursal);
	};
	
	public void setDefaultControlesSucursal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSucursal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sucursalSessionBean.setConGuardarRelaciones(true);			
			this.sucursalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.setVisible(true);
			
					
		} else {
			//this.sucursalSessionBean.setConGuardarRelaciones(false);			
			this.sucursalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSucursal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
				if(sucursalAux.getId().equals(this.iIdNuevoSucursal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sucursal sucursalAux:this.sucursals) {
				if(sucursalAux.getId().equals(this.iIdNuevoSucursal)) {
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
	
	public int getIndiceActualSucursal(Sucursal sucursal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
				if(sucursalAux.getId().equals(sucursal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sucursal sucursalAux:this.sucursals) {
				if(sucursalAux.getId().equals(sucursal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSucursal(Sucursal sucursalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
				if(sucursalAux.getSucursalOriginal().getId().equals(sucursalOriginal.getId())) {
					existe=true;
					sucursalOriginal.setId(sucursalAux.getId());
					sucursalOriginal.setVersionRow(sucursalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sucursal sucursalAux:this.sucursals) {
				if(sucursalAux.getSucursalOriginal().getId().equals(sucursalOriginal.getId())) {
					existe=true;
					sucursalOriginal.setId(sucursalAux.getId());
					sucursalOriginal.setVersionRow(sucursalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSucursal(Boolean esParaCancelar) throws Exception {
		sucursalsAux=new ArrayList<Sucursal>();
		sucursalAux=new Sucursal();
		
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
					if(sucursalAux.getId()<0) {
						sucursalsAux.add(sucursalAux);
					}		
				}
				this.iIdNuevoSucursal=0L;
				this.sucursalLogic.getSucursals().removeAll(sucursalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sucursal sucursalAux:this.sucursals) {
					if(sucursalAux.getId()<0) {
						sucursalsAux.add(sucursalAux);
					}		
				}
				this.iIdNuevoSucursal=0L;
				this.sucursals.removeAll(sucursalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSucursal 
					&& this.sucursalLogic.getSucursals().size()>0
					) {
					sucursalAux=this.sucursalLogic.getSucursals().get(this.sucursalLogic.getSucursals().size() - 1);
				
					if(sucursalAux.getId()<0) {
						this.sucursalLogic.getSucursals().remove(sucursalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSucursal && this.sucursals.size()>0) {
					sucursalAux=this.sucursals.get(this.sucursals.size() - 1);
				
					if(sucursalAux.getId()<0) {
						this.sucursals.remove(sucursalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSucursal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sucursal.getId()<0) {
				this.sucursalLogic.getSucursals().remove(this.sucursal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sucursal.getId()<0) {
				this.sucursals.remove(this.sucursal);
			}
		}			
	}
	
	public void setEstadosInicialesSucursal(List<Sucursal> sucursalsAux) throws Exception {
		SucursalConstantesFunciones.setEstadosInicialesSucursal(sucursalsAux);
	}
	
	public void setEstadosInicialesSucursal(Sucursal sucursalAux) throws Exception {
		SucursalConstantesFunciones.setEstadosInicialesSucursal(sucursalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSucursalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSucursalActual()) {
				if(!this.isEsNuevoSucursal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSucursal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSucursalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sucursal ?", "MANTENIMIENTO DE Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Sucursal sucursal) throws Exception {
		SucursalConstantesFunciones.seleccionarAsignar(this.sucursal,sucursal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSucursal=this.isPermisoActualizarOriginalSucursal;
			
			
			this.seleccionarAsignar(sucursal);
			
			

			idCiudadActual=sucursal.getid_ciudad();
			this.seleccionarCiudadActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SucursalConstantesFunciones.quitarEspaciosSucursal(this.sucursal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sucursalSessionBean.setsFuncionBusquedaRapida(this.sucursalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCiudadActual() throws Exception {
		try	{
			Ciudad ciudadAux=new Ciudad();

			if(this.idCiudadActual != null && this.idCiudadActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getEntityWithConnection(this.idCiudadActual);
					ciudadAux= ciudadLogic.getCiudad();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				ciudadsForeignKey=new ArrayList<Ciudad>();
				ciudadsForeignKey.add(ciudadAux);
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
			if(this.isEsNuevoSucursal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSucursal(esParaCancelar);				
				this.cancelarNuevoSucursal(esParaCancelar);								
			}
			
			this.sucursal=new Sucursal();
			
			this.inicializarSucursal();
			
			this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSucursal() throws Exception {
		try {
			SucursalConstantesFunciones.inicializarSucursal(this.sucursal);
			
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
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sucursalLogic.getSucursals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSucursals(String sAccionBusqueda,List<Sucursal> sucursalsParaReportes) throws Exception {
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
					sPathReporteFinal="Sucursal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SucursalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SucursalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Sucursal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sucursales");		
		parameters.put("busquedapor", SucursalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSucursal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SucursalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SucursalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSucursal=new JRBeanArrayDataSource(SucursalJInternalFrame.TraerSucursalBeans(sucursalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSucursal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SucursalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SucursalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SucursalBean.TraerSucursalBeans(sucursalsParaReportes).toArray()));
							
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
				this.generarExcelReporteSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSucursalActionPerformed(null);
					//this.generarExcelReporteSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSucursals(sAccionBusqueda,sTipoArchivoReporte,sucursalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<Sucursal> sucursalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sucursals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSucursal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Sucursal sucursal : sucursalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SucursalConstantesFunciones.generarExcelReporteDataSucursal("NORMAL",row,workbook,sucursal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSucursal(String sTipo,Row row,Workbook workbook) {
		
		SucursalConstantesFunciones.generarExcelReporteHeaderSucursal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<Sucursal> sucursalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Sucursal sucursal : sucursalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SucursalConstantesFunciones.getSucursalDescripcion(sucursal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_FAX))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_FAX);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getfax());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_MAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_MAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getmail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_RESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_RESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getresponsable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SucursalConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SucursalConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sucursal.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<Sucursal> sucursalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Sucursal> sucursalsRespaldo=null;
		
		classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sucursalLogic.setDatosCliente(this.datosCliente);
		this.sucursalLogic.setDatosDeep(this.datosDeep);
		this.sucursalLogic.setIsConDeep(true);
		
		sucursalsRespaldo=this.sucursalLogic.getSucursals();
		
		this.sucursalLogic.setSucursals(sucursalsParaReportes);	
		this.sucursalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sucursalsParaReportes=this.sucursalLogic.getSucursals();
		this.sucursalLogic.setSucursals(sucursalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSucursal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Sucursal sucursal : sucursalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSucursal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SucursalConstantesFunciones.generarExcelReporteDataSucursal("NORMAL",row,workbook,sucursal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SucursalConstantesFunciones.getSucursalDescripcion(sucursal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSucursal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSucursal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSucursal() throws Exception {		
		this.startProcessSucursal(true);
	}
	
	public void startProcessSucursal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSucursal ,this.jPanelParametrosReportesSucursal, this.jScrollPanelDatosSucursal,this.jPanelPaginacionSucursal, this.jScrollPanelDatosEdicionSucursal, this.jPanelAccionesSucursal,this.jPanelAccionesFormularioSucursal,this.jmenuBarSucursal,this.jmenuBarDetalleSucursal,this.jTtoolBarSucursal,this.jTtoolBarDetalleSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasSucursal=this.jTabbedPaneBusquedasSucursal; 
		
		final JPanel jPanelParametrosReportesSucursal=this.jPanelParametrosReportesSucursal;
		//final JScrollPane jScrollPanelDatosSucursal=this.jScrollPanelDatosSucursal;
		final JTable jTableDatosSucursal=this.jTableDatosSucursal;		
		final JPanel jPanelPaginacionSucursal=this.jPanelPaginacionSucursal;
		//final JScrollPane jScrollPanelDatosEdicionSucursal=this.jScrollPanelDatosEdicionSucursal;
		final JPanel jPanelAccionesSucursal=this.jPanelAccionesSucursal;
		
		JPanel jPanelCamposAuxiliarSucursal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSucursal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			jPanelCamposAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jPanelCamposSucursal;
			jPanelAccionesFormularioAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jPanelAccionesFormularioSucursal;
		}
		
		final JPanel jPanelCamposSucursal=jPanelCamposAuxiliarSucursal;
		final JPanel jPanelAccionesFormularioSucursal=jPanelAccionesFormularioAuxiliarSucursal;
		
		
		final JMenuBar jmenuBarSucursal=this.jmenuBarSucursal;
		final JToolBar jTtoolBarSucursal=this.jTtoolBarSucursal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSucursal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			jmenuBarDetalleAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jmenuBarDetalleSucursal;
			jTtoolBarDetalleAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jTtoolBarDetalleSucursal;
		}
		
		final JMenuBar jmenuBarDetalleSucursal=jmenuBarDetalleAuxiliarSucursal;
		final JToolBar jTtoolBarDetalleSucursal=jTtoolBarDetalleAuxiliarSucursal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSucursal;
			processRunnable.jTableDatos=jTableDatosSucursal;
			processRunnable.jPanelCampos=jPanelCamposSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSucursal;
			processRunnable.jTtoolBar=jTtoolBarSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSucursal ,jPanelParametrosReportesSucursal,jTableDatosSucursal, /*jScrollPanelDatosSucursal,*/jPanelCamposSucursal,jPanelPaginacionSucursal, /*jScrollPanelDatosEdicionSucursal,*/ jPanelAccionesSucursal,jPanelAccionesFormularioSucursal,jmenuBarSucursal,jmenuBarDetalleSucursal,jTtoolBarSucursal,jTtoolBarDetalleSucursal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSucursal ,jPanelParametrosReportesSucursal, jScrollPanelDatosSucursal,jPanelPaginacionSucursal, jScrollPanelDatosEdicionSucursal, jPanelAccionesSucursal,jPanelAccionesFormularioSucursal,jmenuBarSucursal,jmenuBarDetalleSucursal,jTtoolBarSucursal,jTtoolBarDetalleSucursal);
						
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
	
	public void finishProcessSucursal() {// throws Exception 
		this.finishProcessSucursal(true);
	}
	
	public void finishProcessSucursal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSucursal ,this.jPanelParametrosReportesSucursal, this.jScrollPanelDatosSucursal,this.jPanelPaginacionSucursal, this.jScrollPanelDatosEdicionSucursal, this.jPanelAccionesSucursal,this.jPanelAccionesFormularioSucursal,this.jmenuBarSucursal,this.jmenuBarDetalleSucursal,this.jTtoolBarSucursal,this.jTtoolBarDetalleSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasSucursal=this.jTabbedPaneBusquedasSucursal; 
		
		final JPanel jPanelParametrosReportesSucursal=this.jPanelParametrosReportesSucursal;
		//final JScrollPane jScrollPanelDatosSucursal=this.jScrollPanelDatosSucursal;
		final JTable jTableDatosSucursal=this.jTableDatosSucursal;		
		final JPanel jPanelPaginacionSucursal=this.jPanelPaginacionSucursal;
		//final JScrollPane jScrollPanelDatosEdicionSucursal=this.jScrollPanelDatosEdicionSucursal;
		final JPanel jPanelAccionesSucursal=this.jPanelAccionesSucursal;
		
		JPanel jPanelCamposAuxiliarSucursal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSucursal=new JPanel();
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			jPanelCamposAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jPanelCamposSucursal;
			jPanelAccionesFormularioAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jPanelAccionesFormularioSucursal;
		}
		
		final JPanel jPanelCamposSucursal=jPanelCamposAuxiliarSucursal;
		final JPanel jPanelAccionesFormularioSucursal=jPanelAccionesFormularioAuxiliarSucursal;
		
		
		final JMenuBar jmenuBarSucursal=this.jmenuBarSucursal;		
		final JToolBar jTtoolBarSucursal=this.jTtoolBarSucursal;
				
		JMenuBar jmenuBarDetalleAuxiliarSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSucursal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			jmenuBarDetalleAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jmenuBarDetalleSucursal;
			jTtoolBarDetalleAuxiliarSucursal=this.jInternalFrameDetalleFormSucursal.jTtoolBarDetalleSucursal;		
		}
		
		final JMenuBar jmenuBarDetalleSucursal=jmenuBarDetalleAuxiliarSucursal;
		final JToolBar jTtoolBarDetalleSucursal=jTtoolBarDetalleAuxiliarSucursal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSucursal;
			processRunnable.jTableDatos=jTableDatosSucursal;
			processRunnable.jPanelCampos=jPanelCamposSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSucursal;
			processRunnable.jTtoolBar=jTtoolBarSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSucursal ,jPanelParametrosReportesSucursal, jTableDatosSucursal,/*jScrollPanelDatosSucursal,*/jPanelCamposSucursal,jPanelPaginacionSucursal, /*jScrollPanelDatosEdicionSucursal,*/ jPanelAccionesSucursal,jPanelAccionesFormularioSucursal,jmenuBarSucursal,jmenuBarDetalleSucursal,jTtoolBarSucursal,jTtoolBarDetalleSucursal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSucursal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSucursal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSucursal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSucursal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSucursal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sucursalConstantesFunciones.getsFinalQuerySucursal();
		String  finalQueryPaginacionTodos=this.sucursalConstantesFunciones.getsFinalQuerySucursal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SucursalConstantesFunciones.getArrayColumnasGlobalesNoSucursal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sucursalsEliminados= new ArrayList<Sucursal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSucursal();
		
				///*SucursalSessionBean*/this.sucursalSessionBean=new SucursalSessionBean();
			
			if(this.sucursalSessionBean==null) {
				this.sucursalSessionBean=new SucursalSessionBean();
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
					this.iNumeroPaginacion=SucursalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SucursalConstantesFunciones.getClassesForeignKeysOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sucursal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sucursalsAux= new ArrayList<Sucursal>();
			
				
			sucursalLogic.setDatosCliente(this.datosCliente);
			sucursalLogic.setDatosDeep(this.datosDeep);
			sucursalLogic.setIsConDeep(true);
			
			
			sucursalLogic.getSucursalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					sucursalLogic.getTodosSucursals(finalQueryGlobal,pagination);
					
					//sucursalLogic.getTodosSucursalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(sucursalLogic.getSucursals()==null|| sucursalLogic.getSucursals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sucursalsAux= new ArrayList<Sucursal>();
							sucursalsAux.addAll(sucursalLogic.getSucursals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursalsAux= new ArrayList<Sucursal>();
							sucursalsAux.addAll(sucursals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sucursalLogic.getTodosSucursals(finalQueryGlobal+"",this.pagination);												
							
							//sucursalLogic.getTodosSucursalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSucursals("Todos",sucursalLogic.getSucursals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sucursalLogic.setSucursals(new ArrayList<Sucursal>());					
							sucursalLogic.getSucursals().addAll(sucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursals=new ArrayList<Sucursal>();
							sucursals.addAll(sucursalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSucursal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSucursal=this.idActual;
				
				} else if(this.idSucursalActual!=null && this.idSucursalActual!=0L) {
					idSucursal=idSucursalActual;
				}
				
					
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndicePorId(idSucursal);
				
				this.sucursals=new ArrayList<Sucursal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					sucursalLogic.getEntity(idSucursal);
					
					//sucursalLogic.getEntityWithConnection(idSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.setSucursals(new ArrayList<Sucursal>());
					sucursalLogic.getSucursals().add(sucursalLogic.getSucursal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sucursals=new ArrayList<Sucursal>();
					this.sucursals.add(sucursal);
				}
				
				if(sucursalLogic.getSucursal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sucursalLogic.getSucursalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sucursalLogic.getSucursals()==null||sucursalLogic.getSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sucursals==null|| sucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalsAux=new ArrayList<Sucursal>();
						sucursalsAux.addAll(sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursalsAux=new ArrayList<Sucursal>();
							sucursalsAux.addAll(sucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sucursalLogic.getSucursalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSucursals("FK_IdEmpresa",sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSucursals("FK_IdEmpresa",sucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalLogic.setSucursals(new ArrayList<Sucursal>());
						sucursalLogic.getSucursals().addAll(sucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursals=new ArrayList<Sucursal>();
							sucursals.addAll(sucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					sucursalLogic.getSucursalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=sucursalLogic.getSucursals()==null||sucursalLogic.getSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=sucursals==null|| sucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalsAux=new ArrayList<Sucursal>();
						sucursalsAux.addAll(sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursalsAux=new ArrayList<Sucursal>();
							sucursalsAux.addAll(sucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							sucursalLogic.getSucursalsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SucursalConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSucursals("FK_IdPais",sucursalLogic.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSucursals("FK_IdPais",sucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalLogic.setSucursals(new ArrayList<Sucursal>());
						sucursalLogic.getSucursals().addAll(sucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursals=new ArrayList<Sucursal>();
							sucursals.addAll(sucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSucursal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSucursal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sucursalLogic.getSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sucursals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sucursalLogic.getSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sucursals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Sucursal sucursal) {
		Boolean permite=true;
		
		if(this.sucursal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SucursalConstantesFunciones.getOrderByListaSucursal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SucursalConstantesFunciones.getOrderByListaSucursal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sucursal sucursal:sucursalLogic.getSucursals()) {
				if(sucursal.getsType().equals(Constantes2.S_TOTALES)) {
					sucursalTotales=sucursal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sucursal sucursal:this.sucursals) {
				if(sucursal.getsType().equals(Constantes2.S_TOTALES)) {
					sucursalTotales=sucursal;
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
			this.sucursalAux=new Sucursal();
			this.sucursalAux.setsType(Constantes2.S_TOTALES);
			this.sucursalAux.setIsNew(false);
			this.sucursalAux.setIsChanged(false);
			this.sucursalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SucursalConstantesFunciones.TotalizarValoresFilaSucursal(this.sucursalLogic.getSucursals(),this.sucursalAux);
				
				this.sucursalLogic.getSucursals().add(this.sucursalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SucursalConstantesFunciones.TotalizarValoresFilaSucursal(this.sucursals,this.sucursalAux);
				
				this.sucursals.add(this.sucursalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sucursalTotales=new Sucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sucursalLogic.getSucursals().remove(sucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sucursals.remove(sucursalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sucursalTotales=new Sucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sucursal sucursal:sucursalLogic.getSucursals()) {
				if(sucursal.getsType().equals(Constantes2.S_TOTALES)) {
					sucursalTotales=sucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SucursalConstantesFunciones.TotalizarValoresFilaSucursal(this.sucursalLogic.getSucursals(),sucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sucursal sucursal:this.sucursals) {
				if(sucursal.getsType().equals(Constantes2.S_TOTALES)) {
					sucursalTotales=sucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SucursalConstantesFunciones.TotalizarValoresFilaSucursal(this.sucursals,sucursalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSucursalsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSucursalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSucursalsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSucursalPorIdPorIdEmpresa()throws Exception {
		try {
			sAccionBusqueda="PorIdPorIdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getSucursalsFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getSucursalsFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSucursalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getSucursalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSucursalsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getSucursalsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSucursalPorIdPorIdEmpresa(Long id,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getSucursalPorIdPorIdEmpresa(id,id_empresa);
				
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
	
	public void inicializarPermisosSucursal() {
		this.isPermisoTodoSucursal=false;
		this.isPermisoNuevoSucursal=false;
		this.isPermisoActualizarSucursal=false;
		this.isPermisoActualizarOriginalSucursal=false;
		this.isPermisoEliminarSucursal=false;
		this.isPermisoGuardarCambiosSucursal=false;
		this.isPermisoConsultaSucursal=false;
		this.isPermisoBusquedaSucursal=false;
		this.isPermisoReporteSucursal=false;		
		this.isPermisoOrdenSucursal=false;		
		this.isPermisoPaginacionMedioSucursal=false;		
		this.isPermisoPaginacionAltoSucursal=false;
		this.isPermisoPaginacionTodoSucursal=false;
		this.isPermisoCopiarSucursal=false;		
		this.isPermisoVerFormSucursal=false;		
		this.isPermisoDuplicarSucursal=false;		
		this.isPermisoOrdenSucursal=false;		
	}
	
	public void setPermisosUsuarioSucursal(Boolean isPermiso) {
		this.isPermisoTodoSucursal=isPermiso;
		this.isPermisoNuevoSucursal=isPermiso;
		this.isPermisoActualizarSucursal=isPermiso;
		this.isPermisoActualizarOriginalSucursal=isPermiso;
		this.isPermisoEliminarSucursal=isPermiso;
		this.isPermisoGuardarCambiosSucursal=isPermiso;
		this.isPermisoConsultaSucursal=isPermiso;
		this.isPermisoBusquedaSucursal=isPermiso;
		this.isPermisoReporteSucursal=isPermiso;
		this.isPermisoOrdenSucursal=isPermiso;		
		this.isPermisoPaginacionMedioSucursal=isPermiso;		
		this.isPermisoPaginacionAltoSucursal=isPermiso;		
		this.isPermisoPaginacionTodoSucursal=isPermiso;		
		this.isPermisoCopiarSucursal=isPermiso;		
		this.isPermisoVerFormSucursal=isPermiso;		
		this.isPermisoDuplicarSucursal=isPermiso;
		this.isPermisoOrdenSucursal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSucursal(Boolean isPermiso) {
		//this.isPermisoTodoSucursal=isPermiso;
		this.isPermisoNuevoSucursal=isPermiso;
		this.isPermisoActualizarSucursal=isPermiso;
		this.isPermisoActualizarOriginalSucursal=isPermiso;
		this.isPermisoEliminarSucursal=isPermiso;
		this.isPermisoGuardarCambiosSucursal=isPermiso;
		//this.isPermisoConsultaSucursal=isPermiso;
		//this.isPermisoBusquedaSucursal=isPermiso;
		//this.isPermisoReporteSucursal=isPermiso;
		//this.isPermisoOrdenSucursal=isPermiso;		
		//this.isPermisoPaginacionMedioSucursal=isPermiso;		
		//this.isPermisoPaginacionAltoSucursal=isPermiso;		
		//this.isPermisoPaginacionTodoSucursal=isPermiso;		
		//this.isPermisoCopiarSucursal=isPermiso;		
		//this.isPermisoDuplicarSucursal=isPermiso;
		//this.isPermisoOrdenSucursal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSucursalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSucursal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSucursalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSucursalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSucursalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSucursalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSucursal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SucursalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSucursal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSucursal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSucursal=this.isPermisoActualizarSucursal;
			this.isPermisoEliminarSucursal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSucursal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSucursal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSucursal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSucursal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSucursal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSucursal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSucursal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSucursal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSucursal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSucursal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSucursal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSucursal.setToolTipText(this.jTableDatosSucursal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSucursal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSucursal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSucursal() throws Exception {
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
	public void inicializarCombosForeignKeySucursalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySucursalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SucursalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySucursalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeySucursalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SucursalParameterReturnGeneral sucursalReturnGeneral=new SucursalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.sucursalConstantesFunciones.cargarid_empresaSucursal)
					 || (this.esRecargarFks && this.sucursalConstantesFunciones.cargarid_empresaSucursal)) {

					if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+sucursalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.sucursalConstantesFunciones.cargarid_paisSucursal)
					 || (this.esRecargarFks && this.sucursalConstantesFunciones.cargarid_paisSucursal)) {

					if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+sucursalSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.sucursalConstantesFunciones.cargarid_ciudadSucursal)
					 || (this.esRecargarFks && this.sucursalConstantesFunciones.cargarid_ciudadSucursal)) {

					if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+sucursalSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				sucursalReturnGeneral=sucursalLogic.cargarCombosLoteForeignKeySucursal(finalQueryGlobalEmpresa,finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=sucursalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=sucursalReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=sucursalReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySucursal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.sucursalSessionBean==null) {
				this.sucursalSessionBean=new SucursalSessionBean();
			}

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

			if(!this.sucursalSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
	
	public void initActionsCombosTodosForeignKeySucursal()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySucursal(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormSucursal!=null) {
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.addItemListener(new ComboBoxItemListener(this,"id_paisSucursal"));
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.addFocusListener(new ComboBoxFocusListener(this,"id_paisSucursal"));
					}
				} else {
					if(this.jInternalFrameDetalleFormSucursal!=null) {
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.addActionListener(new ComboBoxActionListener(this,"id_paisSucursal"));
						this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.addFocusListener(new ComboBoxFocusListener(this,"id_paisSucursal"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisSucursal.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisSucursal"));

						this.jComboBoxid_paisFK_IdPaisSucursal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisSucursal"));

					} else {
						this.jComboBoxid_paisFK_IdPaisSucursal.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisSucursal"));

						this.jComboBoxid_paisFK_IdPaisSucursal.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisSucursal"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeySucursal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySucursal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySucursal(Sucursal sucursal)throws Exception {	
		try {
			
			this.setActualEmpresaForeignKey(sucursal.getid_empresa(),false,"Formulario");
			this.setActualPaisForeignKey(sucursal.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(sucursal.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySucursal(Sucursal sucursal,String sTipoEvento)throws Exception {	
		try {
			
			

				if(sucursal.getCiudad()!=null && !sTipoEvento.equals("id_ciudadSucursal")) { //sTipoEvento Evita Bucle Infinito

					this.ciudadsForeignKey=new ArrayList<Ciudad>();
					this.ciudadsForeignKey.add(sucursal.getCiudad());

					this.addItemDefectoCombosForeignKeyCiudad();
					this.cargarCombosFrameCiudadsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySucursal()throws Exception {	
		try {
			
			this.setActualEmpresaForeignKey(this.sucursalConstantesFunciones.getid_empresa(),false,"Formulario");
			this.setActualPaisForeignKey(this.sucursalConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.sucursalConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySucursal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSucursal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySucursal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySucursal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySucursal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal!=null && this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal!=null && this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal!=null && this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormSucursalPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormSucursalid_ciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormSucursalid_ciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.sucursal,jComboBoxGenericoCiudad);
			}

			if(this.sucursal.getid_pais()!=null && this.sucursal.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.sucursal.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.sucursal.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public SucursalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SucursalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SucursalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sucursalSessionBean=new SucursalSessionBean(); 
		this.sucursalConstantesFunciones=new SucursalConstantesFunciones(); 
		this.sucursalBean=new Sucursal();//(this.sucursalConstantesFunciones); 		
		this.sucursalReturnGeneral=new SucursalParameterReturnGeneral(); 
		
		this.sucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSucursal(true);
			
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
			
			this.sucursalConstantesFunciones=new SucursalConstantesFunciones(); 
			this.sucursalBean=new Sucursal();//this.sucursalConstantesFunciones); 			
			this.sucursalReturnGeneral=new SucursalParameterReturnGeneral(); 
		
			SucursalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sucursal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sucursal=new Sucursal();
			this.sucursals = new ArrayList<Sucursal>();
			this.sucursalsAux = new ArrayList<Sucursal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic=new SucursalLogic();
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.sucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSucursal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSucursal);	
					}
					
					if(this.jInternalFrameImportacionSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSucursal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySucursal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSucursal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSucursal);
				this.jInternalFrameDetalleFormSucursal.setVisible(false);
				this.jInternalFrameDetalleFormSucursal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSucursal);
					this.jInternalFrameReporteDinamicoSucursal.setVisible(false);
					this.jInternalFrameReporteDinamicoSucursal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSucursal);
					this.jInternalFrameImportacionSucursal.setVisible(false);
					this.jInternalFrameImportacionSucursal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySucursal);
					this.jInternalFrameOrderBySucursal.setVisible(false);
					this.jInternalFrameOrderBySucursal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSucursalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SucursalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sucursalReturnGeneral=new SucursalParameterReturnGeneral();
			
			this.sucursalParameterGeneral=new SucursalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sucursalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sucursalSessionBean.getEsGuardarRelacionado(),this.sucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sucursalSessionBean.getEsGuardarRelacionado(),this.sucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaDuplicarSucursal=true;
			this.isVisibilidadCeldaCopiarSucursal=true;
			this.isVisibilidadCeldaVerFormSucursal=true;
			this.isVisibilidadCeldaOrdenSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=false;
			this.isVisibilidadCeldaGuardarSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSucursal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSucursal(false);
			
			this.setPermisosUsuarioSucursal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sucursalSessionBean.getEsGuardarRelacionado() 
				|| (this.sucursalSessionBean.getEsGuardarRelacionado() && this.sucursalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSucursalClasesRelacionadas();
			}
			
			if(this.sucursalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSucursalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSucursal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSucursal();
			}
			
			if(!this.isPermisoBusquedaSucursal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSucursal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSucursal,this.isPermisoPaginacionMedioSucursal,this.isPermisoPaginacionTodoSucursal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SucursalConstantesFunciones.getTiposSeleccionarSucursal());
				
				this.tiposColumnasSelect=SucursalConstantesFunciones.getTiposSeleccionarSucursal(true);
				
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
			//if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSucursal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSucursal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSucursal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSucursal() ;
			
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
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				sucursalImplementable= (SucursalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sucursalImplementableHome= (SucursalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sucursals= new ArrayList<Sucursal>();
			this.sucursalsEliminados= new ArrayList<Sucursal>();
						
			this.isEsNuevoSucursal=false;
			this.esParaAccionDesdeFormularioSucursal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCiudadActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySucursal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSucursal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SucursalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SucursalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSucursal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSucursal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSucursal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSucursal();
			}
			
			SucursalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSucursal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSucursal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSucursal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSucursal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Sucursal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSucursal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSucursal")) {
				iIndex=this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSucursal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSucursal();	
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
	
	public void cargarCombosForeignKeySucursal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySucursal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySucursal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySucursalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySucursal();
		
		this.cargarCombosFrameForeignKeySucursal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySucursal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySucursal();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpresa(this.empresasForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sucursalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			
			if(jTableDatosSucursal.getRowCount()>=1) {
				jTableDatosSucursal.removeRowSelectionInterval(0, jTableDatosSucursal.getRowCount()-1);						
			}
			
			this.isEsNuevoSucursal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSucursal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSucursal(true);			
			//this.sucursal=new Sucursal();
			//this.sucursal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSucursal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSucursal() ;
			
			if(SucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSucursal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sucursal);	
			this.actualizarInformacion("INFO_PADRE",false,this.sucursal);				
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			if(this.sucursalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Sucursal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSucursal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSucursal.getSelectedRows().length;			
			}
			
			sucursalsSeleccionados=this.getSucursalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSucursal--;			
				//Sucursal sucursalAux= new Sucursal();			
				//sucursalAux.setId(this.iIdNuevoSucursal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Sucursal sucursalOrigen=new Sucursal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Sucursal sucursalOrigen : sucursalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sucursalOrigen =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sucursalOrigen =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSucursal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sucursal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSucursal(sucursalOrigen,this.sucursal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sucursalLogic.getSucursals().add(this.sucursalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sucursals.add(this.sucursalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSucursal(false);
				
				this.jTableDatosSucursal.setRowSelectionInterval(this.getIndiceNuevoSucursal(), this.getIndiceNuevoSucursal());
				
				int iLastRow =  this.jTableDatosSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSucursal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();									
		
			Sucursal sucursalOrigen=new Sucursal();
			Sucursal sucursalDestino=new Sucursal();
				
			sucursalsSeleccionados=this.getSucursalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSucursal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sucursalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSucursal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalOrigen =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sucursalOrigen =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sucursalDestino =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sucursalDestino =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sucursalOrigen =sucursalsSeleccionados.get(0);
				sucursalDestino =sucursalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSucursal(sucursalOrigen,sucursalDestino,true,false);
				
				sucursalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sucursalDestino,sucursalLogic.getSucursals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sucursalDestino,sucursals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSucursal(false);
				
				//this.jTableDatosSucursal.setRowSelectionInterval(this.getIndiceNuevoSucursal(), this.getIndiceNuevoSucursal());
				
				int iLastRow =  this.jTableDatosSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSucursal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSucursal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSucursal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSucursal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSucursal.setVisible(!isVisible);
			this.jPanelPaginacionSucursal.setVisible(!isVisible);
			this.jPanelAccionesSucursal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSucursal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySucursal();
			
			this.abrirFrameOrderBySucursal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSucursal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSucursal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSucursal.isMaximum()) {
					this.jInternalFrameDetalleFormSucursal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSucursal.setSize(this.jInternalFrameDetalleFormSucursal.iWidthFormulario,this.jInternalFrameDetalleFormSucursal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSucursal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSucursal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSucursal.isMaximum()) {
						this.jInternalFrameDetalleFormSucursal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSucursal.jContentPaneDetalleSucursal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSucursal.jContentPaneDetalleSucursal.getWidth(),SucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSucursal.jContentPaneDetalleSucursal.getWidth(),SucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSucursal.jContentPaneDetalleSucursal.getWidth(),SucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSucursal.setVisible(true);
	        this.jInternalFrameDetalleFormSucursal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySucursal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySucursal,false,this);
				} else {
					this.jInternalFrameOrderBySucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySucursal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySucursal);
				this.jInternalFrameOrderBySucursal.setVisible(false);
				this.jInternalFrameOrderBySucursal.setSelected(false);
				
				this.jInternalFrameOrderBySucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySucursal"));
				
				this.inicializarActualizarBindingTablaOrderBySucursal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSucursal==null) {
				
				this.jInternalFrameImportacionSucursal=new ImportacionJInternalFrame(SucursalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSucursal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSucursal);
				this.jInternalFrameImportacionSucursal.setVisible(false);
				this.jInternalFrameImportacionSucursal.setSelected(false);


				this.jInternalFrameImportacionSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSucursal"));
				this.jInternalFrameImportacionSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSucursal"));
				this.jInternalFrameImportacionSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSucursal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSucursal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSucursal==null) {
				this.jInternalFrameReporteDinamicoSucursal=new ReporteDinamicoJInternalFrame(SucursalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSucursal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSucursal);
				this.jInternalFrameReporteDinamicoSucursal.setVisible(false);
				this.jInternalFrameReporteDinamicoSucursal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSucursal"));
				this.jInternalFrameReporteDinamicoSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSucursal"));
				this.jInternalFrameReporteDinamicoSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSucursal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSucursal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleSucursal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSucursal);
			
	       	this.jInternalFrameDetalleFormSucursal.setVisible(false);
	        this.jInternalFrameDetalleFormSucursal.setSelected(false);
			
			//this.jInternalFrameDetalleFormSucursal.dispose();
			//this.jInternalFrameDetalleFormSucursal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSucursal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSucursal.setVisible(true);
	        this.jInternalFrameReporteDinamicoSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSucursal.setVisible(true);
	        this.jInternalFrameImportacionSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySucursal.setVisible(true);
	        this.jInternalFrameOrderBySucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySucursal.setVisible(false);
	        this.jInternalFrameOrderBySucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSucursal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSucursal.setVisible(false);
	        this.jInternalFrameReporteDinamicoSucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSucursal.setVisible(false);
	        this.jInternalFrameImportacionSucursal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSucursal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSucursal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSucursal(true);
			//this.isEsNuevoSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSucursal(false) ;
			
			if(sucursalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSucursal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSucursalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSucursal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSucursal(true);
			//this.isEsNuevoSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sucursal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSucursal(false) ;
			
			if(SucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSucursal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Ciudad")) {
				if(!this.sucursalConstantesFunciones.cargarid_ciudadSucursal) {
					this.cargarCombosCiudadsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingSucursal(false,false);
					this.cargarCombosFrameCiudadsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_ciudad (id);

				this.recargarComboTablaCiudad(this.ciudadsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaEmpresa(List<Empresa> empresasForeignKey)throws Exception{
		TableColumn tableColumnEmpresa=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDEMPRESA));
		TableCellEditor tableCellEditorEmpresa =tableColumnEmpresa.getCellEditor();

		EmpresaTableCell empresaTableCellFk=(EmpresaTableCell)tableCellEditorEmpresa;

		if(empresaTableCellFk!=null) {
			empresaTableCellFk.setempresasForeignKey(empresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSucursal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empresaTableCellFk.setRowActual(intSelectedRow);
			//empresaTableCellFk.setempresasForeignKeyActual(empresasForeignKey);
		//}


		if(empresaTableCellFk!=null) {
			empresaTableCellFk.RecargarEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSucursal.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSucursal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_ciudad (Long id) throws Exception {
		this.setActualCiudadForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSucursal(false);
			
			//if(!this.isEsNuevoSucursal) {								
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				
			}
			
			if(this.permiteMantenimiento(this.sucursal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSucursal=true;
					this.inicializarActualizarBindingTablaSucursal(false);
					this.isEsNuevoSucursal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSucursal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSucursal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSucursal(false);
				
				this.habilitarDeshabilitarControlesSucursal(false);
			
												
				
				if(SucursalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSucursal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSucursalActionPerformed(evt,sucursalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSucursal(this.sucursal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSucursal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sucursalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sucursal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				this.sucursal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				this.sucursal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sucursal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SucursalModel) this.jTableDatosSucursal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSucursal=true;
				this.inicializarActualizarBindingTablaSucursal(false);
				this.isEsNuevoSucursal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSucursal(false);
				
				this.habilitarDeshabilitarControlesSucursal(false);
				
				
				
				if(SucursalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSucursal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSucursalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSucursal.getRowCount()>=1) {
				jTableDatosSucursal.removeRowSelectionInterval(0, jTableDatosSucursal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSucursal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSucursal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSucursal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSucursal(false) ;
			
			this.isEsNuevoSucursal=false;
			
			if(SucursalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSucursal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSucursal(false);
				
				//SI ES MANUAL
				if(SucursalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSucursal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSucursal--;			
			//Sucursal sucursalAux= new Sucursal();			
			//sucursalAux.setId(this.iIdNuevoSucursal);
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSucursal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
			
			this.sucursal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sucursalLogic.getSucursals().add(this.sucursalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sucursals.add(this.sucursalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSucursal(false);
			
			this.jTableDatosSucursal.setRowSelectionInterval(this.getIndiceNuevoSucursal(), this.getIndiceNuevoSucursal());
			
			int iLastRow =  this.jTableDatosSucursal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSucursal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSucursal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSucursal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSucursal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSucursal(false);
			
			//SI ES MANUAL
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSucursal();
			}
			
			//this.abrirFrameTreeSucursal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SucursalES ?", "MANTENIMIENTO DE Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSucursal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSucursal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.sucursalReturnGeneral=sucursalLogic.procesarImportacionSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.sucursalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSucursalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSucursal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSucursal.setFileImportacion(this.jInternalFrameImportacionSucursal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSucursal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSucursal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSucursal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSucursal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		

		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SucursalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SucursalBaseDesign.jrxml";
			
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
			
			this.generarReporteSucursals("Todos",sucursalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SucursalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_FAX:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_x_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_x_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_x_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_x_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_MAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_il_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_il_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_il_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_il_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_RESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SucursalConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoSucursal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SucursalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SucursalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case SucursalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case SucursalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SucursalConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case SucursalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case SucursalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case SucursalConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case SucursalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case SucursalConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoria="fax";
					break;

				case SucursalConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoria="mail";
					break;

				case SucursalConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoria="responsable";
					break;

				case SucursalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SucursalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SucursalConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case SucursalConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case SucursalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SucursalConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case SucursalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case SucursalConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case SucursalConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case SucursalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case SucursalConstantesFunciones.LABEL_FAX:
					sNombreCampoCategoriaValor="fax";
					break;

				case SucursalConstantesFunciones.LABEL_MAIL:
					sNombreCampoCategoriaValor="mail";
					break;

				case SucursalConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoriaValor="responsable";
					break;

				case SucursalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSucursal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSucursal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SucursalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SucursalConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case SucursalConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case SucursalConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SucursalConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case SucursalConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case SucursalConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case SucursalConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case SucursalConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case SucursalConstantesFunciones.LABEL_FAX:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fax",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fax");
					break;

				case SucursalConstantesFunciones.LABEL_MAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"mail");
					break;

				case SucursalConstantesFunciones.LABEL_RESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"responsable");
					break;

				case SucursalConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoSucursalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Sucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SucursalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_RUC);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_FAX:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_FAX);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getfax());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_MAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_MAIL);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getmail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_RESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_RESPONSABLE);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getresponsable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SucursalConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SucursalConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Sucursal sucursal:sucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sucursal.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelSucursal(row);				
			//	iRow++;
			//}				
			
			//for(Sucursal sucursalAux:sucursalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSucursal(sucursalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
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
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSucursal(false);
			
			//SI ES MANUAL
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSucursal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSucursal(false);
			
			//SI ES MANUAL
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSucursal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSucursal(false);
			
			//SI ES MANUAL
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSucursal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSucursal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSucursal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSucursal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSucursal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSucursal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSucursal.setMinimumSize(dimensionMinimum);
		this.jTableDatosSucursal.setMaximumSize(dimensionMaximum);
		this.jTableDatosSucursal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSucursal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSucursal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSucursal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSucursal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSucursal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSucursal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSucursal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSucursal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SucursalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SucursalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSucursal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSucursal();
		
		this.inicializarActualizarBindingBotonesManualSucursal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSucursal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSucursal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSucursal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSucursal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSucursal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSucursal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSucursal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSucursal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionNuevoSucursal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionSinCerrarSucursal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionSinMensajeSucursal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSucursal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSucursal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSucursal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSucursal!=null) {
				this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionNuevoSucursal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionSinCerrarSucursal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSucursal.jCheckBoxPostAccionSinMensajeSucursal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSucursal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSucursal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSucursal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSucursal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSucursal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSucursal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSucursal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSucursal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSucursal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSucursal(Boolean esInicializar) throws Exception {
		try	{	
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSucursal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSucursal() throws Exception {
		try	{
			if(SucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSucursal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSucursal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSucursal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSucursal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSucursal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSucursal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSucursal.addItem(reporte);
			}
			
			
			if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSucursal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSucursal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSucursal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSucursal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSucursal!=null) {
				this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSucursal!=null) {
				this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSucursal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSucursal!=null) {
				
				if(this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSucursal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSucursal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSucursal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSucursal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSucursal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empresaFK_IdEmpresaSucursal.getSelectedItem()!=null){this.id_empresaFK_IdEmpresa=((Empresa)this.jComboBoxid_empresaFK_IdEmpresaSucursal.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisSucursal.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisSucursal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSucursal(Boolean esInicializar) throws Exception {				
		if(SucursalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSucursal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSucursal() throws Exception {
		this.inicializarActualizarBindingTablaSucursal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySucursal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSucursalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSucursal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sucursalLogic.getSucursals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sucursals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSucursal.setModel(new SucursalModel(this.sucursalLogic.getSucursals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSucursal.setModel(new SucursalModel(this.sucursals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySucursal!=null && this.jInternalFrameOrderBySucursal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySucursal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SucursalConstantesFunciones.SCLASSWEBTITULO,sucursalConstantesFunciones.resaltarSeleccionarSucursal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SucursalConstantesFunciones.SCLASSWEBTITULO,sucursalConstantesFunciones.resaltarSeleccionarSucursal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_ID));

		if(this.sucursalConstantesFunciones.mostraridSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sucursalConstantesFunciones.resaltaridSucursal,this.sucursalConstantesFunciones.activaridSucursal,this,true,"idSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltaridSucursal,this.sucursalConstantesFunciones.activaridSucursal,this,true,"idSucursal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.sucursalConstantesFunciones.mostrarid_empresaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.sucursalConstantesFunciones.resaltarid_empresaSucursal,this,this.sucursalConstantesFunciones.activarid_empresaSucursal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.sucursalConstantesFunciones.resaltarid_empresaSucursal,this,this.sucursalConstantesFunciones.activarid_empresaSucursal,true,"id_empresaSucursal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDPAIS));

		if(this.sucursalConstantesFunciones.mostrarid_paisSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.sucursalConstantesFunciones.resaltarid_paisSucursal,this,this.sucursalConstantesFunciones.activarid_paisSucursal));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.sucursalConstantesFunciones.resaltarid_paisSucursal,this,this.sucursalConstantesFunciones.activarid_paisSucursal,true,"id_paisSucursal","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_IDCIUDAD));

		if(this.sucursalConstantesFunciones.mostrarid_ciudadSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.sucursalConstantesFunciones.resaltarid_ciudadSucursal,this,this.sucursalConstantesFunciones.activarid_ciudadSucursal));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.sucursalConstantesFunciones.resaltarid_ciudadSucursal,this,this.sucursalConstantesFunciones.activarid_ciudadSucursal,true,"id_ciudadSucursal","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_CODIGO));

		if(this.sucursalConstantesFunciones.mostrarcodigoSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarcodigoSucursal,this.sucursalConstantesFunciones.activarcodigoSucursal,this,true,"codigoSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarcodigoSucursal,this.sucursalConstantesFunciones.activarcodigoSucursal,this,true,"codigoSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_NUMERO));

		if(this.sucursalConstantesFunciones.mostrarnumeroSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarnumeroSucursal,this.sucursalConstantesFunciones.activarnumeroSucursal,this,true,"numeroSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarnumeroSucursal,this.sucursalConstantesFunciones.activarnumeroSucursal,this,true,"numeroSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_NOMBRE));

		if(this.sucursalConstantesFunciones.mostrarnombreSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarnombreSucursal,this.sucursalConstantesFunciones.activarnombreSucursal,this,true,"nombreSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarnombreSucursal,this.sucursalConstantesFunciones.activarnombreSucursal,this,true,"nombreSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_DIRECCION));

		if(this.sucursalConstantesFunciones.mostrardireccionSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltardireccionSucursal,this.sucursalConstantesFunciones.activardireccionSucursal,this,true,"direccionSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltardireccionSucursal,this.sucursalConstantesFunciones.activardireccionSucursal,this,true,"direccionSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_RUC));

		if(this.sucursalConstantesFunciones.mostrarrucSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarrucSucursal,this.sucursalConstantesFunciones.activarrucSucursal,this,true,"rucSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarrucSucursal,this.sucursalConstantesFunciones.activarrucSucursal,this,true,"rucSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_TELEFONO));

		if(this.sucursalConstantesFunciones.mostrartelefonoSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltartelefonoSucursal,this.sucursalConstantesFunciones.activartelefonoSucursal,this,true,"telefonoSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltartelefonoSucursal,this.sucursalConstantesFunciones.activartelefonoSucursal,this,true,"telefonoSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_FAX));

		if(this.sucursalConstantesFunciones.mostrarfaxSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_FAX,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarfaxSucursal,this.sucursalConstantesFunciones.activarfaxSucursal,this,true,"faxSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarfaxSucursal,this.sucursalConstantesFunciones.activarfaxSucursal,this,true,"faxSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_MAIL));

		if(this.sucursalConstantesFunciones.mostrarmailSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_MAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarmailSucursal,this.sucursalConstantesFunciones.activarmailSucursal,this,true,"mailSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarmailSucursal,this.sucursalConstantesFunciones.activarmailSucursal,this,true,"mailSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_RESPONSABLE));

		if(this.sucursalConstantesFunciones.mostrarresponsableSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_RESPONSABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltarresponsableSucursal,this.sucursalConstantesFunciones.activarresponsableSucursal,this,true,"responsableSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltarresponsableSucursal,this.sucursalConstantesFunciones.activarresponsableSucursal,this,true,"responsableSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSucursal,SucursalConstantesFunciones.LABEL_DESCRIPCION));

		if(this.sucursalConstantesFunciones.mostrardescripcionSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SucursalConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sucursalConstantesFunciones.resaltardescripcionSucursal,this.sucursalConstantesFunciones.activardescripcionSucursal,this,true,"descripcionSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sucursalConstantesFunciones.resaltardescripcionSucursal,this.sucursalConstantesFunciones.activardescripcionSucursal,this,true,"descripcionSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sucursalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sucursalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSucursal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sucursalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSucursal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSucursal && this.isPermisoGuardarCambiosSucursal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sucursalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sucursalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSucursal.addColumn(tableColumn);
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
			
			this.jTableDatosSucursal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSucursal && this.isPermisoGuardarCambiosSucursal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSucursal && this.isPermisoGuardarCambiosSucursal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSucursal.moveColumn(this.jTableDatosSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSucursal.moveColumn(this.jTableDatosSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSucursal.moveColumn(this.jTableDatosSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSucursal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSucursal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSucursal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSucursal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSucursal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSucursal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSucursal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSucursal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=sucursalLogic.getSucursals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sucursals.size()-1;
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
		//this.jTableDatosSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSucursal();
			
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
				
				//this.isEsNuevoSucursal=false;
					
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSucursal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSucursal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sucursal.getsType().equals("DUPLICADO")
				   || this.sucursal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSucursal=true;
				
				} else {
					this.isEsNuevoSucursal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sucursalSessionBean.getEsGuardarRelacionado()) {
					if(this.sucursal.getId()>=0 && !this.sucursal.getIsNew()) {						
						this.isEsNuevoSucursal=false;
						
					} else {
						this.isEsNuevoSucursal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSucursal(esRelaciones);						
				
				this.seleccionarSucursal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sucursal.getId()<0) {
					this.isEsNuevoSucursal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSucursal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSucursal(evt,rowIndex);
				}	
				
				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Sucursal: " + this.dDif); 
					}
				}								
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSucursal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sucursal)) {
					if(this.sucursal.getId()>0) {
						this.sucursal.setIsDeleted(true);
						
						this.sucursalsEliminados.add(this.sucursal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sucursalLogic.getSucursals().remove(this.sucursal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sucursals.remove(this.sucursal);				
					}
					
					
					((SucursalModel) this.jTableDatosSucursal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSucursal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSucursal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSucursal) {
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSucursal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSucursal(this.sucursal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.sucursalConstantesFunciones.cargarid_empresaSucursal || this.sucursalConstantesFunciones.event_dependid_empresaSucursal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.sucursal.getid_empresa());
									//this.inicializarActualizarBindingSucursal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(sucursal.getEmpresa()!=null) {
							this.empresasForeignKey.add(sucursal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.sucursal.getid_empresa(),false,"Formulario");

					//Pais
					if(!this.sucursalConstantesFunciones.cargarid_paisSucursal || this.sucursalConstantesFunciones.event_dependid_paisSucursal) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.sucursal.getid_pais());
									//this.inicializarActualizarBindingSucursal(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(sucursal.getPais()!=null) {
							this.paissForeignKey.add(sucursal.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.sucursal.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.sucursalConstantesFunciones.cargarid_ciudadSucursal || this.sucursalConstantesFunciones.event_dependid_ciudadSucursal) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.sucursal.getid_ciudad());
									//this.inicializarActualizarBindingSucursal(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(sucursal.getCiudad()!=null) {
							this.ciudadsForeignKey.add(sucursal.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.sucursal.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSucursal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSucursal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSucursal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSucursal(Sucursal sucursal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSucursal(sucursal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSucursal(Sucursal sucursal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSucursal(sucursal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySucursal(sucursal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySucursal(sucursal);
	}
	
	public void setVariablesObjetoActualToFormularioSucursal(Sucursal sucursal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setText(sucursal.getId().toString());
			this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setText(sucursal.getcodigo());
			this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setText(sucursal.getnumero());
			this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setText(sucursal.getnombre());
			this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setText(sucursal.getdireccion());
			this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setText(sucursal.getruc());
			this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setText(sucursal.gettelefono());
			this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setText(sucursal.getfax());
			this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setText(sucursal.getmail());
			this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setText(sucursal.getresponsable());
			this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setText(sucursal.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Sucursal sucursalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sucursalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sucursal sucursalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sucursalLocal=this.sucursal;
			} else {
				sucursalLocal=this.sucursalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sucursalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSucursal(sucursalLocal,true);
					
					if(sucursalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sucursalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sucursalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSucursal(Sucursal sucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSucursal(sucursal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSucursal(sucursal);
	}
	
	public void setVariablesFormularioToObjetoActualSucursal(Sucursal sucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSucursal(sucursal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSucursal(Sucursal sucursal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.getText()==null || this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.getText()=="" || this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.getText()=="Id") {
				this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setText("0");
			}

			if(conColumnasBase) {sucursal.setId(Long.parseLong(this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelIdSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setcodigo(this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelcodigoSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setnumero(this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelnumeroSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setnombre(this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelnombreSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setdireccion(this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeldireccionSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setruc(this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelrucSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.settelefono(this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeltelefonoSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setfax(this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_FAX+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelfaxSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setmail(this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_MAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelmailSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setresponsable(this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_RESPONSABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabelresponsableSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sucursal.setdescripcion(this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SucursalConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSucursal.jLabeldescripcionSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSucursal(Sucursal sucursalBean,Sucursal sucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && sucursalBean.getid_empresa()!=null && !sucursalBean.getid_empresa().equals(-1L))) {sucursal.setid_empresa(sucursalBean.getid_empresa());}
			if(conDefault || (!conDefault && sucursalBean.getid_pais()!=null && !sucursalBean.getid_pais().equals(-1L))) {sucursal.setid_pais(sucursalBean.getid_pais());}
			if(conDefault || (!conDefault && sucursalBean.getid_ciudad()!=null && !sucursalBean.getid_ciudad().equals(-1L))) {sucursal.setid_ciudad(sucursalBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSucursal(Sucursal sucursalOrigen,Sucursal sucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sucursalOrigen.getId()!=null && !sucursalOrigen.getId().equals(0L))) {sucursal.setId(sucursalOrigen.getId());}}
			if(conDefault || (!conDefault && sucursalOrigen.getid_empresa()!=null && !sucursalOrigen.getid_empresa().equals(-1L))) {sucursal.setid_empresa(sucursalOrigen.getid_empresa());}
			if(conDefault || (!conDefault && sucursalOrigen.getid_pais()!=null && !sucursalOrigen.getid_pais().equals(-1L))) {sucursal.setid_pais(sucursalOrigen.getid_pais());}
			if(conDefault || (!conDefault && sucursalOrigen.getid_ciudad()!=null && !sucursalOrigen.getid_ciudad().equals(-1L))) {sucursal.setid_ciudad(sucursalOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && sucursalOrigen.getcodigo()!=null && !sucursalOrigen.getcodigo().equals(""))) {sucursal.setcodigo(sucursalOrigen.getcodigo());}
			if(conDefault || (!conDefault && sucursalOrigen.getnumero()!=null && !sucursalOrigen.getnumero().equals(""))) {sucursal.setnumero(sucursalOrigen.getnumero());}
			if(conDefault || (!conDefault && sucursalOrigen.getnombre()!=null && !sucursalOrigen.getnombre().equals(""))) {sucursal.setnombre(sucursalOrigen.getnombre());}
			if(conDefault || (!conDefault && sucursalOrigen.getdireccion()!=null && !sucursalOrigen.getdireccion().equals(""))) {sucursal.setdireccion(sucursalOrigen.getdireccion());}
			if(conDefault || (!conDefault && sucursalOrigen.getruc()!=null && !sucursalOrigen.getruc().equals(""))) {sucursal.setruc(sucursalOrigen.getruc());}
			if(conDefault || (!conDefault && sucursalOrigen.gettelefono()!=null && !sucursalOrigen.gettelefono().equals(""))) {sucursal.settelefono(sucursalOrigen.gettelefono());}
			if(conDefault || (!conDefault && sucursalOrigen.getfax()!=null && !sucursalOrigen.getfax().equals(""))) {sucursal.setfax(sucursalOrigen.getfax());}
			if(conDefault || (!conDefault && sucursalOrigen.getmail()!=null && !sucursalOrigen.getmail().equals(""))) {sucursal.setmail(sucursalOrigen.getmail());}
			if(conDefault || (!conDefault && sucursalOrigen.getresponsable()!=null && !sucursalOrigen.getresponsable().equals(""))) {sucursal.setresponsable(sucursalOrigen.getresponsable());}
			if(conDefault || (!conDefault && sucursalOrigen.getdescripcion()!=null && !sucursalOrigen.getdescripcion().equals(""))) {sucursal.setdescripcion(sucursalOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSucursal(Sucursal sucursal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setText(sucursal.getId().toString());
			this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setText(sucursal.getcodigo());
			this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setText(sucursal.getnumero());
			this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setText(sucursal.getnombre());
			this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setText(sucursal.getdireccion());
			this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setText(sucursal.getruc());
			this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setText(sucursal.gettelefono());
			this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setText(sucursal.getfax());
			this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setText(sucursal.getmail());
			this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setText(sucursal.getresponsable());
			this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setText(sucursal.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSucursal(SucursalBean sucursalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setText(sucursalBean.getId().toString());
			this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setText(sucursalBean.getcodigo());
			this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setText(sucursalBean.getnumero());
			this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setText(sucursalBean.getnombre());
			this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setText(sucursalBean.getdireccion());
			this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setText(sucursalBean.getruc());
			this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setText(sucursalBean.gettelefono());
			this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setText(sucursalBean.getfax());
			this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setText(sucursalBean.getmail());
			this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setText(sucursalBean.getresponsable());
			this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setText(sucursalBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSucursal(SucursalParameterReturnGeneral sucursalReturnGeneral,SucursalBean sucursalBean,Boolean conDefault) throws Exception { 
		try {
			Sucursal sucursalLocal=new Sucursal();
			
			sucursalLocal=sucursalReturnGeneral.getSucursal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sucursalLocal.getId()!=null && !sucursalLocal.getId().equals(0L))) {sucursalBean.setId(sucursalLocal.getId());}}
			if(conDefault || (!conDefault && sucursalLocal.getid_empresa()!=null && !sucursalLocal.getid_empresa().equals(-1L))) {sucursalBean.setid_empresa(sucursalLocal.getid_empresa());}
			if(conDefault || (!conDefault && sucursalLocal.getid_pais()!=null && !sucursalLocal.getid_pais().equals(-1L))) {sucursalBean.setid_pais(sucursalLocal.getid_pais());}
			if(conDefault || (!conDefault && sucursalLocal.getid_ciudad()!=null && !sucursalLocal.getid_ciudad().equals(-1L))) {sucursalBean.setid_ciudad(sucursalLocal.getid_ciudad());}
			if(conDefault || (!conDefault && sucursalLocal.getcodigo()!=null && !sucursalLocal.getcodigo().equals(""))) {sucursalBean.setcodigo(sucursalLocal.getcodigo());}
			if(conDefault || (!conDefault && sucursalLocal.getnumero()!=null && !sucursalLocal.getnumero().equals(""))) {sucursalBean.setnumero(sucursalLocal.getnumero());}
			if(conDefault || (!conDefault && sucursalLocal.getnombre()!=null && !sucursalLocal.getnombre().equals(""))) {sucursalBean.setnombre(sucursalLocal.getnombre());}
			if(conDefault || (!conDefault && sucursalLocal.getdireccion()!=null && !sucursalLocal.getdireccion().equals(""))) {sucursalBean.setdireccion(sucursalLocal.getdireccion());}
			if(conDefault || (!conDefault && sucursalLocal.getruc()!=null && !sucursalLocal.getruc().equals(""))) {sucursalBean.setruc(sucursalLocal.getruc());}
			if(conDefault || (!conDefault && sucursalLocal.gettelefono()!=null && !sucursalLocal.gettelefono().equals(""))) {sucursalBean.settelefono(sucursalLocal.gettelefono());}
			if(conDefault || (!conDefault && sucursalLocal.getfax()!=null && !sucursalLocal.getfax().equals(""))) {sucursalBean.setfax(sucursalLocal.getfax());}
			if(conDefault || (!conDefault && sucursalLocal.getmail()!=null && !sucursalLocal.getmail().equals(""))) {sucursalBean.setmail(sucursalLocal.getmail());}
			if(conDefault || (!conDefault && sucursalLocal.getresponsable()!=null && !sucursalLocal.getresponsable().equals(""))) {sucursalBean.setresponsable(sucursalLocal.getresponsable());}
			if(conDefault || (!conDefault && sucursalLocal.getdescripcion()!=null && !sucursalLocal.getdescripcion().equals(""))) {sucursalBean.setdescripcion(sucursalLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSucursalGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxSucursal,List<Sucursal> sucursalsLocal)throws Exception {
		try {
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsLocal) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			jComboBoxSucursal.setSelectedItem(sucursalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSucursalGenerico(JComboBox jComboBoxSucursal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSucursal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSucursal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sucursal=(Sucursal) sucursalLogic.getSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sucursal =(Sucursal) sucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!sucursal.getIsNew() && !sucursal.getIsChanged() && !sucursal.getIsDeleted()) {
				sDescripcion=sucursal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=sucursal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!sucursal.getIsNew() && !sucursal.getIsChanged() && !sucursal.getIsDeleted()) {
				sDescripcion=sucursal.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=sucursal.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!sucursal.getIsNew() && !sucursal.getIsChanged() && !sucursal.getIsDeleted()) {
				sDescripcion=sucursal.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=sucursal.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Sucursal sucursalRow=new Sucursal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sucursalRow=(Sucursal) sucursalLogic.getSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sucursalRow=(Sucursal) sucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSucursal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal));			
			this.jButtonDuplicarSucursal.setVisible((this.isVisibilidadCeldaDuplicarSucursal && this.isPermisoDuplicarSucursal));			
			this.jButtonCopiarSucursal.setVisible((this.isVisibilidadCeldaCopiarSucursal && this.isPermisoCopiarSucursal));
			this.jButtonVerFormSucursal.setVisible((this.isVisibilidadCeldaVerFormSucursal && this.isPermisoVerFormSucursal));
			
			this.jButtonAbrirOrderBySucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));			
			
			this.jButtonNuevoRelacionesSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesSucursal && this.isPermisoNuevoSucursal));			
			this.jButtonNuevoGuardarCambiosSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal && this.isPermisoGuardarCambiosSucursal));
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.jInternalFrameDetalleFormSucursal.jButtonModificarSucursal.setVisible((this.isVisibilidadCeldaModificarSucursal && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.setVisible((this.isVisibilidadCeldaActualizarSucursal && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.setVisible((this.isVisibilidadCeldaEliminarSucursal && this.isPermisoEliminarSucursal));
			this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.setVisible(this.isVisibilidadCeldaCancelarSucursal);							
			this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.setVisible((this.isVisibilidadCeldaGuardarSucursal && this.isPermisoGuardarCambiosSucursal));			
			
			}
						
			this.jButtonGuardarCambiosTablaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosSucursal && this.isPermisoGuardarCambiosSucursal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal));						
			this.jButtonDuplicarToolBarSucursal.setVisible((this.isVisibilidadCeldaDuplicarSucursal && this.isPermisoDuplicarSucursal));						
			this.jButtonCopiarToolBarSucursal.setVisible((this.isVisibilidadCeldaCopiarSucursal && this.isPermisoCopiarSucursal));			
			this.jButtonVerFormToolBarSucursal.setVisible((this.isVisibilidadCeldaVerFormSucursal && this.isPermisoVerFormSucursal));			
			this.jButtonAbrirOrderByToolBarSucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));
			this.jButtonNuevoRelacionesToolBarSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesSucursal && this.isPermisoNuevoSucursal));			
			this.jButtonNuevoGuardarCambiosToolBarSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal && this.isPermisoGuardarCambiosSucursal));			
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.jInternalFrameDetalleFormSucursal.jButtonModificarToolBarSucursal.setVisible((this.isVisibilidadCeldaModificarSucursal && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jButtonActualizarToolBarSucursal.setVisible((this.isVisibilidadCeldaActualizarSucursal  && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jButtonEliminarToolBarSucursal.setVisible((this.isVisibilidadCeldaEliminarSucursal && this.isPermisoEliminarSucursal));
			this.jInternalFrameDetalleFormSucursal.jButtonCancelarToolBarSucursal.setVisible(this.isVisibilidadCeldaCancelarSucursal);				
			this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosToolBarSucursal.setVisible((this.isVisibilidadCeldaGuardarSucursal && this.isPermisoGuardarCambiosSucursal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosSucursal && this.isPermisoGuardarCambiosSucursal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal));			
			this.jMenuItemDuplicarSucursal.setVisible((this.isVisibilidadCeldaDuplicarSucursal && this.isPermisoDuplicarSucursal));			
			this.jMenuItemCopiarSucursal.setVisible((this.isVisibilidadCeldaCopiarSucursal && this.isPermisoCopiarSucursal));			
			this.jMenuItemVerFormSucursal.setVisible((this.isVisibilidadCeldaVerFormSucursal && this.isPermisoVerFormSucursal));			
			this.jMenuItemAbrirOrderBySucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));			
			//this.jMenuItemMostrarOcultarSucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));
			this.jMenuItemDetalleAbrirOrderBySucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));			
			//this.jMenuItemDetalleMostrarOcultarSucursal.setVisible((this.isVisibilidadCeldaOrdenSucursal && this.isPermisoOrdenSucursal));			
			this.jMenuItemNuevoRelacionesSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesSucursal && this.isPermisoNuevoSucursal));			
			this.jMenuItemNuevoGuardarCambiosSucursal.setVisible((this.isVisibilidadCeldaNuevoSucursal && this.isPermisoNuevoSucursal && this.isPermisoGuardarCambiosSucursal));									
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.jInternalFrameDetalleFormSucursal.jMenuItemModificarSucursal.setVisible((this.isVisibilidadCeldaModificarSucursal && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jMenuItemActualizarSucursal.setVisible((this.isVisibilidadCeldaActualizarSucursal && this.isPermisoActualizarSucursal));	
			this.jInternalFrameDetalleFormSucursal.jMenuItemEliminarSucursal.setVisible((this.isVisibilidadCeldaEliminarSucursal && this.isPermisoEliminarSucursal));
			this.jInternalFrameDetalleFormSucursal.jMenuItemCancelarSucursal.setVisible(this.isVisibilidadCeldaCancelarSucursal);				
			}
			
			this.jMenuItemGuardarCambiosSucursal.setVisible((this.isVisibilidadCeldaGuardarSucursal && this.isPermisoGuardarCambiosSucursal));						
			this.jMenuItemGuardarCambiosTablaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosSucursal && this.isPermisoGuardarCambiosSucursal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSucursal=this.jButtonNuevoSucursal.isVisible();
			this.isVisibilidadCeldaDuplicarSucursal=this.jButtonDuplicarSucursal.isVisible();
			this.isVisibilidadCeldaCopiarSucursal=this.jButtonCopiarSucursal.isVisible();
			this.isVisibilidadCeldaVerFormSucursal=this.jButtonVerFormSucursal.isVisible();
			
			this.isVisibilidadCeldaOrdenSucursal=this.jButtonAbrirOrderBySucursal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSucursal=this.jButtonNuevoRelacionesSucursal.isVisible();
			this.isVisibilidadCeldaModificarSucursal=this.jButtonModificarSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.isVisibilidadCeldaActualizarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.isVisible();
			this.isVisibilidadCeldaEliminarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.isVisible();
			this.isVisibilidadCeldaCancelarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.isVisible();
			this.isVisibilidadCeldaGuardarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSucursal=this.jButtonGuardarCambiosTablaSucursal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSucursal=this.jButtonNuevoToolBarSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSucursal=this.jButtonNuevoRelacionesToolBarSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.isVisibilidadCeldaModificarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonModificarToolBarSucursal.isVisible();
			this.isVisibilidadCeldaActualizarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonActualizarToolBarSucursal.isVisible();
			this.isVisibilidadCeldaEliminarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonEliminarToolBarSucursal.isVisible();
			this.isVisibilidadCeldaCancelarSucursal=this.jInternalFrameDetalleFormSucursal.jButtonCancelarToolBarSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSucursal=this.jButtonGuardarCambiosToolBarSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSucursal=this.jButtonGuardarCambiosTablaToolBarSucursal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSucursal=this.jMenuItemNuevoSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSucursal=this.jMenuItemNuevoRelacionesSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.isVisibilidadCeldaModificarSucursal=this.jInternalFrameDetalleFormSucursal.jMenuItemModificarSucursal.isVisible();
			this.isVisibilidadCeldaActualizarSucursal=this.jInternalFrameDetalleFormSucursal.jMenuItemActualizarSucursal.isVisible();
			this.isVisibilidadCeldaEliminarSucursal=this.jInternalFrameDetalleFormSucursal.jMenuItemEliminarSucursal.isVisible();
			this.isVisibilidadCeldaCancelarSucursal=this.jInternalFrameDetalleFormSucursal.jMenuItemCancelarSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSucursal=this.jMenuItemGuardarCambiosSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSucursal=this.jMenuItemGuardarCambiosTablaSucursal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSucursal(Boolean esInicializar) {
		if(SucursalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sucursalSessionBean.getConGuardarRelaciones()) {
				//if(this.sucursalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSucursal();
			}
			
			this.inicializarActualizarBindingBotonesManualSucursal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSucursal() {
		this.jButtonNuevoSucursal.setVisible(this.isPermisoNuevoSucursal);			
		this.jButtonDuplicarSucursal.setVisible(this.isPermisoDuplicarSucursal);			
		this.jButtonCopiarSucursal.setVisible(this.isPermisoCopiarSucursal);			
		this.jButtonVerFormSucursal.setVisible(this.isPermisoVerFormSucursal);			
		
		this.jButtonAbrirOrderBySucursal.setVisible(this.isPermisoOrdenSucursal);					
		
		this.jButtonNuevoRelacionesSucursal.setVisible(this.isPermisoNuevoSucursal);			
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonModificarSucursal.setVisible(this.isPermisoActualizarSucursal);	
			this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.setVisible(this.isPermisoActualizarSucursal);	
			this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.setVisible(this.isPermisoEliminarSucursal);
			this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.setVisible(this.isVisibilidadCeldaCancelarSucursal);						
			this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.setVisible(this.isPermisoGuardarCambiosSucursal);							
		}
		
		this.jButtonGuardarCambiosTablaSucursal.setVisible(this.isPermisoActualizarSucursal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSucursal() {
		this.jInternalFrameDetalleFormSucursal.jButtonModificarSucursal.setVisible(this.isPermisoActualizarSucursal);	
		this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.setVisible(this.isPermisoActualizarSucursal);	
		this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.setVisible(this.isPermisoEliminarSucursal);
		this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.setVisible(this.isVisibilidadCeldaCancelarSucursal);							
		this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.setVisible((this.isVisibilidadCeldaGuardarSucursal && this.isPermisoGuardarCambiosSucursal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSucursal() {
		if(SucursalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSucursal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSucursal() {
	}
	
	public void jTableDatosSucursalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSucursal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sucursal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSucursal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.sucursalLogic.getConnexion());

				if(this.sucursal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.sucursal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSucursal=(TitledBorder)this.jScrollPanelDatosSucursal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSucursal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.sucursal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebSucursal(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.sucursalLogic.getConnexion());

				if(this.sucursal.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.sucursal.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSucursal=(TitledBorder)this.jScrollPanelDatosSucursal.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderSucursal.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.sucursal.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadSucursalActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="Ciudad";

			if(!this.sFinalQueryGeneral_ciudad.equals("")) {
				this.ciudadBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_ciudad);
				this.ciudadBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.ciudadBeanSwingJInternalFrame.procesarBusqueda(this.ciudadBeanSwingJInternalFrame.sAccionBusqueda);
				this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingCiudad(false);
			}

			if(!this.sFinalQueryComboCiudad.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderSucursal=null;
			TitledBorder titledBorderciudad=null;

			if(!this.jScrollPanelDatosSucursal.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderSucursal=(TitledBorder)this.jScrollPanelDatosSucursal.getBorder();
				titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderSucursal.getTitle() + " -> Ciudad");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_ciudadSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebSucursal(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.sucursalLogic.getConnexion());

				if(this.sucursal.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.sucursal.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSucursal=(TitledBorder)this.jScrollPanelDatosSucursal.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderSucursal.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.sucursal.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.sucursal.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.sucursal.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.sucursal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.sucursal.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.sucursal.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.sucursal.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfaxSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getfax()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fax like '%"+this.sucursal.getfax()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmailSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getmail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where mail like '%"+this.sucursal.getmail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresponsableSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getresponsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where responsable like '%"+this.sucursal.getresponsable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSucursal(this.getsucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sucursal==null) {
						this.sucursal = new Sucursal();
					}

					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);
				}

				if(this.sucursal.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.sucursal.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSucursal(false,false);

			this.getSucursalsFK_IdCiudad();

			this.inicializarActualizarBindingSucursal(false);

			//if(SucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSucursal(false,false);

			this.getSucursalsFK_IdEmpresa();

			this.inicializarActualizarBindingSucursal(false);

			//if(SucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSucursal(false,false);

			this.getSucursalsFK_IdPais();

			this.inicializarActualizarBindingSucursal(false);

			//if(SucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSucursal() {
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
			this.jInternalFrameDetalleFormSucursal.setVisible(false);	    			
			this.jInternalFrameDetalleFormSucursal.dispose();
			this.jInternalFrameDetalleFormSucursal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSucursal!=null) {
			this.jInternalFrameReporteDinamicoSucursal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSucursal.dispose();
			this.jInternalFrameReporteDinamicoSucursal=null;
		}
		
		if(this.jInternalFrameImportacionSucursal!=null) {
			this.jInternalFrameImportacionSucursal.setVisible(false);	    			
			this.jInternalFrameImportacionSucursal.dispose();
			this.jInternalFrameImportacionSucursal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSucursal();
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			
			if(sTipo.equals("NuevoSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSucursal")) {
				jButtonDuplicarSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSucursal")) {
				jButtonCopiarSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormSucursal")) {
				jButtonVerFormSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSucursal")) {
				jButtonDuplicarSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSucursal")) {
				jButtonDuplicarSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSucursal")) {
				jButtonModificarSucursalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSucursal")) {
				jButtonModificarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSucursal")) {
				jButtonModificarSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSucursal")) {
				jButtonActualizarSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSucursal")) {
				jButtonActualizarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSucursal")) {
				jButtonActualizarSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarSucursal")) {
				jButtonEliminarSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSucursal")) {
				jButtonEliminarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSucursal")) {
				jButtonEliminarSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarSucursal")) {
				jButtonCancelarSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSucursal")) {
				jButtonCancelarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSucursal")) {
				jButtonCancelarSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarSucursal")) {
				jButtonCerrarSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSucursal")) {
				jButtonCerrarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSucursal")) {
				jButtonCerrarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSucursal")) {
				jButtonMostrarOcultarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSucursal")) {
				jButtonCancelarSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSucursal")) {
				jButtonCopiarSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSucursal")) {
				jButtonVerFormSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSucursal")) {
				jButtonCopiarSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSucursal")) {
				jButtonVerFormSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSucursal")) {
				jButtonRecargarInformacionSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSucursal")) {
				jButtonRecargarInformacionSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSucursal")) {
				jButtonRecargarInformacionSucursalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSucursal")) {
				jButtonAnterioresSucursalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSucursal")) {
				jButtonAnterioresSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSucursal")) {
				jButtonAnterioresSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSucursal")) {
				jButtonSiguientesSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSucursal")) {
				jButtonSiguientesSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSucursal")) {
				jButtonSiguientesSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySucursal") || sTipo.equals("MenuItemDetalleAbrirOrderBySucursal")) {
				jButtonAbrirOrderBySucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSucursal") || sTipo.equals("MenuItemDetalleMostrarOcultarSucursal")) {
				jButtonMostrarOcultarSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSucursal")) {
				jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSucursal")) {
				jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSucursal")) {
				jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSucursal")) {
				jButtonCerrarReporteDinamicoSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSucursal")) {
				jButtonGenerarReporteDinamicoSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSucursal")) {
				
				jButtonGenerarExcelReporteDinamicoSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSucursal")) {
				jButtonCerrarImportacionSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSucursal")) {
				
				jButtonGenerarImportacionSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSucursal")) {
				
				jButtonAbrirImportacionSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSucursal")) {
				jComboBoxTiposAccionesSucursalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSucursal")) {
				jComboBoxTiposRelacionesSucursalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSucursal")) {
				jComboBoxTiposAccionesSucursalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSucursal")) {
				
				jComboBoxTiposSeleccionarSucursalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSucursal")) {
				jTextFieldValorCampoGeneralSucursalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySucursal")) {
				jButtonAbrirOrderBySucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSucursal")) {
				jButtonAbrirOrderBySucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySucursal")) {
				jButtonCerrarOrderBySucursalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSucursalBusqueda")) {
				this.jButtonidSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSucursalUpdate")) {
				this.jButtonid_empresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSucursalBusqueda")) {
				this.jButtonid_empresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisSucursalUpdate")) {
				this.jButtonid_paisSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisSucursalBusqueda")) {
				this.jButtonid_paisSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_ciudadSucursal")) {
				this.jButtonid_ciudadSucursalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadSucursalUpdate")) {
				this.jButtonid_ciudadSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadSucursalBusqueda")) {
				this.jButtonid_ciudadSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSucursalBusqueda")) {
				this.jButtoncodigoSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroSucursalBusqueda")) {
				this.jButtonnumeroSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSucursalBusqueda")) {
				this.jButtonnombreSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionSucursalBusqueda")) {
				this.jButtondireccionSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSucursalBusqueda")) {
				this.jButtonrucSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoSucursalBusqueda")) {
				this.jButtontelefonoSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxSucursalBusqueda")) {
				this.jButtonfaxSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailSucursalBusqueda")) {
				this.jButtonmailSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableSucursalBusqueda")) {
				this.jButtonresponsableSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSucursalBusqueda")) {
				this.jButtondescripcionSucursalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpresaSucursal")) {
				this.jButtonFK_IdEmpresaSucursalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisSucursal")) {
				this.jButtonFK_IdPaisSucursalActionPerformed(evt);
			}
			
			;
			
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSucursal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Sucursal sucursalLocal=null;
			
			if(!this.getEsControlTabla()) {
				sucursalLocal=this.sucursal;
			} else {
				sucursalLocal=this.sucursalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
							
				
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
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
			
			


			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
								
						
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
								
				
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
							
				
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
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
			
			


			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
								
				
				


				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSucursal")) {
					jCheckBoxSeleccionarTodosSucursalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSucursal")) {
					jCheckBoxSeleccionadosSucursalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSucursal")) {
					
				}
				
				


				
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
												
				
				


				
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal;
				}

				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					//classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisSucursal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
				//recargarFormSucursalPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
			}
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal;
				}

				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					//classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisSucursal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
				//recargarFormSucursalPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
			}
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sucursal);
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisSucursal")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal;
				}

				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					//classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormSucursal(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisSucursal")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
				//recargarFormSucursalPais(jComboBoxid_paisFK_IdPaisSucursal,"FK_IdPais");
			}
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sucursal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sucursalAnterior =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sucursalAnterior =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSucursal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSucursal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sucursal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sucursal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sucursal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSucursal")) {
				
				}
				
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSucursal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSucursal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSucursal")) {
			
			}
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSucursal();
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			if(sTipo.equals("NuevoSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSucursal")) {
				jButtonDuplicarSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSucursal")) {
				jButtonCopiarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSucursal")) {
				jButtonVerFormSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSucursal")) {
				jButtonNuevoSucursalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSucursal")) {
				jButtonModificarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSucursal")) {
				jButtonActualizarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSucursal")) {
				jButtonEliminarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSucursal")) {
				jButtonCancelarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSucursal")) {
				jButtonCerrarSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSucursal")) {
				jButtonGuardarCambiosSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSucursal")) {
				jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySucursal")) {
				jButtonAbrirOrderBySucursalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSucursal")) {
				jButtonRecargarInformacionSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSucursal")) {
				jButtonAnterioresSucursalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSucursal")) {
				jButtonSiguientesSucursalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSucursalBusqueda")) {
				this.jButtonidSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSucursalUpdate")) {
				this.jButtonid_empresaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSucursalBusqueda")) {
				this.jButtonid_empresaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisSucursalUpdate")) {
				this.jButtonid_paisSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisSucursalBusqueda")) {
				this.jButtonid_paisSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_ciudadSucursal")) {
				this.jButtonid_ciudadSucursalActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadSucursalUpdate")) {
				this.jButtonid_ciudadSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadSucursalBusqueda")) {
				this.jButtonid_ciudadSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSucursalBusqueda")) {
				this.jButtoncodigoSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroSucursalBusqueda")) {
				this.jButtonnumeroSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSucursalBusqueda")) {
				this.jButtonnombreSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionSucursalBusqueda")) {
				this.jButtondireccionSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucSucursalBusqueda")) {
				this.jButtonrucSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoSucursalBusqueda")) {
				this.jButtontelefonoSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("faxSucursalBusqueda")) {
				this.jButtonfaxSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("mailSucursalBusqueda")) {
				this.jButtonmailSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableSucursalBusqueda")) {
				this.jButtonresponsableSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionSucursalBusqueda")) {
				this.jButtondescripcionSucursalBusquedaActionPerformed(evt);
			}
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSucursal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSucursal")) {
				closingInternalFrameSucursal();
				
			} else if(sTipo.equals("jButtonCancelarSucursal")) {
				JInternalFrameBase jInternalFrameDetalleFormSucursal = (JInternalFrameBase)evt.getSource();
	            	
	            SucursalBeanSwingJInternalFrame jInternalFrameParent=(SucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormSucursal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSucursalActionPerformed(null);
			}
			
			SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sucursal,new Object(),this.sucursalParameterGeneral,this.sucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sucursal)) {
			if(!esControlTabla) {
				if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);			
				}
				
				if(this.sucursalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSucursal(this.sucursal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sucursalReturnGeneral=sucursalLogic.procesarEventosSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sucursalLogic.getSucursals(),this.sucursal,this.sucursalParameterGeneral,this.isEsNuevoSucursal,classes);//this.sucursalLogic.getSucursal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSucursal(this.sucursalReturnGeneral,this.sucursalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSucursal(classes,this.sucursalReturnGeneral,this.sucursalBean,false);
					}
						
					if(this.sucursalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySucursal(this.sucursalReturnGeneral.getSucursal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSucursal(this.sucursalReturnGeneral.getSucursal());	
					}
						
					if(this.sucursalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSucursal(this.sucursalReturnGeneral.getSucursal(),classes);//this.sucursalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSucursal(this.sucursal,classes);//this.sucursalBean);									
				}
			
				if(SucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSucursal(this.sucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSucursal(this.sucursal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sucursalAnterior!=null) {
						this.sucursal=this.sucursalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sucursalReturnGeneral=sucursalLogic.procesarEventosSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sucursalLogic.getSucursals(),this.sucursal,this.sucursalParameterGeneral,this.isEsNuevoSucursal,classes);//this.sucursalLogic.getSucursal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sucursalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sucursalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sucursalReturnGeneral.getSucursal(),sucursalLogic.getSucursals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sucursalReturnGeneral.getSucursal(),this.sucursals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSucursal.repaint();
				
				//((AbstractTableModel) this.jTableDatosSucursal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSucursal();
			}
		}
	}
	
	public void actualizarVisualTableDatosSucursal() throws Exception {
		
		SucursalModel sucursalModel=(SucursalModel)this.jTableDatosSucursal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sucursalModel.sucursals=this.sucursalLogic.getSucursals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sucursalModel.sucursals=this.sucursals;
		}
		
		
		((SucursalModel) this.jTableDatosSucursal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSucursal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsucursalAnterior(),this.sucursalLogic.getSucursals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsucursalAnterior(),this.sucursals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSucursal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSucursal(Sucursal sucursal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
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
										
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sucursal,new Object(),generalEntityParameterGeneral,this.sucursalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sucursalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SucursalConstantesFunciones.getClassesRelationshipsOfSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SucursalConstantesFunciones.getClassesRelationshipsFromStringsOfSucursal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sucursal,new Object(),generalEntityParameterGeneral,this.sucursalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSucursal(SucursalBean sucursalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSucursal(ArrayList<Classe> classes,SucursalReturnGeneral sucursalReturnGeneral,SucursalBean sucursalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSucursal(Sucursal sucursal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sucursal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSucursal = new SucursalDetalleFormJInternalFrame(jDesktopPane,this.sucursalSessionBean.getConGuardarRelaciones(),this.sucursalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSucursal);
		this.jInternalFrameDetalleFormSucursal.setVisible(false);
		this.jInternalFrameDetalleFormSucursal.setSelected(false);						
		
		this.jInternalFrameDetalleFormSucursal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSucursal.sucursalLogic=this.sucursalLogic;
		
		this.cargarCombosFrameForeignKeySucursal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSucursal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSucursal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySucursal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySucursal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSucursal"));
		
		this.jInternalFrameDetalleFormSucursal.jButtonModificarSucursal.addActionListener(new ButtonActionListener(this,"ModificarSucursal"));

		
		this.jInternalFrameDetalleFormSucursal.jButtonModificarToolBarSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarSucursal"));
					
		this.jInternalFrameDetalleFormSucursal.jMenuItemModificarSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.addActionListener (new ButtonActionListener(this,"ActualizarSucursal"));
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonActualizarToolBarSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSucursal"));
						
		this.jInternalFrameDetalleFormSucursal.jMenuItemActualizarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.addActionListener (new ButtonActionListener(this,"EliminarSucursal"));
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonEliminarToolBarSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarSucursal"));
								
		this.jInternalFrameDetalleFormSucursal.jMenuItemEliminarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.addActionListener (new ButtonActionListener(this,"CancelarSucursal"));
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonCancelarToolBarSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarSucursal"));
					
		this.jInternalFrameDetalleFormSucursal.jMenuItemCancelarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSucursal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSucursal.jMenuItemDetalleCerrarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosToolBarSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSucursal"));
		
		
		
		this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosToolBarSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSucursal"));
		
		
		
		this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSucursal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonidSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_paisSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisSucursalBusqueda"));
		//jButtonid_ciudadSucursal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_ciudadSucursalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursal.addActionListener(new ButtonActionListener(this,"id_ciudadSucursal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtoncodigoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"codigoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnumeroSucursalBusqueda.addActionListener(new ButtonActionListener(this,"numeroSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnombreSucursalBusqueda.addActionListener(new ButtonActionListener(this,"nombreSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondireccionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"direccionSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonrucSucursalBusqueda.addActionListener(new ButtonActionListener(this,"rucSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtontelefonoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonfaxSucursalBusqueda.addActionListener(new ButtonActionListener(this,"faxSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonmailSucursalBusqueda.addActionListener(new ButtonActionListener(this,"mailSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonresponsableSucursalBusqueda.addActionListener(new ButtonActionListener(this,"responsableSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondescripcionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSucursalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSucursal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSucursal"));
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSucursal"));
		}
		
		this.jTableDatosSucursal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSucursal"));
		
		this.jTableDatosSucursal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSucursal"));
		
		this.jButtonNuevoSucursal.addActionListener(new ButtonActionListener(this,"NuevoSucursal"));
		
		this.jButtonDuplicarSucursal.addActionListener(new ButtonActionListener(this,"DuplicarSucursal"));
		
		this.jButtonCopiarSucursal.addActionListener(new ButtonActionListener(this,"CopiarSucursal"));
		
		this.jButtonVerFormSucursal.addActionListener(new ButtonActionListener(this,"VerFormSucursal"));
		
		
		this.jButtonNuevoToolBarSucursal.addActionListener(new ButtonActionListener(this,"NuevoToolBarSucursal"));
			
		this.jButtonDuplicarToolBarSucursal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSucursal"));
			
		this.jMenuItemNuevoSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSucursal"));
			
		this.jMenuItemDuplicarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSucursal"));		
		
		
		this.jButtonNuevoRelacionesSucursal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSucursal"));
		
		
		this.jButtonNuevoRelacionesToolBarSucursal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSucursal"));
			
		this.jMenuItemNuevoRelacionesSucursal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonModificarSucursal.addActionListener(new ButtonActionListener(this,"ModificarSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonModificarToolBarSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarSucursal"));
			
			this.jInternalFrameDetalleFormSucursal.jMenuItemModificarSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSucursal.jButtonActualizarSucursal.addActionListener (new ButtonActionListener(this,"ActualizarSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonActualizarToolBarSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSucursal"));
				
			this.jInternalFrameDetalleFormSucursal.jMenuItemActualizarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonEliminarSucursal.addActionListener (new ButtonActionListener(this,"EliminarSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonEliminarToolBarSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarSucursal"));
						
			this.jInternalFrameDetalleFormSucursal.jMenuItemEliminarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonCancelarSucursal.addActionListener (new ButtonActionListener(this,"CancelarSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonCancelarToolBarSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarSucursal"));
			
			this.jInternalFrameDetalleFormSucursal.jMenuItemCancelarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSucursal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSucursal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSucursal"));		
		
		
		this.jButtonCerrarSucursal.addActionListener (new ButtonActionListener(this,"CerrarSucursal"));
		
		
		this.jButtonCerrarToolBarSucursal.addActionListener (new ButtonActionListener(this,"CerrarToolBarSucursal"));
			
		this.jMenuItemCerrarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSucursal"));
			
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jMenuItemDetalleCerrarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosToolBarSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSucursal"));
		}
		
		this.jButtonCopiarToolBarSucursal.addActionListener (new ButtonActionListener(this,"CopiarToolBarSucursal"));
			
		this.jButtonVerFormToolBarSucursal.addActionListener (new ButtonActionListener(this,"VerFormToolBarSucursal"));
		
		this.jMenuItemGuardarCambiosSucursal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSucursal"));
			
		this.jMenuItemCopiarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSucursal"));		
		
		this.jMenuItemVerFormSucursal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSucursal"));		
		
		
		this.jButtonGuardarCambiosTablaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSucursal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSucursal"));
			
		this.jMenuItemGuardarCambiosTablaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSucursal"));		
		
		
		
		this.jButtonRecargarInformacionSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionSucursal"));
					
		this.jButtonRecargarInformacionToolBarSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSucursal"));
		
		this.jMenuItemRecargarInformacionSucursal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSucursal"));		
		
		
		
		this.jButtonAnterioresSucursal.addActionListener (new ButtonActionListener(this,"AnterioresSucursal"));
		
		
		this.jButtonAnterioresToolBarSucursal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSucursal"));
		
		this.jMenuItemAnterioresSucursal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSucursal"));		
		
		
		this.jButtonSiguientesSucursal.addActionListener (new ButtonActionListener(this,"SiguientesSucursal"));
		
		
		this.jButtonSiguientesToolBarSucursal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSucursal"));
			
		this.jMenuItemSiguientesSucursal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSucursal"));
			
		this.jMenuItemAbrirOrderBySucursal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySucursal"));
			
		this.jMenuItemMostrarOcultarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSucursal"));
			
		this.jMenuItemDetalleAbrirOrderBySucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySucursal"));
			
		this.jMenuItemDetalleMostarOcultarSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSucursal"));		
		
		
		this.jButtonNuevoGuardarCambiosSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSucursal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSucursal"));
			
		this.jMenuItemNuevoGuardarCambiosSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSucursal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSucursal"));

		this.jCheckBoxSeleccionadosSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSucursal"));
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSucursal"));
		}
		
		
		this.jComboBoxTiposRelacionesSucursal.addActionListener (new ButtonActionListener(this,"TiposRelacionesSucursal"));
			
		this.jComboBoxTiposAccionesSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesSucursal"));
					
		this.jComboBoxTiposSeleccionarSucursal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSucursal"));
			
		this.jTextFieldValorCampoGeneralSucursal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonidSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_paisSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisSucursalBusqueda"));
		//jButtonid_ciudadSucursal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_ciudadSucursalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursal.addActionListener(new ButtonActionListener(this,"id_ciudadSucursal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtoncodigoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"codigoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnumeroSucursalBusqueda.addActionListener(new ButtonActionListener(this,"numeroSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnombreSucursalBusqueda.addActionListener(new ButtonActionListener(this,"nombreSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondireccionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"direccionSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonrucSucursalBusqueda.addActionListener(new ButtonActionListener(this,"rucSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtontelefonoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonfaxSucursalBusqueda.addActionListener(new ButtonActionListener(this,"faxSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonmailSucursalBusqueda.addActionListener(new ButtonActionListener(this,"mailSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonresponsableSucursalBusqueda.addActionListener(new ButtonActionListener(this,"responsableSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondescripcionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSucursalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpresaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdEmpresaSucursal"));

			this.jButtonFK_IdPaisSucursal.addActionListener(new ButtonActionListener(this,"FK_IdPaisSucursal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSucursal!=null) {
				this.jInternalFrameReporteDinamicoSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSucursal"));
				this.jInternalFrameReporteDinamicoSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSucursal"));
				this.jInternalFrameReporteDinamicoSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSucursal"));
			}
			
			//this.jButtonCerrarReporteDinamicoSucursal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSucursal"));				
			//this.jButtonGenerarReporteDinamicoSucursal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSucursal"));
			//this.jButtonGenerarExcelReporteDinamicoSucursal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSucursal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSucursal!=null) {
				this.jInternalFrameImportacionSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSucursal"));
				this.jInternalFrameImportacionSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSucursal"));
				this.jInternalFrameImportacionSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSucursal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderBySucursal"));
			
			this.jButtonAbrirOrderByToolBarSucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSucursal"));			
			
			if(this.jInternalFrameOrderBySucursal!=null) {
				this.jInternalFrameOrderBySucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySucursal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSucursal.jTabbedPaneRelacionesSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSucursal"));
		
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
            		closingInternalFrameSucursal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSucursal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSucursal = (JInternalFrameBase)event.getSource();
	            	
	            SucursalBeanSwingJInternalFrame jInternalFrameParent=(SucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormSucursal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSucursalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSucursal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSucursal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSucursal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSucursal";
		inputMap = this.jButtonNuevoSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSucursalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSucursal";
		inputMap = this.jButtonNuevoRelacionesSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSucursalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSucursal";
		inputMap = this.jButtonModificarSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSucursal";
		inputMap = this.jButtonActualizarSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSucursal";
		inputMap = this.jButtonEliminarSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSucursal";
		inputMap = this.jButtonCancelarSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSucursal";
		inputMap = this.jButtonCerrarSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSucursal";
		inputMap = this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSucursal.jButtonGuardarCambiosSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSucursal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSucursalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonidSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_empresaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_paisSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_paisSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_paisSucursalBusqueda"));
		//jButtonid_ciudadSucursal.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_ciudadSucursalActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursal.addActionListener(new ButtonActionListener(this,"id_ciudadSucursal"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtoncodigoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"codigoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnumeroSucursalBusqueda.addActionListener(new ButtonActionListener(this,"numeroSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonnombreSucursalBusqueda.addActionListener(new ButtonActionListener(this,"nombreSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondireccionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"direccionSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonrucSucursalBusqueda.addActionListener(new ButtonActionListener(this,"rucSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtontelefonoSucursalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonfaxSucursalBusqueda.addActionListener(new ButtonActionListener(this,"faxSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonmailSucursalBusqueda.addActionListener(new ButtonActionListener(this,"mailSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtonresponsableSucursalBusqueda.addActionListener(new ButtonActionListener(this,"responsableSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSucursal.jButtondescripcionSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionSucursalBusqueda"));
		
		
		this.jButtonFK_IdEmpresaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdEmpresaSucursal"));

		this.jButtonFK_IdPaisSucursal.addActionListener(new ButtonActionListener(this,"FK_IdPaisSucursal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSucursal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSucursal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
					sucursalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sucursal sucursalAux:sucursals) {
					sucursalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
						sucursalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sucursal sucursalAux:sucursals) {
						sucursalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sucursal sucursalAux:sucursals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSucursal.getSelectedRows();
			
			Sucursal sucursalLocal=new Sucursal();
			
			//this.seleccionarTodosSucursal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLocal =(Sucursal) this.sucursalLogic.getSucursals().toArray()[this.jTableDatosSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sucursalLocal =(Sucursal) this.sucursals.toArray()[this.jTableDatosSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sucursalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
						sucursalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sucursal sucursalAux:sucursals) {
						sucursalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSucursal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSucursalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSucursalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSucursal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSucursal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sucursal sucursalAux:this.sucursalLogic.getSucursals()) {
				
						if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							sucursalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							sucursalAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sucursalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							sucursalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sucursalAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							sucursalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_FAX)) {
							existe=true;
							sucursalAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							sucursalAux.setmail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							sucursalAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							sucursalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sucursal sucursalAux:sucursals) {
					
						if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							sucursalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							sucursalAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sucursalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							sucursalAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RUC)) {
							existe=true;
							sucursalAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							sucursalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_FAX)) {
							existe=true;
							sucursalAux.setfax(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_MAIL)) {
							existe=true;
							sucursalAux.setmail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							sucursalAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							sucursalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSucursalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSucursal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSucursal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSucursal) {				
					conSplash=true;//false;										
					
					//this.startProcessSucursal(conSplash);
				
					this.generarReporteSucursalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSucursalsSeleccionados(false);
				//this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSucursalsSeleccionados(true);
				//this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSucursal();
				
				this.exportarSucursalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSucursals();
				//this.importarSucursals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSucursal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSucursal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSucursal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySucursal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
				}	
			} 			
			else if(SucursalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSucursal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSucursal(conSplash);
					
						//this.actualizarParametrosGeneralSucursal();
						
						this.generarReporteProcesoAccionSucursalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SucursalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SucursalES SELECCIONADOS?", "MANTENIMIENTO DE Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSucursal();
				
						this.actualizarParametrosGeneralSucursal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.sucursalReturnGeneral=sucursalLogic.procesarAccionSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.sucursalLogic.getSucursals(),this.sucursalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSucursal();
					
					SucursalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSucursal.jComboBoxTiposAccionesFormularioSucursal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSucursal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSucursalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSucursal();
			
			if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
			Sucursal sucursal=new Sucursal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSucursal.getSelectedItem();
			
			
			
			
			sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(sucursalsSeleccionados.size()==1) {
				for(Sucursal sucursalAux:sucursalsSeleccionados) {
					sucursal=sucursalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSucursal();
			
      		//this.finishProcessSucursal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSucursalReturnGeneral() throws Exception {
		if(this.sucursalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sucursalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sucursalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sucursalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sucursalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sucursalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSucursal(false);
		}
		
		if(this.sucursalReturnGeneral.getConRetornoLista() || this.sucursalReturnGeneral.getConRetornoObjeto()) {
			if(this.sucursalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sucursalLogic.setSucursals(this.sucursalReturnGeneral.getSucursals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.sucursalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sucursalLogic.setSucursal(this.sucursalReturnGeneral.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSucursal(false);
		}
	}
	
	public void actualizarParametrosGeneralSucursal() throws Exception {
		
		
	}
	
	public ArrayList<Sucursal> getSucursalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSucursal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Sucursal sucursalAux:sucursalLogic.getSucursals()) {
					if(sucursalAux.getIsSelected()) {
						sucursalsSeleccionados.add(sucursalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sucursal sucursalAux:this.sucursals) {
					if(sucursalAux.getIsSelected()) {
						sucursalsSeleccionados.add(sucursalAux);				
					}
				}
			}
			
			if(sucursalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sucursalsSeleccionados.addAll(this.sucursalLogic.getSucursals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sucursalsSeleccionados.addAll(this.sucursals);				
					}
				}
			}
		} else {
			sucursalsSeleccionados.add(this.sucursal);
		}
		
		return sucursalsSeleccionados;
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
	
	public void generarReporteSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSucursalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSucursalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSucursals("Todos",sucursalsSeleccionados);
		
	}	
	
	public void generarReporteNormalSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSucursals("Todos",sucursalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSucursalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSucursals("Todos",sucursalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSucursal();
		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSucursal();
		
		
		//this.generarReporteSucursals("Todos",sucursalsSeleccionados ,sucursalImplementable,sucursalImplementableHome);
	}
	
	public void mostrarImportacionSucursals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSucursal();
		
		this.abrirFrameImportacionSucursal();		
		
			
		//this.generarReporteSucursals("Todos",sucursalsSeleccionados ,sucursalImplementable,sucursalImplementableHome);
	}
	
	public void importarSucursals() throws Exception {		
	
	}
	
	public void exportarSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSucursalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSucursalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSucursalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSucursal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Sucursal sucursalAux:sucursalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSucursal(sucursalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sucursalAux.setsDetalleGeneralEntityReporte(sucursalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSucursal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_FAX;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_MAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_RESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SucursalConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSucursal(Sucursal sucursal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sucursal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getfax();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getmail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getresponsable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=sucursal.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSucursal(row);				
				iRow++;
			}				
			
			for(Sucursal sucursalAux:sucursalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSucursal(sucursalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSucursalsSeleccionados() throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();		
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sucursal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sucursals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sucursal");
			//elementRoot.appendChild(element);
		
			for(Sucursal sucursalAux:sucursalsSeleccionados) {
				element = document.createElement("sucursal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSucursal(sucursalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSucursal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_FAX);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_MAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_RESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(SucursalConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSucursal(Sucursal sucursal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getfax());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getmail());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getresponsable());
		cell = row.createCell(iColumn++);cell.setCellValue(sucursal.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlSucursal(Sucursal sucursal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SucursalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sucursal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SucursalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sucursal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SucursalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(sucursal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementpais_descripcion = document.createElement(SucursalConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(sucursal.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(SucursalConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(sucursal.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementcodigo = document.createElement(SucursalConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(sucursal.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnumero = document.createElement(SucursalConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(sucursal.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementnombre = document.createElement(SucursalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(sucursal.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(SucursalConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(sucursal.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementruc = document.createElement(SucursalConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(sucursal.getruc().trim()));
		element.appendChild(elementruc);

		Element elementtelefono = document.createElement(SucursalConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(sucursal.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementfax = document.createElement(SucursalConstantesFunciones.FAX);
		elementfax.appendChild(document.createTextNode(sucursal.getfax().trim()));
		element.appendChild(elementfax);

		Element elementmail = document.createElement(SucursalConstantesFunciones.MAIL);
		elementmail.appendChild(document.createTextNode(sucursal.getmail().trim()));
		element.appendChild(elementmail);

		Element elementresponsable = document.createElement(SucursalConstantesFunciones.RESPONSABLE);
		elementresponsable.appendChild(document.createTextNode(sucursal.getresponsable().trim()));
		element.appendChild(elementresponsable);

		Element elementdescripcion = document.createElement(SucursalConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(sucursal.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoSucursalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Sucursal> sucursalsSeleccionados=new ArrayList<Sucursal>();
		
		sucursalsSeleccionados=this.getSucursalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSucursal(sucursalsSeleccionados);
		
		this.generarReporteSucursals("Todos",sucursalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSucursal(ArrayList<Sucursal> sucursalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Sucursal sucursalAux:sucursalsSeleccionados) {
				sucursalAux.setsDetalleGeneralEntityReporte(sucursalAux.toString());
			
				if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RUC)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_FAX)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getfax());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_MAIL)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getmail());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_RESPONSABLE)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getresponsable());
				}
				 else if(sTipoSeleccionar.equals(SucursalConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					sucursalAux.setsDescripcionGeneralEntityReporte1(sucursalAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSucursal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSucursal=true;
				this.isVisibilidadCeldaNuevoRelacionesSucursal=true;
				this.isVisibilidadCeldaGuardarCambiosSucursal=true;
			}
			
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=true;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=true;
			this.isVisibilidadCeldaEliminarSucursal=true;
			this.isVisibilidadCeldaCancelarSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=true;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosSucursal=true;
			this.isVisibilidadCeldaModificarSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
			this.isVisibilidadCeldaModificarSucursal=true;
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
			this.isVisibilidadCeldaCancelarSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarSucursal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SucursalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosSucursal=true;
		} else {
			this.actualizarEstadoPanelsSucursal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSucursal=false;
			//this.isVisibilidadCeldaVerFormSucursal=false;
			this.isVisibilidadCeldaDuplicarSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sucursalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
		} else {
			this.isVisibilidadCeldaNuevoSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sucursalSessionBean.getEsGuardarRelacionado()) {
			if(!sucursalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSucursal=false;												
			}
			
			this.jButtonCerrarSucursal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSucursal=false;
		}
		
		if(!this.permiteMantenimiento(this.sucursal)) {
			this.isVisibilidadCeldaActualizarSucursal=false;
			this.isVisibilidadCeldaEliminarSucursal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSucursal() {
	}
	
	public void actualizarEstadoPanelsSucursal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSucursal!=null) {
				this.jScrollPanelDatosEdicionSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSucursal!=null) {
				this.jScrollPanelDatosSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionSucursal!=null) {
				this.jPanelPaginacionSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sucursalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSucursal!=null) {
					this.jTabbedPaneBusquedasSucursal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.sucursalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSucursal!=null) {
				this.jTabbedPaneBusquedasSucursal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSucursal!=null) {
				this.jPanelParametrosReportesSucursal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpresa=isParaEmpresa;
			if(!this.isVisibilidadFK_IdEmpresa) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdEmpresaSucursal);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdPaisSucursal);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdEmpresa=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdEmpresa) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdEmpresaSucursal);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdPaisSucursal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdEmpresa=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdEmpresa) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdEmpresaSucursal);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasSucursal.remove(jPanelFK_IdPaisSucursal);}
		}
		
	}
	
	
	
	

	public String registrarSesionSucursalParaBusquedaCiudades() throws Exception {
		Boolean isPaginaPopupCiudad=false;

		try {

			if(sucursalSessionBean==null) {
				sucursalSessionBean=new SucursalSessionBean();
			}

			if(ciudadSessionBean==null) {
				ciudadSessionBean=new CiudadSessionBean();
			}

			ciudadSessionBean.setsPathNavegacionActual(sucursalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CiudadConstantesFunciones.SCLASSWEBTITULO);
			ciudadSessionBean.setisPermiteRecargarInformacion(false);
			ciudadSessionBean.setisPaginaPopup(true);
			isPaginaPopupCiudad=ciudadSessionBean.getisPaginaPopup();
			ciudadSessionBean.setisPaginaPopup(false);
			ciudadSessionBean.setEstaModoBusqueda(true);
			ciudadSessionBean.setsFuncionBusquedaRapida("window.opener.sucursalFuncionGeneral.setCombosCodigoDesdeBusquedaid_ciudad(TO_REPLACE);");
			ciudadSessionBean.setPaginaPopupVariables(true);
			ciudadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCiudad(false);
			ciudadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCiudad(SucursalConstantesFunciones.SNOMBREOPCION);
			//ciudadSessionBean.setisBusquedaDesdeForeignKeySesionSucursal(true);
			//ciudadSessionBean.setlidSucursalActual(this.idSucursalActual);

			sucursalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySucursal(true);
			sucursalSessionBean.setlIdSucursalActualForeignKey(this.idSucursalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SucursalSessionBean sucursalSessionBean=new SucursalSessionBean();
		
		if(this.sucursalSessionBean==null) {
			this.sucursalSessionBean=new SucursalSessionBean();
		}
		
		this.sucursalSessionBean.setsUltimaBusquedaSucursal(this.getsAccionBusqueda());
		this.sucursalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.sucursalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			sucursalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			sucursalSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SucursalSessionBean sucursalSessionBean=new SucursalSessionBean();
		
		if(this.sucursalSessionBean==null) {
			this.sucursalSessionBean=new SucursalSessionBean();
		}
		
		if(this.sucursalSessionBean.getsUltimaBusquedaSucursal()!=null&&!this.sucursalSessionBean.getsUltimaBusquedaSucursal().equals("")) {
			this.setsAccionBusqueda(sucursalSessionBean.getsUltimaBusquedaSucursal());
			this.setiNumeroPaginacion(sucursalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(sucursalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(sucursalSessionBean.getid_empresa());
				sucursalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(sucursalSessionBean.getid_pais());
				sucursalSessionBean.setid_pais(-1L);
			}
		}
		
		this.sucursalSessionBean.setsUltimaBusquedaSucursal("");
		this.sucursalSessionBean.setiNumeroPaginacion(SucursalConstantesFunciones.INUMEROPAGINACION);
		this.sucursalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSucursal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSucursal() {
		this.updateBorderResaltarBusquedasFormularioSucursal();
		this.updateVisibilidadBusquedasFormularioSucursal();
		this.updateHabilitarBusquedasFormularioSucursal();
	}
	
	public void updateBorderResaltarBusquedasFormularioSucursal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSucursal.getComponents().length>0) {
	

		if(this.sucursalConstantesFunciones.resaltarFK_IdEmpresaSucursal!=null) {
			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdEmpresaSucursal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
				jPanel.setBorder(this.sucursalConstantesFunciones.resaltarFK_IdEmpresaSucursal);
			}
		}

		if(this.sucursalConstantesFunciones.resaltarFK_IdPaisSucursal!=null) {
			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdPaisSucursal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
				jPanel.setBorder(this.sucursalConstantesFunciones.resaltarFK_IdPaisSucursal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSucursal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdEmpresaSucursal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sucursalConstantesFunciones.mostrarFK_IdEmpresaSucursal);
			if(!this.sucursalConstantesFunciones.mostrarFK_IdEmpresaSucursal && index>-1) {
				this.jTabbedPaneBusquedasSucursal.remove(index);
			}

			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdPaisSucursal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.sucursalConstantesFunciones.mostrarFK_IdPaisSucursal);
			if(!this.sucursalConstantesFunciones.mostrarFK_IdPaisSucursal && index>-1) {
				this.jTabbedPaneBusquedasSucursal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSucursal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdEmpresaSucursal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sucursalConstantesFunciones.activarFK_IdEmpresaSucursal);
				this.jTabbedPaneBusquedasSucursal.setEnabledAt(index,this.sucursalConstantesFunciones.activarFK_IdEmpresaSucursal);
			}

			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdPaisSucursal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.sucursalConstantesFunciones.activarFK_IdPaisSucursal);
				this.jTabbedPaneBusquedasSucursal.setEnabledAt(index,this.sucursalConstantesFunciones.activarFK_IdPaisSucursal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSucursal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpresa")) {
			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdEmpresaSucursal);

			this.jTabbedPaneBusquedasSucursal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);

			this.sucursalConstantesFunciones.setResaltarFK_IdEmpresaSucursal(resaltar);

			jPanel.setBorder(this.sucursalConstantesFunciones.resaltarFK_IdEmpresaSucursal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasSucursal.indexOfComponent(this.jPanelFK_IdPaisSucursal);

			this.jTabbedPaneBusquedasSucursal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasSucursal.getComponent(index);

			this.sucursalConstantesFunciones.setResaltarFK_IdPaisSucursal(resaltar);

			jPanel.setBorder(this.sucursalConstantesFunciones.resaltarFK_IdPaisSucursal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarSucursal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSucursal() throws Exception {

		if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSucursal();
		this.updateVisibilidadResaltarControlesFormularioSucursal();
		this.updateHabilitarResaltarControlesFormularioSucursal();
		
	}
	
	public void updateBorderResaltarControlesFormularioSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sucursalConstantesFunciones.resaltaridSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setBorder(this.sucursalConstantesFunciones.resaltaridSucursal);}
		if(this.sucursalConstantesFunciones.resaltarid_empresaSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setBorder(this.sucursalConstantesFunciones.resaltarid_empresaSucursal);}
		if(this.sucursalConstantesFunciones.resaltarid_paisSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setBorder(this.sucursalConstantesFunciones.resaltarid_paisSucursal);}
		if(this.sucursalConstantesFunciones.resaltarid_ciudadSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setBorder(this.sucursalConstantesFunciones.resaltarid_ciudadSucursal);}
		if(this.sucursalConstantesFunciones.resaltarcodigoSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setBorder(this.sucursalConstantesFunciones.resaltarcodigoSucursal);}
		if(this.sucursalConstantesFunciones.resaltarnumeroSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setBorder(this.sucursalConstantesFunciones.resaltarnumeroSucursal);}
		if(this.sucursalConstantesFunciones.resaltarnombreSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setBorder(this.sucursalConstantesFunciones.resaltarnombreSucursal);}
		if(this.sucursalConstantesFunciones.resaltardireccionSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setBorder(this.sucursalConstantesFunciones.resaltardireccionSucursal);}
		if(this.sucursalConstantesFunciones.resaltarrucSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setBorder(this.sucursalConstantesFunciones.resaltarrucSucursal);}
		if(this.sucursalConstantesFunciones.resaltartelefonoSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setBorder(this.sucursalConstantesFunciones.resaltartelefonoSucursal);}
		if(this.sucursalConstantesFunciones.resaltarfaxSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setBorder(this.sucursalConstantesFunciones.resaltarfaxSucursal);}
		if(this.sucursalConstantesFunciones.resaltarmailSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setBorder(this.sucursalConstantesFunciones.resaltarmailSucursal);}
		if(this.sucursalConstantesFunciones.resaltarresponsableSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setBorder(this.sucursalConstantesFunciones.resaltarresponsableSucursal);}
		if(this.sucursalConstantesFunciones.resaltardescripcionSucursal!=null && this.jInternalFrameDetalleFormSucursal!=null) {this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setBorder(this.sucursalConstantesFunciones.resaltardescripcionSucursal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSucursal() throws Exception {		
		if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
	
		//this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setVisible(this.sucursalConstantesFunciones.mostraridSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelidSucursal.setVisible(this.sucursalConstantesFunciones.mostraridSucursal);
		//this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_empresaSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelid_empresaSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_empresaSucursal);
		//this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_paisSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelid_paisSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_paisSucursal);
		//this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_ciudadSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelid_ciudadSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_ciudadSucursal);
			this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursal.setVisible(this.sucursalConstantesFunciones.mostrarid_ciudadSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setVisible(this.sucursalConstantesFunciones.mostrarcodigoSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelcodigoSucursal.setVisible(this.sucursalConstantesFunciones.mostrarcodigoSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setVisible(this.sucursalConstantesFunciones.mostrarnumeroSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelnumeroSucursal.setVisible(this.sucursalConstantesFunciones.mostrarnumeroSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setVisible(this.sucursalConstantesFunciones.mostrarnombreSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelnombreSucursal.setVisible(this.sucursalConstantesFunciones.mostrarnombreSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setVisible(this.sucursalConstantesFunciones.mostrardireccionSucursal);
		this.jInternalFrameDetalleFormSucursal.jPaneldireccionSucursal.setVisible(this.sucursalConstantesFunciones.mostrardireccionSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setVisible(this.sucursalConstantesFunciones.mostrarrucSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelrucSucursal.setVisible(this.sucursalConstantesFunciones.mostrarrucSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setVisible(this.sucursalConstantesFunciones.mostrartelefonoSucursal);
		this.jInternalFrameDetalleFormSucursal.jPaneltelefonoSucursal.setVisible(this.sucursalConstantesFunciones.mostrartelefonoSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setVisible(this.sucursalConstantesFunciones.mostrarfaxSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelfaxSucursal.setVisible(this.sucursalConstantesFunciones.mostrarfaxSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setVisible(this.sucursalConstantesFunciones.mostrarmailSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelmailSucursal.setVisible(this.sucursalConstantesFunciones.mostrarmailSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setVisible(this.sucursalConstantesFunciones.mostrarresponsableSucursal);
		this.jInternalFrameDetalleFormSucursal.jPanelresponsableSucursal.setVisible(this.sucursalConstantesFunciones.mostrarresponsableSucursal);
		//this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setVisible(this.sucursalConstantesFunciones.mostrardescripcionSucursal);
		this.jInternalFrameDetalleFormSucursal.jPaneldescripcionSucursal.setVisible(this.sucursalConstantesFunciones.mostrardescripcionSucursal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSucursal!=null) {
	
		this.jInternalFrameDetalleFormSucursal.jLabelidSucursal.setEnabled(this.sucursalConstantesFunciones.activaridSucursal);
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_empresaSucursal.setEnabled(this.sucursalConstantesFunciones.activarid_empresaSucursal);
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_paisSucursal.setEnabled(this.sucursalConstantesFunciones.activarid_paisSucursal);
		this.jInternalFrameDetalleFormSucursal.jComboBoxid_ciudadSucursal.setEnabled(this.sucursalConstantesFunciones.activarid_ciudadSucursal);
			this.jInternalFrameDetalleFormSucursal.jButtonid_ciudadSucursal.setEnabled(this.sucursalConstantesFunciones.activarid_ciudadSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldcodigoSucursal.setEnabled(this.sucursalConstantesFunciones.activarcodigoSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldnumeroSucursal.setEnabled(this.sucursalConstantesFunciones.activarnumeroSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreanombreSucursal.setEnabled(this.sucursalConstantesFunciones.activarnombreSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreadireccionSucursal.setEnabled(this.sucursalConstantesFunciones.activardireccionSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldrucSucursal.setEnabled(this.sucursalConstantesFunciones.activarrucSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldtelefonoSucursal.setEnabled(this.sucursalConstantesFunciones.activartelefonoSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldfaxSucursal.setEnabled(this.sucursalConstantesFunciones.activarfaxSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextFieldmailSucursal.setEnabled(this.sucursalConstantesFunciones.activarmailSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextArearesponsableSucursal.setEnabled(this.sucursalConstantesFunciones.activarresponsableSucursal);
		this.jInternalFrameDetalleFormSucursal.jTextAreadescripcionSucursal.setEnabled(this.sucursalConstantesFunciones.activardescripcionSucursal);
		}
	}
	
		
}