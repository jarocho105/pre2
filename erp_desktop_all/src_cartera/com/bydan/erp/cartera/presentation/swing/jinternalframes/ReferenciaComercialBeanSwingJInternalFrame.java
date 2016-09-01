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

import com.bydan.erp.cartera.util.ReferenciaComercialConstantesFunciones;
import com.bydan.erp.cartera.util.ReferenciaComercialParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ReferenciaComercialParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ReferenciaComercialBean;
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
public class ReferenciaComercialBeanSwingJInternalFrame extends ReferenciaComercialJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ReferenciaComercialBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ReferenciaComercial> referenciacomercialValidator = new ClassValidator<ReferenciaComercial>(ReferenciaComercial.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ReferenciaComercial referenciacomercial;	
	public ReferenciaComercial referenciacomercialAux;
	public ReferenciaComercial referenciacomercialAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ReferenciaComercial referenciacomercialTotales;
	public Long idReferenciaComercialActual;
	public Long iIdNuevoReferenciaComercial=0L;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoSectorEcono="";

	public List<TipoSectorEcono> tiposectoreconosForeignKey;

	public List<TipoSectorEcono> gettiposectoreconosForeignKey() {
		return tiposectoreconosForeignKey;
	}

	public void settiposectoreconosForeignKey(List<TipoSectorEcono> tiposectoreconosForeignKey) {
		this.tiposectoreconosForeignKey = tiposectoreconosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoSectorEcono tiposectoreconoForeignKey;

	public TipoSectorEcono gettiposectoreconoForeignKey() {
		return tiposectoreconoForeignKey;
	}

	public void settiposectoreconoForeignKey(TipoSectorEcono tiposectoreconoForeignKey) {
		this.tiposectoreconoForeignKey = tiposectoreconoForeignKey;
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

	public String sFinalQueryComboTipoValoracion="";

	public List<TipoValoracion> tipovaloracionsForeignKey;

	public List<TipoValoracion> gettipovaloracionsForeignKey() {
		return tipovaloracionsForeignKey;
	}

	public void settipovaloracionsForeignKey(List<TipoValoracion> tipovaloracionsForeignKey) {
		this.tipovaloracionsForeignKey = tipovaloracionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoValoracion tipovaloracionForeignKey;

	public TipoValoracion gettipovaloracionForeignKey() {
		return tipovaloracionForeignKey;
	}

	public void settipovaloracionForeignKey(TipoValoracion tipovaloracionForeignKey) {
		this.tipovaloracionForeignKey = tipovaloracionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoReferenciaComercial;
	public Boolean isPermisoNuevoReferenciaComercial;
	public Boolean isPermisoActualizarReferenciaComercial;
	public Boolean isPermisoActualizarOriginalReferenciaComercial;
	public Boolean isPermisoEliminarReferenciaComercial;
	public Boolean isPermisoGuardarCambiosReferenciaComercial;
	public Boolean isPermisoConsultaReferenciaComercial;
	public Boolean isPermisoBusquedaReferenciaComercial;
	public Boolean isPermisoReporteReferenciaComercial;
	public Boolean isPermisoPaginacionMedioReferenciaComercial;
	public Boolean isPermisoPaginacionAltoReferenciaComercial;
	public Boolean isPermisoPaginacionTodoReferenciaComercial;
	public Boolean isPermisoCopiarReferenciaComercial;
	public Boolean isPermisoVerFormReferenciaComercial;
	public Boolean isPermisoDuplicarReferenciaComercial;
	public Boolean isPermisoOrdenReferenciaComercial;
	
	
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
	
	public ReferenciaComercialParameterReturnGeneral referenciacomercialReturnGeneral;
	public ReferenciaComercialParameterReturnGeneral referenciacomercialParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoReferenciaComercial=false;
	public Boolean esParaAccionDesdeFormularioReferenciaComercial=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ReferenciaComercialSessionBeanAdditional referenciacomercialSessionBeanAdditional=null;
	
	public ReferenciaComercialSessionBeanAdditional getReferenciaComercialSessionBeanAdditional() {
		return this.referenciacomercialSessionBeanAdditional;
	}
	
	public void setReferenciaComercialSessionBeanAdditional(ReferenciaComercialSessionBeanAdditional referenciacomercialSessionBeanAdditional) {
		try {
			this.referenciacomercialSessionBeanAdditional=referenciacomercialSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ReferenciaComercialBeanSwingJInternalFrameAdditional referenciacomercialBeanSwingJInternalFrameAdditional=null;
	//public class ReferenciaComercialBeanSwingJInternalFrame
	
	public ReferenciaComercialBeanSwingJInternalFrameAdditional getReferenciaComercialBeanSwingJInternalFrameAdditional() {
		return this.referenciacomercialBeanSwingJInternalFrameAdditional;
	}
	
	public void setReferenciaComercialBeanSwingJInternalFrameAdditional(ReferenciaComercialBeanSwingJInternalFrameAdditional referenciacomercialBeanSwingJInternalFrameAdditional) {
		try {
			this.referenciacomercialBeanSwingJInternalFrameAdditional=referenciacomercialBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ReferenciaComercialLogic referenciacomercialLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ReferenciaComercial referenciacomercialBean;
	public ReferenciaComercialConstantesFunciones referenciacomercialConstantesFunciones;
	//public ReferenciaComercialParameterReturnGeneral referenciacomercialReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ClienteLogic clienteLogic;
	public TipoSectorEconoLogic tiposectoreconoLogic;
	public PaisLogic paisLogic;
	public CiudadLogic ciudadLogic;
	public TipoValoracionLogic tipovaloracionLogic;
	
	//PARAMETROS
	
	
	//public List<ReferenciaComercial> referenciacomercials;	
	//public List<ReferenciaComercial> referenciacomercialsEliminados;
	//public List<ReferenciaComercial> referenciacomercialsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoReferenciaComercial=false;
	public Boolean isVisibilidadCeldaDuplicarReferenciaComercial=true;
	public Boolean isVisibilidadCeldaCopiarReferenciaComercial=true;
	public Boolean isVisibilidadCeldaVerFormReferenciaComercial=true;
	public Boolean isVisibilidadCeldaOrdenReferenciaComercial=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
	public Boolean isVisibilidadCeldaModificarReferenciaComercial=false;
	public Boolean isVisibilidadCeldaActualizarReferenciaComercial=false;
	public Boolean isVisibilidadCeldaEliminarReferenciaComercial=false;
	public Boolean isVisibilidadCeldaCancelarReferenciaComercial=false;
	public Boolean isVisibilidadCeldaGuardarReferenciaComercial=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;	
	
	
	public Boolean isVisibilidadFK_IdCiudad=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdPais=false;
	public Boolean isVisibilidadFK_IdTipoValoracion=false;
	public Boolean isVisibilidadFK_IdValorClienteSectorEconomico=false;
	
	public Long getiIdNuevoReferenciaComercial() {
		return this.iIdNuevoReferenciaComercial;
	}

	public void setiIdNuevoReferenciaComercial(Long iIdNuevoReferenciaComercial) {
		this.iIdNuevoReferenciaComercial = iIdNuevoReferenciaComercial;
	}
	
	public Long getidReferenciaComercialActual() {
		return this.idReferenciaComercialActual;
	}

	public void setidReferenciaComercialActual(Long idReferenciaComercialActual) {
		this.idReferenciaComercialActual = idReferenciaComercialActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ReferenciaComercial getreferenciacomercial() {
		return this.referenciacomercial;
	}

	public void setreferenciacomercial(ReferenciaComercial referenciacomercial) {
		this.referenciacomercial = referenciacomercial;
	}
	
	public ReferenciaComercial getreferenciacomercialAux() {
		return this.referenciacomercialAux;
	}

	public void setreferenciacomercialAux(ReferenciaComercial referenciacomercialAux) {
		this.referenciacomercialAux = referenciacomercialAux;
	}				
	
	public ReferenciaComercial getreferenciacomercialAnterior() {
		return this.referenciacomercialAnterior;
	}

	public void setreferenciacomercialAnterior(ReferenciaComercial referenciacomercialAnterior) {
		this.referenciacomercialAnterior = referenciacomercialAnterior;
	}	
	
	public ReferenciaComercial getreferenciacomercialTotales() {
		return this.referenciacomercialTotales;
	}

	public void setreferenciacomercialTotales(ReferenciaComercial referenciacomercialTotales) {
		this.referenciacomercialTotales = referenciacomercialTotales;
	}	
	
	public ReferenciaComercial getreferenciacomercialBean() {
		return this.referenciacomercialBean;
	}

	public void setreferenciacomercialBean(ReferenciaComercial referenciacomercialBean) {
		this.referenciacomercialBean = referenciacomercialBean;
	}	
	
	public ReferenciaComercialParameterReturnGeneral getreferenciacomercialReturnGeneral() {
		return this.referenciacomercialReturnGeneral;
	}

	public void setreferenciacomercialReturnGeneral(ReferenciaComercialParameterReturnGeneral referenciacomercialReturnGeneral) {
		this.referenciacomercialReturnGeneral = referenciacomercialReturnGeneral;
	}	
	
	
	public Long idciudadFK_IdCiudad=-1L;

	public Long getidciudadFK_IdCiudad() {
		return this.idciudadFK_IdCiudad;
	}

	public void setidciudadFK_IdCiudad(Long idciudadFK_IdCiudad) {
		this.idciudadFK_IdCiudad = idciudadFK_IdCiudad;
	}

	public Long idclienteFK_IdCliente=-1L;

	public Long getidclienteFK_IdCliente() {
		return this.idclienteFK_IdCliente;
	}

	public void setidclienteFK_IdCliente(Long idclienteFK_IdCliente) {
		this.idclienteFK_IdCliente = idclienteFK_IdCliente;
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

	public Long id_tipo_valoracionFK_IdTipoValoracion=-1L;

	public Long getid_tipo_valoracionFK_IdTipoValoracion() {
		return this.id_tipo_valoracionFK_IdTipoValoracion;
	}

	public void setid_tipo_valoracionFK_IdTipoValoracion(Long id_tipo_valoracionFK_IdTipoValoracion) {
		this.id_tipo_valoracionFK_IdTipoValoracion = id_tipo_valoracionFK_IdTipoValoracion;
	}

	public Long idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico=-1L;

	public Long getidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico() {
		return this.idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico;
	}

	public void setidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico(Long idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico) {
		this.idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico = idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ReferenciaComercialLogic getReferenciaComercialLogic()	{		
		return referenciacomercialLogic;
	}

	public void setReferenciaComercialLogic(ReferenciaComercialLogic referenciacomercialLogic) {
		this.referenciacomercialLogic = referenciacomercialLogic;
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
	
	public Boolean getIsEsNuevoReferenciaComercial() {
		return isEsNuevoReferenciaComercial;
	}

	public void setIsEsNuevoReferenciaComercial(Boolean isEsNuevoReferenciaComercial) {
		this.isEsNuevoReferenciaComercial = isEsNuevoReferenciaComercial;
	}

	public Boolean getEsParaAccionDesdeFormularioReferenciaComercial() {
		return esParaAccionDesdeFormularioReferenciaComercial;
	}
	
	public void setEsParaAccionDesdeFormularioReferenciaComercial(Boolean esParaAccionDesdeFormularioReferenciaComercial) {
		this.esParaAccionDesdeFormularioReferenciaComercial = esParaAccionDesdeFormularioReferenciaComercial;
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

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidEmpresaActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoSectorEconosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tiposectoreconosForeignKey=new ArrayList<TipoSectorEcono>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoSectorEconoLogic tiposectoreconoLogic=new TipoSectorEconoLogic();

			//tiposectoreconoLogic.getTipoSectorEconoDataAccess().setIsForForeingKeyData(true);

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoSectorEcono()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tiposectoreconoLogic.getTipoSectorEconoDataAccess().setIsForForeingKeyData(true);

					tiposectoreconoLogic.getTodosTipoSectorEconosWithConnection(sFinalQuery,new Pagination());

					this.tiposectoreconosForeignKey=tiposectoreconoLogic.getTipoSectorEconos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoSectorEcono(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposectoreconoLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidTipoSectorEconoActual());
					this.tiposectoreconosForeignKey.add(tiposectoreconoLogic.getTipoSectorEcono());
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

			//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

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
					paisLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidPaisActual());
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

			//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ciudadLogic.getCiudadDataAccess().setIsForForeingKeyData(true);

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
					ciudadLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidCiudadActual());
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

	public void cargarCombosTipoValoracionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoValoracionLogic tipovaloracionLogic=new TipoValoracionLogic();

			//tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipovaloracionLogic.getTipoValoracionDataAccess().setIsForForeingKeyData(true);

					tipovaloracionLogic.getTodosTipoValoracionsWithConnection(sFinalQuery,new Pagination());

					this.tipovaloracionsForeignKey=tipovaloracionLogic.getTipoValoracions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoValoracion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovaloracionLogic.getEntityWithConnection(referenciacomercialSessionBean.getlidTipoValoracionActual());
					this.tipovaloracionsForeignKey.add(tipovaloracionLogic.getTipoValoracion());
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

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaReferenciaComercial.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaReferenciaComercialGenerico)throws Exception
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
				jComboBoxid_empresaReferenciaComercialGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaReferenciaComercialGenerico!=null && jComboBoxid_empresaReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxid_empresaReferenciaComercialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxidclienteReferenciaComercial.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxidclienteFK_IdClienteReferenciaComercial!=null) {
						jComboBoxidclienteFK_IdClienteReferenciaComercial.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxidclienteFK_IdClienteReferenciaComercial!=null) {
							//jComboBoxidclienteFK_IdClienteReferenciaComercial.setSelectedItem(clienteTemp);
							if(jComboBoxidclienteFK_IdClienteReferenciaComercial.getItemCount()>0) {
								jComboBoxidclienteFK_IdClienteReferenciaComercial.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxidclienteReferenciaComercialGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxidclienteReferenciaComercialGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxidclienteReferenciaComercialGenerico!=null && jComboBoxidclienteReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxidclienteReferenciaComercialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoSectorEconoForeignKey(Long idTipoSectorEconoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoSectorEcono  tiposectoreconoTemp=null;

			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosForeignKey) {
				if(tiposectoreconoAux.getId()!=null && tiposectoreconoAux.getId().equals(idTipoSectorEconoSeleccionado)) {
					tiposectoreconoTemp=tiposectoreconoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tiposectoreconoTemp!=null) {

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setTipoSectorEcono(tiposectoreconoTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedItem(tiposectoreconoTemp);
					}
				} else {
					//jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedItem(tiposectoreconoTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorClienteSectorEconomico") || sFormularioTipoBusqueda.equals("Todos")){
					if(tiposectoreconoTemp!=null && jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial!=null) {
						jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setSelectedItem(tiposectoreconoTemp);
					} else {
						if(jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial!=null) {
							//jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setSelectedItem(tiposectoreconoTemp);
							if(jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.getItemCount()>0) {
								jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setSelectedIndex(0);
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

	public String getActualTipoSectorEconoForeignKeyDescripcion(Long idTipoSectorEconoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoSectorEcono  tiposectoreconoTemp=null;

			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosForeignKey) {
				if(tiposectoreconoAux.getId()!=null && tiposectoreconoAux.getId().equals(idTipoSectorEconoSeleccionado)) {
					tiposectoreconoTemp=tiposectoreconoAux;
					break;
				}
			}


			sDescripcion=TipoSectorEconoConstantesFunciones.getTipoSectorEconoDescripcion(tiposectoreconoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoSectorEconoForeignKeyGenerico(Long idTipoSectorEconoSeleccionado,JComboBox jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico)throws Exception
	{
		try
		{
			TipoSectorEcono  tiposectoreconoTemp=null;

			for(TipoSectorEcono tiposectoreconoAux:tiposectoreconosForeignKey) {
				if(tiposectoreconoAux.getId()!=null && tiposectoreconoAux.getId().equals(idTipoSectorEconoSeleccionado)) {
					tiposectoreconoTemp=tiposectoreconoAux;
					break;
				}
			}

			if(tiposectoreconoTemp!=null) {
				jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico.setSelectedItem(tiposectoreconoTemp);
			} else {
				if(jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico!=null && jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico.setSelectedIndex(0);
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

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisReferenciaComercial.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisReferenciaComercial!=null) {
						jComboBoxid_paisFK_IdPaisReferenciaComercial.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisReferenciaComercial!=null) {
							//jComboBoxid_paisFK_IdPaisReferenciaComercial.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisReferenciaComercial.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisReferenciaComercial.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisReferenciaComercialGenerico)throws Exception
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
				jComboBoxid_paisReferenciaComercialGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisReferenciaComercialGenerico!=null && jComboBoxid_paisReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxid_paisReferenciaComercialGenerico.setSelectedIndex(0);
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

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setCiudad(ciudadTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setSelectedItem(ciudadTemp);
					}
				} else {
					//jComboBoxidciudadReferenciaComercial.setSelectedItem(ciudadTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){
					if(ciudadTemp!=null && jComboBoxidciudadFK_IdCiudadReferenciaComercial!=null) {
						jComboBoxidciudadFK_IdCiudadReferenciaComercial.setSelectedItem(ciudadTemp);
					} else {
						if(jComboBoxidciudadFK_IdCiudadReferenciaComercial!=null) {
							//jComboBoxidciudadFK_IdCiudadReferenciaComercial.setSelectedItem(ciudadTemp);
							if(jComboBoxidciudadFK_IdCiudadReferenciaComercial.getItemCount()>0) {
								jComboBoxidciudadFK_IdCiudadReferenciaComercial.setSelectedIndex(0);
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
	public void setActualCiudadForeignKeyGenerico(Long idCiudadSeleccionado,JComboBox jComboBoxidciudadReferenciaComercialGenerico)throws Exception
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
				jComboBoxidciudadReferenciaComercialGenerico.setSelectedItem(ciudadTemp);
			} else {
				if(jComboBoxidciudadReferenciaComercialGenerico!=null && jComboBoxidciudadReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxidciudadReferenciaComercialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoValoracionForeignKey(Long idTipoValoracionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovaloracionTemp!=null) {

					if(this.referenciacomercial!=null) {
						this.referenciacomercial.setTipoValoracion(tipovaloracionTemp);
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedItem(tipovaloracionTemp);
					}
				} else {
					//jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedItem(tipovaloracionTemp);
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.getItemCount()>0) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovaloracionTemp!=null && jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial!=null) {
						jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setSelectedItem(tipovaloracionTemp);
					} else {
						if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial!=null) {
							//jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setSelectedItem(tipovaloracionTemp);
							if(jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.getItemCount()>0) {
								jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setSelectedIndex(0);
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

	public String getActualTipoValoracionForeignKeyDescripcion(Long idTipoValoracionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}


			sDescripcion=TipoValoracionConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoValoracionForeignKeyGenerico(Long idTipoValoracionSeleccionado,JComboBox jComboBoxid_tipo_valoracionReferenciaComercialGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionTemp=null;

			for(TipoValoracion tipovaloracionAux:tipovaloracionsForeignKey) {
				if(tipovaloracionAux.getId()!=null && tipovaloracionAux.getId().equals(idTipoValoracionSeleccionado)) {
					tipovaloracionTemp=tipovaloracionAux;
					break;
				}
			}

			if(tipovaloracionTemp!=null) {
				jComboBoxid_tipo_valoracionReferenciaComercialGenerico.setSelectedItem(tipovaloracionTemp);
			} else {
				if(jComboBoxid_tipo_valoracionReferenciaComercialGenerico!=null && jComboBoxid_tipo_valoracionReferenciaComercialGenerico.getItemCount()>0) {
					jComboBoxid_tipo_valoracionReferenciaComercialGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxid_empresaReferenciaComercialGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaReferenciaComercialGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaReferenciaComercialGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				referenciacomercial.setid_empresa(empresaAux.getId());
				referenciacomercial.setempresa_descripcion(ReferenciaComercialConstantesFunciones.getEmpresaDescripcion(empresaAux));
				referenciacomercial.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxidclienteReferenciaComercialGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxidclienteReferenciaComercialGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxidclienteReferenciaComercialGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				referenciacomercial.setidcliente(clienteAux.getId());
				referenciacomercial.setcliente_descripcion(ReferenciaComercialConstantesFunciones.getClienteDescripcion(clienteAux));
				referenciacomercial.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoSectorEconoForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico)throws Exception
	{
		try
		{
			TipoSectorEcono  tiposectoreconoAux=new TipoSectorEcono();

			if(jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico==null) {
				tiposectoreconoAux=(TipoSectorEcono)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getSelectedItem();
			} else {
				tiposectoreconoAux=(TipoSectorEcono)jComboBoxidvalorclientesectoreconomicoReferenciaComercialGenerico.getSelectedItem();
			}

			if(tiposectoreconoAux!=null && tiposectoreconoAux.getId()!=null) {
				referenciacomercial.setidvalorclientesectoreconomico(tiposectoreconoAux.getId());
				referenciacomercial.settiposectorecono_descripcion(ReferenciaComercialConstantesFunciones.getTipoSectorEconoDescripcion(tiposectoreconoAux));
				referenciacomercial.setTipoSectorEcono(tiposectoreconoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxid_paisReferenciaComercialGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisReferenciaComercialGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisReferenciaComercialGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				referenciacomercial.setid_pais(paisAux.getId());
				referenciacomercial.setpais_descripcion(ReferenciaComercialConstantesFunciones.getPaisDescripcion(paisAux));
				referenciacomercial.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCiudadForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxidciudadReferenciaComercialGenerico)throws Exception
	{
		try
		{
			Ciudad  ciudadAux=new Ciudad();

			if(jComboBoxidciudadReferenciaComercialGenerico==null) {
				ciudadAux=(Ciudad)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.getSelectedItem();
			} else {
				ciudadAux=(Ciudad)jComboBoxidciudadReferenciaComercialGenerico.getSelectedItem();
			}

			if(ciudadAux!=null && ciudadAux.getId()!=null) {
				referenciacomercial.setidciudad(ciudadAux.getId());
				referenciacomercial.setciudad_descripcion(ReferenciaComercialConstantesFunciones.getCiudadDescripcion(ciudadAux));
				referenciacomercial.setCiudad(ciudadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoValoracionForeignKey(ReferenciaComercial referenciacomercial,JComboBox jComboBoxid_tipo_valoracionReferenciaComercialGenerico)throws Exception
	{
		try
		{
			TipoValoracion  tipovaloracionAux=new TipoValoracion();

			if(jComboBoxid_tipo_valoracionReferenciaComercialGenerico==null) {
				tipovaloracionAux=(TipoValoracion)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.getSelectedItem();
			} else {
				tipovaloracionAux=(TipoValoracion)jComboBoxid_tipo_valoracionReferenciaComercialGenerico.getSelectedItem();
			}

			if(tipovaloracionAux!=null && tipovaloracionAux.getId()!=null) {
				referenciacomercial.setid_tipo_valoracion(tipovaloracionAux.getId());
				referenciacomercial.settipovaloracion_descripcion(ReferenciaComercialConstantesFunciones.getTipoValoracionDescripcion(tipovaloracionAux));
				referenciacomercial.setTipoValoracion(tipovaloracionAux);			}
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

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaComercial.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxidclienteFK_IdClienteReferenciaComercial.addItem(cliente);
							}
						}

						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoSectorEconosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoSectorEcono=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.removeAllItems();

							for(TipoSectorEcono tiposectorecono:this.tiposectoreconosForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.addItem(tiposectorecono);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorClienteSectorEconomico") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.removeAllItems();

							for(TipoSectorEcono tiposectorecono:this.tiposectoreconosForeignKey) {
								this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.addItem(tiposectorecono);
							}
						}

						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisReferenciaComercial.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisReferenciaComercial.addItem(pais);
							}
						}

						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.addItem(ciudad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCiudad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.removeAllItems();

							for(Ciudad ciudad:this.ciudadsForeignKey) {
								this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.addItem(ciudad);
							}
						}

						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoValoracionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoValoracion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.addItem(tipovaloracion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { 
					}

					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoValoracion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.removeAllItems();

							for(TipoValoracion tipovaloracion:this.tipovaloracionsForeignKey) {
								this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.addItem(tipovaloracion);
							}
						}

						if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidclienteFK_IdClienteReferenciaComercial.setSelectedItem(cliente);
						} else {
							this.jComboBoxidclienteFK_IdClienteReferenciaComercial.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoSectorEconoForeignKey(TipoSectorEcono tiposectorecono,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedItem(tiposectorecono);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setSelectedItem(tiposectorecono);
						} else {
							this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisReferenciaComercial.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisReferenciaComercial.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setSelectedItem(ciudad);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.setSelectedItem(ciudad);
						} else {
							this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoValoracionForeignKey(TipoValoracion tipovaloracion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedItem(tipovaloracion);
						}
					} else {
						if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setSelectedItem(tipovaloracion);
						} else {
							this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesReferenciaComercial() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ReferenciaComercialConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaComercial(this.referenciacomercialLogic.getReferenciaComercials());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ReferenciaComercialConstantesFunciones.refrescarForeignKeysDescripcionesReferenciaComercial(this.referenciacomercials);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoSectorEcono.class));
		classes.add(new Classe(Pais.class));
		classes.add(new Classe(Ciudad.class));
		classes.add(new Classe(TipoValoracion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//referenciacomercialLogic.setReferenciaComercials(this.referenciacomercials);
			referenciacomercialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ReferenciaComercialParameterReturnGeneral getReferenciaComercialParameterGeneral() {
		return this.referenciacomercialParameterGeneral;
	}
	
	public void setReferenciaComercialParameterGeneral(ReferenciaComercialParameterReturnGeneral referenciacomercialParameterGeneral) {
		this.referenciacomercialParameterGeneral = referenciacomercialParameterGeneral;
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
	
	public Boolean getIsPermisoTodoReferenciaComercial() {
		return isPermisoTodoReferenciaComercial;
	}

	public void setIsPermisoTodoReferenciaComercial(Boolean isPermisoTodoReferenciaComercial) {
		this.isPermisoTodoReferenciaComercial = isPermisoTodoReferenciaComercial;
	}

	public Boolean getIsPermisoNuevoReferenciaComercial() {
		return isPermisoNuevoReferenciaComercial;
	}

	public void setIsPermisoNuevoReferenciaComercial(Boolean isPermisoNuevoReferenciaComercial) {
		this.isPermisoNuevoReferenciaComercial = isPermisoNuevoReferenciaComercial;
	}

	public Boolean getIsPermisoActualizarReferenciaComercial() {
		return isPermisoActualizarReferenciaComercial;
	}

	public void setIsPermisoActualizarReferenciaComercial(Boolean isPermisoActualizarReferenciaComercial) {
		this.isPermisoActualizarReferenciaComercial = isPermisoActualizarReferenciaComercial;
	}

	public Boolean getIsPermisoEliminarReferenciaComercial() {
		return isPermisoEliminarReferenciaComercial;
	}

	public void setIsPermisoEliminarReferenciaComercial(Boolean isPermisoEliminarReferenciaComercial) {
		this.isPermisoEliminarReferenciaComercial = isPermisoEliminarReferenciaComercial;
	}

	public Boolean getIsPermisoGuardarCambiosReferenciaComercial() {
		return isPermisoGuardarCambiosReferenciaComercial;
	}

	public void setIsPermisoGuardarCambiosReferenciaComercial(Boolean isPermisoGuardarCambiosReferenciaComercial) {
		this.isPermisoGuardarCambiosReferenciaComercial = isPermisoGuardarCambiosReferenciaComercial;
	}
	
	public Boolean getIsPermisoConsultaReferenciaComercial() {
		return isPermisoConsultaReferenciaComercial;
	}

	public void setIsPermisoConsultaReferenciaComercial(Boolean isPermisoConsultaReferenciaComercial) {
		this.isPermisoConsultaReferenciaComercial = isPermisoConsultaReferenciaComercial;
	}

	public Boolean getIsPermisoBusquedaReferenciaComercial() {
		return isPermisoBusquedaReferenciaComercial;
	}

	public void setIsPermisoBusquedaReferenciaComercial(Boolean isPermisoBusquedaReferenciaComercial) {
		this.isPermisoBusquedaReferenciaComercial = isPermisoBusquedaReferenciaComercial;
	}

	public Boolean getIsPermisoReporteReferenciaComercial() {
		return isPermisoReporteReferenciaComercial;
	}

	public void setIsPermisoReporteReferenciaComercial(Boolean isPermisoReporteReferenciaComercial) {
		this.isPermisoReporteReferenciaComercial = isPermisoReporteReferenciaComercial;
	}
	
	public Boolean getIsPermisoPaginacionMedioReferenciaComercial() {
		return isPermisoPaginacionMedioReferenciaComercial;
	}

	public void setIsPermisoPaginacionMedioReferenciaComercial(Boolean isPermisoPaginacionMedioReferenciaComercial) {
		this.isPermisoPaginacionMedioReferenciaComercial = isPermisoPaginacionMedioReferenciaComercial;
	}
	
	public Boolean getIsPermisoPaginacionTodoReferenciaComercial() {
		return isPermisoPaginacionTodoReferenciaComercial;
	}

	public void setIsPermisoPaginacionTodoReferenciaComercial(Boolean isPermisoPaginacionTodoReferenciaComercial) {
		this.isPermisoPaginacionTodoReferenciaComercial = isPermisoPaginacionTodoReferenciaComercial;
	}
	
	public Boolean getIsPermisoPaginacionAltoReferenciaComercial() {
		return isPermisoPaginacionAltoReferenciaComercial;
	}

	public void setIsPermisoPaginacionAltoReferenciaComercial(Boolean isPermisoPaginacionAltoReferenciaComercial) {
		this.isPermisoPaginacionAltoReferenciaComercial = isPermisoPaginacionAltoReferenciaComercial;
	}
	
	public Boolean getIsPermisoCopiarReferenciaComercial() {
		return isPermisoCopiarReferenciaComercial;
	}

	public void setIsPermisoCopiarReferenciaComercial(Boolean isPermisoCopiarReferenciaComercial) {
		this.isPermisoCopiarReferenciaComercial = isPermisoCopiarReferenciaComercial;
	}
	
	public Boolean getIsPermisoVerFormReferenciaComercial() {
		return isPermisoVerFormReferenciaComercial;
	}

	public void setIsPermisoVerFormReferenciaComercial(Boolean isPermisoVerFormReferenciaComercial) {
		this.isPermisoVerFormReferenciaComercial = isPermisoVerFormReferenciaComercial;
	}
	
	public Boolean getIsPermisoDuplicarReferenciaComercial() {
		return isPermisoDuplicarReferenciaComercial;
	}

	public void setIsPermisoDuplicarReferenciaComercial(Boolean isPermisoDuplicarReferenciaComercial) {
		this.isPermisoDuplicarReferenciaComercial = isPermisoDuplicarReferenciaComercial;
	}
	
	public Boolean getIsPermisoOrdenReferenciaComercial() {
		return isPermisoOrdenReferenciaComercial;
	}

	public void setIsPermisoOrdenReferenciaComercial(Boolean isPermisoOrdenReferenciaComercial) {
		this.isPermisoOrdenReferenciaComercial = isPermisoOrdenReferenciaComercial;
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
	
	public Boolean getIsVisibilidadCeldaNuevoReferenciaComercial() {
		return isVisibilidadCeldaNuevoReferenciaComercial;
	}

	public void setIsVisibilidadCeldaNuevoReferenciaComercial(Boolean isVisibilidadCeldaNuevoReferenciaComercial) {
		this.isVisibilidadCeldaNuevoReferenciaComercial = isVisibilidadCeldaNuevoReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarReferenciaComercial() {
		return isVisibilidadCeldaDuplicarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaDuplicarReferenciaComercial(Boolean isVisibilidadCeldaDuplicarReferenciaComercial) {
		this.isVisibilidadCeldaDuplicarReferenciaComercial = isVisibilidadCeldaDuplicarReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarReferenciaComercial() {
		return isVisibilidadCeldaCopiarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaCopiarReferenciaComercial(Boolean isVisibilidadCeldaCopiarReferenciaComercial) {
		this.isVisibilidadCeldaCopiarReferenciaComercial = isVisibilidadCeldaCopiarReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormReferenciaComercial() {
		return isVisibilidadCeldaVerFormReferenciaComercial;
	}

	public void setIsVisibilidadCeldaVerFormReferenciaComercial(Boolean isVisibilidadCeldaVerFormReferenciaComercial) {
		this.isVisibilidadCeldaVerFormReferenciaComercial = isVisibilidadCeldaVerFormReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenReferenciaComercial() {
		return isVisibilidadCeldaOrdenReferenciaComercial;
	}

	public void setIsVisibilidadCeldaOrdenReferenciaComercial(Boolean isVisibilidadCeldaOrdenReferenciaComercial) {
		this.isVisibilidadCeldaOrdenReferenciaComercial = isVisibilidadCeldaOrdenReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesReferenciaComercial() {
		return isVisibilidadCeldaNuevoRelacionesReferenciaComercial;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesReferenciaComercial(Boolean isVisibilidadCeldaNuevoRelacionesReferenciaComercial) {
		this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial = isVisibilidadCeldaNuevoRelacionesReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaModificarReferenciaComercial() {
		return isVisibilidadCeldaModificarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaModificarReferenciaComercial(Boolean isVisibilidadCeldaModificarReferenciaComercial) {
		this.isVisibilidadCeldaModificarReferenciaComercial = isVisibilidadCeldaModificarReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarReferenciaComercial() {
		return isVisibilidadCeldaActualizarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaActualizarReferenciaComercial(Boolean isVisibilidadCeldaActualizarReferenciaComercial) {
		this.isVisibilidadCeldaActualizarReferenciaComercial = isVisibilidadCeldaActualizarReferenciaComercial;
	}

	public Boolean getIsVisibilidadCeldaEliminarReferenciaComercial() {
		return isVisibilidadCeldaEliminarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaEliminarReferenciaComercial(Boolean isVisibilidadCeldaEliminarReferenciaComercial) {
		this.isVisibilidadCeldaEliminarReferenciaComercial = isVisibilidadCeldaEliminarReferenciaComercial;
	}

	public Boolean getIsVisibilidadCeldaCancelarReferenciaComercial() {
		return isVisibilidadCeldaCancelarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaCancelarReferenciaComercial(Boolean isVisibilidadCeldaCancelarReferenciaComercial) {
		this.isVisibilidadCeldaCancelarReferenciaComercial = isVisibilidadCeldaCancelarReferenciaComercial;
	}

	public Boolean getIsVisibilidadCeldaGuardarReferenciaComercial() {
		return isVisibilidadCeldaGuardarReferenciaComercial;
	}

	public void setIsVisibilidadCeldaGuardarReferenciaComercial(Boolean isVisibilidadCeldaGuardarReferenciaComercial) {
		this.isVisibilidadCeldaGuardarReferenciaComercial = isVisibilidadCeldaGuardarReferenciaComercial;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosReferenciaComercial() {
		return isVisibilidadCeldaGuardarCambiosReferenciaComercial;
	}

	public void setIsVisibilidadCeldaGuardarCambiosReferenciaComercial(Boolean isVisibilidadCeldaGuardarCambiosReferenciaComercial) {
		this.isVisibilidadCeldaGuardarCambiosReferenciaComercial = isVisibilidadCeldaGuardarCambiosReferenciaComercial;
	}
		
	public ReferenciaComercialSessionBean getreferenciacomercialSessionBean() {
		return this.referenciacomercialSessionBean;
	}
	
	public void setreferenciacomercialSessionBean(ReferenciaComercialSessionBean referenciacomercialSessionBean) {
		this.referenciacomercialSessionBean=referenciacomercialSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCiudad() {
		return this.isVisibilidadFK_IdCiudad;
	}

	public void setisVisibilidadFK_IdCiudad(Boolean isVisibilidadFK_IdCiudad) {
		this.isVisibilidadFK_IdCiudad=isVisibilidadFK_IdCiudad;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdTipoValoracion() {
		return this.isVisibilidadFK_IdTipoValoracion;
	}

	public void setisVisibilidadFK_IdTipoValoracion(Boolean isVisibilidadFK_IdTipoValoracion) {
		this.isVisibilidadFK_IdTipoValoracion=isVisibilidadFK_IdTipoValoracion;
	}

	public Boolean getisVisibilidadFK_IdValorClienteSectorEconomico() {
		return this.isVisibilidadFK_IdValorClienteSectorEconomico;
	}

	public void setisVisibilidadFK_IdValorClienteSectorEconomico(Boolean isVisibilidadFK_IdValorClienteSectorEconomico) {
		this.isVisibilidadFK_IdValorClienteSectorEconomico=isVisibilidadFK_IdValorClienteSectorEconomico;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(ReferenciaComercial referenciacomercial)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(referenciacomercial,null);
				this.setActualParaGuardarClienteForeignKey(referenciacomercial,null);
				this.setActualParaGuardarTipoSectorEconoForeignKey(referenciacomercial,null);
				this.setActualParaGuardarPaisForeignKey(referenciacomercial,null);
				this.setActualParaGuardarCiudadForeignKey(referenciacomercial,null);
				this.setActualParaGuardarTipoValoracionForeignKey(referenciacomercial,null);
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
	
	public void bugActualizarReferenciaActual(ReferenciaComercial referenciacomercial,ReferenciaComercial referenciacomercialAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalReferenciaComercial(referenciacomercial);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		referenciacomercialAux.setId(referenciacomercial.getId());
		referenciacomercialAux.setVersionRow(referenciacomercial.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessReferenciaComercial();
		
			int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = referenciacomercialValidator.getInvalidValues(this.referenciacomercial);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			referenciacomercialLogic.setDatosCliente(datosCliente);
			referenciacomercialLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				referenciacomercialAux=new  ReferenciaComercial();
				
				referenciacomercialAux.setIsNew(true);
				referenciacomercialAux.setIsChanged(true);
				
				referenciacomercialAux.setReferenciaComercialOriginal(this.referenciacomercial);
				
				referenciacomercialAux.setId(this.referenciacomercial.getId());	
				referenciacomercialAux.setVersionRow(this.referenciacomercial.getVersionRow());	
				referenciacomercialAux.setid_empresa(this.referenciacomercial.getid_empresa());	
				referenciacomercialAux.setidcliente(this.referenciacomercial.getidcliente());	
				referenciacomercialAux.setidvalorclientesectoreconomico(this.referenciacomercial.getidvalorclientesectoreconomico());	
				referenciacomercialAux.setid_pais(this.referenciacomercial.getid_pais());	
				referenciacomercialAux.setidciudad(this.referenciacomercial.getidciudad());	
				referenciacomercialAux.setnombreempresa(this.referenciacomercial.getnombreempresa());	
				referenciacomercialAux.setcodigo_cliente(this.referenciacomercial.getcodigo_cliente());	
				referenciacomercialAux.setcontacto(this.referenciacomercial.getcontacto());	
				referenciacomercialAux.setarticulo_compra(this.referenciacomercial.getarticulo_compra());	
				referenciacomercialAux.setnumero_anios(this.referenciacomercial.getnumero_anios());	
				referenciacomercialAux.setnumero_meses(this.referenciacomercial.getnumero_meses());	
				referenciacomercialAux.setid_tipo_valoracion(this.referenciacomercial.getid_tipo_valoracion());	
				referenciacomercialAux.setdireccion(this.referenciacomercial.getdireccion());	
				referenciacomercialAux.settelefono(this.referenciacomercial.gettelefono());	
				referenciacomercialAux.settelefonomovil(this.referenciacomercial.gettelefonomovil());	
				referenciacomercialAux.settelefonocodigoarea(this.referenciacomercial.gettelefonocodigoarea());	
				referenciacomercialAux.setemail(this.referenciacomercial.getemail());	
				referenciacomercialAux.setmonto(this.referenciacomercial.getmonto());	
				referenciacomercialAux.setesactivo(this.referenciacomercial.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciacomercialAux,referenciacomercials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.saveReferenciaComercials();//WithConnection
						//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaComercial();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciacomercialLogic.saveReferenciaComercialRelaciones(referenciacomercialAux);//WithConnection
								//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciacomercialAux,referenciacomercials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				referenciacomercialAux=new  ReferenciaComercial();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado() 
					|| (this.referenciacomercialSessionBean.getEsGuardarRelacionado() && this.referenciacomercial.getId()>=0)) {
						
					referenciacomercialAux.setIsNew(false);
				}
				
				referenciacomercialAux.setIsDeleted(false);
			
				referenciacomercialAux.setId(this.referenciacomercial.getId());	
				referenciacomercialAux.setVersionRow(this.referenciacomercial.getVersionRow());	
				referenciacomercialAux.setid_empresa(this.referenciacomercial.getid_empresa());	
				referenciacomercialAux.setidcliente(this.referenciacomercial.getidcliente());	
				referenciacomercialAux.setidvalorclientesectoreconomico(this.referenciacomercial.getidvalorclientesectoreconomico());	
				referenciacomercialAux.setid_pais(this.referenciacomercial.getid_pais());	
				referenciacomercialAux.setidciudad(this.referenciacomercial.getidciudad());	
				referenciacomercialAux.setnombreempresa(this.referenciacomercial.getnombreempresa());	
				referenciacomercialAux.setcodigo_cliente(this.referenciacomercial.getcodigo_cliente());	
				referenciacomercialAux.setcontacto(this.referenciacomercial.getcontacto());	
				referenciacomercialAux.setarticulo_compra(this.referenciacomercial.getarticulo_compra());	
				referenciacomercialAux.setnumero_anios(this.referenciacomercial.getnumero_anios());	
				referenciacomercialAux.setnumero_meses(this.referenciacomercial.getnumero_meses());	
				referenciacomercialAux.setid_tipo_valoracion(this.referenciacomercial.getid_tipo_valoracion());	
				referenciacomercialAux.setdireccion(this.referenciacomercial.getdireccion());	
				referenciacomercialAux.settelefono(this.referenciacomercial.gettelefono());	
				referenciacomercialAux.settelefonomovil(this.referenciacomercial.gettelefonomovil());	
				referenciacomercialAux.settelefonocodigoarea(this.referenciacomercial.gettelefonocodigoarea());	
				referenciacomercialAux.setemail(this.referenciacomercial.getemail());	
				referenciacomercialAux.setmonto(this.referenciacomercial.getmonto());	
				referenciacomercialAux.setesactivo(this.referenciacomercial.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciacomercialAux,referenciacomercials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.saveReferenciaComercials();//WithConnection
						//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);
					
					this.refrescarForeignKeysDescripcionesReferenciaComercial();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciacomercialLogic.saveReferenciaComercialRelaciones(referenciacomercialAux);//WithConnection
								//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(referenciacomercialAux,referenciacomercials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.referenciacomercial,referenciacomercialAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				referenciacomercialAux=new  ReferenciaComercial();
				
				referenciacomercialAux.setIsNew(false);
				referenciacomercialAux.setIsChanged(false);
				
				referenciacomercialAux.setIsDeleted(true);
				
				referenciacomercialAux.setId(this.referenciacomercial.getId());	
				referenciacomercialAux.setVersionRow(this.referenciacomercial.getVersionRow());	
				referenciacomercialAux.setid_empresa(this.referenciacomercial.getid_empresa());	
				referenciacomercialAux.setidcliente(this.referenciacomercial.getidcliente());	
				referenciacomercialAux.setidvalorclientesectoreconomico(this.referenciacomercial.getidvalorclientesectoreconomico());	
				referenciacomercialAux.setid_pais(this.referenciacomercial.getid_pais());	
				referenciacomercialAux.setidciudad(this.referenciacomercial.getidciudad());	
				referenciacomercialAux.setnombreempresa(this.referenciacomercial.getnombreempresa());	
				referenciacomercialAux.setcodigo_cliente(this.referenciacomercial.getcodigo_cliente());	
				referenciacomercialAux.setcontacto(this.referenciacomercial.getcontacto());	
				referenciacomercialAux.setarticulo_compra(this.referenciacomercial.getarticulo_compra());	
				referenciacomercialAux.setnumero_anios(this.referenciacomercial.getnumero_anios());	
				referenciacomercialAux.setnumero_meses(this.referenciacomercial.getnumero_meses());	
				referenciacomercialAux.setid_tipo_valoracion(this.referenciacomercial.getid_tipo_valoracion());	
				referenciacomercialAux.setdireccion(this.referenciacomercial.getdireccion());	
				referenciacomercialAux.settelefono(this.referenciacomercial.gettelefono());	
				referenciacomercialAux.settelefonomovil(this.referenciacomercial.gettelefonomovil());	
				referenciacomercialAux.settelefonocodigoarea(this.referenciacomercial.gettelefonocodigoarea());	
				referenciacomercialAux.setemail(this.referenciacomercial.getemail());	
				referenciacomercialAux.setmonto(this.referenciacomercial.getmonto());	
				referenciacomercialAux.setesactivo(this.referenciacomercial.getesactivo());	
				
				if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.referenciacomercialAux.getId()>=0) {	
						this.referenciacomercialsEliminados.add(referenciacomercialAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciacomercialAux,referenciacomercials);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.saveReferenciaComercials();//WithConnection
						//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								referenciacomercialLogic.saveReferenciaComercialRelaciones(referenciacomercialAux);//WithConnection
								//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
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
							if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
								|| this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(referenciacomercialAux,referenciacomercialLogic.getReferenciaComercials());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(referenciacomercialAux,referenciacomercials);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getReferenciaComercials().addAll(this.referenciacomercialsEliminados);
					
					referenciacomercialLogic.saveReferenciaComercials();//WithConnection
					//referenciacomercialLogic.getSetVersionRowReferenciaComercials();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesReferenciaComercial();
				
				this.referenciacomercialsEliminados= new ArrayList<ReferenciaComercial>();		
			}
			
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Referencia Comercial GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.referenciacomercial=referenciacomercialAux;
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
      		//this.finishProcessReferenciaComercial();
      	}
		
	}	
	
	public void actualizarRelaciones(ReferenciaComercial referenciacomercialLocal) throws Exception {
		
		if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ReferenciaComercial referenciacomercialLocal) throws Exception {	
		if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				referenciacomercialLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				referenciacomercialLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoSectorEconoDetalleFormJInternalFrame.class)) {
				TipoSectorEconoBeanSwingJInternalFrame tiposectoreconoBeanSwingJInternalFrameLocal=(TipoSectorEconoBeanSwingJInternalFrame) ((TipoSectorEconoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tiposectoreconoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoSectorEcono(tiposectoreconoBeanSwingJInternalFrameLocal.gettiposectorecono(),true);
				tiposectoreconoBeanSwingJInternalFrameLocal.actualizarLista(tiposectoreconoBeanSwingJInternalFrameLocal.tiposectorecono,this.tiposectoreconosForeignKey);

				tiposectoreconoBeanSwingJInternalFrameLocal.actualizarRelaciones(tiposectoreconoBeanSwingJInternalFrameLocal.tiposectorecono);

				referenciacomercialLocal.setTipoSectorEcono(tiposectoreconoBeanSwingJInternalFrameLocal.tiposectorecono);

				this.addItemDefectoCombosForeignKeyTipoSectorEcono();
				this.cargarCombosFrameTipoSectorEconosForeignKey("Formulario");
				this.setActualTipoSectorEconoForeignKey(tiposectoreconoBeanSwingJInternalFrameLocal.tiposectorecono.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				referenciacomercialLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CiudadDetalleFormJInternalFrame.class)) {
				CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrameLocal=(CiudadBeanSwingJInternalFrame) ((CiudadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ciudadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCiudad(ciudadBeanSwingJInternalFrameLocal.getciudad(),true);
				ciudadBeanSwingJInternalFrameLocal.actualizarLista(ciudadBeanSwingJInternalFrameLocal.ciudad,this.ciudadsForeignKey);

				ciudadBeanSwingJInternalFrameLocal.actualizarRelaciones(ciudadBeanSwingJInternalFrameLocal.ciudad);

				referenciacomercialLocal.setCiudad(ciudadBeanSwingJInternalFrameLocal.ciudad);

				this.addItemDefectoCombosForeignKeyCiudad();
				this.cargarCombosFrameCiudadsForeignKey("Formulario");
				this.setActualCiudadForeignKey(ciudadBeanSwingJInternalFrameLocal.ciudad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoValoracionDetalleFormJInternalFrame.class)) {
				TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrameLocal=(TipoValoracionBeanSwingJInternalFrame) ((TipoValoracionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovaloracionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.gettipovaloracion(),true);
				tipovaloracionBeanSwingJInternalFrameLocal.actualizarLista(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion,this.tipovaloracionsForeignKey);

				tipovaloracionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				referenciacomercialLocal.setTipoValoracion(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion);

				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey("Formulario");
				this.setActualTipoValoracionForeignKey(tipovaloracionBeanSwingJInternalFrameLocal.tipovaloracion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarReferenciaComercialActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = referenciacomercialValidator.getInvalidValues(this.referenciacomercial);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ReferenciaComercial referenciacomercial,List<ReferenciaComercial> referenciacomercials) throws Exception {
		try	{		
			ReferenciaComercialConstantesFunciones.actualizarLista(referenciacomercial,referenciacomercials,this.referenciacomercialSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ReferenciaComercial referenciacomercial,List<ReferenciaComercial> referenciacomercials) throws Exception {
		try	{			
			ReferenciaComercialConstantesFunciones.actualizarSelectedLista(referenciacomercial,referenciacomercials);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ReferenciaComercial> referenciacomercialsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				referenciacomercialsLocal=this.referenciacomercialLogic.getReferenciaComercials();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				referenciacomercialsLocal=this.referenciacomercials;
			}
			//ARCHITECTURE
		
			for(ReferenciaComercial referenciacomercialLocal:referenciacomercialsLocal) {
				if(this.permiteMantenimiento(referenciacomercialLocal) && referenciacomercialLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ReferenciaComercialConstantesFunciones.getReferenciaComercialLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_empresaReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidclienteReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDTIPOSECTORECONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidvalorclientesectoreconomicoReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_paisReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDCIUDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidciudadReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnombreempresaReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcodigo_clienteReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.CONTACTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcontactoReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.ARTICULOCOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelarticulo_compraReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.NUMEROANIOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_aniosReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.NUMEROMESES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_mesesReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.IDTIPOVALORACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_tipo_valoracionReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeldireccionReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonoReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.TELEFONOMOVIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonomovilReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.TELEFONOCODIGOAREA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonocodigoareaReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelemailReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.MONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelmontoReferenciaComercial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ReferenciaComercialConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelesactivoReferenciaComercial,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_empresaReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidclienteReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidvalorclientesectoreconomicoReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_paisReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelidciudadReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnombreempresaReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcodigo_clienteReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcontactoReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelarticulo_compraReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_aniosReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_mesesReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelid_tipo_valoracionReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabeldireccionReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonoReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonomovilReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonocodigoareaReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelemailReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelmontoReferenciaComercial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormReferenciaComercial.jLabelesactivoReferenciaComercial,"");
		
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
		this.iIdNuevoReferenciaComercial--;	
		
		
		this.referenciacomercialAux=new ReferenciaComercial();
		
		this.referenciacomercialAux.setId(this.iIdNuevoReferenciaComercial);
		this.referenciacomercialAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.referenciacomercialLogic.getReferenciaComercials().add(this.referenciacomercialAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.referenciacomercials.add(this.referenciacomercialAux);
		}
		//ARCHITECTURE
		
		this.referenciacomercial=this.referenciacomercialAux;
		
		if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioReferenciaComercial(this.referenciacomercial);
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaComercial(this.referenciacomercial);
		}
				
		//this.setDefaultControlesReferenciaComercial();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyReferenciaComercial();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyReferenciaComercial();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaComercial();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaComercial(this.referenciacomercialBean,this.referenciacomercial,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ReferenciaComercialConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
			classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.referenciacomercialReturnGeneral=referenciacomercialLogic.procesarEventosReferenciaComercialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciacomercialLogic.getReferenciaComercials(),this.referenciacomercial,this.referenciacomercialParameterGeneral,this.isEsNuevoReferenciaComercial,classes);//this.referenciacomercialLogic.getReferenciaComercial()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanReferenciaComercial(this.referenciacomercialReturnGeneral,this.referenciacomercialBean,false);
		
		if(this.referenciacomercialReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial());
		}
		
		if(this.referenciacomercialReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial(),classes);//this.referenciacomercialBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyReferenciaComercial();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyReferenciaComercial();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.RecargarFormReferenciaComercial(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingReferenciaComercial(false);
						
			if(referenciacomercialSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaComercial();
			}
			
			this.actualizarVisualTableDatosReferenciaComercial();
			
			this.jTableDatosReferenciaComercial.setRowSelectionInterval(this.getIndiceNuevoReferenciaComercial(), this.getIndiceNuevoReferenciaComercial());
			
			this.seleccionarFilaTablaReferenciaComercialActual();
						
			this.actualizarEstadoCeldasBotonesReferenciaComercial("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesReferenciaComercial(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarnombreempresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarcodigo_clienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarcontactoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activararticulo_compraReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarnumero_aniosReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarnumero_mesesReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activardireccionReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activartelefonoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activartelefonomovilReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activartelefonocodigoareaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activaremailReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarmontoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activaresactivoReferenciaComercial);	
		//
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarid_empresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activaridclienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activaridvalorclientesectoreconomicoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarid_paisReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activaridciudadReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setEnabled(isHabilitar && this.referenciacomercialConstantesFunciones.activarid_tipo_valoracionReferenciaComercial);
	};
	
	public void setDefaultControlesReferenciaComercial() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoReferenciaComercial(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.referenciacomercialSessionBean.setConGuardarRelaciones(true);			
			this.referenciacomercialSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.setVisible(true);
			
					
		} else {
			//this.referenciacomercialSessionBean.setConGuardarRelaciones(false);			
			this.referenciacomercialSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoReferenciaComercial() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
				if(referenciacomercialAux.getId().equals(this.iIdNuevoReferenciaComercial)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercials) {
				if(referenciacomercialAux.getId().equals(this.iIdNuevoReferenciaComercial)) {
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
	
	public int getIndiceActualReferenciaComercial(ReferenciaComercial referenciacomercial,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
				if(referenciacomercialAux.getId().equals(referenciacomercial.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercials) {
				if(referenciacomercialAux.getId().equals(referenciacomercial.getId())) {
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
	
	public void setCamposBaseDesdeOriginalReferenciaComercial(ReferenciaComercial referenciacomercialOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
				if(referenciacomercialAux.getReferenciaComercialOriginal().getId().equals(referenciacomercialOriginal.getId())) {
					existe=true;
					referenciacomercialOriginal.setId(referenciacomercialAux.getId());
					referenciacomercialOriginal.setVersionRow(referenciacomercialAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaComercial referenciacomercialAux:this.referenciacomercials) {
				if(referenciacomercialAux.getReferenciaComercialOriginal().getId().equals(referenciacomercialOriginal.getId())) {
					existe=true;
					referenciacomercialOriginal.setId(referenciacomercialAux.getId());
					referenciacomercialOriginal.setVersionRow(referenciacomercialAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosReferenciaComercial(Boolean esParaCancelar) throws Exception {
		referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
		referenciacomercialAux=new ReferenciaComercial();
		
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
					if(referenciacomercialAux.getId()<0) {
						referenciacomercialsAux.add(referenciacomercialAux);
					}		
				}
				this.iIdNuevoReferenciaComercial=0L;
				this.referenciacomercialLogic.getReferenciaComercials().removeAll(referenciacomercialsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaComercial referenciacomercialAux:this.referenciacomercials) {
					if(referenciacomercialAux.getId()<0) {
						referenciacomercialsAux.add(referenciacomercialAux);
					}		
				}
				this.iIdNuevoReferenciaComercial=0L;
				this.referenciacomercials.removeAll(referenciacomercialsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoReferenciaComercial 
					&& this.referenciacomercialLogic.getReferenciaComercials().size()>0
					) {
					referenciacomercialAux=this.referenciacomercialLogic.getReferenciaComercials().get(this.referenciacomercialLogic.getReferenciaComercials().size() - 1);
				
					if(referenciacomercialAux.getId()<0) {
						this.referenciacomercialLogic.getReferenciaComercials().remove(referenciacomercialAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoReferenciaComercial && this.referenciacomercials.size()>0) {
					referenciacomercialAux=this.referenciacomercials.get(this.referenciacomercials.size() - 1);
				
					if(referenciacomercialAux.getId()<0) {
						this.referenciacomercials.remove(referenciacomercialAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoReferenciaComercial(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(referenciacomercial.getId()<0) {
				this.referenciacomercialLogic.getReferenciaComercials().remove(this.referenciacomercial);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(referenciacomercial.getId()<0) {
				this.referenciacomercials.remove(this.referenciacomercial);
			}
		}			
	}
	
	public void setEstadosInicialesReferenciaComercial(List<ReferenciaComercial> referenciacomercialsAux) throws Exception {
		ReferenciaComercialConstantesFunciones.setEstadosInicialesReferenciaComercial(referenciacomercialsAux);
	}
	
	public void setEstadosInicialesReferenciaComercial(ReferenciaComercial referenciacomercialAux) throws Exception {
		ReferenciaComercialConstantesFunciones.setEstadosInicialesReferenciaComercial(referenciacomercialAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarReferenciaComercialActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarReferenciaComercialActual()) {
				if(!this.isEsNuevoReferenciaComercial) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoReferenciaComercial=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarReferenciaComercialActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Referencia Comercial ?", "MANTENIMIENTO DE Referencia Comercial", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ReferenciaComercial referenciacomercial) throws Exception {
		ReferenciaComercialConstantesFunciones.seleccionarAsignar(this.referenciacomercial,referenciacomercial);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarReferenciaComercial=this.isPermisoActualizarOriginalReferenciaComercial;
			
			
			this.seleccionarAsignar(referenciacomercial);
			
			

			idClienteActual=referenciacomercial.getidcliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ReferenciaComercialConstantesFunciones.quitarEspaciosReferenciaComercial(this.referenciacomercial,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesReferenciaComercial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.referenciacomercialSessionBean.setsFuncionBusquedaRapida(this.referenciacomercialSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
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
			if(this.isEsNuevoReferenciaComercial) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosReferenciaComercial(esParaCancelar);				
				this.cancelarNuevoReferenciaComercial(esParaCancelar);								
			}
			
			this.referenciacomercial=new ReferenciaComercial();
			
			this.inicializarReferenciaComercial();
			
			this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarReferenciaComercial() throws Exception {
		try {
			ReferenciaComercialConstantesFunciones.inicializarReferenciaComercial(this.referenciacomercial);
			
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
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.referenciacomercialLogic.getReferenciaComercials().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteReferenciaComercials(String sAccionBusqueda,List<ReferenciaComercial> referenciacomercialsParaReportes) throws Exception {
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
					sPathReporteFinal="ReferenciaComercial"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ReferenciaComercialMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ReferenciaComercialMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ReferenciaComercial"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Referencia Comerciales");		
		parameters.put("busquedapor", ReferenciaComercialConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceReferenciaComercial=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ReferenciaComercialConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ReferenciaComercialConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceReferenciaComercial=new JRBeanArrayDataSource(ReferenciaComercialJInternalFrame.TraerReferenciaComercialBeans(referenciacomercialsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceReferenciaComercial);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ReferenciaComercialConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ReferenciaComercialConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ReferenciaComercialBean.TraerReferenciaComercialBeans(referenciacomercialsParaReportes).toArray()));
							
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
				this.generarExcelReporteReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoReferenciaComercialActionPerformed(null);
					//this.generarExcelReporteReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesReferenciaComercials(sAccionBusqueda,sTipoArchivoReporte,referenciacomercialsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteReferenciaComercials(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaComercial> referenciacomercialsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaComercials");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaComercial("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ReferenciaComercial referenciacomercial : referenciacomercialsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ReferenciaComercialConstantesFunciones.generarExcelReporteDataReferenciaComercial("NORMAL",row,workbook,referenciacomercial,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderReferenciaComercial(String sTipo,Row row,Workbook workbook) {
		
		ReferenciaComercialConstantesFunciones.generarExcelReporteHeaderReferenciaComercial(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalReferenciaComercials(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaComercial> referenciacomercialsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaComercials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ReferenciaComercial referenciacomercial : referenciacomercialsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ReferenciaComercialConstantesFunciones.getReferenciaComercialDescripcion(referenciacomercial));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.gettiposectorecono_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getciudad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getnombreempresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getcontacto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getarticulo_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getnumero_anios());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getnumero_meses());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.gettipovaloracion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.gettelefonomovil());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.gettelefonocodigoarea());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getemail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_MONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_MONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(referenciacomercial.getmonto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(referenciacomercial.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesReferenciaComercials(String sAccionBusqueda,String sTipoArchivoReporte,List<ReferenciaComercial> referenciacomercialsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ReferenciaComercial> referenciacomercialsRespaldo=null;
		
		classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.referenciacomercialLogic.setDatosCliente(this.datosCliente);
		this.referenciacomercialLogic.setDatosDeep(this.datosDeep);
		this.referenciacomercialLogic.setIsConDeep(true);
		
		referenciacomercialsRespaldo=this.referenciacomercialLogic.getReferenciaComercials();
		
		this.referenciacomercialLogic.setReferenciaComercials(referenciacomercialsParaReportes);	
		this.referenciacomercialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		referenciacomercialsParaReportes=this.referenciacomercialLogic.getReferenciaComercials();
		this.referenciacomercialLogic.setReferenciaComercials(referenciacomercialsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ReferenciaComercials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderReferenciaComercial("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ReferenciaComercial referenciacomercial : referenciacomercialsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderReferenciaComercial("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ReferenciaComercialConstantesFunciones.generarExcelReporteDataReferenciaComercial("NORMAL",row,workbook,referenciacomercial,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ReferenciaComercialConstantesFunciones.getReferenciaComercialDescripcion(referenciacomercial));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaComercial.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessReferenciaComercial() throws Exception {		
		this.startProcessReferenciaComercial(true);
	}
	
	public void startProcessReferenciaComercial(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasReferenciaComercial ,this.jPanelParametrosReportesReferenciaComercial, this.jScrollPanelDatosReferenciaComercial,this.jPanelPaginacionReferenciaComercial, this.jScrollPanelDatosEdicionReferenciaComercial, this.jPanelAccionesReferenciaComercial,this.jPanelAccionesFormularioReferenciaComercial,this.jmenuBarReferenciaComercial,this.jmenuBarDetalleReferenciaComercial,this.jTtoolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaComercial=this.jTabbedPaneBusquedasReferenciaComercial; 
		
		final JPanel jPanelParametrosReportesReferenciaComercial=this.jPanelParametrosReportesReferenciaComercial;
		//final JScrollPane jScrollPanelDatosReferenciaComercial=this.jScrollPanelDatosReferenciaComercial;
		final JTable jTableDatosReferenciaComercial=this.jTableDatosReferenciaComercial;		
		final JPanel jPanelPaginacionReferenciaComercial=this.jPanelPaginacionReferenciaComercial;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaComercial=this.jScrollPanelDatosEdicionReferenciaComercial;
		final JPanel jPanelAccionesReferenciaComercial=this.jPanelAccionesReferenciaComercial;
		
		JPanel jPanelCamposAuxiliarReferenciaComercial=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaComercial=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			jPanelCamposAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jPanelCamposReferenciaComercial;
			jPanelAccionesFormularioAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jPanelAccionesFormularioReferenciaComercial;
		}
		
		final JPanel jPanelCamposReferenciaComercial=jPanelCamposAuxiliarReferenciaComercial;
		final JPanel jPanelAccionesFormularioReferenciaComercial=jPanelAccionesFormularioAuxiliarReferenciaComercial;
		
		
		final JMenuBar jmenuBarReferenciaComercial=this.jmenuBarReferenciaComercial;
		final JToolBar jTtoolBarReferenciaComercial=this.jTtoolBarReferenciaComercial;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarReferenciaComercial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaComercial=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			jmenuBarDetalleAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jmenuBarDetalleReferenciaComercial;
			jTtoolBarDetalleAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jTtoolBarDetalleReferenciaComercial;
		}
		
		final JMenuBar jmenuBarDetalleReferenciaComercial=jmenuBarDetalleAuxiliarReferenciaComercial;
		final JToolBar jTtoolBarDetalleReferenciaComercial=jTtoolBarDetalleAuxiliarReferenciaComercial;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaComercial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaComercial;
			processRunnable.jTableDatos=jTableDatosReferenciaComercial;
			processRunnable.jPanelCampos=jPanelCamposReferenciaComercial;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaComercial;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaComercial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaComercial;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaComercial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaComercial;
			processRunnable.jTtoolBar=jTtoolBarReferenciaComercial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaComercial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaComercial ,jPanelParametrosReportesReferenciaComercial,jTableDatosReferenciaComercial, /*jScrollPanelDatosReferenciaComercial,*/jPanelCamposReferenciaComercial,jPanelPaginacionReferenciaComercial, /*jScrollPanelDatosEdicionReferenciaComercial,*/ jPanelAccionesReferenciaComercial,jPanelAccionesFormularioReferenciaComercial,jmenuBarReferenciaComercial,jmenuBarDetalleReferenciaComercial,jTtoolBarReferenciaComercial,jTtoolBarDetalleReferenciaComercial);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasReferenciaComercial ,jPanelParametrosReportesReferenciaComercial, jScrollPanelDatosReferenciaComercial,jPanelPaginacionReferenciaComercial, jScrollPanelDatosEdicionReferenciaComercial, jPanelAccionesReferenciaComercial,jPanelAccionesFormularioReferenciaComercial,jmenuBarReferenciaComercial,jmenuBarDetalleReferenciaComercial,jTtoolBarReferenciaComercial,jTtoolBarDetalleReferenciaComercial);
						
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
	
	public void finishProcessReferenciaComercial() {// throws Exception 
		this.finishProcessReferenciaComercial(true);
	}
	
	public void finishProcessReferenciaComercial(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasReferenciaComercial ,this.jPanelParametrosReportesReferenciaComercial, this.jScrollPanelDatosReferenciaComercial,this.jPanelPaginacionReferenciaComercial, this.jScrollPanelDatosEdicionReferenciaComercial, this.jPanelAccionesReferenciaComercial,this.jPanelAccionesFormularioReferenciaComercial,this.jmenuBarReferenciaComercial,this.jmenuBarDetalleReferenciaComercial,this.jTtoolBarReferenciaComercial,this.jTtoolBarDetalleReferenciaComercial);		
		
		final JTabbedPane jTabbedPaneBusquedasReferenciaComercial=this.jTabbedPaneBusquedasReferenciaComercial; 
		
		final JPanel jPanelParametrosReportesReferenciaComercial=this.jPanelParametrosReportesReferenciaComercial;
		//final JScrollPane jScrollPanelDatosReferenciaComercial=this.jScrollPanelDatosReferenciaComercial;
		final JTable jTableDatosReferenciaComercial=this.jTableDatosReferenciaComercial;		
		final JPanel jPanelPaginacionReferenciaComercial=this.jPanelPaginacionReferenciaComercial;
		//final JScrollPane jScrollPanelDatosEdicionReferenciaComercial=this.jScrollPanelDatosEdicionReferenciaComercial;
		final JPanel jPanelAccionesReferenciaComercial=this.jPanelAccionesReferenciaComercial;
		
		JPanel jPanelCamposAuxiliarReferenciaComercial=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarReferenciaComercial=new JPanel();
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			jPanelCamposAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jPanelCamposReferenciaComercial;
			jPanelAccionesFormularioAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jPanelAccionesFormularioReferenciaComercial;
		}
		
		final JPanel jPanelCamposReferenciaComercial=jPanelCamposAuxiliarReferenciaComercial;
		final JPanel jPanelAccionesFormularioReferenciaComercial=jPanelAccionesFormularioAuxiliarReferenciaComercial;
		
		
		final JMenuBar jmenuBarReferenciaComercial=this.jmenuBarReferenciaComercial;		
		final JToolBar jTtoolBarReferenciaComercial=this.jTtoolBarReferenciaComercial;
				
		JMenuBar jmenuBarDetalleAuxiliarReferenciaComercial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarReferenciaComercial=new JToolBar();
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			jmenuBarDetalleAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jmenuBarDetalleReferenciaComercial;
			jTtoolBarDetalleAuxiliarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jTtoolBarDetalleReferenciaComercial;		
		}
		
		final JMenuBar jmenuBarDetalleReferenciaComercial=jmenuBarDetalleAuxiliarReferenciaComercial;
		final JToolBar jTtoolBarDetalleReferenciaComercial=jTtoolBarDetalleAuxiliarReferenciaComercial;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasReferenciaComercial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesReferenciaComercial;
			processRunnable.jTableDatos=jTableDatosReferenciaComercial;
			processRunnable.jPanelCampos=jPanelCamposReferenciaComercial;
			processRunnable.jPanelPaginacion=jPanelPaginacionReferenciaComercial;
			processRunnable.jPanelAcciones=jPanelAccionesReferenciaComercial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioReferenciaComercial;
			
			
			processRunnable.jmenuBar=jmenuBarReferenciaComercial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleReferenciaComercial;
			processRunnable.jTtoolBar=jTtoolBarReferenciaComercial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleReferenciaComercial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasReferenciaComercial ,jPanelParametrosReportesReferenciaComercial, jTableDatosReferenciaComercial,/*jScrollPanelDatosReferenciaComercial,*/jPanelCamposReferenciaComercial,jPanelPaginacionReferenciaComercial, /*jScrollPanelDatosEdicionReferenciaComercial,*/ jPanelAccionesReferenciaComercial,jPanelAccionesFormularioReferenciaComercial,jmenuBarReferenciaComercial,jmenuBarDetalleReferenciaComercial,jTtoolBarReferenciaComercial,jTtoolBarDetalleReferenciaComercial));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesReferenciaComercial(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarReferenciaComercial(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuReferenciaComercial(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarReferenciaComercial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarReferenciaComercial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleReferenciaComercial,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuReferenciaComercial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarReferenciaComercial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleReferenciaComercial,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.referenciacomercialConstantesFunciones.getsFinalQueryReferenciaComercial();
		String  finalQueryPaginacionTodos=this.referenciacomercialConstantesFunciones.getsFinalQueryReferenciaComercial();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ReferenciaComercialConstantesFunciones.getArrayColumnasGlobalesNoReferenciaComercial(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ReferenciaComercialConstantesFunciones.getArrayColumnasGlobalesReferenciaComercial(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ReferenciaComercialConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.referenciacomercialsEliminados= new ArrayList<ReferenciaComercial>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessReferenciaComercial();
		
				///*ReferenciaComercialSessionBean*/this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			
			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
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
					this.iNumeroPaginacion=ReferenciaComercialConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ReferenciaComercialConstantesFunciones.getClassesForeignKeysOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/referenciacomercial."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			referenciacomercialsAux= new ArrayList<ReferenciaComercial>();
			
				
			referenciacomercialLogic.setDatosCliente(this.datosCliente);
			referenciacomercialLogic.setDatosDeep(this.datosDeep);
			referenciacomercialLogic.setIsConDeep(true);
			
			
			referenciacomercialLogic.getReferenciaComercialDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					referenciacomercialLogic.getTodosReferenciaComercials(finalQueryGlobal,pagination);
					
					//referenciacomercialLogic.getTodosReferenciaComercialsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(referenciacomercialLogic.getReferenciaComercials()==null|| referenciacomercialLogic.getReferenciaComercials().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciacomercialsAux= new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux= new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciacomercialLogic.getTodosReferenciaComercials(finalQueryGlobal+"",this.pagination);												
							
							//referenciacomercialLogic.getTodosReferenciaComercialsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteReferenciaComercials("Todos",referenciacomercialLogic.getReferenciaComercials() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());					
							referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idReferenciaComercial=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idReferenciaComercial=this.idActual;
				
				} else if(this.idReferenciaComercialActual!=null && this.idReferenciaComercialActual!=0L) {
					idReferenciaComercial=idReferenciaComercialActual;
				}
				
					
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndicePorId(idReferenciaComercial);
				
				this.referenciacomercials=new ArrayList<ReferenciaComercial>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					referenciacomercialLogic.getEntity(idReferenciaComercial);
					
					//referenciacomercialLogic.getEntityWithConnection(idReferenciaComercial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
					referenciacomercialLogic.getReferenciaComercials().add(referenciacomercialLogic.getReferenciaComercial());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercials=new ArrayList<ReferenciaComercial>();
					this.referenciacomercials.add(referenciacomercial);
				}
				
				if(referenciacomercialLogic.getReferenciaComercial()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCiudad")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdCiudad(finalQueryGlobal,pagination,idciudadFK_IdCiudad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCiudad(idciudadFK_IdCiudad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdCiudad",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdCiudad",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdCliente(finalQueryGlobal,pagination,idclienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdCliente(idclienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdCliente",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdCliente",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdEmpresa",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdEmpresa",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdPais",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdPais",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoValoracion")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdTipoValoracion(finalQueryGlobal,pagination,id_tipo_valoracionFK_IdTipoValoracion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdTipoValoracion(id_tipo_valoracionFK_IdTipoValoracion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdTipoValoracion",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdTipoValoracion",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorClienteSectorEconomico")) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdValorClienteSectorEconomico(idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					referenciacomercialLogic.getReferenciaComercialsFK_IdValorClienteSectorEconomico(finalQueryGlobal,pagination,idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdValorClienteSectorEconomico(idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdValorClienteSectorEconomico(idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=referenciacomercialLogic.getReferenciaComercials()==null||referenciacomercialLogic.getReferenciaComercials().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=referenciacomercials==null|| referenciacomercials.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
						referenciacomercialsAux.addAll(referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialsAux=new ArrayList<ReferenciaComercial>();
							referenciacomercialsAux.addAll(referenciacomercials);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							referenciacomercialLogic.getReferenciaComercialsFK_IdValorClienteSectorEconomico(finalQueryGlobal,pagination,idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdValorClienteSectorEconomico(idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ReferenciaComercialConstantesFunciones.getDetalleIndiceFK_IdValorClienteSectorEconomico(idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteReferenciaComercials("FK_IdValorClienteSectorEconomico",referenciacomercialLogic.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteReferenciaComercials("FK_IdValorClienteSectorEconomico",referenciacomercials);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialLogic.setReferenciaComercials(new ArrayList<ReferenciaComercial>());
						referenciacomercialLogic.getReferenciaComercials().addAll(referenciacomercialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercials=new ArrayList<ReferenciaComercial>();
							referenciacomercials.addAll(referenciacomercialsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesReferenciaComercial();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessReferenciaComercial();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciacomercialLogic.getReferenciaComercials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciacomercials.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=referenciacomercialLogic.getReferenciaComercials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=referenciacomercials.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ReferenciaComercial referenciacomercial) {
		Boolean permite=true;
		
		if(this.referenciacomercial.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ReferenciaComercialConstantesFunciones.getOrderByListaReferenciaComercial();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ReferenciaComercialConstantesFunciones.getOrderByListaReferenciaComercial();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaComercial referenciacomercial:referenciacomercialLogic.getReferenciaComercials()) {
				if(referenciacomercial.getsType().equals(Constantes2.S_TOTALES)) {
					referenciacomercialTotales=referenciacomercial;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaComercial referenciacomercial:this.referenciacomercials) {
				if(referenciacomercial.getsType().equals(Constantes2.S_TOTALES)) {
					referenciacomercialTotales=referenciacomercial;
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
			this.referenciacomercialAux=new ReferenciaComercial();
			this.referenciacomercialAux.setsType(Constantes2.S_TOTALES);
			this.referenciacomercialAux.setIsNew(false);
			this.referenciacomercialAux.setIsChanged(false);
			this.referenciacomercialAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ReferenciaComercialConstantesFunciones.TotalizarValoresFilaReferenciaComercial(this.referenciacomercialLogic.getReferenciaComercials(),this.referenciacomercialAux);
				
				this.referenciacomercialLogic.getReferenciaComercials().add(this.referenciacomercialAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ReferenciaComercialConstantesFunciones.TotalizarValoresFilaReferenciaComercial(this.referenciacomercials,this.referenciacomercialAux);
				
				this.referenciacomercials.add(this.referenciacomercialAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		referenciacomercialTotales=new ReferenciaComercial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciacomercialLogic.getReferenciaComercials().remove(referenciacomercialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.referenciacomercials.remove(referenciacomercialTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		referenciacomercialTotales=new ReferenciaComercial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ReferenciaComercial referenciacomercial:referenciacomercialLogic.getReferenciaComercials()) {
				if(referenciacomercial.getsType().equals(Constantes2.S_TOTALES)) {
					referenciacomercialTotales=referenciacomercial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaComercialConstantesFunciones.TotalizarValoresFilaReferenciaComercial(this.referenciacomercialLogic.getReferenciaComercials(),referenciacomercialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ReferenciaComercial referenciacomercial:this.referenciacomercials) {
				if(referenciacomercial.getsType().equals(Constantes2.S_TOTALES)) {
					referenciacomercialTotales=referenciacomercial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ReferenciaComercialConstantesFunciones.TotalizarValoresFilaReferenciaComercial(this.referenciacomercials,referenciacomercialTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getReferenciaComercialsFK_IdCiudad()throws Exception {
		try {
			sAccionBusqueda="FK_IdCiudad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaComercialsFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaComercialsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaComercialsFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaComercialsFK_IdTipoValoracion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoValoracion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getReferenciaComercialsFK_IdValorClienteSectorEconomico()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorClienteSectorEconomico";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getReferenciaComercialsFK_IdCiudad(String sFinalQuery,Long idciudad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdCiudad(sFinalQuery,this.pagination,idciudad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaComercialsFK_IdCliente(String sFinalQuery,Long idcliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdCliente(sFinalQuery,this.pagination,idcliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaComercialsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaComercialsFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaComercialsFK_IdTipoValoracion(String sFinalQuery,Long id_tipo_valoracion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdTipoValoracion(sFinalQuery,this.pagination,id_tipo_valoracion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getReferenciaComercialsFK_IdValorClienteSectorEconomico(String sFinalQuery,Long idvalorclientesectoreconomico)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLogic.getReferenciaComercialsFK_IdValorClienteSectorEconomico(sFinalQuery,this.pagination,idvalorclientesectoreconomico);
				
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
	
	public void inicializarPermisosReferenciaComercial() {
		this.isPermisoTodoReferenciaComercial=false;
		this.isPermisoNuevoReferenciaComercial=false;
		this.isPermisoActualizarReferenciaComercial=false;
		this.isPermisoActualizarOriginalReferenciaComercial=false;
		this.isPermisoEliminarReferenciaComercial=false;
		this.isPermisoGuardarCambiosReferenciaComercial=false;
		this.isPermisoConsultaReferenciaComercial=false;
		this.isPermisoBusquedaReferenciaComercial=false;
		this.isPermisoReporteReferenciaComercial=false;		
		this.isPermisoOrdenReferenciaComercial=false;		
		this.isPermisoPaginacionMedioReferenciaComercial=false;		
		this.isPermisoPaginacionAltoReferenciaComercial=false;
		this.isPermisoPaginacionTodoReferenciaComercial=false;
		this.isPermisoCopiarReferenciaComercial=false;		
		this.isPermisoVerFormReferenciaComercial=false;		
		this.isPermisoDuplicarReferenciaComercial=false;		
		this.isPermisoOrdenReferenciaComercial=false;		
	}
	
	public void setPermisosUsuarioReferenciaComercial(Boolean isPermiso) {
		this.isPermisoTodoReferenciaComercial=isPermiso;
		this.isPermisoNuevoReferenciaComercial=isPermiso;
		this.isPermisoActualizarReferenciaComercial=isPermiso;
		this.isPermisoActualizarOriginalReferenciaComercial=isPermiso;
		this.isPermisoEliminarReferenciaComercial=isPermiso;
		this.isPermisoGuardarCambiosReferenciaComercial=isPermiso;
		this.isPermisoConsultaReferenciaComercial=isPermiso;
		this.isPermisoBusquedaReferenciaComercial=isPermiso;
		this.isPermisoReporteReferenciaComercial=isPermiso;
		this.isPermisoOrdenReferenciaComercial=isPermiso;		
		this.isPermisoPaginacionMedioReferenciaComercial=isPermiso;		
		this.isPermisoPaginacionAltoReferenciaComercial=isPermiso;		
		this.isPermisoPaginacionTodoReferenciaComercial=isPermiso;		
		this.isPermisoCopiarReferenciaComercial=isPermiso;		
		this.isPermisoVerFormReferenciaComercial=isPermiso;		
		this.isPermisoDuplicarReferenciaComercial=isPermiso;
		this.isPermisoOrdenReferenciaComercial=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioReferenciaComercial(Boolean isPermiso) {
		//this.isPermisoTodoReferenciaComercial=isPermiso;
		this.isPermisoNuevoReferenciaComercial=isPermiso;
		this.isPermisoActualizarReferenciaComercial=isPermiso;
		this.isPermisoActualizarOriginalReferenciaComercial=isPermiso;
		this.isPermisoEliminarReferenciaComercial=isPermiso;
		this.isPermisoGuardarCambiosReferenciaComercial=isPermiso;
		//this.isPermisoConsultaReferenciaComercial=isPermiso;
		//this.isPermisoBusquedaReferenciaComercial=isPermiso;
		//this.isPermisoReporteReferenciaComercial=isPermiso;
		//this.isPermisoOrdenReferenciaComercial=isPermiso;		
		//this.isPermisoPaginacionMedioReferenciaComercial=isPermiso;		
		//this.isPermisoPaginacionAltoReferenciaComercial=isPermiso;		
		//this.isPermisoPaginacionTodoReferenciaComercial=isPermiso;		
		//this.isPermisoCopiarReferenciaComercial=isPermiso;		
		//this.isPermisoDuplicarReferenciaComercial=isPermiso;
		//this.isPermisoOrdenReferenciaComercial=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaComercialClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ReferenciaComercialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebReferenciaComercial(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioReferenciaComercialClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioReferenciaComercialClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionReferenciaComercialClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioReferenciaComercialClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioReferenciaComercial() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ReferenciaComercialJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ReferenciaComercialConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoReferenciaComercial=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarReferenciaComercial=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalReferenciaComercial=this.isPermisoActualizarReferenciaComercial;
			this.isPermisoEliminarReferenciaComercial=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosReferenciaComercial=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaReferenciaComercial=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaReferenciaComercial=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoReferenciaComercial=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteReferenciaComercial=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaComercial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioReferenciaComercial=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoReferenciaComercial=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoReferenciaComercial=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarReferenciaComercial=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormReferenciaComercial=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarReferenciaComercial=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenReferenciaComercial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosReferenciaComercial.setToolTipText(this.jTableDatosReferenciaComercial.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioReferenciaComercial(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioReferenciaComercial(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ReferenciaComercialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ReferenciaComercialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioReferenciaComercial() throws Exception {
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
	public void inicializarCombosForeignKeyReferenciaComercialListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tiposectoreconosForeignKey=new ArrayList();
				this.paissForeignKey=new ArrayList();
				this.ciudadsForeignKey=new ArrayList();
				this.tipovaloracionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyReferenciaComercialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ReferenciaComercialJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyReferenciaComercialListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoSectorEconoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCiudadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoSectorEconoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tiposectoreconosForeignKey==null||this.tiposectoreconosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoSectorEconoConstantesFunciones.getArrayColumnasGlobalesTipoSectorEcono(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoSectorEconoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoSectorEconoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoSectorEconosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyTipoValoracionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoValoracionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyReferenciaComercialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ReferenciaComercialParameterReturnGeneral referenciacomercialReturnGeneral=new ReferenciaComercialParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargarid_empresaReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargarid_empresaReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargaridclienteReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargaridclienteReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoSectorEcono="";

				if(((this.tiposectoreconosForeignKey==null||this.tiposectoreconosForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargaridvalorclientesectoreconomicoReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargaridvalorclientesectoreconomicoReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoSectorEcono()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoSectorEconoConstantesFunciones.getArrayColumnasGlobalesTipoSectorEcono(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoSectorEcono=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoSectorEconoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoSectorEcono=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoSectorEcono, "");
						finalQueryGlobalTipoSectorEcono+=TipoSectorEconoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoSectorEconosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoSectorEcono=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidTipoSectorEconoActual();
					}
				} else {
					finalQueryGlobalTipoSectorEcono="NONE";
				}


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargarid_paisReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargarid_paisReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}


				String finalQueryGlobalCiudad="";

				if(cargarCombosDependencia && ((this.ciudadsForeignKey==null||this.ciudadsForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargaridciudadReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargaridciudadReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CiudadConstantesFunciones.getArrayColumnasGlobalesCiudad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCiudad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CiudadConstantesFunciones.TABLENAME);

						finalQueryGlobalCiudad=Funciones.GetFinalQueryAppend(finalQueryGlobalCiudad, "");
						finalQueryGlobalCiudad+=CiudadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCiudadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCiudad=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidCiudadActual();
					}
				} else {
					finalQueryGlobalCiudad="NONE";
				}


				String finalQueryGlobalTipoValoracion="";

				if(((this.tipovaloracionsForeignKey==null||this.tipovaloracionsForeignKey.size()<=0) && this.referenciacomercialConstantesFunciones.cargarid_tipo_valoracionReferenciaComercial)
					 || (this.esRecargarFks && this.referenciacomercialConstantesFunciones.cargarid_tipo_valoracionReferenciaComercial)) {

					if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoValoracionConstantesFunciones.getArrayColumnasGlobalesTipoValoracion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoValoracion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValoracionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoValoracion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoValoracion, "");
						finalQueryGlobalTipoValoracion+=TipoValoracionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoValoracionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoValoracion=" WHERE " + ConstantesSql.ID + "="+referenciacomercialSessionBean.getlidTipoValoracionActual();
					}
				} else {
					finalQueryGlobalTipoValoracion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				referenciacomercialReturnGeneral=referenciacomercialLogic.cargarCombosLoteForeignKeyReferenciaComercial(finalQueryGlobalEmpresa,finalQueryGlobalCliente,finalQueryGlobalTipoSectorEcono,finalQueryGlobalPais,finalQueryGlobalCiudad,finalQueryGlobalTipoValoracion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=referenciacomercialReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=referenciacomercialReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoSectorEcono.equals("NONE")) {
				this.tiposectoreconosForeignKey=referenciacomercialReturnGeneral.gettiposectoreconosForeignKey();
			}

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=referenciacomercialReturnGeneral.getpaissForeignKey();
			}

			if(!finalQueryGlobalCiudad.equals("NONE")) {
				this.ciudadsForeignKey=referenciacomercialReturnGeneral.getciudadsForeignKey();
			}

			if(!finalQueryGlobalTipoValoracion.equals("NONE")) {
				this.tipovaloracionsForeignKey=referenciacomercialReturnGeneral.gettipovaloracionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyReferenciaComercial()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoSectorEcono();
			this.addItemDefectoCombosForeignKeyPais();
			this.addItemDefectoCombosForeignKeyCiudad();
			this.addItemDefectoCombosForeignKeyTipoValoracion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.referenciacomercialSessionBean==null) {
				this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoSectorEcono()throws Exception {
		try {

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoSectorEcono()) {
				TipoSectorEcono tiposectorecono=new TipoSectorEcono();
				TipoSectorEconoConstantesFunciones.setTipoSectorEconoDescripcion(tiposectorecono,Constantes.SMENSAJE_ESCOJA_OPCION);
				tiposectorecono.setId(null);

				if(!TipoSectorEconoConstantesFunciones.ExisteEnLista(this.tiposectoreconosForeignKey,tiposectorecono,true)) {

					this.tiposectoreconosForeignKey.add(0,tiposectorecono);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionCiudad()) {
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

	public void addItemDefectoCombosForeignKeyTipoValoracion()throws Exception {
		try {

			if(!this.referenciacomercialSessionBean.getisBusquedaDesdeForeignKeySesionTipoValoracion()) {
				TipoValoracion tipovaloracion=new TipoValoracion();
				TipoValoracionConstantesFunciones.setTipoValoracionDescripcion(tipovaloracion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovaloracion.setId(null);

				if(!TipoValoracionConstantesFunciones.ExisteEnLista(this.tipovaloracionsForeignKey,tipovaloracion,true)) {

					this.tipovaloracionsForeignKey.add(0,tipovaloracion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaComercial()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyPais("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyReferenciaComercial(String sFormularioTipoBusqueda)throws Exception {
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
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.addItemListener(new ComboBoxItemListener(this,"id_paisReferenciaComercial"));
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.addFocusListener(new ComboBoxFocusListener(this,"id_paisReferenciaComercial"));
					}
				} else {
					if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.addActionListener(new ComboBoxActionListener(this,"id_paisReferenciaComercial"));
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.addFocusListener(new ComboBoxFocusListener(this,"id_paisReferenciaComercial"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_paisFK_IdPaisReferenciaComercial.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_paisFK_IdPaisReferenciaComercial"));

						this.jComboBoxid_paisFK_IdPaisReferenciaComercial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisReferenciaComercial"));

					} else {
						this.jComboBoxid_paisFK_IdPaisReferenciaComercial.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_paisFK_IdPaisReferenciaComercial"));

						this.jComboBoxid_paisFK_IdPaisReferenciaComercial.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_paisFK_IdPaisReferenciaComercial"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyReferenciaComercial()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaComercial();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyReferenciaComercial(ReferenciaComercial referenciacomercial)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(referenciacomercial.getidcliente(),false,"Formulario");
			this.setActualTipoSectorEconoForeignKey(referenciacomercial.getidvalorclientesectoreconomico(),false,"Formulario");
			this.setActualPaisForeignKey(referenciacomercial.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(referenciacomercial.getidciudad(),false,"Formulario");
			this.setActualTipoValoracionForeignKey(referenciacomercial.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyReferenciaComercial(ReferenciaComercial referenciacomercial,String sTipoEvento)throws Exception {	
		try {
			
			

				if(referenciacomercial.getCliente()!=null && !sTipoEvento.equals("idclienteReferenciaComercial")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(referenciacomercial.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyReferenciaComercial()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.referenciacomercialConstantesFunciones.getidcliente(),false,"Formulario");
			this.setActualTipoSectorEconoForeignKey(this.referenciacomercialConstantesFunciones.getidvalorclientesectoreconomico(),false,"Formulario");
			this.setActualPaisForeignKey(this.referenciacomercialConstantesFunciones.getid_pais(),false,"Formulario");
			this.setActualCiudadForeignKey(this.referenciacomercialConstantesFunciones.getidciudad(),false,"Formulario");
			this.setActualTipoValoracionForeignKey(this.referenciacomercialConstantesFunciones.getid_tipo_valoracion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyReferenciaComercial()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyReferenciaComercial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyReferenciaComercial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroReferenciaComercial()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyReferenciaComercial()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoSectorEconosForeignKey("Todos");
			this.cargarCombosFramePaissForeignKey("Todos");
			this.cargarCombosFrameCiudadsForeignKey("Todos");
			this.cargarCombosFrameTipoValoracionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyReferenciaComercial(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoSectorEconosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyReferenciaComercial()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.getItemCount()>0) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormReferenciaComercialPais(JComboBox<?> jComboBoxGenericoPais,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormReferenciaComercialidciudad(jComboBoxGenericoPais,sFormularioTipoBusqueda,"Pais",false);
	}




	
	



	public void recargarFormReferenciaComercialidciudad(JComboBox<?> jComboBoxGenericoCiudad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Pais")){
				this.setActualParaGuardarPaisForeignKey(this.referenciacomercial,jComboBoxGenericoCiudad);
			}

			if(this.referenciacomercial.getid_pais()!=null && this.referenciacomercial.getid_pais()!=0L) {
				sFinalQuery+="  WHERE  id_pais="+this.referenciacomercial.getid_pais();
			} else {
				sFinalQuery+="  WHERE  id_pais=-1";
			}



			//BUCLE RECURSIVO
			this.setActualCiudadForeignKey(this.referenciacomercial.getid_pais(),true,sFormularioTipoBusqueda);

			this.cargarCombosCiudadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameCiudadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ReferenciaComercialBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ReferenciaComercialBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ReferenciaComercialBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean(); 
		this.referenciacomercialConstantesFunciones=new ReferenciaComercialConstantesFunciones(); 
		this.referenciacomercialBean=new ReferenciaComercial();//(this.referenciacomercialConstantesFunciones); 		
		this.referenciacomercialReturnGeneral=new ReferenciaComercialParameterReturnGeneral(); 
		
		this.referenciacomercialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ReferenciaComercialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ReferenciaComercialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ReferenciaComercialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessReferenciaComercial(true);
			
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
			
			this.referenciacomercialConstantesFunciones=new ReferenciaComercialConstantesFunciones(); 
			this.referenciacomercialBean=new ReferenciaComercial();//this.referenciacomercialConstantesFunciones); 			
			this.referenciacomercialReturnGeneral=new ReferenciaComercialParameterReturnGeneral(); 
		
			ReferenciaComercialBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Referencia Comercial Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.referenciacomercial=new ReferenciaComercial();
			this.referenciacomercials = new ArrayList<ReferenciaComercial>();
			this.referenciacomercialsAux = new ArrayList<ReferenciaComercial>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic=new ReferenciaComercialLogic();
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			//this.referenciacomercialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.referenciacomercialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormReferenciaComercial);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaComercial);	
					}
					
					if(this.jInternalFrameImportacionReferenciaComercial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaComercial);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByReferenciaComercial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByReferenciaComercial);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaComercial);
				this.jInternalFrameDetalleFormReferenciaComercial.setVisible(false);
				this.jInternalFrameDetalleFormReferenciaComercial.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaComercial);
					this.jInternalFrameReporteDinamicoReferenciaComercial.setVisible(false);
					this.jInternalFrameReporteDinamicoReferenciaComercial.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionReferenciaComercial!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaComercial);
					this.jInternalFrameImportacionReferenciaComercial.setVisible(false);
					this.jInternalFrameImportacionReferenciaComercial.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByReferenciaComercial!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaComercial);
					this.jInternalFrameOrderByReferenciaComercial.setVisible(false);
					this.jInternalFrameOrderByReferenciaComercial.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idReferenciaComercialActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ReferenciaComercialConstantesFunciones.INUMEROPAGINACION;
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
			
			this.referenciacomercialReturnGeneral=new ReferenciaComercialParameterReturnGeneral();
			
			this.referenciacomercialParameterGeneral=new ReferenciaComercialParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.referenciacomercialLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ReferenciaComercialJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaComercialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),this.referenciacomercialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ReferenciaComercialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),this.referenciacomercialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaDuplicarReferenciaComercial=true;
			this.isVisibilidadCeldaCopiarReferenciaComercial=true;
			this.isVisibilidadCeldaVerFormReferenciaComercial=true;
			this.isVisibilidadCeldaOrdenReferenciaComercial=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			
			
			this.isVisibilidadFK_IdCiudad=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdPais=true;
			this.isVisibilidadFK_IdTipoValoracion=true;
			this.isVisibilidadFK_IdValorClienteSectorEconomico=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosReferenciaComercial();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioReferenciaComercial(false);
			
			this.setPermisosUsuarioReferenciaComercial();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado() 
				|| (this.referenciacomercialSessionBean.getEsGuardarRelacionado() && this.referenciacomercialSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioReferenciaComercialClasesRelacionadas();
			}
			
			if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioReferenciaComercialClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosReferenciaComercial();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualReferenciaComercial();
			}
			
			if(!this.isPermisoBusquedaReferenciaComercial) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioReferenciaComercial,this.isPermisoPaginacionMedioReferenciaComercial,this.isPermisoPaginacionTodoReferenciaComercial);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ReferenciaComercialConstantesFunciones.getTiposSeleccionarReferenciaComercial());
				
				this.tiposColumnasSelect=ReferenciaComercialConstantesFunciones.getTiposSeleccionarReferenciaComercial(true);
				
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
			//if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioReferenciaComercial();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioReferenciaComercial(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioReferenciaComercial(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaComercial() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.tiposectoreconoLogic=new TipoSectorEconoLogic();
			this.paisLogic=new PaisLogic();
			this.ciudadLogic=new CiudadLogic();
			this.tipovaloracionLogic=new TipoValoracionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				referenciacomercialImplementable= (ReferenciaComercialImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaComercialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				referenciacomercialImplementableHome= (ReferenciaComercialImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ReferenciaComercialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.referenciacomercials= new ArrayList<ReferenciaComercial>();
			this.referenciacomercialsEliminados= new ArrayList<ReferenciaComercial>();
						
			this.isEsNuevoReferenciaComercial=false;
			this.esParaAccionDesdeFormularioReferenciaComercial=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tiposectoreconosForeignKey=new ArrayList<TipoSectorEcono>() ;
			this.paissForeignKey=new ArrayList<Pais>() ;
			this.ciudadsForeignKey=new ArrayList<Ciudad>() ;
			this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyReferenciaComercial(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroReferenciaComercial();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ReferenciaComercialBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ReferenciaComercialConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesReferenciaComercial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingReferenciaComercial(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioReferenciaComercial();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioReferenciaComercial();
			}
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasReferenciaComercial.getTabCount(); i++) {
					this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessReferenciaComercial(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ReferenciaComercial: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectReferenciaComercial() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesReferenciaComercial")) {
				iIndex=this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessReferenciaComercial();	
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
	
	public void cargarCombosForeignKeyReferenciaComercial(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyReferenciaComercial(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyReferenciaComercial(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyReferenciaComercialListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyReferenciaComercial();
		
		this.cargarCombosFrameForeignKeyReferenciaComercial();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyReferenciaComercial();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyReferenciaComercial();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoSectorEcono(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoSectorEconoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoSectorEcono();
				this.cargarCombosFrameTipoSectorEconosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoSectorEcono(this.tiposectoreconosForeignKey);

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

	public void cargarCombosForeignKeyTipoValoracion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoValoracionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoValoracion();
				this.cargarCombosFrameTipoValoracionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyPais("Todos");
				}

			this.recargarComboTablaTipoValoracion(this.tipovaloracionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoReferenciaComercialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			
			if(jTableDatosReferenciaComercial.getRowCount()>=1) {
				jTableDatosReferenciaComercial.removeRowSelectionInterval(0, jTableDatosReferenciaComercial.getRowCount()-1);						
			}
			
			this.isEsNuevoReferenciaComercial=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoReferenciaComercial(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesReferenciaComercial(true);			
			//this.referenciacomercial=new ReferenciaComercial();
			//this.referenciacomercial.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaComercial(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaComercial() ;
			
			if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaComercial(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.referenciacomercial);	
			this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);				
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ReferenciaComercial: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarReferenciaComercialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosReferenciaComercial.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosReferenciaComercial.getSelectedRows().length;			
			}
			
			referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoReferenciaComercial--;			
				//ReferenciaComercial referenciacomercialAux= new ReferenciaComercial();			
				//referenciacomercialAux.setId(this.iIdNuevoReferenciaComercial);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ReferenciaComercial referenciacomercialOrigen=new ReferenciaComercial();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ReferenciaComercial referenciacomercialOrigen : referenciacomercialsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							referenciacomercialOrigen =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							referenciacomercialOrigen =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaReferenciaComercial();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.referenciacomercial.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosReferenciaComercial(referenciacomercialOrigen,this.referenciacomercial,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciacomercialLogic.getReferenciaComercials().add(this.referenciacomercialAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciacomercials.add(this.referenciacomercialAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
				
				this.jTableDatosReferenciaComercial.setRowSelectionInterval(this.getIndiceNuevoReferenciaComercial(), this.getIndiceNuevoReferenciaComercial());
				
				int iLastRow =  this.jTableDatosReferenciaComercial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaComercial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaComercial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaComercial(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();									
		
			ReferenciaComercial referenciacomercialOrigen=new ReferenciaComercial();
			ReferenciaComercial referenciacomercialDestino=new ReferenciaComercial();
				
			referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosReferenciaComercial.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || referenciacomercialsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosReferenciaComercial.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialOrigen =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciacomercialOrigen =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						referenciacomercialDestino =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						referenciacomercialDestino =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				referenciacomercialOrigen =referenciacomercialsSeleccionados.get(0);
				referenciacomercialDestino =referenciacomercialsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosReferenciaComercial(referenciacomercialOrigen,referenciacomercialDestino,true,false);
				
				referenciacomercialDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(referenciacomercialDestino,referenciacomercialLogic.getReferenciaComercials());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(referenciacomercialDestino,referenciacomercials);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
				
				//this.jTableDatosReferenciaComercial.setRowSelectionInterval(this.getIndiceNuevoReferenciaComercial(), this.getIndiceNuevoReferenciaComercial());
				
				int iLastRow =  this.jTableDatosReferenciaComercial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosReferenciaComercial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosReferenciaComercial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaComercial(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormReferenciaComercial.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesReferenciaComercial.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasReferenciaComercial.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesReferenciaComercial.setVisible(!isVisible);
			this.jPanelPaginacionReferenciaComercial.setVisible(!isVisible);
			this.jPanelAccionesReferenciaComercial.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameReferenciaComercial();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoReferenciaComercial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionReferenciaComercial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByReferenciaComercial();
			
			this.abrirFrameOrderByReferenciaComercial();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByReferenciaComercial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleReferenciaComercial(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaComercial);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormReferenciaComercial.isMaximum()) {
					this.jInternalFrameDetalleFormReferenciaComercial.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormReferenciaComercial.setSize(this.jInternalFrameDetalleFormReferenciaComercial.iWidthFormulario,this.jInternalFrameDetalleFormReferenciaComercial.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormReferenciaComercial.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormReferenciaComercial.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormReferenciaComercial.isMaximum()) {
						this.jInternalFrameDetalleFormReferenciaComercial.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormReferenciaComercial.jContentPaneDetalleReferenciaComercial.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaComercial.jContentPaneDetalleReferenciaComercial.getWidth(),ReferenciaComercialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormReferenciaComercial.jContentPaneDetalleReferenciaComercial.getWidth(),ReferenciaComercialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormReferenciaComercial.jContentPaneDetalleReferenciaComercial.getWidth(),ReferenciaComercialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormReferenciaComercial.setVisible(true);
	        this.jInternalFrameDetalleFormReferenciaComercial.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByReferenciaComercial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByReferenciaComercial==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByReferenciaComercial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaComercial,false,this);
				} else {
					this.jInternalFrameOrderByReferenciaComercial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByReferenciaComercial,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByReferenciaComercial);
				this.jInternalFrameOrderByReferenciaComercial.setVisible(false);
				this.jInternalFrameOrderByReferenciaComercial.setSelected(false);
				
				this.jInternalFrameOrderByReferenciaComercial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaComercial"));
				
				this.inicializarActualizarBindingTablaOrderByReferenciaComercial();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionReferenciaComercial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionReferenciaComercial==null) {
				
				this.jInternalFrameImportacionReferenciaComercial=new ImportacionJInternalFrame(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionReferenciaComercial);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionReferenciaComercial);
				this.jInternalFrameImportacionReferenciaComercial.setVisible(false);
				this.jInternalFrameImportacionReferenciaComercial.setSelected(false);


				this.jInternalFrameImportacionReferenciaComercial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaComercial"));
				this.jInternalFrameImportacionReferenciaComercial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaComercial"));
				this.jInternalFrameImportacionReferenciaComercial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaComercial"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoReferenciaComercial() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoReferenciaComercial==null) {
				this.jInternalFrameReporteDinamicoReferenciaComercial=new ReporteDinamicoJInternalFrame(ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoReferenciaComercial);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoReferenciaComercial);
				this.jInternalFrameReporteDinamicoReferenciaComercial.setVisible(false);
				this.jInternalFrameReporteDinamicoReferenciaComercial.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaComercial"));
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaComercial"));
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaComercial"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaComercial();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleReferenciaComercial() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormReferenciaComercial);
			
	       	this.jInternalFrameDetalleFormReferenciaComercial.setVisible(false);
	        this.jInternalFrameDetalleFormReferenciaComercial.setSelected(false);
			
			//this.jInternalFrameDetalleFormReferenciaComercial.dispose();
			//this.jInternalFrameDetalleFormReferenciaComercial=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoReferenciaComercial() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoReferenciaComercial.setVisible(true);
	        this.jInternalFrameReporteDinamicoReferenciaComercial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionReferenciaComercial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionReferenciaComercial.setVisible(true);
	        this.jInternalFrameImportacionReferenciaComercial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByReferenciaComercial() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByReferenciaComercial.setVisible(true);
	        this.jInternalFrameOrderByReferenciaComercial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByReferenciaComercial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByReferenciaComercial.setVisible(false);
	        this.jInternalFrameOrderByReferenciaComercial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoReferenciaComercial() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoReferenciaComercial.setVisible(false);
	        this.jInternalFrameReporteDinamicoReferenciaComercial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionReferenciaComercial() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionReferenciaComercial.setVisible(false);
	        this.jInternalFrameImportacionReferenciaComercial.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarReferenciaComercial(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarReferenciaComercial(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesReferenciaComercial(true);
			//this.isEsNuevoReferenciaComercial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesReferenciaComercial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaComercial(false) ;
			
			if(referenciacomercialSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaComercial(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaComercial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaReferenciaComercialActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarReferenciaComercial(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesReferenciaComercial(true);
			//this.isEsNuevoReferenciaComercial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.referenciacomercial.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesReferenciaComercial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesReferenciaComercial(false) ;
			
			if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleReferenciaComercial(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaComercial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.referenciacomercialConstantesFunciones.cargaridclienteReferenciaComercial) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingReferenciaComercial(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaidcliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoSectorEcono(List<TipoSectorEcono> tiposectoreconosForeignKey)throws Exception{
		TableColumn tableColumnTipoSectorEcono=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO));
		TableCellEditor tableCellEditorTipoSectorEcono =tableColumnTipoSectorEcono.getCellEditor();

		TipoSectorEconoTableCell tiposectoreconoTableCellFk=(TipoSectorEconoTableCell)tableCellEditorTipoSectorEcono;

		if(tiposectoreconoTableCellFk!=null) {
			tiposectoreconoTableCellFk.settiposectoreconosForeignKey(tiposectoreconosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tiposectoreconoTableCellFk.setRowActual(intSelectedRow);
			//tiposectoreconoTableCellFk.settiposectoreconosForeignKeyActual(tiposectoreconosForeignKey);
		//}


		if(tiposectoreconoTableCellFk!=null) {
			tiposectoreconoTableCellFk.RecargarTipoSectorEconosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();

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
		TableColumn tableColumnCiudad=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD));
		TableCellEditor tableCellEditorCiudad =tableColumnCiudad.getCellEditor();

		CiudadTableCell ciudadTableCellFk=(CiudadTableCell)tableCellEditorCiudad;

		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.setciudadsForeignKey(ciudadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ciudadTableCellFk.setRowActual(intSelectedRow);
			//ciudadTableCellFk.setciudadsForeignKeyActual(ciudadsForeignKey);
		//}


		if(ciudadTableCellFk!=null) {
			ciudadTableCellFk.RecargarCiudadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoValoracion(List<TipoValoracion> tipovaloracionsForeignKey)throws Exception{
		TableColumn tableColumnTipoValoracion=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION));
		TableCellEditor tableCellEditorTipoValoracion =tableColumnTipoValoracion.getCellEditor();

		TipoValoracionTableCell tipovaloracionTableCellFk=(TipoValoracionTableCell)tableCellEditorTipoValoracion;

		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.settipovaloracionsForeignKey(tipovaloracionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovaloracionTableCellFk.setRowActual(intSelectedRow);
			//tipovaloracionTableCellFk.settipovaloracionsForeignKeyActual(tipovaloracionsForeignKey);
		//}


		if(tipovaloracionTableCellFk!=null) {
			tipovaloracionTableCellFk.RecargarTipoValoracionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaidcliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesReferenciaComercial(false);
			
			//if(!this.isEsNuevoReferenciaComercial) {								
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				
			}
			
			if(this.permiteMantenimiento(this.referenciacomercial)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoReferenciaComercial=true;
					this.inicializarActualizarBindingTablaReferenciaComercial(false);
					this.isEsNuevoReferenciaComercial=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoReferenciaComercial=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoReferenciaComercial=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaComercial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaComercial(false);
				
				this.habilitarDeshabilitarControlesReferenciaComercial(false);
			
												
				
				if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleReferenciaComercial();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoReferenciaComercialActionPerformed(evt,referenciacomercialSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualReferenciaComercial(this.referenciacomercial,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,referenciacomercialSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.referenciacomercial.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				this.referenciacomercial.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				this.referenciacomercial.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.referenciacomercial)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ReferenciaComercialModel) this.jTableDatosReferenciaComercial.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoReferenciaComercial=true;
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
				this.isEsNuevoReferenciaComercial=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesReferenciaComercial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaComercial(false);
				
				this.habilitarDeshabilitarControlesReferenciaComercial(false);
				
				
				
				if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleReferenciaComercial();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosReferenciaComercial.getRowCount()>=1) {
				jTableDatosReferenciaComercial.removeRowSelectionInterval(0, jTableDatosReferenciaComercial.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesReferenciaComercial(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaReferenciaComercial(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesReferenciaComercial(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualReferenciaComercial(false) ;
			
			this.isEsNuevoReferenciaComercial=false;
			
			if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleReferenciaComercial();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingReferenciaComercial(false);
				
				//SI ES MANUAL
				if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualReferenciaComercial();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoReferenciaComercial--;			
			//ReferenciaComercial referenciacomercialAux= new ReferenciaComercial();			
			//referenciacomercialAux.setId(this.iIdNuevoReferenciaComercial);
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaReferenciaComercial();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
			
			this.referenciacomercial.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.referenciacomercialLogic.getReferenciaComercials().add(this.referenciacomercialAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.referenciacomercials.add(this.referenciacomercialAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaReferenciaComercial(false);
			
			this.jTableDatosReferenciaComercial.setRowSelectionInterval(this.getIndiceNuevoReferenciaComercial(), this.getIndiceNuevoReferenciaComercial());
			
			int iLastRow =  this.jTableDatosReferenciaComercial.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosReferenciaComercial.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosReferenciaComercial.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaComercial(false);
			
			//SI ES MANUAL
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaComercial();
			}
			
			//this.abrirFrameTreeReferenciaComercial();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Referencia ComercialES ?", "MANTENIMIENTO DE Referencia Comercial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionReferenciaComercial.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralReferenciaComercial();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.referenciacomercialReturnGeneral=referenciacomercialLogic.procesarImportacionReferenciaComercialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.referenciacomercialParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarReferenciaComercialReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionReferenciaComercial.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionReferenciaComercial.setFileImportacion(this.jInternalFrameImportacionReferenciaComercial.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionReferenciaComercial.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionReferenciaComercial.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionReferenciaComercial.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionReferenciaComercial.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		

		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ReferenciaComercialBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ReferenciaComercialBaseDesign.jrxml";
			
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
			
			this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoSectorEcono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoSectorEcono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoSectorEcono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoSectorEcono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ciudad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ciudad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ciudad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ciudad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CONTACTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntacto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntacto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntacto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntacto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ticuloCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ticuloCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ticuloCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ticuloCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAnios_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAnios_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAnios_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAnios_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMeses_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMeses_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMeses_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMeses_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoValoracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoValoracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoValoracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoValoracion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoMovil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoMovil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoMovil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoMovil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCodigoArea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCodigoArea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCodigoArea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCodigoArea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_MONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="idcliente";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO:
					sNombreCampoCategoria="idvalorclientesectoreconomico";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoria="idciudad";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombreempresa";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoria="contacto";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA:
					sNombreCampoCategoria="articulo_compra";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS:
					sNombreCampoCategoria="numero_anios";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoria="numero_meses";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoria="id_tipo_valoracion";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoria="telefonomovil";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoria="telefonocodigoarea";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="email";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoria="monto";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="idcliente";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO:
					sNombreCampoCategoriaValor="idvalorclientesectoreconomico";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD:
					sNombreCampoCategoriaValor="idciudad";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombreempresa";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CONTACTO:
					sNombreCampoCategoriaValor="contacto";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA:
					sNombreCampoCategoriaValor="articulo_compra";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS:
					sNombreCampoCategoriaValor="numero_anios";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES:
					sNombreCampoCategoriaValor="numero_meses";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION:
					sNombreCampoCategoriaValor="id_tipo_valoracion";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL:
					sNombreCampoCategoriaValor="telefonomovil";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					sNombreCampoCategoriaValor="telefonocodigoarea";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="email";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_MONTO:
					sNombreCampoCategoriaValor="monto";
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idcliente");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Sector Econo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvalorclientesectoreconomico");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ciudad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idciudad");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombreempresa");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CONTACTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Contacto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"contacto");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Articulo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"articulo_compra");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Anios",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_anios");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Meses",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_meses");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Valoracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_valoracion");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Movil",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonomovil");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Codigo Area",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefonocodigoarea");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Email",sNombreCampoCategoria,sNombreCampoCategoriaValor,"email");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_MONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto");
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ReferenciaComercials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.gettiposectorecono_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getciudad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getnombreempresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_CONTACTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getcontacto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getarticulo_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getnumero_anios());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getnumero_meses());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.gettipovaloracion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.gettelefonomovil());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.gettelefonocodigoarea());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getemail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_MONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_MONTO);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getmonto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(ReferenciaComercial referenciacomercial:referenciacomercialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(referenciacomercial.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelReferenciaComercial(row);				
			//	iRow++;
			//}				
			
			//for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelReferenciaComercial(referenciacomercialAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
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
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaComercial(false);
			
			//SI ES MANUAL
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualReferenciaComercial();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaComercial(false);
			
			//SI ES MANUAL
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaComercial();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingReferenciaComercial(false);
			
			//SI ES MANUAL
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualReferenciaComercial();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaReferenciaComercial() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosReferenciaComercial.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosReferenciaComercial.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosReferenciaComercial.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosReferenciaComercial.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosReferenciaComercial.setMinimumSize(dimensionMinimum);
		this.jTableDatosReferenciaComercial.setMaximumSize(dimensionMaximum);
		this.jTableDatosReferenciaComercial.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingReferenciaComercial(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingReferenciaComercial(esInicializar,true);
	}
	
	public void inicializarActualizarBindingReferenciaComercial(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaReferenciaComercial(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesReferenciaComercial(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasReferenciaComercial(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaComercial(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesReferenciaComercial(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualReferenciaComercial() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaReferenciaComercial();
		
		this.inicializarActualizarBindingBotonesManualReferenciaComercial(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaComercial();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaComercial() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaComercial(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaComercial(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosReferenciaComercial.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosReferenciaComercial.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteReferenciaComercial.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionNuevoReferenciaComercial.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionSinCerrarReferenciaComercial.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionSinMensajeReferenciaComercial.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosReferenciaComercial.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosReferenciaComercial.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteReferenciaComercial.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
				this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionNuevoReferenciaComercial.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionSinCerrarReferenciaComercial.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxPostAccionSinMensajeReferenciaComercial.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionReferenciaComercial.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionReferenciaComercial.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesReferenciaComercial.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesReferenciaComercial.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesReferenciaComercial.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarReferenciaComercial.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesReferenciaComercial.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesReferenciaComercial.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralReferenciaComercial.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesReferenciaComercial(Boolean esInicializar) throws Exception {
		try	{	
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualReferenciaComercial(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesReferenciaComercial() throws Exception {
		try	{
			if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaComercial();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaComercial() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualReferenciaComercial() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesReferenciaComercial.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesReferenciaComercial.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesReferenciaComercial.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionReferenciaComercial.addItem(reporte);
			}
			
			
			if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionReferenciaComercial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionReferenciaComercial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesReferenciaComercial.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesReferenciaComercial.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarReferenciaComercial.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarReferenciaComercial.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarReferenciaComercial.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaComercial();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualReferenciaComercial() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
				
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ReferenciaComercialConstantesFunciones.getTiposSeleccionarReferenciaComercial(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ReferenciaComercialConstantesFunciones.getTiposSeleccionarReferenciaComercial(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ReferenciaComercialConstantesFunciones.getTiposSeleccionarReferenciaComercial(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoReferenciaComercial.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualReferenciaComercial()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.getSelectedItem()!=null){this.idciudadFK_IdCiudad=((Ciudad)this.jComboBoxidciudadFK_IdCiudadReferenciaComercial.getSelectedItem()).getId();}
		if(this.jComboBoxidclienteFK_IdClienteReferenciaComercial.getSelectedItem()!=null){this.idclienteFK_IdCliente=((Cliente)this.jComboBoxidclienteFK_IdClienteReferenciaComercial.getSelectedItem()).getId();}
		if(this.jComboBoxid_paisFK_IdPaisReferenciaComercial.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisReferenciaComercial.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.getSelectedItem()!=null){this.id_tipo_valoracionFK_IdTipoValoracion=((TipoValoracion)this.jComboBoxid_tipo_valoracionFK_IdTipoValoracionReferenciaComercial.getSelectedItem()).getId();}
		if(this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.getSelectedItem()!=null){this.idvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico=((TipoSectorEcono)this.jComboBoxidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomicoReferenciaComercial.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasReferenciaComercial(Boolean esInicializar) throws Exception {				
		if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualReferenciaComercial();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaReferenciaComercial() throws Exception {
		this.inicializarActualizarBindingTablaReferenciaComercial(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByReferenciaComercial() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosReferenciaComercialOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercialOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaReferenciaComercial(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=referenciacomercialLogic.getReferenciaComercials().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=referenciacomercials.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosReferenciaComercial.setModel(new ReferenciaComercialModel(this.referenciacomercialLogic.getReferenciaComercials(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosReferenciaComercial.setModel(new ReferenciaComercialModel(this.referenciacomercials,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByReferenciaComercial!=null && this.jInternalFrameOrderByReferenciaComercial.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByReferenciaComercial();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,referenciacomercialConstantesFunciones.resaltarSeleccionarReferenciaComercial,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ReferenciaComercialConstantesFunciones.SCLASSWEBTITULO,referenciacomercialConstantesFunciones.resaltarSeleccionarReferenciaComercial,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_ID));

		if(this.referenciacomercialConstantesFunciones.mostraridReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciacomercialConstantesFunciones.resaltaridReferenciaComercial,this.referenciacomercialConstantesFunciones.activaridReferenciaComercial,iSizeTabla,this,true,"idReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltaridReferenciaComercial,this.referenciacomercialConstantesFunciones.activaridReferenciaComercial,this,true,"idReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA));

		if(this.referenciacomercialConstantesFunciones.mostrarid_empresaReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_empresaReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_empresaReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_empresaReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_empresaReferenciaComercial,false,"id_empresaReferenciaComercial","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE));

		if(this.referenciacomercialConstantesFunciones.mostraridclienteReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.referenciacomercialConstantesFunciones.resaltaridclienteReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridclienteReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.referenciacomercialConstantesFunciones.resaltaridclienteReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridclienteReferenciaComercial,true,"idclienteReferenciaComercial","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO));

		if(this.referenciacomercialConstantesFunciones.mostraridvalorclientesectoreconomicoReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoSectorEconoTableCell(this.tiposectoreconosForeignKey,this.referenciacomercialConstantesFunciones.resaltaridvalorclientesectoreconomicoReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridvalorclientesectoreconomicoReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new TipoSectorEconoTableCell(this.tiposectoreconosForeignKey,this.referenciacomercialConstantesFunciones.resaltaridvalorclientesectoreconomicoReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridvalorclientesectoreconomicoReferenciaComercial,true,"idvalorclientesectoreconomicoReferenciaComercial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDPAIS));

		if(this.referenciacomercialConstantesFunciones.mostrarid_paisReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_paisReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_paisReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_paisReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_paisReferenciaComercial,true,"id_paisReferenciaComercial","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD));

		if(this.referenciacomercialConstantesFunciones.mostraridciudadReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CiudadTableCell(this.ciudadsForeignKey,this.referenciacomercialConstantesFunciones.resaltaridciudadReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridciudadReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new CiudadTableCell(this.ciudadsForeignKey,this.referenciacomercialConstantesFunciones.resaltaridciudadReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activaridciudadReferenciaComercial,true,"idciudadReferenciaComercial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.referenciacomercialConstantesFunciones.mostrarnombreempresaReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltarnombreempresaReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnombreempresaReferenciaComercial,iSizeTabla,this,true,"nombreempresaReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarnombreempresaReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnombreempresaReferenciaComercial,this,true,"nombreempresaReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.referenciacomercialConstantesFunciones.mostrarcodigo_clienteReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltarcodigo_clienteReferenciaComercial,this.referenciacomercialConstantesFunciones.activarcodigo_clienteReferenciaComercial,iSizeTabla,this,true,"codigo_clienteReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarcodigo_clienteReferenciaComercial,this.referenciacomercialConstantesFunciones.activarcodigo_clienteReferenciaComercial,this,true,"codigo_clienteReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_CONTACTO));

		if(this.referenciacomercialConstantesFunciones.mostrarcontactoReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_CONTACTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltarcontactoReferenciaComercial,this.referenciacomercialConstantesFunciones.activarcontactoReferenciaComercial,iSizeTabla,this,true,"contactoReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarcontactoReferenciaComercial,this.referenciacomercialConstantesFunciones.activarcontactoReferenciaComercial,this,true,"contactoReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA));

		if(this.referenciacomercialConstantesFunciones.mostrararticulo_compraReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltararticulo_compraReferenciaComercial,this.referenciacomercialConstantesFunciones.activararticulo_compraReferenciaComercial,iSizeTabla,this,true,"articulo_compraReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltararticulo_compraReferenciaComercial,this.referenciacomercialConstantesFunciones.activararticulo_compraReferenciaComercial,this,true,"articulo_compraReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS));

		if(this.referenciacomercialConstantesFunciones.mostrarnumero_aniosReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciacomercialConstantesFunciones.resaltarnumero_aniosReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnumero_aniosReferenciaComercial,iSizeTabla,this,true,"numero_aniosReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarnumero_aniosReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnumero_aniosReferenciaComercial,this,true,"numero_aniosReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES));

		if(this.referenciacomercialConstantesFunciones.mostrarnumero_mesesReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciacomercialConstantesFunciones.resaltarnumero_mesesReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnumero_mesesReferenciaComercial,iSizeTabla,this,true,"numero_mesesReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarnumero_mesesReferenciaComercial,this.referenciacomercialConstantesFunciones.activarnumero_mesesReferenciaComercial,this,true,"numero_mesesReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION));

		if(this.referenciacomercialConstantesFunciones.mostrarid_tipo_valoracionReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_tipo_valoracionReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_tipo_valoracionReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new TipoValoracionTableCell(this.tipovaloracionsForeignKey,this.referenciacomercialConstantesFunciones.resaltarid_tipo_valoracionReferenciaComercial,this,this.referenciacomercialConstantesFunciones.activarid_tipo_valoracionReferenciaComercial,true,"id_tipo_valoracionReferenciaComercial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_DIRECCION));

		if(this.referenciacomercialConstantesFunciones.mostrardireccionReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltardireccionReferenciaComercial,this.referenciacomercialConstantesFunciones.activardireccionReferenciaComercial,iSizeTabla,this,true,"direccionReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltardireccionReferenciaComercial,this.referenciacomercialConstantesFunciones.activardireccionReferenciaComercial,this,true,"direccionReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_TELEFONO));

		if(this.referenciacomercialConstantesFunciones.mostrartelefonoReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonoReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonoReferenciaComercial,iSizeTabla,this,true,"telefonoReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonoReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonoReferenciaComercial,this,true,"telefonoReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL));

		if(this.referenciacomercialConstantesFunciones.mostrartelefonomovilReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonomovilReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonomovilReferenciaComercial,iSizeTabla,this,true,"telefonomovilReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonomovilReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonomovilReferenciaComercial,this,true,"telefonomovilReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA));

		if(this.referenciacomercialConstantesFunciones.mostrartelefonocodigoareaReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonocodigoareaReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonocodigoareaReferenciaComercial,iSizeTabla,this,true,"telefonocodigoareaReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltartelefonocodigoareaReferenciaComercial,this.referenciacomercialConstantesFunciones.activartelefonocodigoareaReferenciaComercial,this,true,"telefonocodigoareaReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_EMAIL));

		if(this.referenciacomercialConstantesFunciones.mostraremailReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.referenciacomercialConstantesFunciones.resaltaremailReferenciaComercial,this.referenciacomercialConstantesFunciones.activaremailReferenciaComercial,iSizeTabla,this,true,"emailReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltaremailReferenciaComercial,this.referenciacomercialConstantesFunciones.activaremailReferenciaComercial,this,true,"emailReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_MONTO));

		if(this.referenciacomercialConstantesFunciones.mostrarmontoReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_MONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.referenciacomercialConstantesFunciones.resaltarmontoReferenciaComercial,this.referenciacomercialConstantesFunciones.activarmontoReferenciaComercial,iSizeTabla,this,true,"montoReferenciaComercial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.referenciacomercialConstantesFunciones.resaltarmontoReferenciaComercial,this.referenciacomercialConstantesFunciones.activarmontoReferenciaComercial,this,true,"montoReferenciaComercial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO));

		if(this.referenciacomercialConstantesFunciones.mostraresactivoReferenciaComercial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.referenciacomercialConstantesFunciones.resaltaresactivoReferenciaComercial,this.referenciacomercialConstantesFunciones.activaresactivoReferenciaComercial,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.referenciacomercialConstantesFunciones.resaltaresactivoReferenciaComercial,this.referenciacomercialConstantesFunciones.activaresactivoReferenciaComercial,this,true,"esactivoReferenciaComercial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ReferenciaComercialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaComercial.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosReferenciaComercial.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.referenciacomercialSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosReferenciaComercial.addColumn(tableColumn);
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
			
			this.jTableDatosReferenciaComercial.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosReferenciaComercial.moveColumn(this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosReferenciaComercial.moveColumn(this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosReferenciaComercial.moveColumn(this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosReferenciaComercial.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosReferenciaComercial.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosReferenciaComercial,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosReferenciaComercial.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosReferenciaComercial.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosReferenciaComercial.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosReferenciaComercial.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosReferenciaComercial.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=referenciacomercialLogic.getReferenciaComercials().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=referenciacomercials.size()-1;
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
		//this.jTableDatosReferenciaComercial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosReferenciaComercial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosReferenciaComercial();
			
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
				
				//this.isEsNuevoReferenciaComercial=false;
					
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormReferenciaComercial==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaComercial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.referenciacomercial.getsType().equals("DUPLICADO")
				   || this.referenciacomercial.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoReferenciaComercial=true;
				
				} else {
					this.isEsNuevoReferenciaComercial=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					if(this.referenciacomercial.getId()>=0 && !this.referenciacomercial.getIsNew()) {						
						this.isEsNuevoReferenciaComercial=false;
						
					} else {
						this.isEsNuevoReferenciaComercial=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoReferenciaComercial(esRelaciones);						
				
				this.seleccionarReferenciaComercial(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.referenciacomercial.getId()<0) {
					this.isEsNuevoReferenciaComercial=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarReferenciaComercial(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarReferenciaComercial(evt,rowIndex);
				}	
				
				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ReferenciaComercial: " + this.dDif); 
					}
				}								
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarReferenciaComercial(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.referenciacomercial)) {
					if(this.referenciacomercial.getId()>0) {
						this.referenciacomercial.setIsDeleted(true);
						
						this.referenciacomercialsEliminados.add(this.referenciacomercial);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.referenciacomercialLogic.getReferenciaComercials().remove(this.referenciacomercial);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.referenciacomercials.remove(this.referenciacomercial);				
					}
					
					
					((ReferenciaComercialModel) this.jTableDatosReferenciaComercial.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaReferenciaComercial(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarReferenciaComercial(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoReferenciaComercial) {
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosReferenciaComercial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosReferenciaComercial.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioReferenciaComercial(this.referenciacomercial);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.referenciacomercialConstantesFunciones.cargarid_empresaReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependid_empresaReferenciaComercial) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.referenciacomercial.getid_empresa());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(referenciacomercial.getEmpresa()!=null) {
							this.empresasForeignKey.add(referenciacomercial.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.referenciacomercial.getid_empresa(),false,"Formulario");

					//Cliente
					if(!this.referenciacomercialConstantesFunciones.cargaridclienteReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependidclienteReferenciaComercial) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.referenciacomercial.getidcliente());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(referenciacomercial.getCliente()!=null) {
							this.clientesForeignKey.add(referenciacomercial.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.referenciacomercial.getidcliente(),false,"Formulario");

					//TipoSectorEcono
					if(!this.referenciacomercialConstantesFunciones.cargaridvalorclientesectoreconomicoReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependidvalorclientesectoreconomicoReferenciaComercial) {
						//this.cargarCombosTipoSectorEconosForeignKeyLista(" where id="+this.referenciacomercial.getidvalorclientesectoreconomico());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.tiposectoreconosForeignKey=new ArrayList<TipoSectorEcono>();

						if(referenciacomercial.getTipoSectorEcono()!=null) {
							this.tiposectoreconosForeignKey.add(referenciacomercial.getTipoSectorEcono());
						}

						this.addItemDefectoCombosForeignKeyTipoSectorEcono();
						this.cargarCombosFrameTipoSectorEconosForeignKey("Todos");
					}
					this.setActualTipoSectorEconoForeignKey(this.referenciacomercial.getidvalorclientesectoreconomico(),false,"Formulario");

					//Pais
					if(!this.referenciacomercialConstantesFunciones.cargarid_paisReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependid_paisReferenciaComercial) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.referenciacomercial.getid_pais());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(referenciacomercial.getPais()!=null) {
							this.paissForeignKey.add(referenciacomercial.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.referenciacomercial.getid_pais(),false,"Formulario");

					//Ciudad
					if(!this.referenciacomercialConstantesFunciones.cargaridciudadReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependidciudadReferenciaComercial) {
						//this.cargarCombosCiudadsForeignKeyLista(" where id="+this.referenciacomercial.getidciudad());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.ciudadsForeignKey=new ArrayList<Ciudad>();

						if(referenciacomercial.getCiudad()!=null) {
							this.ciudadsForeignKey.add(referenciacomercial.getCiudad());
						}

						this.addItemDefectoCombosForeignKeyCiudad();
						this.cargarCombosFrameCiudadsForeignKey("Todos");
					}
					this.setActualCiudadForeignKey(this.referenciacomercial.getidciudad(),false,"Formulario");

					//TipoValoracion
					if(!this.referenciacomercialConstantesFunciones.cargarid_tipo_valoracionReferenciaComercial || this.referenciacomercialConstantesFunciones.event_dependid_tipo_valoracionReferenciaComercial) {
						//this.cargarCombosTipoValoracionsForeignKeyLista(" where id="+this.referenciacomercial.getid_tipo_valoracion());
									//this.inicializarActualizarBindingReferenciaComercial(false,false);
						this.tipovaloracionsForeignKey=new ArrayList<TipoValoracion>();

						if(referenciacomercial.getTipoValoracion()!=null) {
							this.tipovaloracionsForeignKey.add(referenciacomercial.getTipoValoracion());
						}

						this.addItemDefectoCombosForeignKeyTipoValoracion();
						this.cargarCombosFrameTipoValoracionsForeignKey("Todos");
					}
					this.setActualTipoValoracionForeignKey(this.referenciacomercial.getid_tipo_valoracion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesReferenciaComercial("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesReferenciaComercial(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualReferenciaComercial() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaComercial(ReferenciaComercial referenciacomercial) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoReferenciaComercial(referenciacomercial,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoReferenciaComercial(ReferenciaComercial referenciacomercial,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioReferenciaComercial(referenciacomercial);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyReferenciaComercial(referenciacomercial,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyReferenciaComercial(referenciacomercial);
	}
	
	public void setVariablesObjetoActualToFormularioReferenciaComercial(ReferenciaComercial referenciacomercial) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setText(referenciacomercial.getId().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setText(referenciacomercial.getnombreempresa());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setText(referenciacomercial.getcodigo_cliente());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setText(referenciacomercial.getcontacto());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setText(referenciacomercial.getarticulo_compra());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setText(referenciacomercial.getnumero_anios().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setText(referenciacomercial.getnumero_meses().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setText(referenciacomercial.getdireccion());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setText(referenciacomercial.gettelefono());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setText(referenciacomercial.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setText(referenciacomercial.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setText(referenciacomercial.getemail());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setText(referenciacomercial.getmonto().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setSelected(referenciacomercial.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ReferenciaComercial referenciacomercialLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,referenciacomercialLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ReferenciaComercial referenciacomercialLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				referenciacomercialLocal=this.referenciacomercial;
			} else {
				referenciacomercialLocal=this.referenciacomercialAnterior;
			}
		}
		
		if(this.permiteMantenimiento(referenciacomercialLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoReferenciaComercial(referenciacomercialLocal,true);
					
					if(referenciacomercialSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(referenciacomercialLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(referenciacomercialLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoReferenciaComercial(ReferenciaComercial referenciacomercial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaComercial(referenciacomercial,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(referenciacomercial);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaComercial(ReferenciaComercial referenciacomercial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualReferenciaComercial(referenciacomercial,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualReferenciaComercial(ReferenciaComercial referenciacomercial,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.getText()==null || this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.getText()=="" || this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.getText()=="Id") {
				this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setText("0");
			}

			if(conColumnasBase) {referenciacomercial.setId(Long.parseLong(this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelIdReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setnombreempresa(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnombreempresaReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setcodigo_cliente(this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcodigo_clienteReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setcontacto(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_CONTACTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelcontactoReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setarticulo_compra(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelarticulo_compraReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setnumero_anios(Integer.parseInt(this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_aniosReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setnumero_meses(Integer.parseInt(this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelnumero_mesesReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setdireccion(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeldireccionReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.settelefono(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonoReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.settelefonomovil(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonomovilReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.settelefonocodigoarea(this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabeltelefonocodigoareaReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setemail(this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelemailReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setmonto(Double.parseDouble(this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_MONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelmontoReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			referenciacomercial.setesactivo(this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormReferenciaComercial.jLabelesactivoReferenciaComercial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualReferenciaComercial(ReferenciaComercial referenciacomercialBean,ReferenciaComercial referenciacomercial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && referenciacomercialBean.getidcliente()!=null && !referenciacomercialBean.getidcliente().equals(-1L))) {referenciacomercial.setidcliente(referenciacomercialBean.getidcliente());}
			if(conDefault || (!conDefault && referenciacomercialBean.getidvalorclientesectoreconomico()!=null && !referenciacomercialBean.getidvalorclientesectoreconomico().equals(-1L))) {referenciacomercial.setidvalorclientesectoreconomico(referenciacomercialBean.getidvalorclientesectoreconomico());}
			if(conDefault || (!conDefault && referenciacomercialBean.getid_pais()!=null && !referenciacomercialBean.getid_pais().equals(-1L))) {referenciacomercial.setid_pais(referenciacomercialBean.getid_pais());}
			if(conDefault || (!conDefault && referenciacomercialBean.getidciudad()!=null && !referenciacomercialBean.getidciudad().equals(-1L))) {referenciacomercial.setidciudad(referenciacomercialBean.getidciudad());}
			if(conDefault || (!conDefault && referenciacomercialBean.getid_tipo_valoracion()!=null && !referenciacomercialBean.getid_tipo_valoracion().equals(-1L))) {referenciacomercial.setid_tipo_valoracion(referenciacomercialBean.getid_tipo_valoracion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosReferenciaComercial(ReferenciaComercial referenciacomercialOrigen,ReferenciaComercial referenciacomercial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciacomercialOrigen.getId()!=null && !referenciacomercialOrigen.getId().equals(0L))) {referenciacomercial.setId(referenciacomercialOrigen.getId());}}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getidcliente()!=null && !referenciacomercialOrigen.getidcliente().equals(-1L))) {referenciacomercial.setidcliente(referenciacomercialOrigen.getidcliente());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getidvalorclientesectoreconomico()!=null && !referenciacomercialOrigen.getidvalorclientesectoreconomico().equals(-1L))) {referenciacomercial.setidvalorclientesectoreconomico(referenciacomercialOrigen.getidvalorclientesectoreconomico());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getid_pais()!=null && !referenciacomercialOrigen.getid_pais().equals(-1L))) {referenciacomercial.setid_pais(referenciacomercialOrigen.getid_pais());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getidciudad()!=null && !referenciacomercialOrigen.getidciudad().equals(-1L))) {referenciacomercial.setidciudad(referenciacomercialOrigen.getidciudad());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getnombreempresa()!=null && !referenciacomercialOrigen.getnombreempresa().equals(""))) {referenciacomercial.setnombreempresa(referenciacomercialOrigen.getnombreempresa());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getcodigo_cliente()!=null && !referenciacomercialOrigen.getcodigo_cliente().equals(""))) {referenciacomercial.setcodigo_cliente(referenciacomercialOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getcontacto()!=null && !referenciacomercialOrigen.getcontacto().equals(""))) {referenciacomercial.setcontacto(referenciacomercialOrigen.getcontacto());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getarticulo_compra()!=null && !referenciacomercialOrigen.getarticulo_compra().equals(""))) {referenciacomercial.setarticulo_compra(referenciacomercialOrigen.getarticulo_compra());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getnumero_anios()!=null && !referenciacomercialOrigen.getnumero_anios().equals(0))) {referenciacomercial.setnumero_anios(referenciacomercialOrigen.getnumero_anios());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getnumero_meses()!=null && !referenciacomercialOrigen.getnumero_meses().equals(0))) {referenciacomercial.setnumero_meses(referenciacomercialOrigen.getnumero_meses());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getid_tipo_valoracion()!=null && !referenciacomercialOrigen.getid_tipo_valoracion().equals(-1L))) {referenciacomercial.setid_tipo_valoracion(referenciacomercialOrigen.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getdireccion()!=null && !referenciacomercialOrigen.getdireccion().equals(""))) {referenciacomercial.setdireccion(referenciacomercialOrigen.getdireccion());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.gettelefono()!=null && !referenciacomercialOrigen.gettelefono().equals(""))) {referenciacomercial.settelefono(referenciacomercialOrigen.gettelefono());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.gettelefonomovil()!=null && !referenciacomercialOrigen.gettelefonomovil().equals(""))) {referenciacomercial.settelefonomovil(referenciacomercialOrigen.gettelefonomovil());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.gettelefonocodigoarea()!=null && !referenciacomercialOrigen.gettelefonocodigoarea().equals(""))) {referenciacomercial.settelefonocodigoarea(referenciacomercialOrigen.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getemail()!=null && !referenciacomercialOrigen.getemail().equals(""))) {referenciacomercial.setemail(referenciacomercialOrigen.getemail());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getmonto()!=null && !referenciacomercialOrigen.getmonto().equals(0.0))) {referenciacomercial.setmonto(referenciacomercialOrigen.getmonto());}
			if(conDefault || (!conDefault && referenciacomercialOrigen.getesactivo()!=null && !referenciacomercialOrigen.getesactivo().equals(false))) {referenciacomercial.setesactivo(referenciacomercialOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaComercial(ReferenciaComercial referenciacomercial) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setText(referenciacomercial.getId().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setText(referenciacomercial.getnombreempresa());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setText(referenciacomercial.getcodigo_cliente());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setText(referenciacomercial.getcontacto());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setText(referenciacomercial.getarticulo_compra());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setText(referenciacomercial.getnumero_anios().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setText(referenciacomercial.getnumero_meses().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setText(referenciacomercial.getdireccion());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setText(referenciacomercial.gettelefono());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setText(referenciacomercial.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setText(referenciacomercial.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setText(referenciacomercial.getemail());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setText(referenciacomercial.getmonto().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setSelected(referenciacomercial.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioReferenciaComercial(ReferenciaComercialBean referenciacomercialBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setText(referenciacomercialBean.getId().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setText(referenciacomercialBean.getnombreempresa());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setText(referenciacomercialBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setText(referenciacomercialBean.getcontacto());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setText(referenciacomercialBean.getarticulo_compra());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setText(referenciacomercialBean.getnumero_anios().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setText(referenciacomercialBean.getnumero_meses().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setText(referenciacomercialBean.getdireccion());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setText(referenciacomercialBean.gettelefono());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setText(referenciacomercialBean.gettelefonomovil());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setText(referenciacomercialBean.gettelefonocodigoarea());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setText(referenciacomercialBean.getemail());
			this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setText(referenciacomercialBean.getmonto().toString());
			this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setSelected(referenciacomercialBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanReferenciaComercial(ReferenciaComercialParameterReturnGeneral referenciacomercialReturnGeneral,ReferenciaComercialBean referenciacomercialBean,Boolean conDefault) throws Exception { 
		try {
			ReferenciaComercial referenciacomercialLocal=new ReferenciaComercial();
			
			referenciacomercialLocal=referenciacomercialReturnGeneral.getReferenciaComercial();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && referenciacomercialLocal.getId()!=null && !referenciacomercialLocal.getId().equals(0L))) {referenciacomercialBean.setId(referenciacomercialLocal.getId());}}
			if(conDefault || (!conDefault && referenciacomercialLocal.getidcliente()!=null && !referenciacomercialLocal.getidcliente().equals(-1L))) {referenciacomercialBean.setidcliente(referenciacomercialLocal.getidcliente());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getidvalorclientesectoreconomico()!=null && !referenciacomercialLocal.getidvalorclientesectoreconomico().equals(-1L))) {referenciacomercialBean.setidvalorclientesectoreconomico(referenciacomercialLocal.getidvalorclientesectoreconomico());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getid_pais()!=null && !referenciacomercialLocal.getid_pais().equals(-1L))) {referenciacomercialBean.setid_pais(referenciacomercialLocal.getid_pais());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getidciudad()!=null && !referenciacomercialLocal.getidciudad().equals(-1L))) {referenciacomercialBean.setidciudad(referenciacomercialLocal.getidciudad());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getnombreempresa()!=null && !referenciacomercialLocal.getnombreempresa().equals(""))) {referenciacomercialBean.setnombreempresa(referenciacomercialLocal.getnombreempresa());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getcodigo_cliente()!=null && !referenciacomercialLocal.getcodigo_cliente().equals(""))) {referenciacomercialBean.setcodigo_cliente(referenciacomercialLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getcontacto()!=null && !referenciacomercialLocal.getcontacto().equals(""))) {referenciacomercialBean.setcontacto(referenciacomercialLocal.getcontacto());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getarticulo_compra()!=null && !referenciacomercialLocal.getarticulo_compra().equals(""))) {referenciacomercialBean.setarticulo_compra(referenciacomercialLocal.getarticulo_compra());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getnumero_anios()!=null && !referenciacomercialLocal.getnumero_anios().equals(0))) {referenciacomercialBean.setnumero_anios(referenciacomercialLocal.getnumero_anios());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getnumero_meses()!=null && !referenciacomercialLocal.getnumero_meses().equals(0))) {referenciacomercialBean.setnumero_meses(referenciacomercialLocal.getnumero_meses());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getid_tipo_valoracion()!=null && !referenciacomercialLocal.getid_tipo_valoracion().equals(-1L))) {referenciacomercialBean.setid_tipo_valoracion(referenciacomercialLocal.getid_tipo_valoracion());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getdireccion()!=null && !referenciacomercialLocal.getdireccion().equals(""))) {referenciacomercialBean.setdireccion(referenciacomercialLocal.getdireccion());}
			if(conDefault || (!conDefault && referenciacomercialLocal.gettelefono()!=null && !referenciacomercialLocal.gettelefono().equals(""))) {referenciacomercialBean.settelefono(referenciacomercialLocal.gettelefono());}
			if(conDefault || (!conDefault && referenciacomercialLocal.gettelefonomovil()!=null && !referenciacomercialLocal.gettelefonomovil().equals(""))) {referenciacomercialBean.settelefonomovil(referenciacomercialLocal.gettelefonomovil());}
			if(conDefault || (!conDefault && referenciacomercialLocal.gettelefonocodigoarea()!=null && !referenciacomercialLocal.gettelefonocodigoarea().equals(""))) {referenciacomercialBean.settelefonocodigoarea(referenciacomercialLocal.gettelefonocodigoarea());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getemail()!=null && !referenciacomercialLocal.getemail().equals(""))) {referenciacomercialBean.setemail(referenciacomercialLocal.getemail());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getmonto()!=null && !referenciacomercialLocal.getmonto().equals(0.0))) {referenciacomercialBean.setmonto(referenciacomercialLocal.getmonto());}
			if(conDefault || (!conDefault && referenciacomercialLocal.getesactivo()!=null && !referenciacomercialLocal.getesactivo().equals(false))) {referenciacomercialBean.setesactivo(referenciacomercialLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxReferenciaComercialGenerico(Long idReferenciaComercialSeleccionado,JComboBox jComboBoxReferenciaComercial,List<ReferenciaComercial> referenciacomercialsLocal)throws Exception {
		try {
			ReferenciaComercial  referenciacomercialTemp=null;

			for(ReferenciaComercial referenciacomercialAux:referenciacomercialsLocal) {
				if(referenciacomercialAux.getId()!=null && referenciacomercialAux.getId().equals(idReferenciaComercialSeleccionado)) {
					referenciacomercialTemp=referenciacomercialAux;
					break;
				}
			}

			jComboBoxReferenciaComercial.setSelectedItem(referenciacomercialTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxReferenciaComercialGenerico(JComboBox jComboBoxReferenciaComercial,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaComercial.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxReferenciaComercial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxReferenciaComercial.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxReferenciaComercial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxReferenciaComercial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxReferenciaComercial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciacomercial=(ReferenciaComercial) referenciacomercialLogic.getReferenciaComercials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciacomercial =(ReferenciaComercial) referenciacomercials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=referenciacomercial.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=referenciacomercial.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoSectorEcono")) {
			//sDescripcion=this.getActualTipoSectorEconoForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.gettiposectorecono_descripcion();
			} else {
				//sDescripcion=this.getActualTipoSectorEconoForeignKeyDescripcion((Long)value);
				sDescripcion=referenciacomercial.gettiposectorecono_descripcion();
			}
		}

		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=referenciacomercial.getpais_descripcion();
			}
		}

		if(sTipo.equals("Ciudad")) {
			//sDescripcion=this.getActualCiudadForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.getciudad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=referenciacomercial.getciudad_descripcion();
			}
		}

		if(sTipo.equals("TipoValoracion")) {
			//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
			if(!referenciacomercial.getIsNew() && !referenciacomercial.getIsChanged() && !referenciacomercial.getIsDeleted()) {
				sDescripcion=referenciacomercial.gettipovaloracion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoValoracionForeignKeyDescripcion((Long)value);
				sDescripcion=referenciacomercial.gettipovaloracion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ReferenciaComercial referenciacomercialRow=new ReferenciaComercial();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciacomercialRow=(ReferenciaComercial) referenciacomercialLogic.getReferenciaComercials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			referenciacomercialRow=(ReferenciaComercial) referenciacomercials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualReferenciaComercial(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial));			
			this.jButtonDuplicarReferenciaComercial.setVisible((this.isVisibilidadCeldaDuplicarReferenciaComercial && this.isPermisoDuplicarReferenciaComercial));			
			this.jButtonCopiarReferenciaComercial.setVisible((this.isVisibilidadCeldaCopiarReferenciaComercial && this.isPermisoCopiarReferenciaComercial));
			this.jButtonVerFormReferenciaComercial.setVisible((this.isVisibilidadCeldaVerFormReferenciaComercial && this.isPermisoVerFormReferenciaComercial));
			
			this.jButtonAbrirOrderByReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));			
			
			this.jButtonNuevoRelacionesReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial && this.isPermisoNuevoReferenciaComercial));			
			this.jButtonNuevoGuardarCambiosReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarReferenciaComercial.setVisible((this.isVisibilidadCeldaModificarReferenciaComercial && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.setVisible((this.isVisibilidadCeldaActualizarReferenciaComercial && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.setVisible((this.isVisibilidadCeldaEliminarReferenciaComercial && this.isPermisoEliminarReferenciaComercial));
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.setVisible(this.isVisibilidadCeldaCancelarReferenciaComercial);							
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));			
			
			}
						
			this.jButtonGuardarCambiosTablaReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial));						
			this.jButtonDuplicarToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaDuplicarReferenciaComercial && this.isPermisoDuplicarReferenciaComercial));						
			this.jButtonCopiarToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaCopiarReferenciaComercial && this.isPermisoCopiarReferenciaComercial));			
			this.jButtonVerFormToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaVerFormReferenciaComercial && this.isPermisoVerFormReferenciaComercial));			
			this.jButtonAbrirOrderByToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));
			this.jButtonNuevoRelacionesToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial && this.isPermisoNuevoReferenciaComercial));			
			this.jButtonNuevoGuardarCambiosToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));			
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaModificarReferenciaComercial && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaActualizarReferenciaComercial  && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaEliminarReferenciaComercial && this.isPermisoEliminarReferenciaComercial));
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarToolBarReferenciaComercial.setVisible(this.isVisibilidadCeldaCancelarReferenciaComercial);				
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial));			
			this.jMenuItemDuplicarReferenciaComercial.setVisible((this.isVisibilidadCeldaDuplicarReferenciaComercial && this.isPermisoDuplicarReferenciaComercial));			
			this.jMenuItemCopiarReferenciaComercial.setVisible((this.isVisibilidadCeldaCopiarReferenciaComercial && this.isPermisoCopiarReferenciaComercial));			
			this.jMenuItemVerFormReferenciaComercial.setVisible((this.isVisibilidadCeldaVerFormReferenciaComercial && this.isPermisoVerFormReferenciaComercial));			
			this.jMenuItemAbrirOrderByReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));			
			//this.jMenuItemMostrarOcultarReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));
			this.jMenuItemDetalleAbrirOrderByReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));			
			//this.jMenuItemDetalleMostrarOcultarReferenciaComercial.setVisible((this.isVisibilidadCeldaOrdenReferenciaComercial && this.isPermisoOrdenReferenciaComercial));			
			this.jMenuItemNuevoRelacionesReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial && this.isPermisoNuevoReferenciaComercial));			
			this.jMenuItemNuevoGuardarCambiosReferenciaComercial.setVisible((this.isVisibilidadCeldaNuevoReferenciaComercial && this.isPermisoNuevoReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));									
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemModificarReferenciaComercial.setVisible((this.isVisibilidadCeldaModificarReferenciaComercial && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemActualizarReferenciaComercial.setVisible((this.isVisibilidadCeldaActualizarReferenciaComercial && this.isPermisoActualizarReferenciaComercial));	
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemEliminarReferenciaComercial.setVisible((this.isVisibilidadCeldaEliminarReferenciaComercial && this.isPermisoEliminarReferenciaComercial));
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemCancelarReferenciaComercial.setVisible(this.isVisibilidadCeldaCancelarReferenciaComercial);				
			}
			
			this.jMenuItemGuardarCambiosReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));						
			this.jMenuItemGuardarCambiosTablaReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarCambiosReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoReferenciaComercial=this.jButtonNuevoReferenciaComercial.isVisible();
			this.isVisibilidadCeldaDuplicarReferenciaComercial=this.jButtonDuplicarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaCopiarReferenciaComercial=this.jButtonCopiarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaVerFormReferenciaComercial=this.jButtonVerFormReferenciaComercial.isVisible();
			
			this.isVisibilidadCeldaOrdenReferenciaComercial=this.jButtonAbrirOrderByReferenciaComercial.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=this.jButtonNuevoRelacionesReferenciaComercial.isVisible();
			this.isVisibilidadCeldaModificarReferenciaComercial=this.jButtonModificarReferenciaComercial.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.isVisibilidadCeldaActualizarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaGuardarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=this.jButtonGuardarCambiosTablaReferenciaComercial.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoReferenciaComercial=this.jButtonNuevoToolBarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=this.jButtonNuevoRelacionesToolBarReferenciaComercial.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.isVisibilidadCeldaModificarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarToolBarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarToolBarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarToolBarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarToolBarReferenciaComercial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaComercial=this.jButtonGuardarCambiosToolBarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=this.jButtonGuardarCambiosTablaToolBarReferenciaComercial.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoReferenciaComercial=this.jMenuItemNuevoReferenciaComercial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=this.jMenuItemNuevoRelacionesReferenciaComercial.isVisible();
			
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.isVisibilidadCeldaModificarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemModificarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaActualizarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemActualizarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaEliminarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemEliminarReferenciaComercial.isVisible();
			this.isVisibilidadCeldaCancelarReferenciaComercial=this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemCancelarReferenciaComercial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarReferenciaComercial=this.jMenuItemGuardarCambiosReferenciaComercial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=this.jMenuItemGuardarCambiosTablaReferenciaComercial.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesReferenciaComercial(Boolean esInicializar) {
		if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {			
			if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
				//if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaComercial();
			}
			
			this.inicializarActualizarBindingBotonesManualReferenciaComercial(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualReferenciaComercial() {
		this.jButtonNuevoReferenciaComercial.setVisible(this.isPermisoNuevoReferenciaComercial);			
		this.jButtonDuplicarReferenciaComercial.setVisible(this.isPermisoDuplicarReferenciaComercial);			
		this.jButtonCopiarReferenciaComercial.setVisible(this.isPermisoCopiarReferenciaComercial);			
		this.jButtonVerFormReferenciaComercial.setVisible(this.isPermisoVerFormReferenciaComercial);			
		
		this.jButtonAbrirOrderByReferenciaComercial.setVisible(this.isPermisoOrdenReferenciaComercial);					
		
		this.jButtonNuevoRelacionesReferenciaComercial.setVisible(this.isPermisoNuevoReferenciaComercial);			
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarReferenciaComercial.setVisible(this.isPermisoActualizarReferenciaComercial);	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.setVisible(this.isPermisoActualizarReferenciaComercial);	
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.setVisible(this.isPermisoEliminarReferenciaComercial);
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.setVisible(this.isVisibilidadCeldaCancelarReferenciaComercial);						
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.setVisible(this.isPermisoGuardarCambiosReferenciaComercial);							
		}
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.setVisible(this.isPermisoActualizarReferenciaComercial);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaComercial() {
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarReferenciaComercial.setVisible(this.isPermisoActualizarReferenciaComercial);	
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.setVisible(this.isPermisoActualizarReferenciaComercial);	
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.setVisible(this.isPermisoEliminarReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.setVisible(this.isVisibilidadCeldaCancelarReferenciaComercial);							
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.setVisible((this.isVisibilidadCeldaGuardarReferenciaComercial && this.isPermisoGuardarCambiosReferenciaComercial));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosReferenciaComercial() {
		if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualReferenciaComercial();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesReferenciaComercial() {
	}
	
	public void jTableDatosReferenciaComercialListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarReferenciaComercial(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.referenciacomercial.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.referenciacomercial.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidclienteReferenciaComercialActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderReferenciaComercial=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosReferenciaComercial.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonidclienteReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getidcliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getidcliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidclienteReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getidcliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idcliente = "+this.referenciacomercial.getidcliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvalorclientesectoreconomicoReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotiposectorecono=true;

			idTienePermisotiposectorecono=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(TipoSectorEconoConstantesFunciones.CLASSNAME);

			if(idTienePermisotiposectorecono) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.tiposectoreconoBeanSwingJInternalFrame=new TipoSectorEconoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tiposectoreconoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tiposectoreconoBeanSwingJInternalFrame.getTipoSectorEconoLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getidvalorclientesectoreconomico()!=null) {
					this.tiposectoreconoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tiposectoreconoBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getidvalorclientesectoreconomico());
					this.tiposectoreconoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tiposectoreconoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tiposectoreconoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoSectorEcono();
				}

				JInternalFrameBase jinternalFrame =this.tiposectoreconoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBordertiposectorecono=(TitledBorder)this.tiposectoreconoBeanSwingJInternalFrame.jScrollPanelDatosTipoSectorEcono.getBorder();

				titledBordertiposectorecono.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Tipo Sector Econo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvalorclientesectoreconomicoReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getidvalorclientesectoreconomico()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvalorclientesectoreconomico = "+this.referenciacomercial.getidvalorclientesectoreconomico().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.referenciacomercial.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidciudadReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisociudad=true;

			idTienePermisociudad=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(CiudadConstantesFunciones.CLASSNAME);

			if(idTienePermisociudad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getidciudad()!=null) {
					this.ciudadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ciudadBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getidciudad());
					this.ciudadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad();
				}

				JInternalFrameBase jinternalFrame =this.ciudadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBorderciudad=(TitledBorder)this.ciudadBeanSwingJInternalFrame.jScrollPanelDatosCiudad.getBorder();

				titledBorderciudad.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Ciudad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidciudadReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getidciudad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idciudad = "+this.referenciacomercial.getidciudad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreempresaReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getnombreempresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombreempresa like '%"+this.referenciacomercial.getnombreempresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.referenciacomercial.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncontactoReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getcontacto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where contacto like '%"+this.referenciacomercial.getcontacto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonarticulo_compraReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getarticulo_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where articulo_compra like '%"+this.referenciacomercial.getarticulo_compra()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_aniosReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getnumero_anios()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_anios = "+this.referenciacomercial.getnumero_anios().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mesesReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getnumero_meses()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_meses = "+this.referenciacomercial.getnumero_meses().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_valoracionReferenciaComercialUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovaloracion=true;

			idTienePermisotipovaloracion=this.tienePermisosUsuarioEnPaginaWebReferenciaComercial(TipoValoracionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovaloracion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosReferenciaComercial.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosReferenciaComercial.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);

				this.tipovaloracionBeanSwingJInternalFrame=new TipoValoracionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovaloracionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovaloracionBeanSwingJInternalFrame.getTipoValoracionLogic().setConnexion(this.referenciacomercialLogic.getConnexion());

				if(this.referenciacomercial.getid_tipo_valoracion()!=null) {
					this.tipovaloracionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovaloracionBeanSwingJInternalFrame.setIdActual(this.referenciacomercial.getid_tipo_valoracion());
					this.tipovaloracionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovaloracionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoValoracion();
				}

				JInternalFrameBase jinternalFrame =this.tipovaloracionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderReferenciaComercial=(TitledBorder)this.jScrollPanelDatosReferenciaComercial.getBorder();
				TitledBorder titledBordertipovaloracion=(TitledBorder)this.tipovaloracionBeanSwingJInternalFrame.jScrollPanelDatosTipoValoracion.getBorder();

				titledBordertipovaloracion.setTitle(titledBorderReferenciaComercial.getTitle() + " -> Tipo Valoracion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_valoracionReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getid_tipo_valoracion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_valoracion = "+this.referenciacomercial.getid_tipo_valoracion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.referenciacomercial.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.referenciacomercial.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonomovilReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.gettelefonomovil()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonomovil like '%"+this.referenciacomercial.gettelefonomovil()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonocodigoareaReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.gettelefonocodigoarea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefonocodigoarea like '%"+this.referenciacomercial.gettelefonocodigoarea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonemailReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getemail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where email like '%"+this.referenciacomercial.getemail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmontoReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getmonto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto = "+this.referenciacomercial.getmonto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoReferenciaComercialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.getreferenciacomercial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.referenciacomercial==null) {
						this.referenciacomercial = new ReferenciaComercial();
					}

					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);
				}

				if(this.referenciacomercial.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.referenciacomercial.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingReferenciaComercial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCiudadReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdCiudad();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdCliente();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdEmpresa();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdPais();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoValoracionReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdTipoValoracion();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorClienteSectorEconomicoReferenciaComercialActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingReferenciaComercial(false,false);

			this.getReferenciaComercialsFK_IdValorClienteSectorEconomico();

			this.inicializarActualizarBindingReferenciaComercial(false);

			//if(ReferenciaComercialBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingReferenciaComercial(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.referenciacomercialLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameReferenciaComercial() {
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
			this.jInternalFrameDetalleFormReferenciaComercial.setVisible(false);	    			
			this.jInternalFrameDetalleFormReferenciaComercial.dispose();
			this.jInternalFrameDetalleFormReferenciaComercial=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
			this.jInternalFrameReporteDinamicoReferenciaComercial.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoReferenciaComercial.dispose();
			this.jInternalFrameReporteDinamicoReferenciaComercial=null;
		}
		
		if(this.jInternalFrameImportacionReferenciaComercial!=null) {
			this.jInternalFrameImportacionReferenciaComercial.setVisible(false);	    			
			this.jInternalFrameImportacionReferenciaComercial.dispose();
			this.jInternalFrameImportacionReferenciaComercial=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessReferenciaComercial();
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			
			if(sTipo.equals("NuevoReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarReferenciaComercial")) {
				jButtonDuplicarReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarReferenciaComercial")) {
				jButtonCopiarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("VerFormReferenciaComercial")) {
				jButtonVerFormReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarReferenciaComercial")) {
				jButtonDuplicarReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarReferenciaComercial")) {
				jButtonDuplicarReferenciaComercialActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarReferenciaComercial")) {
				jButtonModificarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarReferenciaComercial")) {
				jButtonModificarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarReferenciaComercial")) {
				jButtonModificarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarReferenciaComercial")) {
				jButtonActualizarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarReferenciaComercial")) {
				jButtonActualizarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarReferenciaComercial")) {
				jButtonActualizarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("EliminarReferenciaComercial")) {
				jButtonEliminarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarReferenciaComercial")) {
				jButtonEliminarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarReferenciaComercial")) {
				jButtonEliminarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("CancelarReferenciaComercial")) {
				jButtonCancelarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarReferenciaComercial")) {
				jButtonCancelarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarReferenciaComercial")) {
				jButtonCancelarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("CerrarReferenciaComercial")) {
				jButtonCerrarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarReferenciaComercial")) {
				jButtonCerrarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarReferenciaComercial")) {
				jButtonCerrarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarReferenciaComercial")) {
				jButtonMostrarOcultarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarReferenciaComercial")) {
				jButtonCancelarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarReferenciaComercial")) {
				jButtonCopiarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarReferenciaComercial")) {
				jButtonVerFormReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarReferenciaComercial")) {
				jButtonCopiarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormReferenciaComercial")) {
				jButtonVerFormReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionReferenciaComercial")) {
				jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarReferenciaComercial")) {
				jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionReferenciaComercial")) {
				jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresReferenciaComercial")) {
				jButtonAnterioresReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarReferenciaComercial")) {
				jButtonAnterioresReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreReferenciaComercial")) {
				jButtonAnterioresReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesReferenciaComercial")) {
				jButtonSiguientesReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarReferenciaComercial")) {
				jButtonSiguientesReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesReferenciaComercial")) {
				jButtonSiguientesReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByReferenciaComercial") || sTipo.equals("MenuItemDetalleAbrirOrderByReferenciaComercial")) {
				jButtonAbrirOrderByReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarReferenciaComercial") || sTipo.equals("MenuItemDetalleMostrarOcultarReferenciaComercial")) {
				jButtonMostrarOcultarReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaComercial")) {
				jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarReferenciaComercial")) {
				jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosReferenciaComercial")) {
				jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoReferenciaComercial")) {
				jButtonCerrarReporteDinamicoReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoReferenciaComercial")) {
				jButtonGenerarReporteDinamicoReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoReferenciaComercial")) {
				
				jButtonGenerarExcelReporteDinamicoReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionReferenciaComercial")) {
				jButtonCerrarImportacionReferenciaComercialActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionReferenciaComercial")) {
				
				jButtonGenerarImportacionReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionReferenciaComercial")) {
				
				jButtonAbrirImportacionReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesReferenciaComercial")) {
				jComboBoxTiposAccionesReferenciaComercialActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesReferenciaComercial")) {
				jComboBoxTiposRelacionesReferenciaComercialActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioReferenciaComercial")) {
				jComboBoxTiposAccionesReferenciaComercialActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarReferenciaComercial")) {
				
				jComboBoxTiposSeleccionarReferenciaComercialActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralReferenciaComercial")) {
				jTextFieldValorCampoGeneralReferenciaComercialActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByReferenciaComercial")) {
				jButtonAbrirOrderByReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarReferenciaComercial")) {
				jButtonAbrirOrderByReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByReferenciaComercial")) {
				jButtonCerrarOrderByReferenciaComercialActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaComercialBusqueda")) {
				this.jButtonidReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaComercialUpdate")) {
				this.jButtonid_empresaReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaComercialBusqueda")) {
				this.jButtonid_empresaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaComercial")) {
				this.jButtonidclienteReferenciaComercialActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaComercialUpdate")) {
				this.jButtonidclienteReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaComercialBusqueda")) {
				this.jButtonidclienteReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientesectoreconomicoReferenciaComercialUpdate")) {
				this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientesectoreconomicoReferenciaComercialBusqueda")) {
				this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisReferenciaComercialUpdate")) {
				this.jButtonid_paisReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisReferenciaComercialBusqueda")) {
				this.jButtonid_paisReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadReferenciaComercialUpdate")) {
				this.jButtonidciudadReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadReferenciaComercialBusqueda")) {
				this.jButtonidciudadReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreempresaReferenciaComercialBusqueda")) {
				this.jButtonnombreempresaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteReferenciaComercialBusqueda")) {
				this.jButtoncodigo_clienteReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoReferenciaComercialBusqueda")) {
				this.jButtoncontactoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("articulo_compraReferenciaComercialBusqueda")) {
				this.jButtonarticulo_compraReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_aniosReferenciaComercialBusqueda")) {
				this.jButtonnumero_aniosReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesReferenciaComercialBusqueda")) {
				this.jButtonnumero_mesesReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaComercialUpdate")) {
				this.jButtonid_tipo_valoracionReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaComercialBusqueda")) {
				this.jButtonid_tipo_valoracionReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaComercialBusqueda")) {
				this.jButtondireccionReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaComercialBusqueda")) {
				this.jButtontelefonoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilReferenciaComercialBusqueda")) {
				this.jButtontelefonomovilReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaReferenciaComercialBusqueda")) {
				this.jButtontelefonocodigoareaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailReferenciaComercialBusqueda")) {
				this.jButtonemailReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoReferenciaComercialBusqueda")) {
				this.jButtonmontoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaComercialBusqueda")) {
				this.jButtonesactivoReferenciaComercialBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("idclienteReferenciaComercial")) {
				this.jButtonidclienteReferenciaComercialActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCiudadReferenciaComercial")) {
				this.jButtonFK_IdCiudadReferenciaComercialActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteReferenciaComercial")) {
				this.jButtonFK_IdClienteReferenciaComercialActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisReferenciaComercial")) {
				this.jButtonFK_IdPaisReferenciaComercialActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoValoracionReferenciaComercial")) {
				this.jButtonFK_IdTipoValoracionReferenciaComercialActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorClienteSectorEconomicoReferenciaComercial")) {
				this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercialActionPerformed(evt);
			}
			
			;
			
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessReferenciaComercial();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ReferenciaComercial referenciacomercialLocal=null;
			
			if(!this.getEsControlTabla()) {
				referenciacomercialLocal=this.referenciacomercial;
			} else {
				referenciacomercialLocal=this.referenciacomercialAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
							
				
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
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
			
			


			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
								
						
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
								
				
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
							
				
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
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
			
			


			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
								
				
				


				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosReferenciaComercial")) {
					jCheckBoxSeleccionarTodosReferenciaComercialItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosReferenciaComercial")) {
					jCheckBoxSeleccionadosReferenciaComercialItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarReferenciaComercial")) {
					
				}
				
				


				
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
												
				
				


				
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
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
			
			


			if(sTipo.equals("id_paisReferenciaComercial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial;
				}

				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaComercial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaComercial")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
				//recargarFormReferenciaComercialPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
			}
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaReferenciaComercialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_paisReferenciaComercial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial;
				}

				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaComercial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaComercial")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
				//recargarFormReferenciaComercialPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
			}
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.referenciacomercial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.referenciacomercial);
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
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
				
				


			if(sTipo.equals("id_paisReferenciaComercial")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial;
				}

				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					//classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyPais(jComboBoxGenerico,"Formulario");

				this.recargarFormReferenciaComercial(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_paisFK_IdPaisReferenciaComercial")) {
				this.procesarActionsCombosForeignKeyPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
				//recargarFormReferenciaComercialPais(jComboBoxid_paisFK_IdPaisReferenciaComercial,"FK_IdPais");
			}
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ReferenciaComercial.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ReferenciaComercial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaReferenciaComercialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.referenciacomercialAnterior =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarReferenciaComercial")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosReferenciaComercialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosReferenciaComercial.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.referenciacomercial =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.referenciacomercial =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.referenciacomercial);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarReferenciaComercial")) {
				
				}
				
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarReferenciaComercial")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosReferenciaComercial.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarReferenciaComercial")) {
			
			}
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessReferenciaComercial();
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			if(sTipo.equals("NuevoReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarReferenciaComercial")) {
				jButtonDuplicarReferenciaComercialActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarReferenciaComercial")) {
				jButtonCopiarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormReferenciaComercial")) {
				jButtonVerFormReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesReferenciaComercial")) {
				jButtonNuevoReferenciaComercialActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarReferenciaComercial")) {
				jButtonModificarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarReferenciaComercial")) {
				jButtonActualizarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarReferenciaComercial")) {
				jButtonEliminarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarReferenciaComercial")) {
				jButtonCancelarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarReferenciaComercial")) {
				jButtonCerrarReferenciaComercialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosReferenciaComercial")) {
				jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosReferenciaComercial")) {
				jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByReferenciaComercial")) {
				jButtonAbrirOrderByReferenciaComercialActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionReferenciaComercial")) {
				jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresReferenciaComercial")) {
				jButtonAnterioresReferenciaComercialActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesReferenciaComercial")) {
				jButtonSiguientesReferenciaComercialActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idReferenciaComercialBusqueda")) {
				this.jButtonidReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaReferenciaComercialUpdate")) {
				this.jButtonid_empresaReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaReferenciaComercialBusqueda")) {
				this.jButtonid_empresaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("idclienteReferenciaComercial")) {
				this.jButtonidclienteReferenciaComercialActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idclienteReferenciaComercialUpdate")) {
				this.jButtonidclienteReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idclienteReferenciaComercialBusqueda")) {
				this.jButtonidclienteReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvalorclientesectoreconomicoReferenciaComercialUpdate")) {
				this.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvalorclientesectoreconomicoReferenciaComercialBusqueda")) {
				this.jButtonidvalorclientesectoreconomicoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisReferenciaComercialUpdate")) {
				this.jButtonid_paisReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisReferenciaComercialBusqueda")) {
				this.jButtonid_paisReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idciudadReferenciaComercialUpdate")) {
				this.jButtonidciudadReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idciudadReferenciaComercialBusqueda")) {
				this.jButtonidciudadReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreempresaReferenciaComercialBusqueda")) {
				this.jButtonnombreempresaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteReferenciaComercialBusqueda")) {
				this.jButtoncodigo_clienteReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("contactoReferenciaComercialBusqueda")) {
				this.jButtoncontactoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("articulo_compraReferenciaComercialBusqueda")) {
				this.jButtonarticulo_compraReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_aniosReferenciaComercialBusqueda")) {
				this.jButtonnumero_aniosReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mesesReferenciaComercialBusqueda")) {
				this.jButtonnumero_mesesReferenciaComercialBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaComercialUpdate")) {
				this.jButtonid_tipo_valoracionReferenciaComercialUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valoracionReferenciaComercialBusqueda")) {
				this.jButtonid_tipo_valoracionReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionReferenciaComercialBusqueda")) {
				this.jButtondireccionReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoReferenciaComercialBusqueda")) {
				this.jButtontelefonoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonomovilReferenciaComercialBusqueda")) {
				this.jButtontelefonomovilReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonocodigoareaReferenciaComercialBusqueda")) {
				this.jButtontelefonocodigoareaReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("emailReferenciaComercialBusqueda")) {
				this.jButtonemailReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("montoReferenciaComercialBusqueda")) {
				this.jButtonmontoReferenciaComercialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoReferenciaComercialBusqueda")) {
				this.jButtonesactivoReferenciaComercialBusquedaActionPerformed(evt);
			}
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessReferenciaComercial();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameReferenciaComercial")) {
				closingInternalFrameReferenciaComercial();
				
			} else if(sTipo.equals("jButtonCancelarReferenciaComercial")) {
				JInternalFrameBase jInternalFrameDetalleFormReferenciaComercial = (JInternalFrameBase)evt.getSource();
	            	
	            ReferenciaComercialBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaComercialBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaComercial.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarReferenciaComercialActionPerformed(null);
			}
			
			ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.referenciacomercial,new Object(),this.referenciacomercialParameterGeneral,this.referenciacomercialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormReferenciaComercial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormReferenciaComercial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormReferenciaComercial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.referenciacomercial)) {
			if(!esControlTabla) {
				if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);			
				}
				
				if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualReferenciaComercial(this.referenciacomercial,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciacomercialReturnGeneral=referenciacomercialLogic.procesarEventosReferenciaComercialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciacomercialLogic.getReferenciaComercials(),this.referenciacomercial,this.referenciacomercialParameterGeneral,this.isEsNuevoReferenciaComercial,classes);//this.referenciacomercialLogic.getReferenciaComercial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanReferenciaComercial(this.referenciacomercialReturnGeneral,this.referenciacomercialBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaComercial(classes,this.referenciacomercialReturnGeneral,this.referenciacomercialBean,false);
					}
						
					if(this.referenciacomercialReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial());	
					}
						
					if(this.referenciacomercialReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial(),classes);//this.referenciacomercialBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioReferenciaComercial(this.referenciacomercial,classes);//this.referenciacomercialBean);									
				}
			
				if(ReferenciaComercialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualReferenciaComercial(this.referenciacomercial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysReferenciaComercial(this.referenciacomercial);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.referenciacomercialAnterior!=null) {
						this.referenciacomercial=this.referenciacomercialAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.referenciacomercialReturnGeneral=referenciacomercialLogic.procesarEventosReferenciaComercialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciacomercialLogic.getReferenciaComercials(),this.referenciacomercial,this.referenciacomercialParameterGeneral,this.isEsNuevoReferenciaComercial,classes);//this.referenciacomercialLogic.getReferenciaComercial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.referenciacomercialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.referenciacomercialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.referenciacomercialReturnGeneral.getReferenciaComercial(),referenciacomercialLogic.getReferenciaComercials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.referenciacomercialReturnGeneral.getReferenciaComercial(),this.referenciacomercials);
				}
				//ARCHITECTURE
				
				//this.jTableDatosReferenciaComercial.repaint();
				
				//((AbstractTableModel) this.jTableDatosReferenciaComercial.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosReferenciaComercial();
			}
		}
	}
	
	public void actualizarVisualTableDatosReferenciaComercial() throws Exception {
		
		ReferenciaComercialModel referenciacomercialModel=(ReferenciaComercialModel)this.jTableDatosReferenciaComercial.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			referenciacomercialModel.referenciacomercials=this.referenciacomercialLogic.getReferenciaComercials();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			referenciacomercialModel.referenciacomercials=this.referenciacomercials;
		}
		
		
		((ReferenciaComercialModel) this.jTableDatosReferenciaComercial.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaReferenciaComercial() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getreferenciacomercialAnterior(),this.referenciacomercialLogic.getReferenciaComercials());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getreferenciacomercialAnterior(),this.referenciacomercials);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosReferenciaComercial();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioReferenciaComercial(ReferenciaComercial referenciacomercial,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
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
										
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciacomercial,new Object(),generalEntityParameterGeneral,this.referenciacomercialReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.referenciacomercialSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsOfReferenciaComercial(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ReferenciaComercialConstantesFunciones.getClassesRelationshipsFromStringsOfReferenciaComercial(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormReferenciaComercial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ReferenciaComercialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.referenciacomercial,new Object(),generalEntityParameterGeneral,this.referenciacomercialReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioReferenciaComercial(ReferenciaComercialBean referenciacomercialBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanReferenciaComercial(ArrayList<Classe> classes,ReferenciaComercialReturnGeneral referenciacomercialReturnGeneral,ReferenciaComercialBean referenciacomercialBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualReferenciaComercial(ReferenciaComercial referenciacomercial,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.referenciacomercial)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormReferenciaComercial = new ReferenciaComercialDetalleFormJInternalFrame(jDesktopPane,this.referenciacomercialSessionBean.getConGuardarRelaciones(),this.referenciacomercialSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.setVisible(false);
		this.jInternalFrameDetalleFormReferenciaComercial.setSelected(false);						
		
		this.jInternalFrameDetalleFormReferenciaComercial.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormReferenciaComercial.referenciacomercialLogic=this.referenciacomercialLogic;
		
		this.cargarCombosFrameForeignKeyReferenciaComercial("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleReferenciaComercial();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleReferenciaComercial();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyReferenciaComercial("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyReferenciaComercial();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormReferenciaComercial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaComercial"));
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ModificarReferenciaComercial"));

		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaComercial"));
					
		this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemModificarReferenciaComercial.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaComercial"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaComercial"));
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaComercial"));
						
		this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemActualizarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaComercial"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.addActionListener (new ButtonActionListener(this,"EliminarReferenciaComercial"));
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaComercial"));
								
		this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemEliminarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaComercial"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CancelarReferenciaComercial"));
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaComercial"));
					
		this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemCancelarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaComercial"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemDetalleCerrarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaComercial"));		
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaComercial"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaComercial"));
		
		
		
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaComercial"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialBusqueda"));
		//jButtonidclienteReferenciaComercial.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaComercialActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercial"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnombreempresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncodigo_clienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncontactoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"contactoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonarticulo_compraReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"articulo_compraReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_aniosReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_aniosReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_mesesReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtondireccionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonomovilReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonocodigoareaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonemailReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonmontoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"montoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonesactivoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaComercialBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaComercial"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameReferenciaComercial"));
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarReferenciaComercial"));
		}
		
		this.jTableDatosReferenciaComercial.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarReferenciaComercial"));
		
		this.jTableDatosReferenciaComercial.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarReferenciaComercial"));
		
		this.jButtonNuevoReferenciaComercial.addActionListener(new ButtonActionListener(this,"NuevoReferenciaComercial"));
		
		this.jButtonDuplicarReferenciaComercial.addActionListener(new ButtonActionListener(this,"DuplicarReferenciaComercial"));
		
		this.jButtonCopiarReferenciaComercial.addActionListener(new ButtonActionListener(this,"CopiarReferenciaComercial"));
		
		this.jButtonVerFormReferenciaComercial.addActionListener(new ButtonActionListener(this,"VerFormReferenciaComercial"));
		
		
		this.jButtonNuevoToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"NuevoToolBarReferenciaComercial"));
			
		this.jButtonDuplicarToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"DuplicarToolBarReferenciaComercial"));
			
		this.jMenuItemNuevoReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoReferenciaComercial"));
			
		this.jMenuItemDuplicarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarReferenciaComercial"));		
		
		
		this.jButtonNuevoRelacionesReferenciaComercial.addActionListener (new ButtonActionListener(this,"NuevoRelacionesReferenciaComercial"));
		
		
		this.jButtonNuevoRelacionesToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarReferenciaComercial"));
			
		this.jMenuItemNuevoRelacionesReferenciaComercial.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesReferenciaComercial"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ModificarReferenciaComercial"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonModificarToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ModificarToolBarReferenciaComercial"));
			
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemModificarReferenciaComercial.addActionListener(new ButtonActionListener(this,"MenuItemModificarReferenciaComercial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarReferenciaComercial.addActionListener (new ButtonActionListener(this,"ActualizarReferenciaComercial"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonActualizarToolBarReferenciaComercial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarReferenciaComercial"));
				
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemActualizarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarReferenciaComercial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarReferenciaComercial.addActionListener (new ButtonActionListener(this,"EliminarReferenciaComercial"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonEliminarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"EliminarToolBarReferenciaComercial"));
						
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemEliminarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarReferenciaComercial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CancelarReferenciaComercial"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonCancelarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CancelarToolBarReferenciaComercial"));
			
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemCancelarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarReferenciaComercial"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarReferenciaComercial"));		
		
		
		this.jButtonCerrarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CerrarReferenciaComercial"));
		
		
		this.jButtonCerrarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CerrarToolBarReferenciaComercial"));
			
		this.jMenuItemCerrarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemCerrarReferenciaComercial"));
			
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jMenuItemDetalleCerrarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarReferenciaComercial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosReferenciaComercial"));
		}
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarReferenciaComercial"));
		}
		
		this.jButtonCopiarToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"CopiarToolBarReferenciaComercial"));
			
		this.jButtonVerFormToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"VerFormToolBarReferenciaComercial"));
		
		this.jMenuItemGuardarCambiosReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosReferenciaComercial"));
			
		this.jMenuItemCopiarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemCopiarReferenciaComercial"));		
		
		this.jMenuItemVerFormReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemVerFormReferenciaComercial"));		
		
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaComercial"));
		
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarReferenciaComercial"));
			
		this.jMenuItemGuardarCambiosTablaReferenciaComercial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaReferenciaComercial"));		
		
		
		
		this.jButtonRecargarInformacionReferenciaComercial.addActionListener (new ButtonActionListener(this,"RecargarInformacionReferenciaComercial"));
					
		this.jButtonRecargarInformacionToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarReferenciaComercial"));
		
		this.jMenuItemRecargarInformacionReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionReferenciaComercial"));		
		
		
		
		this.jButtonAnterioresReferenciaComercial.addActionListener (new ButtonActionListener(this,"AnterioresReferenciaComercial"));
		
		
		this.jButtonAnterioresToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"AnterioresToolBarReferenciaComercial"));
		
		this.jMenuItemAnterioresReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresReferenciaComercial"));		
		
		
		this.jButtonSiguientesReferenciaComercial.addActionListener (new ButtonActionListener(this,"SiguientesReferenciaComercial"));
		
		
		this.jButtonSiguientesToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"SiguientesToolBarReferenciaComercial"));
			
		this.jMenuItemSiguientesReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesReferenciaComercial"));
			
		this.jMenuItemAbrirOrderByReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByReferenciaComercial"));
			
		this.jMenuItemMostrarOcultarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarReferenciaComercial"));
			
		this.jMenuItemDetalleAbrirOrderByReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByReferenciaComercial"));
			
		this.jMenuItemDetalleMostarOcultarReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarReferenciaComercial"));		
		
		
		this.jButtonNuevoGuardarCambiosReferenciaComercial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosReferenciaComercial"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarReferenciaComercial"));
			
		this.jMenuItemNuevoGuardarCambiosReferenciaComercial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosReferenciaComercial"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosReferenciaComercial.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosReferenciaComercial"));

		this.jCheckBoxSeleccionadosReferenciaComercial.addItemListener(new CheckBoxItemListener(this,"SeleccionadosReferenciaComercial"));
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioReferenciaComercial"));
		}
		
		
		this.jComboBoxTiposRelacionesReferenciaComercial.addActionListener (new ButtonActionListener(this,"TiposRelacionesReferenciaComercial"));
			
		this.jComboBoxTiposAccionesReferenciaComercial.addActionListener (new ButtonActionListener(this,"TiposAccionesReferenciaComercial"));
					
		this.jComboBoxTiposSeleccionarReferenciaComercial.addActionListener (new ButtonActionListener(this,"TiposSeleccionarReferenciaComercial"));
			
		this.jTextFieldValorCampoGeneralReferenciaComercial.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralReferenciaComercial"));		
		
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialBusqueda"));
		//jButtonidclienteReferenciaComercial.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaComercialActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercial"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnombreempresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncodigo_clienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncontactoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"contactoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonarticulo_compraReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"articulo_compraReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_aniosReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_aniosReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_mesesReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtondireccionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonomovilReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonocodigoareaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonemailReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonmontoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"montoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonesactivoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaComercialBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCiudadReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdCiudadReferenciaComercial"));

			this.jButtonFK_IdClienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaComercial"));

			this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercial"));

			this.jButtonFK_IdPaisReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdPaisReferenciaComercial"));

			this.jButtonFK_IdTipoValoracionReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionReferenciaComercial"));

			this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteSectorEconomicoReferenciaComercial"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoReferenciaComercial!=null) {
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaComercial"));
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaComercial"));
				this.jInternalFrameReporteDinamicoReferenciaComercial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaComercial"));
			}
			
			//this.jButtonCerrarReporteDinamicoReferenciaComercial.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoReferenciaComercial"));				
			//this.jButtonGenerarReporteDinamicoReferenciaComercial.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoReferenciaComercial"));
			//this.jButtonGenerarExcelReporteDinamicoReferenciaComercial.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoReferenciaComercial"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionReferenciaComercial!=null) {
				this.jInternalFrameImportacionReferenciaComercial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionReferenciaComercial"));
				this.jInternalFrameImportacionReferenciaComercial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionReferenciaComercial"));
				this.jInternalFrameImportacionReferenciaComercial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionReferenciaComercial"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByReferenciaComercial.addActionListener (new ButtonActionListener(this,"AbrirOrderByReferenciaComercial"));
			
			this.jButtonAbrirOrderByToolBarReferenciaComercial.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarReferenciaComercial"));			
			
			if(this.jInternalFrameOrderByReferenciaComercial!=null) {
				this.jInternalFrameOrderByReferenciaComercial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByReferenciaComercial"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormReferenciaComercial.jTabbedPaneRelacionesReferenciaComercial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesReferenciaComercial"));
		
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
            		closingInternalFrameReferenciaComercial();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormReferenciaComercial.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormReferenciaComercial = (JInternalFrameBase)event.getSource();
	            	
	            ReferenciaComercialBeanSwingJInternalFrame jInternalFrameParent=(ReferenciaComercialBeanSwingJInternalFrame)jInternalFrameDetalleFormReferenciaComercial.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarReferenciaComercialActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosReferenciaComercial.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosReferenciaComercialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosReferenciaComercial.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosReferenciaComercial.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoReferenciaComercial";
		inputMap = this.jButtonNuevoReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaComercialActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoReferenciaComercialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesReferenciaComercial";
		inputMap = this.jButtonNuevoRelacionesReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoReferenciaComercialActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarReferenciaComercial";
		inputMap = this.jButtonModificarReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarReferenciaComercial";
		inputMap = this.jButtonActualizarReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarReferenciaComercial";
		inputMap = this.jButtonEliminarReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarReferenciaComercial";
		inputMap = this.jButtonCancelarReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarReferenciaComercial";
		inputMap = this.jButtonCerrarReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosReferenciaComercial";
		inputMap = this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonGuardarCambiosReferenciaComercial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosReferenciaComercialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosReferenciaComercial.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosReferenciaComercialItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesReferenciaComercial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesReferenciaComercialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarReferenciaComercial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarReferenciaComercialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralReferenciaComercial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralReferenciaComercialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_empresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaReferenciaComercialBusqueda"));
		//jButtonidclienteReferenciaComercial.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonidclienteReferenciaComercialActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercial"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidvalorclientesectoreconomicoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idvalorclientesectoreconomicoReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_paisReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_paisReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonidciudadReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"idciudadReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnombreempresaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"nombreempresaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncodigo_clienteReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtoncontactoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"contactoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonarticulo_compraReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"articulo_compraReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_aniosReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_aniosReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonnumero_mesesReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"numero_mesesReferenciaComercialBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonid_tipo_valoracionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valoracionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtondireccionReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"direccionReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonomovilReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonomovilReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtontelefonocodigoareaReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"telefonocodigoareaReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonemailReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"emailReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonmontoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"montoReferenciaComercialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormReferenciaComercial.jButtonesactivoReferenciaComercialBusqueda.addActionListener(new ButtonActionListener(this,"esactivoReferenciaComercialBusqueda"));
		
		
		this.jButtonFK_IdCiudadReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdCiudadReferenciaComercial"));

		this.jButtonFK_IdClienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdClienteReferenciaComercial"));

		this.jButtonBuscarFK_IdClienteidclienteReferenciaComercial.addActionListener(new ButtonActionListener(this,"idclienteReferenciaComercial"));

		this.jButtonFK_IdPaisReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdPaisReferenciaComercial"));

		this.jButtonFK_IdTipoValoracionReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdTipoValoracionReferenciaComercial"));

		this.jButtonFK_IdValorClienteSectorEconomicoReferenciaComercial.addActionListener(new ButtonActionListener(this,"FK_IdValorClienteSectorEconomicoReferenciaComercial"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionReferenciaComercial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionReferenciaComercialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarReferenciaComercialActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarReferenciaComercial.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosReferenciaComercial(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
					referenciacomercialAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaComercial referenciacomercialAux:referenciacomercials) {
					referenciacomercialAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosReferenciaComercialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
						referenciacomercialAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaComercial referenciacomercialAux:referenciacomercials) {
						referenciacomercialAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
					
						if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciacomercialAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaComercial referenciacomercialAux:referenciacomercials) {
						
						if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							referenciacomercialAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaComercial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaComercial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosReferenciaComercialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosReferenciaComercial.getSelectedRows();
			
			ReferenciaComercial referenciacomercialLocal=new ReferenciaComercial();
			
			//this.seleccionarTodosReferenciaComercial(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					referenciacomercialLocal =(ReferenciaComercial) this.referenciacomercialLogic.getReferenciaComercials().toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					referenciacomercialLocal =(ReferenciaComercial) this.referenciacomercials.toArray()[this.jTableDatosReferenciaComercial.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				referenciacomercialLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
						referenciacomercialAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ReferenciaComercial referenciacomercialAux:referenciacomercials) {
						referenciacomercialAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosReferenciaComercial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosReferenciaComercial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosReferenciaComercial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualReferenciaComercialItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarReferenciaComercialParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralReferenciaComercialActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralReferenciaComercial.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ReferenciaComercial referenciacomercialAux:this.referenciacomercialLogic.getReferenciaComercials()) {
				
						if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							referenciacomercialAux.setnombreempresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							referenciacomercialAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							referenciacomercialAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA)) {
							existe=true;
							referenciacomercialAux.setarticulo_compra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS)) {
							existe=true;
							referenciacomercialAux.setnumero_anios(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							referenciacomercialAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciacomercialAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciacomercialAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							referenciacomercialAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							referenciacomercialAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							referenciacomercialAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							referenciacomercialAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaComercial referenciacomercialAux:referenciacomercials) {
					
						if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							referenciacomercialAux.setnombreempresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							referenciacomercialAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO)) {
							existe=true;
							referenciacomercialAux.setcontacto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA)) {
							existe=true;
							referenciacomercialAux.setarticulo_compra(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS)) {
							existe=true;
							referenciacomercialAux.setnumero_anios(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES)) {
							existe=true;
							referenciacomercialAux.setnumero_meses(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							referenciacomercialAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							referenciacomercialAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL)) {
							existe=true;
							referenciacomercialAux.settelefonomovil(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
							existe=true;
							referenciacomercialAux.settelefonocodigoarea(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							referenciacomercialAux.setemail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_MONTO)) {
							existe=true;
							referenciacomercialAux.setmonto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaReferenciaComercial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesReferenciaComercialActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioReferenciaComercial=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesReferenciaComercial.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteReferenciaComercial) {				
					conSplash=true;//false;										
					
					//this.startProcessReferenciaComercial(conSplash);
				
					this.generarReporteReferenciaComercialsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoReferenciaComercialsSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaComercialsSeleccionados(false);
				//this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoReferenciaComercialsSeleccionados(true);
				//this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaComercial();
				
				this.exportarReferenciaComercialsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionReferenciaComercials();
				//this.importarReferenciaComercials();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessReferenciaComercial();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelReferenciaComercialsSeleccionados();
				//this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Referencia Comercial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessReferenciaComercial();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoReferenciaComercial)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyReferenciaComercial(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
				}	
			} 			
			else if(ReferenciaComercialBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteReferenciaComercial) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessReferenciaComercial(conSplash);
					
						//this.actualizarParametrosGeneralReferenciaComercial();
						
						this.generarReporteProcesoAccionReferenciaComercialsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ReferenciaComercialBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Referencia ComercialES SELECCIONADOS?", "MANTENIMIENTO DE Referencia Comercial", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessReferenciaComercial();
				
						this.actualizarParametrosGeneralReferenciaComercial();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.referenciacomercialReturnGeneral=referenciacomercialLogic.procesarAccionReferenciaComercialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.referenciacomercialLogic.getReferenciaComercials(),this.referenciacomercialParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarReferenciaComercialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralReferenciaComercial();
					
					ReferenciaComercialBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarReferenciaComercialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesReferenciaComercial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxTiposAccionesFormularioReferenciaComercial.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessReferenciaComercial(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesReferenciaComercialActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessReferenciaComercial();
			
			if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
			ReferenciaComercial referenciacomercial=new ReferenciaComercial();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingReferenciaComercial(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesReferenciaComercial.getSelectedItem();
			
			
			
			
			referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
			//this.sTipoAccion;
			
			if(referenciacomercialsSeleccionados.size()==1) {
				for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
					referenciacomercial=referenciacomercialAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessReferenciaComercial();
			
      		//this.finishProcessReferenciaComercial(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarReferenciaComercialReturnGeneral() throws Exception {
		if(this.referenciacomercialReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.referenciacomercialReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.referenciacomercialReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.referenciacomercialReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.referenciacomercialReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.referenciacomercialReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingReferenciaComercial(false);
		}
		
		if(this.referenciacomercialReturnGeneral.getConRetornoLista() || this.referenciacomercialReturnGeneral.getConRetornoObjeto()) {
			if(this.referenciacomercialReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciacomercialLogic.setReferenciaComercials(this.referenciacomercialReturnGeneral.getReferenciaComercials());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.referenciacomercialReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.referenciacomercialLogic.setReferenciaComercial(this.referenciacomercialReturnGeneral.getReferenciaComercial());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingReferenciaComercial(false);
		}
	}
	
	public void actualizarParametrosGeneralReferenciaComercial() throws Exception {
		
		
	}
	
	public ArrayList<ReferenciaComercial> getReferenciaComercialsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioReferenciaComercial) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ReferenciaComercial referenciacomercialAux:referenciacomercialLogic.getReferenciaComercials()) {
					if(referenciacomercialAux.getIsSelected()) {
						referenciacomercialsSeleccionados.add(referenciacomercialAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ReferenciaComercial referenciacomercialAux:this.referenciacomercials) {
					if(referenciacomercialAux.getIsSelected()) {
						referenciacomercialsSeleccionados.add(referenciacomercialAux);				
					}
				}
			}
			
			if(referenciacomercialsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						referenciacomercialsSeleccionados.addAll(this.referenciacomercialLogic.getReferenciaComercials());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						referenciacomercialsSeleccionados.addAll(this.referenciacomercials);				
					}
				}
			}
		} else {
			referenciacomercialsSeleccionados.add(this.referenciacomercial);
		}
		
		return referenciacomercialsSeleccionados;
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
	
	public void generarReporteReferenciaComercialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalReferenciaComercialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoReferenciaComercialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaComercialsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoReferenciaComercialsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Referencia Comercial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados);
		
	}	
	
	public void generarReporteNormalReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionReferenciaComercialsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		
		this.abrirInicializarFrameReporteDinamicoReferenciaComercial();
		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoReferenciaComercial();
		
		
		//this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados ,referenciacomercialImplementable,referenciacomercialImplementableHome);
	}
	
	public void mostrarImportacionReferenciaComercials() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionReferenciaComercial();
		
		this.abrirFrameImportacionReferenciaComercial();		
		
			
		//this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados ,referenciacomercialImplementable,referenciacomercialImplementableHome);
	}
	
	public void importarReferenciaComercials() throws Exception {		
	
	}
	
	public void exportarReferenciaComercialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelReferenciaComercialsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoReferenciaComercialsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlReferenciaComercialsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Referencia Comercial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarReferenciaComercial(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarReferenciaComercial(referenciacomercialAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//referenciacomercialAux.setsDetalleGeneralEntityReporte(referenciacomercialAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarReferenciaComercial(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_CONTACTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_MONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarReferenciaComercial(ReferenciaComercial referenciacomercial,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=referenciacomercial.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.gettiposectorecono_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getciudad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getnombreempresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getcontacto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getarticulo_compra();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getnumero_anios().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getnumero_meses().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.gettipovaloracion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.gettelefonomovil();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.gettelefonocodigoarea();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getemail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getmonto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=referenciacomercial.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ReferenciaComercials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelReferenciaComercial(row);				
				iRow++;
			}				
			
			for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelReferenciaComercial(referenciacomercialAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlReferenciaComercialsSeleccionados() throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();		
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"referenciacomercial.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("referenciacomercials");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("referenciacomercial");
			//elementRoot.appendChild(element);
		
			for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
				element = document.createElement("referenciacomercial");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlReferenciaComercial(referenciacomercialAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Referencia Comercial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelReferenciaComercial(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_MONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelReferenciaComercial(ReferenciaComercial referenciacomercial,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.gettiposectorecono_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getciudad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getnombreempresa());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getcontacto());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getarticulo_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getnumero_anios());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getnumero_meses());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.gettipovaloracion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.gettelefonomovil());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.gettelefonocodigoarea());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getemail());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getmonto());
		cell = row.createCell(iColumn++);cell.setCellValue(referenciacomercial.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlReferenciaComercial(ReferenciaComercial referenciacomercial,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ReferenciaComercialConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(referenciacomercial.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ReferenciaComercialConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(referenciacomercial.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(referenciacomercial.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcliente_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(referenciacomercial.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtiposectorecono_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDTIPOSECTORECONO);
		elementtiposectorecono_descripcion.appendChild(document.createTextNode(referenciacomercial.gettiposectorecono_descripcion()));
		element.appendChild(elementtiposectorecono_descripcion);

		Element elementpais_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(referenciacomercial.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementciudad_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDCIUDAD);
		elementciudad_descripcion.appendChild(document.createTextNode(referenciacomercial.getciudad_descripcion()));
		element.appendChild(elementciudad_descripcion);

		Element elementnombreempresa = document.createElement(ReferenciaComercialConstantesFunciones.NOMBREEMPRESA);
		elementnombreempresa.appendChild(document.createTextNode(referenciacomercial.getnombreempresa().trim()));
		element.appendChild(elementnombreempresa);

		Element elementcodigo_cliente = document.createElement(ReferenciaComercialConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(referenciacomercial.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementcontacto = document.createElement(ReferenciaComercialConstantesFunciones.CONTACTO);
		elementcontacto.appendChild(document.createTextNode(referenciacomercial.getcontacto().trim()));
		element.appendChild(elementcontacto);

		Element elementarticulo_compra = document.createElement(ReferenciaComercialConstantesFunciones.ARTICULOCOMPRA);
		elementarticulo_compra.appendChild(document.createTextNode(referenciacomercial.getarticulo_compra().trim()));
		element.appendChild(elementarticulo_compra);

		Element elementnumero_anios = document.createElement(ReferenciaComercialConstantesFunciones.NUMEROANIOS);
		elementnumero_anios.appendChild(document.createTextNode(referenciacomercial.getnumero_anios().toString().trim()));
		element.appendChild(elementnumero_anios);

		Element elementnumero_meses = document.createElement(ReferenciaComercialConstantesFunciones.NUMEROMESES);
		elementnumero_meses.appendChild(document.createTextNode(referenciacomercial.getnumero_meses().toString().trim()));
		element.appendChild(elementnumero_meses);

		Element elementtipovaloracion_descripcion = document.createElement(ReferenciaComercialConstantesFunciones.IDTIPOVALORACION);
		elementtipovaloracion_descripcion.appendChild(document.createTextNode(referenciacomercial.gettipovaloracion_descripcion()));
		element.appendChild(elementtipovaloracion_descripcion);

		Element elementdireccion = document.createElement(ReferenciaComercialConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(referenciacomercial.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(ReferenciaComercialConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(referenciacomercial.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementtelefonomovil = document.createElement(ReferenciaComercialConstantesFunciones.TELEFONOMOVIL);
		elementtelefonomovil.appendChild(document.createTextNode(referenciacomercial.gettelefonomovil().trim()));
		element.appendChild(elementtelefonomovil);

		Element elementtelefonocodigoarea = document.createElement(ReferenciaComercialConstantesFunciones.TELEFONOCODIGOAREA);
		elementtelefonocodigoarea.appendChild(document.createTextNode(referenciacomercial.gettelefonocodigoarea().trim()));
		element.appendChild(elementtelefonocodigoarea);

		Element elementemail = document.createElement(ReferenciaComercialConstantesFunciones.EMAIL);
		elementemail.appendChild(document.createTextNode(referenciacomercial.getemail().trim()));
		element.appendChild(elementemail);

		Element elementmonto = document.createElement(ReferenciaComercialConstantesFunciones.MONTO);
		elementmonto.appendChild(document.createTextNode(referenciacomercial.getmonto().toString().trim()));
		element.appendChild(elementmonto);

		Element elementesactivo = document.createElement(ReferenciaComercialConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(referenciacomercial.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoReferenciaComercialsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados=new ArrayList<ReferenciaComercial>();
		
		referenciacomercialsSeleccionados=this.getReferenciaComercialsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoReferenciaComercial(referenciacomercialsSeleccionados);
		
		this.generarReporteReferenciaComercials("Todos",referenciacomercialsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoReferenciaComercial(ArrayList<ReferenciaComercial> referenciacomercialsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ReferenciaComercial referenciacomercialAux:referenciacomercialsSeleccionados) {
				referenciacomercialAux.setsDetalleGeneralEntityReporte(referenciacomercialAux.toString());
			
				if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOSECTORECONO)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.gettiposectorecono_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDCIUDAD)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getciudad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getnombreempresa());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_CONTACTO)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getcontacto());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ARTICULOCOMPRA)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getarticulo_compra());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROANIOS)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getnumero_anios().toString());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_NUMEROMESES)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getnumero_meses().toString());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_IDTIPOVALORACION)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.gettipovaloracion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOMOVIL)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.gettelefonomovil());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_TELEFONOCODIGOAREA)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.gettelefonocodigoarea());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(referenciacomercialAux.getemail());
				}
				 else if(sTipoSeleccionar.equals(ReferenciaComercialConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					referenciacomercialAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(referenciacomercialAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ReferenciaComercialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesReferenciaComercial(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoReferenciaComercial=true;
				this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=true;
				this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=true;
			}
			
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=true;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=true;
			this.isVisibilidadCeldaEliminarReferenciaComercial=true;
			this.isVisibilidadCeldaCancelarReferenciaComercial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=true;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=true;
			this.isVisibilidadCeldaModificarReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=true;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
			this.isVisibilidadCeldaModificarReferenciaComercial=true;
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
			this.isVisibilidadCeldaCancelarReferenciaComercial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				} else {
					this.isVisibilidadCeldaGuardarReferenciaComercial=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ReferenciaComercialJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoReferenciaComercial=true;
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=true;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=true;
		} else {
			this.actualizarEstadoPanelsReferenciaComercial(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarReferenciaComercial=false;
			//this.isVisibilidadCeldaVerFormReferenciaComercial=false;
			this.isVisibilidadCeldaDuplicarReferenciaComercial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!referenciacomercialSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
		} else {
			this.isVisibilidadCeldaNuevoReferenciaComercial=false;
			this.isVisibilidadCeldaGuardarCambiosReferenciaComercial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			if(!referenciacomercialSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;												
			}
			
			this.jButtonCerrarReferenciaComercial.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesReferenciaComercial=false;
		}
		
		if(!this.permiteMantenimiento(this.referenciacomercial)) {
			this.isVisibilidadCeldaActualizarReferenciaComercial=false;
			this.isVisibilidadCeldaEliminarReferenciaComercial=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesReferenciaComercial() {
	}
	
	public void actualizarEstadoPanelsReferenciaComercial(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionReferenciaComercial!=null) {
				this.jScrollPanelDatosEdicionReferenciaComercial.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosReferenciaComercial!=null) {
				this.jScrollPanelDatosReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelPaginacionReferenciaComercial!=null) {
				this.jPanelPaginacionReferenciaComercial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
					this.jTabbedPaneBusquedasReferenciaComercial.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasReferenciaComercial!=null) {
				this.jTabbedPaneBusquedasReferenciaComercial.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesReferenciaComercial!=null) {
				this.jPanelParametrosReportesReferenciaComercial.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCiudad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCiudad=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoSectorEcono(Boolean isParaTipoSectorEcono){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoSectorEconoNegation=!isParaTipoSectorEcono;

			this.isVisibilidadFK_IdCiudad=isParaTipoSectorEconoNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaTipoSectorEconoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaTipoSectorEconoNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoSectorEconoNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaTipoSectorEcono;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdCiudad=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaPaisNegation;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}

	public void setVisibilidadBusquedasParaCiudad(Boolean isParaCiudad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCiudadNegation=!isParaCiudad;

			this.isVisibilidadFK_IdCiudad=isParaCiudad;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaCiudadNegation;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoValoracion(Boolean isParaTipoValoracion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoValoracionNegation=!isParaTipoValoracion;

			this.isVisibilidadFK_IdCiudad=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdCiudad) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdCiudadReferenciaComercial);}

			this.isVisibilidadFK_IdCliente=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdClienteReferenciaComercial);}

			this.isVisibilidadFK_IdPais=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdPaisReferenciaComercial);}

			this.isVisibilidadFK_IdTipoValoracion=isParaTipoValoracion;
			if(!this.isVisibilidadFK_IdTipoValoracion) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdTipoValoracionReferenciaComercial);}

			this.isVisibilidadFK_IdValorClienteSectorEconomico=isParaTipoValoracionNegation;
			if(!this.isVisibilidadFK_IdValorClienteSectorEconomico) {this.jTabbedPaneBusquedasReferenciaComercial.remove(jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);}
		}
		
	}
	
	
	
	

	public String registrarSesionReferenciaComercialParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(referenciacomercialSessionBean==null) {
				referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(referenciacomercialSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.referenciacomercialFuncionGeneral.setCombosCodigoDesdeBusquedaidcliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ReferenciaComercialConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionReferenciaComercial(true);
			//clienteSessionBean.setlidReferenciaComercialActual(this.idReferenciaComercialActual);

			referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyReferenciaComercial(true);
			referenciacomercialSessionBean.setlIdReferenciaComercialActualForeignKey(this.idReferenciaComercialActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ReferenciaComercialSessionBean referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		
		if(this.referenciacomercialSessionBean==null) {
			this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		}
		
		this.referenciacomercialSessionBean.setsUltimaBusquedaReferenciaComercial(this.getsAccionBusqueda());
		this.referenciacomercialSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.referenciacomercialSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
			referenciacomercialSessionBean.setidciudad(this.getidciudadFK_IdCiudad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			referenciacomercialSessionBean.setidcliente(this.getidclienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			referenciacomercialSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			referenciacomercialSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
			referenciacomercialSessionBean.setid_tipo_valoracion(this.getid_tipo_valoracionFK_IdTipoValoracion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorClienteSectorEconomico")) {
			referenciacomercialSessionBean.setidvalorclientesectoreconomico(this.getidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ReferenciaComercialSessionBean referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		
		if(this.referenciacomercialSessionBean==null) {
			this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		}
		
		if(this.referenciacomercialSessionBean.getsUltimaBusquedaReferenciaComercial()!=null&&!this.referenciacomercialSessionBean.getsUltimaBusquedaReferenciaComercial().equals("")) {
			this.setsAccionBusqueda(referenciacomercialSessionBean.getsUltimaBusquedaReferenciaComercial());
			this.setiNumeroPaginacion(referenciacomercialSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(referenciacomercialSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCiudad")) {
				this.setidciudadFK_IdCiudad(referenciacomercialSessionBean.getidciudad());
				referenciacomercialSessionBean.setidciudad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setidclienteFK_IdCliente(referenciacomercialSessionBean.getidcliente());
				referenciacomercialSessionBean.setidcliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(referenciacomercialSessionBean.getid_empresa());
				referenciacomercialSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(referenciacomercialSessionBean.getid_pais());
				referenciacomercialSessionBean.setid_pais(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoValoracion")) {
				this.setid_tipo_valoracionFK_IdTipoValoracion(referenciacomercialSessionBean.getid_tipo_valoracion());
				referenciacomercialSessionBean.setid_tipo_valoracion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorClienteSectorEconomico")) {
				this.setidvalorclientesectoreconomicoFK_IdValorClienteSectorEconomico(referenciacomercialSessionBean.getidvalorclientesectoreconomico());
				referenciacomercialSessionBean.setidvalorclientesectoreconomico(-1L);
			}
		}
		
		this.referenciacomercialSessionBean.setsUltimaBusquedaReferenciaComercial("");
		this.referenciacomercialSessionBean.setiNumeroPaginacion(ReferenciaComercialConstantesFunciones.INUMEROPAGINACION);
		this.referenciacomercialSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaReferenciaComercial(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioReferenciaComercial() {
		this.updateBorderResaltarBusquedasFormularioReferenciaComercial();
		this.updateVisibilidadBusquedasFormularioReferenciaComercial();
		this.updateHabilitarBusquedasFormularioReferenciaComercial();
	}
	
	public void updateBorderResaltarBusquedasFormularioReferenciaComercial() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasReferenciaComercial.getComponents().length>0) {
	

		if(this.referenciacomercialConstantesFunciones.resaltarFK_IdCiudadReferenciaComercial!=null) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdCiudadReferenciaComercial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdCiudadReferenciaComercial);
			}
		}

		if(this.referenciacomercialConstantesFunciones.resaltarFK_IdClienteReferenciaComercial!=null) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdClienteReferenciaComercial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdClienteReferenciaComercial);
			}
		}

		if(this.referenciacomercialConstantesFunciones.resaltarFK_IdPaisReferenciaComercial!=null) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdPaisReferenciaComercial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdPaisReferenciaComercial);
			}
		}

		if(this.referenciacomercialConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaComercial!=null) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaComercial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaComercial);
			}
		}

		if(this.referenciacomercialConstantesFunciones.resaltarFK_IdValorClienteSectorEconomicoReferenciaComercial!=null) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdValorClienteSectorEconomicoReferenciaComercial);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioReferenciaComercial() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasReferenciaComercial.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdCiudadReferenciaComercial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciacomercialConstantesFunciones.mostrarFK_IdCiudadReferenciaComercial);
			if(!this.referenciacomercialConstantesFunciones.mostrarFK_IdCiudadReferenciaComercial && index>-1) {
				this.jTabbedPaneBusquedasReferenciaComercial.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdClienteReferenciaComercial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciacomercialConstantesFunciones.mostrarFK_IdClienteReferenciaComercial);
			if(!this.referenciacomercialConstantesFunciones.mostrarFK_IdClienteReferenciaComercial && index>-1) {
				this.jTabbedPaneBusquedasReferenciaComercial.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdPaisReferenciaComercial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciacomercialConstantesFunciones.mostrarFK_IdPaisReferenciaComercial);
			if(!this.referenciacomercialConstantesFunciones.mostrarFK_IdPaisReferenciaComercial && index>-1) {
				this.jTabbedPaneBusquedasReferenciaComercial.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaComercial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciacomercialConstantesFunciones.mostrarFK_IdTipoValoracionReferenciaComercial);
			if(!this.referenciacomercialConstantesFunciones.mostrarFK_IdTipoValoracionReferenciaComercial && index>-1) {
				this.jTabbedPaneBusquedasReferenciaComercial.remove(index);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);
			jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.referenciacomercialConstantesFunciones.mostrarFK_IdValorClienteSectorEconomicoReferenciaComercial);
			if(!this.referenciacomercialConstantesFunciones.mostrarFK_IdValorClienteSectorEconomicoReferenciaComercial && index>-1) {
				this.jTabbedPaneBusquedasReferenciaComercial.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioReferenciaComercial() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasReferenciaComercial.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdCiudadReferenciaComercial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciacomercialConstantesFunciones.activarFK_IdCiudadReferenciaComercial);
				this.jTabbedPaneBusquedasReferenciaComercial.setEnabledAt(index,this.referenciacomercialConstantesFunciones.activarFK_IdCiudadReferenciaComercial);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdClienteReferenciaComercial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciacomercialConstantesFunciones.activarFK_IdClienteReferenciaComercial);
				this.jTabbedPaneBusquedasReferenciaComercial.setEnabledAt(index,this.referenciacomercialConstantesFunciones.activarFK_IdClienteReferenciaComercial);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdPaisReferenciaComercial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciacomercialConstantesFunciones.activarFK_IdPaisReferenciaComercial);
				this.jTabbedPaneBusquedasReferenciaComercial.setEnabledAt(index,this.referenciacomercialConstantesFunciones.activarFK_IdPaisReferenciaComercial);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaComercial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciacomercialConstantesFunciones.activarFK_IdTipoValoracionReferenciaComercial);
				this.jTabbedPaneBusquedasReferenciaComercial.setEnabledAt(index,this.referenciacomercialConstantesFunciones.activarFK_IdTipoValoracionReferenciaComercial);
			}

			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.referenciacomercialConstantesFunciones.activarFK_IdValorClienteSectorEconomicoReferenciaComercial);
				this.jTabbedPaneBusquedasReferenciaComercial.setEnabledAt(index,this.referenciacomercialConstantesFunciones.activarFK_IdValorClienteSectorEconomicoReferenciaComercial);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaReferenciaComercial(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCiudad")) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdCiudadReferenciaComercial);

			this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);

			this.referenciacomercialConstantesFunciones.setResaltarFK_IdCiudadReferenciaComercial(resaltar);

			jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdCiudadReferenciaComercial);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdClienteReferenciaComercial);

			this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);

			this.referenciacomercialConstantesFunciones.setResaltarFK_IdClienteReferenciaComercial(resaltar);

			jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdClienteReferenciaComercial);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdPaisReferenciaComercial);

			this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);

			this.referenciacomercialConstantesFunciones.setResaltarFK_IdPaisReferenciaComercial(resaltar);

			jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdPaisReferenciaComercial);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoValoracion")) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdTipoValoracionReferenciaComercial);

			this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);

			this.referenciacomercialConstantesFunciones.setResaltarFK_IdTipoValoracionReferenciaComercial(resaltar);

			jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdTipoValoracionReferenciaComercial);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorClienteSectorEconomico")) {
			index= this.jTabbedPaneBusquedasReferenciaComercial.indexOfComponent(this.jPanelFK_IdValorClienteSectorEconomicoReferenciaComercial);

			this.jTabbedPaneBusquedasReferenciaComercial.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasReferenciaComercial.getComponent(index);

			this.referenciacomercialConstantesFunciones.setResaltarFK_IdValorClienteSectorEconomicoReferenciaComercial(resaltar);

			jPanel.setBorder(this.referenciacomercialConstantesFunciones.resaltarFK_IdValorClienteSectorEconomicoReferenciaComercial);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarReferenciaComercial.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioReferenciaComercial() throws Exception {

		if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioReferenciaComercial();
		this.updateVisibilidadResaltarControlesFormularioReferenciaComercial();
		this.updateHabilitarResaltarControlesFormularioReferenciaComercial();
		
	}
	
	public void updateBorderResaltarControlesFormularioReferenciaComercial() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.referenciacomercialConstantesFunciones.resaltaridReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaridReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarid_empresaReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarid_empresaReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltaridclienteReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaridclienteReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltaridvalorclientesectoreconomicoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaridvalorclientesectoreconomicoReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarid_paisReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarid_paisReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltaridciudadReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaridciudadReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarnombreempresaReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarnombreempresaReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarcodigo_clienteReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarcodigo_clienteReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarcontactoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarcontactoReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltararticulo_compraReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltararticulo_compraReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarnumero_aniosReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarnumero_aniosReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarnumero_mesesReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarnumero_mesesReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarid_tipo_valoracionReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarid_tipo_valoracionReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltardireccionReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltardireccionReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltartelefonoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltartelefonoReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltartelefonomovilReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltartelefonomovilReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltartelefonocodigoareaReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltartelefonocodigoareaReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltaremailReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaremailReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltarmontoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltarmontoReferenciaComercial);}
		if(this.referenciacomercialConstantesFunciones.resaltaresactivoReferenciaComercial!=null && this.jInternalFrameDetalleFormReferenciaComercial!=null) {this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setBorderPainted(true);this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setBorder(this.referenciacomercialConstantesFunciones.resaltaresactivoReferenciaComercial);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioReferenciaComercial() throws Exception {		
		if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
	
		//this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelidReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_empresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelid_empresaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_empresaReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridclienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelidclienteReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridclienteReferenciaComercial);
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridclienteReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridvalorclientesectoreconomicoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelidvalorclientesectoreconomicoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridvalorclientesectoreconomicoReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_paisReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelid_paisReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_paisReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridciudadReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelidciudadReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraridciudadReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnombreempresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelnombreempresaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnombreempresaReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarcodigo_clienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelcodigo_clienteReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarcodigo_clienteReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarcontactoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelcontactoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarcontactoReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrararticulo_compraReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelarticulo_compraReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrararticulo_compraReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnumero_aniosReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelnumero_aniosReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnumero_aniosReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnumero_mesesReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelnumero_mesesReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarnumero_mesesReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_tipo_valoracionReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelid_tipo_valoracionReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarid_tipo_valoracionReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrardireccionReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPaneldireccionReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrardireccionReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPaneltelefonoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonoReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonomovilReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPaneltelefonomovilReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonomovilReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonocodigoareaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPaneltelefonocodigoareaReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrartelefonocodigoareaReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraremailReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelemailReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraremailReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarmontoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelmontoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostrarmontoReferenciaComercial);
		//this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraresactivoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jPanelesactivoReferenciaComercial.setVisible(this.referenciacomercialConstantesFunciones.mostraresactivoReferenciaComercial);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioReferenciaComercial() throws Exception {
		if(this.jInternalFrameDetalleFormReferenciaComercial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormReferenciaComercial!=null) {
	
		this.jInternalFrameDetalleFormReferenciaComercial.jLabelidReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaridReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_empresaReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarid_empresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidclienteReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaridclienteReferenciaComercial);
			this.jInternalFrameDetalleFormReferenciaComercial.jButtonidclienteReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaridclienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidvalorclientesectoreconomicoReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaridvalorclientesectoreconomicoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_paisReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarid_paisReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxidciudadReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaridciudadReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreanombreempresaReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarnombreempresaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldcodigo_clienteReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarcodigo_clienteReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreacontactoReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarcontactoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaarticulo_compraReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activararticulo_compraReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_aniosReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarnumero_aniosReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldnumero_mesesReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarnumero_mesesReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jComboBoxid_tipo_valoracionReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarid_tipo_valoracionReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreadireccionReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activardireccionReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonoReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activartelefonoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreatelefonomovilReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activartelefonomovilReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldtelefonocodigoareaReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activartelefonocodigoareaReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextAreaemailReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaremailReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jTextFieldmontoReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activarmontoReferenciaComercial);
		this.jInternalFrameDetalleFormReferenciaComercial.jCheckBoxesactivoReferenciaComercial.setEnabled(this.referenciacomercialConstantesFunciones.activaresactivoReferenciaComercial);
		}
	}
	
		
}