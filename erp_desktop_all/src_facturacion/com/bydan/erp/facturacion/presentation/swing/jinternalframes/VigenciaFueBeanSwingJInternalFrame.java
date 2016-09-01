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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.VigenciaFueConstantesFunciones;
import com.bydan.erp.facturacion.util.VigenciaFueParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.VigenciaFueParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.VigenciaFueBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class VigenciaFueBeanSwingJInternalFrame extends VigenciaFueJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VigenciaFueBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VigenciaFue> vigenciafueValidator = new ClassValidator<VigenciaFue>(VigenciaFue.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VigenciaFue vigenciafue;	
	public VigenciaFue vigenciafueAux;
	public VigenciaFue vigenciafueAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VigenciaFue vigenciafueTotales;
	public Long idVigenciaFueActual;
	public Long iIdNuevoVigenciaFue=0L;
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
	
	public Boolean isPermisoTodoVigenciaFue;
	public Boolean isPermisoNuevoVigenciaFue;
	public Boolean isPermisoActualizarVigenciaFue;
	public Boolean isPermisoActualizarOriginalVigenciaFue;
	public Boolean isPermisoEliminarVigenciaFue;
	public Boolean isPermisoGuardarCambiosVigenciaFue;
	public Boolean isPermisoConsultaVigenciaFue;
	public Boolean isPermisoBusquedaVigenciaFue;
	public Boolean isPermisoReporteVigenciaFue;
	public Boolean isPermisoPaginacionMedioVigenciaFue;
	public Boolean isPermisoPaginacionAltoVigenciaFue;
	public Boolean isPermisoPaginacionTodoVigenciaFue;
	public Boolean isPermisoCopiarVigenciaFue;
	public Boolean isPermisoVerFormVigenciaFue;
	public Boolean isPermisoDuplicarVigenciaFue;
	public Boolean isPermisoOrdenVigenciaFue;
	
	
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
	
	public VigenciaFueParameterReturnGeneral vigenciafueReturnGeneral;
	public VigenciaFueParameterReturnGeneral vigenciafueParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVigenciaFue=false;
	public Boolean esParaAccionDesdeFormularioVigenciaFue=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VigenciaFueSessionBeanAdditional vigenciafueSessionBeanAdditional=null;
	
	public VigenciaFueSessionBeanAdditional getVigenciaFueSessionBeanAdditional() {
		return this.vigenciafueSessionBeanAdditional;
	}
	
	public void setVigenciaFueSessionBeanAdditional(VigenciaFueSessionBeanAdditional vigenciafueSessionBeanAdditional) {
		try {
			this.vigenciafueSessionBeanAdditional=vigenciafueSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VigenciaFueBeanSwingJInternalFrameAdditional vigenciafueBeanSwingJInternalFrameAdditional=null;
	//public class VigenciaFueBeanSwingJInternalFrame
	
	public VigenciaFueBeanSwingJInternalFrameAdditional getVigenciaFueBeanSwingJInternalFrameAdditional() {
		return this.vigenciafueBeanSwingJInternalFrameAdditional;
	}
	
	public void setVigenciaFueBeanSwingJInternalFrameAdditional(VigenciaFueBeanSwingJInternalFrameAdditional vigenciafueBeanSwingJInternalFrameAdditional) {
		try {
			this.vigenciafueBeanSwingJInternalFrameAdditional=vigenciafueBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VigenciaFueLogic vigenciafueLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VigenciaFue vigenciafueBean;
	public VigenciaFueConstantesFunciones vigenciafueConstantesFunciones;
	//public VigenciaFueParameterReturnGeneral vigenciafueReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	
	//PARAMETROS
	
	
	//public List<VigenciaFue> vigenciafues;	
	//public List<VigenciaFue> vigenciafuesEliminados;
	//public List<VigenciaFue> vigenciafuesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVigenciaFue=false;
	public Boolean isVisibilidadCeldaDuplicarVigenciaFue=true;
	public Boolean isVisibilidadCeldaCopiarVigenciaFue=true;
	public Boolean isVisibilidadCeldaVerFormVigenciaFue=true;
	public Boolean isVisibilidadCeldaOrdenVigenciaFue=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
	public Boolean isVisibilidadCeldaModificarVigenciaFue=false;
	public Boolean isVisibilidadCeldaActualizarVigenciaFue=false;
	public Boolean isVisibilidadCeldaEliminarVigenciaFue=false;
	public Boolean isVisibilidadCeldaCancelarVigenciaFue=false;
	public Boolean isVisibilidadCeldaGuardarVigenciaFue=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVigenciaFue=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoVigenciaFue() {
		return this.iIdNuevoVigenciaFue;
	}

	public void setiIdNuevoVigenciaFue(Long iIdNuevoVigenciaFue) {
		this.iIdNuevoVigenciaFue = iIdNuevoVigenciaFue;
	}
	
	public Long getidVigenciaFueActual() {
		return this.idVigenciaFueActual;
	}

	public void setidVigenciaFueActual(Long idVigenciaFueActual) {
		this.idVigenciaFueActual = idVigenciaFueActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VigenciaFue getvigenciafue() {
		return this.vigenciafue;
	}

	public void setvigenciafue(VigenciaFue vigenciafue) {
		this.vigenciafue = vigenciafue;
	}
	
	public VigenciaFue getvigenciafueAux() {
		return this.vigenciafueAux;
	}

	public void setvigenciafueAux(VigenciaFue vigenciafueAux) {
		this.vigenciafueAux = vigenciafueAux;
	}				
	
	public VigenciaFue getvigenciafueAnterior() {
		return this.vigenciafueAnterior;
	}

	public void setvigenciafueAnterior(VigenciaFue vigenciafueAnterior) {
		this.vigenciafueAnterior = vigenciafueAnterior;
	}	
	
	public VigenciaFue getvigenciafueTotales() {
		return this.vigenciafueTotales;
	}

	public void setvigenciafueTotales(VigenciaFue vigenciafueTotales) {
		this.vigenciafueTotales = vigenciafueTotales;
	}	
	
	public VigenciaFue getvigenciafueBean() {
		return this.vigenciafueBean;
	}

	public void setvigenciafueBean(VigenciaFue vigenciafueBean) {
		this.vigenciafueBean = vigenciafueBean;
	}	
	
	public VigenciaFueParameterReturnGeneral getvigenciafueReturnGeneral() {
		return this.vigenciafueReturnGeneral;
	}

	public void setvigenciafueReturnGeneral(VigenciaFueParameterReturnGeneral vigenciafueReturnGeneral) {
		this.vigenciafueReturnGeneral = vigenciafueReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VigenciaFueLogic getVigenciaFueLogic()	{		
		return vigenciafueLogic;
	}

	public void setVigenciaFueLogic(VigenciaFueLogic vigenciafueLogic) {
		this.vigenciafueLogic = vigenciafueLogic;
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
	
	public Boolean getIsEsNuevoVigenciaFue() {
		return isEsNuevoVigenciaFue;
	}

	public void setIsEsNuevoVigenciaFue(Boolean isEsNuevoVigenciaFue) {
		this.isEsNuevoVigenciaFue = isEsNuevoVigenciaFue;
	}

	public Boolean getEsParaAccionDesdeFormularioVigenciaFue() {
		return esParaAccionDesdeFormularioVigenciaFue;
	}
	
	public void setEsParaAccionDesdeFormularioVigenciaFue(Boolean esParaAccionDesdeFormularioVigenciaFue) {
		this.esParaAccionDesdeFormularioVigenciaFue = esParaAccionDesdeFormularioVigenciaFue;
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

			if(this.vigenciafueSessionBean==null) {
				this.vigenciafueSessionBean=new VigenciaFueSessionBean();
			}

			if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(vigenciafueSessionBean.getlidPaisActual());
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

			if(this.vigenciafueSessionBean==null) {
				this.vigenciafueSessionBean=new VigenciaFueSessionBean();
			}

			if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
					ciudadLogic.getEntityWithConnection(vigenciafueSessionBean.getlidCiudadActual());
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

					if(this.vigenciafue!=null) {
						this.vigenciafue.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
						this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisVigenciaFue.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
						if(this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.getItemCount()>0) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisVigenciaFue!=null) {
						jComboBoxid_paisFK_IdPaisVigenciaFue.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisVigenciaFue!=null) {
							//jComboBoxid_paisFK_IdPaisVigenciaFue.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisVigenciaFue.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisVigenciaFue.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisVigenciaFueGenerico)throws Exception
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
				jComboBoxid_paisVigenciaFueGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisVigenciaFueGenerico!=null && jComboBoxid_paisVigenciaFueGenerico.getItemCount()>0) {
					jComboBoxid_paisVigenciaFueGenerico.setSelectedIndex(0);
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

					if(this.vigenciafue!=null) {
						this.vigenciafue.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
						this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxid_ciudadVigenciaFue.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
						if(this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.getItemCount()>0) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxid_ciudadFK_IdCiudadVigenciaFue!=null) {
						jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxid_ciudadFK_IdCiudadVigenciaFue!=null) {
							//jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setSelectedItem(ciudadTemp);
							if(jComboBoxid_ciudadFK_IdCiudadVigenciaFue.getItemCount()>0) {
								jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxid_ciudadVigenciaFueGenerico)throws Exception
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
				jComboBoxid_ciudadVigenciaFueGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxid_ciudadVigenciaFueGenerico!=null && jComboBoxid_ciudadVigenciaFueGenerico.getItemCount()>0) {
					jComboBoxid_ciudadVigenciaFueGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(VigenciaFue vigenciafue,JComboBox jComboBoxid_paisVigenciaFueGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisVigenciaFueGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisVigenciaFueGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				vigenciafue.setid_pais(paisAux.getId());
				vigenciafue.setpais_descripcion(VigenciaFueConstantesFunciones.getPaisDescripcion(paisAux));
				vigenciafue.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(VigenciaFue vigenciafue,JComboBox jComboBoxid_ciudadVigenciaFueGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxid_ciudadVigenciaFueGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxid_ciudadVigenciaFueGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				vigenciafue.setid_ciudad(ciudadAux.getId());
				vigenciafue.setciudad_descripcion(VigenciaFueConstantesFunciones.getCiudadDescripcion(ciudadAux));
				vigenciafue.setCiudad(ciudadAux);			}
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

					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) { 
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVigenciaFue!=null) { 
					}

					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisVigenciaFue.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisVigenciaFue.addItem(pais);
							}
						}

						if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) { 
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVigenciaFue!=null) { 
					}

					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.addItem(ciudad);
							}
						}

						if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisVigenciaFue.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisVigenciaFue.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setSelectedItem(ciudad);
						} else {
							this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVigenciaFue() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VigenciaFueConstantesFunciones.refrescarForeignKeysDescripcionesVigenciaFue(this.vigenciafueLogic.getVigenciaFues());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VigenciaFueConstantesFunciones.refrescarForeignKeysDescripcionesVigenciaFue(this.vigenciafues);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vigenciafueLogic.setVigenciaFues(this.vigenciafues);
			vigenciafueLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VigenciaFueParameterReturnGeneral getVigenciaFueParameterGeneral() {
		return this.vigenciafueParameterGeneral;
	}
	
	public void setVigenciaFueParameterGeneral(VigenciaFueParameterReturnGeneral vigenciafueParameterGeneral) {
		this.vigenciafueParameterGeneral = vigenciafueParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVigenciaFue() {
		return isPermisoTodoVigenciaFue;
	}

	public void setIsPermisoTodoVigenciaFue(Boolean isPermisoTodoVigenciaFue) {
		this.isPermisoTodoVigenciaFue = isPermisoTodoVigenciaFue;
	}

	public Boolean getIsPermisoNuevoVigenciaFue() {
		return isPermisoNuevoVigenciaFue;
	}

	public void setIsPermisoNuevoVigenciaFue(Boolean isPermisoNuevoVigenciaFue) {
		this.isPermisoNuevoVigenciaFue = isPermisoNuevoVigenciaFue;
	}

	public Boolean getIsPermisoActualizarVigenciaFue() {
		return isPermisoActualizarVigenciaFue;
	}

	public void setIsPermisoActualizarVigenciaFue(Boolean isPermisoActualizarVigenciaFue) {
		this.isPermisoActualizarVigenciaFue = isPermisoActualizarVigenciaFue;
	}

	public Boolean getIsPermisoEliminarVigenciaFue() {
		return isPermisoEliminarVigenciaFue;
	}

	public void setIsPermisoEliminarVigenciaFue(Boolean isPermisoEliminarVigenciaFue) {
		this.isPermisoEliminarVigenciaFue = isPermisoEliminarVigenciaFue;
	}

	public Boolean getIsPermisoGuardarCambiosVigenciaFue() {
		return isPermisoGuardarCambiosVigenciaFue;
	}

	public void setIsPermisoGuardarCambiosVigenciaFue(Boolean isPermisoGuardarCambiosVigenciaFue) {
		this.isPermisoGuardarCambiosVigenciaFue = isPermisoGuardarCambiosVigenciaFue;
	}
	
	public Boolean getIsPermisoConsultaVigenciaFue() {
		return isPermisoConsultaVigenciaFue;
	}

	public void setIsPermisoConsultaVigenciaFue(Boolean isPermisoConsultaVigenciaFue) {
		this.isPermisoConsultaVigenciaFue = isPermisoConsultaVigenciaFue;
	}

	public Boolean getIsPermisoBusquedaVigenciaFue() {
		return isPermisoBusquedaVigenciaFue;
	}

	public void setIsPermisoBusquedaVigenciaFue(Boolean isPermisoBusquedaVigenciaFue) {
		this.isPermisoBusquedaVigenciaFue = isPermisoBusquedaVigenciaFue;
	}

	public Boolean getIsPermisoReporteVigenciaFue() {
		return isPermisoReporteVigenciaFue;
	}

	public void setIsPermisoReporteVigenciaFue(Boolean isPermisoReporteVigenciaFue) {
		this.isPermisoReporteVigenciaFue = isPermisoReporteVigenciaFue;
	}
	
	public Boolean getIsPermisoPaginacionMedioVigenciaFue() {
		return isPermisoPaginacionMedioVigenciaFue;
	}

	public void setIsPermisoPaginacionMedioVigenciaFue(Boolean isPermisoPaginacionMedioVigenciaFue) {
		this.isPermisoPaginacionMedioVigenciaFue = isPermisoPaginacionMedioVigenciaFue;
	}
	
	public Boolean getIsPermisoPaginacionTodoVigenciaFue() {
		return isPermisoPaginacionTodoVigenciaFue;
	}

	public void setIsPermisoPaginacionTodoVigenciaFue(Boolean isPermisoPaginacionTodoVigenciaFue) {
		this.isPermisoPaginacionTodoVigenciaFue = isPermisoPaginacionTodoVigenciaFue;
	}
	
	public Boolean getIsPermisoPaginacionAltoVigenciaFue() {
		return isPermisoPaginacionAltoVigenciaFue;
	}

	public void setIsPermisoPaginacionAltoVigenciaFue(Boolean isPermisoPaginacionAltoVigenciaFue) {
		this.isPermisoPaginacionAltoVigenciaFue = isPermisoPaginacionAltoVigenciaFue;
	}
	
	public Boolean getIsPermisoCopiarVigenciaFue() {
		return isPermisoCopiarVigenciaFue;
	}

	public void setIsPermisoCopiarVigenciaFue(Boolean isPermisoCopiarVigenciaFue) {
		this.isPermisoCopiarVigenciaFue = isPermisoCopiarVigenciaFue;
	}
	
	public Boolean getIsPermisoVerFormVigenciaFue() {
		return isPermisoVerFormVigenciaFue;
	}

	public void setIsPermisoVerFormVigenciaFue(Boolean isPermisoVerFormVigenciaFue) {
		this.isPermisoVerFormVigenciaFue = isPermisoVerFormVigenciaFue;
	}
	
	public Boolean getIsPermisoDuplicarVigenciaFue() {
		return isPermisoDuplicarVigenciaFue;
	}

	public void setIsPermisoDuplicarVigenciaFue(Boolean isPermisoDuplicarVigenciaFue) {
		this.isPermisoDuplicarVigenciaFue = isPermisoDuplicarVigenciaFue;
	}
	
	public Boolean getIsPermisoOrdenVigenciaFue() {
		return isPermisoOrdenVigenciaFue;
	}

	public void setIsPermisoOrdenVigenciaFue(Boolean isPermisoOrdenVigenciaFue) {
		this.isPermisoOrdenVigenciaFue = isPermisoOrdenVigenciaFue;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVigenciaFue() {
		return isVisibilidadCeldaNuevoVigenciaFue;
	}

	public void setIsVisibilidadCeldaNuevoVigenciaFue(Boolean isVisibilidadCeldaNuevoVigenciaFue) {
		this.isVisibilidadCeldaNuevoVigenciaFue = isVisibilidadCeldaNuevoVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVigenciaFue() {
		return isVisibilidadCeldaDuplicarVigenciaFue;
	}

	public void setIsVisibilidadCeldaDuplicarVigenciaFue(Boolean isVisibilidadCeldaDuplicarVigenciaFue) {
		this.isVisibilidadCeldaDuplicarVigenciaFue = isVisibilidadCeldaDuplicarVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVigenciaFue() {
		return isVisibilidadCeldaCopiarVigenciaFue;
	}

	public void setIsVisibilidadCeldaCopiarVigenciaFue(Boolean isVisibilidadCeldaCopiarVigenciaFue) {
		this.isVisibilidadCeldaCopiarVigenciaFue = isVisibilidadCeldaCopiarVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVigenciaFue() {
		return isVisibilidadCeldaVerFormVigenciaFue;
	}

	public void setIsVisibilidadCeldaVerFormVigenciaFue(Boolean isVisibilidadCeldaVerFormVigenciaFue) {
		this.isVisibilidadCeldaVerFormVigenciaFue = isVisibilidadCeldaVerFormVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVigenciaFue() {
		return isVisibilidadCeldaOrdenVigenciaFue;
	}

	public void setIsVisibilidadCeldaOrdenVigenciaFue(Boolean isVisibilidadCeldaOrdenVigenciaFue) {
		this.isVisibilidadCeldaOrdenVigenciaFue = isVisibilidadCeldaOrdenVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVigenciaFue() {
		return isVisibilidadCeldaNuevoRelacionesVigenciaFue;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVigenciaFue(Boolean isVisibilidadCeldaNuevoRelacionesVigenciaFue) {
		this.isVisibilidadCeldaNuevoRelacionesVigenciaFue = isVisibilidadCeldaNuevoRelacionesVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVigenciaFue() {
		return isVisibilidadCeldaModificarVigenciaFue;
	}

	public void setIsVisibilidadCeldaModificarVigenciaFue(Boolean isVisibilidadCeldaModificarVigenciaFue) {
		this.isVisibilidadCeldaModificarVigenciaFue = isVisibilidadCeldaModificarVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVigenciaFue() {
		return isVisibilidadCeldaActualizarVigenciaFue;
	}

	public void setIsVisibilidadCeldaActualizarVigenciaFue(Boolean isVisibilidadCeldaActualizarVigenciaFue) {
		this.isVisibilidadCeldaActualizarVigenciaFue = isVisibilidadCeldaActualizarVigenciaFue;
	}

	public Boolean getIsVisibilidadCeldaEliminarVigenciaFue() {
		return isVisibilidadCeldaEliminarVigenciaFue;
	}

	public void setIsVisibilidadCeldaEliminarVigenciaFue(Boolean isVisibilidadCeldaEliminarVigenciaFue) {
		this.isVisibilidadCeldaEliminarVigenciaFue = isVisibilidadCeldaEliminarVigenciaFue;
	}

	public Boolean getIsVisibilidadCeldaCancelarVigenciaFue() {
		return isVisibilidadCeldaCancelarVigenciaFue;
	}

	public void setIsVisibilidadCeldaCancelarVigenciaFue(Boolean isVisibilidadCeldaCancelarVigenciaFue) {
		this.isVisibilidadCeldaCancelarVigenciaFue = isVisibilidadCeldaCancelarVigenciaFue;
	}

	public Boolean getIsVisibilidadCeldaGuardarVigenciaFue() {
		return isVisibilidadCeldaGuardarVigenciaFue;
	}

	public void setIsVisibilidadCeldaGuardarVigenciaFue(Boolean isVisibilidadCeldaGuardarVigenciaFue) {
		this.isVisibilidadCeldaGuardarVigenciaFue = isVisibilidadCeldaGuardarVigenciaFue;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVigenciaFue() {
		return isVisibilidadCeldaGuardarCambiosVigenciaFue;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVigenciaFue(Boolean isVisibilidadCeldaGuardarCambiosVigenciaFue) {
		this.isVisibilidadCeldaGuardarCambiosVigenciaFue = isVisibilidadCeldaGuardarCambiosVigenciaFue;
	}
		
	public VigenciaFueSessionBean getvigenciafueSessionBean() {
		return this.vigenciafueSessionBean;
	}
	
	public void setvigenciafueSessionBean(VigenciaFueSessionBean vigenciafueSessionBean) {
		this.vigenciafueSessionBean=vigenciafueSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(VigenciaFue vigenciafue)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(vigenciafue,null);
				this.setActualParaGuardarCiudadForeignKey(vigenciafue,null);
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
	
	public void bugActualizarReferenciaActual(VigenciaFue vigenciafue,VigenciaFue vigenciafueAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVigenciaFue(vigenciafue);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vigenciafueAux.setId(vigenciafue.getId());
		vigenciafueAux.setVersionRow(vigenciafue.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVigenciaFue();
		
			int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vigenciafueValidator.getInvalidValues(this.vigenciafue);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vigenciafueLogic.setDatosCliente(datosCliente);
			vigenciafueLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vigenciafueAux=new  VigenciaFue();
				
				vigenciafueAux.setIsNew(true);
				vigenciafueAux.setIsChanged(true);
				
				vigenciafueAux.setVigenciaFueOriginal(this.vigenciafue);
				
				vigenciafueAux.setId(this.vigenciafue.getId());	
				vigenciafueAux.setVersionRow(this.vigenciafue.getVersionRow());	
				vigenciafueAux.setid_pais(this.vigenciafue.getid_pais());	
				vigenciafueAux.setid_ciudad(this.vigenciafue.getid_ciudad());	
				vigenciafueAux.setfecha_inicio(this.vigenciafue.getfecha_inicio());	
				vigenciafueAux.setfecha_fin(this.vigenciafue.getfecha_fin());	
				vigenciafueAux.setnumero_embarques(this.vigenciafue.getnumero_embarques());	
				vigenciafueAux.setfue(this.vigenciafue.getfue());	
				vigenciafueAux.setfecha_ultimo_embarque(this.vigenciafue.getfecha_ultimo_embarque());	
				vigenciafueAux.setvalor(this.vigenciafue.getvalor());	
				vigenciafueAux.setnumero_cajas(this.vigenciafue.getnumero_cajas());	
				vigenciafueAux.setesta_activo(this.vigenciafue.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vigenciafueAux,vigenciafues);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueLogic.saveVigenciaFues();//WithConnection
						//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);
					
					this.refrescarForeignKeysDescripcionesVigenciaFue();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vigenciafueLogic.saveVigenciaFueRelaciones(vigenciafueAux);//WithConnection
								//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vigenciafueAux,vigenciafues);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vigenciafueAux=new  VigenciaFue();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vigenciafueSessionBean.getEsGuardarRelacionado() 
					|| (this.vigenciafueSessionBean.getEsGuardarRelacionado() && this.vigenciafue.getId()>=0)) {
						
					vigenciafueAux.setIsNew(false);
				}
				
				vigenciafueAux.setIsDeleted(false);
			
				vigenciafueAux.setId(this.vigenciafue.getId());	
				vigenciafueAux.setVersionRow(this.vigenciafue.getVersionRow());	
				vigenciafueAux.setid_pais(this.vigenciafue.getid_pais());	
				vigenciafueAux.setid_ciudad(this.vigenciafue.getid_ciudad());	
				vigenciafueAux.setfecha_inicio(this.vigenciafue.getfecha_inicio());	
				vigenciafueAux.setfecha_fin(this.vigenciafue.getfecha_fin());	
				vigenciafueAux.setnumero_embarques(this.vigenciafue.getnumero_embarques());	
				vigenciafueAux.setfue(this.vigenciafue.getfue());	
				vigenciafueAux.setfecha_ultimo_embarque(this.vigenciafue.getfecha_ultimo_embarque());	
				vigenciafueAux.setvalor(this.vigenciafue.getvalor());	
				vigenciafueAux.setnumero_cajas(this.vigenciafue.getnumero_cajas());	
				vigenciafueAux.setesta_activo(this.vigenciafue.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vigenciafueAux,vigenciafues);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueLogic.saveVigenciaFues();//WithConnection
						//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);
					
					this.refrescarForeignKeysDescripcionesVigenciaFue();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vigenciafueLogic.saveVigenciaFueRelaciones(vigenciafueAux);//WithConnection
								//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vigenciafueAux,vigenciafues);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vigenciafue,vigenciafueAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vigenciafueAux=new  VigenciaFue();
				
				vigenciafueAux.setIsNew(false);
				vigenciafueAux.setIsChanged(false);
				
				vigenciafueAux.setIsDeleted(true);
				
				vigenciafueAux.setId(this.vigenciafue.getId());	
				vigenciafueAux.setVersionRow(this.vigenciafue.getVersionRow());	
				vigenciafueAux.setid_pais(this.vigenciafue.getid_pais());	
				vigenciafueAux.setid_ciudad(this.vigenciafue.getid_ciudad());	
				vigenciafueAux.setfecha_inicio(this.vigenciafue.getfecha_inicio());	
				vigenciafueAux.setfecha_fin(this.vigenciafue.getfecha_fin());	
				vigenciafueAux.setnumero_embarques(this.vigenciafue.getnumero_embarques());	
				vigenciafueAux.setfue(this.vigenciafue.getfue());	
				vigenciafueAux.setfecha_ultimo_embarque(this.vigenciafue.getfecha_ultimo_embarque());	
				vigenciafueAux.setvalor(this.vigenciafue.getvalor());	
				vigenciafueAux.setnumero_cajas(this.vigenciafue.getnumero_cajas());	
				vigenciafueAux.setesta_activo(this.vigenciafue.getesta_activo());	
				
				if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vigenciafueAux.getId()>=0) {	
						this.vigenciafuesEliminados.add(vigenciafueAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vigenciafueAux,vigenciafues);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueLogic.saveVigenciaFues();//WithConnection
						//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vigenciafueLogic.saveVigenciaFueRelaciones(vigenciafueAux);//WithConnection
								//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
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
							if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vigenciafueAux,vigenciafueLogic.getVigenciaFues());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vigenciafueAux,vigenciafues);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getVigenciaFues().addAll(this.vigenciafuesEliminados);
					
					vigenciafueLogic.saveVigenciaFues();//WithConnection
					//vigenciafueLogic.getSetVersionRowVigenciaFues();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVigenciaFue();
				
				this.vigenciafuesEliminados= new ArrayList<VigenciaFue>();		
			}
			
			if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vigencia Fue GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vigenciafue=vigenciafueAux;
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
      		//this.finishProcessVigenciaFue();
      	}
		
	}	
	
	public void actualizarRelaciones(VigenciaFue vigenciafueLocal) throws Exception {
		
		if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VigenciaFue vigenciafueLocal) throws Exception {	
		if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				vigenciafueLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				vigenciafueLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVigenciaFueActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vigenciafueValidator.getInvalidValues(this.vigenciafue);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VigenciaFue vigenciafue,List<VigenciaFue> vigenciafues) throws Exception {
		try	{		
			VigenciaFueConstantesFunciones.actualizarLista(vigenciafue,vigenciafues,this.vigenciafueSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VigenciaFue vigenciafue,List<VigenciaFue> vigenciafues) throws Exception {
		try	{			
			VigenciaFueConstantesFunciones.actualizarSelectedLista(vigenciafue,vigenciafues);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VigenciaFue> vigenciafuesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vigenciafuesLocal=this.vigenciafueLogic.getVigenciaFues();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vigenciafuesLocal=this.vigenciafues;
			}
			//ARCHITECTURE
		
			for(VigenciaFue vigenciafueLocal:vigenciafuesLocal) {
				if(this.permiteMantenimiento(vigenciafueLocal) && vigenciafueLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VigenciaFueConstantesFunciones.getVigenciaFueLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelid_paisVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelid_ciudadVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_inicioVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_finVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.NUMEROEMBARQUES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_embarquesVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.FUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfueVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.FECHAULTIMOEMBARQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_ultimo_embarqueVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelvalorVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.NUMEROCAJAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_cajasVigenciaFue,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VigenciaFueConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelesta_activoVigenciaFue,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelid_paisVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelid_ciudadVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_inicioVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_finVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_embarquesVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelfueVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_ultimo_embarqueVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelvalorVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_cajasVigenciaFue,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVigenciaFue.jLabelesta_activoVigenciaFue,"");
		
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
		this.iIdNuevoVigenciaFue--;	
		
		
		this.vigenciafueAux=new VigenciaFue();
		
		this.vigenciafueAux.setId(this.iIdNuevoVigenciaFue);
		this.vigenciafueAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vigenciafueLogic.getVigenciaFues().add(this.vigenciafueAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vigenciafues.add(this.vigenciafueAux);
		}
		//ARCHITECTURE
		
		this.vigenciafue=this.vigenciafueAux;
		
		if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVigenciaFue(this.vigenciafue);
			this.setVariablesObjetoActualToFormularioForeignKeyVigenciaFue(this.vigenciafue);
		}
				
		//this.setDefaultControlesVigenciaFue();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVigenciaFue();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVigenciaFue();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVigenciaFue();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVigenciaFue(this.vigenciafueBean,this.vigenciafue,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VigenciaFueConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
			classes=VigenciaFueConstantesFunciones.getClassesRelationshipsOfVigenciaFue(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vigenciafueReturnGeneral=vigenciafueLogic.procesarEventosVigenciaFuesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vigenciafueLogic.getVigenciaFues(),this.vigenciafue,this.vigenciafueParameterGeneral,this.isEsNuevoVigenciaFue,classes);//this.vigenciafueLogic.getVigenciaFue()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVigenciaFue(this.vigenciafueReturnGeneral,this.vigenciafueBean,false);
		
		if(this.vigenciafueReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue());
		}
		
		if(this.vigenciafueReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue(),classes);//this.vigenciafueBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVigenciaFue();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVigenciaFue();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VigenciaFueBeanSwingJInternalFrameAdditional.RecargarFormVigenciaFue(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVigenciaFue(false);
						
			if(vigenciafueSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVigenciaFue();
			}
			
			this.actualizarVisualTableDatosVigenciaFue();
			
			this.jTableDatosVigenciaFue.setRowSelectionInterval(this.getIndiceNuevoVigenciaFue(), this.getIndiceNuevoVigenciaFue());
			
			this.seleccionarFilaTablaVigenciaFueActual();
						
			this.actualizarEstadoCeldasBotonesVigenciaFue("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVigenciaFue(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarfecha_inicioVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarfecha_finVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarnumero_embarquesVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarfueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarfecha_ultimo_embarqueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarvalorVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarnumero_cajasVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activaresta_activoVigenciaFue);	
		
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarid_paisVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setEnabled(isHabilitar && this.vigenciafueConstantesFunciones.activarid_ciudadVigenciaFue);
	};
	
	public void setDefaultControlesVigenciaFue() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVigenciaFue(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vigenciafueSessionBean.setConGuardarRelaciones(true);			
			this.vigenciafueSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.setVisible(true);
			
					
		} else {
			//this.vigenciafueSessionBean.setConGuardarRelaciones(false);			
			this.vigenciafueSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVigenciaFue() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
				if(vigenciafueAux.getId().equals(this.iIdNuevoVigenciaFue)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VigenciaFue vigenciafueAux:this.vigenciafues) {
				if(vigenciafueAux.getId().equals(this.iIdNuevoVigenciaFue)) {
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
	
	public int getIndiceActualVigenciaFue(VigenciaFue vigenciafue,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
				if(vigenciafueAux.getId().equals(vigenciafue.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VigenciaFue vigenciafueAux:this.vigenciafues) {
				if(vigenciafueAux.getId().equals(vigenciafue.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVigenciaFue(VigenciaFue vigenciafueOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
				if(vigenciafueAux.getVigenciaFueOriginal().getId().equals(vigenciafueOriginal.getId())) {
					existe=true;
					vigenciafueOriginal.setId(vigenciafueAux.getId());
					vigenciafueOriginal.setVersionRow(vigenciafueAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VigenciaFue vigenciafueAux:this.vigenciafues) {
				if(vigenciafueAux.getVigenciaFueOriginal().getId().equals(vigenciafueOriginal.getId())) {
					existe=true;
					vigenciafueOriginal.setId(vigenciafueAux.getId());
					vigenciafueOriginal.setVersionRow(vigenciafueAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVigenciaFue(Boolean esParaCancelar) throws Exception {
		vigenciafuesAux=new ArrayList<VigenciaFue>();
		vigenciafueAux=new VigenciaFue();
		
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
					if(vigenciafueAux.getId()<0) {
						vigenciafuesAux.add(vigenciafueAux);
					}		
				}
				this.iIdNuevoVigenciaFue=0L;
				this.vigenciafueLogic.getVigenciaFues().removeAll(vigenciafuesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VigenciaFue vigenciafueAux:this.vigenciafues) {
					if(vigenciafueAux.getId()<0) {
						vigenciafuesAux.add(vigenciafueAux);
					}		
				}
				this.iIdNuevoVigenciaFue=0L;
				this.vigenciafues.removeAll(vigenciafuesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVigenciaFue 
					&& this.vigenciafueLogic.getVigenciaFues().size()>0
					) {
					vigenciafueAux=this.vigenciafueLogic.getVigenciaFues().get(this.vigenciafueLogic.getVigenciaFues().size() - 1);
				
					if(vigenciafueAux.getId()<0) {
						this.vigenciafueLogic.getVigenciaFues().remove(vigenciafueAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVigenciaFue && this.vigenciafues.size()>0) {
					vigenciafueAux=this.vigenciafues.get(this.vigenciafues.size() - 1);
				
					if(vigenciafueAux.getId()<0) {
						this.vigenciafues.remove(vigenciafueAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVigenciaFue(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vigenciafue.getId()<0) {
				this.vigenciafueLogic.getVigenciaFues().remove(this.vigenciafue);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vigenciafue.getId()<0) {
				this.vigenciafues.remove(this.vigenciafue);
			}
		}			
	}
	
	public void setEstadosInicialesVigenciaFue(List<VigenciaFue> vigenciafuesAux) throws Exception {
		VigenciaFueConstantesFunciones.setEstadosInicialesVigenciaFue(vigenciafuesAux);
	}
	
	public void setEstadosInicialesVigenciaFue(VigenciaFue vigenciafueAux) throws Exception {
		VigenciaFueConstantesFunciones.setEstadosInicialesVigenciaFue(vigenciafueAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVigenciaFueActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVigenciaFueActual()) {
				if(!this.isEsNuevoVigenciaFue) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVigenciaFue=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVigenciaFueActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vigencia Fue ?", "MANTENIMIENTO DE Vigencia Fue", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VigenciaFue vigenciafue) throws Exception {
		VigenciaFueConstantesFunciones.seleccionarAsignar(this.vigenciafue,vigenciafue);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVigenciaFue=this.isPermisoActualizarOriginalVigenciaFue;
			
			
			this.seleccionarAsignar(vigenciafue);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VigenciaFueConstantesFunciones.quitarEspaciosVigenciaFue(this.vigenciafue,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVigenciaFue("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vigenciafueSessionBean.setsFuncionBusquedaRapida(this.vigenciafueSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVigenciaFue) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVigenciaFue(esParaCancelar);				
				this.cancelarNuevoVigenciaFue(esParaCancelar);								
			}
			
			this.vigenciafue=new VigenciaFue();
			
			this.inicializarVigenciaFue();
			
			this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVigenciaFue() throws Exception {
		try {
			VigenciaFueConstantesFunciones.inicializarVigenciaFue(this.vigenciafue);
			
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
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vigenciafueLogic.getVigenciaFues().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVigenciaFues(String sAccionBusqueda,List<VigenciaFue> vigenciafuesParaReportes) throws Exception {
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
					sPathReporteFinal="VigenciaFue"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VigenciaFueMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VigenciaFueMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VigenciaFue"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vigencia Fues");		
		parameters.put("busquedapor", VigenciaFueConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVigenciaFue=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VigenciaFueConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VigenciaFueConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVigenciaFue=new JRBeanArrayDataSource(VigenciaFueJInternalFrame.TraerVigenciaFueBeans(vigenciafuesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVigenciaFue);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VigenciaFueConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VigenciaFueConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VigenciaFueBean.TraerVigenciaFueBeans(vigenciafuesParaReportes).toArray()));
							
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
				this.generarExcelReporteVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVigenciaFueActionPerformed(null);
					//this.generarExcelReporteVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVigenciaFues(sAccionBusqueda,sTipoArchivoReporte,vigenciafuesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVigenciaFues(String sAccionBusqueda,String sTipoArchivoReporte,List<VigenciaFue> vigenciafuesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VigenciaFues");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVigenciaFue("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VigenciaFue vigenciafue : vigenciafuesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VigenciaFueConstantesFunciones.generarExcelReporteDataVigenciaFue("NORMAL",row,workbook,vigenciafue,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVigenciaFue(String sTipo,Row row,Workbook workbook) {
		
		VigenciaFueConstantesFunciones.generarExcelReporteHeaderVigenciaFue(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVigenciaFues(String sAccionBusqueda,String sTipoArchivoReporte,List<VigenciaFue> vigenciafuesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VigenciaFues");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VigenciaFue vigenciafue : vigenciafuesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VigenciaFueConstantesFunciones.getVigenciaFueDescripcion(vigenciafue));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getnumero_embarques());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_FUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getfue());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getfecha_ultimo_embarque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vigenciafue.getnumero_cajas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(vigenciafue.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVigenciaFues(String sAccionBusqueda,String sTipoArchivoReporte,List<VigenciaFue> vigenciafuesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VigenciaFue> vigenciafuesRespaldo=null;
		
		classes=VigenciaFueConstantesFunciones.getClassesRelationshipsOfVigenciaFue(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vigenciafueLogic.setDatosCliente(this.datosCliente);
		this.vigenciafueLogic.setDatosDeep(this.datosDeep);
		this.vigenciafueLogic.setIsConDeep(true);
		
		vigenciafuesRespaldo=this.vigenciafueLogic.getVigenciaFues();
		
		this.vigenciafueLogic.setVigenciaFues(vigenciafuesParaReportes);	
		this.vigenciafueLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vigenciafuesParaReportes=this.vigenciafueLogic.getVigenciaFues();
		this.vigenciafueLogic.setVigenciaFues(vigenciafuesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VigenciaFues");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVigenciaFue("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VigenciaFue vigenciafue : vigenciafuesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVigenciaFue("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VigenciaFueConstantesFunciones.generarExcelReporteDataVigenciaFue("NORMAL",row,workbook,vigenciafue,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VigenciaFueConstantesFunciones.getVigenciaFueDescripcion(vigenciafue));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVigenciaFue.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVigenciaFue() throws Exception {		
		this.startProcessVigenciaFue(true);
	}
	
	public void startProcessVigenciaFue(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVigenciaFue ,this.jPanelParametrosReportesVigenciaFue, this.jScrollPanelDatosVigenciaFue,this.jPanelPaginacionVigenciaFue, this.jScrollPanelDatosEdicionVigenciaFue, this.jPanelAccionesVigenciaFue,this.jPanelAccionesFormularioVigenciaFue,this.jmenuBarVigenciaFue,this.jmenuBarDetalleVigenciaFue,this.jTtoolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue);		
		
		final JTabbedPane jTabbedPaneBusquedasVigenciaFue=this.jTabbedPaneBusquedasVigenciaFue; 
		
		final JPanel jPanelParametrosReportesVigenciaFue=this.jPanelParametrosReportesVigenciaFue;
		//final JScrollPane jScrollPanelDatosVigenciaFue=this.jScrollPanelDatosVigenciaFue;
		final JTable jTableDatosVigenciaFue=this.jTableDatosVigenciaFue;		
		final JPanel jPanelPaginacionVigenciaFue=this.jPanelPaginacionVigenciaFue;
		//final JScrollPane jScrollPanelDatosEdicionVigenciaFue=this.jScrollPanelDatosEdicionVigenciaFue;
		final JPanel jPanelAccionesVigenciaFue=this.jPanelAccionesVigenciaFue;
		
		JPanel jPanelCamposAuxiliarVigenciaFue=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVigenciaFue=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			jPanelCamposAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jPanelCamposVigenciaFue;
			jPanelAccionesFormularioAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jPanelAccionesFormularioVigenciaFue;
		}
		
		final JPanel jPanelCamposVigenciaFue=jPanelCamposAuxiliarVigenciaFue;
		final JPanel jPanelAccionesFormularioVigenciaFue=jPanelAccionesFormularioAuxiliarVigenciaFue;
		
		
		final JMenuBar jmenuBarVigenciaFue=this.jmenuBarVigenciaFue;
		final JToolBar jTtoolBarVigenciaFue=this.jTtoolBarVigenciaFue;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVigenciaFue=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVigenciaFue=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			jmenuBarDetalleAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jmenuBarDetalleVigenciaFue;
			jTtoolBarDetalleAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jTtoolBarDetalleVigenciaFue;
		}
		
		final JMenuBar jmenuBarDetalleVigenciaFue=jmenuBarDetalleAuxiliarVigenciaFue;
		final JToolBar jTtoolBarDetalleVigenciaFue=jTtoolBarDetalleAuxiliarVigenciaFue;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVigenciaFue;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVigenciaFue;
			processRunnable.jTableDatos=jTableDatosVigenciaFue;
			processRunnable.jPanelCampos=jPanelCamposVigenciaFue;
			processRunnable.jPanelPaginacion=jPanelPaginacionVigenciaFue;
			processRunnable.jPanelAcciones=jPanelAccionesVigenciaFue;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVigenciaFue;
			
			
			processRunnable.jmenuBar=jmenuBarVigenciaFue;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVigenciaFue;
			processRunnable.jTtoolBar=jTtoolBarVigenciaFue;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVigenciaFue;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVigenciaFue ,jPanelParametrosReportesVigenciaFue,jTableDatosVigenciaFue, /*jScrollPanelDatosVigenciaFue,*/jPanelCamposVigenciaFue,jPanelPaginacionVigenciaFue, /*jScrollPanelDatosEdicionVigenciaFue,*/ jPanelAccionesVigenciaFue,jPanelAccionesFormularioVigenciaFue,jmenuBarVigenciaFue,jmenuBarDetalleVigenciaFue,jTtoolBarVigenciaFue,jTtoolBarDetalleVigenciaFue);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVigenciaFue ,jPanelParametrosReportesVigenciaFue, jScrollPanelDatosVigenciaFue,jPanelPaginacionVigenciaFue, jScrollPanelDatosEdicionVigenciaFue, jPanelAccionesVigenciaFue,jPanelAccionesFormularioVigenciaFue,jmenuBarVigenciaFue,jmenuBarDetalleVigenciaFue,jTtoolBarVigenciaFue,jTtoolBarDetalleVigenciaFue);
						
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
	
	public void finishProcessVigenciaFue() {// throws Exception 
		this.finishProcessVigenciaFue(true);
	}
	
	public void finishProcessVigenciaFue(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVigenciaFue ,this.jPanelParametrosReportesVigenciaFue, this.jScrollPanelDatosVigenciaFue,this.jPanelPaginacionVigenciaFue, this.jScrollPanelDatosEdicionVigenciaFue, this.jPanelAccionesVigenciaFue,this.jPanelAccionesFormularioVigenciaFue,this.jmenuBarVigenciaFue,this.jmenuBarDetalleVigenciaFue,this.jTtoolBarVigenciaFue,this.jTtoolBarDetalleVigenciaFue);		
		
		final JTabbedPane jTabbedPaneBusquedasVigenciaFue=this.jTabbedPaneBusquedasVigenciaFue; 
		
		final JPanel jPanelParametrosReportesVigenciaFue=this.jPanelParametrosReportesVigenciaFue;
		//final JScrollPane jScrollPanelDatosVigenciaFue=this.jScrollPanelDatosVigenciaFue;
		final JTable jTableDatosVigenciaFue=this.jTableDatosVigenciaFue;		
		final JPanel jPanelPaginacionVigenciaFue=this.jPanelPaginacionVigenciaFue;
		//final JScrollPane jScrollPanelDatosEdicionVigenciaFue=this.jScrollPanelDatosEdicionVigenciaFue;
		final JPanel jPanelAccionesVigenciaFue=this.jPanelAccionesVigenciaFue;
		
		JPanel jPanelCamposAuxiliarVigenciaFue=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVigenciaFue=new JPanel();
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			jPanelCamposAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jPanelCamposVigenciaFue;
			jPanelAccionesFormularioAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jPanelAccionesFormularioVigenciaFue;
		}
		
		final JPanel jPanelCamposVigenciaFue=jPanelCamposAuxiliarVigenciaFue;
		final JPanel jPanelAccionesFormularioVigenciaFue=jPanelAccionesFormularioAuxiliarVigenciaFue;
		
		
		final JMenuBar jmenuBarVigenciaFue=this.jmenuBarVigenciaFue;		
		final JToolBar jTtoolBarVigenciaFue=this.jTtoolBarVigenciaFue;
				
		JMenuBar jmenuBarDetalleAuxiliarVigenciaFue=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVigenciaFue=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			jmenuBarDetalleAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jmenuBarDetalleVigenciaFue;
			jTtoolBarDetalleAuxiliarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jTtoolBarDetalleVigenciaFue;		
		}
		
		final JMenuBar jmenuBarDetalleVigenciaFue=jmenuBarDetalleAuxiliarVigenciaFue;
		final JToolBar jTtoolBarDetalleVigenciaFue=jTtoolBarDetalleAuxiliarVigenciaFue;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVigenciaFue;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVigenciaFue;
			processRunnable.jTableDatos=jTableDatosVigenciaFue;
			processRunnable.jPanelCampos=jPanelCamposVigenciaFue;
			processRunnable.jPanelPaginacion=jPanelPaginacionVigenciaFue;
			processRunnable.jPanelAcciones=jPanelAccionesVigenciaFue;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVigenciaFue;
			
			
			processRunnable.jmenuBar=jmenuBarVigenciaFue;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVigenciaFue;
			processRunnable.jTtoolBar=jTtoolBarVigenciaFue;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVigenciaFue;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVigenciaFue ,jPanelParametrosReportesVigenciaFue, jTableDatosVigenciaFue,/*jScrollPanelDatosVigenciaFue,*/jPanelCamposVigenciaFue,jPanelPaginacionVigenciaFue, /*jScrollPanelDatosEdicionVigenciaFue,*/ jPanelAccionesVigenciaFue,jPanelAccionesFormularioVigenciaFue,jmenuBarVigenciaFue,jmenuBarDetalleVigenciaFue,jTtoolBarVigenciaFue,jTtoolBarDetalleVigenciaFue));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVigenciaFue(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVigenciaFue(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVigenciaFue(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVigenciaFue(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVigenciaFue,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVigenciaFue,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVigenciaFue(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVigenciaFue,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVigenciaFue,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vigenciafueConstantesFunciones.getsFinalQueryVigenciaFue();
		String  finalQueryPaginacionTodos=this.vigenciafueConstantesFunciones.getsFinalQueryVigenciaFue();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VigenciaFueConstantesFunciones.getArrayColumnasGlobalesNoVigenciaFue(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VigenciaFueConstantesFunciones.getArrayColumnasGlobalesVigenciaFue(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VigenciaFueConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vigenciafuesEliminados= new ArrayList<VigenciaFue>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVigenciaFue();
		
				///*VigenciaFueSessionBean*/this.vigenciafueSessionBean=new VigenciaFueSessionBean();
			
			if(this.vigenciafueSessionBean==null) {
				this.vigenciafueSessionBean=new VigenciaFueSessionBean();
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
					this.iNumeroPaginacion=VigenciaFueConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VigenciaFueConstantesFunciones.getClassesForeignKeysOfVigenciaFue(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vigenciafue."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vigenciafuesAux= new ArrayList<VigenciaFue>();
			
				
			vigenciafueLogic.setDatosCliente(this.datosCliente);
			vigenciafueLogic.setDatosDeep(this.datosDeep);
			vigenciafueLogic.setIsConDeep(true);
			
			
			vigenciafueLogic.getVigenciaFueDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vigenciafueLogic.getTodosVigenciaFues(finalQueryGlobal,pagination);
					
					//vigenciafueLogic.getTodosVigenciaFuesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vigenciafueLogic.getVigenciaFues()==null|| vigenciafueLogic.getVigenciaFues().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vigenciafuesAux= new ArrayList<VigenciaFue>();
							vigenciafuesAux.addAll(vigenciafueLogic.getVigenciaFues());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafuesAux= new ArrayList<VigenciaFue>();
							vigenciafuesAux.addAll(vigenciafues);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vigenciafueLogic.getTodosVigenciaFues(finalQueryGlobal+"",this.pagination);												
							
							//vigenciafueLogic.getTodosVigenciaFuesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVigenciaFues("Todos",vigenciafueLogic.getVigenciaFues() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vigenciafueLogic.setVigenciaFues(new ArrayList<VigenciaFue>());					
							vigenciafueLogic.getVigenciaFues().addAll(vigenciafuesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafues=new ArrayList<VigenciaFue>();
							vigenciafues.addAll(vigenciafuesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVigenciaFue=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVigenciaFue=this.idActual;
				
				} else if(this.idVigenciaFueActual!=null && this.idVigenciaFueActual!=0L) {
					idVigenciaFue=idVigenciaFueActual;
				}
				
					
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndicePorId(idVigenciaFue);
				
				this.vigenciafues=new ArrayList<VigenciaFue>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vigenciafueLogic.getEntity(idVigenciaFue);
					
					//vigenciafueLogic.getEntityWithConnection(idVigenciaFue);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vigenciafueLogic.setVigenciaFues(new ArrayList<VigenciaFue>());
					vigenciafueLogic.getVigenciaFues().add(vigenciafueLogic.getVigenciaFue());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vigenciafues=new ArrayList<VigenciaFue>();
					this.vigenciafues.add(vigenciafue);
				}
				
				if(vigenciafueLogic.getVigenciaFue()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vigenciafueLogic.getVigenciaFuesFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vigenciafueLogic.getVigenciaFues()==null||vigenciafueLogic.getVigenciaFues().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vigenciafues==null|| vigenciafues.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafuesAux=new ArrayList<VigenciaFue>();
						vigenciafuesAux.addAll(vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafuesAux=new ArrayList<VigenciaFue>();
							vigenciafuesAux.addAll(vigenciafues);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vigenciafueLogic.getVigenciaFuesFK_IdCiudad(finalQueryGlobal,pagination,id_ciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdCiudad(id_ciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVigenciaFues("FK_IdCiudad",vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVigenciaFues("FK_IdCiudad",vigenciafues);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueLogic.setVigenciaFues(new ArrayList<VigenciaFue>());
						vigenciafueLogic.getVigenciaFues().addAll(vigenciafuesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafues=new ArrayList<VigenciaFue>();
							vigenciafues.addAll(vigenciafuesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vigenciafueLogic.getVigenciaFuesFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vigenciafueLogic.getVigenciaFues()==null||vigenciafueLogic.getVigenciaFues().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vigenciafues==null|| vigenciafues.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafuesAux=new ArrayList<VigenciaFue>();
						vigenciafuesAux.addAll(vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafuesAux=new ArrayList<VigenciaFue>();
							vigenciafuesAux.addAll(vigenciafues);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vigenciafueLogic.getVigenciaFuesFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VigenciaFueConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVigenciaFues("FK_IdPais",vigenciafueLogic.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVigenciaFues("FK_IdPais",vigenciafues);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueLogic.setVigenciaFues(new ArrayList<VigenciaFue>());
						vigenciafueLogic.getVigenciaFues().addAll(vigenciafuesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafues=new ArrayList<VigenciaFue>();
							vigenciafues.addAll(vigenciafuesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVigenciaFue();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVigenciaFue();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vigenciafueLogic.getVigenciaFues().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vigenciafues.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vigenciafueLogic.getVigenciaFues().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vigenciafues.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VigenciaFue vigenciafue) {
		Boolean permite=true;
		
		if(this.vigenciafue.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VigenciaFueConstantesFunciones.getOrderByListaVigenciaFue();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VigenciaFueConstantesFunciones.getOrderByListaVigenciaFue();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VigenciaFue vigenciafue:vigenciafueLogic.getVigenciaFues()) {
				if(vigenciafue.getsType().equals(Constantes2.S_TOTALES)) {
					vigenciafueTotales=vigenciafue;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VigenciaFue vigenciafue:this.vigenciafues) {
				if(vigenciafue.getsType().equals(Constantes2.S_TOTALES)) {
					vigenciafueTotales=vigenciafue;
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
			this.vigenciafueAux=new VigenciaFue();
			this.vigenciafueAux.setsType(Constantes2.S_TOTALES);
			this.vigenciafueAux.setIsNew(false);
			this.vigenciafueAux.setIsChanged(false);
			this.vigenciafueAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VigenciaFueConstantesFunciones.TotalizarValoresFilaVigenciaFue(this.vigenciafueLogic.getVigenciaFues(),this.vigenciafueAux);
				
				this.vigenciafueLogic.getVigenciaFues().add(this.vigenciafueAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VigenciaFueConstantesFunciones.TotalizarValoresFilaVigenciaFue(this.vigenciafues,this.vigenciafueAux);
				
				this.vigenciafues.add(this.vigenciafueAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vigenciafueTotales=new VigenciaFue();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vigenciafueLogic.getVigenciaFues().remove(vigenciafueTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vigenciafues.remove(vigenciafueTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vigenciafueTotales=new VigenciaFue();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VigenciaFue vigenciafue:vigenciafueLogic.getVigenciaFues()) {
				if(vigenciafue.getsType().equals(Constantes2.S_TOTALES)) {
					vigenciafueTotales=vigenciafue;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VigenciaFueConstantesFunciones.TotalizarValoresFilaVigenciaFue(this.vigenciafueLogic.getVigenciaFues(),vigenciafueTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VigenciaFue vigenciafue:this.vigenciafues) {
				if(vigenciafue.getsType().equals(Constantes2.S_TOTALES)) {
					vigenciafueTotales=vigenciafue;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VigenciaFueConstantesFunciones.TotalizarValoresFilaVigenciaFue(this.vigenciafues,vigenciafueTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVigenciaFuesFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVigenciaFuesFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVigenciaFuesFK_IdCiudad(String sFinalQuery,Long id_ciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vigenciafueLogic.getVigenciaFuesFK_IdCiudad(sFinalQuery,this.pagination,id_ciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVigenciaFuesFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vigenciafueLogic.getVigenciaFuesFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
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
	
	public void inicializarPermisosVigenciaFue() {
		this.isPermisoTodoVigenciaFue=false;
		this.isPermisoNuevoVigenciaFue=false;
		this.isPermisoActualizarVigenciaFue=false;
		this.isPermisoActualizarOriginalVigenciaFue=false;
		this.isPermisoEliminarVigenciaFue=false;
		this.isPermisoGuardarCambiosVigenciaFue=false;
		this.isPermisoConsultaVigenciaFue=false;
		this.isPermisoBusquedaVigenciaFue=false;
		this.isPermisoReporteVigenciaFue=false;		
		this.isPermisoOrdenVigenciaFue=false;		
		this.isPermisoPaginacionMedioVigenciaFue=false;		
		this.isPermisoPaginacionAltoVigenciaFue=false;
		this.isPermisoPaginacionTodoVigenciaFue=false;
		this.isPermisoCopiarVigenciaFue=false;		
		this.isPermisoVerFormVigenciaFue=false;		
		this.isPermisoDuplicarVigenciaFue=false;		
		this.isPermisoOrdenVigenciaFue=false;		
	}
	
	public void setPermisosUsuarioVigenciaFue(Boolean isPermiso) {
		this.isPermisoTodoVigenciaFue=isPermiso;
		this.isPermisoNuevoVigenciaFue=isPermiso;
		this.isPermisoActualizarVigenciaFue=isPermiso;
		this.isPermisoActualizarOriginalVigenciaFue=isPermiso;
		this.isPermisoEliminarVigenciaFue=isPermiso;
		this.isPermisoGuardarCambiosVigenciaFue=isPermiso;
		this.isPermisoConsultaVigenciaFue=isPermiso;
		this.isPermisoBusquedaVigenciaFue=isPermiso;
		this.isPermisoReporteVigenciaFue=isPermiso;
		this.isPermisoOrdenVigenciaFue=isPermiso;		
		this.isPermisoPaginacionMedioVigenciaFue=isPermiso;		
		this.isPermisoPaginacionAltoVigenciaFue=isPermiso;		
		this.isPermisoPaginacionTodoVigenciaFue=isPermiso;		
		this.isPermisoCopiarVigenciaFue=isPermiso;		
		this.isPermisoVerFormVigenciaFue=isPermiso;		
		this.isPermisoDuplicarVigenciaFue=isPermiso;
		this.isPermisoOrdenVigenciaFue=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVigenciaFue(Boolean isPermiso) {
		//this.isPermisoTodoVigenciaFue=isPermiso;
		this.isPermisoNuevoVigenciaFue=isPermiso;
		this.isPermisoActualizarVigenciaFue=isPermiso;
		this.isPermisoActualizarOriginalVigenciaFue=isPermiso;
		this.isPermisoEliminarVigenciaFue=isPermiso;
		this.isPermisoGuardarCambiosVigenciaFue=isPermiso;
		//this.isPermisoConsultaVigenciaFue=isPermiso;
		//this.isPermisoBusquedaVigenciaFue=isPermiso;
		//this.isPermisoReporteVigenciaFue=isPermiso;
		//this.isPermisoOrdenVigenciaFue=isPermiso;		
		//this.isPermisoPaginacionMedioVigenciaFue=isPermiso;		
		//this.isPermisoPaginacionAltoVigenciaFue=isPermiso;		
		//this.isPermisoPaginacionTodoVigenciaFue=isPermiso;		
		//this.isPermisoCopiarVigenciaFue=isPermiso;		
		//this.isPermisoDuplicarVigenciaFue=isPermiso;
		//this.isPermisoOrdenVigenciaFue=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVigenciaFueClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VigenciaFueJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVigenciaFue(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVigenciaFueClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVigenciaFueClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVigenciaFueClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVigenciaFueClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVigenciaFue() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VigenciaFueJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VigenciaFueConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVigenciaFue=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVigenciaFue=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVigenciaFue=this.isPermisoActualizarVigenciaFue;
			this.isPermisoEliminarVigenciaFue=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVigenciaFue=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVigenciaFue=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVigenciaFue=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVigenciaFue=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVigenciaFue=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVigenciaFue=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVigenciaFue=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVigenciaFue=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVigenciaFue=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVigenciaFue=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVigenciaFue=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVigenciaFue=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVigenciaFue=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVigenciaFue.setToolTipText(this.jTableDatosVigenciaFue.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVigenciaFue(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVigenciaFue(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VigenciaFueJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VigenciaFueJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVigenciaFue() throws Exception {
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
	public void inicializarCombosForeignKeyVigenciaFueListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVigenciaFueListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VigenciaFueJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVigenciaFueListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
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

			if((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0)) {
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
	
	public void cargarCombosLoteForeignKeyVigenciaFueListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VigenciaFueParameterReturnGeneral vigenciafueReturnGeneral=new VigenciaFueParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.vigenciafueConstantesFunciones.cargarid_paisVigenciaFue)
					 || (this.esRecargarFks && this.vigenciafueConstantesFunciones.cargarid_paisVigenciaFue)) {

					if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+vigenciafueSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.vigenciafueConstantesFunciones.cargarid_ciudadVigenciaFue)
					 || (this.esRecargarFks && this.vigenciafueConstantesFunciones.cargarid_ciudadVigenciaFue)) {

					if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+vigenciafueSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vigenciafueReturnGeneral=vigenciafueLogic.cargarCombosLoteForeignKeyVigenciaFue(finalQueryGlobalPais,finalQueryGlobalCiudad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=vigenciafueReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=vigenciafueReturnGeneral.getciudadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVigenciaFue()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.vigenciafueSessionBean==null) {
				this.vigenciafueSessionBean=new VigenciaFueSessionBean();
			}

			if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

			if(!this.vigenciafueSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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
	
	public void initActionsCombosTodosForeignKeyVigenciaFue()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVigenciaFue(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVigenciaFue()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.vigenciafue.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.vigenciafue.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
				this.vigenciafue.setfecha_ultimo_embarque(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVigenciaFue();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVigenciaFue(VigenciaFue vigenciafue)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(vigenciafue.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(vigenciafue.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVigenciaFue(VigenciaFue vigenciafue,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVigenciaFue()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.vigenciafueConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.vigenciafueConstantesFunciones.getid_ciudad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVigenciaFue()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVigenciaFue()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVigenciaFue()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVigenciaFue()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVigenciaFue()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVigenciaFue(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVigenciaFue()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.getItemCount()>0) {
				this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.getItemCount()>0) {
				this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public VigenciaFueBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VigenciaFueBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VigenciaFueBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vigenciafueSessionBean=new VigenciaFueSessionBean(); 
		this.vigenciafueConstantesFunciones=new VigenciaFueConstantesFunciones(); 
		this.vigenciafueBean=new VigenciaFue();//(this.vigenciafueConstantesFunciones); 		
		this.vigenciafueReturnGeneral=new VigenciaFueParameterReturnGeneral(); 
		
		this.vigenciafueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vigenciafueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VigenciaFueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VigenciaFueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VigenciaFueBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVigenciaFue(true);
			
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
			
			this.vigenciafueConstantesFunciones=new VigenciaFueConstantesFunciones(); 
			this.vigenciafueBean=new VigenciaFue();//this.vigenciafueConstantesFunciones); 			
			this.vigenciafueReturnGeneral=new VigenciaFueParameterReturnGeneral(); 
		
			VigenciaFueBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vigencia Fue Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.vigenciafue=new VigenciaFue();
			this.vigenciafues = new ArrayList<VigenciaFue>();
			this.vigenciafuesAux = new ArrayList<VigenciaFue>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic=new VigenciaFueLogic();
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			//this.vigenciafueSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vigenciafueSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVigenciaFue);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVigenciaFue);	
					}
					
					if(this.jInternalFrameImportacionVigenciaFue!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVigenciaFue);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVigenciaFue!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVigenciaFue);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVigenciaFue);
				this.jInternalFrameDetalleFormVigenciaFue.setVisible(false);
				this.jInternalFrameDetalleFormVigenciaFue.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVigenciaFue);
					this.jInternalFrameReporteDinamicoVigenciaFue.setVisible(false);
					this.jInternalFrameReporteDinamicoVigenciaFue.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVigenciaFue!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVigenciaFue);
					this.jInternalFrameImportacionVigenciaFue.setVisible(false);
					this.jInternalFrameImportacionVigenciaFue.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVigenciaFue!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVigenciaFue);
					this.jInternalFrameOrderByVigenciaFue.setVisible(false);
					this.jInternalFrameOrderByVigenciaFue.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVigenciaFueActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VigenciaFueConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vigenciafueReturnGeneral=new VigenciaFueParameterReturnGeneral();
			
			this.vigenciafueParameterGeneral=new VigenciaFueParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vigenciafueLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VigenciaFueJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VigenciaFueConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vigenciafueSessionBean.getEsGuardarRelacionado(),this.vigenciafueSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VigenciaFueConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vigenciafueSessionBean.getEsGuardarRelacionado(),this.vigenciafueSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaDuplicarVigenciaFue=true;
			this.isVisibilidadCeldaCopiarVigenciaFue=true;
			this.isVisibilidadCeldaVerFormVigenciaFue=true;
			this.isVisibilidadCeldaOrdenVigenciaFue=true;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=false;
			this.isVisibilidadCeldaGuardarVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVigenciaFue();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVigenciaFue(false);
			
			this.setPermisosUsuarioVigenciaFue();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado() 
				|| (this.vigenciafueSessionBean.getEsGuardarRelacionado() && this.vigenciafueSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVigenciaFueClasesRelacionadas();
			}
			
			if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVigenciaFueClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVigenciaFue();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVigenciaFue();
			}
			
			if(!this.isPermisoBusquedaVigenciaFue) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVigenciaFue,this.isPermisoPaginacionMedioVigenciaFue,this.isPermisoPaginacionTodoVigenciaFue);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VigenciaFueConstantesFunciones.getTiposSeleccionarVigenciaFue());
				
				this.tiposColumnasSelect=VigenciaFueConstantesFunciones.getTiposSeleccionarVigenciaFue(true);
				
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
			//if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVigenciaFue();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVigenciaFue(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVigenciaFue(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVigenciaFue() ;
			
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
				vigenciafueImplementable= (VigenciaFueImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VigenciaFueConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vigenciafueImplementableHome= (VigenciaFueImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VigenciaFueConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vigenciafues= new ArrayList<VigenciaFue>();
			this.vigenciafuesEliminados= new ArrayList<VigenciaFue>();
						
			this.isEsNuevoVigenciaFue=false;
			this.esParaAccionDesdeFormularioVigenciaFue=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVigenciaFue(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVigenciaFue();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VigenciaFueBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VigenciaFueConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVigenciaFue("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVigenciaFue(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVigenciaFue();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVigenciaFue();
			}
			
			VigenciaFueBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVigenciaFue.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVigenciaFue.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVigenciaFue.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVigenciaFue(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VigenciaFue: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVigenciaFue() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVigenciaFue")) {
				iIndex=this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVigenciaFue();	
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
	
	public void cargarCombosForeignKeyVigenciaFue(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVigenciaFue(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVigenciaFue(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVigenciaFueListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVigenciaFue();
		
		this.cargarCombosFrameForeignKeyVigenciaFue();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVigenciaFue();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVigenciaFue();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
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
				}

			this.recargarComboTablaCiudad(this.ciudadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVigenciaFueActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			
			if(jTableDatosVigenciaFue.getRowCount()>=1) {
				jTableDatosVigenciaFue.removeRowSelectionInterval(0, jTableDatosVigenciaFue.getRowCount()-1);						
			}
			
			this.isEsNuevoVigenciaFue=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVigenciaFue(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVigenciaFue(true);			
			//this.vigenciafue=new VigenciaFue();
			//this.vigenciafue.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVigenciaFue(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVigenciaFue() ;
			
			if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVigenciaFue(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vigenciafue);	
			this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);				
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VigenciaFue: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVigenciaFueActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVigenciaFue.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVigenciaFue.getSelectedRows().length;			
			}
			
			vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVigenciaFue--;			
				//VigenciaFue vigenciafueAux= new VigenciaFue();			
				//vigenciafueAux.setId(this.iIdNuevoVigenciaFue);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VigenciaFue vigenciafueOrigen=new VigenciaFue();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VigenciaFue vigenciafueOrigen : vigenciafuesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vigenciafueOrigen =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vigenciafueOrigen =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVigenciaFue();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vigenciafue.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVigenciaFue(vigenciafueOrigen,this.vigenciafue,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vigenciafueLogic.getVigenciaFues().add(this.vigenciafueAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vigenciafues.add(this.vigenciafueAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVigenciaFue(false);
				
				this.jTableDatosVigenciaFue.setRowSelectionInterval(this.getIndiceNuevoVigenciaFue(), this.getIndiceNuevoVigenciaFue());
				
				int iLastRow =  this.jTableDatosVigenciaFue.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVigenciaFue.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVigenciaFue.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVigenciaFue(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();									
		
			VigenciaFue vigenciafueOrigen=new VigenciaFue();
			VigenciaFue vigenciafueDestino=new VigenciaFue();
				
			vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVigenciaFue.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vigenciafuesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVigenciaFue.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueOrigen =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vigenciafueOrigen =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vigenciafueDestino =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vigenciafueDestino =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vigenciafueOrigen =vigenciafuesSeleccionados.get(0);
				vigenciafueDestino =vigenciafuesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVigenciaFue(vigenciafueOrigen,vigenciafueDestino,true,false);
				
				vigenciafueDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vigenciafueDestino,vigenciafueLogic.getVigenciaFues());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vigenciafueDestino,vigenciafues);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVigenciaFue(false);
				
				//this.jTableDatosVigenciaFue.setRowSelectionInterval(this.getIndiceNuevoVigenciaFue(), this.getIndiceNuevoVigenciaFue());
				
				int iLastRow =  this.jTableDatosVigenciaFue.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVigenciaFue.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVigenciaFue.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVigenciaFue(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVigenciaFue.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVigenciaFue.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVigenciaFue.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVigenciaFue.setVisible(!isVisible);
			this.jPanelPaginacionVigenciaFue.setVisible(!isVisible);
			this.jPanelAccionesVigenciaFue.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVigenciaFue();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVigenciaFue();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVigenciaFue();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVigenciaFue();
			
			this.abrirFrameOrderByVigenciaFue();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVigenciaFue();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVigenciaFue(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVigenciaFue);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVigenciaFue.isMaximum()) {
					this.jInternalFrameDetalleFormVigenciaFue.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVigenciaFue.setSize(this.jInternalFrameDetalleFormVigenciaFue.iWidthFormulario,this.jInternalFrameDetalleFormVigenciaFue.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVigenciaFue.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVigenciaFue.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVigenciaFue.isMaximum()) {
						this.jInternalFrameDetalleFormVigenciaFue.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVigenciaFue.jContentPaneDetalleVigenciaFue.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVigenciaFue.jContentPaneDetalleVigenciaFue.getWidth(),VigenciaFueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVigenciaFue.jContentPaneDetalleVigenciaFue.getWidth(),VigenciaFueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVigenciaFue.jContentPaneDetalleVigenciaFue.getWidth(),VigenciaFueConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVigenciaFue.setVisible(true);
	        this.jInternalFrameDetalleFormVigenciaFue.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVigenciaFue() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVigenciaFue==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVigenciaFue=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVigenciaFue,false,this);
				} else {
					this.jInternalFrameOrderByVigenciaFue=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVigenciaFue,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVigenciaFue);
				this.jInternalFrameOrderByVigenciaFue.setVisible(false);
				this.jInternalFrameOrderByVigenciaFue.setSelected(false);
				
				this.jInternalFrameOrderByVigenciaFue.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVigenciaFue"));
				
				this.inicializarActualizarBindingTablaOrderByVigenciaFue();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVigenciaFue() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVigenciaFue==null) {
				
				this.jInternalFrameImportacionVigenciaFue=new ImportacionJInternalFrame(VigenciaFueConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVigenciaFue);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVigenciaFue);
				this.jInternalFrameImportacionVigenciaFue.setVisible(false);
				this.jInternalFrameImportacionVigenciaFue.setSelected(false);


				this.jInternalFrameImportacionVigenciaFue.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVigenciaFue"));
				this.jInternalFrameImportacionVigenciaFue.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVigenciaFue"));
				this.jInternalFrameImportacionVigenciaFue.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVigenciaFue"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVigenciaFue() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVigenciaFue==null) {
				this.jInternalFrameReporteDinamicoVigenciaFue=new ReporteDinamicoJInternalFrame(VigenciaFueConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVigenciaFue);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVigenciaFue);
				this.jInternalFrameReporteDinamicoVigenciaFue.setVisible(false);
				this.jInternalFrameReporteDinamicoVigenciaFue.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVigenciaFue"));
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVigenciaFue"));
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVigenciaFue"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVigenciaFue();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVigenciaFue() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVigenciaFue);
			
	       	this.jInternalFrameDetalleFormVigenciaFue.setVisible(false);
	        this.jInternalFrameDetalleFormVigenciaFue.setSelected(false);
			
			//this.jInternalFrameDetalleFormVigenciaFue.dispose();
			//this.jInternalFrameDetalleFormVigenciaFue=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVigenciaFue() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVigenciaFue.setVisible(true);
	        this.jInternalFrameReporteDinamicoVigenciaFue.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVigenciaFue() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVigenciaFue.setVisible(true);
	        this.jInternalFrameImportacionVigenciaFue.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVigenciaFue() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVigenciaFue.setVisible(true);
	        this.jInternalFrameOrderByVigenciaFue.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVigenciaFue() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVigenciaFue.setVisible(false);
	        this.jInternalFrameOrderByVigenciaFue.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVigenciaFue() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVigenciaFue.setVisible(false);
	        this.jInternalFrameReporteDinamicoVigenciaFue.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVigenciaFue() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVigenciaFue.setVisible(false);
	        this.jInternalFrameImportacionVigenciaFue.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVigenciaFue(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVigenciaFue(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVigenciaFue(true);
			//this.isEsNuevoVigenciaFue=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVigenciaFue("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVigenciaFue(false) ;
			
			if(vigenciafueSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVigenciaFue(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVigenciaFue(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVigenciaFueActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVigenciaFue(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVigenciaFue(true);
			//this.isEsNuevoVigenciaFue=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vigenciafue.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVigenciaFue("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVigenciaFue(false) ;
			
			if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVigenciaFue(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVigenciaFue(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVigenciaFue.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVigenciaFue.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVigenciaFue(false);
			
			//if(!this.isEsNuevoVigenciaFue) {								
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				
			}
			
			if(this.permiteMantenimiento(this.vigenciafue)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVigenciaFue=true;
					this.inicializarActualizarBindingTablaVigenciaFue(false);
					this.isEsNuevoVigenciaFue=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVigenciaFue=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVigenciaFue=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVigenciaFue(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVigenciaFue(false);
				
				this.habilitarDeshabilitarControlesVigenciaFue(false);
			
												
				
				if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVigenciaFue();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVigenciaFueActionPerformed(evt,vigenciafueSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVigenciaFue(this.vigenciafue,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVigenciaFue.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vigenciafueSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vigenciafue.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				this.vigenciafue.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				this.vigenciafue.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vigenciafue)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VigenciaFueModel) this.jTableDatosVigenciaFue.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVigenciaFue=true;
				this.inicializarActualizarBindingTablaVigenciaFue(false);
				this.isEsNuevoVigenciaFue=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVigenciaFue(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVigenciaFue(false);
				
				this.habilitarDeshabilitarControlesVigenciaFue(false);
				
				
				
				if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVigenciaFue();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVigenciaFueActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVigenciaFue.getRowCount()>=1) {
				jTableDatosVigenciaFue.removeRowSelectionInterval(0, jTableDatosVigenciaFue.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVigenciaFue(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVigenciaFue(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVigenciaFue(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVigenciaFue(false) ;
			
			this.isEsNuevoVigenciaFue=false;
			
			if(VigenciaFueJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVigenciaFue();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVigenciaFue(false);
				
				//SI ES MANUAL
				if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVigenciaFue();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVigenciaFue--;			
			//VigenciaFue vigenciafueAux= new VigenciaFue();			
			//vigenciafueAux.setId(this.iIdNuevoVigenciaFue);
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVigenciaFue();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
			
			this.vigenciafue.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vigenciafueLogic.getVigenciaFues().add(this.vigenciafueAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vigenciafues.add(this.vigenciafueAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVigenciaFue(false);
			
			this.jTableDatosVigenciaFue.setRowSelectionInterval(this.getIndiceNuevoVigenciaFue(), this.getIndiceNuevoVigenciaFue());
			
			int iLastRow =  this.jTableDatosVigenciaFue.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVigenciaFue.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVigenciaFue.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVigenciaFue(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVigenciaFue(false);
			
			//SI ES MANUAL
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVigenciaFue();
			}
			
			//this.abrirFrameTreeVigenciaFue();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Vigencia FueS ?", "MANTENIMIENTO DE Vigencia Fue", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVigenciaFue.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVigenciaFue();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vigenciafueReturnGeneral=vigenciafueLogic.procesarImportacionVigenciaFuesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vigenciafueParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVigenciaFueReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVigenciaFue.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVigenciaFue.setFileImportacion(this.jInternalFrameImportacionVigenciaFue.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVigenciaFue.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVigenciaFue.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVigenciaFue.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVigenciaFue.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		

		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VigenciaFueBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VigenciaFueBaseDesign.jrxml";
			
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
			
			this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VigenciaFueConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroEmbarques_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroEmbarques_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroEmbarques_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroEmbarques_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_FUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaUltimoEmbarque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaUltimoEmbarque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaUltimoEmbarque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaUltimoEmbarque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCajas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCajas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCajas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCajas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVigenciaFue.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VigenciaFueConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case VigenciaFueConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="id_ciudad";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES:
					sNombreCampoCategoria="numero_embarques";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FUE:
					sNombreCampoCategoria="fue";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE:
					sNombreCampoCategoria="fecha_ultimo_embarque";
					break;

				case VigenciaFueConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS:
					sNombreCampoCategoria="numero_cajas";
					break;

				case VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VigenciaFueConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case VigenciaFueConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="id_ciudad";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES:
					sNombreCampoCategoriaValor="numero_embarques";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FUE:
					sNombreCampoCategoriaValor="fue";
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE:
					sNombreCampoCategoriaValor="fecha_ultimo_embarque";
					break;

				case VigenciaFueConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS:
					sNombreCampoCategoriaValor="numero_cajas";
					break;

				case VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VigenciaFueConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case VigenciaFueConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ciudad");
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Embarques",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_embarques");
					break;

				case VigenciaFueConstantesFunciones.LABEL_FUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fue",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fue");
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Ultimo Embarque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_ultimo_embarque");
					break;

				case VigenciaFueConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cajas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cajas");
					break;

				case VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoVigenciaFueActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VigenciaFues");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VigenciaFueConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getnumero_embarques());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_FUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FUE);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getfue());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getfecha_ultimo_embarque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getnumero_cajas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(VigenciaFue vigenciafue:vigenciafuesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vigenciafue.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelVigenciaFue(row);				
			//	iRow++;
			//}				
			
			//for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVigenciaFue(vigenciafueAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
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
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVigenciaFue(false);
			
			//SI ES MANUAL
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVigenciaFue();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVigenciaFue(false);
			
			//SI ES MANUAL
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVigenciaFue();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVigenciaFueActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVigenciaFue(false);
			
			//SI ES MANUAL
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVigenciaFue();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVigenciaFue() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVigenciaFue.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVigenciaFue.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVigenciaFue.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVigenciaFue.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVigenciaFue.setMinimumSize(dimensionMinimum);
		this.jTableDatosVigenciaFue.setMaximumSize(dimensionMaximum);
		this.jTableDatosVigenciaFue.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVigenciaFue(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVigenciaFue(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVigenciaFue(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVigenciaFue(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVigenciaFue(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVigenciaFue(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVigenciaFue(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVigenciaFue(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVigenciaFue() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVigenciaFue();
		
		this.inicializarActualizarBindingBotonesManualVigenciaFue(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVigenciaFue();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVigenciaFue() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVigenciaFue(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVigenciaFue(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVigenciaFue.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVigenciaFue.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVigenciaFue.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionNuevoVigenciaFue.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionSinCerrarVigenciaFue.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionSinMensajeVigenciaFue.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVigenciaFue.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVigenciaFue.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVigenciaFue.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
				this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionNuevoVigenciaFue.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionSinCerrarVigenciaFue.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxPostAccionSinMensajeVigenciaFue.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVigenciaFue.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVigenciaFue.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVigenciaFue.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVigenciaFue.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVigenciaFue.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVigenciaFue.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVigenciaFue.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVigenciaFue.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVigenciaFue.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVigenciaFue(Boolean esInicializar) throws Exception {
		try	{	
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVigenciaFue(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVigenciaFue() throws Exception {
		try	{
			if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVigenciaFue();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVigenciaFue() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVigenciaFue() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVigenciaFue.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVigenciaFue.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVigenciaFue.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVigenciaFue.addItem(reporte);
			}
			
			
			if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVigenciaFue.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVigenciaFue.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVigenciaFue.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVigenciaFue.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVigenciaFue.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVigenciaFue.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVigenciaFue.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVigenciaFue();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVigenciaFue() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
				this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
				this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
				
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VigenciaFueConstantesFunciones.getTiposSeleccionarVigenciaFue(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VigenciaFueConstantesFunciones.getTiposSeleccionarVigenciaFue(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VigenciaFueConstantesFunciones.getTiposSeleccionarVigenciaFue(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVigenciaFue.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVigenciaFue.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVigenciaFue()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.getSelectedItem()!=null){this.id_ciudadFK_IdCiudad=((Ciudad)this.jComboBoxid_ciudadFK_IdCiudadVigenciaFue.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisVigenciaFue.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisVigenciaFue.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVigenciaFue(Boolean esInicializar) throws Exception {				
		if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVigenciaFue();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVigenciaFue() throws Exception {
		this.inicializarActualizarBindingTablaVigenciaFue(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVigenciaFue() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVigenciaFueOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFueOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVigenciaFue(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vigenciafueLogic.getVigenciaFues().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vigenciafues.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVigenciaFue.setModel(new VigenciaFueModel(this.vigenciafueLogic.getVigenciaFues(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVigenciaFue.setModel(new VigenciaFueModel(this.vigenciafues,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVigenciaFue!=null && this.jInternalFrameOrderByVigenciaFue.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVigenciaFue();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO,vigenciafueConstantesFunciones.resaltarSeleccionarVigenciaFue,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VigenciaFueConstantesFunciones.SCLASSWEBTITULO,vigenciafueConstantesFunciones.resaltarSeleccionarVigenciaFue,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_ID));

		if(this.vigenciafueConstantesFunciones.mostraridVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vigenciafueConstantesFunciones.resaltaridVigenciaFue,this.vigenciafueConstantesFunciones.activaridVigenciaFue,iSizeTabla,this,true,"idVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vigenciafueConstantesFunciones.resaltaridVigenciaFue,this.vigenciafueConstantesFunciones.activaridVigenciaFue,this,true,"idVigenciaFue","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_IDPAIS));

		if(this.vigenciafueConstantesFunciones.mostrarid_paisVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.vigenciafueConstantesFunciones.resaltarid_paisVigenciaFue,this,this.vigenciafueConstantesFunciones.activarid_paisVigenciaFue,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.vigenciafueConstantesFunciones.resaltarid_paisVigenciaFue,this,this.vigenciafueConstantesFunciones.activarid_paisVigenciaFue,true,"id_paisVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_IDCIUDAD));

		if(this.vigenciafueConstantesFunciones.mostrarid_ciudadVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.vigenciafueConstantesFunciones.resaltarid_ciudadVigenciaFue,this,this.vigenciafueConstantesFunciones.activarid_ciudadVigenciaFue,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.vigenciafueConstantesFunciones.resaltarid_ciudadVigenciaFue,this,this.vigenciafueConstantesFunciones.activarid_ciudadVigenciaFue,true,"id_ciudadVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_FECHAINICIO));

		if(this.vigenciafueConstantesFunciones.mostrarfecha_inicioVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_inicioVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_inicioVigenciaFue,iSizeTabla,this,true,"fecha_inicioVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_inicioVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_inicioVigenciaFue,this,true,"fecha_inicioVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_FECHAFIN));

		if(this.vigenciafueConstantesFunciones.mostrarfecha_finVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_finVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_finVigenciaFue,iSizeTabla,this,true,"fecha_finVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_finVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_finVigenciaFue,this,true,"fecha_finVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES));

		if(this.vigenciafueConstantesFunciones.mostrarnumero_embarquesVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vigenciafueConstantesFunciones.resaltarnumero_embarquesVigenciaFue,this.vigenciafueConstantesFunciones.activarnumero_embarquesVigenciaFue,iSizeTabla,this,true,"numero_embarquesVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vigenciafueConstantesFunciones.resaltarnumero_embarquesVigenciaFue,this.vigenciafueConstantesFunciones.activarnumero_embarquesVigenciaFue,this,true,"numero_embarquesVigenciaFue","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_FUE));

		if(this.vigenciafueConstantesFunciones.mostrarfueVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_FUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vigenciafueConstantesFunciones.resaltarfueVigenciaFue,this.vigenciafueConstantesFunciones.activarfueVigenciaFue,iSizeTabla,this,true,"fueVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vigenciafueConstantesFunciones.resaltarfueVigenciaFue,this.vigenciafueConstantesFunciones.activarfueVigenciaFue,this,true,"fueVigenciaFue","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE));

		if(this.vigenciafueConstantesFunciones.mostrarfecha_ultimo_embarqueVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_ultimo_embarqueVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_ultimo_embarqueVigenciaFue,iSizeTabla,this,true,"fecha_ultimo_embarqueVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vigenciafueConstantesFunciones.resaltarfecha_ultimo_embarqueVigenciaFue,this.vigenciafueConstantesFunciones.activarfecha_ultimo_embarqueVigenciaFue,this,true,"fecha_ultimo_embarqueVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_VALOR));

		if(this.vigenciafueConstantesFunciones.mostrarvalorVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vigenciafueConstantesFunciones.resaltarvalorVigenciaFue,this.vigenciafueConstantesFunciones.activarvalorVigenciaFue,iSizeTabla,this,true,"valorVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vigenciafueConstantesFunciones.resaltarvalorVigenciaFue,this.vigenciafueConstantesFunciones.activarvalorVigenciaFue,this,true,"valorVigenciaFue","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS));

		if(this.vigenciafueConstantesFunciones.mostrarnumero_cajasVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vigenciafueConstantesFunciones.resaltarnumero_cajasVigenciaFue,this.vigenciafueConstantesFunciones.activarnumero_cajasVigenciaFue,iSizeTabla,this,true,"numero_cajasVigenciaFue","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vigenciafueConstantesFunciones.resaltarnumero_cajasVigenciaFue,this.vigenciafueConstantesFunciones.activarnumero_cajasVigenciaFue,this,true,"numero_cajasVigenciaFue","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.vigenciafueConstantesFunciones.mostraresta_activoVigenciaFue && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.vigenciafueConstantesFunciones.resaltaresta_activoVigenciaFue,this.vigenciafueConstantesFunciones.activaresta_activoVigenciaFue,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.vigenciafueConstantesFunciones.resaltaresta_activoVigenciaFue,this.vigenciafueConstantesFunciones.activaresta_activoVigenciaFue,this,true,"esta_activoVigenciaFue","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VigenciaFuePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVigenciaFue.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVigenciaFue.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vigenciafueSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVigenciaFue.addColumn(tableColumn);
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
			
			this.jTableDatosVigenciaFue.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVigenciaFue.moveColumn(this.jTableDatosVigenciaFue.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVigenciaFue.moveColumn(this.jTableDatosVigenciaFue.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVigenciaFue.moveColumn(this.jTableDatosVigenciaFue.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVigenciaFue.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVigenciaFue.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVigenciaFue,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVigenciaFue.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVigenciaFue.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVigenciaFue.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVigenciaFue.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVigenciaFue.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vigenciafueLogic.getVigenciaFues().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vigenciafues.size()-1;
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
		//this.jTableDatosVigenciaFue.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVigenciaFue.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVigenciaFue();
			
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
				
				//this.isEsNuevoVigenciaFue=false;
					
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
				if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVigenciaFue==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVigenciaFue.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVigenciaFue.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vigenciafue.getsType().equals("DUPLICADO")
				   || this.vigenciafue.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVigenciaFue=true;
				
				} else {
					this.isEsNuevoVigenciaFue=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					if(this.vigenciafue.getId()>=0 && !this.vigenciafue.getIsNew()) {						
						this.isEsNuevoVigenciaFue=false;
						
					} else {
						this.isEsNuevoVigenciaFue=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVigenciaFue(esRelaciones);						
				
				this.seleccionarVigenciaFue(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vigenciafue.getId()<0) {
					this.isEsNuevoVigenciaFue=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVigenciaFue(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVigenciaFue(evt,rowIndex);
				}	
				
				if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VigenciaFue: " + this.dDif); 
					}
				}								
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVigenciaFue(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vigenciafue)) {
					if(this.vigenciafue.getId()>0) {
						this.vigenciafue.setIsDeleted(true);
						
						this.vigenciafuesEliminados.add(this.vigenciafue);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vigenciafueLogic.getVigenciaFues().remove(this.vigenciafue);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vigenciafues.remove(this.vigenciafue);				
					}
					
					
					((VigenciaFueModel) this.jTableDatosVigenciaFue.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVigenciaFue(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVigenciaFue(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVigenciaFue) {
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVigenciaFue.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVigenciaFue.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVigenciaFue(this.vigenciafue);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.vigenciafueConstantesFunciones.cargarid_paisVigenciaFue || this.vigenciafueConstantesFunciones.event_dependid_paisVigenciaFue) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.vigenciafue.getid_pais());
									//this.inicializarActualizarBindingVigenciaFue(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(vigenciafue.getPais()!=null) {
							this.paissForeignKey.add(vigenciafue.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.vigenciafue.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.vigenciafueConstantesFunciones.cargarid_ciudadVigenciaFue || this.vigenciafueConstantesFunciones.event_dependid_ciudadVigenciaFue) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.vigenciafue.getid_ciudad());
									//this.inicializarActualizarBindingVigenciaFue(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(vigenciafue.getCiudad()!=null) {
							this.ciudadsForeignKey.add(vigenciafue.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.vigenciafue.getid_ciudad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVigenciaFue("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVigenciaFue(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVigenciaFue() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVigenciaFue(VigenciaFue vigenciafue) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVigenciaFue(vigenciafue,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVigenciaFue(VigenciaFue vigenciafue,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVigenciaFue(vigenciafue);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVigenciaFue(vigenciafue,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVigenciaFue(vigenciafue);
	}
	
	public void setVariablesObjetoActualToFormularioVigenciaFue(VigenciaFue vigenciafue) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setText(vigenciafue.getId().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setDate(vigenciafue.getfecha_inicio());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setDate(vigenciafue.getfecha_fin());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setText(vigenciafue.getnumero_embarques().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setText(vigenciafue.getfue());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setDate(vigenciafue.getfecha_ultimo_embarque());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setText(vigenciafue.getvalor().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setText(vigenciafue.getnumero_cajas().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setSelected(vigenciafue.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VigenciaFue vigenciafueLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vigenciafueLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VigenciaFue vigenciafueLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vigenciafueLocal=this.vigenciafue;
			} else {
				vigenciafueLocal=this.vigenciafueAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vigenciafueLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVigenciaFue(vigenciafueLocal,true);
					
					if(vigenciafueSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vigenciafueLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vigenciafueLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVigenciaFue(VigenciaFue vigenciafue,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVigenciaFue(vigenciafue,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(vigenciafue);
	}
	
	public void setVariablesFormularioToObjetoActualVigenciaFue(VigenciaFue vigenciafue,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVigenciaFue(vigenciafue,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVigenciaFue(VigenciaFue vigenciafue,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.getText()==null || this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.getText()=="" || this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.getText()=="Id") {
				this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setText("0");
			}

			if(conColumnasBase) {vigenciafue.setId(Long.parseLong(this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelIdVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setfecha_inicio(this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_inicioVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setfecha_fin(this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_finVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setnumero_embarques(Integer.parseInt(this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_embarquesVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setfue(this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_FUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfueVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setfecha_ultimo_embarque(this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelfecha_ultimo_embarqueVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelvalorVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setnumero_cajas(Integer.parseInt(this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelnumero_cajasVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vigenciafue.setesta_activo(this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVigenciaFue.jLabelesta_activoVigenciaFue,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVigenciaFue(VigenciaFue vigenciafueBean,VigenciaFue vigenciafue,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vigenciafueBean.getid_pais()!=null && !vigenciafueBean.getid_pais().equals(-1L))) {vigenciafue.setid_pais(vigenciafueBean.getid_pais());}
			if(conDefault || (!conDefault && vigenciafueBean.getid_ciudad()!=null && !vigenciafueBean.getid_ciudad().equals(-1L))) {vigenciafue.setid_ciudad(vigenciafueBean.getid_ciudad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVigenciaFue(VigenciaFue vigenciafueOrigen,VigenciaFue vigenciafue,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vigenciafueOrigen.getId()!=null && !vigenciafueOrigen.getId().equals(0L))) {vigenciafue.setId(vigenciafueOrigen.getId());}}
			if(conDefault || (!conDefault && vigenciafueOrigen.getid_pais()!=null && !vigenciafueOrigen.getid_pais().equals(-1L))) {vigenciafue.setid_pais(vigenciafueOrigen.getid_pais());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getid_ciudad()!=null && !vigenciafueOrigen.getid_ciudad().equals(-1L))) {vigenciafue.setid_ciudad(vigenciafueOrigen.getid_ciudad());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getfecha_inicio()!=null && !vigenciafueOrigen.getfecha_inicio().equals(new Date()))) {vigenciafue.setfecha_inicio(vigenciafueOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getfecha_fin()!=null && !vigenciafueOrigen.getfecha_fin().equals(new Date()))) {vigenciafue.setfecha_fin(vigenciafueOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getnumero_embarques()!=null && !vigenciafueOrigen.getnumero_embarques().equals(0))) {vigenciafue.setnumero_embarques(vigenciafueOrigen.getnumero_embarques());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getfue()!=null && !vigenciafueOrigen.getfue().equals(""))) {vigenciafue.setfue(vigenciafueOrigen.getfue());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getfecha_ultimo_embarque()!=null && !vigenciafueOrigen.getfecha_ultimo_embarque().equals(new Date()))) {vigenciafue.setfecha_ultimo_embarque(vigenciafueOrigen.getfecha_ultimo_embarque());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getvalor()!=null && !vigenciafueOrigen.getvalor().equals(0.0))) {vigenciafue.setvalor(vigenciafueOrigen.getvalor());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getnumero_cajas()!=null && !vigenciafueOrigen.getnumero_cajas().equals(0))) {vigenciafue.setnumero_cajas(vigenciafueOrigen.getnumero_cajas());}
			if(conDefault || (!conDefault && vigenciafueOrigen.getesta_activo()!=null && !vigenciafueOrigen.getesta_activo().equals(false))) {vigenciafue.setesta_activo(vigenciafueOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVigenciaFue(VigenciaFue vigenciafue) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setText(vigenciafue.getId().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setDate(vigenciafue.getfecha_inicio());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setDate(vigenciafue.getfecha_fin());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setText(vigenciafue.getnumero_embarques().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setText(vigenciafue.getfue());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setDate(vigenciafue.getfecha_ultimo_embarque());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setText(vigenciafue.getvalor().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setText(vigenciafue.getnumero_cajas().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setSelected(vigenciafue.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVigenciaFue(VigenciaFueBean vigenciafueBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setText(vigenciafueBean.getId().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setDate(vigenciafueBean.getfecha_inicio());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setDate(vigenciafueBean.getfecha_fin());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setText(vigenciafueBean.getnumero_embarques().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setText(vigenciafueBean.getfue());
			this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setDate(vigenciafueBean.getfecha_ultimo_embarque());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setText(vigenciafueBean.getvalor().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setText(vigenciafueBean.getnumero_cajas().toString());
			this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setSelected(vigenciafueBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVigenciaFue(VigenciaFueParameterReturnGeneral vigenciafueReturnGeneral,VigenciaFueBean vigenciafueBean,Boolean conDefault) throws Exception { 
		try {
			VigenciaFue vigenciafueLocal=new VigenciaFue();
			
			vigenciafueLocal=vigenciafueReturnGeneral.getVigenciaFue();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vigenciafueLocal.getId()!=null && !vigenciafueLocal.getId().equals(0L))) {vigenciafueBean.setId(vigenciafueLocal.getId());}}
			if(conDefault || (!conDefault && vigenciafueLocal.getid_pais()!=null && !vigenciafueLocal.getid_pais().equals(-1L))) {vigenciafueBean.setid_pais(vigenciafueLocal.getid_pais());}
			if(conDefault || (!conDefault && vigenciafueLocal.getid_ciudad()!=null && !vigenciafueLocal.getid_ciudad().equals(-1L))) {vigenciafueBean.setid_ciudad(vigenciafueLocal.getid_ciudad());}
			if(conDefault || (!conDefault && vigenciafueLocal.getfecha_inicio()!=null && !vigenciafueLocal.getfecha_inicio().equals(new Date()))) {vigenciafueBean.setfecha_inicio(vigenciafueLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && vigenciafueLocal.getfecha_fin()!=null && !vigenciafueLocal.getfecha_fin().equals(new Date()))) {vigenciafueBean.setfecha_fin(vigenciafueLocal.getfecha_fin());}
			if(conDefault || (!conDefault && vigenciafueLocal.getnumero_embarques()!=null && !vigenciafueLocal.getnumero_embarques().equals(0))) {vigenciafueBean.setnumero_embarques(vigenciafueLocal.getnumero_embarques());}
			if(conDefault || (!conDefault && vigenciafueLocal.getfue()!=null && !vigenciafueLocal.getfue().equals(""))) {vigenciafueBean.setfue(vigenciafueLocal.getfue());}
			if(conDefault || (!conDefault && vigenciafueLocal.getfecha_ultimo_embarque()!=null && !vigenciafueLocal.getfecha_ultimo_embarque().equals(new Date()))) {vigenciafueBean.setfecha_ultimo_embarque(vigenciafueLocal.getfecha_ultimo_embarque());}
			if(conDefault || (!conDefault && vigenciafueLocal.getvalor()!=null && !vigenciafueLocal.getvalor().equals(0.0))) {vigenciafueBean.setvalor(vigenciafueLocal.getvalor());}
			if(conDefault || (!conDefault && vigenciafueLocal.getnumero_cajas()!=null && !vigenciafueLocal.getnumero_cajas().equals(0))) {vigenciafueBean.setnumero_cajas(vigenciafueLocal.getnumero_cajas());}
			if(conDefault || (!conDefault && vigenciafueLocal.getesta_activo()!=null && !vigenciafueLocal.getesta_activo().equals(false))) {vigenciafueBean.setesta_activo(vigenciafueLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVigenciaFueGenerico(Long idVigenciaFueSeleccionado,JComboBox jComboBoxVigenciaFue,List<VigenciaFue> vigenciafuesLocal)throws Exception {
		try {
			VigenciaFue  vigenciafueTemp=null;

			for(VigenciaFue vigenciafueAux:vigenciafuesLocal) {
				if(vigenciafueAux.getId()!=null && vigenciafueAux.getId().equals(idVigenciaFueSeleccionado)) {
					vigenciafueTemp=vigenciafueAux;
					break;
				}
			}

			jComboBoxVigenciaFue.setSelectedItem(vigenciafueTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVigenciaFueGenerico(JComboBox jComboBoxVigenciaFue,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVigenciaFue.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVigenciaFue.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVigenciaFue.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVigenciaFue.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVigenciaFue.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVigenciaFue.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vigenciafue=(VigenciaFue) vigenciafueLogic.getVigenciaFues().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vigenciafue =(VigenciaFue) vigenciafues.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!vigenciafue.getIsNew() && !vigenciafue.getIsChanged() && !vigenciafue.getIsDeleted()) {
				sDescripcion=vigenciafue.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=vigenciafue.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!vigenciafue.getIsNew() && !vigenciafue.getIsChanged() && !vigenciafue.getIsDeleted()) {
				sDescripcion=vigenciafue.getciudad_descripcion();
			} else {
				//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
				sDescripcion=vigenciafue.getciudad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VigenciaFue vigenciafueRow=new VigenciaFue();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vigenciafueRow=(VigenciaFue) vigenciafueLogic.getVigenciaFues().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vigenciafueRow=(VigenciaFue) vigenciafues.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVigenciaFue(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue));			
			this.jButtonDuplicarVigenciaFue.setVisible((this.isVisibilidadCeldaDuplicarVigenciaFue && this.isPermisoDuplicarVigenciaFue));			
			this.jButtonCopiarVigenciaFue.setVisible((this.isVisibilidadCeldaCopiarVigenciaFue && this.isPermisoCopiarVigenciaFue));
			this.jButtonVerFormVigenciaFue.setVisible((this.isVisibilidadCeldaVerFormVigenciaFue && this.isPermisoVerFormVigenciaFue));
			
			this.jButtonAbrirOrderByVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));			
			
			this.jButtonNuevoRelacionesVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoRelacionesVigenciaFue && this.isPermisoNuevoVigenciaFue));			
			this.jButtonNuevoGuardarCambiosVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarVigenciaFue.setVisible((this.isVisibilidadCeldaModificarVigenciaFue && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.setVisible((this.isVisibilidadCeldaActualizarVigenciaFue && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.setVisible((this.isVisibilidadCeldaEliminarVigenciaFue && this.isPermisoEliminarVigenciaFue));
			this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.setVisible(this.isVisibilidadCeldaCancelarVigenciaFue);							
			this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));			
			
			}
						
			this.jButtonGuardarCambiosTablaVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarCambiosVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue));						
			this.jButtonDuplicarToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaDuplicarVigenciaFue && this.isPermisoDuplicarVigenciaFue));						
			this.jButtonCopiarToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaCopiarVigenciaFue && this.isPermisoCopiarVigenciaFue));			
			this.jButtonVerFormToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaVerFormVigenciaFue && this.isPermisoVerFormVigenciaFue));			
			this.jButtonAbrirOrderByToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));
			this.jButtonNuevoRelacionesToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoRelacionesVigenciaFue && this.isPermisoNuevoVigenciaFue));			
			this.jButtonNuevoGuardarCambiosToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));			
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaModificarVigenciaFue && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaActualizarVigenciaFue  && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaEliminarVigenciaFue && this.isPermisoEliminarVigenciaFue));
			this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarToolBarVigenciaFue.setVisible(this.isVisibilidadCeldaCancelarVigenciaFue);				
			this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarCambiosVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue));			
			this.jMenuItemDuplicarVigenciaFue.setVisible((this.isVisibilidadCeldaDuplicarVigenciaFue && this.isPermisoDuplicarVigenciaFue));			
			this.jMenuItemCopiarVigenciaFue.setVisible((this.isVisibilidadCeldaCopiarVigenciaFue && this.isPermisoCopiarVigenciaFue));			
			this.jMenuItemVerFormVigenciaFue.setVisible((this.isVisibilidadCeldaVerFormVigenciaFue && this.isPermisoVerFormVigenciaFue));			
			this.jMenuItemAbrirOrderByVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));			
			//this.jMenuItemMostrarOcultarVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));
			this.jMenuItemDetalleAbrirOrderByVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));			
			//this.jMenuItemDetalleMostrarOcultarVigenciaFue.setVisible((this.isVisibilidadCeldaOrdenVigenciaFue && this.isPermisoOrdenVigenciaFue));			
			this.jMenuItemNuevoRelacionesVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoRelacionesVigenciaFue && this.isPermisoNuevoVigenciaFue));			
			this.jMenuItemNuevoGuardarCambiosVigenciaFue.setVisible((this.isVisibilidadCeldaNuevoVigenciaFue && this.isPermisoNuevoVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));									
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemModificarVigenciaFue.setVisible((this.isVisibilidadCeldaModificarVigenciaFue && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemActualizarVigenciaFue.setVisible((this.isVisibilidadCeldaActualizarVigenciaFue && this.isPermisoActualizarVigenciaFue));	
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemEliminarVigenciaFue.setVisible((this.isVisibilidadCeldaEliminarVigenciaFue && this.isPermisoEliminarVigenciaFue));
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemCancelarVigenciaFue.setVisible(this.isVisibilidadCeldaCancelarVigenciaFue);				
			}
			
			this.jMenuItemGuardarCambiosVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));						
			this.jMenuItemGuardarCambiosTablaVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarCambiosVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVigenciaFue=this.jButtonNuevoVigenciaFue.isVisible();
			this.isVisibilidadCeldaDuplicarVigenciaFue=this.jButtonDuplicarVigenciaFue.isVisible();
			this.isVisibilidadCeldaCopiarVigenciaFue=this.jButtonCopiarVigenciaFue.isVisible();
			this.isVisibilidadCeldaVerFormVigenciaFue=this.jButtonVerFormVigenciaFue.isVisible();
			
			this.isVisibilidadCeldaOrdenVigenciaFue=this.jButtonAbrirOrderByVigenciaFue.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=this.jButtonNuevoRelacionesVigenciaFue.isVisible();
			this.isVisibilidadCeldaModificarVigenciaFue=this.jButtonModificarVigenciaFue.isVisible();
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.isVisibilidadCeldaActualizarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.isVisible();
			this.isVisibilidadCeldaEliminarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.isVisible();
			this.isVisibilidadCeldaCancelarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.isVisible();
			this.isVisibilidadCeldaGuardarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=this.jButtonGuardarCambiosTablaVigenciaFue.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVigenciaFue=this.jButtonNuevoToolBarVigenciaFue.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=this.jButtonNuevoRelacionesToolBarVigenciaFue.isVisible();
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.isVisibilidadCeldaModificarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarToolBarVigenciaFue.isVisible();
			this.isVisibilidadCeldaActualizarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarToolBarVigenciaFue.isVisible();
			this.isVisibilidadCeldaEliminarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarToolBarVigenciaFue.isVisible();
			this.isVisibilidadCeldaCancelarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarToolBarVigenciaFue.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVigenciaFue=this.jButtonGuardarCambiosToolBarVigenciaFue.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=this.jButtonGuardarCambiosTablaToolBarVigenciaFue.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVigenciaFue=this.jMenuItemNuevoVigenciaFue.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=this.jMenuItemNuevoRelacionesVigenciaFue.isVisible();
			
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.isVisibilidadCeldaModificarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jMenuItemModificarVigenciaFue.isVisible();
			this.isVisibilidadCeldaActualizarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jMenuItemActualizarVigenciaFue.isVisible();
			this.isVisibilidadCeldaEliminarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jMenuItemEliminarVigenciaFue.isVisible();
			this.isVisibilidadCeldaCancelarVigenciaFue=this.jInternalFrameDetalleFormVigenciaFue.jMenuItemCancelarVigenciaFue.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVigenciaFue=this.jMenuItemGuardarCambiosVigenciaFue.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=this.jMenuItemGuardarCambiosTablaVigenciaFue.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVigenciaFue(Boolean esInicializar) {
		if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
				//if(this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVigenciaFue();
			}
			
			this.inicializarActualizarBindingBotonesManualVigenciaFue(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVigenciaFue() {
		this.jButtonNuevoVigenciaFue.setVisible(this.isPermisoNuevoVigenciaFue);			
		this.jButtonDuplicarVigenciaFue.setVisible(this.isPermisoDuplicarVigenciaFue);			
		this.jButtonCopiarVigenciaFue.setVisible(this.isPermisoCopiarVigenciaFue);			
		this.jButtonVerFormVigenciaFue.setVisible(this.isPermisoVerFormVigenciaFue);			
		
		this.jButtonAbrirOrderByVigenciaFue.setVisible(this.isPermisoOrdenVigenciaFue);					
		
		this.jButtonNuevoRelacionesVigenciaFue.setVisible(this.isPermisoNuevoVigenciaFue);			
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarVigenciaFue.setVisible(this.isPermisoActualizarVigenciaFue);	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.setVisible(this.isPermisoActualizarVigenciaFue);	
			this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.setVisible(this.isPermisoEliminarVigenciaFue);
			this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.setVisible(this.isVisibilidadCeldaCancelarVigenciaFue);						
			this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.setVisible(this.isPermisoGuardarCambiosVigenciaFue);							
		}
		
		this.jButtonGuardarCambiosTablaVigenciaFue.setVisible(this.isPermisoActualizarVigenciaFue);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVigenciaFue() {
		this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarVigenciaFue.setVisible(this.isPermisoActualizarVigenciaFue);	
		this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.setVisible(this.isPermisoActualizarVigenciaFue);	
		this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.setVisible(this.isPermisoEliminarVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.setVisible(this.isVisibilidadCeldaCancelarVigenciaFue);							
		this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.setVisible((this.isVisibilidadCeldaGuardarVigenciaFue && this.isPermisoGuardarCambiosVigenciaFue));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVigenciaFue() {
		if(VigenciaFueJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVigenciaFue();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVigenciaFue() {
	}
	
	public void jTableDatosVigenciaFueListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVigenciaFue(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vigenciafue.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisVigenciaFueUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebVigenciaFue(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVigenciaFue.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVigenciaFue.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.vigenciafueLogic.getConnexion());

				if(this.vigenciafue.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.vigenciafue.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVigenciaFue=(TitledBorder)this.jScrollPanelDatosVigenciaFue.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderVigenciaFue.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.vigenciafue.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ciudadVigenciaFueUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebVigenciaFue(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVigenciaFue.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVigenciaFue.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.vigenciafueLogic.getConnexion());

				if(this.vigenciafue.getid_ciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.vigenciafue.getid_ciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVigenciaFue=(TitledBorder)this.jScrollPanelDatosVigenciaFue.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderVigenciaFue.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ciudadVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getid_ciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ciudad = "+this.vigenciafue.getid_ciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.vigenciafue.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.vigenciafue.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_embarquesVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getnumero_embarques()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_embarques = "+this.vigenciafue.getnumero_embarques().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfueVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getfue()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fue like '%"+this.vigenciafue.getfue()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultimo_embarqueVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getfecha_ultimo_embarque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultimo_embarque = '"+Funciones2.getStringPostgresDate(this.vigenciafue.getfecha_ultimo_embarque())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.vigenciafue.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cajasVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getnumero_cajas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cajas = "+this.vigenciafue.getnumero_cajas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoVigenciaFueBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.getvigenciafue(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vigenciafue==null) {
						this.vigenciafue = new VigenciaFue();
					}

					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);
				}

				if(this.vigenciafue.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.vigenciafue.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVigenciaFue(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadVigenciaFueActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVigenciaFue(false,false);

			this.getVigenciaFuesFK_IdCiudad();

			this.inicializarActualizarBindingVigenciaFue(false);

			//if(VigenciaFueBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVigenciaFue(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisVigenciaFueActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVigenciaFue(false,false);

			this.getVigenciaFuesFK_IdPais();

			this.inicializarActualizarBindingVigenciaFue(false);

			//if(VigenciaFueBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVigenciaFue(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vigenciafueLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVigenciaFue() {
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
			this.jInternalFrameDetalleFormVigenciaFue.setVisible(false);	    			
			this.jInternalFrameDetalleFormVigenciaFue.dispose();
			this.jInternalFrameDetalleFormVigenciaFue=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
			this.jInternalFrameReporteDinamicoVigenciaFue.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVigenciaFue.dispose();
			this.jInternalFrameReporteDinamicoVigenciaFue=null;
		}
		
		if(this.jInternalFrameImportacionVigenciaFue!=null) {
			this.jInternalFrameImportacionVigenciaFue.setVisible(false);	    			
			this.jInternalFrameImportacionVigenciaFue.dispose();
			this.jInternalFrameImportacionVigenciaFue=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVigenciaFue();
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			
			if(sTipo.equals("NuevoVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVigenciaFue")) {
				jButtonDuplicarVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVigenciaFue")) {
				jButtonCopiarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("VerFormVigenciaFue")) {
				jButtonVerFormVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVigenciaFue")) {
				jButtonDuplicarVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVigenciaFue")) {
				jButtonDuplicarVigenciaFueActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVigenciaFue")) {
				jButtonModificarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVigenciaFue")) {
				jButtonModificarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVigenciaFue")) {
				jButtonModificarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVigenciaFue")) {
				jButtonActualizarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVigenciaFue")) {
				jButtonActualizarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVigenciaFue")) {
				jButtonActualizarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("EliminarVigenciaFue")) {
				jButtonEliminarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVigenciaFue")) {
				jButtonEliminarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVigenciaFue")) {
				jButtonEliminarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("CancelarVigenciaFue")) {
				jButtonCancelarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVigenciaFue")) {
				jButtonCancelarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVigenciaFue")) {
				jButtonCancelarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("CerrarVigenciaFue")) {
				jButtonCerrarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVigenciaFue")) {
				jButtonCerrarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVigenciaFue")) {
				jButtonCerrarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVigenciaFue")) {
				jButtonMostrarOcultarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVigenciaFue")) {
				jButtonCancelarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVigenciaFue")) {
				jButtonCopiarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVigenciaFue")) {
				jButtonVerFormVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVigenciaFue")) {
				jButtonCopiarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVigenciaFue")) {
				jButtonVerFormVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVigenciaFue")) {
				jButtonRecargarInformacionVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVigenciaFue")) {
				jButtonRecargarInformacionVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVigenciaFue")) {
				jButtonRecargarInformacionVigenciaFueActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVigenciaFue")) {
				jButtonAnterioresVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVigenciaFue")) {
				jButtonAnterioresVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVigenciaFue")) {
				jButtonAnterioresVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVigenciaFue")) {
				jButtonSiguientesVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVigenciaFue")) {
				jButtonSiguientesVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVigenciaFue")) {
				jButtonSiguientesVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVigenciaFue") || sTipo.equals("MenuItemDetalleAbrirOrderByVigenciaFue")) {
				jButtonAbrirOrderByVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVigenciaFue") || sTipo.equals("MenuItemDetalleMostrarOcultarVigenciaFue")) {
				jButtonMostrarOcultarVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVigenciaFue")) {
				jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVigenciaFue")) {
				jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVigenciaFue")) {
				jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVigenciaFue")) {
				jButtonCerrarReporteDinamicoVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVigenciaFue")) {
				jButtonGenerarReporteDinamicoVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVigenciaFue")) {
				
				jButtonGenerarExcelReporteDinamicoVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVigenciaFue")) {
				jButtonCerrarImportacionVigenciaFueActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVigenciaFue")) {
				
				jButtonGenerarImportacionVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVigenciaFue")) {
				
				jButtonAbrirImportacionVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVigenciaFue")) {
				jComboBoxTiposAccionesVigenciaFueActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVigenciaFue")) {
				jComboBoxTiposRelacionesVigenciaFueActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVigenciaFue")) {
				jComboBoxTiposAccionesVigenciaFueActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVigenciaFue")) {
				
				jComboBoxTiposSeleccionarVigenciaFueActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVigenciaFue")) {
				jTextFieldValorCampoGeneralVigenciaFueActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVigenciaFue")) {
				jButtonAbrirOrderByVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVigenciaFue")) {
				jButtonAbrirOrderByVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVigenciaFue")) {
				jButtonCerrarOrderByVigenciaFueActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVigenciaFueBusqueda")) {
				this.jButtonidVigenciaFueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisVigenciaFueUpdate")) {
				this.jButtonid_paisVigenciaFueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisVigenciaFueBusqueda")) {
				this.jButtonid_paisVigenciaFueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadVigenciaFueUpdate")) {
				this.jButtonid_ciudadVigenciaFueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadVigenciaFueBusqueda")) {
				this.jButtonid_ciudadVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioVigenciaFueBusqueda")) {
				this.jButtonfecha_inicioVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finVigenciaFueBusqueda")) {
				this.jButtonfecha_finVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_embarquesVigenciaFueBusqueda")) {
				this.jButtonnumero_embarquesVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fueVigenciaFueBusqueda")) {
				this.jButtonfueVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_embarqueVigenciaFueBusqueda")) {
				this.jButtonfecha_ultimo_embarqueVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorVigenciaFueBusqueda")) {
				this.jButtonvalorVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cajasVigenciaFueBusqueda")) {
				this.jButtonnumero_cajasVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoVigenciaFueBusqueda")) {
				this.jButtonesta_activoVigenciaFueBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCiudadVigenciaFue")) {
				this.jButtonFK_IdCiudadVigenciaFueActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisVigenciaFue")) {
				this.jButtonFK_IdPaisVigenciaFueActionPerformed(evt);
			}
			
			;
			
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVigenciaFue();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VigenciaFue vigenciafueLocal=null;
			
			if(!this.getEsControlTabla()) {
				vigenciafueLocal=this.vigenciafue;
			} else {
				vigenciafueLocal=this.vigenciafueAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
							
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
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
			
			


			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
								
						
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
								
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
							
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
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
			
			


			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
								
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVigenciaFue")) {
					jCheckBoxSeleccionarTodosVigenciaFueItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVigenciaFue")) {
					jCheckBoxSeleccionadosVigenciaFueItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVigenciaFue")) {
					
				}
				
				


				
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
												
				
				


				
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
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
			
			


			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVigenciaFueActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vigenciafue);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vigenciafue);
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
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
				
				


				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VigenciaFue.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VigenciaFue.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVigenciaFueActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vigenciafueAnterior =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVigenciaFue")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVigenciaFueListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVigenciaFue.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vigenciafue =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vigenciafue =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vigenciafue);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVigenciaFue")) {
				
				}
				
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVigenciaFue")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVigenciaFue.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVigenciaFue")) {
			
			}
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVigenciaFue();
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			if(sTipo.equals("NuevoVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVigenciaFue")) {
				jButtonDuplicarVigenciaFueActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVigenciaFue")) {
				jButtonCopiarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVigenciaFue")) {
				jButtonVerFormVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVigenciaFue")) {
				jButtonNuevoVigenciaFueActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVigenciaFue")) {
				jButtonModificarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVigenciaFue")) {
				jButtonActualizarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVigenciaFue")) {
				jButtonEliminarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVigenciaFue")) {
				jButtonCancelarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVigenciaFue")) {
				jButtonCerrarVigenciaFueActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVigenciaFue")) {
				jButtonGuardarCambiosVigenciaFueActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVigenciaFue")) {
				jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVigenciaFue")) {
				jButtonAbrirOrderByVigenciaFueActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVigenciaFue")) {
				jButtonRecargarInformacionVigenciaFueActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVigenciaFue")) {
				jButtonAnterioresVigenciaFueActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVigenciaFue")) {
				jButtonSiguientesVigenciaFueActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVigenciaFueBusqueda")) {
				this.jButtonidVigenciaFueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisVigenciaFueUpdate")) {
				this.jButtonid_paisVigenciaFueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisVigenciaFueBusqueda")) {
				this.jButtonid_paisVigenciaFueBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ciudadVigenciaFueUpdate")) {
				this.jButtonid_ciudadVigenciaFueUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ciudadVigenciaFueBusqueda")) {
				this.jButtonid_ciudadVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioVigenciaFueBusqueda")) {
				this.jButtonfecha_inicioVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finVigenciaFueBusqueda")) {
				this.jButtonfecha_finVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_embarquesVigenciaFueBusqueda")) {
				this.jButtonnumero_embarquesVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fueVigenciaFueBusqueda")) {
				this.jButtonfueVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultimo_embarqueVigenciaFueBusqueda")) {
				this.jButtonfecha_ultimo_embarqueVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorVigenciaFueBusqueda")) {
				this.jButtonvalorVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cajasVigenciaFueBusqueda")) {
				this.jButtonnumero_cajasVigenciaFueBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoVigenciaFueBusqueda")) {
				this.jButtonesta_activoVigenciaFueBusquedaActionPerformed(evt);
			}
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVigenciaFue();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVigenciaFue")) {
				closingInternalFrameVigenciaFue();
				
			} else if(sTipo.equals("jButtonCancelarVigenciaFue")) {
				JInternalFrameBase jInternalFrameDetalleFormVigenciaFue = (JInternalFrameBase)evt.getSource();
	            	
	            VigenciaFueBeanSwingJInternalFrame jInternalFrameParent=(VigenciaFueBeanSwingJInternalFrame)jInternalFrameDetalleFormVigenciaFue.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVigenciaFueActionPerformed(null);
			}
			
			VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vigenciafue,new Object(),this.vigenciafueParameterGeneral,this.vigenciafueReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVigenciaFue(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVigenciaFue(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVigenciaFue(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vigenciafue)) {
			if(!esControlTabla) {
				if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);			
				}
				
				if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVigenciaFue(this.vigenciafue,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vigenciafueReturnGeneral=vigenciafueLogic.procesarEventosVigenciaFuesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vigenciafueLogic.getVigenciaFues(),this.vigenciafue,this.vigenciafueParameterGeneral,this.isEsNuevoVigenciaFue,classes);//this.vigenciafueLogic.getVigenciaFue()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVigenciaFue(this.vigenciafueReturnGeneral,this.vigenciafueBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVigenciaFue(classes,this.vigenciafueReturnGeneral,this.vigenciafueBean,false);
					}
						
					if(this.vigenciafueReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue());	
					}
						
					if(this.vigenciafueReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue(),classes);//this.vigenciafueBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVigenciaFue(this.vigenciafue,classes);//this.vigenciafueBean);									
				}
			
				if(VigenciaFueJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVigenciaFue(this.vigenciafue,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVigenciaFue(this.vigenciafue);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vigenciafueAnterior!=null) {
						this.vigenciafue=this.vigenciafueAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vigenciafueReturnGeneral=vigenciafueLogic.procesarEventosVigenciaFuesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vigenciafueLogic.getVigenciaFues(),this.vigenciafue,this.vigenciafueParameterGeneral,this.isEsNuevoVigenciaFue,classes);//this.vigenciafueLogic.getVigenciaFue()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vigenciafueSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vigenciafueSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vigenciafueReturnGeneral.getVigenciaFue(),vigenciafueLogic.getVigenciaFues());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vigenciafueReturnGeneral.getVigenciaFue(),this.vigenciafues);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVigenciaFue.repaint();
				
				//((AbstractTableModel) this.jTableDatosVigenciaFue.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVigenciaFue();
			}
		}
	}
	
	public void actualizarVisualTableDatosVigenciaFue() throws Exception {
		
		VigenciaFueModel vigenciafueModel=(VigenciaFueModel)this.jTableDatosVigenciaFue.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vigenciafueModel.vigenciafues=this.vigenciafueLogic.getVigenciaFues();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vigenciafueModel.vigenciafues=this.vigenciafues;
		}
		
		
		((VigenciaFueModel) this.jTableDatosVigenciaFue.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVigenciaFue() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvigenciafueAnterior(),this.vigenciafueLogic.getVigenciaFues());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvigenciafueAnterior(),this.vigenciafues);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVigenciaFue();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVigenciaFue(VigenciaFue vigenciafue,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
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
										
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vigenciafue,new Object(),generalEntityParameterGeneral,this.vigenciafueReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vigenciafueSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VigenciaFueConstantesFunciones.getClassesRelationshipsOfVigenciaFue(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VigenciaFueConstantesFunciones.getClassesRelationshipsFromStringsOfVigenciaFue(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVigenciaFue(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VigenciaFueBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vigenciafue,new Object(),generalEntityParameterGeneral,this.vigenciafueReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVigenciaFue(VigenciaFueBean vigenciafueBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVigenciaFue(ArrayList<Classe> classes,VigenciaFueReturnGeneral vigenciafueReturnGeneral,VigenciaFueBean vigenciafueBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVigenciaFue(VigenciaFue vigenciafue,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vigenciafue)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVigenciaFue = new VigenciaFueDetalleFormJInternalFrame(jDesktopPane,this.vigenciafueSessionBean.getConGuardarRelaciones(),this.vigenciafueSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.setVisible(false);
		this.jInternalFrameDetalleFormVigenciaFue.setSelected(false);						
		
		this.jInternalFrameDetalleFormVigenciaFue.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVigenciaFue.vigenciafueLogic=this.vigenciafueLogic;
		
		this.cargarCombosFrameForeignKeyVigenciaFue("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVigenciaFue();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVigenciaFue();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVigenciaFue("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVigenciaFue();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVigenciaFue.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVigenciaFue"));
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarVigenciaFue.addActionListener(new ButtonActionListener(this,"ModificarVigenciaFue"));

		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"ModificarToolBarVigenciaFue"));
					
		this.jInternalFrameDetalleFormVigenciaFue.jMenuItemModificarVigenciaFue.addActionListener(new ButtonActionListener(this,"MenuItemModificarVigenciaFue"));		
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.addActionListener (new ButtonActionListener(this,"ActualizarVigenciaFue"));
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVigenciaFue"));
						
		this.jInternalFrameDetalleFormVigenciaFue.jMenuItemActualizarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVigenciaFue"));		
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.addActionListener (new ButtonActionListener(this,"EliminarVigenciaFue"));
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"EliminarToolBarVigenciaFue"));
								
		this.jInternalFrameDetalleFormVigenciaFue.jMenuItemEliminarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVigenciaFue"));		
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.addActionListener (new ButtonActionListener(this,"CancelarVigenciaFue"));
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"CancelarToolBarVigenciaFue"));
					
		this.jInternalFrameDetalleFormVigenciaFue.jMenuItemCancelarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVigenciaFue"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jMenuItemDetalleCerrarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVigenciaFue"));		
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVigenciaFue"));
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVigenciaFue"));
		
		
		
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVigenciaFue"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonidVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"idVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_inicioVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_finVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_embarquesVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_embarquesVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_embarqueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonvalorVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"valorVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_cajasVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_cajasVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonesta_activoVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoVigenciaFueBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVigenciaFue"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVigenciaFue"));
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVigenciaFue"));
		}
		
		this.jTableDatosVigenciaFue.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVigenciaFue"));
		
		this.jTableDatosVigenciaFue.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVigenciaFue"));
		
		this.jButtonNuevoVigenciaFue.addActionListener(new ButtonActionListener(this,"NuevoVigenciaFue"));
		
		this.jButtonDuplicarVigenciaFue.addActionListener(new ButtonActionListener(this,"DuplicarVigenciaFue"));
		
		this.jButtonCopiarVigenciaFue.addActionListener(new ButtonActionListener(this,"CopiarVigenciaFue"));
		
		this.jButtonVerFormVigenciaFue.addActionListener(new ButtonActionListener(this,"VerFormVigenciaFue"));
		
		
		this.jButtonNuevoToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"NuevoToolBarVigenciaFue"));
			
		this.jButtonDuplicarToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVigenciaFue"));
			
		this.jMenuItemNuevoVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVigenciaFue"));
			
		this.jMenuItemDuplicarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVigenciaFue"));		
		
		
		this.jButtonNuevoRelacionesVigenciaFue.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVigenciaFue"));
		
		
		this.jButtonNuevoRelacionesToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVigenciaFue"));
			
		this.jMenuItemNuevoRelacionesVigenciaFue.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVigenciaFue"));		
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarVigenciaFue.addActionListener(new ButtonActionListener(this,"ModificarVigenciaFue"));
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonModificarToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"ModificarToolBarVigenciaFue"));
			
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemModificarVigenciaFue.addActionListener(new ButtonActionListener(this,"MenuItemModificarVigenciaFue"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarVigenciaFue.addActionListener (new ButtonActionListener(this,"ActualizarVigenciaFue"));
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonActualizarToolBarVigenciaFue.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVigenciaFue"));
				
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemActualizarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVigenciaFue"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarVigenciaFue.addActionListener (new ButtonActionListener(this,"EliminarVigenciaFue"));
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonEliminarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"EliminarToolBarVigenciaFue"));
						
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemEliminarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVigenciaFue"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarVigenciaFue.addActionListener (new ButtonActionListener(this,"CancelarVigenciaFue"));
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonCancelarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"CancelarToolBarVigenciaFue"));
			
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemCancelarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVigenciaFue"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVigenciaFue"));		
		
		
		this.jButtonCerrarVigenciaFue.addActionListener (new ButtonActionListener(this,"CerrarVigenciaFue"));
		
		
		this.jButtonCerrarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"CerrarToolBarVigenciaFue"));
			
		this.jMenuItemCerrarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVigenciaFue"));
			
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jMenuItemDetalleCerrarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVigenciaFue"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosVigenciaFue"));
		}
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVigenciaFue"));
		}
		
		this.jButtonCopiarToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"CopiarToolBarVigenciaFue"));
			
		this.jButtonVerFormToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"VerFormToolBarVigenciaFue"));
		
		this.jMenuItemGuardarCambiosVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVigenciaFue"));
			
		this.jMenuItemCopiarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVigenciaFue"));		
		
		this.jMenuItemVerFormVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVigenciaFue"));		
		
		
		this.jButtonGuardarCambiosTablaVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVigenciaFue"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVigenciaFue"));
			
		this.jMenuItemGuardarCambiosTablaVigenciaFue.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVigenciaFue"));		
		
		
		
		this.jButtonRecargarInformacionVigenciaFue.addActionListener (new ButtonActionListener(this,"RecargarInformacionVigenciaFue"));
					
		this.jButtonRecargarInformacionToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVigenciaFue"));
		
		this.jMenuItemRecargarInformacionVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVigenciaFue"));		
		
		
		
		this.jButtonAnterioresVigenciaFue.addActionListener (new ButtonActionListener(this,"AnterioresVigenciaFue"));
		
		
		this.jButtonAnterioresToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVigenciaFue"));
		
		this.jMenuItemAnterioresVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVigenciaFue"));		
		
		
		this.jButtonSiguientesVigenciaFue.addActionListener (new ButtonActionListener(this,"SiguientesVigenciaFue"));
		
		
		this.jButtonSiguientesToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVigenciaFue"));
			
		this.jMenuItemSiguientesVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVigenciaFue"));
			
		this.jMenuItemAbrirOrderByVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVigenciaFue"));
			
		this.jMenuItemMostrarOcultarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVigenciaFue"));
			
		this.jMenuItemDetalleAbrirOrderByVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVigenciaFue"));
			
		this.jMenuItemDetalleMostarOcultarVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVigenciaFue"));		
		
		
		this.jButtonNuevoGuardarCambiosVigenciaFue.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVigenciaFue"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVigenciaFue"));
			
		this.jMenuItemNuevoGuardarCambiosVigenciaFue.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVigenciaFue"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVigenciaFue.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVigenciaFue"));

		this.jCheckBoxSeleccionadosVigenciaFue.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVigenciaFue"));
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVigenciaFue"));
		}
		
		
		this.jComboBoxTiposRelacionesVigenciaFue.addActionListener (new ButtonActionListener(this,"TiposRelacionesVigenciaFue"));
			
		this.jComboBoxTiposAccionesVigenciaFue.addActionListener (new ButtonActionListener(this,"TiposAccionesVigenciaFue"));
					
		this.jComboBoxTiposSeleccionarVigenciaFue.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVigenciaFue"));
			
		this.jTextFieldValorCampoGeneralVigenciaFue.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVigenciaFue"));		
		
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonidVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"idVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_inicioVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_finVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_embarquesVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_embarquesVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_embarqueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonvalorVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"valorVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_cajasVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_cajasVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonesta_activoVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoVigenciaFueBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadVigenciaFue.addActionListener(new ButtonActionListener(this,"FK_IdCiudadVigenciaFue"));

			this.jButtonFK_IdPaisVigenciaFue.addActionListener(new ButtonActionListener(this,"FK_IdPaisVigenciaFue"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVigenciaFue!=null) {
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVigenciaFue"));
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVigenciaFue"));
				this.jInternalFrameReporteDinamicoVigenciaFue.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVigenciaFue"));
			}
			
			//this.jButtonCerrarReporteDinamicoVigenciaFue.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVigenciaFue"));				
			//this.jButtonGenerarReporteDinamicoVigenciaFue.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVigenciaFue"));
			//this.jButtonGenerarExcelReporteDinamicoVigenciaFue.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVigenciaFue"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVigenciaFue!=null) {
				this.jInternalFrameImportacionVigenciaFue.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVigenciaFue"));
				this.jInternalFrameImportacionVigenciaFue.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVigenciaFue"));
				this.jInternalFrameImportacionVigenciaFue.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVigenciaFue"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVigenciaFue.addActionListener (new ButtonActionListener(this,"AbrirOrderByVigenciaFue"));
			
			this.jButtonAbrirOrderByToolBarVigenciaFue.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVigenciaFue"));			
			
			if(this.jInternalFrameOrderByVigenciaFue!=null) {
				this.jInternalFrameOrderByVigenciaFue.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVigenciaFue"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVigenciaFue.jTabbedPaneRelacionesVigenciaFue.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVigenciaFue"));
		
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
            		closingInternalFrameVigenciaFue();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVigenciaFue.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVigenciaFue = (JInternalFrameBase)event.getSource();
	            	
	            VigenciaFueBeanSwingJInternalFrame jInternalFrameParent=(VigenciaFueBeanSwingJInternalFrame)jInternalFrameDetalleFormVigenciaFue.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVigenciaFueActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVigenciaFue.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVigenciaFueListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVigenciaFue.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVigenciaFue.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVigenciaFue";
		inputMap = this.jButtonNuevoVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVigenciaFueActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVigenciaFueActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVigenciaFue";
		inputMap = this.jButtonNuevoRelacionesVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVigenciaFueActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVigenciaFue";
		inputMap = this.jButtonModificarVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVigenciaFue";
		inputMap = this.jButtonActualizarVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVigenciaFue";
		inputMap = this.jButtonEliminarVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVigenciaFue";
		inputMap = this.jButtonCancelarVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVigenciaFue";
		inputMap = this.jButtonCerrarVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVigenciaFue";
		inputMap = this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVigenciaFue.jButtonGuardarCambiosVigenciaFue.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVigenciaFueActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVigenciaFue.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVigenciaFueItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVigenciaFue.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVigenciaFueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVigenciaFue.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVigenciaFueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVigenciaFue.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVigenciaFueActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonidVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"idVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_paisVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_paisVigenciaFueBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueUpdate.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonid_ciudadVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"id_ciudadVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_inicioVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_finVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_embarquesVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_embarquesVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonfecha_ultimo_embarqueVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultimo_embarqueVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonvalorVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"valorVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonnumero_cajasVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"numero_cajasVigenciaFueBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVigenciaFue.jButtonesta_activoVigenciaFueBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoVigenciaFueBusqueda"));
		
		
		this.jButtonFK_IdCiudadVigenciaFue.addActionListener(new ButtonActionListener(this,"FK_IdCiudadVigenciaFue"));

		this.jButtonFK_IdPaisVigenciaFue.addActionListener(new ButtonActionListener(this,"FK_IdPaisVigenciaFue"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVigenciaFue.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVigenciaFueActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVigenciaFueActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVigenciaFue.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVigenciaFue(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
					vigenciafueAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VigenciaFue vigenciafueAux:vigenciafues) {
					vigenciafueAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVigenciaFueItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
						vigenciafueAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VigenciaFue vigenciafueAux:vigenciafues) {
						vigenciafueAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
					
						if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							vigenciafueAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VigenciaFue vigenciafueAux:vigenciafues) {
						
						if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							vigenciafueAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVigenciaFue(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVigenciaFue.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVigenciaFue.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVigenciaFueItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVigenciaFue.getSelectedRows();
			
			VigenciaFue vigenciafueLocal=new VigenciaFue();
			
			//this.seleccionarTodosVigenciaFue(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vigenciafueLocal =(VigenciaFue) this.vigenciafueLogic.getVigenciaFues().toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vigenciafueLocal =(VigenciaFue) this.vigenciafues.toArray()[this.jTableDatosVigenciaFue.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vigenciafueLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
						vigenciafueAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VigenciaFue vigenciafueAux:vigenciafues) {
						vigenciafueAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVigenciaFue(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVigenciaFue.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVigenciaFue.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVigenciaFue,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVigenciaFueItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVigenciaFueParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVigenciaFueActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVigenciaFue.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VigenciaFue vigenciafueAux:this.vigenciafueLogic.getVigenciaFues()) {
				
						if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							vigenciafueAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							vigenciafueAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES)) {
							existe=true;
							vigenciafueAux.setnumero_embarques(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FUE)) {
							existe=true;
							vigenciafueAux.setfue(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE)) {
							existe=true;
							vigenciafueAux.setfecha_ultimo_embarque(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							vigenciafueAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS)) {
							existe=true;
							vigenciafueAux.setnumero_cajas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VigenciaFue vigenciafueAux:vigenciafues) {
					
						if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							vigenciafueAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							vigenciafueAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES)) {
							existe=true;
							vigenciafueAux.setnumero_embarques(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FUE)) {
							existe=true;
							vigenciafueAux.setfue(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE)) {
							existe=true;
							vigenciafueAux.setfecha_ultimo_embarque(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							vigenciafueAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS)) {
							existe=true;
							vigenciafueAux.setnumero_cajas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVigenciaFue(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVigenciaFueActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVigenciaFue=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVigenciaFue.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVigenciaFue) {				
					conSplash=true;//false;										
					
					//this.startProcessVigenciaFue(conSplash);
				
					this.generarReporteVigenciaFuesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVigenciaFuesSeleccionados();
				//this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVigenciaFuesSeleccionados(false);
				//this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVigenciaFuesSeleccionados(true);
				//this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVigenciaFue();
				
				this.exportarVigenciaFuesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVigenciaFues();
				//this.importarVigenciaFues();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVigenciaFue();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVigenciaFuesSeleccionados();
				//this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vigencia Fue", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVigenciaFue();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVigenciaFue)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVigenciaFue(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
				}	
			} 			
			else if(VigenciaFueBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVigenciaFue) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVigenciaFue(conSplash);
					
						//this.actualizarParametrosGeneralVigenciaFue();
						
						this.generarReporteProcesoAccionVigenciaFuesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VigenciaFueBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Vigencia FueS SELECCIONADOS?", "MANTENIMIENTO DE Vigencia Fue", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVigenciaFue();
				
						this.actualizarParametrosGeneralVigenciaFue();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vigenciafueReturnGeneral=vigenciafueLogic.procesarAccionVigenciaFuesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vigenciafueLogic.getVigenciaFues(),this.vigenciafueParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVigenciaFueReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVigenciaFue();
					
					VigenciaFueBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVigenciaFueReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVigenciaFue.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVigenciaFue.jComboBoxTiposAccionesFormularioVigenciaFue.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVigenciaFue(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVigenciaFueActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVigenciaFue();
			
			if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
			VigenciaFue vigenciafue=new VigenciaFue();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVigenciaFue(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVigenciaFue.getSelectedItem();
			
			
			
			
			vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
			//this.sTipoAccion;
			
			if(vigenciafuesSeleccionados.size()==1) {
				for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
					vigenciafue=vigenciafueAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVigenciaFue();
			
      		//this.finishProcessVigenciaFue(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVigenciaFueReturnGeneral() throws Exception {
		if(this.vigenciafueReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vigenciafueReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vigenciafueReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vigenciafueReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vigenciafueReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vigenciafueReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVigenciaFue(false);
		}
		
		if(this.vigenciafueReturnGeneral.getConRetornoLista() || this.vigenciafueReturnGeneral.getConRetornoObjeto()) {
			if(this.vigenciafueReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vigenciafueLogic.setVigenciaFues(this.vigenciafueReturnGeneral.getVigenciaFues());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vigenciafueReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vigenciafueLogic.setVigenciaFue(this.vigenciafueReturnGeneral.getVigenciaFue());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVigenciaFue(false);
		}
	}
	
	public void actualizarParametrosGeneralVigenciaFue() throws Exception {
		
		
	}
	
	public ArrayList<VigenciaFue> getVigenciaFuesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVigenciaFue) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VigenciaFue vigenciafueAux:vigenciafueLogic.getVigenciaFues()) {
					if(vigenciafueAux.getIsSelected()) {
						vigenciafuesSeleccionados.add(vigenciafueAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VigenciaFue vigenciafueAux:this.vigenciafues) {
					if(vigenciafueAux.getIsSelected()) {
						vigenciafuesSeleccionados.add(vigenciafueAux);				
					}
				}
			}
			
			if(vigenciafuesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vigenciafuesSeleccionados.addAll(this.vigenciafueLogic.getVigenciaFues());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vigenciafuesSeleccionados.addAll(this.vigenciafues);				
					}
				}
			}
		} else {
			vigenciafuesSeleccionados.add(this.vigenciafue);
		}
		
		return vigenciafuesSeleccionados;
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
	
	public void generarReporteVigenciaFuesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVigenciaFuesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVigenciaFuesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVigenciaFuesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVigenciaFuesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vigencia Fue",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados);
		
	}	
	
	public void generarReporteNormalVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVigenciaFuesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVigenciaFue();
		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVigenciaFue();
		
		
		//this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados ,vigenciafueImplementable,vigenciafueImplementableHome);
	}
	
	public void mostrarImportacionVigenciaFues() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVigenciaFue();
		
		this.abrirFrameImportacionVigenciaFue();		
		
			
		//this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados ,vigenciafueImplementable,vigenciafueImplementableHome);
	}
	
	public void importarVigenciaFues() throws Exception {		
	
	}
	
	public void exportarVigenciaFuesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVigenciaFuesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVigenciaFuesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVigenciaFuesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vigencia Fue",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVigenciaFue(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVigenciaFue(vigenciafueAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vigenciafueAux.setsDetalleGeneralEntityReporte(vigenciafueAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVigenciaFue(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_FUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVigenciaFue(VigenciaFue vigenciafue,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vigenciafue.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getnumero_embarques().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getfue();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getfecha_ultimo_embarque().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getnumero_cajas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vigenciafue.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VigenciaFues");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVigenciaFue(row);				
				iRow++;
			}				
			
			for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVigenciaFue(vigenciafueAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVigenciaFuesSeleccionados() throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();		
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vigenciafue.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vigenciafues");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vigenciafue");
			//elementRoot.appendChild(element);
		
			for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
				element = document.createElement("vigenciafue");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVigenciaFue(vigenciafueAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vigencia Fue",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVigenciaFue(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FUE);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS);
		cell = row.createCell(iColumn++);cell.setCellValue(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVigenciaFue(VigenciaFue vigenciafue,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getnumero_embarques());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getfue());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getfecha_ultimo_embarque());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getnumero_cajas());
		cell = row.createCell(iColumn++);cell.setCellValue(vigenciafue.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlVigenciaFue(VigenciaFue vigenciafue,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VigenciaFueConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vigenciafue.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VigenciaFueConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vigenciafue.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(VigenciaFueConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(vigenciafue.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(VigenciaFueConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(vigenciafue.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementfecha_inicio = document.createElement(VigenciaFueConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(vigenciafue.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(VigenciaFueConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(vigenciafue.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnumero_embarques = document.createElement(VigenciaFueConstantesFunciones.NUMEROEMBARQUES);
		elementnumero_embarques.appendChild(document.createTextNode(vigenciafue.getnumero_embarques().toString().trim()));
		element.appendChild(elementnumero_embarques);

		Element elementfue = document.createElement(VigenciaFueConstantesFunciones.FUE);
		elementfue.appendChild(document.createTextNode(vigenciafue.getfue().trim()));
		element.appendChild(elementfue);

		Element elementfecha_ultimo_embarque = document.createElement(VigenciaFueConstantesFunciones.FECHAULTIMOEMBARQUE);
		elementfecha_ultimo_embarque.appendChild(document.createTextNode(vigenciafue.getfecha_ultimo_embarque().toString().trim()));
		element.appendChild(elementfecha_ultimo_embarque);

		Element elementvalor = document.createElement(VigenciaFueConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(vigenciafue.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_cajas = document.createElement(VigenciaFueConstantesFunciones.NUMEROCAJAS);
		elementnumero_cajas.appendChild(document.createTextNode(vigenciafue.getnumero_cajas().toString().trim()));
		element.appendChild(elementnumero_cajas);

		Element elementesta_activo = document.createElement(VigenciaFueConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(vigenciafue.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoVigenciaFuesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VigenciaFue> vigenciafuesSeleccionados=new ArrayList<VigenciaFue>();
		
		vigenciafuesSeleccionados=this.getVigenciaFuesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVigenciaFue(vigenciafuesSeleccionados);
		
		this.generarReporteVigenciaFues("Todos",vigenciafuesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVigenciaFue(ArrayList<VigenciaFue> vigenciafuesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VigenciaFue vigenciafueAux:vigenciafuesSeleccionados) {
				vigenciafueAux.setsDetalleGeneralEntityReporte(vigenciafueAux.toString());
			
				if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(vigenciafueAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(vigenciafueAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vigenciafueAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vigenciafueAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROEMBARQUES)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(vigenciafueAux.getnumero_embarques().toString());
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FUE)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(vigenciafueAux.getfue());
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_FECHAULTIMOEMBARQUE)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vigenciafueAux.getfecha_ultimo_embarque()));
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_NUMEROCAJAS)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(vigenciafueAux.getnumero_cajas().toString());
				}
				 else if(sTipoSeleccionar.equals(VigenciaFueConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					vigenciafueAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(vigenciafueAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VigenciaFueConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVigenciaFue(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVigenciaFue=true;
				this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=true;
				this.isVisibilidadCeldaGuardarCambiosVigenciaFue=true;
			}
			
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=true;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=true;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=true;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=true;
			this.isVisibilidadCeldaEliminarVigenciaFue=true;
			this.isVisibilidadCeldaCancelarVigenciaFue=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=true;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=true;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVigenciaFue=true;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=true;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=true;
			this.isVisibilidadCeldaModificarVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=true;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
			this.isVisibilidadCeldaModificarVigenciaFue=true;
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
			this.isVisibilidadCeldaCancelarVigenciaFue=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				} else {
					this.isVisibilidadCeldaGuardarVigenciaFue=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VigenciaFueJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVigenciaFue=true;
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=true;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=true;
		} else {
			this.actualizarEstadoPanelsVigenciaFue(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVigenciaFue=false;
			//this.isVisibilidadCeldaVerFormVigenciaFue=false;
			this.isVisibilidadCeldaDuplicarVigenciaFue=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vigenciafueSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
		} else {
			this.isVisibilidadCeldaNuevoVigenciaFue=false;
			this.isVisibilidadCeldaGuardarCambiosVigenciaFue=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vigenciafueSessionBean.getEsGuardarRelacionado()) {
			if(!vigenciafueSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;												
			}
			
			this.jButtonCerrarVigenciaFue.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVigenciaFue=false;
		}
		
		if(!this.permiteMantenimiento(this.vigenciafue)) {
			this.isVisibilidadCeldaActualizarVigenciaFue=false;
			this.isVisibilidadCeldaEliminarVigenciaFue=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVigenciaFue() {
	}
	
	public void actualizarEstadoPanelsVigenciaFue(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVigenciaFue!=null) {
				this.jScrollPanelDatosEdicionVigenciaFue.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVigenciaFue!=null) {
				this.jScrollPanelDatosVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelPaginacionVigenciaFue!=null) {
				this.jPanelPaginacionVigenciaFue.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
					this.jTabbedPaneBusquedasVigenciaFue.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vigenciafueSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVigenciaFue!=null) {
				this.jTabbedPaneBusquedasVigenciaFue.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVigenciaFue!=null) {
				this.jPanelParametrosReportesVigenciaFue.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasVigenciaFue.remove(jPanelFK_IdCiudadVigenciaFue);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasVigenciaFue.remove(jPanelFK_IdPaisVigenciaFue);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasVigenciaFue.remove(jPanelFK_IdCiudadVigenciaFue);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasVigenciaFue.remove(jPanelFK_IdPaisVigenciaFue);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VigenciaFueSessionBean vigenciafueSessionBean=new VigenciaFueSessionBean();
		
		if(this.vigenciafueSessionBean==null) {
			this.vigenciafueSessionBean=new VigenciaFueSessionBean();
		}
		
		this.vigenciafueSessionBean.setsUltimaBusquedaVigenciaFue(this.getsAccionBusqueda());
		this.vigenciafueSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vigenciafueSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			vigenciafueSessionBean.setid_ciudad(this.getid_ciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			vigenciafueSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VigenciaFueSessionBean vigenciafueSessionBean=new VigenciaFueSessionBean();
		
		if(this.vigenciafueSessionBean==null) {
			this.vigenciafueSessionBean=new VigenciaFueSessionBean();
		}
		
		if(this.vigenciafueSessionBean.getsUltimaBusquedaVigenciaFue()!=null&&!this.vigenciafueSessionBean.getsUltimaBusquedaVigenciaFue().equals("")) {
			this.setsAccionBusqueda(vigenciafueSessionBean.getsUltimaBusquedaVigenciaFue());
			this.setiNumeroPaginacion(vigenciafueSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vigenciafueSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setid_ciudadFK_IdCiudad(vigenciafueSessionBean.getid_ciudad());
				vigenciafueSessionBean.setid_ciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(vigenciafueSessionBean.getid_pais());
				vigenciafueSessionBean.setid_pais(-1L);
			}
		}
		
		this.vigenciafueSessionBean.setsUltimaBusquedaVigenciaFue("");
		this.vigenciafueSessionBean.setiNumeroPaginacion(VigenciaFueConstantesFunciones.INUMEROPAGINACION);
		this.vigenciafueSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVigenciaFue(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVigenciaFue() {
		this.updateBorderResaltarBusquedasFormularioVigenciaFue();
		this.updateVisibilidadBusquedasFormularioVigenciaFue();
		this.updateHabilitarBusquedasFormularioVigenciaFue();
	}
	
	public void updateBorderResaltarBusquedasFormularioVigenciaFue() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVigenciaFue.getComponents().length>0) {
	

		if(this.vigenciafueConstantesFunciones.resaltarFK_IdCiudadVigenciaFue!=null) {
			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdCiudadVigenciaFue);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
				jPanel.setBorder(this.vigenciafueConstantesFunciones.resaltarFK_IdCiudadVigenciaFue);
			}
		}

		if(this.vigenciafueConstantesFunciones.resaltarFK_IdPaisVigenciaFue!=null) {
			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdPaisVigenciaFue);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
				jPanel.setBorder(this.vigenciafueConstantesFunciones.resaltarFK_IdPaisVigenciaFue);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVigenciaFue() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVigenciaFue.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdCiudadVigenciaFue);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vigenciafueConstantesFunciones.mostrarFK_IdCiudadVigenciaFue);
			if(!this.vigenciafueConstantesFunciones.mostrarFK_IdCiudadVigenciaFue && index>-1) {
				this.jTabbedPaneBusquedasVigenciaFue.remove(index);
			}

			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdPaisVigenciaFue);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vigenciafueConstantesFunciones.mostrarFK_IdPaisVigenciaFue);
			if(!this.vigenciafueConstantesFunciones.mostrarFK_IdPaisVigenciaFue && index>-1) {
				this.jTabbedPaneBusquedasVigenciaFue.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVigenciaFue() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVigenciaFue.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdCiudadVigenciaFue);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vigenciafueConstantesFunciones.activarFK_IdCiudadVigenciaFue);
				this.jTabbedPaneBusquedasVigenciaFue.setEnabledAt(index,this.vigenciafueConstantesFunciones.activarFK_IdCiudadVigenciaFue);
			}

			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdPaisVigenciaFue);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vigenciafueConstantesFunciones.activarFK_IdPaisVigenciaFue);
				this.jTabbedPaneBusquedasVigenciaFue.setEnabledAt(index,this.vigenciafueConstantesFunciones.activarFK_IdPaisVigenciaFue);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVigenciaFue(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdCiudadVigenciaFue);

			this.jTabbedPaneBusquedasVigenciaFue.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);

			this.vigenciafueConstantesFunciones.setResaltarFK_IdCiudadVigenciaFue(resaltar);

			jPanel.setBorder(this.vigenciafueConstantesFunciones.resaltarFK_IdCiudadVigenciaFue);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasVigenciaFue.indexOfComponent(this.jPanelFK_IdPaisVigenciaFue);

			this.jTabbedPaneBusquedasVigenciaFue.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVigenciaFue.getComponent(index);

			this.vigenciafueConstantesFunciones.setResaltarFK_IdPaisVigenciaFue(resaltar);

			jPanel.setBorder(this.vigenciafueConstantesFunciones.resaltarFK_IdPaisVigenciaFue);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVigenciaFue.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVigenciaFue() throws Exception {

		if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVigenciaFue();
		this.updateVisibilidadResaltarControlesFormularioVigenciaFue();
		this.updateHabilitarResaltarControlesFormularioVigenciaFue();
		
	}
	
	public void updateBorderResaltarControlesFormularioVigenciaFue() throws Exception {
		if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vigenciafueConstantesFunciones.resaltaridVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltaridVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarid_paisVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarid_paisVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarid_ciudadVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarid_ciudadVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarfecha_inicioVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarfecha_inicioVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarfecha_finVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarfecha_finVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarnumero_embarquesVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarnumero_embarquesVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarfueVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarfueVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarfecha_ultimo_embarqueVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarfecha_ultimo_embarqueVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarvalorVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarvalorVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltarnumero_cajasVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltarnumero_cajasVigenciaFue);}
		if(this.vigenciafueConstantesFunciones.resaltaresta_activoVigenciaFue!=null && this.jInternalFrameDetalleFormVigenciaFue!=null) {this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setBorderPainted(true);this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setBorder(this.vigenciafueConstantesFunciones.resaltaresta_activoVigenciaFue);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVigenciaFue() throws Exception {		
		if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
	
		//this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostraridVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelidVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostraridVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarid_paisVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelid_paisVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarid_paisVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarid_ciudadVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelid_ciudadVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarid_ciudadVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_inicioVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelfecha_inicioVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_inicioVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_finVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelfecha_finVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_finVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarnumero_embarquesVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelnumero_embarquesVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarnumero_embarquesVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelfueVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfueVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_ultimo_embarqueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelfecha_ultimo_embarqueVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarfecha_ultimo_embarqueVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarvalorVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelvalorVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarvalorVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarnumero_cajasVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelnumero_cajasVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostrarnumero_cajasVigenciaFue);
		//this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostraresta_activoVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jPanelesta_activoVigenciaFue.setVisible(this.vigenciafueConstantesFunciones.mostraresta_activoVigenciaFue);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVigenciaFue() throws Exception {
		if(this.jInternalFrameDetalleFormVigenciaFue==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVigenciaFue!=null) {
	
		this.jInternalFrameDetalleFormVigenciaFue.jLabelidVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activaridVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_paisVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarid_paisVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jComboBoxid_ciudadVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarid_ciudadVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_inicioVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarfecha_inicioVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_finVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarfecha_finVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_embarquesVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarnumero_embarquesVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldfueVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarfueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jDateChooserfecha_ultimo_embarqueVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarfecha_ultimo_embarqueVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldvalorVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarvalorVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jTextFieldnumero_cajasVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activarnumero_cajasVigenciaFue);
		this.jInternalFrameDetalleFormVigenciaFue.jCheckBoxesta_activoVigenciaFue.setEnabled(this.vigenciafueConstantesFunciones.activaresta_activoVigenciaFue);
		}
	}
	
		
}