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

import com.bydan.erp.seguridad.util.CiudadConstantesFunciones;
import com.bydan.erp.seguridad.util.CiudadParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.CiudadParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.CiudadBean;
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
public class CiudadBeanSwingJInternalFrame extends CiudadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CiudadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Ciudad> ciudadValidator = new ClassValidator<Ciudad>(Ciudad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Ciudad ciudad;	
	public Ciudad ciudadAux;
	public Ciudad ciudadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Ciudad ciudadTotales;
	public Long idCiudadActual;
	public Long iIdNuevoCiudad=0L;
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

	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
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
	
	public Boolean isPermisoTodoCiudad;
	public Boolean isPermisoNuevoCiudad;
	public Boolean isPermisoActualizarCiudad;
	public Boolean isPermisoActualizarOriginalCiudad;
	public Boolean isPermisoEliminarCiudad;
	public Boolean isPermisoGuardarCambiosCiudad;
	public Boolean isPermisoConsultaCiudad;
	public Boolean isPermisoBusquedaCiudad;
	public Boolean isPermisoReporteCiudad;
	public Boolean isPermisoPaginacionMedioCiudad;
	public Boolean isPermisoPaginacionAltoCiudad;
	public Boolean isPermisoPaginacionTodoCiudad;
	public Boolean isPermisoCopiarCiudad;
	public Boolean isPermisoVerFormCiudad;
	public Boolean isPermisoDuplicarCiudad;
	public Boolean isPermisoOrdenCiudad;
	
	
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
	
	public CiudadParameterReturnGeneral ciudadReturnGeneral;
	public CiudadParameterReturnGeneral ciudadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCiudad=false;
	public Boolean esParaAccionDesdeFormularioCiudad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CiudadSessionBeanAdditional ciudadSessionBeanAdditional=null;
	
	public CiudadSessionBeanAdditional getCiudadSessionBeanAdditional() {
		return this.ciudadSessionBeanAdditional;
	}
	
	public void setCiudadSessionBeanAdditional(CiudadSessionBeanAdditional ciudadSessionBeanAdditional) {
		try {
			this.ciudadSessionBeanAdditional=ciudadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CiudadBeanSwingJInternalFrameAdditional ciudadBeanSwingJInternalFrameAdditional=null;
	//public class CiudadBeanSwingJInternalFrame
	
	public CiudadBeanSwingJInternalFrameAdditional getCiudadBeanSwingJInternalFrameAdditional() {
		return this.ciudadBeanSwingJInternalFrameAdditional;
	}
	
	public void setCiudadBeanSwingJInternalFrameAdditional(CiudadBeanSwingJInternalFrameAdditional ciudadBeanSwingJInternalFrameAdditional) {
		try {
			this.ciudadBeanSwingJInternalFrameAdditional=ciudadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CiudadLogic ciudadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Ciudad ciudadBean;
	public CiudadConstantesFunciones ciudadConstantesFunciones;
	//public CiudadParameterReturnGeneral ciudadReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	public ProvinciaLogic provinciaLogic;
	
	//PARAMETROS
	
	
	//public List<Ciudad> ciudads;	
	//public List<Ciudad> ciudadsEliminados;
	//public List<Ciudad> ciudadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCiudad=false;
	public Boolean isVisibilidadCeldaDuplicarCiudad=true;
	public Boolean isVisibilidadCeldaCopiarCiudad=true;
	public Boolean isVisibilidadCeldaVerFormCiudad=true;
	public Boolean isVisibilidadCeldaOrdenCiudad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCiudad=false;
	public Boolean isVisibilidadCeldaModificarCiudad=false;
	public Boolean isVisibilidadCeldaActualizarCiudad=false;
	public Boolean isVisibilidadCeldaEliminarCiudad=false;
	public Boolean isVisibilidadCeldaCancelarCiudad=false;
	public Boolean isVisibilidadCeldaGuardarCiudad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCiudad=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	
	public Long getiIdNuevoCiudad() {
		return this.iIdNuevoCiudad;
	}

	public void setiIdNuevoCiudad(Long iIdNuevoCiudad) {
		this.iIdNuevoCiudad = iIdNuevoCiudad;
	}
	
	public Long getidCiudadActual() {
		return this.idCiudadActual;
	}

	public void setidCiudadActual(Long idCiudadActual) {
		this.idCiudadActual = idCiudadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Ciudad getciudad() {
		return this.ciudad;
	}

	public void setciudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public Ciudad getciudadAux() {
		return this.ciudadAux;
	}

	public void setciudadAux(Ciudad ciudadAux) {
		this.ciudadAux = ciudadAux;
	}				
	
	public Ciudad getciudadAnterior() {
		return this.ciudadAnterior;
	}

	public void setciudadAnterior(Ciudad ciudadAnterior) {
		this.ciudadAnterior = ciudadAnterior;
	}	
	
	public Ciudad getciudadTotales() {
		return this.ciudadTotales;
	}

	public void setciudadTotales(Ciudad ciudadTotales) {
		this.ciudadTotales = ciudadTotales;
	}	
	
	public Ciudad getciudadBean() {
		return this.ciudadBean;
	}

	public void setciudadBean(Ciudad ciudadBean) {
		this.ciudadBean = ciudadBean;
	}	
	
	public CiudadParameterReturnGeneral getciudadReturnGeneral() {
		return this.ciudadReturnGeneral;
	}

	public void setciudadReturnGeneral(CiudadParameterReturnGeneral ciudadReturnGeneral) {
		this.ciudadReturnGeneral = ciudadReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

	public Long id_provinciaFK_IdProvincia=null;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CiudadLogic getCiudadLogic()	{		
		return ciudadLogic;
	}

	public void setCiudadLogic(CiudadLogic ciudadLogic) {
		this.ciudadLogic = ciudadLogic;
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
	
	public Boolean getIsEsNuevoCiudad() {
		return isEsNuevoCiudad;
	}

	public void setIsEsNuevoCiudad(Boolean isEsNuevoCiudad) {
		this.isEsNuevoCiudad = isEsNuevoCiudad;
	}

	public Boolean getEsParaAccionDesdeFormularioCiudad() {
		return esParaAccionDesdeFormularioCiudad;
	}
	
	public void setEsParaAccionDesdeFormularioCiudad(Boolean esParaAccionDesdeFormularioCiudad) {
		this.esParaAccionDesdeFormularioCiudad = esParaAccionDesdeFormularioCiudad;
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

			if(this.ciudadSessionBean==null) {
				this.ciudadSessionBean=new CiudadSessionBean();
			}

			if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(ciudadSessionBean.getlidPaisActual());
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

	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.ciudadSessionBean==null) {
				this.ciudadSessionBean=new CiudadSessionBean();
			}

			if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(ciudadSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

					if(this.ciudad!=null) {
						this.ciudad.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormCiudad!=null) {
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisCiudad.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormCiudad!=null) {
						if(this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisCiudad!=null) {
						jComboBoxid_paisFK_IdPaisCiudad.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisCiudad!=null) {
							//jComboBoxid_paisFK_IdPaisCiudad.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisCiudad.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisCiudad.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisCiudadGenerico)throws Exception
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
				jComboBoxid_paisCiudadGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisCiudadGenerico!=null && jComboBoxid_paisCiudadGenerico.getItemCount()>0) {
					jComboBoxid_paisCiudadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.ciudad!=null) {
						this.ciudad.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormCiudad!=null) {
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaCiudad.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormCiudad!=null) {
						if(this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.getItemCount()>0) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaCiudadGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaCiudadGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaCiudadGenerico!=null && jComboBoxid_provinciaCiudadGenerico.getItemCount()>0) {
					jComboBoxid_provinciaCiudadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(Ciudad ciudad,JComboBox jComboBoxid_paisCiudadGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisCiudadGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisCiudadGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				ciudad.setid_pais(paisAux.getId());
				ciudad.setpais_descripcion(CiudadConstantesFunciones.getPaisDescripcion(paisAux));
				ciudad.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(Ciudad ciudad,JComboBox jComboBoxid_provinciaCiudadGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaCiudadGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaCiudadGenerico.getSelectedItem();
			}

			if(provinciaAux!=null) {
				ciudad.setid_provincia(provinciaAux.getId());
				ciudad.setprovincia_descripcion(CiudadConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				ciudad.setProvincia(provinciaAux);			}
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

					if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCiudad!=null) { 
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCiudad!=null) { 
					}

					if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisCiudad.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisCiudad.addItem(pais);
							}
						}

						if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCiudad!=null) { 
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCiudad!=null) { 
					}

					if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCiudad!=null) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormCiudad!=null) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisCiudad.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisCiudad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCiudad!=null) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormCiudad!=null) {
							this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCiudad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CiudadConstantesFunciones.refrescarForeignKeysDescripcionesCiudad(this.ciudadLogic.getCiudads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CiudadConstantesFunciones.refrescarForeignKeysDescripcionesCiudad(this.ciudads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Provincia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//ciudadLogic.setCiudads(this.ciudads);
			ciudadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CiudadParameterReturnGeneral getCiudadParameterGeneral() {
		return this.ciudadParameterGeneral;
	}
	
	public void setCiudadParameterGeneral(CiudadParameterReturnGeneral ciudadParameterGeneral) {
		this.ciudadParameterGeneral = ciudadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCiudad() {
		return isPermisoTodoCiudad;
	}

	public void setIsPermisoTodoCiudad(Boolean isPermisoTodoCiudad) {
		this.isPermisoTodoCiudad = isPermisoTodoCiudad;
	}

	public Boolean getIsPermisoNuevoCiudad() {
		return isPermisoNuevoCiudad;
	}

	public void setIsPermisoNuevoCiudad(Boolean isPermisoNuevoCiudad) {
		this.isPermisoNuevoCiudad = isPermisoNuevoCiudad;
	}

	public Boolean getIsPermisoActualizarCiudad() {
		return isPermisoActualizarCiudad;
	}

	public void setIsPermisoActualizarCiudad(Boolean isPermisoActualizarCiudad) {
		this.isPermisoActualizarCiudad = isPermisoActualizarCiudad;
	}

	public Boolean getIsPermisoEliminarCiudad() {
		return isPermisoEliminarCiudad;
	}

	public void setIsPermisoEliminarCiudad(Boolean isPermisoEliminarCiudad) {
		this.isPermisoEliminarCiudad = isPermisoEliminarCiudad;
	}

	public Boolean getIsPermisoGuardarCambiosCiudad() {
		return isPermisoGuardarCambiosCiudad;
	}

	public void setIsPermisoGuardarCambiosCiudad(Boolean isPermisoGuardarCambiosCiudad) {
		this.isPermisoGuardarCambiosCiudad = isPermisoGuardarCambiosCiudad;
	}
	
	public Boolean getIsPermisoConsultaCiudad() {
		return isPermisoConsultaCiudad;
	}

	public void setIsPermisoConsultaCiudad(Boolean isPermisoConsultaCiudad) {
		this.isPermisoConsultaCiudad = isPermisoConsultaCiudad;
	}

	public Boolean getIsPermisoBusquedaCiudad() {
		return isPermisoBusquedaCiudad;
	}

	public void setIsPermisoBusquedaCiudad(Boolean isPermisoBusquedaCiudad) {
		this.isPermisoBusquedaCiudad = isPermisoBusquedaCiudad;
	}

	public Boolean getIsPermisoReporteCiudad() {
		return isPermisoReporteCiudad;
	}

	public void setIsPermisoReporteCiudad(Boolean isPermisoReporteCiudad) {
		this.isPermisoReporteCiudad = isPermisoReporteCiudad;
	}
	
	public Boolean getIsPermisoPaginacionMedioCiudad() {
		return isPermisoPaginacionMedioCiudad;
	}

	public void setIsPermisoPaginacionMedioCiudad(Boolean isPermisoPaginacionMedioCiudad) {
		this.isPermisoPaginacionMedioCiudad = isPermisoPaginacionMedioCiudad;
	}
	
	public Boolean getIsPermisoPaginacionTodoCiudad() {
		return isPermisoPaginacionTodoCiudad;
	}

	public void setIsPermisoPaginacionTodoCiudad(Boolean isPermisoPaginacionTodoCiudad) {
		this.isPermisoPaginacionTodoCiudad = isPermisoPaginacionTodoCiudad;
	}
	
	public Boolean getIsPermisoPaginacionAltoCiudad() {
		return isPermisoPaginacionAltoCiudad;
	}

	public void setIsPermisoPaginacionAltoCiudad(Boolean isPermisoPaginacionAltoCiudad) {
		this.isPermisoPaginacionAltoCiudad = isPermisoPaginacionAltoCiudad;
	}
	
	public Boolean getIsPermisoCopiarCiudad() {
		return isPermisoCopiarCiudad;
	}

	public void setIsPermisoCopiarCiudad(Boolean isPermisoCopiarCiudad) {
		this.isPermisoCopiarCiudad = isPermisoCopiarCiudad;
	}
	
	public Boolean getIsPermisoVerFormCiudad() {
		return isPermisoVerFormCiudad;
	}

	public void setIsPermisoVerFormCiudad(Boolean isPermisoVerFormCiudad) {
		this.isPermisoVerFormCiudad = isPermisoVerFormCiudad;
	}
	
	public Boolean getIsPermisoDuplicarCiudad() {
		return isPermisoDuplicarCiudad;
	}

	public void setIsPermisoDuplicarCiudad(Boolean isPermisoDuplicarCiudad) {
		this.isPermisoDuplicarCiudad = isPermisoDuplicarCiudad;
	}
	
	public Boolean getIsPermisoOrdenCiudad() {
		return isPermisoOrdenCiudad;
	}

	public void setIsPermisoOrdenCiudad(Boolean isPermisoOrdenCiudad) {
		this.isPermisoOrdenCiudad = isPermisoOrdenCiudad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCiudad() {
		return isVisibilidadCeldaNuevoCiudad;
	}

	public void setIsVisibilidadCeldaNuevoCiudad(Boolean isVisibilidadCeldaNuevoCiudad) {
		this.isVisibilidadCeldaNuevoCiudad = isVisibilidadCeldaNuevoCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCiudad() {
		return isVisibilidadCeldaDuplicarCiudad;
	}

	public void setIsVisibilidadCeldaDuplicarCiudad(Boolean isVisibilidadCeldaDuplicarCiudad) {
		this.isVisibilidadCeldaDuplicarCiudad = isVisibilidadCeldaDuplicarCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCiudad() {
		return isVisibilidadCeldaCopiarCiudad;
	}

	public void setIsVisibilidadCeldaCopiarCiudad(Boolean isVisibilidadCeldaCopiarCiudad) {
		this.isVisibilidadCeldaCopiarCiudad = isVisibilidadCeldaCopiarCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCiudad() {
		return isVisibilidadCeldaVerFormCiudad;
	}

	public void setIsVisibilidadCeldaVerFormCiudad(Boolean isVisibilidadCeldaVerFormCiudad) {
		this.isVisibilidadCeldaVerFormCiudad = isVisibilidadCeldaVerFormCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCiudad() {
		return isVisibilidadCeldaOrdenCiudad;
	}

	public void setIsVisibilidadCeldaOrdenCiudad(Boolean isVisibilidadCeldaOrdenCiudad) {
		this.isVisibilidadCeldaOrdenCiudad = isVisibilidadCeldaOrdenCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCiudad() {
		return isVisibilidadCeldaNuevoRelacionesCiudad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCiudad(Boolean isVisibilidadCeldaNuevoRelacionesCiudad) {
		this.isVisibilidadCeldaNuevoRelacionesCiudad = isVisibilidadCeldaNuevoRelacionesCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCiudad() {
		return isVisibilidadCeldaModificarCiudad;
	}

	public void setIsVisibilidadCeldaModificarCiudad(Boolean isVisibilidadCeldaModificarCiudad) {
		this.isVisibilidadCeldaModificarCiudad = isVisibilidadCeldaModificarCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCiudad() {
		return isVisibilidadCeldaActualizarCiudad;
	}

	public void setIsVisibilidadCeldaActualizarCiudad(Boolean isVisibilidadCeldaActualizarCiudad) {
		this.isVisibilidadCeldaActualizarCiudad = isVisibilidadCeldaActualizarCiudad;
	}

	public Boolean getIsVisibilidadCeldaEliminarCiudad() {
		return isVisibilidadCeldaEliminarCiudad;
	}

	public void setIsVisibilidadCeldaEliminarCiudad(Boolean isVisibilidadCeldaEliminarCiudad) {
		this.isVisibilidadCeldaEliminarCiudad = isVisibilidadCeldaEliminarCiudad;
	}

	public Boolean getIsVisibilidadCeldaCancelarCiudad() {
		return isVisibilidadCeldaCancelarCiudad;
	}

	public void setIsVisibilidadCeldaCancelarCiudad(Boolean isVisibilidadCeldaCancelarCiudad) {
		this.isVisibilidadCeldaCancelarCiudad = isVisibilidadCeldaCancelarCiudad;
	}

	public Boolean getIsVisibilidadCeldaGuardarCiudad() {
		return isVisibilidadCeldaGuardarCiudad;
	}

	public void setIsVisibilidadCeldaGuardarCiudad(Boolean isVisibilidadCeldaGuardarCiudad) {
		this.isVisibilidadCeldaGuardarCiudad = isVisibilidadCeldaGuardarCiudad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCiudad() {
		return isVisibilidadCeldaGuardarCambiosCiudad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCiudad(Boolean isVisibilidadCeldaGuardarCambiosCiudad) {
		this.isVisibilidadCeldaGuardarCambiosCiudad = isVisibilidadCeldaGuardarCambiosCiudad;
	}
		
	public CiudadSessionBean getciudadSessionBean() {
		return this.ciudadSessionBean;
	}
	
	public void setciudadSessionBean(CiudadSessionBean ciudadSessionBean) {
		this.ciudadSessionBean=ciudadSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCiudad(Ciudad ciudad)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(ciudad,null);
				this.setActualParaGuardarProvinciaForeignKey(ciudad,null);
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
	
	public void bugActualizarReferenciaActual(Ciudad ciudad,Ciudad ciudadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCiudad(ciudad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ciudadAux.setId(ciudad.getId());
		ciudadAux.setVersionRow(ciudad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCiudad();
		
			int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = ciudadValidator.getInvalidValues(this.ciudad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			ciudadLogic.setDatosCliente(datosCliente);
			ciudadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				ciudadAux=new  Ciudad();
				
				ciudadAux.setIsNew(true);
				ciudadAux.setIsChanged(true);
				
				ciudadAux.setCiudadOriginal(this.ciudad);
				
				ciudadAux.setId(this.ciudad.getId());	
				ciudadAux.setVersionRow(this.ciudad.getVersionRow());	
				ciudadAux.setid_pais(this.ciudad.getid_pais());	
				ciudadAux.setid_provincia(this.ciudad.getid_provincia());	
				ciudadAux.setcodigo(this.ciudad.getcodigo());	
				ciudadAux.setnombre(this.ciudad.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ciudadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ciudadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(ciudadAux,ciudadLogic.getCiudads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ciudadAux,ciudads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.ciudadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ciudadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadLogic.saveCiudads();//WithConnection
						//ciudadLogic.getSetVersionRowCiudads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ciudad,ciudadAux);
					
					this.refrescarForeignKeysDescripcionesCiudad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				ciudadAux=new  Ciudad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.ciudadSessionBean.getEsGuardarRelacionado() 
					|| (this.ciudadSessionBean.getEsGuardarRelacionado() && this.ciudad.getId()>=0)) {
						
					ciudadAux.setIsNew(false);
				}
				
				ciudadAux.setIsDeleted(false);
			
				ciudadAux.setId(this.ciudad.getId());	
				ciudadAux.setVersionRow(this.ciudad.getVersionRow());	
				ciudadAux.setid_pais(this.ciudad.getid_pais());	
				ciudadAux.setid_provincia(this.ciudad.getid_provincia());	
				ciudadAux.setcodigo(this.ciudad.getcodigo());	
				ciudadAux.setnombre(this.ciudad.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ciudadAux,ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ciudadAux,ciudads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.ciudadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ciudadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadLogic.saveCiudads();//WithConnection
						//ciudadLogic.getSetVersionRowCiudads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.ciudad,ciudadAux);
					
					this.refrescarForeignKeysDescripcionesCiudad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				ciudadAux=new  Ciudad();
				
				ciudadAux.setIsNew(false);
				ciudadAux.setIsChanged(false);
				
				ciudadAux.setIsDeleted(true);
				
				ciudadAux.setId(this.ciudad.getId());	
				ciudadAux.setVersionRow(this.ciudad.getVersionRow());	
				ciudadAux.setid_pais(this.ciudad.getid_pais());	
				ciudadAux.setid_provincia(this.ciudad.getid_provincia());	
				ciudadAux.setcodigo(this.ciudad.getcodigo());	
				ciudadAux.setnombre(this.ciudad.getnombre());	
				
				if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.ciudadAux.getId()>=0) {	
						this.ciudadsEliminados.add(ciudadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(ciudadAux,ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ciudadAux,ciudads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.ciudadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.ciudadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadLogic.saveCiudads();//WithConnection
						//ciudadLogic.getSetVersionRowCiudads();//WithConnection
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
					this.ciudadLogic.getCiudads().addAll(this.ciudadsEliminados);
					
					ciudadLogic.saveCiudads();//WithConnection
					//ciudadLogic.getSetVersionRowCiudads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCiudad();
				
				this.ciudadsEliminados= new ArrayList<Ciudad>();		
			}
			
			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ciudad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.ciudad=ciudadAux;
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
      		//this.finishProcessCiudad();
      	}
		
	}	
	
	public void actualizarRelaciones(Ciudad ciudadLocal) throws Exception {
		
		if(this.ciudadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Ciudad ciudadLocal) throws Exception {	
		if(this.ciudadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				ciudadLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				ciudadLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCiudadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ciudadValidator.getInvalidValues(this.ciudad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Ciudad ciudad,List<Ciudad> ciudads) throws Exception {
		try	{		
			CiudadConstantesFunciones.actualizarLista(ciudad,ciudads,this.ciudadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Ciudad ciudad,List<Ciudad> ciudads) throws Exception {
		try	{			
			CiudadConstantesFunciones.actualizarSelectedLista(ciudad,ciudads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Ciudad> ciudadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ciudadsLocal=this.ciudadLogic.getCiudads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ciudadsLocal=this.ciudads;
			}
			//ARCHITECTURE
		
			for(Ciudad ciudadLocal:ciudadsLocal) {
				if(this.permiteMantenimiento(ciudadLocal) && ciudadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CiudadConstantesFunciones.getCiudadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CiudadConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelid_paisCiudad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CiudadConstantesFunciones.IDPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelid_provinciaCiudad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CiudadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelcodigoCiudad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CiudadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelnombreCiudad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCiudad.jLabelid_paisCiudad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCiudad.jLabelid_provinciaCiudad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCiudad.jLabelcodigoCiudad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCiudad.jLabelnombreCiudad,"");
		
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
		this.iIdNuevoCiudad--;	
		
		
		this.ciudadAux=new Ciudad();
		
		this.ciudadAux.setId(this.iIdNuevoCiudad);
		this.ciudadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ciudadLogic.getCiudads().add(this.ciudadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ciudads.add(this.ciudadAux);
		}
		//ARCHITECTURE
		
		this.ciudad=this.ciudadAux;
		
		if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCiudad(this.ciudad);
			this.setVariablesObjetoActualToFormularioForeignKeyCiudad(this.ciudad);
		}
				
		//this.setDefaultControlesCiudad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCiudad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCiudad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCiudad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCiudad(this.ciudadBean,this.ciudad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CiudadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.ciudadSessionBean.getConGuardarRelaciones()) {
			classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.ciudadReturnGeneral=ciudadLogic.procesarEventosCiudadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ciudadLogic.getCiudads(),this.ciudad,this.ciudadParameterGeneral,this.isEsNuevoCiudad,classes);//this.ciudadLogic.getCiudad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCiudad(this.ciudadReturnGeneral,this.ciudadBean,false);
		
		if(this.ciudadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCiudad(this.ciudadReturnGeneral.getCiudad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCiudad(this.ciudadReturnGeneral.getCiudad());
		}
		
		if(this.ciudadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCiudad(this.ciudadReturnGeneral.getCiudad(),classes);//this.ciudadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCiudad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCiudad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CiudadBeanSwingJInternalFrameAdditional.RecargarFormCiudad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCiudad(false);
						
			if(ciudadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCiudad();
			}
			
			this.actualizarVisualTableDatosCiudad();
			
			this.jTableDatosCiudad.setRowSelectionInterval(this.getIndiceNuevoCiudad(), this.getIndiceNuevoCiudad());
			
			this.seleccionarFilaTablaCiudadActual();
						
			this.actualizarEstadoCeldasBotonesCiudad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCiudad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setEnabled(isHabilitar && this.ciudadConstantesFunciones.activarcodigoCiudad);
		this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setEnabled(isHabilitar && this.ciudadConstantesFunciones.activarnombreCiudad);	
		
		this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setEnabled(isHabilitar && this.ciudadConstantesFunciones.activarid_paisCiudad);
		this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setEnabled(isHabilitar && this.ciudadConstantesFunciones.activarid_provinciaCiudad);
	};
	
	public void setDefaultControlesCiudad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCiudad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ciudadSessionBean.setConGuardarRelaciones(true);			
			this.ciudadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.setVisible(true);
			
					
		} else {
			//this.ciudadSessionBean.setConGuardarRelaciones(false);			
			this.ciudadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCiudad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
				if(ciudadAux.getId().equals(this.iIdNuevoCiudad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ciudad ciudadAux:this.ciudads) {
				if(ciudadAux.getId().equals(this.iIdNuevoCiudad)) {
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
	
	public int getIndiceActualCiudad(Ciudad ciudad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
				if(ciudadAux.getId().equals(ciudad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ciudad ciudadAux:this.ciudads) {
				if(ciudadAux.getId().equals(ciudad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCiudad(Ciudad ciudadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
				if(ciudadAux.getCiudadOriginal().getId().equals(ciudadOriginal.getId())) {
					existe=true;
					ciudadOriginal.setId(ciudadAux.getId());
					ciudadOriginal.setVersionRow(ciudadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ciudad ciudadAux:this.ciudads) {
				if(ciudadAux.getCiudadOriginal().getId().equals(ciudadOriginal.getId())) {
					existe=true;
					ciudadOriginal.setId(ciudadAux.getId());
					ciudadOriginal.setVersionRow(ciudadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCiudad(Boolean esParaCancelar) throws Exception {
		ciudadsAux=new ArrayList<Ciudad>();
		ciudadAux=new Ciudad();
		
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
					if(ciudadAux.getId()<0) {
						ciudadsAux.add(ciudadAux);
					}		
				}
				this.iIdNuevoCiudad=0L;
				this.ciudadLogic.getCiudads().removeAll(ciudadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ciudad ciudadAux:this.ciudads) {
					if(ciudadAux.getId()<0) {
						ciudadsAux.add(ciudadAux);
					}		
				}
				this.iIdNuevoCiudad=0L;
				this.ciudads.removeAll(ciudadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCiudad 
					&& this.ciudadLogic.getCiudads().size()>0
					) {
					ciudadAux=this.ciudadLogic.getCiudads().get(this.ciudadLogic.getCiudads().size() - 1);
				
					if(ciudadAux.getId()<0) {
						this.ciudadLogic.getCiudads().remove(ciudadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCiudad && this.ciudads.size()>0) {
					ciudadAux=this.ciudads.get(this.ciudads.size() - 1);
				
					if(ciudadAux.getId()<0) {
						this.ciudads.remove(ciudadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCiudad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ciudad.getId()<0) {
				this.ciudadLogic.getCiudads().remove(this.ciudad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ciudad.getId()<0) {
				this.ciudads.remove(this.ciudad);
			}
		}			
	}
	
	public void setEstadosInicialesCiudad(List<Ciudad> ciudadsAux) throws Exception {
		CiudadConstantesFunciones.setEstadosInicialesCiudad(ciudadsAux);
	}
	
	public void setEstadosInicialesCiudad(Ciudad ciudadAux) throws Exception {
		CiudadConstantesFunciones.setEstadosInicialesCiudad(ciudadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCiudadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCiudadActual()) {
				if(!this.isEsNuevoCiudad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCiudad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCiudadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ciudad ?", "MANTENIMIENTO DE Ciudad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Ciudad ciudad) throws Exception {
		CiudadConstantesFunciones.seleccionarAsignar(this.ciudad,ciudad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCiudad=this.isPermisoActualizarOriginalCiudad;
			
			
			this.seleccionarAsignar(ciudad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CiudadConstantesFunciones.quitarEspaciosCiudad(this.ciudad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCiudad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ciudadSessionBean.setsFuncionBusquedaRapida(this.ciudadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCiudad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCiudad(esParaCancelar);				
				this.cancelarNuevoCiudad(esParaCancelar);								
			}
			
			this.ciudad=new Ciudad();
			
			this.inicializarCiudad();
			
			this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCiudad() throws Exception {
		try {
			CiudadConstantesFunciones.inicializarCiudad(this.ciudad);
			
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
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ciudadLogic.getCiudads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCiudads(String sAccionBusqueda,List<Ciudad> ciudadsParaReportes) throws Exception {
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
					sPathReporteFinal="Ciudad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CiudadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CiudadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Ciudad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ciudades");		
		parameters.put("busquedapor", CiudadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCiudad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CiudadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CiudadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCiudad=new JRBeanArrayDataSource(CiudadJInternalFrame.TraerCiudadBeans(ciudadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCiudad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CiudadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CiudadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CiudadBean.TraerCiudadBeans(ciudadsParaReportes).toArray()));
							
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
				this.generarExcelReporteCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCiudadActionPerformed(null);
					//this.generarExcelReporteCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCiudads(sAccionBusqueda,sTipoArchivoReporte,ciudadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCiudads(String sAccionBusqueda,String sTipoArchivoReporte,List<Ciudad> ciudadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ciudads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCiudad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Ciudad ciudad : ciudadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CiudadConstantesFunciones.generarExcelReporteDataCiudad("NORMAL",row,workbook,ciudad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCiudad(String sTipo,Row row,Workbook workbook) {
		
		CiudadConstantesFunciones.generarExcelReporteHeaderCiudad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCiudads(String sAccionBusqueda,String sTipoArchivoReporte,List<Ciudad> ciudadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ciudads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Ciudad ciudad : ciudadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CiudadConstantesFunciones.getCiudadDescripcion(ciudad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CiudadConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ciudad.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CiudadConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ciudad.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CiudadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CiudadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ciudad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CiudadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CiudadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ciudad.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCiudads(String sAccionBusqueda,String sTipoArchivoReporte,List<Ciudad> ciudadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Ciudad> ciudadsRespaldo=null;
		
		classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ciudadLogic.setDatosCliente(this.datosCliente);
		this.ciudadLogic.setDatosDeep(this.datosDeep);
		this.ciudadLogic.setIsConDeep(true);
		
		ciudadsRespaldo=this.ciudadLogic.getCiudads();
		
		this.ciudadLogic.setCiudads(ciudadsParaReportes);	
		this.ciudadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ciudadsParaReportes=this.ciudadLogic.getCiudads();
		this.ciudadLogic.setCiudads(ciudadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Ciudads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCiudad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Ciudad ciudad : ciudadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCiudad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CiudadConstantesFunciones.generarExcelReporteDataCiudad("NORMAL",row,workbook,ciudad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CiudadConstantesFunciones.getCiudadDescripcion(ciudad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCiudad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCiudad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCiudad() throws Exception {		
		this.startProcessCiudad(true);
	}
	
	public void startProcessCiudad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCiudad ,this.jPanelParametrosReportesCiudad, this.jScrollPanelDatosCiudad,this.jPanelPaginacionCiudad, this.jScrollPanelDatosEdicionCiudad, this.jPanelAccionesCiudad,this.jPanelAccionesFormularioCiudad,this.jmenuBarCiudad,this.jmenuBarDetalleCiudad,this.jTtoolBarCiudad,this.jTtoolBarDetalleCiudad);		
		
		final JTabbedPane jTabbedPaneBusquedasCiudad=this.jTabbedPaneBusquedasCiudad; 
		
		final JPanel jPanelParametrosReportesCiudad=this.jPanelParametrosReportesCiudad;
		//final JScrollPane jScrollPanelDatosCiudad=this.jScrollPanelDatosCiudad;
		final JTable jTableDatosCiudad=this.jTableDatosCiudad;		
		final JPanel jPanelPaginacionCiudad=this.jPanelPaginacionCiudad;
		//final JScrollPane jScrollPanelDatosEdicionCiudad=this.jScrollPanelDatosEdicionCiudad;
		final JPanel jPanelAccionesCiudad=this.jPanelAccionesCiudad;
		
		JPanel jPanelCamposAuxiliarCiudad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCiudad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			jPanelCamposAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jPanelCamposCiudad;
			jPanelAccionesFormularioAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jPanelAccionesFormularioCiudad;
		}
		
		final JPanel jPanelCamposCiudad=jPanelCamposAuxiliarCiudad;
		final JPanel jPanelAccionesFormularioCiudad=jPanelAccionesFormularioAuxiliarCiudad;
		
		
		final JMenuBar jmenuBarCiudad=this.jmenuBarCiudad;
		final JToolBar jTtoolBarCiudad=this.jTtoolBarCiudad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCiudad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCiudad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			jmenuBarDetalleAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jmenuBarDetalleCiudad;
			jTtoolBarDetalleAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jTtoolBarDetalleCiudad;
		}
		
		final JMenuBar jmenuBarDetalleCiudad=jmenuBarDetalleAuxiliarCiudad;
		final JToolBar jTtoolBarDetalleCiudad=jTtoolBarDetalleAuxiliarCiudad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCiudad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCiudad;
			processRunnable.jTableDatos=jTableDatosCiudad;
			processRunnable.jPanelCampos=jPanelCamposCiudad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCiudad;
			processRunnable.jPanelAcciones=jPanelAccionesCiudad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCiudad;
			
			
			processRunnable.jmenuBar=jmenuBarCiudad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCiudad;
			processRunnable.jTtoolBar=jTtoolBarCiudad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCiudad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCiudad ,jPanelParametrosReportesCiudad,jTableDatosCiudad, /*jScrollPanelDatosCiudad,*/jPanelCamposCiudad,jPanelPaginacionCiudad, /*jScrollPanelDatosEdicionCiudad,*/ jPanelAccionesCiudad,jPanelAccionesFormularioCiudad,jmenuBarCiudad,jmenuBarDetalleCiudad,jTtoolBarCiudad,jTtoolBarDetalleCiudad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCiudad ,jPanelParametrosReportesCiudad, jScrollPanelDatosCiudad,jPanelPaginacionCiudad, jScrollPanelDatosEdicionCiudad, jPanelAccionesCiudad,jPanelAccionesFormularioCiudad,jmenuBarCiudad,jmenuBarDetalleCiudad,jTtoolBarCiudad,jTtoolBarDetalleCiudad);
						
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
	
	public void finishProcessCiudad() {// throws Exception 
		this.finishProcessCiudad(true);
	}
	
	public void finishProcessCiudad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCiudad ,this.jPanelParametrosReportesCiudad, this.jScrollPanelDatosCiudad,this.jPanelPaginacionCiudad, this.jScrollPanelDatosEdicionCiudad, this.jPanelAccionesCiudad,this.jPanelAccionesFormularioCiudad,this.jmenuBarCiudad,this.jmenuBarDetalleCiudad,this.jTtoolBarCiudad,this.jTtoolBarDetalleCiudad);		
		
		final JTabbedPane jTabbedPaneBusquedasCiudad=this.jTabbedPaneBusquedasCiudad; 
		
		final JPanel jPanelParametrosReportesCiudad=this.jPanelParametrosReportesCiudad;
		//final JScrollPane jScrollPanelDatosCiudad=this.jScrollPanelDatosCiudad;
		final JTable jTableDatosCiudad=this.jTableDatosCiudad;		
		final JPanel jPanelPaginacionCiudad=this.jPanelPaginacionCiudad;
		//final JScrollPane jScrollPanelDatosEdicionCiudad=this.jScrollPanelDatosEdicionCiudad;
		final JPanel jPanelAccionesCiudad=this.jPanelAccionesCiudad;
		
		JPanel jPanelCamposAuxiliarCiudad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCiudad=new JPanel();
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			jPanelCamposAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jPanelCamposCiudad;
			jPanelAccionesFormularioAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jPanelAccionesFormularioCiudad;
		}
		
		final JPanel jPanelCamposCiudad=jPanelCamposAuxiliarCiudad;
		final JPanel jPanelAccionesFormularioCiudad=jPanelAccionesFormularioAuxiliarCiudad;
		
		
		final JMenuBar jmenuBarCiudad=this.jmenuBarCiudad;		
		final JToolBar jTtoolBarCiudad=this.jTtoolBarCiudad;
				
		JMenuBar jmenuBarDetalleAuxiliarCiudad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCiudad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			jmenuBarDetalleAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jmenuBarDetalleCiudad;
			jTtoolBarDetalleAuxiliarCiudad=this.jInternalFrameDetalleFormCiudad.jTtoolBarDetalleCiudad;		
		}
		
		final JMenuBar jmenuBarDetalleCiudad=jmenuBarDetalleAuxiliarCiudad;
		final JToolBar jTtoolBarDetalleCiudad=jTtoolBarDetalleAuxiliarCiudad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCiudad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCiudad;
			processRunnable.jTableDatos=jTableDatosCiudad;
			processRunnable.jPanelCampos=jPanelCamposCiudad;
			processRunnable.jPanelPaginacion=jPanelPaginacionCiudad;
			processRunnable.jPanelAcciones=jPanelAccionesCiudad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCiudad;
			
			
			processRunnable.jmenuBar=jmenuBarCiudad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCiudad;
			processRunnable.jTtoolBar=jTtoolBarCiudad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCiudad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCiudad ,jPanelParametrosReportesCiudad, jTableDatosCiudad,/*jScrollPanelDatosCiudad,*/jPanelCamposCiudad,jPanelPaginacionCiudad, /*jScrollPanelDatosEdicionCiudad,*/ jPanelAccionesCiudad,jPanelAccionesFormularioCiudad,jmenuBarCiudad,jmenuBarDetalleCiudad,jTtoolBarCiudad,jTtoolBarDetalleCiudad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCiudad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCiudad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCiudad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCiudad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCiudad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCiudad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCiudad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCiudad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCiudad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ciudadConstantesFunciones.getsFinalQueryCiudad();
		String  finalQueryPaginacionTodos=this.ciudadConstantesFunciones.getsFinalQueryCiudad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CiudadConstantesFunciones.getArrayColumnasGlobalesNoCiudad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ciudadsEliminados= new ArrayList<Ciudad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCiudad();
		
				///*CiudadSessionBean*/this.ciudadSessionBean=new CiudadSessionBean();
			
			if(this.ciudadSessionBean==null) {
				this.ciudadSessionBean=new CiudadSessionBean();
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
					this.iNumeroPaginacion=CiudadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CiudadConstantesFunciones.getClassesForeignKeysOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ciudad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ciudadsAux= new ArrayList<Ciudad>();
			
				
			ciudadLogic.setDatosCliente(this.datosCliente);
			ciudadLogic.setDatosDeep(this.datosDeep);
			ciudadLogic.setIsConDeep(true);
			
			
			ciudadLogic.getCiudadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					ciudadLogic.getTodosCiudads(finalQueryGlobal,pagination);
					
					//ciudadLogic.getTodosCiudadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(ciudadLogic.getCiudads()==null|| ciudadLogic.getCiudads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ciudadsAux= new ArrayList<Ciudad>();
							ciudadsAux.addAll(ciudadLogic.getCiudads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudadsAux= new ArrayList<Ciudad>();
							ciudadsAux.addAll(ciudads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ciudadLogic.getTodosCiudads(finalQueryGlobal+"",this.pagination);												
							
							//ciudadLogic.getTodosCiudadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCiudads("Todos",ciudadLogic.getCiudads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							ciudadLogic.setCiudads(new ArrayList<Ciudad>());					
							ciudadLogic.getCiudads().addAll(ciudadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudads=new ArrayList<Ciudad>();
							ciudads.addAll(ciudadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCiudad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCiudad=this.idActual;
				
				} else if(this.idCiudadActual!=null && this.idCiudadActual!=0L) {
					idCiudad=idCiudadActual;
				}
				
					
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndicePorId(idCiudad);
				
				this.ciudads=new ArrayList<Ciudad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					ciudadLogic.getEntity(idCiudad);
					
					//ciudadLogic.getEntityWithConnection(idCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.setCiudads(new ArrayList<Ciudad>());
					ciudadLogic.getCiudads().add(ciudadLogic.getCiudad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ciudads=new ArrayList<Ciudad>();
					this.ciudads.add(ciudad);
				}
				
				if(ciudadLogic.getCiudad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ciudadLogic.getCiudadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ciudadLogic.getCiudads()==null||ciudadLogic.getCiudads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ciudads==null|| ciudads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadsAux=new ArrayList<Ciudad>();
						ciudadsAux.addAll(ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudadsAux=new ArrayList<Ciudad>();
							ciudadsAux.addAll(ciudads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ciudadLogic.getCiudadsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCiudads("BusquedaPorNombre",ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCiudads("BusquedaPorNombre",ciudads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadLogic.setCiudads(new ArrayList<Ciudad>());
						ciudadLogic.getCiudads().addAll(ciudadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudads=new ArrayList<Ciudad>();
							ciudads.addAll(ciudadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ciudadLogic.getCiudadsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ciudadLogic.getCiudads()==null||ciudadLogic.getCiudads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ciudads==null|| ciudads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadsAux=new ArrayList<Ciudad>();
						ciudadsAux.addAll(ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudadsAux=new ArrayList<Ciudad>();
							ciudadsAux.addAll(ciudads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ciudadLogic.getCiudadsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CiudadConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCiudads("FK_IdPais",ciudadLogic.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCiudads("FK_IdPais",ciudads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadLogic.setCiudads(new ArrayList<Ciudad>());
						ciudadLogic.getCiudads().addAll(ciudadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudads=new ArrayList<Ciudad>();
							ciudads.addAll(ciudadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCiudad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCiudad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ciudadLogic.getCiudads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ciudads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ciudadLogic.getCiudads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ciudads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Ciudad ciudad) {
		Boolean permite=true;
		
		if(this.ciudad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CiudadConstantesFunciones.getOrderByListaCiudad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CiudadConstantesFunciones.getOrderByListaCiudad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ciudad ciudad:ciudadLogic.getCiudads()) {
				if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
					ciudadTotales=ciudad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ciudad ciudad:this.ciudads) {
				if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
					ciudadTotales=ciudad;
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
			this.ciudadAux=new Ciudad();
			this.ciudadAux.setsType(Constantes2.S_TOTALES);
			this.ciudadAux.setIsNew(false);
			this.ciudadAux.setIsChanged(false);
			this.ciudadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CiudadConstantesFunciones.TotalizarValoresFilaCiudad(this.ciudadLogic.getCiudads(),this.ciudadAux);
				
				this.ciudadLogic.getCiudads().add(this.ciudadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CiudadConstantesFunciones.TotalizarValoresFilaCiudad(this.ciudads,this.ciudadAux);
				
				this.ciudads.add(this.ciudadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ciudadTotales=new Ciudad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ciudadLogic.getCiudads().remove(ciudadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ciudads.remove(ciudadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ciudadTotales=new Ciudad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Ciudad ciudad:ciudadLogic.getCiudads()) {
				if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
					ciudadTotales=ciudad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CiudadConstantesFunciones.TotalizarValoresFilaCiudad(this.ciudadLogic.getCiudads(),ciudadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Ciudad ciudad:this.ciudads) {
				if(ciudad.getsType().equals(Constantes2.S_TOTALES)) {
					ciudadTotales=ciudad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CiudadConstantesFunciones.TotalizarValoresFilaCiudad(this.ciudads,ciudadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCiudadsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCiudadsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCiudadsFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCiudadPorIdPaisPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorIdPaisPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getCiudadsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCiudadsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCiudadsFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadsFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCiudadPorIdPaisPorNombre(Long id_pais,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLogic.getCiudadPorIdPaisPorNombre(id_pais,nombre);
				
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
	
	public void inicializarPermisosCiudad() {
		this.isPermisoTodoCiudad=false;
		this.isPermisoNuevoCiudad=false;
		this.isPermisoActualizarCiudad=false;
		this.isPermisoActualizarOriginalCiudad=false;
		this.isPermisoEliminarCiudad=false;
		this.isPermisoGuardarCambiosCiudad=false;
		this.isPermisoConsultaCiudad=false;
		this.isPermisoBusquedaCiudad=false;
		this.isPermisoReporteCiudad=false;		
		this.isPermisoOrdenCiudad=false;		
		this.isPermisoPaginacionMedioCiudad=false;		
		this.isPermisoPaginacionAltoCiudad=false;
		this.isPermisoPaginacionTodoCiudad=false;
		this.isPermisoCopiarCiudad=false;		
		this.isPermisoVerFormCiudad=false;		
		this.isPermisoDuplicarCiudad=false;		
		this.isPermisoOrdenCiudad=false;		
	}
	
	public void setPermisosUsuarioCiudad(Boolean isPermiso) {
		this.isPermisoTodoCiudad=isPermiso;
		this.isPermisoNuevoCiudad=isPermiso;
		this.isPermisoActualizarCiudad=isPermiso;
		this.isPermisoActualizarOriginalCiudad=isPermiso;
		this.isPermisoEliminarCiudad=isPermiso;
		this.isPermisoGuardarCambiosCiudad=isPermiso;
		this.isPermisoConsultaCiudad=isPermiso;
		this.isPermisoBusquedaCiudad=isPermiso;
		this.isPermisoReporteCiudad=isPermiso;
		this.isPermisoOrdenCiudad=isPermiso;		
		this.isPermisoPaginacionMedioCiudad=isPermiso;		
		this.isPermisoPaginacionAltoCiudad=isPermiso;		
		this.isPermisoPaginacionTodoCiudad=isPermiso;		
		this.isPermisoCopiarCiudad=isPermiso;		
		this.isPermisoVerFormCiudad=isPermiso;		
		this.isPermisoDuplicarCiudad=isPermiso;
		this.isPermisoOrdenCiudad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCiudad(Boolean isPermiso) {
		//this.isPermisoTodoCiudad=isPermiso;
		this.isPermisoNuevoCiudad=isPermiso;
		this.isPermisoActualizarCiudad=isPermiso;
		this.isPermisoActualizarOriginalCiudad=isPermiso;
		this.isPermisoEliminarCiudad=isPermiso;
		this.isPermisoGuardarCambiosCiudad=isPermiso;
		//this.isPermisoConsultaCiudad=isPermiso;
		//this.isPermisoBusquedaCiudad=isPermiso;
		//this.isPermisoReporteCiudad=isPermiso;
		//this.isPermisoOrdenCiudad=isPermiso;		
		//this.isPermisoPaginacionMedioCiudad=isPermiso;		
		//this.isPermisoPaginacionAltoCiudad=isPermiso;		
		//this.isPermisoPaginacionTodoCiudad=isPermiso;		
		//this.isPermisoCopiarCiudad=isPermiso;		
		//this.isPermisoDuplicarCiudad=isPermiso;
		//this.isPermisoOrdenCiudad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCiudadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CiudadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCiudad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCiudadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCiudadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCiudadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCiudadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCiudad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CiudadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CiudadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCiudad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCiudad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCiudad=this.isPermisoActualizarCiudad;
			this.isPermisoEliminarCiudad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCiudad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCiudad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCiudad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCiudad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCiudad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCiudad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCiudad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCiudad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCiudad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCiudad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCiudad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCiudad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCiudad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCiudad.setToolTipText(this.jTableDatosCiudad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCiudad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCiudad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CiudadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CiudadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCiudad() throws Exception {
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
	public void inicializarCombosForeignKeyCiudadListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
				this.provinciasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCiudadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CiudadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCiudadListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCiudadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CiudadParameterReturnGeneral ciudadReturnGeneral=new CiudadParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.ciudadConstantesFunciones.cargarid_paisCiudad)
					 || (this.esRecargarFks && this.ciudadConstantesFunciones.cargarid_paisCiudad)) {

					if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+ciudadSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalProvincia="";

				if(cargarCombosDependencia && ((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0) && this.ciudadConstantesFunciones.cargarid_provinciaCiudad)
					 || (this.esRecargarFks && this.ciudadConstantesFunciones.cargarid_provinciaCiudad)) {

					if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=ProvinciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+ciudadSessionBean.getlidProvinciaActual();
					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				ciudadReturnGeneral=ciudadLogic.cargarCombosLoteForeignKeyCiudad(finalQueryGlobalPais,finalQueryGlobalProvincia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=ciudadReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasForeignKey=ciudadReturnGeneral.getprovinciasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCiudad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyProvincia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.ciudadSessionBean==null) {
				this.ciudadSessionBean=new CiudadSessionBean();
			}

			if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {

			if(!this.ciudadSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCiudad()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCiudad(String sFormularioTipoBusqueda)throws Exception {
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
			this.sFinalQueryComboProvincia=sFinalQueryCombo;

			this.provinciasForeignKey=new ArrayList<Provincia>();
			this.cargarCombosForeignKeyProvincia(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyPais(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormCiudad!=null) {
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.addItemListener(new ComboBoxItemListener(this,"id_paisCiudad"));
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.addFocusListener(new ComboBoxFocusListener(this,"id_paisCiudad"));
					}
				} else {
					if(this.jInternalFrameDetalleFormCiudad!=null) {
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.addActionListener(new ComboBoxActionListener(this,"id_paisCiudad"));
						this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.addFocusListener(new ComboBoxFocusListener(this,"id_paisCiudad"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisCiudad.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisCiudad"));

						this.jComboBoxid_paisFK_IdPaisCiudad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisCiudad"));

					} else {
						this.jComboBoxid_paisFK_IdPaisCiudad.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisCiudad"));

						this.jComboBoxid_paisFK_IdPaisCiudad.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisCiudad"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyCiudad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCiudad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCiudad(Ciudad ciudad)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(ciudad.getid_pais(),false,"Formulario");
			this.setActualProvinciaForeignKey(ciudad.getid_provincia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCiudad(Ciudad ciudad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCiudad()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.ciudadConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualProvinciaForeignKey(this.ciudadConstantesFunciones.getid_provincia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCiudad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCiudad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCiudad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCiudad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCiudad()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameProvinciasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCiudad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCiudad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad!=null && this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad!=null && this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.getItemCount()>0) {
				this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void recargarFormCiudadPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormCiudadid_provincia(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}


	
	



	public void recargarFormCiudadid_provincia(JComboBox<?> jComboBoxGenericoProvincia,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.ciudad,jComboBoxGenericoProvincia);
			}

			if(this.ciudad.getid_pais()!=null && this.ciudad.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.ciudad.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProvinciaForeignKey(this.ciudad.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosProvinciasForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public CiudadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CiudadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CiudadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ciudadSessionBean=new CiudadSessionBean(); 
		this.ciudadConstantesFunciones=new CiudadConstantesFunciones(); 
		this.ciudadBean=new Ciudad();//(this.ciudadConstantesFunciones); 		
		this.ciudadReturnGeneral=new CiudadParameterReturnGeneral(); 
		
		this.ciudadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ciudadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CiudadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CiudadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CiudadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCiudad(true);
			
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
			
			this.ciudadConstantesFunciones=new CiudadConstantesFunciones(); 
			this.ciudadBean=new Ciudad();//this.ciudadConstantesFunciones); 			
			this.ciudadReturnGeneral=new CiudadParameterReturnGeneral(); 
		
			CiudadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ciudad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.ciudad=new Ciudad();
			this.ciudads = new ArrayList<Ciudad>();
			this.ciudadsAux = new ArrayList<Ciudad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic=new CiudadLogic();
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			//this.ciudadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ciudadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCiudad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCiudad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCiudad);	
					}
					
					if(this.jInternalFrameImportacionCiudad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCiudad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCiudad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCiudad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCiudad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCiudad);
				this.jInternalFrameDetalleFormCiudad.setVisible(false);
				this.jInternalFrameDetalleFormCiudad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCiudad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCiudad);
					this.jInternalFrameReporteDinamicoCiudad.setVisible(false);
					this.jInternalFrameReporteDinamicoCiudad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCiudad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCiudad);
					this.jInternalFrameImportacionCiudad.setVisible(false);
					this.jInternalFrameImportacionCiudad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCiudad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCiudad);
					this.jInternalFrameOrderByCiudad.setVisible(false);
					this.jInternalFrameOrderByCiudad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCiudadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CiudadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ciudadReturnGeneral=new CiudadParameterReturnGeneral();
			
			this.ciudadParameterGeneral=new CiudadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ciudadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CiudadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CiudadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ciudadSessionBean.getEsGuardarRelacionado(),this.ciudadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CiudadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ciudadSessionBean.getEsGuardarRelacionado(),this.ciudadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaDuplicarCiudad=true;
			this.isVisibilidadCeldaCopiarCiudad=true;
			this.isVisibilidadCeldaVerFormCiudad=true;
			this.isVisibilidadCeldaOrdenCiudad=true;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=false;
			this.isVisibilidadCeldaGuardarCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdProvincia=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCiudad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCiudad(false);
			
			this.setPermisosUsuarioCiudad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ciudadSessionBean.getEsGuardarRelacionado() 
				|| (this.ciudadSessionBean.getEsGuardarRelacionado() && this.ciudadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCiudadClasesRelacionadas();
			}
			
			if(this.ciudadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCiudadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CiudadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCiudad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCiudad();
			}
			
			if(!this.isPermisoBusquedaCiudad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCiudad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCiudad,this.isPermisoPaginacionMedioCiudad,this.isPermisoPaginacionTodoCiudad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CiudadConstantesFunciones.getTiposSeleccionarCiudad());
				
				this.tiposColumnasSelect=CiudadConstantesFunciones.getTiposSeleccionarCiudad(true);
				
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
			//if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCiudad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioCiudad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioCiudad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCiudad() ;
			
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
			
			this.paisLogic=new PaisLogic();
			this.provinciaLogic=new ProvinciaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ciudadImplementable= (CiudadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CiudadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ciudadImplementableHome= (CiudadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CiudadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ciudads= new ArrayList<Ciudad>();
			this.ciudadsEliminados= new ArrayList<Ciudad>();
						
			this.isEsNuevoCiudad=false;
			this.esParaAccionDesdeFormularioCiudad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCiudad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCiudad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CiudadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CiudadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCiudad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCiudad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCiudad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCiudad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCiudad();
			}
			
			CiudadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCiudad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCiudad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCiudad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCiudad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Ciudad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCiudad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCiudad")) {
				iIndex=this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCiudad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCiudad();	
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
	
	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCiudad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCiudad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCiudadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCiudad();
		
		this.cargarCombosFrameForeignKeyCiudad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCiudad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCiudad();
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

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCiudadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ciudadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			
			if(jTableDatosCiudad.getRowCount()>=1) {
				jTableDatosCiudad.removeRowSelectionInterval(0, jTableDatosCiudad.getRowCount()-1);						
			}
			
			this.isEsNuevoCiudad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCiudad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCiudad(true);			
			//this.ciudad=new Ciudad();
			//this.ciudad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCiudad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCiudad() ;
			
			if(CiudadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCiudad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ciudad);	
			this.actualizarInformacion("INFO_PADRE",false,this.ciudad);				
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			if(this.ciudadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Ciudad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCiudadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCiudad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCiudad.getSelectedRows().length;			
			}
			
			ciudadsSeleccionados=this.getCiudadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCiudad--;			
				//Ciudad ciudadAux= new Ciudad();			
				//ciudadAux.setId(this.iIdNuevoCiudad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Ciudad ciudadOrigen=new Ciudad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Ciudad ciudadOrigen : ciudadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ciudadOrigen =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ciudadOrigen =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCiudad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ciudad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCiudad(ciudadOrigen,this.ciudad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ciudadLogic.getCiudads().add(this.ciudadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ciudads.add(this.ciudadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCiudad(false);
				
				this.jTableDatosCiudad.setRowSelectionInterval(this.getIndiceNuevoCiudad(), this.getIndiceNuevoCiudad());
				
				int iLastRow =  this.jTableDatosCiudad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCiudad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCiudad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCiudad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();									
		
			Ciudad ciudadOrigen=new Ciudad();
			Ciudad ciudadDestino=new Ciudad();
				
			ciudadsSeleccionados=this.getCiudadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCiudad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ciudadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCiudad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadOrigen =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ciudadOrigen =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ciudadDestino =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ciudadDestino =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ciudadOrigen =ciudadsSeleccionados.get(0);
				ciudadDestino =ciudadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCiudad(ciudadOrigen,ciudadDestino,true,false);
				
				ciudadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ciudadDestino,ciudadLogic.getCiudads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ciudadDestino,ciudads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCiudad(false);
				
				//this.jTableDatosCiudad.setRowSelectionInterval(this.getIndiceNuevoCiudad(), this.getIndiceNuevoCiudad());
				
				int iLastRow =  this.jTableDatosCiudad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCiudad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCiudad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCiudad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCiudad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCiudad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCiudad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCiudad.setVisible(!isVisible);
			this.jPanelPaginacionCiudad.setVisible(!isVisible);
			this.jPanelAccionesCiudad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCiudad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCiudad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCiudad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCiudad();
			
			this.abrirFrameOrderByCiudad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCiudad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCiudad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCiudad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCiudad.isMaximum()) {
					this.jInternalFrameDetalleFormCiudad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCiudad.setSize(this.jInternalFrameDetalleFormCiudad.iWidthFormulario,this.jInternalFrameDetalleFormCiudad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCiudad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCiudad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCiudad.isMaximum()) {
						this.jInternalFrameDetalleFormCiudad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCiudad.jContentPaneDetalleCiudad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCiudad.jContentPaneDetalleCiudad.getWidth(),CiudadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCiudad.jContentPaneDetalleCiudad.getWidth(),CiudadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCiudad.jContentPaneDetalleCiudad.getWidth(),CiudadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCiudad.setVisible(true);
	        this.jInternalFrameDetalleFormCiudad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCiudad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCiudad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCiudad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCiudad,false,this);
				} else {
					this.jInternalFrameOrderByCiudad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCiudad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCiudad);
				this.jInternalFrameOrderByCiudad.setVisible(false);
				this.jInternalFrameOrderByCiudad.setSelected(false);
				
				this.jInternalFrameOrderByCiudad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCiudad"));
				
				this.inicializarActualizarBindingTablaOrderByCiudad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCiudad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCiudad==null) {
				
				this.jInternalFrameImportacionCiudad=new ImportacionJInternalFrame(CiudadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCiudad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCiudad);
				this.jInternalFrameImportacionCiudad.setVisible(false);
				this.jInternalFrameImportacionCiudad.setSelected(false);


				this.jInternalFrameImportacionCiudad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCiudad"));
				this.jInternalFrameImportacionCiudad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCiudad"));
				this.jInternalFrameImportacionCiudad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCiudad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCiudad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCiudad==null) {
				this.jInternalFrameReporteDinamicoCiudad=new ReporteDinamicoJInternalFrame(CiudadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCiudad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCiudad);
				this.jInternalFrameReporteDinamicoCiudad.setVisible(false);
				this.jInternalFrameReporteDinamicoCiudad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCiudad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCiudad"));
				this.jInternalFrameReporteDinamicoCiudad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCiudad"));
				this.jInternalFrameReporteDinamicoCiudad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCiudad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCiudad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleCiudad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCiudad);
			
	       	this.jInternalFrameDetalleFormCiudad.setVisible(false);
	        this.jInternalFrameDetalleFormCiudad.setSelected(false);
			
			//this.jInternalFrameDetalleFormCiudad.dispose();
			//this.jInternalFrameDetalleFormCiudad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCiudad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCiudad.setVisible(true);
	        this.jInternalFrameReporteDinamicoCiudad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCiudad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCiudad.setVisible(true);
	        this.jInternalFrameImportacionCiudad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCiudad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCiudad.setVisible(true);
	        this.jInternalFrameOrderByCiudad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCiudad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCiudad.setVisible(false);
	        this.jInternalFrameOrderByCiudad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCiudad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCiudad.setVisible(false);
	        this.jInternalFrameReporteDinamicoCiudad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCiudad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCiudad.setVisible(false);
	        this.jInternalFrameImportacionCiudad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCiudad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCiudad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCiudad(true);
			//this.isEsNuevoCiudad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCiudad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCiudad(false) ;
			
			if(ciudadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CiudadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCiudad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCiudad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCiudadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCiudad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCiudad(true);
			//this.isEsNuevoCiudad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ciudad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCiudad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCiudad(false) ;
			
			if(CiudadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCiudad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCiudad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCiudad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCiudad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCiudad(false);
			
			//if(!this.isEsNuevoCiudad) {								
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				
			}
			
			if(this.permiteMantenimiento(this.ciudad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ciudadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCiudad=true;
					this.inicializarActualizarBindingTablaCiudad(false);
					this.isEsNuevoCiudad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCiudad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCiudad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCiudad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCiudad(false);
				
				this.habilitarDeshabilitarControlesCiudad(false);
			
												
				
				if(CiudadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCiudad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCiudadActionPerformed(evt,ciudadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCiudad(this.ciudad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCiudad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ciudadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ciudad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCiudadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				this.ciudad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				this.ciudad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ciudad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ciudadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CiudadModel) this.jTableDatosCiudad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCiudad=true;
				this.inicializarActualizarBindingTablaCiudad(false);
				this.isEsNuevoCiudad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCiudad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCiudad(false);
				
				this.habilitarDeshabilitarControlesCiudad(false);
				
				
				
				if(CiudadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCiudad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCiudadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCiudad.getRowCount()>=1) {
				jTableDatosCiudad.removeRowSelectionInterval(0, jTableDatosCiudad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCiudad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCiudad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCiudad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCiudad(false) ;
			
			this.isEsNuevoCiudad=false;
			
			if(CiudadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCiudad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCiudad(false);
				
				//SI ES MANUAL
				if(CiudadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCiudad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCiudad--;			
			//Ciudad ciudadAux= new Ciudad();			
			//ciudadAux.setId(this.iIdNuevoCiudad);
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCiudad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
			
			this.ciudad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ciudadLogic.getCiudads().add(this.ciudadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ciudads.add(this.ciudadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCiudad(false);
			
			this.jTableDatosCiudad.setRowSelectionInterval(this.getIndiceNuevoCiudad(), this.getIndiceNuevoCiudad());
			
			int iLastRow =  this.jTableDatosCiudad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCiudad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCiudad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCiudad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCiudad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCiudad(false);
			
			//SI ES MANUAL
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCiudad();
			}
			
			//this.abrirFrameTreeCiudad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCiudadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CiudadES ?", "MANTENIMIENTO DE Ciudad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCiudad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCiudad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.ciudadReturnGeneral=ciudadLogic.procesarImportacionCiudadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.ciudadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCiudadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCiudadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCiudad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCiudad.setFileImportacion(this.jInternalFrameImportacionCiudad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCiudad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCiudad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCiudad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCiudad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		

		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CiudadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CiudadBaseDesign.jrxml";
			
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
			
			this.generarReporteCiudads("Todos",ciudadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CiudadConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CiudadConstantesFunciones.LABEL_IDPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Provincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Provincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Provincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Provincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CiudadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CiudadConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoCiudad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CiudadConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case CiudadConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoria="id_provincia";
					break;

				case CiudadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CiudadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CiudadConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case CiudadConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoriaValor="id_provincia";
					break;

				case CiudadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CiudadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCiudad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCiudad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CiudadConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case CiudadConstantesFunciones.LABEL_IDPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_provincia");
					break;

				case CiudadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CiudadConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoCiudadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Ciudads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CiudadConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(Ciudad ciudad:ciudadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ciudad.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CiudadConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(Ciudad ciudad:ciudadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ciudad.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CiudadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CiudadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Ciudad ciudad:ciudadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ciudad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CiudadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CiudadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Ciudad ciudad:ciudadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ciudad.getnombre());
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
			//	this.getFilaCabeceraExportarExcelCiudad(row);				
			//	iRow++;
			//}				
			
			//for(Ciudad ciudadAux:ciudadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCiudad(ciudadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
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
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCiudad(false);
			
			//SI ES MANUAL
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCiudad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCiudad(false);
			
			//SI ES MANUAL
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCiudad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCiudadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCiudad(false);
			
			//SI ES MANUAL
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCiudad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCiudad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCiudad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCiudad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCiudad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCiudad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCiudad.setMinimumSize(dimensionMinimum);
		this.jTableDatosCiudad.setMaximumSize(dimensionMaximum);
		this.jTableDatosCiudad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCiudad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCiudad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCiudad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCiudad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCiudad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCiudad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCiudad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCiudad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CiudadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CiudadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCiudad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCiudad();
		
		this.inicializarActualizarBindingBotonesManualCiudad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCiudad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCiudad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCiudad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCiudad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCiudad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCiudad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCiudad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCiudad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionNuevoCiudad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionSinCerrarCiudad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionSinMensajeCiudad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCiudad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCiudad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCiudad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCiudad!=null) {
				this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionNuevoCiudad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionSinCerrarCiudad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCiudad.jCheckBoxPostAccionSinMensajeCiudad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCiudad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCiudad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCiudad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCiudad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCiudad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCiudad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCiudad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCiudad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCiudad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCiudad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCiudad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCiudad(Boolean esInicializar) throws Exception {
		try	{	
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCiudad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCiudad() throws Exception {
		try	{
			if(CiudadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCiudad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCiudad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCiudad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCiudad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCiudad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCiudad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCiudad.addItem(reporte);
			}
			
			
			if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCiudad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCiudad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCiudad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCiudad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCiudad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCiudad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCiudad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCiudad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCiudad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCiudad!=null) {
				this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCiudad!=null) {
				this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCiudad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCiudad!=null) {
				
				if(this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCiudad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCiudad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCiudad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCiudad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCiudad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreCiudad.getText();
		if(this.jComboBoxid_paisFK_IdPaisCiudad.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisCiudad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCiudad(Boolean esInicializar) throws Exception {				
		if(CiudadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCiudad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCiudad() throws Exception {
		this.inicializarActualizarBindingTablaCiudad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCiudad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCiudadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCiudad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ciudadLogic.getCiudads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ciudads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCiudad.setModel(new CiudadModel(this.ciudadLogic.getCiudads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCiudad.setModel(new CiudadModel(this.ciudads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCiudad!=null && this.jInternalFrameOrderByCiudad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCiudad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CiudadConstantesFunciones.SCLASSWEBTITULO,ciudadConstantesFunciones.resaltarSeleccionarCiudad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CiudadConstantesFunciones.SCLASSWEBTITULO,ciudadConstantesFunciones.resaltarSeleccionarCiudad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_ID));

		if(this.ciudadConstantesFunciones.mostraridCiudad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CiudadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ciudadConstantesFunciones.resaltaridCiudad,this.ciudadConstantesFunciones.activaridCiudad,this,true,"idCiudad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ciudadConstantesFunciones.resaltaridCiudad,this.ciudadConstantesFunciones.activaridCiudad,this,true,"idCiudad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_IDPAIS));

		if(this.ciudadConstantesFunciones.mostrarid_paisCiudad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CiudadConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.ciudadConstantesFunciones.resaltarid_paisCiudad,this,this.ciudadConstantesFunciones.activarid_paisCiudad));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.ciudadConstantesFunciones.resaltarid_paisCiudad,this,this.ciudadConstantesFunciones.activarid_paisCiudad,true,"id_paisCiudad","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_IDPROVINCIA));

		if(this.ciudadConstantesFunciones.mostrarid_provinciaCiudad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CiudadConstantesFunciones.LABEL_IDPROVINCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProvinciaTableCell(this.provinciasForeignKey,this.ciudadConstantesFunciones.resaltarid_provinciaCiudad,this,this.ciudadConstantesFunciones.activarid_provinciaCiudad));
			tableColumn.setCellEditor(new ProvinciaTableCell(this.provinciasForeignKey,this.ciudadConstantesFunciones.resaltarid_provinciaCiudad,this,this.ciudadConstantesFunciones.activarid_provinciaCiudad,true,"id_provinciaCiudad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_CODIGO));

		if(this.ciudadConstantesFunciones.mostrarcodigoCiudad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CiudadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ciudadConstantesFunciones.resaltarcodigoCiudad,this.ciudadConstantesFunciones.activarcodigoCiudad,this,true,"codigoCiudad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ciudadConstantesFunciones.resaltarcodigoCiudad,this.ciudadConstantesFunciones.activarcodigoCiudad,this,true,"codigoCiudad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCiudad,CiudadConstantesFunciones.LABEL_NOMBRE));

		if(this.ciudadConstantesFunciones.mostrarnombreCiudad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CiudadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ciudadConstantesFunciones.resaltarnombreCiudad,this.ciudadConstantesFunciones.activarnombreCiudad,this,true,"nombreCiudad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ciudadConstantesFunciones.resaltarnombreCiudad,this.ciudadConstantesFunciones.activarnombreCiudad,this,true,"nombreCiudad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CiudadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ciudadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ciudadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ciudadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCiudad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ciudadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ciudadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCiudad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCiudad && this.isPermisoGuardarCambiosCiudad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ciudadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ciudadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCiudad.addColumn(tableColumn);
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
			
			this.jTableDatosCiudad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCiudad && this.isPermisoGuardarCambiosCiudad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCiudad && this.isPermisoGuardarCambiosCiudad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCiudad.moveColumn(this.jTableDatosCiudad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCiudad.moveColumn(this.jTableDatosCiudad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCiudad.moveColumn(this.jTableDatosCiudad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCiudad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCiudad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCiudad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCiudad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCiudad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCiudad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCiudad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCiudad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=ciudadLogic.getCiudads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ciudads.size()-1;
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
		//this.jTableDatosCiudad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCiudad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCiudad();
			
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
				
				//this.isEsNuevoCiudad=false;
					
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCiudad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCiudad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCiudad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ciudad.getsType().equals("DUPLICADO")
				   || this.ciudad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCiudad=true;
				
				} else {
					this.isEsNuevoCiudad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ciudadSessionBean.getEsGuardarRelacionado()) {
					if(this.ciudad.getId()>=0 && !this.ciudad.getIsNew()) {						
						this.isEsNuevoCiudad=false;
						
					} else {
						this.isEsNuevoCiudad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCiudad(esRelaciones);						
				
				this.seleccionarCiudad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ciudad.getId()<0) {
					this.isEsNuevoCiudad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCiudad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCiudad(evt,rowIndex);
				}	
				
				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Ciudad: " + this.dDif); 
					}
				}								
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCiudad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ciudad)) {
					if(this.ciudad.getId()>0) {
						this.ciudad.setIsDeleted(true);
						
						this.ciudadsEliminados.add(this.ciudad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ciudadLogic.getCiudads().remove(this.ciudad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ciudads.remove(this.ciudad);				
					}
					
					
					((CiudadModel) this.jTableDatosCiudad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCiudad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCiudad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCiudad) {
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCiudad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCiudad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCiudad(this.ciudad);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.ciudadConstantesFunciones.cargarid_paisCiudad || this.ciudadConstantesFunciones.event_dependid_paisCiudad) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.ciudad.getid_pais());
									//this.inicializarActualizarBindingCiudad(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(ciudad.getPais()!=null) {
							this.paissForeignKey.add(ciudad.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.ciudad.getid_pais(),false,"Formulario");

					//Provincia
					if(!this.ciudadConstantesFunciones.cargarid_provinciaCiudad || this.ciudadConstantesFunciones.event_dependid_provinciaCiudad) {
						//this.cargarCombosProvinciasForeignKeyLista(" where id="+this.ciudad.getid_provincia());
									//this.inicializarActualizarBindingCiudad(false,false);
						this.provinciasForeignKey=new ArrayList<Provincia>();

						if(ciudad.getProvincia()!=null) {
							this.provinciasForeignKey.add(ciudad.getProvincia());
						}

						this.addItemDefectoCombosForeignKeyProvincia();
						this.cargarCombosFrameProvinciasForeignKey("Todos");
					}
					this.setActualProvinciaForeignKey(this.ciudad.getid_provincia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCiudad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCiudad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCiudad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCiudad(Ciudad ciudad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCiudad(ciudad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCiudad(Ciudad ciudad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCiudad(ciudad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCiudad(ciudad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCiudad(ciudad);
	}
	
	public void setVariablesObjetoActualToFormularioCiudad(Ciudad ciudad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setText(ciudad.getId().toString());
			this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setText(ciudad.getcodigo());
			this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setText(ciudad.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Ciudad ciudadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ciudadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Ciudad ciudadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ciudadLocal=this.ciudad;
			} else {
				ciudadLocal=this.ciudadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ciudadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCiudad(ciudadLocal,true);
					
					if(ciudadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ciudadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ciudadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCiudad(Ciudad ciudad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCiudad(ciudad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCiudad(ciudad);
	}
	
	public void setVariablesFormularioToObjetoActualCiudad(Ciudad ciudad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCiudad(ciudad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCiudad(Ciudad ciudad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.getText()==null || this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.getText()=="" || this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.getText()=="Id") {
				this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setText("0");
			}

			if(conColumnasBase) {ciudad.setId(Long.parseLong(this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CiudadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelIdCiudad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ciudad.setcodigo(this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CiudadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelcodigoCiudad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ciudad.setnombre(this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CiudadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCiudad.jLabelnombreCiudad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCiudad(Ciudad ciudadBean,Ciudad ciudad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && ciudadBean.getid_pais()!=null && !ciudadBean.getid_pais().equals(-1L))) {ciudad.setid_pais(ciudadBean.getid_pais());}
			if(conDefault || (!conDefault && ciudadBean.getid_provincia()!=null && !ciudadBean.getid_provincia().equals(null))) {ciudad.setid_provincia(ciudadBean.getid_provincia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCiudad(Ciudad ciudadOrigen,Ciudad ciudad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ciudadOrigen.getId()!=null && !ciudadOrigen.getId().equals(0L))) {ciudad.setId(ciudadOrigen.getId());}}
			if(conDefault || (!conDefault && ciudadOrigen.getid_pais()!=null && !ciudadOrigen.getid_pais().equals(-1L))) {ciudad.setid_pais(ciudadOrigen.getid_pais());}
			if(conDefault || (!conDefault && ciudadOrigen.getid_provincia()!=null && !ciudadOrigen.getid_provincia().equals(null))) {ciudad.setid_provincia(ciudadOrigen.getid_provincia());}
			if(conDefault || (!conDefault && ciudadOrigen.getcodigo()!=null && !ciudadOrigen.getcodigo().equals(""))) {ciudad.setcodigo(ciudadOrigen.getcodigo());}
			if(conDefault || (!conDefault && ciudadOrigen.getnombre()!=null && !ciudadOrigen.getnombre().equals(""))) {ciudad.setnombre(ciudadOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCiudad(Ciudad ciudad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setText(ciudad.getId().toString());
			this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setText(ciudad.getcodigo());
			this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setText(ciudad.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCiudad(CiudadBean ciudadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setText(ciudadBean.getId().toString());
			this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setText(ciudadBean.getcodigo());
			this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setText(ciudadBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCiudad(CiudadParameterReturnGeneral ciudadReturnGeneral,CiudadBean ciudadBean,Boolean conDefault) throws Exception { 
		try {
			Ciudad ciudadLocal=new Ciudad();
			
			ciudadLocal=ciudadReturnGeneral.getCiudad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ciudadLocal.getId()!=null && !ciudadLocal.getId().equals(0L))) {ciudadBean.setId(ciudadLocal.getId());}}
			if(conDefault || (!conDefault && ciudadLocal.getid_pais()!=null && !ciudadLocal.getid_pais().equals(-1L))) {ciudadBean.setid_pais(ciudadLocal.getid_pais());}
			if(conDefault || (!conDefault && ciudadLocal.getid_provincia()!=null && !ciudadLocal.getid_provincia().equals(null))) {ciudadBean.setid_provincia(ciudadLocal.getid_provincia());}
			if(conDefault || (!conDefault && ciudadLocal.getcodigo()!=null && !ciudadLocal.getcodigo().equals(""))) {ciudadBean.setcodigo(ciudadLocal.getcodigo());}
			if(conDefault || (!conDefault && ciudadLocal.getnombre()!=null && !ciudadLocal.getnombre().equals(""))) {ciudadBean.setnombre(ciudadLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCiudadGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxCiudad,List<Ciudad> ciudadsLocal)throws Exception {
		try {
			Ciudad  ciudadTemp=null;

			for(Ciudad ciudadAux:ciudadsLocal) {
				if(ciudadAux.getId()!=null && ciudadAux.getId().equals(idCiudadSeleccionado)) {
					ciudadTemp=ciudadAux;
					break;
				}
			}

			jComboBoxCiudad.setSelectedItem(ciudadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCiudadGenerico(JComboBox jComboBoxCiudad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCiudad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCiudad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCiudad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCiudad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCiudad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCiudad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ciudad=(Ciudad) ciudadLogic.getCiudads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ciudad =(Ciudad) ciudads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!ciudad.getIsNew() && !ciudad.getIsChanged() && !ciudad.getIsDeleted()) {
				sDescripcion=ciudad.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=ciudad.getpais_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!ciudad.getIsNew() && !ciudad.getIsChanged() && !ciudad.getIsDeleted()) {
				sDescripcion=ciudad.getprovincia_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=ciudad.getprovincia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Ciudad ciudadRow=new Ciudad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ciudadRow=(Ciudad) ciudadLogic.getCiudads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ciudadRow=(Ciudad) ciudads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCiudad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad));			
			this.jButtonDuplicarCiudad.setVisible((this.isVisibilidadCeldaDuplicarCiudad && this.isPermisoDuplicarCiudad));			
			this.jButtonCopiarCiudad.setVisible((this.isVisibilidadCeldaCopiarCiudad && this.isPermisoCopiarCiudad));
			this.jButtonVerFormCiudad.setVisible((this.isVisibilidadCeldaVerFormCiudad && this.isPermisoVerFormCiudad));
			
			this.jButtonAbrirOrderByCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));			
			
			this.jButtonNuevoRelacionesCiudad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCiudad && this.isPermisoNuevoCiudad));			
			this.jButtonNuevoGuardarCambiosCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad && this.isPermisoGuardarCambiosCiudad));
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.jInternalFrameDetalleFormCiudad.jButtonModificarCiudad.setVisible((this.isVisibilidadCeldaModificarCiudad && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.setVisible((this.isVisibilidadCeldaActualizarCiudad && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.setVisible((this.isVisibilidadCeldaEliminarCiudad && this.isPermisoEliminarCiudad));
			this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.setVisible(this.isVisibilidadCeldaCancelarCiudad);							
			this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.setVisible((this.isVisibilidadCeldaGuardarCiudad && this.isPermisoGuardarCambiosCiudad));			
			
			}
						
			this.jButtonGuardarCambiosTablaCiudad.setVisible((this.isVisibilidadCeldaGuardarCambiosCiudad && this.isPermisoGuardarCambiosCiudad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad));						
			this.jButtonDuplicarToolBarCiudad.setVisible((this.isVisibilidadCeldaDuplicarCiudad && this.isPermisoDuplicarCiudad));						
			this.jButtonCopiarToolBarCiudad.setVisible((this.isVisibilidadCeldaCopiarCiudad && this.isPermisoCopiarCiudad));			
			this.jButtonVerFormToolBarCiudad.setVisible((this.isVisibilidadCeldaVerFormCiudad && this.isPermisoVerFormCiudad));			
			this.jButtonAbrirOrderByToolBarCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));
			this.jButtonNuevoRelacionesToolBarCiudad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCiudad && this.isPermisoNuevoCiudad));			
			this.jButtonNuevoGuardarCambiosToolBarCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad && this.isPermisoGuardarCambiosCiudad));			
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.jInternalFrameDetalleFormCiudad.jButtonModificarToolBarCiudad.setVisible((this.isVisibilidadCeldaModificarCiudad && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jButtonActualizarToolBarCiudad.setVisible((this.isVisibilidadCeldaActualizarCiudad  && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jButtonEliminarToolBarCiudad.setVisible((this.isVisibilidadCeldaEliminarCiudad && this.isPermisoEliminarCiudad));
			this.jInternalFrameDetalleFormCiudad.jButtonCancelarToolBarCiudad.setVisible(this.isVisibilidadCeldaCancelarCiudad);				
			this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosToolBarCiudad.setVisible((this.isVisibilidadCeldaGuardarCiudad && this.isPermisoGuardarCambiosCiudad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCiudad.setVisible((this.isVisibilidadCeldaGuardarCambiosCiudad && this.isPermisoGuardarCambiosCiudad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad));			
			this.jMenuItemDuplicarCiudad.setVisible((this.isVisibilidadCeldaDuplicarCiudad && this.isPermisoDuplicarCiudad));			
			this.jMenuItemCopiarCiudad.setVisible((this.isVisibilidadCeldaCopiarCiudad && this.isPermisoCopiarCiudad));			
			this.jMenuItemVerFormCiudad.setVisible((this.isVisibilidadCeldaVerFormCiudad && this.isPermisoVerFormCiudad));			
			this.jMenuItemAbrirOrderByCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));			
			//this.jMenuItemMostrarOcultarCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));
			this.jMenuItemDetalleAbrirOrderByCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));			
			//this.jMenuItemDetalleMostrarOcultarCiudad.setVisible((this.isVisibilidadCeldaOrdenCiudad && this.isPermisoOrdenCiudad));			
			this.jMenuItemNuevoRelacionesCiudad.setVisible((this.isVisibilidadCeldaNuevoRelacionesCiudad && this.isPermisoNuevoCiudad));			
			this.jMenuItemNuevoGuardarCambiosCiudad.setVisible((this.isVisibilidadCeldaNuevoCiudad && this.isPermisoNuevoCiudad && this.isPermisoGuardarCambiosCiudad));									
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.jInternalFrameDetalleFormCiudad.jMenuItemModificarCiudad.setVisible((this.isVisibilidadCeldaModificarCiudad && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jMenuItemActualizarCiudad.setVisible((this.isVisibilidadCeldaActualizarCiudad && this.isPermisoActualizarCiudad));	
			this.jInternalFrameDetalleFormCiudad.jMenuItemEliminarCiudad.setVisible((this.isVisibilidadCeldaEliminarCiudad && this.isPermisoEliminarCiudad));
			this.jInternalFrameDetalleFormCiudad.jMenuItemCancelarCiudad.setVisible(this.isVisibilidadCeldaCancelarCiudad);				
			}
			
			this.jMenuItemGuardarCambiosCiudad.setVisible((this.isVisibilidadCeldaGuardarCiudad && this.isPermisoGuardarCambiosCiudad));						
			this.jMenuItemGuardarCambiosTablaCiudad.setVisible((this.isVisibilidadCeldaGuardarCambiosCiudad && this.isPermisoGuardarCambiosCiudad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCiudad=this.jButtonNuevoCiudad.isVisible();
			this.isVisibilidadCeldaDuplicarCiudad=this.jButtonDuplicarCiudad.isVisible();
			this.isVisibilidadCeldaCopiarCiudad=this.jButtonCopiarCiudad.isVisible();
			this.isVisibilidadCeldaVerFormCiudad=this.jButtonVerFormCiudad.isVisible();
			
			this.isVisibilidadCeldaOrdenCiudad=this.jButtonAbrirOrderByCiudad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCiudad=this.jButtonNuevoRelacionesCiudad.isVisible();
			this.isVisibilidadCeldaModificarCiudad=this.jButtonModificarCiudad.isVisible();
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.isVisibilidadCeldaActualizarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.isVisible();
			this.isVisibilidadCeldaEliminarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.isVisible();
			this.isVisibilidadCeldaCancelarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.isVisible();
			this.isVisibilidadCeldaGuardarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCiudad=this.jButtonGuardarCambiosTablaCiudad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCiudad=this.jButtonNuevoToolBarCiudad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCiudad=this.jButtonNuevoRelacionesToolBarCiudad.isVisible();
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.isVisibilidadCeldaModificarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonModificarToolBarCiudad.isVisible();
			this.isVisibilidadCeldaActualizarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonActualizarToolBarCiudad.isVisible();
			this.isVisibilidadCeldaEliminarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonEliminarToolBarCiudad.isVisible();
			this.isVisibilidadCeldaCancelarCiudad=this.jInternalFrameDetalleFormCiudad.jButtonCancelarToolBarCiudad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCiudad=this.jButtonGuardarCambiosToolBarCiudad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCiudad=this.jButtonGuardarCambiosTablaToolBarCiudad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCiudad=this.jMenuItemNuevoCiudad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCiudad=this.jMenuItemNuevoRelacionesCiudad.isVisible();
			
			if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.isVisibilidadCeldaModificarCiudad=this.jInternalFrameDetalleFormCiudad.jMenuItemModificarCiudad.isVisible();
			this.isVisibilidadCeldaActualizarCiudad=this.jInternalFrameDetalleFormCiudad.jMenuItemActualizarCiudad.isVisible();
			this.isVisibilidadCeldaEliminarCiudad=this.jInternalFrameDetalleFormCiudad.jMenuItemEliminarCiudad.isVisible();
			this.isVisibilidadCeldaCancelarCiudad=this.jInternalFrameDetalleFormCiudad.jMenuItemCancelarCiudad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCiudad=this.jMenuItemGuardarCambiosCiudad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCiudad=this.jMenuItemGuardarCambiosTablaCiudad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCiudad(Boolean esInicializar) {
		if(CiudadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ciudadSessionBean.getConGuardarRelaciones()) {
				//if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCiudad();
			}
			
			this.inicializarActualizarBindingBotonesManualCiudad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCiudad() {
		this.jButtonNuevoCiudad.setVisible(this.isPermisoNuevoCiudad);			
		this.jButtonDuplicarCiudad.setVisible(this.isPermisoDuplicarCiudad);			
		this.jButtonCopiarCiudad.setVisible(this.isPermisoCopiarCiudad);			
		this.jButtonVerFormCiudad.setVisible(this.isPermisoVerFormCiudad);			
		
		this.jButtonAbrirOrderByCiudad.setVisible(this.isPermisoOrdenCiudad);					
		
		this.jButtonNuevoRelacionesCiudad.setVisible(this.isPermisoNuevoCiudad);			
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonModificarCiudad.setVisible(this.isPermisoActualizarCiudad);	
			this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.setVisible(this.isPermisoActualizarCiudad);	
			this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.setVisible(this.isPermisoEliminarCiudad);
			this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.setVisible(this.isVisibilidadCeldaCancelarCiudad);						
			this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.setVisible(this.isPermisoGuardarCambiosCiudad);							
		}
		
		this.jButtonGuardarCambiosTablaCiudad.setVisible(this.isPermisoActualizarCiudad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCiudad() {
		this.jInternalFrameDetalleFormCiudad.jButtonModificarCiudad.setVisible(this.isPermisoActualizarCiudad);	
		this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.setVisible(this.isPermisoActualizarCiudad);	
		this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.setVisible(this.isPermisoEliminarCiudad);
		this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.setVisible(this.isVisibilidadCeldaCancelarCiudad);							
		this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.setVisible((this.isVisibilidadCeldaGuardarCiudad && this.isPermisoGuardarCambiosCiudad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCiudad() {
		if(CiudadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCiudad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCiudad() {
	}
	
	public void jTableDatosCiudadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCiudad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCiudadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ciudad==null) {
						this.ciudad = new Ciudad();
					}

					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				}

				if(this.ciudad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ciudad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCiudad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisCiudadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebCiudad(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCiudad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCiudad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.ciudadLogic.getConnexion());

				if(this.ciudad.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.ciudad.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCiudad=(TitledBorder)this.jScrollPanelDatosCiudad.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderCiudad.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisCiudadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ciudad==null) {
						this.ciudad = new Ciudad();
					}

					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				}

				if(this.ciudad.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.ciudad.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCiudad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaCiudadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebCiudad(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCiudad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCiudad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.ciudadLogic.getConnexion());

				if(this.ciudad.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.ciudad.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCiudad=(TitledBorder)this.jScrollPanelDatosCiudad.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderCiudad.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaCiudadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ciudad==null) {
						this.ciudad = new Ciudad();
					}

					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				}

				if(this.ciudad.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.ciudad.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCiudad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCiudadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ciudad==null) {
						this.ciudad = new Ciudad();
					}

					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				}

				if(this.ciudad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.ciudad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCiudad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCiudadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCiudad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCiudad(this.getciudad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ciudad==null) {
						this.ciudad = new Ciudad();
					}

					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);
				}

				if(this.ciudad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.ciudad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCiudad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreCiudadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCiudad(false,false);

			this.getCiudadsBusquedaPorNombre();

			this.inicializarActualizarBindingCiudad(false);

			//if(CiudadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCiudad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisCiudadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCiudad(false,false);

			this.getCiudadsFK_IdPais();

			this.inicializarActualizarBindingCiudad(false);

			//if(CiudadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCiudad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaCiudadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCiudad(false,false);

			this.getCiudadsFK_IdProvincia();

			this.inicializarActualizarBindingCiudad(false);

			//if(CiudadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCiudad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ciudadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCiudad() {
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
			this.jInternalFrameDetalleFormCiudad.setVisible(false);	    			
			this.jInternalFrameDetalleFormCiudad.dispose();
			this.jInternalFrameDetalleFormCiudad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCiudad!=null) {
			this.jInternalFrameReporteDinamicoCiudad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCiudad.dispose();
			this.jInternalFrameReporteDinamicoCiudad=null;
		}
		
		if(this.jInternalFrameImportacionCiudad!=null) {
			this.jInternalFrameImportacionCiudad.setVisible(false);	    			
			this.jInternalFrameImportacionCiudad.dispose();
			this.jInternalFrameImportacionCiudad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCiudad();
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			
			if(sTipo.equals("NuevoCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCiudad")) {
				jButtonDuplicarCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCiudad")) {
				jButtonCopiarCiudadActionPerformed(evt);
			} else if(sTipo.equals("VerFormCiudad")) {
				jButtonVerFormCiudadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCiudad")) {
				jButtonDuplicarCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCiudad")) {
				jButtonDuplicarCiudadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCiudad")) {
				jButtonModificarCiudadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCiudad")) {
				jButtonModificarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCiudad")) {
				jButtonModificarCiudadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCiudad")) {
				jButtonActualizarCiudadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCiudad")) {
				jButtonActualizarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCiudad")) {
				jButtonActualizarCiudadActionPerformed(evt);
			} else if(sTipo.equals("EliminarCiudad")) {
				jButtonEliminarCiudadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCiudad")) {
				jButtonEliminarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCiudad")) {
				jButtonEliminarCiudadActionPerformed(evt);
			} else if(sTipo.equals("CancelarCiudad")) {
				jButtonCancelarCiudadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCiudad")) {
				jButtonCancelarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCiudad")) {
				jButtonCancelarCiudadActionPerformed(evt);
			} else if(sTipo.equals("CerrarCiudad")) {
				jButtonCerrarCiudadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCiudad")) {
				jButtonCerrarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCiudad")) {
				jButtonCerrarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCiudad")) {
				jButtonMostrarOcultarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCiudad")) {
				jButtonCancelarCiudadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCiudad")) {
				jButtonCopiarCiudadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCiudad")) {
				jButtonVerFormCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCiudad")) {
				jButtonCopiarCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCiudad")) {
				jButtonVerFormCiudadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCiudad")) {
				jButtonRecargarInformacionCiudadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCiudad")) {
				jButtonRecargarInformacionCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCiudad")) {
				jButtonRecargarInformacionCiudadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCiudad")) {
				jButtonAnterioresCiudadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCiudad")) {
				jButtonAnterioresCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCiudad")) {
				jButtonAnterioresCiudadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCiudad")) {
				jButtonSiguientesCiudadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCiudad")) {
				jButtonSiguientesCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCiudad")) {
				jButtonSiguientesCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCiudad") || sTipo.equals("MenuItemDetalleAbrirOrderByCiudad")) {
				jButtonAbrirOrderByCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCiudad") || sTipo.equals("MenuItemDetalleMostrarOcultarCiudad")) {
				jButtonMostrarOcultarCiudadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCiudad")) {
				jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCiudad")) {
				jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCiudad")) {
				jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCiudad")) {
				jButtonCerrarReporteDinamicoCiudadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCiudad")) {
				jButtonGenerarReporteDinamicoCiudadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCiudad")) {
				
				jButtonGenerarExcelReporteDinamicoCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCiudad")) {
				jButtonCerrarImportacionCiudadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCiudad")) {
				
				jButtonGenerarImportacionCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCiudad")) {
				
				jButtonAbrirImportacionCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCiudad")) {
				jComboBoxTiposAccionesCiudadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCiudad")) {
				jComboBoxTiposRelacionesCiudadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCiudad")) {
				jComboBoxTiposAccionesCiudadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCiudad")) {
				
				jComboBoxTiposSeleccionarCiudadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCiudad")) {
				jTextFieldValorCampoGeneralCiudadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCiudad")) {
				jButtonAbrirOrderByCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCiudad")) {
				jButtonAbrirOrderByCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCiudad")) {
				jButtonCerrarOrderByCiudadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCiudadBusqueda")) {
				this.jButtonidCiudadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCiudadUpdate")) {
				this.jButtonid_paisCiudadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCiudadBusqueda")) {
				this.jButtonid_paisCiudadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCiudadUpdate")) {
				this.jButtonid_provinciaCiudadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCiudadBusqueda")) {
				this.jButtonid_provinciaCiudadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCiudadBusqueda")) {
				this.jButtoncodigoCiudadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCiudadBusqueda")) {
				this.jButtonnombreCiudadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreCiudad")) {
				this.jButtonBusquedaPorNombreCiudadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisCiudad")) {
				this.jButtonFK_IdPaisCiudadActionPerformed(evt);
			}
			
			;
			
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCiudad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Ciudad ciudadLocal=null;
			
			if(!this.getEsControlTabla()) {
				ciudadLocal=this.ciudad;
			} else {
				ciudadLocal=this.ciudadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
							
				
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
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
			
			


			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
								
						
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
								
				
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
							
				
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
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
			
			


			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
								
				
				


				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCiudad")) {
					jCheckBoxSeleccionarTodosCiudadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCiudad")) {
					jCheckBoxSeleccionadosCiudadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCiudad")) {
					
				}
				
				


				
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
												
				
				


				
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisCiudad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad;
				}

				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					//classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormCiudad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisCiudad")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
				//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			}
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCiudadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisCiudad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad;
				}

				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					//classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormCiudad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisCiudad")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
				//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			}
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ciudad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ciudad);
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisCiudad")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad;
				}

				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					//classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormCiudad(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisCiudad")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
				//recargarFormCiudadPais(jComboBoxid_paisFK_IdPaisCiudad,"FK_IdPais");
			}
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Ciudad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Ciudad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCiudadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ciudadAnterior =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ciudadAnterior =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCiudad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCiudadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCiudad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ciudad =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ciudad =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ciudad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCiudad")) {
				
				}
				
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCiudad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCiudad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCiudad")) {
			
			}
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCiudad();
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			if(sTipo.equals("NuevoCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCiudad")) {
				jButtonDuplicarCiudadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCiudad")) {
				jButtonCopiarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCiudad")) {
				jButtonVerFormCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCiudad")) {
				jButtonNuevoCiudadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCiudad")) {
				jButtonModificarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCiudad")) {
				jButtonActualizarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCiudad")) {
				jButtonEliminarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCiudad")) {
				jButtonCancelarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCiudad")) {
				jButtonCerrarCiudadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCiudad")) {
				jButtonGuardarCambiosCiudadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCiudad")) {
				jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCiudad")) {
				jButtonAbrirOrderByCiudadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCiudad")) {
				jButtonRecargarInformacionCiudadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCiudad")) {
				jButtonAnterioresCiudadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCiudad")) {
				jButtonSiguientesCiudadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCiudadBusqueda")) {
				this.jButtonidCiudadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisCiudadUpdate")) {
				this.jButtonid_paisCiudadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisCiudadBusqueda")) {
				this.jButtonid_paisCiudadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaCiudadUpdate")) {
				this.jButtonid_provinciaCiudadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaCiudadBusqueda")) {
				this.jButtonid_provinciaCiudadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCiudadBusqueda")) {
				this.jButtoncodigoCiudadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCiudadBusqueda")) {
				this.jButtonnombreCiudadBusquedaActionPerformed(evt);
			}
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCiudad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCiudad")) {
				closingInternalFrameCiudad();
				
			} else if(sTipo.equals("jButtonCancelarCiudad")) {
				JInternalFrameBase jInternalFrameDetalleFormCiudad = (JInternalFrameBase)evt.getSource();
	            	
	            CiudadBeanSwingJInternalFrame jInternalFrameParent=(CiudadBeanSwingJInternalFrame)jInternalFrameDetalleFormCiudad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCiudadActionPerformed(null);
			}
			
			CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ciudad,new Object(),this.ciudadParameterGeneral,this.ciudadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCiudad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCiudad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCiudad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ciudad)) {
			if(!esControlTabla) {
				if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);			
				}
				
				if(this.ciudadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCiudad(this.ciudad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ciudadReturnGeneral=ciudadLogic.procesarEventosCiudadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ciudadLogic.getCiudads(),this.ciudad,this.ciudadParameterGeneral,this.isEsNuevoCiudad,classes);//this.ciudadLogic.getCiudad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCiudad(this.ciudadReturnGeneral,this.ciudadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ciudadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCiudad(classes,this.ciudadReturnGeneral,this.ciudadBean,false);
					}
						
					if(this.ciudadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCiudad(this.ciudadReturnGeneral.getCiudad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCiudad(this.ciudadReturnGeneral.getCiudad());	
					}
						
					if(this.ciudadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCiudad(this.ciudadReturnGeneral.getCiudad(),classes);//this.ciudadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCiudad(this.ciudad,classes);//this.ciudadBean);									
				}
			
				if(CiudadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCiudad(this.ciudad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCiudad(this.ciudad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ciudadAnterior!=null) {
						this.ciudad=this.ciudadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.ciudadReturnGeneral=ciudadLogic.procesarEventosCiudadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ciudadLogic.getCiudads(),this.ciudad,this.ciudadParameterGeneral,this.isEsNuevoCiudad,classes);//this.ciudadLogic.getCiudad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ciudadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ciudadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ciudadReturnGeneral.getCiudad(),ciudadLogic.getCiudads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ciudadReturnGeneral.getCiudad(),this.ciudads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCiudad.repaint();
				
				//((AbstractTableModel) this.jTableDatosCiudad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCiudad();
			}
		}
	}
	
	public void actualizarVisualTableDatosCiudad() throws Exception {
		
		CiudadModel ciudadModel=(CiudadModel)this.jTableDatosCiudad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ciudadModel.ciudads=this.ciudadLogic.getCiudads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ciudadModel.ciudads=this.ciudads;
		}
		
		
		((CiudadModel) this.jTableDatosCiudad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCiudad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getciudadAnterior(),this.ciudadLogic.getCiudads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getciudadAnterior(),this.ciudads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCiudad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCiudad(Ciudad ciudad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
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
										
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ciudad,new Object(),generalEntityParameterGeneral,this.ciudadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ciudadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CiudadConstantesFunciones.getClassesRelationshipsOfCiudad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CiudadConstantesFunciones.getClassesRelationshipsFromStringsOfCiudad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCiudad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CiudadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ciudad,new Object(),generalEntityParameterGeneral,this.ciudadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCiudad(CiudadBean ciudadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCiudad(ArrayList<Classe> classes,CiudadReturnGeneral ciudadReturnGeneral,CiudadBean ciudadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCiudad(Ciudad ciudad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ciudad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCiudad = new CiudadDetalleFormJInternalFrame(jDesktopPane,this.ciudadSessionBean.getConGuardarRelaciones(),this.ciudadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCiudad);
		this.jInternalFrameDetalleFormCiudad.setVisible(false);
		this.jInternalFrameDetalleFormCiudad.setSelected(false);						
		
		this.jInternalFrameDetalleFormCiudad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCiudad.ciudadLogic=this.ciudadLogic;
		
		this.cargarCombosFrameForeignKeyCiudad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCiudad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCiudad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCiudad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCiudad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCiudad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCiudad"));
		
		this.jInternalFrameDetalleFormCiudad.jButtonModificarCiudad.addActionListener(new ButtonActionListener(this,"ModificarCiudad"));

		
		this.jInternalFrameDetalleFormCiudad.jButtonModificarToolBarCiudad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCiudad"));
					
		this.jInternalFrameDetalleFormCiudad.jMenuItemModificarCiudad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCiudad"));		
		
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.addActionListener (new ButtonActionListener(this,"ActualizarCiudad"));
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonActualizarToolBarCiudad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCiudad"));
						
		this.jInternalFrameDetalleFormCiudad.jMenuItemActualizarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCiudad"));		
		
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.addActionListener (new ButtonActionListener(this,"EliminarCiudad"));
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonEliminarToolBarCiudad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCiudad"));
								
		this.jInternalFrameDetalleFormCiudad.jMenuItemEliminarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCiudad"));		
		
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.addActionListener (new ButtonActionListener(this,"CancelarCiudad"));
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonCancelarToolBarCiudad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCiudad"));
					
		this.jInternalFrameDetalleFormCiudad.jMenuItemCancelarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCiudad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCiudad.jMenuItemDetalleCerrarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCiudad"));		
		
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosToolBarCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCiudad"));
		
		
		
		this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosToolBarCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCiudad"));
		
		
		
		this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCiudad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonidCiudadBusqueda.addActionListener(new ButtonActionListener(this,"idCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_paisCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtoncodigoCiudadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonnombreCiudadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCiudadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCiudad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCiudad"));
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCiudad"));
		}
		
		this.jTableDatosCiudad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCiudad"));
		
		this.jTableDatosCiudad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCiudad"));
		
		this.jButtonNuevoCiudad.addActionListener(new ButtonActionListener(this,"NuevoCiudad"));
		
		this.jButtonDuplicarCiudad.addActionListener(new ButtonActionListener(this,"DuplicarCiudad"));
		
		this.jButtonCopiarCiudad.addActionListener(new ButtonActionListener(this,"CopiarCiudad"));
		
		this.jButtonVerFormCiudad.addActionListener(new ButtonActionListener(this,"VerFormCiudad"));
		
		
		this.jButtonNuevoToolBarCiudad.addActionListener(new ButtonActionListener(this,"NuevoToolBarCiudad"));
			
		this.jButtonDuplicarToolBarCiudad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCiudad"));
			
		this.jMenuItemNuevoCiudad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCiudad"));
			
		this.jMenuItemDuplicarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCiudad"));		
		
		
		this.jButtonNuevoRelacionesCiudad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCiudad"));
		
		
		this.jButtonNuevoRelacionesToolBarCiudad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCiudad"));
			
		this.jMenuItemNuevoRelacionesCiudad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCiudad"));		
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonModificarCiudad.addActionListener(new ButtonActionListener(this,"ModificarCiudad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonModificarToolBarCiudad.addActionListener(new ButtonActionListener(this,"ModificarToolBarCiudad"));
			
			this.jInternalFrameDetalleFormCiudad.jMenuItemModificarCiudad.addActionListener(new ButtonActionListener(this,"MenuItemModificarCiudad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCiudad.jButtonActualizarCiudad.addActionListener (new ButtonActionListener(this,"ActualizarCiudad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonActualizarToolBarCiudad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCiudad"));
				
			this.jInternalFrameDetalleFormCiudad.jMenuItemActualizarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCiudad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonEliminarCiudad.addActionListener (new ButtonActionListener(this,"EliminarCiudad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonEliminarToolBarCiudad.addActionListener (new ButtonActionListener(this,"EliminarToolBarCiudad"));
						
			this.jInternalFrameDetalleFormCiudad.jMenuItemEliminarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCiudad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonCancelarCiudad.addActionListener (new ButtonActionListener(this,"CancelarCiudad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonCancelarToolBarCiudad.addActionListener (new ButtonActionListener(this,"CancelarToolBarCiudad"));
			
			this.jInternalFrameDetalleFormCiudad.jMenuItemCancelarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCiudad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCiudad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCiudad"));		
		
		
		this.jButtonCerrarCiudad.addActionListener (new ButtonActionListener(this,"CerrarCiudad"));
		
		
		this.jButtonCerrarToolBarCiudad.addActionListener (new ButtonActionListener(this,"CerrarToolBarCiudad"));
			
		this.jMenuItemCerrarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCiudad"));
			
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jMenuItemDetalleCerrarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCiudad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosCiudad"));
		}
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosToolBarCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCiudad"));
		}
		
		this.jButtonCopiarToolBarCiudad.addActionListener (new ButtonActionListener(this,"CopiarToolBarCiudad"));
			
		this.jButtonVerFormToolBarCiudad.addActionListener (new ButtonActionListener(this,"VerFormToolBarCiudad"));
		
		this.jMenuItemGuardarCambiosCiudad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCiudad"));
			
		this.jMenuItemCopiarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCiudad"));		
		
		this.jMenuItemVerFormCiudad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCiudad"));		
		
		
		this.jButtonGuardarCambiosTablaCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCiudad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCiudad"));
			
		this.jMenuItemGuardarCambiosTablaCiudad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCiudad"));		
		
		
		
		this.jButtonRecargarInformacionCiudad.addActionListener (new ButtonActionListener(this,"RecargarInformacionCiudad"));
					
		this.jButtonRecargarInformacionToolBarCiudad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCiudad"));
		
		this.jMenuItemRecargarInformacionCiudad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCiudad"));		
		
		
		
		this.jButtonAnterioresCiudad.addActionListener (new ButtonActionListener(this,"AnterioresCiudad"));
		
		
		this.jButtonAnterioresToolBarCiudad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCiudad"));
		
		this.jMenuItemAnterioresCiudad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCiudad"));		
		
		
		this.jButtonSiguientesCiudad.addActionListener (new ButtonActionListener(this,"SiguientesCiudad"));
		
		
		this.jButtonSiguientesToolBarCiudad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCiudad"));
			
		this.jMenuItemSiguientesCiudad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCiudad"));
			
		this.jMenuItemAbrirOrderByCiudad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCiudad"));
			
		this.jMenuItemMostrarOcultarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCiudad"));
			
		this.jMenuItemDetalleAbrirOrderByCiudad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCiudad"));
			
		this.jMenuItemDetalleMostarOcultarCiudad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCiudad"));		
		
		
		this.jButtonNuevoGuardarCambiosCiudad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCiudad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCiudad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCiudad"));
			
		this.jMenuItemNuevoGuardarCambiosCiudad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCiudad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCiudad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCiudad"));

		this.jCheckBoxSeleccionadosCiudad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCiudad"));
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCiudad"));
		}
		
		
		this.jComboBoxTiposRelacionesCiudad.addActionListener (new ButtonActionListener(this,"TiposRelacionesCiudad"));
			
		this.jComboBoxTiposAccionesCiudad.addActionListener (new ButtonActionListener(this,"TiposAccionesCiudad"));
					
		this.jComboBoxTiposSeleccionarCiudad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCiudad"));
			
		this.jTextFieldValorCampoGeneralCiudad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCiudad"));		
		
		
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonidCiudadBusqueda.addActionListener(new ButtonActionListener(this,"idCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_paisCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtoncodigoCiudadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonnombreCiudadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCiudadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreCiudad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCiudad"));

			this.jButtonFK_IdPaisCiudad.addActionListener(new ButtonActionListener(this,"FK_IdPaisCiudad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCiudad!=null) {
				this.jInternalFrameReporteDinamicoCiudad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCiudad"));
				this.jInternalFrameReporteDinamicoCiudad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCiudad"));
				this.jInternalFrameReporteDinamicoCiudad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCiudad"));
			}
			
			//this.jButtonCerrarReporteDinamicoCiudad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCiudad"));				
			//this.jButtonGenerarReporteDinamicoCiudad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCiudad"));
			//this.jButtonGenerarExcelReporteDinamicoCiudad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCiudad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCiudad!=null) {
				this.jInternalFrameImportacionCiudad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCiudad"));
				this.jInternalFrameImportacionCiudad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCiudad"));
				this.jInternalFrameImportacionCiudad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCiudad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCiudad.addActionListener (new ButtonActionListener(this,"AbrirOrderByCiudad"));
			
			this.jButtonAbrirOrderByToolBarCiudad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCiudad"));			
			
			if(this.jInternalFrameOrderByCiudad!=null) {
				this.jInternalFrameOrderByCiudad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCiudad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCiudad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCiudad.jTabbedPaneRelacionesCiudad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCiudad"));
		
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
            		closingInternalFrameCiudad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCiudad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCiudad = (JInternalFrameBase)event.getSource();
	            	
	            CiudadBeanSwingJInternalFrame jInternalFrameParent=(CiudadBeanSwingJInternalFrame)jInternalFrameDetalleFormCiudad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCiudadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCiudad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCiudadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCiudad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCiudad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCiudad";
		inputMap = this.jButtonNuevoCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCiudadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCiudadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCiudad";
		inputMap = this.jButtonNuevoRelacionesCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCiudadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCiudad";
		inputMap = this.jButtonModificarCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCiudad";
		inputMap = this.jButtonActualizarCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCiudad";
		inputMap = this.jButtonEliminarCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCiudad";
		inputMap = this.jButtonCancelarCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCiudad";
		inputMap = this.jButtonCerrarCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCiudad";
		inputMap = this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCiudad.jButtonGuardarCambiosCiudad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCiudadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCiudad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCiudadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCiudad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCiudadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCiudad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCiudadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCiudad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCiudadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonidCiudadBusqueda.addActionListener(new ButtonActionListener(this,"idCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_paisCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_paisCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_paisCiudadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonid_provinciaCiudadBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtoncodigoCiudadBusqueda.addActionListener(new ButtonActionListener(this,"codigoCiudadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCiudad.jButtonnombreCiudadBusqueda.addActionListener(new ButtonActionListener(this,"nombreCiudadBusqueda"));
		
		
		this.jButtonBusquedaPorNombreCiudad.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCiudad"));

		this.jButtonFK_IdPaisCiudad.addActionListener(new ButtonActionListener(this,"FK_IdPaisCiudad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCiudad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCiudadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCiudadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCiudad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCiudad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
					ciudadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ciudad ciudadAux:ciudads) {
					ciudadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCiudadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCiudad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
						ciudadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ciudad ciudadAux:ciudads) {
						ciudadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ciudad ciudadAux:ciudads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCiudad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCiudad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCiudad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCiudad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCiudadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCiudad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCiudad.getSelectedRows();
			
			Ciudad ciudadLocal=new Ciudad();
			
			//this.seleccionarTodosCiudad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ciudadLocal =(Ciudad) this.ciudadLogic.getCiudads().toArray()[this.jTableDatosCiudad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ciudadLocal =(Ciudad) this.ciudads.toArray()[this.jTableDatosCiudad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ciudadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
						ciudadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Ciudad ciudadAux:ciudads) {
						ciudadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCiudad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCiudad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCiudad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCiudad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCiudadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCiudadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCiudadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCiudad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCiudad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Ciudad ciudadAux:this.ciudadLogic.getCiudads()) {
				
						if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ciudadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ciudadAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ciudad ciudadAux:ciudads) {
					
						if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ciudadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ciudadAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCiudad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCiudadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCiudad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCiudad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCiudad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCiudad) {				
					conSplash=true;//false;										
					
					//this.startProcessCiudad(conSplash);
				
					this.generarReporteCiudadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCiudadsSeleccionados();
				//this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCiudadsSeleccionados(false);
				//this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCiudadsSeleccionados(true);
				//this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCiudad();
				
				this.exportarCiudadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCiudads();
				//this.importarCiudads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCiudad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCiudadsSeleccionados();
				//this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ciudad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCiudad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCiudad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCiudad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
				}	
			} 			
			else if(CiudadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCiudad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCiudad(conSplash);
					
						//this.actualizarParametrosGeneralCiudad();
						
						this.generarReporteProcesoAccionCiudadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CiudadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CiudadES SELECCIONADOS?", "MANTENIMIENTO DE Ciudad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCiudad();
				
						this.actualizarParametrosGeneralCiudad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ciudadReturnGeneral=ciudadLogic.procesarAccionCiudadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ciudadLogic.getCiudads(),this.ciudadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCiudadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCiudad();
					
					CiudadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCiudadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCiudad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCiudad.jComboBoxTiposAccionesFormularioCiudad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCiudad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCiudadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCiudad();
			
			if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
			Ciudad ciudad=new Ciudad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCiudad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCiudad.getSelectedItem();
			
			
			
			
			ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(ciudadsSeleccionados.size()==1) {
				for(Ciudad ciudadAux:ciudadsSeleccionados) {
					ciudad=ciudadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCiudad();
			
      		//this.finishProcessCiudad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCiudadReturnGeneral() throws Exception {
		if(this.ciudadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ciudadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ciudadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ciudadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ciudadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ciudadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCiudad(false);
		}
		
		if(this.ciudadReturnGeneral.getConRetornoLista() || this.ciudadReturnGeneral.getConRetornoObjeto()) {
			if(this.ciudadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ciudadLogic.setCiudads(this.ciudadReturnGeneral.getCiudads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.ciudadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ciudadLogic.setCiudad(this.ciudadReturnGeneral.getCiudad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCiudad(false);
		}
	}
	
	public void actualizarParametrosGeneralCiudad() throws Exception {
		
		
	}
	
	public ArrayList<Ciudad> getCiudadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCiudad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Ciudad ciudadAux:ciudadLogic.getCiudads()) {
					if(ciudadAux.getIsSelected()) {
						ciudadsSeleccionados.add(ciudadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Ciudad ciudadAux:this.ciudads) {
					if(ciudadAux.getIsSelected()) {
						ciudadsSeleccionados.add(ciudadAux);				
					}
				}
			}
			
			if(ciudadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ciudadsSeleccionados.addAll(this.ciudadLogic.getCiudads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ciudadsSeleccionados.addAll(this.ciudads);				
					}
				}
			}
		} else {
			ciudadsSeleccionados.add(this.ciudad);
		}
		
		return ciudadsSeleccionados;
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
	
	public void generarReporteCiudadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCiudadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCiudadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCiudadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCiudadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ciudad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCiudads("Todos",ciudadsSeleccionados);
		
	}	
	
	public void generarReporteNormalCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCiudads("Todos",ciudadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCiudadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCiudads("Todos",ciudadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCiudad();
		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCiudad();
		
		
		//this.generarReporteCiudads("Todos",ciudadsSeleccionados ,ciudadImplementable,ciudadImplementableHome);
	}
	
	public void mostrarImportacionCiudads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCiudad();
		
		this.abrirFrameImportacionCiudad();		
		
			
		//this.generarReporteCiudads("Todos",ciudadsSeleccionados ,ciudadImplementable,ciudadImplementableHome);
	}
	
	public void importarCiudads() throws Exception {		
	
	}
	
	public void exportarCiudadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCiudadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCiudadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCiudadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ciudad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCiudad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Ciudad ciudadAux:ciudadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCiudad(ciudadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ciudadAux.setsDetalleGeneralEntityReporte(ciudadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCiudad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CiudadConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCiudad(Ciudad ciudad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ciudad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ciudad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ciudad.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ciudad.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ciudad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ciudad.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Ciudads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCiudad(row);				
				iRow++;
			}				
			
			for(Ciudad ciudadAux:ciudadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCiudad(ciudadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCiudadsSeleccionados() throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();		
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ciudad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ciudads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ciudad");
			//elementRoot.appendChild(element);
		
			for(Ciudad ciudadAux:ciudadsSeleccionados) {
				element = document.createElement("ciudad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCiudad(ciudadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ciudadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ciudad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCiudad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CiudadConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCiudad(Ciudad ciudad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ciudad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ciudad.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ciudad.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ciudad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(ciudad.getnombre());				
	}
	
	public void setFilaDatosExportarXmlCiudad(Ciudad ciudad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CiudadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ciudad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CiudadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ciudad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(CiudadConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(ciudad.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementprovincia_descripcion = document.createElement(CiudadConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(ciudad.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementcodigo = document.createElement(CiudadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(ciudad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CiudadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(ciudad.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoCiudadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Ciudad> ciudadsSeleccionados=new ArrayList<Ciudad>();
		
		ciudadsSeleccionados=this.getCiudadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCiudad(ciudadsSeleccionados);
		
		this.generarReporteCiudads("Todos",ciudadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCiudad(ArrayList<Ciudad> ciudadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Ciudad ciudadAux:ciudadsSeleccionados) {
				ciudadAux.setsDetalleGeneralEntityReporte(ciudadAux.toString());
			
				if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					ciudadAux.setsDescripcionGeneralEntityReporte1(ciudadAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					ciudadAux.setsDescripcionGeneralEntityReporte1(ciudadAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					ciudadAux.setsDescripcionGeneralEntityReporte1(ciudadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CiudadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					ciudadAux.setsDescripcionGeneralEntityReporte1(ciudadAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CiudadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCiudad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCiudad=true;
				this.isVisibilidadCeldaNuevoRelacionesCiudad=true;
				this.isVisibilidadCeldaGuardarCambiosCiudad=true;
			}
			
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=true;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=true;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=true;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=true;
			this.isVisibilidadCeldaEliminarCiudad=true;
			this.isVisibilidadCeldaCancelarCiudad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=true;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=true;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=false;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCiudad=true;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=true;
			this.isVisibilidadCeldaGuardarCambiosCiudad=true;
			this.isVisibilidadCeldaModificarCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=true;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=false;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
			this.isVisibilidadCeldaModificarCiudad=true;
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
			this.isVisibilidadCeldaCancelarCiudad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCiudad=false;
				} else {
					this.isVisibilidadCeldaGuardarCiudad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CiudadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCiudad=true;
			this.isVisibilidadCeldaNuevoRelacionesCiudad=true;
			this.isVisibilidadCeldaGuardarCambiosCiudad=true;
		} else {
			this.actualizarEstadoPanelsCiudad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCiudad=false;
			//this.isVisibilidadCeldaVerFormCiudad=false;
			this.isVisibilidadCeldaDuplicarCiudad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ciudadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
		} else {
			this.isVisibilidadCeldaNuevoCiudad=false;
			this.isVisibilidadCeldaGuardarCambiosCiudad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ciudadSessionBean.getEsGuardarRelacionado()) {
			if(!ciudadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCiudad=false;												
			}
			
			this.jButtonCerrarCiudad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCiudad=false;
		}
		
		if(!this.permiteMantenimiento(this.ciudad)) {
			this.isVisibilidadCeldaActualizarCiudad=false;
			this.isVisibilidadCeldaEliminarCiudad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCiudad() {
	}
	
	public void actualizarEstadoPanelsCiudad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(false);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCiudad!=null) {
				this.jScrollPanelDatosEdicionCiudad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCiudad!=null) {
				this.jScrollPanelDatosCiudad.setVisible(true);
			}
			
			if(this.jPanelPaginacionCiudad!=null) {
				this.jPanelPaginacionCiudad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ciudadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCiudad!=null) {
					this.jTabbedPaneBusquedasCiudad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ciudadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCiudad!=null) {
				this.jTabbedPaneBusquedasCiudad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCiudad!=null) {
				this.jPanelParametrosReportesCiudad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCiudad.remove(jPanelBusquedaPorNombreCiudad);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasCiudad.remove(jPanelFK_IdPaisCiudad);}
		}
		
	}

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadBusquedaPorNombre=isParaProvinciaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasCiudad.remove(jPanelBusquedaPorNombreCiudad);}

			this.isVisibilidadFK_IdPais=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasCiudad.remove(jPanelFK_IdPaisCiudad);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CiudadSessionBean ciudadSessionBean=new CiudadSessionBean();
		
		if(this.ciudadSessionBean==null) {
			this.ciudadSessionBean=new CiudadSessionBean();
		}
		
		this.ciudadSessionBean.setsUltimaBusquedaCiudad(this.getsAccionBusqueda());
		this.ciudadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.ciudadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			ciudadSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			ciudadSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CiudadSessionBean ciudadSessionBean=new CiudadSessionBean();
		
		if(this.ciudadSessionBean==null) {
			this.ciudadSessionBean=new CiudadSessionBean();
		}
		
		if(this.ciudadSessionBean.getsUltimaBusquedaCiudad()!=null&&!this.ciudadSessionBean.getsUltimaBusquedaCiudad().equals("")) {
			this.setsAccionBusqueda(ciudadSessionBean.getsUltimaBusquedaCiudad());
			this.setiNumeroPaginacion(ciudadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(ciudadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(ciudadSessionBean.getnombre());
				ciudadSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(ciudadSessionBean.getid_pais());
				ciudadSessionBean.setid_pais(-1L);
			}
		}
		
		this.ciudadSessionBean.setsUltimaBusquedaCiudad("");
		this.ciudadSessionBean.setiNumeroPaginacion(CiudadConstantesFunciones.INUMEROPAGINACION);
		this.ciudadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCiudad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCiudad() {
		this.updateBorderResaltarBusquedasFormularioCiudad();
		this.updateVisibilidadBusquedasFormularioCiudad();
		this.updateHabilitarBusquedasFormularioCiudad();
	}
	
	public void updateBorderResaltarBusquedasFormularioCiudad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCiudad.getComponents().length>0) {
	

		if(this.ciudadConstantesFunciones.resaltarBusquedaPorNombreCiudad!=null) {
			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelBusquedaPorNombreCiudad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
				jPanel.setBorder(this.ciudadConstantesFunciones.resaltarBusquedaPorNombreCiudad);
			}
		}

		if(this.ciudadConstantesFunciones.resaltarFK_IdPaisCiudad!=null) {
			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelFK_IdPaisCiudad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
				jPanel.setBorder(this.ciudadConstantesFunciones.resaltarFK_IdPaisCiudad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCiudad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCiudad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelBusquedaPorNombreCiudad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ciudadConstantesFunciones.mostrarBusquedaPorNombreCiudad);
			if(!this.ciudadConstantesFunciones.mostrarBusquedaPorNombreCiudad && index>-1) {
				this.jTabbedPaneBusquedasCiudad.remove(index);
			}

			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelFK_IdPaisCiudad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ciudadConstantesFunciones.mostrarFK_IdPaisCiudad);
			if(!this.ciudadConstantesFunciones.mostrarFK_IdPaisCiudad && index>-1) {
				this.jTabbedPaneBusquedasCiudad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCiudad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCiudad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelBusquedaPorNombreCiudad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ciudadConstantesFunciones.activarBusquedaPorNombreCiudad);
				this.jTabbedPaneBusquedasCiudad.setEnabledAt(index,this.ciudadConstantesFunciones.activarBusquedaPorNombreCiudad);
			}

			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelFK_IdPaisCiudad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ciudadConstantesFunciones.activarFK_IdPaisCiudad);
				this.jTabbedPaneBusquedasCiudad.setEnabledAt(index,this.ciudadConstantesFunciones.activarFK_IdPaisCiudad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCiudad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelBusquedaPorNombreCiudad);

			this.jTabbedPaneBusquedasCiudad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);

			this.ciudadConstantesFunciones.setResaltarBusquedaPorNombreCiudad(resaltar);

			jPanel.setBorder(this.ciudadConstantesFunciones.resaltarBusquedaPorNombreCiudad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasCiudad.indexOfComponent(this.jPanelFK_IdPaisCiudad);

			this.jTabbedPaneBusquedasCiudad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCiudad.getComponent(index);

			this.ciudadConstantesFunciones.setResaltarFK_IdPaisCiudad(resaltar);

			jPanel.setBorder(this.ciudadConstantesFunciones.resaltarFK_IdPaisCiudad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCiudad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCiudad() throws Exception {

		if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCiudad();
		this.updateVisibilidadResaltarControlesFormularioCiudad();
		this.updateHabilitarResaltarControlesFormularioCiudad();
		
	}
	
	public void updateBorderResaltarControlesFormularioCiudad() throws Exception {
		if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ciudadConstantesFunciones.resaltaridCiudad!=null && this.jInternalFrameDetalleFormCiudad!=null) {this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setBorder(this.ciudadConstantesFunciones.resaltaridCiudad);}
		if(this.ciudadConstantesFunciones.resaltarid_paisCiudad!=null && this.jInternalFrameDetalleFormCiudad!=null) {this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setBorder(this.ciudadConstantesFunciones.resaltarid_paisCiudad);}
		if(this.ciudadConstantesFunciones.resaltarid_provinciaCiudad!=null && this.jInternalFrameDetalleFormCiudad!=null) {this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setBorder(this.ciudadConstantesFunciones.resaltarid_provinciaCiudad);}
		if(this.ciudadConstantesFunciones.resaltarcodigoCiudad!=null && this.jInternalFrameDetalleFormCiudad!=null) {this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setBorder(this.ciudadConstantesFunciones.resaltarcodigoCiudad);}
		if(this.ciudadConstantesFunciones.resaltarnombreCiudad!=null && this.jInternalFrameDetalleFormCiudad!=null) {this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setBorder(this.ciudadConstantesFunciones.resaltarnombreCiudad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCiudad() throws Exception {		
		if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
	
		//this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setVisible(this.ciudadConstantesFunciones.mostraridCiudad);
		this.jInternalFrameDetalleFormCiudad.jPanelidCiudad.setVisible(this.ciudadConstantesFunciones.mostraridCiudad);
		//this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setVisible(this.ciudadConstantesFunciones.mostrarid_paisCiudad);
		this.jInternalFrameDetalleFormCiudad.jPanelid_paisCiudad.setVisible(this.ciudadConstantesFunciones.mostrarid_paisCiudad);
		//this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setVisible(this.ciudadConstantesFunciones.mostrarid_provinciaCiudad);
		this.jInternalFrameDetalleFormCiudad.jPanelid_provinciaCiudad.setVisible(this.ciudadConstantesFunciones.mostrarid_provinciaCiudad);
		//this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setVisible(this.ciudadConstantesFunciones.mostrarcodigoCiudad);
		this.jInternalFrameDetalleFormCiudad.jPanelcodigoCiudad.setVisible(this.ciudadConstantesFunciones.mostrarcodigoCiudad);
		//this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setVisible(this.ciudadConstantesFunciones.mostrarnombreCiudad);
		this.jInternalFrameDetalleFormCiudad.jPanelnombreCiudad.setVisible(this.ciudadConstantesFunciones.mostrarnombreCiudad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCiudad() throws Exception {
		if(this.jInternalFrameDetalleFormCiudad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCiudad!=null) {
	
		this.jInternalFrameDetalleFormCiudad.jLabelidCiudad.setEnabled(this.ciudadConstantesFunciones.activaridCiudad);
		this.jInternalFrameDetalleFormCiudad.jComboBoxid_paisCiudad.setEnabled(this.ciudadConstantesFunciones.activarid_paisCiudad);
		this.jInternalFrameDetalleFormCiudad.jComboBoxid_provinciaCiudad.setEnabled(this.ciudadConstantesFunciones.activarid_provinciaCiudad);
		this.jInternalFrameDetalleFormCiudad.jTextFieldcodigoCiudad.setEnabled(this.ciudadConstantesFunciones.activarcodigoCiudad);
		this.jInternalFrameDetalleFormCiudad.jTextAreanombreCiudad.setEnabled(this.ciudadConstantesFunciones.activarnombreCiudad);
		}
	}
	
		
}